package a1;

import d7.g0;
import i0.m1;
import java.util.ArrayList;
import java.util.Objects;
import k2.a1;
import k2.b1;
import k4.C4001v;
import l0.AbstractC4308h;
import l0.C4304d;
import l0.RunnableC4302b;
import l0.RunnableC4307g;
import og.u1;
import pf.C5902b;
import pg.i7;
import pg.t8;
import qf.InterfaceC6204c;
import rf.C6496a;
import rf.C6500e;
import rf.C6511p;
import sf.InterfaceC6818d;
import t1.AbstractC7000y;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.f */
/* loaded from: classes.dex */
public final class C0007f implements m1, InterfaceC6818d {

    /* renamed from: a */
    public boolean f36a;

    /* renamed from: b */
    public final Object f37b;

    /* renamed from: c */
    public final Object f38c;

    /* renamed from: d */
    public Object f39d;

    /* renamed from: e */
    public Object f40e;

    /* renamed from: f */
    public Object f41f;

    public C0007f(C6500e c6500e, InterfaceC6204c interfaceC6204c, C6496a c6496a) {
        this.f41f = c6500e;
        this.f39d = null;
        this.f40e = null;
        this.f36a = false;
        this.f37b = interfaceC6204c;
        this.f38c = c6496a;
    }

    @Override // sf.InterfaceC6818d
    /* renamed from: a */
    public void mo85a(C5902b c5902b) {
        ((C6500e) this.f41f).f31236p.post(new RunnableC8956c(9, this, c5902b, false));
    }

    /* renamed from: b */
    public void m86b(EnumC0017p enumC0017p) {
        synchronized (this) {
            try {
                if (((EnumC0017p) this.f39d).equals(enumC0017p)) {
                    return;
                }
                this.f39d = enumC0017p;
                Objects.toString(enumC0017p);
                u1.m10942a("StreamStateObserver");
                ((g0) this.f38c).m5319i(enumC0017p);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public void m87c(C5902b c5902b) {
        C6511p c6511p = (C6511p) ((C6500e) this.f41f).f31232k.get((C6496a) this.f38c);
        if (c6511p != null) {
            c6511p.m12541p(c5902b);
        }
    }

    @Override // i0.m1
    public void onError(Throwable th2) {
        C4304d c4304d = (C4304d) this.f41f;
        if (c4304d != null) {
            c4304d.cancel(false);
            this.f41f = null;
        }
        m86b(EnumC0017p.IDLE);
    }

    @Override // i0.m1
    /* renamed from: q */
    public void mo88q(Object obj) {
        i0.f0 f0Var = (i0.f0) obj;
        if (f0Var == i0.f0.CLOSING || f0Var == i0.f0.CLOSED || f0Var == i0.f0.RELEASING || f0Var == i0.f0.RELEASED) {
            m86b(EnumC0017p.IDLE);
            if (this.f36a) {
                this.f36a = false;
                C4304d c4304d = (C4304d) this.f41f;
                if (c4304d != null) {
                    c4304d.cancel(false);
                    this.f41f = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((f0Var == i0.f0.OPENING || f0Var == i0.f0.OPEN || f0Var == i0.f0.PENDING_OPEN) && !this.f36a) {
            i0.e0 e0Var = (i0.e0) this.f37b;
            m86b(EnumC0017p.IDLE);
            ArrayList arrayList = new ArrayList();
            RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(C4304d.m9025b(i7.m11697b(new C0004c(this, e0Var, arrayList))), new C0003b(this), t8.m11872a());
            C0003b c0003b = new C0003b(this);
            RunnableC4302b runnableC4302bM9037g2 = AbstractC4308h.m9037g(runnableC4302bM9037g, new C4001v(2, c0003b), t8.m11872a());
            this.f41f = runnableC4302bM9037g2;
            int i10 = 0;
            C0005d c0005d = new C0005d(i10, this, arrayList, e0Var);
            runnableC4302bM9037g2.mo9026a(new RunnableC4307g(i10, runnableC4302bM9037g2, c0005d), t8.m11872a());
            this.f36a = true;
        }
    }

    public C0007f(int i10, float f6, AbstractC7000y abstractC7000y) {
        this.f37b = abstractC7000y;
        this.f38c = new b1(i10);
        this.f39d = new a1(f6);
        this.f41f = new s1.c0(i10, 30, 100);
    }

    public C0007f(i0.e0 e0Var, g0 g0Var, AbstractC0019r abstractC0019r) {
        this.f36a = false;
        this.f37b = e0Var;
        this.f38c = g0Var;
        this.f40e = abstractC0019r;
        synchronized (this) {
            this.f39d = (EnumC0017p) g0Var.mo5314d();
        }
    }
}
