
package com.example.cherry.citylistdemo;

/**
 * 记录每一个城市的中文名称及首字母
 *
 * @author acer
 */
public class CityBean {
    private String name;
    private String firstAlpha;

    public String getCityName() {
        return name;
    }

    public void setCityName(String cityName) {
        name = cityName;
    }

    public String getNameSort() {
        return firstAlpha;
    }

    public void setNameSort(String nameSort) {
        firstAlpha = nameSort;
    }

}

