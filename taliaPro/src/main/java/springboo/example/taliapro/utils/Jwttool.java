package springboo.example.taliapro.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.*;

/*
@author zhang
@Date   2025/11/23 15:10
@description
*/
public class Jwttool
{
    private static String key="MTIzNDU2Nzg5MGFiY2RlZjEyMzQ1Njc4OTBhYmNkZWZ6eHljb20=";
    public static String Genetate(Map<String, Object> map)
    {
        String jwt= Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,key)
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis()+600*360000))
                .compact();
        return jwt;
    }
    public static Claims Decode(String jwt)
    {
        Claims claims= Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(jwt)
                .getBody();
        return claims;
    }

}
