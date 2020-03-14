package com.qianfeng.openapi.warehouse.pojo;

import java.util.Date;

public class WarehouseInfo {
    private Short wId;

    private String warehouseSn;

    private String warehoustName;

    private String warehousePhone;

    private String contact;

    private Short province;

    private Short city;

    private Short distrct;

    private String address;

    private Byte warehouseStatus;

    private Date modifiedTime;

    public Short getwId() {
        return wId;
    }

    public void setwId(Short wId) {
        this.wId = wId;
    }

    public String getWarehouseSn() {
        return warehouseSn;
    }

    public void setWarehouseSn(String warehouseSn) {
        this.warehouseSn = warehouseSn;
    }

    public String getWarehoustName() {
        return warehoustName;
    }

    public void setWarehoustName(String warehoustName) {
        this.warehoustName = warehoustName;
    }

    public String getWarehousePhone() {
        return warehousePhone;
    }

    public void setWarehousePhone(String warehousePhone) {
        this.warehousePhone = warehousePhone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Short getProvince() {
        return province;
    }

    public void setProvince(Short province) {
        this.province = province;
    }

    public Short getCity() {
        return city;
    }

    public void setCity(Short city) {
        this.city = city;
    }

    public Short getDistrct() {
        return distrct;
    }

    public void setDistrct(Short distrct) {
        this.distrct = distrct;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getWarehouseStatus() {
        return warehouseStatus;
    }

    public void setWarehouseStatus(Byte warehouseStatus) {
        this.warehouseStatus = warehouseStatus;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}