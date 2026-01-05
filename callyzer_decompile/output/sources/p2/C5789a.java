package p2;

import e1.C1918t;
import ec.C2008f;
import fx.InterfaceC2398d;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.a */
/* loaded from: classes.dex */
public final class C5789a extends C1918t implements InterfaceC2398d {

    /* renamed from: d */
    public final C2008f f28374d;

    /* renamed from: e */
    public Object f28375e;

    public C5789a(C2008f c2008f, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f28374d = c2008f;
        this.f28375e = obj2;
    }

    @Override // e1.C1918t, java.util.Map.Entry
    public final Object getValue() {
        return this.f28375e;
    }

    @Override // e1.C1918t, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f28375e;
        this.f28375e = obj;
        C5793e c5793e = (C5793e) this.f28374d.f9539b;
        C5792d c5792d = c5793e.f28388d;
        Object obj3 = this.f9056b;
        if (!c5792d.containsKey(obj3)) {
            return obj2;
        }
        boolean z6 = c5793e.f28381c;
        if (!z6) {
            c5792d.put(obj3, obj);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            AbstractC5800l abstractC5800l = c5793e.f28379a[c5793e.f28380b];
            Object obj4 = abstractC5800l.f28403a[abstractC5800l.f28405c];
            c5792d.put(obj3, obj);
            c5793e.m11346f(obj4 != null ? obj4.hashCode() : 0, c5792d.f28384c, obj4, 0);
        }
        c5793e.f28391g = c5792d.f28386e;
        return obj2;
    }
}
