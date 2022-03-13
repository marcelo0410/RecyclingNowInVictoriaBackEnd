package com.monash.recyclinginvic.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "council_data")
public class CouncilData {

    @TableId(value = "year")
    private String year;
    @TableId(value="council_id")
    private Integer councilId;
    @TableField(value = "gbg_collected")
    private Integer garbageCollected;
    @TableField(value = "rcc_collected")
    private Integer recycleCollected;
    @TableField(value = "rcc_peocessed")
    private Integer recycleProcessed;
    @TableField(value = "ogn_collected")
    private Integer organicCollected;
    @TableField(value = "ogn_processed")
    private Integer organicProcessed;
    @TableField(value = "total_collected")
    private Integer totalCollected;
    @TableField(value = "total_processed")
    private Integer totalProcessed;

    public CouncilData() {
    }

    public CouncilData(String year, Integer councilId, Integer garbageCollected, Integer recycleCollected, Integer recycleProcessed, Integer organicCollected, Integer organicProcessed, Integer totalCollected, Integer totalProcessed) {
        this.year = year;
        this.councilId = councilId;
        this.garbageCollected = garbageCollected;
        this.recycleCollected = recycleCollected;
        this.recycleProcessed = recycleProcessed;
        this.organicCollected = organicCollected;
        this.organicProcessed = organicProcessed;
        this.totalCollected = totalCollected;
        this.totalProcessed = totalProcessed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getCouncilId() {
        return councilId;
    }

    public void setCouncilId(Integer councilId) {
        this.councilId = councilId;
    }

    public Integer getGarbageCollected() {
        return garbageCollected;
    }

    public void setGarbageCollected(Integer garbageCollected) {
        this.garbageCollected = garbageCollected;
    }

    public Integer getRecycleCollected() {
        return recycleCollected;
    }

    public void setRecycleCollected(Integer recycleCollected) {
        this.recycleCollected = recycleCollected;
    }

    public Integer getRecycleProcessed() {
        return recycleProcessed;
    }

    public void setRecycleProcessed(Integer recycleProcessed) {
        this.recycleProcessed = recycleProcessed;
    }

    public Integer getOrganicCollected() {
        return organicCollected;
    }

    public void setOrganicCollected(Integer organicCollected) {
        this.organicCollected = organicCollected;
    }

    public Integer getOrganicProcessed() {
        return organicProcessed;
    }

    public void setOrganicProcessed(Integer organicProcessed) {
        this.organicProcessed = organicProcessed;
    }

    public Integer getTotalCollected() {
        return totalCollected;
    }

    public void setTotalCollected(Integer totalCollected) {
        this.totalCollected = totalCollected;
    }

    public Integer getTotalProcessed() {
        return totalProcessed;
    }

    public void setTotalProcessed(Integer totalProcessed) {
        this.totalProcessed = totalProcessed;
    }
}
