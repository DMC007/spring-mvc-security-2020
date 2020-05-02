package com.zhaoxun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZX
 * @Date 2020/5/2 14:15
 * @Version 1.0
 */
@RestController
@RequestMapping("/node")
public class NodeController {

    //@RequestMapping(value = "/success", produces = {"text/plain;charset=UTF-8"})
    @PostMapping("/success")
    public String loginSuccess() {
        return "login is ok!";
    }
}
