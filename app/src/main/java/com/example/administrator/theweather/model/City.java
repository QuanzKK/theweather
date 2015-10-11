package com.example.administrator.theweather.model;

/**
 * Created by Administrator on 2015/10/11.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provincedId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvincedId() {
        return provincedId;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityName(String ctiyName) {
        this.cityName = ctiyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvincedId(int provincedId) {
        this.provincedId = provincedId;
    }
}
