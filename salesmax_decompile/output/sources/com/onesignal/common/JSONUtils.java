package com.onesignal.common;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.onesignal.debug.internal.logging.Logging;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.e9g;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class JSONUtils {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final JSONUtils INSTANCE = new JSONUtils();

    private JSONUtils() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) throws JSONException {
        sq8.m48649h(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e) {
                Logging.error("bundleAsJSONObject error for key: " + str, e);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        int i;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int length2 = jSONArray2.length();
                for (0; i < length2; i + 1) {
                    Object obj = jSONArray.get(i2);
                    sq8.m48648g(obj, "jsonArray1[i]");
                    Object objNormalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i);
                    sq8.m48648g(obj2, "jsonArray2[j]");
                    i = sq8.m48644c(objNormalizeType, normalizeType(obj2)) ? 0 : i + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final Bundle jsonStringToBundle(String str) {
        sq8.m48649h(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            sq8.m48648g(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                sq8.m48647f(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "jsonObject.keys()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objOpt = jSONObject.opt(next);
                if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                    Logging.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
                } else if (jSONObject.isNull(next) || sq8.m48644c("", objOpt)) {
                    linkedHashMap.put(next, "");
                } else {
                    linkedHashMap.put(next, objOpt.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jSONArray) throws JSONException {
        sq8.m48649h(jSONArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            sq8.m48648g(string, "jsonArray.getString(i)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object obj) {
        sq8.m48649h(obj, "object");
        Class<?> cls = obj.getClass();
        return sq8.m48644c(cls, Integer.TYPE) ? Long.valueOf(((Integer) obj).intValue()) : sq8.m48644c(cls, Float.TYPE) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public final String toUnescapedEUIDString(JSONObject jSONObject) {
        String strGroup;
        sq8.m48649h(jSONObject, "json");
        String string = jSONObject.toString();
        sq8.m48648g(string, "json.toString()");
        if (!jSONObject.has(EXTERNAL_USER_ID)) {
            return string;
        }
        Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
        if (!matcher.find() || (strGroup = matcher.group(0)) == null) {
            return string;
        }
        String strReplaceAll = matcher.replaceAll(Matcher.quoteReplacement(e9g.m24593G(strGroup, "\\/", "/", false, 4, null)));
        sq8.m48648g(strReplaceAll, "eidMatcher.replaceAll(unescapedEID)");
        return strReplaceAll;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
        sq8.m48648g(jSONArrayPut, "JSONArray().put(jsonObject)");
        return jSONArrayPut;
    }
}
