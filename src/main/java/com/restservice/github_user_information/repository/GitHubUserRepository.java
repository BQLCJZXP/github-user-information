package com.restservice.github_user_information.repository;

import com.restservice.github_user_information.model.GitHubUserDTO;

public interface GitHubUserRepository {

    GitHubUserDTO getGitHubUserByLogin(String userLogin);

}
