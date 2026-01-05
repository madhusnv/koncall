package com.amplifyframework.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.aw5;
import p001o.sq8;
import p001o.vv5;

/* loaded from: classes5.dex */
public final class DocumentBuilder {
    public final vv5.C17677c process(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            vv5 vv5VarProcess = process(jSONObject.get(next));
            sq8.m48646e(next);
            linkedHashMap.put(next, vv5VarProcess);
        }
        return new vv5.C17677c(linkedHashMap);
    }

    public final vv5.C17676b process(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "array");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(process(jSONArray.opt(i)));
        }
        return new vv5.C17676b(arrayList);
    }

    public final vv5 process(Object obj) {
        if (obj instanceof JSONArray) {
            return process((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return process((JSONObject) obj);
        }
        if (obj instanceof Number) {
            return aw5.m17886a((Number) obj);
        }
        if (obj instanceof String) {
            return aw5.m17887b((String) obj);
        }
        if (obj instanceof Boolean) {
            return aw5.m17888c(((Boolean) obj).booleanValue());
        }
        if (sq8.m48644c(obj, JSONObject.NULL) || obj == null) {
            return null;
        }
        throw new IllegalArgumentException("Unknown value type");
    }
}
