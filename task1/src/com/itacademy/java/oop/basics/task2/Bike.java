package com.itacademy.java.oop.basics.task2;

public enum Bike {

    MOUNTAIN("Mountain"),
    ROAD("Road"),
    UNKNOWN("Unknown");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    public static Bike fromCode(String code) {
        for (Bike d : values()) {
            if (d.getDisplayValue().equals(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }

    Bike(String displayValue) {
        this.displayValue = displayValue;
    }
}
