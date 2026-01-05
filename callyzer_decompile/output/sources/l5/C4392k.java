package l5;

import java.util.ArrayList;
import k5.C4006a;
import k5.C4010e;
import k5.C4013h;
import k5.EnumC4009d;
import k5.EnumC4012g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.k */
/* loaded from: classes.dex */
public final class C4392k extends AbstractC4398q {

    /* renamed from: k */
    public static final int[] f21974k = new int[2];

    /* renamed from: m */
    public static void m9168m(int[] iArr, int i10, int i11, int i12, int i13, float f6, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f6) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f6) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f6) + 0.5f);
        int i18 = (int) ((i15 / f6) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x025c  */
    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9155a(l5.InterfaceC4385d r23) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C4392k.mo9155a(l5.d):void");
    }

    @Override // l5.AbstractC4398q
    /* renamed from: d */
    public final void mo9156d() {
        C4013h c4013h;
        C4013h c4013h2;
        C4013h c4013h3;
        C4013h c4013h4;
        C4013h c4013h5 = this.f21982b;
        boolean z6 = c4013h5.f20759a;
        C4388g c4388g = this.f21985e;
        if (z6) {
            c4388g.mo9165d(c4013h5.m8800j());
        }
        boolean z10 = c4388g.f21969j;
        ArrayList arrayList = c4388g.f21970k;
        ArrayList arrayList2 = c4388g.f21971l;
        C4387f c4387f = this.f21989i;
        C4387f c4387f2 = this.f21988h;
        if (z10) {
            EnumC4012g enumC4012g = this.f21984d;
            EnumC4012g enumC4012g2 = EnumC4012g.MATCH_PARENT;
            if (enumC4012g == enumC4012g2 && (((c4013h2 = (c4013h = this.f21982b).f20742J) != null && c4013h2.f20741I[0] == EnumC4012g.FIXED) || c4013h2.f20741I[0] == enumC4012g2)) {
                AbstractC4398q.m9173b(c4387f2, c4013h2.f20762d.f21988h, c4013h.f20782x.m8788b());
                AbstractC4398q.m9173b(c4387f, c4013h2.f20762d.f21989i, -this.f21982b.f20784z.m8788b());
                return;
            }
        } else {
            C4013h c4013h6 = this.f21982b;
            EnumC4012g enumC4012g3 = c4013h6.f20741I[0];
            this.f21984d = enumC4012g3;
            if (enumC4012g3 != EnumC4012g.MATCH_CONSTRAINT) {
                EnumC4012g enumC4012g4 = EnumC4012g.MATCH_PARENT;
                if (enumC4012g3 == enumC4012g4 && (((c4013h4 = c4013h6.f20742J) != null && c4013h4.f20741I[0] == EnumC4012g.FIXED) || c4013h4.f20741I[0] == enumC4012g4)) {
                    int iM8800j = c4013h4.m8800j();
                    C4392k c4392k = c4013h4.f20762d;
                    int iM8788b = (iM8800j - this.f21982b.f20782x.m8788b()) - this.f21982b.f20784z.m8788b();
                    AbstractC4398q.m9173b(c4387f2, c4392k.f21988h, this.f21982b.f20782x.m8788b());
                    AbstractC4398q.m9173b(c4387f, c4392k.f21989i, -this.f21982b.f20784z.m8788b());
                    c4388g.mo9165d(iM8788b);
                    return;
                }
                if (enumC4012g3 == EnumC4012g.FIXED) {
                    c4388g.mo9165d(c4013h6.m8800j());
                }
            }
        }
        if (c4388g.f21969j) {
            C4013h c4013h7 = this.f21982b;
            if (c4013h7.f20759a) {
                C4010e[] c4010eArr = c4013h7.f20738F;
                C4010e c4010e = c4010eArr[0];
                C4010e c4010e2 = c4010e.f20727d;
                if (c4010e2 != null && c4010eArr[1].f20727d != null) {
                    if (c4013h7.m8805o()) {
                        c4387f2.f21965f = this.f21982b.f20738F[0].m8788b();
                        c4387f.f21965f = -this.f21982b.f20738F[1].m8788b();
                        return;
                    }
                    C4387f c4387fM9174h = AbstractC4398q.m9174h(this.f21982b.f20738F[0]);
                    if (c4387fM9174h != null) {
                        AbstractC4398q.m9173b(c4387f2, c4387fM9174h, this.f21982b.f20738F[0].m8788b());
                    }
                    C4387f c4387fM9174h2 = AbstractC4398q.m9174h(this.f21982b.f20738F[1]);
                    if (c4387fM9174h2 != null) {
                        AbstractC4398q.m9173b(c4387f, c4387fM9174h2, -this.f21982b.f20738F[1].m8788b());
                    }
                    c4387f2.f21961b = true;
                    c4387f.f21961b = true;
                    return;
                }
                if (c4010e2 != null) {
                    C4387f c4387fM9174h3 = AbstractC4398q.m9174h(c4010e);
                    if (c4387fM9174h3 != null) {
                        AbstractC4398q.m9173b(c4387f2, c4387fM9174h3, this.f21982b.f20738F[0].m8788b());
                        AbstractC4398q.m9173b(c4387f, c4387f2, c4388g.f21966g);
                        return;
                    }
                    return;
                }
                C4010e c4010e3 = c4010eArr[1];
                if (c4010e3.f20727d != null) {
                    C4387f c4387fM9174h4 = AbstractC4398q.m9174h(c4010e3);
                    if (c4387fM9174h4 != null) {
                        AbstractC4398q.m9173b(c4387f, c4387fM9174h4, -this.f21982b.f20738F[1].m8788b());
                        AbstractC4398q.m9173b(c4387f2, c4387f, -c4388g.f21966g);
                        return;
                    }
                    return;
                }
                if ((c4013h7 instanceof C4006a) || c4013h7.f20742J == null || c4013h7.mo8795e(EnumC4009d.CENTER).f20727d != null) {
                    return;
                }
                C4013h c4013h8 = this.f21982b;
                AbstractC4398q.m9173b(c4387f2, c4013h8.f20742J.f20762d.f21988h, c4013h8.m8801k());
                AbstractC4398q.m9173b(c4387f, c4387f2, c4388g.f21966g);
                return;
            }
        }
        if (this.f21984d == EnumC4012g.MATCH_CONSTRAINT) {
            C4013h c4013h9 = this.f21982b;
            int i10 = c4013h9.f20768j;
            C4395n c4395n = c4013h9.f20763e;
            if (i10 == 2) {
                C4013h c4013h10 = c4013h9.f20742J;
                if (c4013h10 != null) {
                    C4388g c4388g2 = c4013h10.f20763e.f21985e;
                    arrayList2.add(c4388g2);
                    c4388g2.f21970k.add(c4388g);
                    c4388g.f21961b = true;
                    arrayList.add(c4387f2);
                    arrayList.add(c4387f);
                }
            } else if (i10 == 3) {
                if (c4013h9.f20769k == 3) {
                    c4387f2.f21960a = this;
                    c4387f.f21960a = this;
                    c4395n.f21988h.f21960a = this;
                    c4395n.f21989i.f21960a = this;
                    c4388g.f21960a = this;
                    if (c4013h9.m8806p()) {
                        arrayList2.add(this.f21982b.f20763e.f21985e);
                        this.f21982b.f20763e.f21985e.f21970k.add(c4388g);
                        C4395n c4395n2 = this.f21982b.f20763e;
                        c4395n2.f21985e.f21960a = this;
                        arrayList2.add(c4395n2.f21988h);
                        arrayList2.add(this.f21982b.f20763e.f21989i);
                        this.f21982b.f20763e.f21988h.f21970k.add(c4388g);
                        this.f21982b.f20763e.f21989i.f21970k.add(c4388g);
                    } else if (this.f21982b.m8805o()) {
                        this.f21982b.f20763e.f21985e.f21971l.add(c4388g);
                        arrayList.add(this.f21982b.f20763e.f21985e);
                    } else {
                        this.f21982b.f20763e.f21985e.f21971l.add(c4388g);
                    }
                } else {
                    C4388g c4388g3 = c4395n.f21985e;
                    arrayList2.add(c4388g3);
                    c4388g3.f21970k.add(c4388g);
                    this.f21982b.f20763e.f21988h.f21970k.add(c4388g);
                    this.f21982b.f20763e.f21989i.f21970k.add(c4388g);
                    c4388g.f21961b = true;
                    arrayList.add(c4387f2);
                    arrayList.add(c4387f);
                    c4387f2.f21971l.add(c4388g);
                    c4387f.f21971l.add(c4388g);
                }
            }
        }
        C4013h c4013h11 = this.f21982b;
        C4010e[] c4010eArr2 = c4013h11.f20738F;
        C4010e c4010e4 = c4010eArr2[0];
        C4010e c4010e5 = c4010e4.f20727d;
        if (c4010e5 != null && c4010eArr2[1].f20727d != null) {
            if (c4013h11.m8805o()) {
                c4387f2.f21965f = this.f21982b.f20738F[0].m8788b();
                c4387f.f21965f = -this.f21982b.f20738F[1].m8788b();
                return;
            }
            C4387f c4387fM9174h5 = AbstractC4398q.m9174h(this.f21982b.f20738F[0]);
            C4387f c4387fM9174h6 = AbstractC4398q.m9174h(this.f21982b.f20738F[1]);
            c4387fM9174h5.m9163b(this);
            c4387fM9174h6.m9163b(this);
            this.f21990j = EnumC4397p.CENTER;
            return;
        }
        if (c4010e5 != null) {
            C4387f c4387fM9174h7 = AbstractC4398q.m9174h(c4010e4);
            if (c4387fM9174h7 != null) {
                AbstractC4398q.m9173b(c4387f2, c4387fM9174h7, this.f21982b.f20738F[0].m8788b());
                m9176c(c4387f, c4387f2, 1, c4388g);
                return;
            }
            return;
        }
        C4010e c4010e6 = c4010eArr2[1];
        if (c4010e6.f20727d != null) {
            C4387f c4387fM9174h8 = AbstractC4398q.m9174h(c4010e6);
            if (c4387fM9174h8 != null) {
                AbstractC4398q.m9173b(c4387f, c4387fM9174h8, -this.f21982b.f20738F[1].m8788b());
                m9176c(c4387f2, c4387f, -1, c4388g);
                return;
            }
            return;
        }
        if ((c4013h11 instanceof C4006a) || (c4013h3 = c4013h11.f20742J) == null) {
            return;
        }
        AbstractC4398q.m9173b(c4387f2, c4013h3.f20762d.f21988h, c4013h11.m8801k());
        m9176c(c4387f, c4387f2, 1, c4388g);
    }

    @Override // l5.AbstractC4398q
    /* renamed from: e */
    public final void mo9157e() {
        C4387f c4387f = this.f21988h;
        if (c4387f.f21969j) {
            this.f21982b.f20747O = c4387f.f21966g;
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: f */
    public final void mo9158f() {
        this.f21983c = null;
        this.f21988h.m9164c();
        this.f21989i.m9164c();
        this.f21985e.m9164c();
        this.f21987g = false;
    }

    @Override // l5.AbstractC4398q
    /* renamed from: k */
    public final boolean mo9160k() {
        return this.f21984d != EnumC4012g.MATCH_CONSTRAINT || this.f21982b.f20768j == 0;
    }

    /* renamed from: n */
    public final void m9169n() {
        this.f21987g = false;
        C4387f c4387f = this.f21988h;
        c4387f.m9164c();
        c4387f.f21969j = false;
        C4387f c4387f2 = this.f21989i;
        c4387f2.m9164c();
        c4387f2.f21969j = false;
        this.f21985e.f21969j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f21982b.f20756X;
    }
}
