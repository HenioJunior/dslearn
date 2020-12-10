package com.crystaldata.dslearn.dto;

import com.crystaldata.dslearn.entities.Notification;
import com.crystaldata.dslearn.entities.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.Instant;

public class NotificationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    private Long UserId;

public NotificationDTO(){}

    public NotificationDTO(Long id, String text, Instant moment, boolean read, String route, Long userId) {
        this.id = id;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
        UserId = userId;
    }

    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        UserId = entity.getUser().getId();
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Instant getMoment() {
        return moment;
    }

    public boolean isRead() {
        return read;
    }

    public String getRoute() {
        return route;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }
}
