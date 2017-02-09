package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhimingli on 2017-2-9 0009.
 */
@RestController
public class SpringUserController {

    @Autowired
    private SpringUserRepository repository;


    //http://127.0.0.1:8088/getall
    @GetMapping("/getall")
    public List<SpringUser> getAllList() {
        return repository.findAll();
    }

    //
    @PostMapping("/add")
    public SpringUser add(@RequestParam(value = "age", required = false) Integer age,
                          @RequestParam(value = "name", required = false) String name) {
        SpringUser user = new SpringUser();
        user.setAge(age);
        user.setName(name);
        return repository.save(user);
    }

    //http://127.0.0.1:8088/get/1
    @GetMapping("/get/{id}")
    public SpringUser get(@PathVariable(value = "id", required = false) Integer id) {
        return repository.findOne(id);
    }



    //http://127.0.0.1:8088/update/1?age=1221&name=23214324
    @GetMapping("/update/{id}")
    public SpringUser get(@PathVariable(value = "id", required = false) Integer id,
                          @RequestParam(value = "age", required = false) Integer age,
                          @RequestParam(value = "name", required = false) String name) {
        SpringUser user = new SpringUser();
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        return repository.save(user);
    }
}
