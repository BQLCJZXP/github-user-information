package com.example.github_user_information.repository;

import com.example.github_user_information.model.GitHubUserAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubUserAuditRepository extends JpaRepository<GitHubUserAudit, Long> {

    GitHubUserAudit findByLogin(String userLogin);

}
