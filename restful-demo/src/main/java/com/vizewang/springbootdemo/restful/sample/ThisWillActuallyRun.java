package com.vizewang.springbootdemo.restful.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vizewang on 16/6/11.
 */
@RestController
public class ThisWillActuallyRun {
    @RequestMapping("/")
   public String home() {
      return   "Hello World!";
    }

}
