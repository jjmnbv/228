package com.ljbd.ocrs.website.erp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/rework")
public class ReworkApplayController {

    @RequestMapping("/reworkapplay")
    public String reworkapplay() {
        return "/rework/rework";
    }

}