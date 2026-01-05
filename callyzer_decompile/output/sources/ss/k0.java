package ss;

import ex.InterfaceC2141e;
import og.od;
import ts.C7216c;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33452a;

    /* renamed from: b */
    public /* synthetic */ boolean f33453b;

    /* renamed from: c */
    public final /* synthetic */ z0 f33454c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(z0 z0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33452a = i10;
        this.f33454c = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33452a) {
            case 0:
                k0 k0Var = new k0(this.f33454c, interfaceC7559c, 0);
                k0Var.f33453b = ((Boolean) obj).booleanValue();
                return k0Var;
            default:
                k0 k0Var2 = new k0(this.f33454c, interfaceC7559c, 1);
                k0Var2.f33453b = ((Boolean) obj).booleanValue();
                return k0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f33452a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) create(bool, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                k0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                k0 k0Var2 = (k0) create(bool, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                k0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f33452a;
        qw.a0 a0Var = qw.a0.f30746a;
        z0 z0Var = this.f33454c;
        switch (i10) {
            case 0:
                boolean z6 = this.f33453b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = z0Var.f33541J;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, null, null, false, null, null, null, z6, false, null, null, 1919)));
            default:
                boolean z10 = this.f33453b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                z0.m13192o(z0Var, z10);
                break;
        }
        return a0Var;
    }
}
