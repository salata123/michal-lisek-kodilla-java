package com.kodilla.stream.immutable;

public class ForumUser      {
    final private String username;
    final private String realName;

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }
}
