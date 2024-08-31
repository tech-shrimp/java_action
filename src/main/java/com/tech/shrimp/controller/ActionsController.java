package com.tech.shrimp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {

    @GetMapping("actions")
    public String actions() {
        return "使用 GitHub Actions 部署至服务器";
    }
}
