package com.example.lovedestiny.controller;

import com.example.lovedestiny.model.LoveResponse;
import com.example.lovedestiny.service.LoveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoveController {

    private final LoveService loveService;

    public LoveController(LoveService loveService) {
        this.loveService = loveService;
    }

    @GetMapping("/love")
    public LoveResponse getLove(
            @RequestParam String name1,
            @RequestParam String name2) {

        return loveService.calculateLove(name1, name2);
    }
}
