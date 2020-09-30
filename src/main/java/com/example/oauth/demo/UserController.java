package com.example.oauth.demo;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    Map<String, Object> user(OAuth2AuthenticationToken token) {
        return token.getPrincipal().getAttributes();
    }

}
