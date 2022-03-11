package com.monash.recyclinginvic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monash.recyclinginvic.mapper.GarbageGenreMapper;
import com.monash.recyclinginvic.model.GarbageGenre;
import com.monash.recyclinginvic.service.GarbageGenreService;
import org.springframework.stereotype.Service;

@Service
public class GarbageGenreImpl extends ServiceImpl<GarbageGenreMapper, GarbageGenre> implements GarbageGenreService {
    public GarbageGenreMapper getMapper(){
        return this.baseMapper;
    }
}
