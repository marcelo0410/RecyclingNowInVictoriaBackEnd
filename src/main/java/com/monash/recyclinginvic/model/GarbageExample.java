package com.monash.recyclinginvic.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("gbg_examples")
public class GarbageExample implements Serializable {

    @TableId(value="gbg_exp_id")
    private Integer id;

    @TableField(value="gbg_bin_id")
    private Integer binId;

    @TableField(value="gbg_exp_name")
    private String exampleName;

    @TableField(value="gbg_exp_link")
    private String exampleLink;

    @TableField(value="gbg_exp_intro")
    private String exampleIntro;

    public GarbageExample() {
    }

    public GarbageExample(Integer id, Integer binId, String exampleName, String exampleLink, String exampleIntro) {
        this.id = id;
        this.binId = binId;
        this.exampleName = exampleName;
        this.exampleLink = exampleLink;
        this.exampleIntro = exampleIntro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBinId() {
        return binId;
    }

    public void setBinId(Integer binId) {
        this.binId = binId;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }

    public String getExampleLink() {
        return exampleLink;
    }

    public void setExampleLink(String exampleLink) {
        this.exampleLink = exampleLink;
    }

    public String getExampleIntro() {
        return exampleIntro;
    }

    public void setExampleIntro(String exampleIntro) {
        this.exampleIntro = exampleIntro;
    }
}
