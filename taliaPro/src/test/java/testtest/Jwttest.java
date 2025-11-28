package testtest;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
@author zhang
@Date   2025/11/23 14:32
@description
*/public class Jwttest
{
    @Test
    public  void testGenetate()
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("TOM",1);
        map.put("Jet",2);
      String jwt=Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"MTIzNDU2Nzg5MGFiY2RlZjEyMzQ1Njc4OTBhYmNkZWZ6eHljb20=")
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis()+60*3600))
                .compact();
        System.out.println(jwt);
    }
    @Test
    public  void testDecode()
    {
          String key="MTIzNDU2Nzg5MGFiY2RlZjEyMzQ1Njc4OTBhYmNkZWZ6eHljb20=";
       Claims claims= Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJUT00iOjEsIkpldCI6MiwiZXhwIjoxNzYzODgxNTYxfQ.ND_AajVbAIQPzvQiLg1aPRSN-vCbdsj7T_o9Z-zbYmk")
                .getBody();
        System.out.println(claims);
    }

}
