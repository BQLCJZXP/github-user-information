package com.restservice.github_user_information.service;

import com.restservice.github_user_information.model.GitHubUserAudit;
import com.restservice.github_user_information.repository.GitHubUserAuditRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class AuditUserServiceImpl implements AuditUserService {

    private final GitHubUserAuditRepository gitHubUserAuditRepository;

    AuditUserServiceImpl(
            GitHubUserAuditRepository gitHubUserAuditRepository) {
        this.gitHubUserAuditRepository = gitHubUserAuditRepository;
    }

    @Override
    public void saveAuditUserData(String userLogin) {

        GitHubUserAudit requestCounter = gitHubUserAuditRepository.findByLogin(userLogin);

        if (requestCounter != null) {
            requestCounter.setRequestCount(requestCounter.getRequestCount() + 1);
        } else {
            requestCounter = new GitHubUserAudit();
            requestCounter.setLogin(userLogin);
            requestCounter.setRequestCount(1L);
        }

        gitHubUserAuditRepository.save(requestCounter);
    }
}
