package com.example.github_user_information.service;

import com.example.github_user_information.model.GitHubUser;

public interface GitHubUserService {

    GitHubUser getGitHubUserInformation(String userLogin);

}
