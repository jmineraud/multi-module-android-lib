package com.jmineraud.lib.core;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class PublicSingletonA {

    private static PublicSingletonA instance;

    private PublicSingletonA() {}

    public static PublicSingletonA getInstance() {
        if (instance == null) {
            instance = new PublicSingletonA();
        }
        return instance;
    }

    @NonNull
    public String getValue() {
        return "Public";
    }

}