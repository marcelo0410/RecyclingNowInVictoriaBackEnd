package com.monash.recyclinginvic.model;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("garbage_genre")
public class GarbageGenre implements Serializable {

    private Integer id;
    private String name;
    private Integer genre;

    public GarbageGenre() {
    }

    public GarbageGenre(Integer id, String name, Integer genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }
}
