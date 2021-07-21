package com.example.github_user_information.controller;

import com.example.github_user_information.model.GitHubUser;
import com.example.github_user_information.service.GitHubUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GitHubUserController {

    private final GitHubUserService gitHubUserService;

    public GitHubUserController(GitHubUserService gitHubUserService) {
        this.gitHubUserService = gitHubUserService;
    }

    @GetMapping("/{login}")
    public GitHubUser getStudent(@PathVariable String login) {
        return gitHubUserService.getGitHubUserInformation(login);
    }
}
