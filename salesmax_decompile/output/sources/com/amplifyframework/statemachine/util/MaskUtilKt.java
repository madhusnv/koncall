package com.amplifyframework.statemachine.util;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.bce;
import p001o.f9g;
import p001o.gp0;
import p001o.hsa;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class MaskUtilKt {
    public static final String mask(String str) {
        if (str == null || str.length() <= 4) {
            return "***";
        }
        return f9g.L0(str, bce.m18616s(0, 4)) + "***";
    }

    public static final Map<String, String> mask(Map<String, String> map, String... strArr) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(strArr, UserMetadata.KEYDATA_FILENAME);
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            String strMask = (String) entry.getValue();
            if (gp0.m29251R(strArr, str)) {
                strMask = mask(strMask);
            }
            linkedHashMap.put(key, strMask);
        }
        return linkedHashMap;
    }
}
