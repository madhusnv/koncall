package rw;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.u */
/* loaded from: classes3.dex */
public final class C6671u {

    /* renamed from: a */
    public final int f31946a;

    /* renamed from: b */
    public final Object f31947b;

    public C6671u(int i10, Object obj) {
        this.f31946a = i10;
        this.f31947b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6671u)) {
            return false;
        }
        C6671u c6671u = (C6671u) obj;
        return this.f31946a == c6671u.f31946a && AbstractC4154l.m8918a(this.f31947b, c6671u.f31947b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f31946a) * 31;
        Object obj = this.f31947b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f31946a + ", value=" + this.f31947b + ')';
    }
}
