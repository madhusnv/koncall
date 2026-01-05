package ec;

import fx.InterfaceC2399e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.InterfaceC4911g;
import rw.AbstractC6663m;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.o */
/* loaded from: classes.dex */
public interface InterfaceC2017o extends Map, InterfaceC2399e {
    /* renamed from: a */
    InterfaceC4911g mo261a();

    /* renamed from: e */
    default InterfaceC2015m mo264e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(size()));
        for (Map.Entry entry : entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC6663m.c0((List) entry.getValue()));
        }
        return new C2021s(AbstractC6674x.m12785m(linkedHashMap));
    }

    /* renamed from: g */
    boolean mo266g(Object obj, String str);

    /* renamed from: k */
    boolean mo270k(Object obj, Collection collection);

    /* renamed from: m */
    default void mo271m(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo270k(entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // java.util.Map
    List put(Object obj, Object obj2);
}
