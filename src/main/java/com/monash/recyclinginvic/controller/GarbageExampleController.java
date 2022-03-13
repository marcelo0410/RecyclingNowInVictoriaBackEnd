package com.monash.recyclinginvic.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.monash.recyclinginvic.model.GarbageExample;
import com.monash.recyclinginvic.model.GarbageGenre;
import com.monash.recyclinginvic.service.GarbageExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://recycling-now-in-victoria.herokuapp.com/", "http://www.recyclenowinvictoria.ml"})
@RestController
//@ResponseBody
@RequestMapping("v1/api/ge/")
public class GarbageExampleController {

    @Autowired
    private GarbageExampleService garbageExampleService;

    @GetMapping("findAllExample")
    public List<GarbageExample> findAllGarbage() {
        List<GarbageExample> list = garbageExampleService.list();
        return list;
    }

    @GetMapping("/search/{name}")
    public List<GarbageExample> searchKeyWord(@PathVariable String name){
        QueryWrapper<GarbageExample> wrapper = new QueryWrapper<>();
        wrapper.like("gbg_exp_name", name);
        List<GarbageExample> garbageExamples = garbageExampleService.getBaseMapper().selectList(wrapper);
        return garbageExamples;
    }

}
