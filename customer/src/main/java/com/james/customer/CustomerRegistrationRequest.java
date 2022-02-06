package com.james.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
