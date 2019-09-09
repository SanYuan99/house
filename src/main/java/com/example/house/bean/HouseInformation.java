package com.example.house.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * house_information
 * @author 
 */
public class HouseInformation implements Serializable {
    private Integer houseId;

    /**
     * 发布名
     */
    private String title;

    /**
     * 房子平方米
     */
    private Integer size;

    /**
     * 房型id
     */
    private Integer typeId;

    /**
     * 地址
     */
    private String site;

    /**
     * 是否有电梯
     */
    private String lift;

    /**
     * 是否有地铁
     */
    private String metro;

    /**
     * 租金
     */
    private Integer rent;

    /**
     * 朝向id
     */
    private String orientationId;

    /**
     * 类型id
     */
    private String moldId;

    /**
     * 联系人id
     */
    private Integer usersId;

    /**
     * 联系电话
     */
    private Integer userPhone;

    /**
     * 区域id
     */
    private Integer areaId;

    /**
     * 房子图片
     */
    private String houseImg;

    /**
     * 房屋配套id
     */
    private Integer matingId;

    /**
     * 装饰风格
     */
    private String decorate;

    /**
     * 要求
     */
    private String demand;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 出租详情
     */
    private String rentalDetails;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getMetro() {
        return metro;
    }

    public void setMetro(String metro) {
        this.metro = metro;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public String getOrientationId() {
        return orientationId;
    }

    public void setOrientationId(String orientationId) {
        this.orientationId = orientationId;
    }

    public String getMoldId() {
        return moldId;
    }

    public void setMoldId(String moldId) {
        this.moldId = moldId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getHouseImg() {
        return houseImg;
    }

    public void setHouseImg(String houseImg) {
        this.houseImg = houseImg;
    }

    public Integer getMatingId() {
        return matingId;
    }

    public void setMatingId(Integer matingId) {
        this.matingId = matingId;
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getRentalDetails() {
        return rentalDetails;
    }

    public void setRentalDetails(String rentalDetails) {
        this.rentalDetails = rentalDetails;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}