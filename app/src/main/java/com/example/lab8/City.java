package com.example.lab8;

import java.util.Objects;

public class City implements Comparable {

    private String city;
    private String province;
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }


    public City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City otherCity = (City) o;
        return Objects.equals(city, otherCity.city) &&
                Objects.equals(province, otherCity.province);
    }*/

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }
}
