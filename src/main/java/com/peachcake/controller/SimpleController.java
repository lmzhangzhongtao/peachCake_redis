package com.peachcake.controller;

import com.peachcake.mapper.PeachCakeMapper;
import com.peachcake.service.PeachCake;
import com.peachcake.utils.RedisUtils;
import com.peachcake.vo.PeachCakeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {

    @Autowired
    PeachCake peachCake;

    @Autowired
    PeachCakeMapper mapper;


    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/helloString/{key}/{value}")
    public String helloString(@PathVariable String key, @PathVariable String value) {
        redisUtils.set(key, value);
        return (String) redisUtils.get(key);
    }

    @PostMapping("/hi")
    public String hi() {
        return peachCake.fallInLove();
    }


    @PostMapping("/fall")
    public PeachCakeVO hi(@RequestParam(value = "name", required = false) String name) {
        return peachCake.married(name);
    }
}
