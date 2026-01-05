package com.onesignal.common;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class JSONObjectExtensionsKt {

    /* renamed from: com.onesignal.common.JSONObjectExtensionsKt$putMap$1 */
    public static final class C115721 extends kf9 implements xk7 {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115721(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return y3i.f54824a;
        }

        public final void invoke(JSONObject jSONObject) throws JSONException {
            sq8.m48649h(jSONObject, "it");
            JSONObjectExtensionsKt.putMap(jSONObject, this.$map);
        }
    }

    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String str, xk7 xk7Var) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sq8.m48648g(jSONObject2, "itemJSONObject");
                Object objInvoke = xk7Var.invoke(jSONObject2);
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String str, xk7 xk7Var) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "into");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            sq8.m48648g(jSONObject2, "this.getJSONObject(name)");
            xk7Var.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String str, List<? extends T> list, xk7 xk7Var) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) xk7Var.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String str, xk7 xk7Var) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        sq8.m48649h(xk7Var, "expand");
        JSONObject jSONObject2 = new JSONObject();
        xk7Var.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String str, Object obj) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String str) {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (JSONObject.NULL.equals(objOpt)) {
                arrayList.add(null);
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) objOpt));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) objOpt));
            } else {
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object list = jSONObject.get(next);
            sq8.m48648g(next, TransferTable.COLUMN_KEY);
            if (JSONObject.NULL.equals(list)) {
                list = null;
            } else if (list instanceof JSONObject) {
                list = toMap((JSONObject) list);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            map.put(next, list);
        }
        return map;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String str, Map<String, ? extends Object> map) throws JSONException {
        sq8.m48649h(jSONObject, "<this>");
        sq8.m48649h(str, "name");
        if (map != null) {
            putJSONObject(jSONObject, str, new C115721(map));
        }
        return jSONObject;
    }
}
