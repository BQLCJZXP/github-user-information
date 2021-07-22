package com.restservice.github_user_information.repository;

import com.restservice.github_user_information.model.GitHubUserDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class GitHubUserRepositoryImpl implements GitHubUserRepository {

    @Value("${github.api.url.property}")
    private String URL_GITHUB_API_USER_SERVICE;
    private final RestTemplate restTemplate;

    public GitHubUserRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public GitHubUserDTO getGitHubUserByLogin(String userLogin) {
        return restTemplate.exchange(URL_GITHUB_API_USER_SERVICE + "/" + userLogin,
                HttpMethod.GET, HttpEntity.EMPTY, GitHubUserDTO.class).getBody();
    }
}
