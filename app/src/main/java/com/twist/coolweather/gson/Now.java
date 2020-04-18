package com.twist.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * File description
 *
 * @author twist
 * @date 2020/4/16 15 17
 * @email twistonidea@gmail.com
 */
public class Now {


    /**
     * cloud : 95
     * cond_code : 101
     * cond_txt : 多云
     * fl : 13
     * hum : 36
     * pcpn : 0.0
     * pres : 1014
     * tmp : 17
     * vis : 16
     * wind_deg : 269
     * wind_dir : 西风
     * wind_sc : 3
     * wind_spd : 19
     * cond : {"code":"101","txt":"多云"}
     */

    private String cloud;
    private String cond_code;
    private String cond_txt;
    private String fl;
    private String hum;
    private String pcpn;
    private String pres;
    @SerializedName("tmp")
    private String temperature;
    private String vis;
    private String wind_deg;
    private String wind_dir;
    private String wind_sc;
    private String wind_spd;
    @SerializedName("cond")
    private More more;

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getCond_code() {
        return cond_code;
    }

    public void setCond_code(String cond_code) {
        this.cond_code = cond_code;
    }

    public String getCond_txt() {
        return cond_txt;
    }

    public void setCond_txt(String cond_txt) {
        this.cond_txt = cond_txt;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getWind_deg() {
        return wind_deg;
    }

    public void setWind_deg(String wind_deg) {
        this.wind_deg = wind_deg;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getWind_sc() {
        return wind_sc;
    }

    public void setWind_sc(String wind_sc) {
        this.wind_sc = wind_sc;
    }

    public String getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(String wind_spd) {
        this.wind_spd = wind_spd;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }

    public static class More {
        /**
         * code : 101
         * txt : 多云
         */

        private String code;

        @SerializedName("txt")
        private String info;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
