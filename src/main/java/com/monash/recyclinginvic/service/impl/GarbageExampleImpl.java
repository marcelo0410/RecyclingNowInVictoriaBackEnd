package com.monash.recyclinginvic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monash.recyclinginvic.mapper.GarbageExampleMapper;
import com.monash.recyclinginvic.model.GarbageExample;
import com.monash.recyclinginvic.service.GarbageExampleService;
import org.springframework.stereotype.Service;

@Service
public class GarbageExampleImpl extends ServiceImpl<GarbageExampleMapper, GarbageExample> implements GarbageExampleService {
    public GarbageExampleMapper getMapper(){
        return this.baseMapper;
    }
}
