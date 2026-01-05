package b2;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.r */
/* loaded from: classes.dex */
public final class C0560r {

    /* renamed from: a */
    public final C0559q f3806a;

    /* renamed from: b */
    public final C0559q f3807b;

    /* renamed from: c */
    public final boolean f3808c;

    public C0560r(C0559q c0559q, C0559q c0559q2, boolean z6) {
        this.f3806a = c0559q;
        this.f3807b = c0559q2;
        this.f3808c = z6;
    }

    /* renamed from: a */
    public static C0560r m1660a(C0560r c0560r, C0559q c0559q, C0559q c0559q2, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            c0559q = c0560r.f3806a;
        }
        if ((i10 & 2) != 0) {
            c0559q2 = c0560r.f3807b;
        }
        c0560r.getClass();
        return new C0560r(c0559q, c0559q2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0560r)) {
            return false;
        }
        C0560r c0560r = (C0560r) obj;
        return AbstractC4154l.m8918a(this.f3806a, c0560r.f3806a) && AbstractC4154l.m8918a(this.f3807b, c0560r.f3807b) && this.f3808c == c0560r.f3808c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3808c) + ((this.f3807b.hashCode() + (this.f3806a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f3806a);
        sb2.append(", end=");
        sb2.append(this.f3807b);
        sb2.append(", handlesCrossed=");
        return i0.m0.m7382o(sb2, this.f3808c, ')');
    }
}
