package com.monash.recyclinginvic.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.monash.recyclinginvic.mapper")
public class GarbageConfig {
}
