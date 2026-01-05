package kq;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kq.o */
/* loaded from: classes3.dex */
public final class C4185o {

    /* renamed from: a */
    public final int f21223a;

    /* renamed from: b */
    public final int f21224b;

    public C4185o(int i10, int i11) {
        this.f21223a = i10;
        this.f21224b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4185o)) {
            return false;
        }
        C4185o c4185o = (C4185o) obj;
        return this.f21223a == c4185o.f21223a && this.f21224b == c4185o.f21224b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21224b) + (Integer.hashCode(this.f21223a) * 31);
    }

    public final String toString() {
        return m0.m7377j(this.f21223a, this.f21224b, "TabIcon(selected=", ", unselected=", ")");
    }
}
