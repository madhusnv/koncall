package com.amplifyframework.util;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Environment {
    private Environment() {
    }

    public static boolean isJUnitTest() {
        Iterator it = Arrays.asList(Thread.currentThread().getStackTrace()).iterator();
        while (it.hasNext()) {
            if (((StackTraceElement) it.next()).getClassName().startsWith("org.junit.")) {
                return true;
            }
        }
        return false;
    }
}
