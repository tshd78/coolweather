package com.twist.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * File description
 *
 * @author twist
 * @date 2020/4/16 15 11
 * @email twistonidea@gmail.com
 */
public class Basic {

    /**
     * cid : CN101190401
     * location : 苏州
     * parent_city : 苏州
     * admin_area : 江苏
     * cnty : 中国
     * lat : 34.75797653
     * lon : 113.6654129
     * tz : +8.00
     * city : 苏州
     * id : CN101190401
     * update : {"loc":"2020-04-16 15:08","utc":"2020-04-16 07:08"}
     */

    @SerializedName("cid")
    private String weatherId;
    private String location;
    @SerializedName("parent_city")
    private String cityName;
    private String admin_area;
    private String cnty;
    private String lat;
    private String lon;
    private String tz;
    private String city;
    private String id;
    private UpdateBean update;


    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdmin_area() {
        return admin_area;
    }

    public void setAdmin_area(String admin_area) {
        this.admin_area = admin_area;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateBean getUpdate() {
        return update;
    }

    public void setUpdate(UpdateBean update) {
        this.update = update;
    }

    public static class UpdateBean {
        /**
         * loc : 2020-04-16 15:08
         * utc : 2020-04-16 07:08
         */

        @SerializedName("loc")
        private String updateTime;
        private String utc;

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUtc() {
            return utc;
        }

        public void setUtc(String utc) {
            this.utc = utc;
        }
    }
}
