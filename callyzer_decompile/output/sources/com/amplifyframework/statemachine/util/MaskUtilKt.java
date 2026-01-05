package com.amplifyframework.statemachine.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.w9;
import rw.AbstractC6662l;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class MaskUtilKt {
    public static final String mask(String str) {
        return (str == null || str.length() <= 4) ? "***" : AbstractC5178p.m10114Y(str, w9.m11919j(0, 4)).concat("***");
    }

    public static final Map<String, String> mask(Map<String, String> map, String... keys) {
        AbstractC4154l.m8923f(map, "<this>");
        AbstractC4154l.m8923f(keys, "keys");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            String strMask = (String) entry.getValue();
            if (AbstractC6662l.m12713c(keys, str)) {
                strMask = mask(strMask);
            }
            linkedHashMap.put(key, strMask);
        }
        return linkedHashMap;
    }
}
