package com.amplifyframework.storage.s3.utils;

import com.google.gson.Gson;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class JsonUtils {
    public static final JsonUtils INSTANCE = new JsonUtils();

    private JsonUtils() {
    }

    public final Map<?, ?> jsonToMap(String str) {
        sq8.m48649h(str, "input");
        Object objFromJson = new Gson().fromJson(str, (Class<Object>) Map.class);
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }

    public final String mapToString(Map<String, String> map) {
        sq8.m48649h(map, "input");
        return new Gson().toJson(map).toString();
    }
}
