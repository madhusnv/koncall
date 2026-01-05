package q1;

import aw.C0480t;
import d4.C1574b;
import k1.q1;
import k1.x0;
import og.fg;
import s1.o0;
import t1.AbstractC7000y;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.d */
/* loaded from: classes.dex */
public final class C6076d implements o0 {

    /* renamed from: a */
    public final /* synthetic */ int f29643a;

    /* renamed from: b */
    public final /* synthetic */ boolean f29644b;

    /* renamed from: c */
    public final /* synthetic */ q1 f29645c;

    public /* synthetic */ C6076d(q1 q1Var, boolean z6, int i10) {
        this.f29643a = i10;
        this.f29645c = q1Var;
        this.f29644b = z6;
    }

    @Override // s1.o0
    /* renamed from: a */
    public final int mo12083a() {
        switch (this.f29643a) {
            case 0:
                C6097y c6097y = (C6097y) this.f29645c;
                return (int) (c6097y.m12134h().f29730o == x0.Vertical ? c6097y.m12134h().m12112f() & 4294967295L : c6097y.m12134h().m12112f() >> 32);
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f29645c;
                return (int) (abstractC7000y.m13264k().f33855e == x0.Vertical ? abstractC7000y.m13264k().m13256f() & 4294967295L : abstractC7000y.m13264k().m13256f() >> 32);
        }
    }

    @Override // s1.o0
    /* renamed from: b */
    public final float mo12084b() {
        switch (this.f29643a) {
            case 0:
                C6097y c6097y = (C6097y) this.f29645c;
                return (c6097y.f29773d.f29752b.m8526f() * 500) + c6097y.f29773d.f29753c.m8526f();
            default:
                return fg.m10655a((AbstractC7000y) this.f29645c);
        }
    }

    @Override // s1.o0
    /* renamed from: c */
    public final int mo12085c() {
        int i10;
        int i11;
        switch (this.f29643a) {
            case 0:
                C6097y c6097y = (C6097y) this.f29645c;
                i10 = -c6097y.m12134h().f29727l;
                i11 = c6097y.m12134h().f29731p;
                break;
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f29645c;
                i10 = -abstractC7000y.m13264k().f33856f;
                i11 = abstractC7000y.m13264k().f33854d;
                break;
        }
        return i10 + i11;
    }

    @Override // s1.o0
    /* renamed from: d */
    public final float mo12086d() {
        switch (this.f29643a) {
            case 0:
                C6097y c6097y = (C6097y) this.f29645c;
                int iM8526f = c6097y.f29773d.f29752b.m8526f();
                int iM8526f2 = c6097y.f29773d.f29753c.m8526f();
                return c6097y.mo7523d() ? (iM8526f * 500) + iM8526f2 + 100 : (iM8526f * 500) + iM8526f2;
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f29645c;
                return t1.b0.m13250a(abstractC7000y.m13264k(), abstractC7000y.mo13252l());
        }
    }

    @Override // s1.o0
    /* renamed from: e */
    public final C1574b mo12087e() {
        switch (this.f29643a) {
            case 0:
                return this.f29644b ? new C1574b(-1, 1) : new C1574b(1, -1);
            default:
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f29645c;
                return this.f29644b ? new C1574b(abstractC7000y.mo13252l(), 1) : new C1574b(1, abstractC7000y.mo13252l());
        }
    }

    @Override // s1.o0
    /* renamed from: f */
    public final Object mo12088f(int i10, C0480t c0480t) {
        switch (this.f29643a) {
            case 0:
                Object objM12132j = C6097y.m12132j((C6097y) this.f29645c, i10, c0480t);
                if (objM12132j != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objM13259s = AbstractC7000y.m13259s((AbstractC7000y) this.f29645c, i10, c0480t);
                if (objM13259s != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
