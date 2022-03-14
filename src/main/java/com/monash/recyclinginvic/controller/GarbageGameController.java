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
@RequestMapping("v1/api")
public class GarbageGameController {

    @Autowired
    private GarbageGenreService garbageGenreService;

    @GetMapping("findAll")
    public List<GarbageGenre> findAllGarbage() {
        List<GarbageGenre> list = garbageGenreService.list();
        return list;
    }

}

