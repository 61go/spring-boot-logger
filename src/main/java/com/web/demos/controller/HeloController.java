package com.web.demos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: HeloController
 * @description:
 * @author: Caffeine61
 * @create: 2019-06-16 01:54
 **/

@RestController
@Slf4j
public class HeloController {


    @GetMapping("echo")
    public void echo(String echo, HttpServletRequest req, HttpServletResponse response) throws IOException {
        log.info("echo-> " + echo);
        final Cookie[] cookies = req.getCookies();
        Cookie cookie = new Cookie("zzzz", "love");
        cookie.setDomain("127.0.0.1");
        cookie.setMaxAge(3600);
        cookie.setPath("/");
        response.addCookie(cookie);
        response.getWriter().print("Hello");
//        return void;
    }

}
