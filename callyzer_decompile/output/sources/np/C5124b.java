package np;

import eo.C2082h;
import ex.InterfaceC2141e;
import og.od;
import qp.C6269f;
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
/* renamed from: np.b */
/* loaded from: classes3.dex */
public final class C5124b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25101a;

    /* renamed from: b */
    public int f25102b;

    /* renamed from: c */
    public final /* synthetic */ C5128f f25103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5124b(C5128f c5128f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25101a = i10;
        this.f25103c = c5128f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25101a) {
            case 0:
                return new C5124b(this.f25103c, interfaceC7559c, 0);
            default:
                return new C5124b(this.f25103c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f25101a) {
        }
        return ((C5124b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f25101a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f25102b;
                C5128f c5128f = this.f25103c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c5128f.f25114h;
                    this.f25102b = 1;
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
                m1 m1Var = c5128f.f25119m;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6269f.m12273a((C6269f) value, null, enumC7204p, null, null, null, false, false, false, 507)));
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f25102b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f25103c.f36254d;
                    this.f25102b = 1;
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
