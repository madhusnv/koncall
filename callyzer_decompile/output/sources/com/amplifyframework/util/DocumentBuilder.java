package com.amplifyframework.util;

import hc.AbstractC2887j;
import hc.C2882e;
import hc.C2883f;
import hc.C2884g;
import hc.C2885h;
import hc.C2886i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DocumentBuilder {
    public final C2884g process(JSONObject obj) {
        AbstractC4154l.m8923f(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = obj.keys();
        AbstractC4154l.m8922e(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, process(obj.get(next)));
        }
        return new C2884g(linkedHashMap);
    }

    public final C2883f process(JSONArray array) {
        AbstractC4154l.m8923f(array, "array");
        ArrayList arrayList = new ArrayList();
        int length = array.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(process(array.opt(i10)));
        }
        return new C2883f(arrayList);
    }

    public final AbstractC2887j process(Object obj) {
        if (obj instanceof JSONArray) {
            return process((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return process((JSONObject) obj);
        }
        if (obj instanceof Number) {
            return new C2885h((Number) obj);
        }
        if (obj instanceof String) {
            return new C2886i((String) obj);
        }
        if (obj instanceof Boolean) {
            return new C2882e(((Boolean) obj).booleanValue());
        }
        if (AbstractC4154l.m8918a(obj, JSONObject.NULL) || obj == null) {
            return null;
        }
        throw new IllegalArgumentException("Unknown value type");
    }
}
