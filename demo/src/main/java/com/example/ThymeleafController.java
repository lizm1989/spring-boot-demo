package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zhimingli on 2017-2-9 0009.
 * 模板
 */
@Controller
public class ThymeleafController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
