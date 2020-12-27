package com.pattern.builder;

import java.util.List;

public class Name {

    private String firstName;
    private String lastName;

    private Name(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder {
        private String firstName;
        private String lastName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }
}
