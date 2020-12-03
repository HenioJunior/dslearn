package com.crystaldata.dslearning.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.*;

@Entity
@Table(name = "tb_topic")
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(columnDefinition="TEXT")
    private String body;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "reply_id")
    private Reply answer;

    @ManyToMany
    @JoinTable(name = "tb_topic_likes",
            joinColumns = @JoinColumn(name = "topic_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> Likes = new HashSet<>();

    @OneToMany(mappedBy = "topic")
    private List<Reply> replies = new ArrayList<>();

    public Topic(){}

    public Topic(Long id, String title, String body, Instant moment, User author, Lesson lesson, Offer offer, Reply answer) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.moment = moment;
        this.author = author;
        this.lesson = lesson;
        this.offer = offer;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Instant getMoment() {
        return moment;
    }

    public User getAuthor() {
        return author;
    }

    public Set<User> getLikes() {
        return Likes;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Offer getOffer() {
        return offer;
    }

    public Reply getAnswer() {
        return answer;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public void setAnswer(Reply answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topic)) return false;
        Topic topic = (Topic) o;
        return Objects.equals(getId(), topic.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
