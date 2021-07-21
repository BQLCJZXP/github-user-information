package com.restservice.github_user_information.service;

import com.restservice.github_user_information.model.GitHubUser;
import com.restservice.github_user_information.model.GitHubUserDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
@Transactional
class GitHubUserServiceImpl implements GitHubUserService {

    private static final String URL_GITHUB_USER_SERVICE = "https://api.github.com/users/";

    private final RestTemplate restTemplate;
    private final AuditUserService auditUserService;


    public GitHubUserServiceImpl(final RestTemplate restTemplate,
                                 AuditUserService auditUserService) {
        this.restTemplate = restTemplate;
        this.auditUserService = auditUserService;
    }

    @Override
    public GitHubUser getGitHubUserInformation(final String userLogin) {
        GitHubUserDTO gitHubUserDTO = restTemplate.exchange(URL_GITHUB_USER_SERVICE + userLogin,
                HttpMethod.GET, HttpEntity.EMPTY, GitHubUserDTO.class).getBody();

        GitHubUser gitHubUser = null;
        if (gitHubUserDTO != null) {
            gitHubUser = setGitHubUserProperties(gitHubUserDTO);
        }
        auditUserService.saveAuditUserData(userLogin);
        return gitHubUser;
    }

    private GitHubUser setGitHubUserProperties(GitHubUserDTO gitHubUserDTO) {
        GitHubUser gitHubUser = new GitHubUser();

        gitHubUser.setId(gitHubUserDTO.getId());
        gitHubUser.setLogin(gitHubUserDTO.getLogin());
        gitHubUser.setName(gitHubUserDTO.getName());
        gitHubUser.setType(gitHubUserDTO.getType());
        gitHubUser.setAvatarUrl(gitHubUserDTO.getAvatarUrl());
        gitHubUser.setCreatedAt(gitHubUserDTO.getCreatedAt());

        setCalculations(gitHubUserDTO, gitHubUser);
        return gitHubUser;
    }

    private void setCalculations(GitHubUserDTO gitHubUserDTO, GitHubUser gitHubUser) {
        BigDecimal calculation = BigDecimal.ZERO;
        BigDecimal sixFactor = new BigDecimal("6");

        if (gitHubUserDTO.getFollowers() != 0) {
            BigDecimal calculatedValue = BigDecimal
                    .valueOf(gitHubUserDTO.getFollowers() * (2 + gitHubUserDTO.getPublicRepos()));
            calculation = sixFactor.divide(calculatedValue, 15, RoundingMode.HALF_EVEN);
        }
        gitHubUser.setCalculations(calculation);
    }
}
