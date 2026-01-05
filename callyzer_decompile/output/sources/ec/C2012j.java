package ec;

import fx.InterfaceC2395a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.j */
/* loaded from: classes.dex */
public final class C2012j implements Map.Entry, InterfaceC2395a {

    /* renamed from: a */
    public final Object f9544a;

    /* renamed from: b */
    public final Object f9545b;

    public C2012j(Object obj, Object obj2) {
        this.f9544a = obj;
        this.f9545b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012j)) {
            return false;
        }
        C2012j c2012j = (C2012j) obj;
        return AbstractC4154l.m8918a(this.f9544a, c2012j.f9544a) && AbstractC4154l.m8918a(this.f9545b, c2012j.f9545b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9544a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9545b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f9544a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9545b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f9544a + ", value=" + this.f9545b + ')';
    }
}
