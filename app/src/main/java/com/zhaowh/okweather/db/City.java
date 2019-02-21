package com.zhaowh.okweather.db;

/**
 * 市
 */
public class City {

    private int id;

    /**
     * 城市名
     */
    private String cityName;

    /**
     * 城市代号
     */
    private int cityCode;

    /**
     * 当前城市所属省的id值
     */
    private int privinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPrivinceId() {
        return privinceId;
    }

    public void setPrivinceId(int privinceId) {
        this.privinceId = privinceId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode=" + cityCode +
                ", privinceId=" + privinceId +
                '}';
    }
}
