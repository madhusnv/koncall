package cd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cd.h */
/* loaded from: classes.dex */
public final class C0953h extends AbstractC0954i {

    /* renamed from: a */
    public final int f5730a;

    /* renamed from: b */
    public final Object f5731b;

    public C0953h(int i10, Object obj) {
        this.f5730a = i10;
        this.f5731b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953h)) {
            return false;
        }
        C0953h c0953h = (C0953h) obj;
        return this.f5730a == c0953h.f5730a && AbstractC4154l.m8918a(this.f5731b, c0953h.f5731b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f5730a) * 31;
        Object obj = this.f5731b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Response(attempts=" + this.f5730a + ", response=" + this.f5731b + ')';
    }
}
