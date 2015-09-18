package com.challenges;

/**
 * Created by ricardo on 9/17/2015.
 */
public enum Bandwidth {
    BANDWIDTH100M ("100M") ,
    BANDWIDTH1G("1G"),
    BANDWIDTH10G("10G"),
    BANDWIDTH40G("40G"),
    BANDWIDTH100G("100G");

    private String value;

    private Bandwidth(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
