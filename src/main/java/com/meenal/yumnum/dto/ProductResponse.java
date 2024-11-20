package com.meenal.yumnum.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductResponse (
    @JsonProperty("name")
    String name,

    @JsonProperty("price")
    Double price
    ){
}
