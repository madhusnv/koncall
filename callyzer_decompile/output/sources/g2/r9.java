package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import m1.InterfaceC4629k;
import s4.C6750f;
import v3.InterfaceC7641m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r9 implements i1.u0 {

    /* renamed from: a */
    public final boolean f12610a;

    /* renamed from: b */
    public final float f12611b;

    /* renamed from: c */
    public final long f12612c;

    public r9(boolean z6, float f6, long j6) {
        this.f12610a = z6;
        this.f12611b = f6;
        this.f12612c = j6;
    }

    @Override // i1.u0
    /* renamed from: b */
    public final InterfaceC7641m mo6293b(InterfaceC4629k interfaceC4629k) {
        return new z4(interfaceC4629k, this.f12610a, this.f12611b, new x4(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        if (this.f12610a == r9Var.f12610a && C6750f.m12935a(this.f12611b, r9Var.f12611b)) {
            return C1565s.m5187c(this.f12612c, r9Var.f12612c);
        }
        return false;
    }

    @Override // i1.u0
    public final int hashCode() {
        int iM4555b = AbstractC1452a.m4555b(this.f12611b, Boolean.hashCode(this.f12610a) * 31, 961);
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f12612c) + iM4555b;
    }
}
