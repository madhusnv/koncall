package xq;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qw.a0;
import uq.C7497c;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wq.C8142a;
import ww.AbstractC8199i;
import wx.m1;
import yq.C8741f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xq.d */
/* loaded from: classes3.dex */
public final class C8430d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41137a;

    /* renamed from: b */
    public /* synthetic */ Object f41138b;

    /* renamed from: c */
    public final /* synthetic */ C8741f f41139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8430d(C8741f c8741f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41137a = i10;
        this.f41139c = c8741f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41137a) {
            case 0:
                C8430d c8430d = new C8430d(this.f41139c, interfaceC7559c, 0);
                c8430d.f41138b = obj;
                return c8430d;
            case 1:
                C8430d c8430d2 = new C8430d(this.f41139c, interfaceC7559c, 1);
                c8430d2.f41138b = obj;
                return c8430d2;
            default:
                C8430d c8430d3 = new C8430d(this.f41139c, interfaceC7559c, 2);
                c8430d3.f41138b = obj;
                return c8430d3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41137a) {
            case 0:
                C8430d c8430d = (C8430d) create((Integer) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8430d.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C8430d c8430d2 = (C8430d) create((Throwable) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c8430d2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C8430d c8430d3 = (C8430d) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c8430d3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f41137a;
        a0 a0Var = a0.f30746a;
        C8741f c8741f = this.f41139c;
        switch (i10) {
            case 0:
                Integer num = (Integer) this.f41138b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (num != null) {
                    C8142a c8142a = (C8142a) c8741f.f42338g.f39340a.getValue();
                    if (!c8142a.f38996b && !c8142a.f38998d && num.intValue() >= c8142a.f38995a.size() - 5) {
                        c8741f.m16121f(C7497c.f36189a);
                        break;
                    }
                }
                break;
            case 1:
                Throwable th2 = (Throwable) this.f41138b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c8741f.f42335d.m16235j(th2);
                m1 m1Var = c8741f.f42337f;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C8142a.m15319a((C8142a) value, null, false, false, false, null, 0, 121)));
            default:
                List list = (List) this.f41138b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c8741f.f42337f;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C8142a.m15319a((C8142a) value2, list, false, false, list.isEmpty(), null, 0, 118)));
        }
        return a0Var;
    }
}
