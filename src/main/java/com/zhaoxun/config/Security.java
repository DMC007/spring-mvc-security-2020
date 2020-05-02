package com.zhaoxun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @Author ZX
 * @Date 2020/5/2 14:02
 * @Version 1.0
 */
//@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
    //定义用户信息【查询用户信息】
    //密码编译器【开始忘记写@Bean，出现错误HTTP Status 500 - There is no PasswordEncoder mapped for the id "null"】
    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("tom").password("123").authorities("vip").build());
        manager.createUser(User.withUsername("jack").password("123").authorities("svip").build());
        return manager;
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    //安全拦截机制【最重要】

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/**").authenticated()    //所有/user/**的请求必须经过认证
                .anyRequest().permitAll()   //除了/user/**,其他请求都可以访问
                .and()
                .formLogin()    //允许表单登陆
                .successForwardUrl("/node/success");
    }
}
