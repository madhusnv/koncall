package com.amplifyframework.core.model;

/* loaded from: classes5.dex */
public final class PrimaryKey {
    private static final String ID = "id";

    private PrimaryKey() {
    }

    public static String fieldName() {
        return "id";
    }

    public static boolean matches(Object obj) {
        return (obj instanceof String) && fieldName().equals(obj);
    }
}
