package com.app.utils;

import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    @Value("${app.jwt.secret}")
    private String jwtSecretKey;

    public void validateToken(String token) {
        Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(token);
    }
}
