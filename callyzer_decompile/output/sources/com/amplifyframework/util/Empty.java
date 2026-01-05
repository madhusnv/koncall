package com.amplifyframework.util;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Empty {
    private Empty() {
    }

    public static boolean check(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean check(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean check(String str) {
        return str == null || str.length() == 0;
    }
}
