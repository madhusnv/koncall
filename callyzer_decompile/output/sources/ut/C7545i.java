package ut;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.i */
/* loaded from: classes3.dex */
public final class C7545i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f36315a;

    /* renamed from: b */
    public final /* synthetic */ C7546j f36316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7545i(C7546j c7546j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f36315a = i10;
        this.f36316b = c7546j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f36315a) {
            case 0:
                return new C7545i(this.f36316b, interfaceC7559c, 0);
            default:
                return new C7545i(this.f36316b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36315a) {
            case 0:
                C7545i c7545i = (C7545i) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c7545i.invokeSuspend(a0Var);
                return a0Var;
            default:
                C7545i c7545i2 = (C7545i) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c7545i2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f36315a;
        a0 a0Var = a0.f30746a;
        C7546j c7546j = this.f36316b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c7546j.f36322g;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C7543g.m14298a((C7543g) value, null, null, ((C8801p) c7546j.f36319d.f39340a.getValue()).f42464a, false, false, false, 119)));
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c7546j.f36322g;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C7543g.m14298a((C7543g) value2, null, null, false, false, false, !c7546j.f36321f.m6988d(), 63)));
        }
        return a0Var;
    }
}
