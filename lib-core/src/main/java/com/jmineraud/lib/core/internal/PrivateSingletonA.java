package com.jmineraud.lib.core.internal;


import androidx.annotation.NonNull;

public class PrivateSingletonA {

    private static PrivateSingletonA instance;

    private PrivateSingletonA() {}

    public static PrivateSingletonA getInstance() {
        if (instance == null) {
            instance = new PrivateSingletonA();
        }
        return instance;
    }

    @NonNull
    public String getValue() {
        return "Private";
    }

}
