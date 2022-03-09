package com.monash.recyclinginvic.controller;

import com.monash.recyclinginvic.model.GarbageGenre;
import com.monash.recyclinginvic.service.GarbageGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@ResponseBody
@RequestMapping("v1/gg")
public class GarbageGameController {

    @Autowired
    private GarbageGenreService garbageGenreService;

    @GetMapping("/hello")
    public String hello1(){
        return "Hello world!";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "Hello world!";
    }

    @GetMapping("/json")
    public Map<String, Object> hello3(){
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("results", "123");
        return map;
    }

    @GetMapping("findAll")
    public List<GarbageGenre> findAllGarbage() {
        //调用service的方法
        List<GarbageGenre> list = garbageGenreService.list();
        return list;
    }
}

