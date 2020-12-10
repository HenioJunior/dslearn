package com.crystaldata.dslearn.services;

import com.crystaldata.dslearn.dto.NotificationDTO;
import com.crystaldata.dslearn.entities.Notification;
import com.crystaldata.dslearn.entities.User;
import com.crystaldata.dslearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    public Page<NotificationDTO> notificationForCurrentUser(Pageable pageable){
        User user = authService.authenticated();
        Page<Notification> page = repository.find(user, false, pageable);
        return page.map(x -> new NotificationDTO(x));
    }
}
