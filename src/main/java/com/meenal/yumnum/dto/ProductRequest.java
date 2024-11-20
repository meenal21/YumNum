package com.meenal.yumnum.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequest (
        @NotBlank(message="Name cannot be empty")
        @JsonProperty("name")
        String name,

        @NotNull(message="Price cannot be Null")
        @JsonProperty("price")
        Double price
){
}
