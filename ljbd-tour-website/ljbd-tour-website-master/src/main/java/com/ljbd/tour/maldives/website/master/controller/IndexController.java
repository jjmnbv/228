package com.ljbd.tour.maldives.website.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    @Autowired
    LocaleResolver localeResolver;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(
            @RequestParam(value = "locale", required = false) Locale locale,
            HttpServletRequest request,
            HttpServletResponse response) {
        if (locale != null) {
            localeResolver.setLocale(request, response, locale);
        }
        return "index";
    }

}