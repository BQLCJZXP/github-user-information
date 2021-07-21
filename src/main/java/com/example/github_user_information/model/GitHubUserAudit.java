package com.example.github_user_information.model;

import javax.persistence.*;

@Entity
public class GitHubUserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "REQUEST_COUNT")
    private Long requestCount;

    public GitHubUserAudit() {
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Long requestCount) {
        this.requestCount = requestCount;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
