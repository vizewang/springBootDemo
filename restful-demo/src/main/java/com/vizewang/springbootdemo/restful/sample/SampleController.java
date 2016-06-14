package com.vizewang.springbootdemo.restful.sample;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vizewang on 16/6/9.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(SampleController.class);
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
//        SpringApplication.run(SampleController.class, args);
    }
}
