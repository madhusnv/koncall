package eq;

import ap.C0388a;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0724d;
import d7.q0;
import d7.w0;
import ex.InterfaceC2141e;
import i7.C3178a;
import im.InterfaceC3307i;
import og.od;
import qw.a0;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.b */
/* loaded from: classes3.dex */
public final class C2090b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9778a;

    /* renamed from: b */
    public /* synthetic */ Object f9779b;

    /* renamed from: c */
    public final /* synthetic */ C2100l f9780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2090b(C2100l c2100l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9778a = i10;
        this.f9780c = c2100l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9778a) {
            case 0:
                C2090b c2090b = new C2090b(this.f9780c, interfaceC7559c, 0);
                c2090b.f9779b = obj;
                return c2090b;
            default:
                C2090b c2090b2 = new C2090b(this.f9780c, interfaceC7559c, 1);
                c2090b2.f9779b = obj;
                return c2090b2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9778a) {
            case 0:
                C2090b c2090b = (C2090b) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2090b.invokeSuspend(a0Var);
                return a0Var;
            default:
                C2090b c2090b2 = (C2090b) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2090b2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f9778a;
        a0 a0Var = a0.f30746a;
        int i11 = 3;
        InterfaceC7559c interfaceC7559c = null;
        C2100l c2100l = this.f9780c;
        switch (i10) {
            case 0:
                C8801p c8801p = (C8801p) this.f9779b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!c2100l.f9843o) {
                    c2100l.m5806m(true);
                    if (!c8801p.f42464a) {
                        C2100l.m5802i(c2100l);
                        break;
                    } else {
                        C3178a c3178aM5340g = q0.m5340g(c2100l);
                        C0496f c0496f = m0.f34659a;
                        c0.m13502y(c3178aM5340g, ExecutorC0495e.f3538c, null, new C0724d((w0) c2100l, interfaceC7559c, i11), 2);
                        break;
                    }
                }
                break;
            default:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f9779b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c2100l.f9840l, null, null, new C0388a(interfaceC3307i, c2100l, interfaceC7559c, 12), 3);
                break;
        }
        return a0Var;
    }
}
