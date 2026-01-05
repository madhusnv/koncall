package i1;

import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.q */
/* loaded from: classes.dex */
public final class C3138q {

    /* renamed from: a */
    public final float f16961a;

    /* renamed from: b */
    public final d3.n0 f16962b;

    public C3138q(float f6, d3.n0 n0Var) {
        this.f16961a = f6;
        this.f16962b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3138q)) {
            return false;
        }
        C3138q c3138q = (C3138q) obj;
        return C6750f.m12935a(this.f16961a, c3138q.f16961a) && this.f16962b.equals(c3138q.f16962b);
    }

    public final int hashCode() {
        return this.f16962b.hashCode() + (Float.hashCode(this.f16961a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) C6750f.m12936b(this.f16961a)) + ", brush=" + this.f16962b + ')';
    }
}
