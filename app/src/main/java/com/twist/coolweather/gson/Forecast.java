package com.twist.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * File description
 *
 * @author twist
 * @date 2020/4/16 15 29
 * @email twistonidea@gmail.com
 */
public class Forecast {

    /**
     * date : 2020-04-17
     * cond : {"txt_d":"多云"}
     * tmp : {"max":"20","min":"7"}
     */

    private String date;
    @SerializedName("cond")
    private More more;
    @SerializedName("tmp")
    private Temperature temperature;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public static class More {
        /**
         * txt_d : 多云
         */

        @SerializedName("txt_d")
        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class Temperature {
        /**
         * max : 20
         * min : 7
         */

        private String max;
        private String min;

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }
    }
}
