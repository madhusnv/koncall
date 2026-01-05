package uz;

import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4408h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.g */
/* loaded from: classes3.dex */
public abstract class AbstractC7582g {
    /* renamed from: a */
    public static final ArrayList m14314a(Map map, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C4408h c4408h = (C4408h) entry.getValue();
            Boolean boolValueOf = c4408h != null ? Boolean.valueOf(c4408h.f22041b) : null;
            AbstractC4154l.m8920c(boolValueOf);
            if (!boolValueOf.booleanValue() && !c4408h.f22042c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) interfaceC2139c.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
