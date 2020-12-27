package com.pattern.builder;

public class User {
    private final String firstName;
    private final String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public User.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public User.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(firstName, lastName);
        }
    }
}
