package t2;

import b2.C0566x;
import c9.C0917l;
import e1.j0;
import e1.r0;
import ex.InterfaceC2139c;
import java.util.Map;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i2;
import k2.s0;
import qw.a0;
import s1.C6725t;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.e */
/* loaded from: classes.dex */
public final class C7006e implements InterfaceC7003b {

    /* renamed from: e */
    public static final C0917l f33937e;

    /* renamed from: a */
    public final Map f33938a;

    /* renamed from: b */
    public final j0 f33939b;

    /* renamed from: c */
    public InterfaceC7009h f33940c;

    /* renamed from: d */
    public final C6725t f33941d;

    static {
        C7004c c7004c = C7004c.f33931b;
        C7005d c7005d = C7005d.f33934b;
        C0917l c0917l = AbstractC7013l.f33949a;
        f33937e = new C0917l(16, c7004c, c7005d);
    }

    public C7006e(Map map) {
        this.f33938a = map;
        long[] jArr = r0.f9045a;
        this.f33939b = new j0();
        this.f33941d = new C6725t(5, this);
    }

    @Override // t2.InterfaceC7003b
    /* renamed from: a */
    public final void mo12855a(Object obj, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-1198538093);
        c3966o.b0(obj);
        Object objM8596M = c3966o.m8596M();
        s0 s0Var = C3961j.f20408a;
        if (objM8596M == s0Var) {
            C6725t c6725t = this.f33941d;
            if (!((Boolean) c6725t.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f33938a.get(obj);
            i2 i2Var = AbstractC7011j.f33948a;
            C7010i c7010i = new C7010i(map, c6725t);
            c3966o.j0(c7010i);
            objM8596M = c7010i;
        }
        InterfaceC7009h interfaceC7009h = (InterfaceC7009h) objM8596M;
        C3953b.m8498a(AbstractC7011j.f33948a.mo8541a(interfaceC7009h), c6734c, c3966o, (i10 & 112) | 8);
        boolean zM8616i = c3966o.m8616i(this) | c3966o.m8616i(obj) | c3966o.m8616i(interfaceC7009h);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8616i || objM8596M2 == s0Var) {
            objM8596M2 = new C0566x(18, this, obj, interfaceC7009h);
            c3966o.j0(objM8596M2);
        }
        C3953b.m8500c(a0.f30746a, (InterfaceC2139c) objM8596M2, c3966o);
        if (c3966o.f20487x && c3966o.f20452F.f20585i == c3966o.f20488y) {
            c3966o.f20488y = -1;
            c3966o.f20487x = false;
        }
        c3966o.m8623p(false);
        c3966o.m8623p(false);
    }

    @Override // t2.InterfaceC7003b
    /* renamed from: f */
    public final void mo12860f(Object obj) {
        if (this.f33939b.m5577j(obj) == null) {
            this.f33938a.remove(obj);
        }
    }
}
