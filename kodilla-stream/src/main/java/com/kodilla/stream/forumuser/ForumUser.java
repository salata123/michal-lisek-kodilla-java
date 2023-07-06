package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(int id, String userName, char gender, LocalDate birthDate, int numberOfPosts) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id && gender == forumUser.gender && numberOfPosts == forumUser.numberOfPosts && Objects.equals(userName, forumUser.userName) && Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, gender, birthDate, numberOfPosts);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
