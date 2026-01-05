package r1;

import aw.C0480t;
import d4.C1574b;
import k1.x0;
import s1.o0;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements o0 {

    /* renamed from: a */
    public final /* synthetic */ C6440y f30949a;

    public a0(C6440y c6440y) {
        this.f30949a = c6440y;
    }

    @Override // s1.o0
    /* renamed from: a */
    public final int mo12083a() {
        C6440y c6440y = this.f30949a;
        return (int) (c6440y.m12434g().f31034p == x0.Vertical ? c6440y.m12434g().m12428f() & 4294967295L : c6440y.m12434g().m12428f() >> 32);
    }

    @Override // s1.o0
    /* renamed from: b */
    public final float mo12084b() {
        C6440y c6440y = this.f30949a;
        return (c6440y.f31077d.f29752b.m8526f() * 500) + c6440y.f31077d.f29753c.m8526f();
    }

    @Override // s1.o0
    /* renamed from: c */
    public final int mo12085c() {
        C6440y c6440y = this.f30949a;
        return (-c6440y.m12434g().f31031m) + c6440y.m12434g().f31035q;
    }

    @Override // s1.o0
    /* renamed from: d */
    public final float mo12086d() {
        C6440y c6440y = this.f30949a;
        int iM8526f = c6440y.f31077d.f29752b.m8526f();
        int iM8526f2 = c6440y.f31077d.f29753c.m8526f();
        return c6440y.mo7523d() ? (iM8526f * 500) + iM8526f2 + 100 : (iM8526f * 500) + iM8526f2;
    }

    @Override // s1.o0
    /* renamed from: e */
    public final C1574b mo12087e() {
        return new C1574b(-1, -1);
    }

    @Override // s1.o0
    /* renamed from: f */
    public final Object mo12088f(int i10, C0480t c0480t) {
        Object objM12432i = C6440y.m12432i(this.f30949a, i10, c0480t);
        return objM12432i == EnumC7794a.COROUTINE_SUSPENDED ? objM12432i : qw.a0.f30746a;
    }
}
