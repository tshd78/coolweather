package com.twist.coolweather.gson;

/**
 * File description
 *
 * @author twist
 * @date 2020/4/16 15 16
 * @email twistonidea@gmail.com
 */
public class AQI {


    /**
     * city : {"aqi":"114","pm25":"69","qlty":"轻度污染"}
     */

    private AQICity city;

    public AQICity getCity() {
        return city;
    }

    public void setCity(AQICity city) {
        this.city = city;
    }

    public static class AQICity {
        /**
         * aqi : 114
         * pm25 : 69
         * qlty : 轻度污染
         */

        private String aqi;
        private String pm25;
        private String qlty;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getQlty() {
            return qlty;
        }

        public void setQlty(String qlty) {
            this.qlty = qlty;
        }
    }
}
