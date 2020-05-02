package com.zhaoxun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author ZX
 * @Date 2020/5/2 13:53
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.zhaoxun.service")
public class AppConfig {
}
