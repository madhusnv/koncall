package tq;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tq.o */
/* loaded from: classes3.dex */
public final class C7203o {

    /* renamed from: a */
    public final int f34495a;

    /* renamed from: b */
    public final int f34496b;

    public C7203o(int i10, int i11) {
        this.f34495a = i10;
        this.f34496b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7203o)) {
            return false;
        }
        C7203o c7203o = (C7203o) obj;
        return this.f34495a == c7203o.f34495a && this.f34496b == c7203o.f34496b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34496b) + (Integer.hashCode(this.f34495a) * 31);
    }

    public final String toString() {
        return m0.m7377j(this.f34495a, this.f34496b, "IconSelectUnselectUiModel(selectedIcon=", ", unSelectedIcon=", ")");
    }
}
