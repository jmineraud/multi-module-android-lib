package com.jmineraud.lib.core.internal;

import androidx.annotation.NonNull;

public class PrivateSingletonB {

    private static PrivateSingletonB instance;

    private PrivateSingletonB() {}

    @NonNull
    public static PrivateSingletonB getInstance() {
        if (instance == null) {
            instance = new PrivateSingletonB();
        }
        return instance;
    }

    @NonNull
    public PrivateSingletonA getValue() {
        return PrivateSingletonA.getInstance();
    }

}
