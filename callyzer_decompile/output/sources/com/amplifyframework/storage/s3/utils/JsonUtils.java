package com.amplifyframework.storage.s3.utils;

import java.util.Map;
import kk.C4088h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public final Map<?, ?> jsonToMap(String input) {
        AbstractC4154l.m8923f(input, "input");
        Object objM8855b = new C4088h().m8855b(Map.class, input);
        AbstractC4154l.m8922e(objM8855b, "fromJson(...)");
        return (Map) objM8855b;
    }

    public final String mapToString(Map<String, String> input) {
        AbstractC4154l.m8923f(input, "input");
        return new C4088h().m8861h(input).toString();
    }
}
