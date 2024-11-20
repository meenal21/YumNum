package com.meenal.yumnum.exception;

public class JwtTokenNotFound extends RuntimeException {
    private String msg;

    public JwtTokenNotFound(String tokenNotFound) {
        super(tokenNotFound);
        msg = tokenNotFound;
    }
}
