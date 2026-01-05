package p001o;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class yma {
    /* renamed from: b */
    public static final void m57999b(LinkedHashMap linkedHashMap, Object obj) {
        if (linkedHashMap.containsKey(obj)) {
            Object objRemove = linkedHashMap.remove(obj);
            sq8.m48646e(objRemove);
            linkedHashMap.put(obj, objRemove);
        }
    }
}
