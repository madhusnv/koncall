package jy;

import hy.C3057h;
import hy.C3059j;
import hy.InterfaceC3055f;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.AbstractC5942w;
import qw.C6366p;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.t */
/* loaded from: classes3.dex */
public final class C3883t extends p0 {

    /* renamed from: l */
    public final C3059j f19963l;

    /* renamed from: m */
    public final C6366p f19964m;

    public C3883t(String str, int i10) {
        super(str, null, i10);
        this.f19963l = C3059j.f16412b;
        this.f19964m = nd.m10782c(new bt.w0(i10, str, this));
    }

    @Override // jy.p0, hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return this.f19963l;
    }

    @Override // jy.p0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC3055f)) {
            return false;
        }
        InterfaceC3055f interfaceC3055f = (InterfaceC3055f) obj;
        return interfaceC3055f.mo7280e() == C3059j.f16412b && this.f19941a.equals(interfaceC3055f.mo7277a()) && AbstractC4154l.m8918a(n0.m8421b(this), n0.m8421b(interfaceC3055f));
    }

    @Override // jy.p0
    public final int hashCode() {
        int iHashCode = this.f19941a.hashCode();
        e1.x0 x0Var = new e1.x0(this);
        int iHashCode2 = 1;
        while (x0Var.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) x0Var.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // jy.p0, hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        return ((InterfaceC3055f[]) this.f19964m.getValue())[i10];
    }

    @Override // jy.p0
    public final String toString() {
        return AbstractC6663m.m12748L(new C3057h(0, this), ", ", this.f19941a.concat("("), ")", null, 56);
    }
}
