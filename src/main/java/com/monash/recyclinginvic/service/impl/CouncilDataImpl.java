package com.monash.recyclinginvic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monash.recyclinginvic.mapper.CouncilDataMapper;
import com.monash.recyclinginvic.model.CouncilData;
import com.monash.recyclinginvic.service.CouncilDataService;
import org.springframework.stereotype.Service;

@Service
public class CouncilDataImpl extends ServiceImpl<CouncilDataMapper, CouncilData> implements CouncilDataService {
    public CouncilDataMapper getMapper(){
        return this.baseMapper;
    }
}
