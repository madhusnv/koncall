package l5;

import k5.C4010e;
import k5.C4013h;
import k5.EnumC4012g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l5.q */
/* loaded from: classes.dex */
public abstract class AbstractC4398q implements InterfaceC4385d {

    /* renamed from: a */
    public int f21981a;

    /* renamed from: b */
    public C4013h f21982b;

    /* renamed from: c */
    public C4393l f21983c;

    /* renamed from: d */
    public EnumC4012g f21984d;

    /* renamed from: e */
    public final C4388g f21985e = new C4388g(this);

    /* renamed from: f */
    public int f21986f = 0;

    /* renamed from: g */
    public boolean f21987g = false;

    /* renamed from: h */
    public final C4387f f21988h = new C4387f(this);

    /* renamed from: i */
    public final C4387f f21989i = new C4387f(this);

    /* renamed from: j */
    public EnumC4397p f21990j = EnumC4397p.NONE;

    public AbstractC4398q(C4013h c4013h) {
        this.f21982b = c4013h;
    }

    /* renamed from: b */
    public static void m9173b(C4387f c4387f, C4387f c4387f2, int i10) {
        c4387f.f21971l.add(c4387f2);
        c4387f.f21965f = i10;
        c4387f2.f21970k.add(c4387f);
    }

    /* renamed from: h */
    public static C4387f m9174h(C4010e c4010e) {
        C4010e c4010e2 = c4010e.f20727d;
        if (c4010e2 == null) {
            return null;
        }
        C4013h c4013h = c4010e2.f20725b;
        C4392k c4392k = c4013h.f20762d;
        C4395n c4395n = c4013h.f20763e;
        int i10 = AbstractC4396o.f21980a[c4010e2.f20726c.ordinal()];
        if (i10 == 1) {
            return c4392k.f21988h;
        }
        if (i10 == 2) {
            return c4392k.f21989i;
        }
        if (i10 == 3) {
            return c4395n.f21988h;
        }
        if (i10 == 4) {
            return c4395n.f21978k;
        }
        if (i10 != 5) {
            return null;
        }
        return c4395n.f21989i;
    }

    /* renamed from: i */
    public static C4387f m9175i(C4010e c4010e, int i10) {
        C4010e c4010e2 = c4010e.f20727d;
        if (c4010e2 == null) {
            return null;
        }
        C4013h c4013h = c4010e2.f20725b;
        AbstractC4398q abstractC4398q = i10 == 0 ? c4013h.f20762d : c4013h.f20763e;
        int i11 = AbstractC4396o.f21980a[c4010e2.f20726c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return abstractC4398q.f21989i;
        }
        return abstractC4398q.f21988h;
    }

    /* renamed from: c */
    public final void m9176c(C4387f c4387f, C4387f c4387f2, int i10, C4388g c4388g) {
        c4387f.f21971l.add(c4387f2);
        c4387f.f21971l.add(this.f21985e);
        c4387f.f21967h = i10;
        c4387f.f21968i = c4388g;
        c4387f2.f21970k.add(c4387f);
        c4388g.f21970k.add(c4387f);
    }

    /* renamed from: d */
    public abstract void mo9156d();

    /* renamed from: e */
    public abstract void mo9157e();

    /* renamed from: f */
    public abstract void mo9158f();

    /* renamed from: g */
    public final int m9177g(int i10, int i11) {
        if (i11 == 0) {
            C4013h c4013h = this.f21982b;
            int i12 = c4013h.f20772n;
            int iMax = Math.max(c4013h.f20771m, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            C4013h c4013h2 = this.f21982b;
            int i13 = c4013h2.f20775q;
            int iMax2 = Math.max(c4013h2.f20774p, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    /* renamed from: j */
    public long mo9159j() {
        if (this.f21985e.f21969j) {
            return r0.f21966g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo9160k();

    /* renamed from: l */
    public final void m9178l(C4010e c4010e, C4010e c4010e2, int i10) {
        C4387f c4387fM9174h = m9174h(c4010e);
        C4387f c4387fM9174h2 = m9174h(c4010e2);
        if (c4387fM9174h.f21969j && c4387fM9174h2.f21969j) {
            int iM8788b = c4010e.m8788b() + c4387fM9174h.f21966g;
            int iM8788b2 = c4387fM9174h2.f21966g - c4010e2.m8788b();
            int i11 = iM8788b2 - iM8788b;
            C4388g c4388g = this.f21985e;
            if (!c4388g.f21969j) {
                EnumC4012g enumC4012g = this.f21984d;
                EnumC4012g enumC4012g2 = EnumC4012g.MATCH_CONSTRAINT;
                if (enumC4012g == enumC4012g2) {
                    int i12 = this.f21981a;
                    if (i12 == 0) {
                        c4388g.mo9165d(m9177g(i11, i10));
                    } else if (i12 == 1) {
                        c4388g.mo9165d(Math.min(m9177g(c4388g.f21972m, i10), i11));
                    } else if (i12 == 2) {
                        C4013h c4013h = this.f21982b;
                        C4013h c4013h2 = c4013h.f20742J;
                        if (c4013h2 != null) {
                            if ((i10 == 0 ? c4013h2.f20762d : c4013h2.f20763e).f21985e.f21969j) {
                                c4388g.mo9165d(m9177g((int) ((r6.f21966g * (i10 == 0 ? c4013h.f20773o : c4013h.f20776r)) + 0.5f), i10));
                            }
                        }
                    } else if (i12 == 3) {
                        C4013h c4013h3 = this.f21982b;
                        AbstractC4398q abstractC4398q = c4013h3.f20762d;
                        AbstractC4398q abstractC4398q2 = c4013h3.f20763e;
                        if (abstractC4398q.f21984d != enumC4012g2 || abstractC4398q.f21981a != 3 || abstractC4398q2.f21984d != enumC4012g2 || abstractC4398q2.f21981a != 3) {
                            if (i10 == 0) {
                                abstractC4398q = abstractC4398q2;
                            }
                            if (abstractC4398q.f21985e.f21969j) {
                                float f6 = c4013h3.f20745M;
                                c4388g.mo9165d(i10 == 1 ? (int) ((r6.f21966g / f6) + 0.5f) : (int) ((f6 * r6.f21966g) + 0.5f));
                            }
                        }
                    }
                }
            }
            if (c4388g.f21969j) {
                int i13 = c4388g.f21966g;
                C4387f c4387f = this.f21989i;
                C4387f c4387f2 = this.f21988h;
                if (i13 == i11) {
                    c4387f2.mo9165d(iM8788b);
                    c4387f.mo9165d(iM8788b2);
                    return;
                }
                C4013h c4013h4 = this.f21982b;
                float f10 = i10 == 0 ? c4013h4.f20752T : c4013h4.f20753U;
                if (c4387fM9174h == c4387fM9174h2) {
                    iM8788b = c4387fM9174h.f21966g;
                    iM8788b2 = c4387fM9174h2.f21966g;
                    f10 = 0.5f;
                }
                c4387f2.mo9165d((int) ((((iM8788b2 - iM8788b) - i13) * f10) + iM8788b + 0.5f));
                c4387f.mo9165d(c4387f2.f21966g + c4388g.f21966g);
            }
        }
    }
}
