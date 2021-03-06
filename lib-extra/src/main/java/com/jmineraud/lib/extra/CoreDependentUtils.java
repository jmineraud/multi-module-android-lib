package com.jmineraud.lib.extra;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import com.jmineraud.lib.core.internal.PrivateSingletonA;
import com.jmineraud.lib.core.internal.PrivateSingletonB;

@Keep
public class CoreDependentUtils {

    @NonNull
    public static String getCoreValueA() {
        return PrivateSingletonA.getInstance().getValue();
    }

    @NonNull
    public static String getCoreValueB() {
        return PrivateSingletonB.getInstance().getValue().getValue();
    }

}
