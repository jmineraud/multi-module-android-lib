package com.jmineraud.lib.core;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class PublicSingletonB {

    private static PublicSingletonB instance;

    private PublicSingletonB() {}

    public static PublicSingletonB getInstance() {
        if (instance == null) {
            instance = new PublicSingletonB();
        }
        return instance;
    }

    @NonNull
    public PublicSingletonA getValue() {
        return PublicSingletonA.getInstance();
    }

}