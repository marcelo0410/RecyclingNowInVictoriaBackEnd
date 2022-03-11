package com.monash.recyclinginvic.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.monash.recyclinginvic.mapper.GarbageGenreMapper;
import com.monash.recyclinginvic.model.GarbageGenre;
import com.monash.recyclinginvic.service.GarbageGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:3000", "https://recycling-now-in-victoria.herokuapp.com/", "http://www.recyclenowinvictoria.ml"})
@RestController
//@ResponseBody
@RequestMapping("v1/api")
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

    // search a keyword
    @GetMapping("/search/{name}")
    public List<GarbageGenre> searchKeyWord(@PathVariable String name){
        QueryWrapper<GarbageGenre> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);
        List<GarbageGenre> garbageGenres = garbageGenreService.getBaseMapper().selectList(wrapper);
        return garbageGenres;

    }
}

