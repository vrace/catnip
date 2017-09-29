package com.wane.catnip.controller;

import com.wane.catnip.model.Appearance;
import com.wane.catnip.service.appearance.AppearanceService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Api("appearance")
@RestController
@RequestMapping(value = "/appearance", produces = APPLICATION_JSON_VALUE)
public class AppearanceController {
    @Autowired
    private AppearanceService appearanceService;

    @ApiOperation("Retrieve appearance")
    @RequestMapping(value = "/", method = GET)
    public Appearance retrieveAppearance() {
        return appearanceService.retrieveAppearance();
    }
}
