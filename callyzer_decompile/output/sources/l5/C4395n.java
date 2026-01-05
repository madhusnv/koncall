package l5;

import com.skydoves.balloon.internals.DefinitionKt;
import java.util.ArrayList;
import k5.C4006a;
import k5.C4010e;
import k5.C4013h;
import k5.EnumC4009d;
import k5.EnumC4012g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.n */
/* loaded from: classes.dex */
public final class C4395n extends AbstractC4398q {

    /* renamed from: k */
    public C4387f f21978k;

    /* renamed from: l */
    public C4382a f21979l;

    @Override // l5.InterfaceC4385d
    /* renamed from: a */
    public final void mo9155a(InterfaceC4385d interfaceC4385d) {
        float f6;
        float f10;
        float f11;
        int i10;
        if (AbstractC4394m.f21977a[this.f21990j.ordinal()] == 3) {
            C4013h c4013h = this.f21982b;
            m9178l(c4013h.f20783y, c4013h.f20733A, 1);
            return;
        }
        C4388g c4388g = this.f21985e;
        if (c4388g.f21962c && !c4388g.f21969j && this.f21984d == EnumC4012g.MATCH_CONSTRAINT) {
            C4013h c4013h2 = this.f21982b;
            int i11 = c4013h2.f20769k;
            if (i11 == 2) {
                C4013h c4013h3 = c4013h2.f20742J;
                if (c4013h3 != null) {
                    if (c4013h3.f20763e.f21985e.f21969j) {
                        c4388g.mo9165d((int) ((r1.f21966g * c4013h2.f20776r) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                C4388g c4388g2 = c4013h2.f20762d.f21985e;
                if (c4388g2.f21969j) {
                    int i12 = c4013h2.f20746N;
                    if (i12 == -1) {
                        f6 = c4388g2.f21966g;
                        f10 = c4013h2.f20745M;
                    } else if (i12 == 0) {
                        f11 = c4388g2.f21966g * c4013h2.f20745M;
                        i10 = (int) (f11 + 0.5f);
                        c4388g.mo9165d(i10);
                    } else if (i12 != 1) {
                        i10 = 0;
                        c4388g.mo9165d(i10);
                    } else {
                        f6 = c4388g2.f21966g;
                        f10 = c4013h2.f20745M;
                    }
                    f11 = f6 / f10;
                    i10 = (int) (f11 + 0.5f);
                    c4388g.mo9165d(i10);
                }
            }
        }
        C4387f c4387f = this.f21988h;
        boolean z6 = c4387f.f21962c;
        ArrayList arrayList = c4387f.f21971l;
        if (z6) {
            C4387f c4387f2 = this.f21989i;
            boolean z10 = c4387f2.f21962c;
            ArrayList arrayList2 = c4387f2.f21971l;
            if (z10) {
                if (c4387f.f21969j && c4387f2.f21969j && c4388g.f21969j) {
                    return;
                }
                if (!c4388g.f21969j && this.f21984d == EnumC4012g.MATCH_CONSTRAINT) {
                    C4013h c4013h4 = this.f21982b;
                    if (c4013h4.f20768j == 0 && !c4013h4.m8806p()) {
                        C4387f c4387f3 = (C4387f) arrayList.get(0);
                        C4387f c4387f4 = (C4387f) arrayList2.get(0);
                        int i13 = c4387f3.f21966g + c4387f.f21965f;
                        int i14 = c4387f4.f21966g + c4387f2.f21965f;
                        c4387f.mo9165d(i13);
                        c4387f2.mo9165d(i14);
                        c4388g.mo9165d(i14 - i13);
                        return;
                    }
                }
                if (!c4388g.f21969j && this.f21984d == EnumC4012g.MATCH_CONSTRAINT && this.f21981a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C4387f c4387f5 = (C4387f) arrayList.get(0);
                    int i15 = (((C4387f) arrayList2.get(0)).f21966g + c4387f2.f21965f) - (c4387f5.f21966g + c4387f.f21965f);
                    int i16 = c4388g.f21972m;
                    if (i15 < i16) {
                        c4388g.mo9165d(i15);
                    } else {
                        c4388g.mo9165d(i16);
                    }
                }
                if (c4388g.f21969j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C4387f c4387f6 = (C4387f) arrayList.get(0);
                    C4387f c4387f7 = (C4387f) arrayList2.get(0);
                    int i17 = c4387f6.f21966g;
                    int i18 = c4387f.f21965f + i17;
                    int i19 = c4387f7.f21966g;
                    int i20 = c4387f2.f21965f + i19;
                    float f12 = this.f21982b.f20753U;
                    if (c4387f6 == c4387f7) {
                        f12 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c4387f.mo9165d((int) ((((i19 - i17) - c4388g.f21966g) * f12) + i17 + 0.5f));
                    c4387f2.mo9165d(c4387f.f21966g + c4388g.f21966g);
                }
            }
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: d */
    public final void mo9156d() {
        C4013h c4013h;
        C4013h c4013h2;
        C4013h c4013h3;
        C4013h c4013h4;
        C4387f c4387f = this.f21978k;
        C4013h c4013h5 = this.f21982b;
        boolean z6 = c4013h5.f20759a;
        C4388g c4388g = this.f21985e;
        if (z6) {
            c4388g.mo9165d(c4013h5.m8797g());
        }
        boolean z10 = c4388g.f21969j;
        ArrayList arrayList = c4388g.f21970k;
        ArrayList arrayList2 = c4388g.f21971l;
        C4387f c4387f2 = this.f21989i;
        C4387f c4387f3 = this.f21988h;
        if (!z10) {
            C4013h c4013h6 = this.f21982b;
            this.f21984d = c4013h6.f20741I[1];
            if (c4013h6.f20781w) {
                this.f21979l = new C4382a(this);
            }
            EnumC4012g enumC4012g = this.f21984d;
            if (enumC4012g != EnumC4012g.MATCH_CONSTRAINT) {
                if (enumC4012g == EnumC4012g.MATCH_PARENT && (c4013h4 = this.f21982b.f20742J) != null) {
                    C4395n c4395n = c4013h4.f20763e;
                    if (c4013h4.f20741I[1] == EnumC4012g.FIXED) {
                        int iM8797g = (c4013h4.m8797g() - this.f21982b.f20783y.m8788b()) - this.f21982b.f20733A.m8788b();
                        AbstractC4398q.m9173b(c4387f3, c4395n.f21988h, this.f21982b.f20783y.m8788b());
                        AbstractC4398q.m9173b(c4387f2, c4395n.f21989i, -this.f21982b.f20733A.m8788b());
                        c4388g.mo9165d(iM8797g);
                        return;
                    }
                }
                if (enumC4012g == EnumC4012g.FIXED) {
                    c4388g.mo9165d(this.f21982b.m8797g());
                }
            }
        } else if (this.f21984d == EnumC4012g.MATCH_PARENT && (c4013h2 = (c4013h = this.f21982b).f20742J) != null) {
            C4395n c4395n2 = c4013h2.f20763e;
            if (c4013h2.f20741I[1] == EnumC4012g.FIXED) {
                AbstractC4398q.m9173b(c4387f3, c4395n2.f21988h, c4013h.f20783y.m8788b());
                AbstractC4398q.m9173b(c4387f2, c4395n2.f21989i, -this.f21982b.f20733A.m8788b());
                return;
            }
        }
        boolean z11 = c4388g.f21969j;
        if (z11) {
            C4013h c4013h7 = this.f21982b;
            if (c4013h7.f20759a) {
                C4010e[] c4010eArr = c4013h7.f20738F;
                C4010e c4010e = c4010eArr[2];
                C4010e c4010e2 = c4010e.f20727d;
                if (c4010e2 != null && c4010eArr[3].f20727d != null) {
                    if (c4013h7.m8806p()) {
                        c4387f3.f21965f = this.f21982b.f20738F[2].m8788b();
                        c4387f2.f21965f = -this.f21982b.f20738F[3].m8788b();
                    } else {
                        C4387f c4387fM9174h = AbstractC4398q.m9174h(this.f21982b.f20738F[2]);
                        if (c4387fM9174h != null) {
                            AbstractC4398q.m9173b(c4387f3, c4387fM9174h, this.f21982b.f20738F[2].m8788b());
                        }
                        C4387f c4387fM9174h2 = AbstractC4398q.m9174h(this.f21982b.f20738F[3]);
                        if (c4387fM9174h2 != null) {
                            AbstractC4398q.m9173b(c4387f2, c4387fM9174h2, -this.f21982b.f20738F[3].m8788b());
                        }
                        c4387f3.f21961b = true;
                        c4387f2.f21961b = true;
                    }
                    C4013h c4013h8 = this.f21982b;
                    if (c4013h8.f20781w) {
                        AbstractC4398q.m9173b(c4387f, c4387f3, c4013h8.f20749Q);
                        return;
                    }
                    return;
                }
                if (c4010e2 != null) {
                    C4387f c4387fM9174h3 = AbstractC4398q.m9174h(c4010e);
                    if (c4387fM9174h3 != null) {
                        AbstractC4398q.m9173b(c4387f3, c4387fM9174h3, this.f21982b.f20738F[2].m8788b());
                        AbstractC4398q.m9173b(c4387f2, c4387f3, c4388g.f21966g);
                        C4013h c4013h9 = this.f21982b;
                        if (c4013h9.f20781w) {
                            AbstractC4398q.m9173b(c4387f, c4387f3, c4013h9.f20749Q);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C4010e c4010e3 = c4010eArr[3];
                if (c4010e3.f20727d != null) {
                    C4387f c4387fM9174h4 = AbstractC4398q.m9174h(c4010e3);
                    if (c4387fM9174h4 != null) {
                        AbstractC4398q.m9173b(c4387f2, c4387fM9174h4, -this.f21982b.f20738F[3].m8788b());
                        AbstractC4398q.m9173b(c4387f3, c4387f2, -c4388g.f21966g);
                    }
                    C4013h c4013h10 = this.f21982b;
                    if (c4013h10.f20781w) {
                        AbstractC4398q.m9173b(c4387f, c4387f3, c4013h10.f20749Q);
                        return;
                    }
                    return;
                }
                C4010e c4010e4 = c4010eArr[4];
                if (c4010e4.f20727d != null) {
                    C4387f c4387fM9174h5 = AbstractC4398q.m9174h(c4010e4);
                    if (c4387fM9174h5 != null) {
                        AbstractC4398q.m9173b(c4387f, c4387fM9174h5, 0);
                        AbstractC4398q.m9173b(c4387f3, c4387f, -this.f21982b.f20749Q);
                        AbstractC4398q.m9173b(c4387f2, c4387f3, c4388g.f21966g);
                        return;
                    }
                    return;
                }
                if ((c4013h7 instanceof C4006a) || c4013h7.f20742J == null || c4013h7.mo8795e(EnumC4009d.CENTER).f20727d != null) {
                    return;
                }
                C4013h c4013h11 = this.f21982b;
                AbstractC4398q.m9173b(c4387f3, c4013h11.f20742J.f20763e.f21988h, c4013h11.m8802l());
                AbstractC4398q.m9173b(c4387f2, c4387f3, c4388g.f21966g);
                C4013h c4013h12 = this.f21982b;
                if (c4013h12.f20781w) {
                    AbstractC4398q.m9173b(c4387f, c4387f3, c4013h12.f20749Q);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f21984d != EnumC4012g.MATCH_CONSTRAINT) {
            c4388g.m9163b(this);
        } else {
            C4013h c4013h13 = this.f21982b;
            int i10 = c4013h13.f20769k;
            if (i10 == 2) {
                C4013h c4013h14 = c4013h13.f20742J;
                if (c4013h14 != null) {
                    C4388g c4388g2 = c4013h14.f20763e.f21985e;
                    arrayList2.add(c4388g2);
                    c4388g2.f21970k.add(c4388g);
                    c4388g.f21961b = true;
                    arrayList.add(c4387f3);
                    arrayList.add(c4387f2);
                }
            } else if (i10 == 3 && !c4013h13.m8806p()) {
                C4013h c4013h15 = this.f21982b;
                if (c4013h15.f20768j != 3) {
                    C4388g c4388g3 = c4013h15.f20762d.f21985e;
                    arrayList2.add(c4388g3);
                    c4388g3.f21970k.add(c4388g);
                    c4388g.f21961b = true;
                    arrayList.add(c4387f3);
                    arrayList.add(c4387f2);
                }
            }
        }
        C4013h c4013h16 = this.f21982b;
        C4010e[] c4010eArr2 = c4013h16.f20738F;
        C4010e c4010e5 = c4010eArr2[2];
        C4010e c4010e6 = c4010e5.f20727d;
        if (c4010e6 != null && c4010eArr2[3].f20727d != null) {
            if (c4013h16.m8806p()) {
                c4387f3.f21965f = this.f21982b.f20738F[2].m8788b();
                c4387f2.f21965f = -this.f21982b.f20738F[3].m8788b();
            } else {
                C4387f c4387fM9174h6 = AbstractC4398q.m9174h(this.f21982b.f20738F[2]);
                C4387f c4387fM9174h7 = AbstractC4398q.m9174h(this.f21982b.f20738F[3]);
                c4387fM9174h6.m9163b(this);
                c4387fM9174h7.m9163b(this);
                this.f21990j = EnumC4397p.CENTER;
            }
            if (this.f21982b.f20781w) {
                m9176c(c4387f, c4387f3, 1, this.f21979l);
            }
        } else if (c4010e6 != null) {
            C4387f c4387fM9174h8 = AbstractC4398q.m9174h(c4010e5);
            if (c4387fM9174h8 != null) {
                AbstractC4398q.m9173b(c4387f3, c4387fM9174h8, this.f21982b.f20738F[2].m8788b());
                m9176c(c4387f2, c4387f3, 1, c4388g);
                if (this.f21982b.f20781w) {
                    m9176c(c4387f, c4387f3, 1, this.f21979l);
                }
                EnumC4012g enumC4012g2 = this.f21984d;
                EnumC4012g enumC4012g3 = EnumC4012g.MATCH_CONSTRAINT;
                if (enumC4012g2 == enumC4012g3) {
                    C4013h c4013h17 = this.f21982b;
                    if (c4013h17.f20745M > DefinitionKt.NO_Float_VALUE) {
                        C4392k c4392k = c4013h17.f20762d;
                        if (c4392k.f21984d == enumC4012g3) {
                            c4392k.f21985e.f21970k.add(c4388g);
                            arrayList2.add(this.f21982b.f20762d.f21985e);
                            c4388g.f21960a = this;
                        }
                    }
                }
            }
        } else {
            C4010e c4010e7 = c4010eArr2[3];
            if (c4010e7.f20727d != null) {
                C4387f c4387fM9174h9 = AbstractC4398q.m9174h(c4010e7);
                if (c4387fM9174h9 != null) {
                    AbstractC4398q.m9173b(c4387f2, c4387fM9174h9, -this.f21982b.f20738F[3].m8788b());
                    m9176c(c4387f3, c4387f2, -1, c4388g);
                    if (this.f21982b.f20781w) {
                        m9176c(c4387f, c4387f3, 1, this.f21979l);
                    }
                }
            } else {
                C4010e c4010e8 = c4010eArr2[4];
                if (c4010e8.f20727d != null) {
                    C4387f c4387fM9174h10 = AbstractC4398q.m9174h(c4010e8);
                    if (c4387fM9174h10 != null) {
                        AbstractC4398q.m9173b(c4387f, c4387fM9174h10, 0);
                        m9176c(c4387f3, c4387f, -1, this.f21979l);
                        m9176c(c4387f2, c4387f3, 1, c4388g);
                    }
                } else if (!(c4013h16 instanceof C4006a) && (c4013h3 = c4013h16.f20742J) != null) {
                    AbstractC4398q.m9173b(c4387f3, c4013h3.f20763e.f21988h, c4013h16.m8802l());
                    m9176c(c4387f2, c4387f3, 1, c4388g);
                    if (this.f21982b.f20781w) {
                        m9176c(c4387f, c4387f3, 1, this.f21979l);
                    }
                    EnumC4012g enumC4012g4 = this.f21984d;
                    EnumC4012g enumC4012g5 = EnumC4012g.MATCH_CONSTRAINT;
                    if (enumC4012g4 == enumC4012g5) {
                        C4013h c4013h18 = this.f21982b;
                        if (c4013h18.f20745M > DefinitionKt.NO_Float_VALUE) {
                            C4392k c4392k2 = c4013h18.f20762d;
                            if (c4392k2.f21984d == enumC4012g5) {
                                c4392k2.f21985e.f21970k.add(c4388g);
                                arrayList2.add(this.f21982b.f20762d.f21985e);
                                c4388g.f21960a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c4388g.f21962c = true;
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: e */
    public final void mo9157e() {
        C4387f c4387f = this.f21988h;
        if (c4387f.f21969j) {
            this.f21982b.f20748P = c4387f.f21966g;
        }
    }

    @Override // l5.AbstractC4398q
    /* renamed from: f */
    public final void mo9158f() {
        this.f21983c = null;
        this.f21988h.m9164c();
        this.f21989i.m9164c();
        this.f21978k.m9164c();
        this.f21985e.m9164c();
        this.f21987g = false;
    }

    @Override // l5.AbstractC4398q
    /* renamed from: k */
    public final boolean mo9160k() {
        return this.f21984d != EnumC4012g.MATCH_CONSTRAINT || this.f21982b.f20769k == 0;
    }

    /* renamed from: m */
    public final void m9172m() {
        this.f21987g = false;
        C4387f c4387f = this.f21988h;
        c4387f.m9164c();
        c4387f.f21969j = false;
        C4387f c4387f2 = this.f21989i;
        c4387f2.m9164c();
        c4387f2.f21969j = false;
        C4387f c4387f3 = this.f21978k;
        c4387f3.m9164c();
        c4387f3.f21969j = false;
        this.f21985e.f21969j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f21982b.f20756X;
    }
}
