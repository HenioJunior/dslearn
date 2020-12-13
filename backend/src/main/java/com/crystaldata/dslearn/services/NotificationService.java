package com.crystaldata.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crystaldata.dslearn.dto.NotificationDTO;
import com.crystaldata.dslearn.entities.Notification;
import com.crystaldata.dslearn.entities.User;
import com.crystaldata.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    public Page<NotificationDTO> notificationForCurrentUser(boolean unreadOnly, Pageable pageable){
        User user = authService.authenticated();
        Page<Notification> page = repository.find(user, unreadOnly, pageable);
        return page.map(x -> new NotificationDTO(x));
    }
}
