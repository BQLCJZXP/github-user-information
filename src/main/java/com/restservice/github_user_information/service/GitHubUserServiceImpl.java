package com.restservice.github_user_information.service;

import com.restservice.github_user_information.converter.GitHubUserConverter;
import com.restservice.github_user_information.model.GitHubUser;
import com.restservice.github_user_information.model.GitHubUserDTO;
import com.restservice.github_user_information.repository.GitHubUserRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
class GitHubUserServiceImpl implements GitHubUserService {

    private final GitHubUserRepository gitHubUserRepository;
    private final GitHubUserConverter gitHubUserConverter;
    private final AuditUserService auditUserService;

    public GitHubUserServiceImpl(
            GitHubUserRepository gitHubUserRepository,
            GitHubUserConverter gitHubUserConverter,
            AuditUserService auditUserService) {
        this.gitHubUserRepository = gitHubUserRepository;
        this.gitHubUserConverter = gitHubUserConverter;
        this.auditUserService = auditUserService;
    }

    @Override
    public GitHubUser getGitHubUserInformation(final String userLogin) {
        auditUserService.saveAuditUserData(userLogin);

        GitHubUserDTO gitHubUserDTO = gitHubUserRepository.getGitHubUserByLogin(userLogin);
        GitHubUser gitHubUser = gitHubUserConverter.setGitHubUserProperties(gitHubUserDTO);
        performCalculations(gitHubUserDTO, gitHubUser);

        return gitHubUser;
    }

    private void performCalculations(final GitHubUserDTO gitHubUserDTO, final GitHubUser gitHubUser) {
        BigDecimal resultCalculation = BigDecimal.ZERO;
        BigDecimal sixFactor = new BigDecimal("6");

        if (gitHubUserDTO.getFollowers() != 0) {
            BigDecimal calculatedValue = BigDecimal
                    .valueOf(gitHubUserDTO.getFollowers() * (2 + gitHubUserDTO.getPublicRepos()));
            resultCalculation = sixFactor.divide(calculatedValue, 15, RoundingMode.HALF_EVEN);
        }
        gitHubUser.setCalculations(resultCalculation);
    }
}
