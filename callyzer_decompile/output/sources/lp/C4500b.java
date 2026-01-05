package lp;

import eo.C2082h;
import ex.InterfaceC2141e;
import og.od;
import qp.C6268e;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lp.b */
/* loaded from: classes3.dex */
public final class C4500b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22387a;

    /* renamed from: b */
    public int f22388b;

    /* renamed from: c */
    public final /* synthetic */ C4505g f22389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4500b(C4505g c4505g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22387a = i10;
        this.f22389c = c4505g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f22387a) {
            case 0:
                return new C4500b(this.f22389c, interfaceC7559c, 0);
            default:
                return new C4500b(this.f22389c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f22387a) {
        }
        return ((C4500b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f22387a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f22388b;
                C4505g c4505g = this.f22389c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c4505g.f22404h;
                    this.f22388b = 1;
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
                m1 m1Var = c4505g.f22409m;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6268e.m12272a((C6268e) value, null, enumC7204p, null, null, null, false, false, false, 253)));
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f22388b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f22389c.f36254d;
                    this.f22388b = 1;
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
        }
    }
}
