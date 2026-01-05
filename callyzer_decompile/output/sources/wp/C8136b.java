package wp;

import eo.C2082h;
import ex.InterfaceC2141e;
import lu.C4525k;
import og.od;
import qp.C6272i;
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
/* renamed from: wp.b */
/* loaded from: classes3.dex */
public final class C8136b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f38966a;

    /* renamed from: b */
    public int f38967b;

    /* renamed from: c */
    public final /* synthetic */ C8141g f38968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8136b(C8141g c8141g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f38966a = i10;
        this.f38968c = c8141g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f38966a) {
            case 0:
                return new C8136b(this.f38968c, interfaceC7559c, 0);
            case 1:
                return new C8136b(this.f38968c, interfaceC7559c, 1);
            default:
                return new C8136b(this.f38968c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f38966a) {
        }
        return ((C8136b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f38966a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f38967b;
                C8141g c8141g = this.f38968c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c8141g.f38983h;
                    this.f38967b = 1;
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
                m1 m1Var = c8141g.f38990o;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6272i.m12276a((C6272i) value, null, null, null, enumC7204p, null, null, null, false, false, 1015)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f38967b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f38968c.f36254d;
                    this.f38967b = 1;
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
                int i12 = this.f38967b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C8141g c8141g2 = this.f38968c;
                    c8141g2.f38988m.getClass();
                    v0 v0Var = x1.f40990o;
                    C4525k c4525k = new C4525k(c8141g2, null, 28);
                    this.f38967b = 1;
                    if (c1.m15379j(v0Var, c4525k, this) == enumC7794a3) {
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
