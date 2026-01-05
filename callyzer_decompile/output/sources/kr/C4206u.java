package kr;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.Iterator;
import k2.w0;
import k9.C4032f;
import or.C5454q;
import ps.AbstractC6007g;
import sw.C6957a;
import tx.InterfaceC7266z;
import tx.c0;
import u2.C7320q;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kr.u */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4206u implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f21314a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f21315b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f21316c;

    /* renamed from: d */
    public final /* synthetic */ w0 f21317d;

    /* renamed from: e */
    public final /* synthetic */ Object f21318e;

    /* renamed from: f */
    public final /* synthetic */ Object f21319f;

    public /* synthetic */ C4206u(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, w0 w0Var, C7320q c7320q, boolean z6) {
        this.f21315b = z6;
        this.f21318e = c7320q;
        this.f21316c = interfaceC2139c;
        this.f21317d = w0Var;
        this.f21319f = interfaceC2139c2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        boolean z6;
        C6957a c6957a;
        switch (this.f21314a) {
            case 0:
                C7320q c7320q = (C7320q) this.f21318e;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f21319f;
                if (this.f21315b) {
                    if (c7320q == null || !c7320q.isEmpty()) {
                        Iterator it = c7320q.iterator();
                        do {
                            c6957a = (C6957a) it;
                            if (c6957a.hasNext()) {
                            }
                        } while (!((C5454q) c6957a.next()).f27493c);
                        z6 = false;
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    this.f21316c.invoke(Boolean.FALSE);
                }
                this.f21317d.setValue(Boolean.valueOf(z6));
                interfaceC2139c.invoke(c7320q);
                break;
            default:
                String str = ((AbstractC6007g) this.f21318e).f29356a;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f21319f;
                if (!this.f21315b) {
                    this.f21316c.invoke(str);
                }
                if (str.equals("more")) {
                    c0.m13502y(interfaceC7266z, null, null, new C4032f(this.f21317d, (InterfaceC7559c) null, 26), 3);
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C4206u(boolean z6, InterfaceC2139c interfaceC2139c, AbstractC6007g abstractC6007g, InterfaceC7266z interfaceC7266z, w0 w0Var) {
        this.f21315b = z6;
        this.f21316c = interfaceC2139c;
        this.f21318e = abstractC6007g;
        this.f21319f = interfaceC7266z;
        this.f21317d = w0Var;
    }
}
