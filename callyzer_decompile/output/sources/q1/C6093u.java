package q1;

import gx.AbstractC2747a;
import k1.d1;
import k1.q1;
import k2.a1;
import og.fg;
import og.tc;
import pg.w9;
import rw.AbstractC6663m;
import t1.AbstractC7000y;
import t1.C6982g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.u */
/* loaded from: classes.dex */
public final class C6093u implements d1 {

    /* renamed from: a */
    public final /* synthetic */ int f29757a;

    /* renamed from: b */
    public final /* synthetic */ d1 f29758b;

    /* renamed from: c */
    public final /* synthetic */ q1 f29759c;

    public /* synthetic */ C6093u(d1 d1Var, q1 q1Var, int i10) {
        this.f29757a = i10;
        this.f29759c = q1Var;
        this.f29758b = d1Var;
    }

    @Override // k1.d1
    /* renamed from: a */
    public final float mo8445a(float f6) {
        switch (this.f29757a) {
        }
        return this.f29758b.mo8445a(f6);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* renamed from: b */
    public final int m12126b(int i10) {
        Object obj;
        switch (this.f29757a) {
            case 0:
                C6090r c6090rM12134h = ((C6097y) this.f29759c).m12134h();
                if (c6090rM12134h.f29726k.isEmpty()) {
                    return 0;
                }
                int iM12127c = m12127c();
                if (i10 > m12129e() || iM12127c > i10) {
                    return ((i10 - m12127c()) * tc.m10932a(c6090rM12134h)) - m12128d();
                }
                ?? r02 = c6090rM12134h.f29726k;
                int size = r02.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        obj = r02.get(i11);
                        if (((C6091s) obj).f29733a != i10) {
                            i11++;
                        }
                    } else {
                        obj = null;
                    }
                }
                C6091s c6091s = (C6091s) obj;
                if (c6091s != null) {
                    return c6091s.f29744l;
                }
                return 0;
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f29759c;
                return (int) (w9.m11913d(fg.m10655a(abstractC7000y) + AbstractC2747a.m6747k(((abstractC7000y.m13266n() * (i10 - abstractC7000y.m13263j())) - (((a1) abstractC7000y.f33901d.f39d).m8490f() * abstractC7000y.m13266n())) + 0), abstractC7000y.f33905h, abstractC7000y.f33904g) - fg.m10655a(abstractC7000y));
        }
    }

    /* renamed from: c */
    public final int m12127c() {
        switch (this.f29757a) {
            case 0:
                return ((C6097y) this.f29759c).f29773d.f29752b.m8526f();
            default:
                return ((AbstractC7000y) this.f29759c).f33902e;
        }
    }

    /* renamed from: d */
    public final int m12128d() {
        switch (this.f29757a) {
            case 0:
                return ((C6097y) this.f29759c).f29773d.f29753c.m8526f();
            default:
                return ((AbstractC7000y) this.f29759c).f33903f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* renamed from: e */
    public final int m12129e() {
        switch (this.f29757a) {
            case 0:
                C6091s c6091s = (C6091s) AbstractC6663m.m12751O(((C6097y) this.f29759c).m12134h().f29726k);
                if (c6091s != null) {
                    return c6091s.f29733a;
                }
                return 0;
            default:
                return ((C6982g) AbstractC6663m.m12750N(((AbstractC7000y) this.f29759c).m13264k().f33851a)).f33789a;
        }
    }

    /* renamed from: f */
    public final void m12130f(int i10) {
        switch (this.f29757a) {
            case 0:
                ((C6097y) this.f29759c).m12136k(i10);
                break;
            default:
                ((AbstractC7000y) this.f29759c).m13270t(i10, 0 / r1.m13266n(), true);
                break;
        }
    }
}
