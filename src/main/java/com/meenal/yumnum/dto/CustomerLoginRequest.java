package com.meenal.yumnum.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CustomerLoginRequest (

    @NotNull(message="The email cannot be null")
    @Email(message="Enter a valid email")
    @JsonProperty("email")
    String email,

    @NotBlank(message="The password cannot be blank")
    @Size(min=6, max=10)
    @JsonProperty("password")
    String password
    ){
}
