package com.dx.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbTask {
    private Integer tId;

    private String tName;

    private String tAddress;

    private Integer tType;

    private Date tTime;

    private Date creatTime;

    private Long tPrice;

    private BigDecimal tCost;

    private Integer tState;

    private String tPicture;

    private Integer aId;

    private Integer uiId;

    private Integer uyId;

    private String tDetails;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public Integer gettType() {
        return tType;
    }

    public void settType(Integer tType) {
        this.tType = tType;
    }

    public Date gettTime() {
        return tTime;
    }

    public void settTime(Date tTime) {
        this.tTime = tTime;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Long gettPrice() {
        return tPrice;
    }

    public void settPrice(Long tPrice) {
        this.tPrice = tPrice;
    }

    public BigDecimal gettCost() {
        return tCost;
    }

    public void settCost(BigDecimal tCost) {
        this.tCost = tCost;
    }

    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    public String gettPicture() {
        return tPicture;
    }

    public void settPicture(String tPicture) {
        this.tPicture = tPicture;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getUiId() {
        return uiId;
    }

    public void setUiId(Integer uiId) {
        this.uiId = uiId;
    }

    public Integer getUyId() {
        return uyId;
    }

    public void setUyId(Integer uyId) {
        this.uyId = uyId;
    }

    public String gettDetails() {
        return tDetails;
    }

    public void settDetails(String tDetails) {
        this.tDetails = tDetails;
    }
}