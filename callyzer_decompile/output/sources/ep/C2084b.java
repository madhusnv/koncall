package ep;

import ap.C0388a;
import eo.C2082h;
import ex.InterfaceC2141e;
import og.od;
import qp.C6265b;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ep.b */
/* loaded from: classes3.dex */
public final class C2084b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9752a;

    /* renamed from: b */
    public int f9753b;

    /* renamed from: c */
    public final /* synthetic */ C2088f f9754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2084b(C2088f c2088f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9752a = i10;
        this.f9754c = c2088f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9752a) {
            case 0:
                return new C2084b(this.f9754c, interfaceC7559c, 0);
            case 1:
                return new C2084b(this.f9754c, interfaceC7559c, 1);
            default:
                return new C2084b(this.f9754c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9752a) {
        }
        return ((C2084b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f9752a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9753b;
                C2088f c2088f = this.f9754c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c2088f.f9765h;
                    this.f9753b = 1;
                    obj = c2082h.f9747b.m15700p(this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                EnumC7204p enumC7204p = (EnumC7204p) obj;
                m1 m1Var = c2088f.f9771n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6265b.m12270a((C6265b) value, null, null, enumC7204p, null, null, false, false, 251)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f9753b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f9754c.f36254d;
                    this.f9753b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f9753b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C2088f c2088f2 = this.f9754c;
                    c2088f2.f9769l.getClass();
                    v0 v0Var = x1.f40990o;
                    C0388a c0388a = new C0388a(c2088f2, null, 10);
                    this.f9753b = 1;
                    if (c1.m15379j(v0Var, c0388a, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
