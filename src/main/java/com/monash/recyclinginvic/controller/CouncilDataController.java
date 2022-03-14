package com.monash.recyclinginvic.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.monash.recyclinginvic.model.CouncilData;
import com.monash.recyclinginvic.model.GarbageExample;
import com.monash.recyclinginvic.service.CouncilDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://recycling-now-in-victoria.herokuapp.com/", "http://www.recyclenowinvictoria.ml"})
@RestController
@RequestMapping("v1/api/council/")
public class CouncilDataController {

    @Autowired
    private CouncilDataService councilDataService;


    @GetMapping("findAllCouncil")
    public List<CouncilData> findAllCouncil() {
        List<CouncilData> list = councilDataService.list();
        return list;
    }

    @GetMapping("/searchCouncil/{id}")
    public List<CouncilData> getCouncilById(@PathVariable Integer id){
        CouncilData councilData = new CouncilData();
        councilData.setCouncilId(id);
        QueryWrapper<CouncilData> queryWrapper = new QueryWrapper<>(councilData);
        queryWrapper.orderByAsc("year");
        List<CouncilData> councilData1 = councilDataService.getBaseMapper().selectList(queryWrapper);
        return councilData1;
    }

}
