package com.restservice.github_user_information.converter;

import com.restservice.github_user_information.model.GitHubUser;
import com.restservice.github_user_information.model.GitHubUserDTO;
import org.springframework.stereotype.Component;

@Component
public class GitHubUserConverter {

    public GitHubUser setGitHubUserProperties(final GitHubUserDTO gitHubUserDTO) {
        GitHubUser gitHubUser = new GitHubUser();

        gitHubUser.setId(gitHubUserDTO.getId());
        gitHubUser.setLogin(gitHubUserDTO.getLogin());
        gitHubUser.setName(gitHubUserDTO.getName());
        gitHubUser.setType(gitHubUserDTO.getType());
        gitHubUser.setAvatarUrl(gitHubUserDTO.getAvatarUrl());
        gitHubUser.setCreatedAt(gitHubUserDTO.getCreatedAt());

        return gitHubUser;
    }
}
