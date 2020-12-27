package com.pattern.builder;

import java.util.List;

public class Address {

    private final String streetName;
    private final int houseNumber;
    private final long postCode;
    private final String city;

    private Address(Builder builder) {
        this.streetName = builder.streetName;
        this.houseNumber = builder.houseNumber;
        this.postCode = builder.postCode;
        this.city = builder.city;
    }

    public static class Builder {
        private String streetName;
        private int houseNumber;
        private long postCode;
        private String city;

        public Builder streetName(final String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder houseNumber(final int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder postCode(final long postCode){
            this.postCode = postCode;
            return this;
        }

        public  Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

    }


}
