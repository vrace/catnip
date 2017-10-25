package com.wane.catnip.controller;

import com.wane.catnip.model.LoginCredential;
import com.wane.catnip.model.LoginKey;
import com.wane.catnip.service.login.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Api("login")
@RestController
@RequestMapping(value = "/login", produces = APPLICATION_JSON_VALUE)
public class LoginController {
    @Autowired
    private LoginService service;

    @ApiOperation("Login user")
    @RequestMapping(value = "/", method = POST)
    public LoginKey loginUser(@RequestBody LoginCredential credential) {
        return service.login(credential);
    }
}
