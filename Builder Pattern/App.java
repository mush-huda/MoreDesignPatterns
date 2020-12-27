package com.pattern.builder;

public class App {

    public static void main(String[] args) {

        Name name = new Name.Builder()
                .firstName("Max")
                .lastName("Musterman")
                .build();

        Address address = new Address.Builder()
                .streetName("Wiesenstr.")
                .houseNumber(17)
                .postCode(95444)
                .city("Bayreuth")
                .build();

        Account account = new Account.Builder()
                .id(1)
                .address(address)
                .name(name)
                .email("max.muster@gmail.com")
                .build();

        User guest = User.builder()
                .firstName("John")
                .lastName("Brown")
                .build();

    }
}
