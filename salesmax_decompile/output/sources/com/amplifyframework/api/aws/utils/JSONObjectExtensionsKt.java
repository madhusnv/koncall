package com.amplifyframework.api.aws.utils;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, String> toStringMap(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            sq8.m48646e(next);
            String string = jSONObject.getString(next);
            sq8.m48648g(string, "getString(...)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }
}
