package com.zhaoxun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZX
 * @Date 2020/5/2 13:54
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/find/{id}")
    public String findUserById(@PathVariable("id") Long id) {
        return "this is ok because you has already login!";
    }
}
