package com.dubbo.inter.vo;

import java.io.Serializable;

public class Order implements Serializable {

    private String oId;

    private String oName;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public Order(String oId, String oName) {
        this.oId = oId;
        this.oName = oName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId='" + oId + '\'' +
                ", oName='" + oName + '\'' +
                '}';
    }
}
