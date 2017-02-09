package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhimingli on 2017-2-9 0009.
 */
@RestController
public class HelloSpringBootController {

    @RequestMapping(value = {"/hello", "hello2"}, method = RequestMethod.GET)
    public String hello() {
        return "hello spring boot";
    }

    //value获取配置的值
    @Value("${age}")
    private Integer age;

    @Value("${name}")
    private String name;

    @Value("${context}")
    private String context;

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public String age() {
        return name + ":" + age + ",context is:" + context;
    }


    @Autowired
    private AppConfig userDTO;

    @GetMapping("/user")
    public String user() {
        return userDTO.toString();
    }


    //获取不同的环境
    @Value("${env}")
    private String env;

    @GetMapping("/env")
    public String env() {
        return env;
    }


    @RequestMapping("/path/{id}")
    public String path(@PathVariable("id") String id, @RequestParam(value = "name",required = false) String name) {
        return id + ",name:" + name;
    }
}
