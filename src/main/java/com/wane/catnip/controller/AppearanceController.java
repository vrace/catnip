package com.wane.catnip.controller;

import com.wane.catnip.model.Appearance;
import com.wane.catnip.service.appearance.AppearanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appearance")
public class AppearanceController {
    @Autowired
    private AppearanceService appearanceService;

    @RequestMapping("/")
    public Appearance retrieveAppearance() {
        return appearanceService.retrieveAppearance();
    }
}
