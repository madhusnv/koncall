package k2;

import kotlin.jvm.internal.AbstractC4154l;
import tx.C7263w;
import tx.InterfaceC7266z;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 implements InterfaceC7266z, r1 {

    /* renamed from: e */
    public static final C3957f f20552e = new C3957f();

    /* renamed from: a */
    public final InterfaceC7564h f20553a;

    /* renamed from: b */
    public final InterfaceC7564h f20554b;

    /* renamed from: c */
    public final t1 f20555c = this;

    /* renamed from: d */
    public volatile InterfaceC7564h f20556d;

    public t1(InterfaceC7564h interfaceC7564h, InterfaceC7564h interfaceC7564h2) {
        this.f20553a = interfaceC7564h;
        this.f20554b = interfaceC7564h2;
    }

    /* renamed from: a */
    public final void m8657a() {
        synchronized (this.f20555c) {
            try {
                InterfaceC7564h interfaceC7564h = this.f20556d;
                if (interfaceC7564h == null) {
                    this.f20556d = f20552e;
                } else {
                    tx.c0.m13486i(interfaceC7564h, new h0(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        m8657a();
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        m8657a();
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        InterfaceC7564h interfaceC7564hT0;
        InterfaceC7564h interfaceC7564h = this.f20556d;
        if (interfaceC7564h == null || interfaceC7564h == f20552e) {
            synchronized (this.f20555c) {
                try {
                    interfaceC7564hT0 = this.f20556d;
                    if (interfaceC7564hT0 == null) {
                        InterfaceC7564h interfaceC7564h2 = this.f20553a;
                        interfaceC7564hT0 = interfaceC7564h2.t0(new tx.f1((tx.e1) interfaceC7564h2.o0(C7263w.f34689b))).t0(this.f20554b);
                    } else if (interfaceC7564hT0 == f20552e) {
                        InterfaceC7564h interfaceC7564h3 = this.f20553a;
                        tx.f1 f1Var = new tx.f1((tx.e1) interfaceC7564h3.o0(C7263w.f34689b));
                        f1Var.mo13566p(new h0(0));
                        interfaceC7564hT0 = interfaceC7564h3.t0(f1Var).t0(this.f20554b);
                    }
                    this.f20556d = interfaceC7564hT0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            interfaceC7564h = interfaceC7564hT0;
        }
        AbstractC4154l.m8920c(interfaceC7564h);
        return interfaceC7564h;
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
    }
}
