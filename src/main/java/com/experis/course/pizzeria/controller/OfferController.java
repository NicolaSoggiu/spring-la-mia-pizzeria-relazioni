package com.experis.course.pizzeria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OfferController {
    @GetMapping("/create")
    public String createOffers() {
        return "offers/form";
    }
}
