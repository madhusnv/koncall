package com.amplifyframework.core.model;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PrimaryKey {
    private static final String ID = "id";

    private PrimaryKey() {
    }

    public static String fieldName() {
        return ID;
    }

    public static boolean matches(Object obj) {
        return (obj instanceof String) && fieldName().equals(obj);
    }
}
