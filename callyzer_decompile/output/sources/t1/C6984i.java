package t1;

import og.dg;
import rw.AbstractC6663m;
import s1.InterfaceC6720o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.i */
/* loaded from: classes.dex */
public final class C6984i implements InterfaceC6720o {

    /* renamed from: a */
    public final AbstractC7000y f33803a;

    /* renamed from: b */
    public final int f33804b;

    public C6984i(AbstractC7000y abstractC7000y, int i10) {
        this.f33803a = abstractC7000y;
        this.f33804b = i10;
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: a */
    public final int mo12089a() {
        return this.f33803a.mo13252l();
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: b */
    public final int mo12090b() {
        return Math.min(r0.mo13252l() - 1, ((C6982g) AbstractC6663m.m12750N(this.f33803a.m13264k().f33851a)).f33789a + this.f33804b);
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: c */
    public final int mo12091c() {
        AbstractC7000y abstractC7000y = this.f33803a;
        if (abstractC7000y.m13264k().f33851a.size() == 0) {
            return 0;
        }
        int iM10614a = dg.m10614a(abstractC7000y.m13264k()) / (abstractC7000y.m13264k().f33852b + abstractC7000y.m13264k().f33853c);
        if (iM10614a < 1) {
            return 1;
        }
        return iM10614a;
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: d */
    public final boolean mo12092d() {
        return !this.f33803a.m13264k().f33851a.isEmpty();
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: e */
    public final int mo12093e() {
        return Math.max(0, this.f33803a.f33902e - this.f33804b);
    }
}
