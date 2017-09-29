package com.wane.catnip.controller;

import com.wane.catnip.model.MomentPreviews;
import com.wane.catnip.service.moment.MomentService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Api("moment")
@RestController
@RequestMapping("/moment")
public class MomentController {
    @Autowired
    private MomentService momentService;

    @ApiOperation("Retrieve moment previews")
    @RequestMapping(value = "/", method = GET)
    public MomentPreviews retrievePreviews() {
        return momentService.retrievePreviews();
    }
}
