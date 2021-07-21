package com.restservice.github_user_information.service;

import com.restservice.github_user_information.model.GitHubUser;

public interface GitHubUserService {

    GitHubUser getGitHubUserInformation(String userLogin);

}
