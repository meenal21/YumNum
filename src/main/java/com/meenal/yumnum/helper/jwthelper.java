package com.meenal.yumnum.helper;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class jwthelper {
    //jwts has its own class
    //
    //generate a token
    @Value("${security.jwt.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration-time}")
    private int expirationTime;



    //extract the claims from the jwt
//    public String extractUsername(String token){
//        return extractClaim(token, Claim::getSubject)
//    }
    //extract a user

    //validate the token

    //check expiry
}


