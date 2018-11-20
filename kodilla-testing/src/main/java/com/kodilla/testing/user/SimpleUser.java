package com.kodilla.testing.user;

public class SimpleUser {
    private String username;

    // dlaczego raz dajemy public a raz private,przekstalcamy ale po oc?
    public SimpleUser(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
}
