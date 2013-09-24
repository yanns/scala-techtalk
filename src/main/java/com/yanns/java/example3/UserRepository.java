package com.yanns.java.example3;

public class UserRepository {
    public User findUserByName(String name) {
        if ("bob".equals(name)) {
            return new User("bob", "M", null);
        }
        if ("alice".equals(name)) {
            return new User("alice", null, null);
        }
        return null;
    }
}
