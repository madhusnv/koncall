package ip;

import ex.InterfaceC2141e;
import gs.C2715a;
import im.InterfaceC3307i;
import java.util.List;
import og.od;
import qp.C6266c;
import qw.a0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.i */
/* loaded from: classes3.dex */
public final class C3339i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17682a;

    /* renamed from: b */
    public /* synthetic */ Object f17683b;

    /* renamed from: c */
    public final /* synthetic */ C3342l f17684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3339i(C3342l c3342l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17682a = i10;
        this.f17684c = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17682a) {
            case 0:
                C3339i c3339i = new C3339i(this.f17684c, interfaceC7559c, 0);
                c3339i.f17683b = obj;
                return c3339i;
            default:
                C3339i c3339i2 = new C3339i(this.f17684c, interfaceC7559c, 1);
                c3339i2.f17683b = obj;
                return c3339i2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17682a) {
            case 0:
                C3339i c3339i = (C3339i) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c3339i.invokeSuspend(a0Var);
                return a0Var;
            default:
                C3339i c3339i2 = (C3339i) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c3339i2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f17682a;
        a0 a0Var = a0.f30746a;
        C3342l c3342l = this.f17684c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f17683b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c3342l.f17691g, null, null, new C2715a(interfaceC3307i, c3342l, null, 12), 3);
                break;
            default:
                List list = (List) this.f17683b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c3342l.f17698n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, C6668r.f31943a, false, null, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262142)));
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C6266c.m12271a((C6266c) value2, list, list.isEmpty(), null, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262140)));
        }
        return a0Var;
    }
}
