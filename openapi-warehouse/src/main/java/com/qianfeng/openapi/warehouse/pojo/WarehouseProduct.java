package com.qianfeng.openapi.warehouse.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class WarehouseProduct {
    private Integer wpId;

    private Integer productId;

    private Short wId;

    private Integer currentCnt;

    private Integer lockCnt;

    private Integer inTransitCnt;

    private BigDecimal averageCost;

    private Date modifiedTime;

    public Integer getWpId() {
        return wpId;
    }

    public void setWpId(Integer wpId) {
        this.wpId = wpId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Short getwId() {
        return wId;
    }

    public void setwId(Short wId) {
        this.wId = wId;
    }

    public Integer getCurrentCnt() {
        return currentCnt;
    }

    public void setCurrentCnt(Integer currentCnt) {
        this.currentCnt = currentCnt;
    }

    public Integer getLockCnt() {
        return lockCnt;
    }

    public void setLockCnt(Integer lockCnt) {
        this.lockCnt = lockCnt;
    }

    public Integer getInTransitCnt() {
        return inTransitCnt;
    }

    public void setInTransitCnt(Integer inTransitCnt) {
        this.inTransitCnt = inTransitCnt;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}