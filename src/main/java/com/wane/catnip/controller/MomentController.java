package com.wane.catnip.controller;

import com.wane.catnip.model.MomentPreviews;
import com.wane.catnip.service.moment.MomentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moment")
public class MomentController {
    @Autowired
    private MomentService momentService;

    @RequestMapping("/")
    public MomentPreviews retrievePreviews() {
        return momentService.retrievePreviews();
    }
}
