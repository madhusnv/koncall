package mq;

import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import java.util.Objects;
import lp.C4504f;
import lq.C4507b;
import og.od;
import om.C5401c;
import qw.C6361k;
import rw.AbstractC6663m;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.z */
/* loaded from: classes3.dex */
public final class C4858z extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24359a;

    /* renamed from: b */
    public /* synthetic */ Object f24360b;

    /* renamed from: c */
    public final /* synthetic */ h0 f24361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4858z(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24359a = i10;
        this.f24361c = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24359a) {
            case 0:
                C4858z c4858z = new C4858z(this.f24361c, interfaceC7559c, 0);
                c4858z.f24360b = obj;
                return c4858z;
            case 1:
                C4858z c4858z2 = new C4858z(this.f24361c, interfaceC7559c, 1);
                c4858z2.f24360b = obj;
                return c4858z2;
            default:
                C4858z c4858z3 = new C4858z(this.f24361c, interfaceC7559c, 2);
                c4858z3.f24360b = obj;
                return c4858z3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24359a) {
            case 0:
                C4858z c4858z = (C4858z) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c4858z.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((C4858z) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                C4858z c4858z2 = (C4858z) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4858z2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f24359a;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        h0 h0Var = this.f24361c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f24360b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(h0Var.f24281v, null, null, new C4504f(interfaceC3307i, h0Var, interfaceC7559c, 6), 3);
                return a0Var;
            case 1:
                List list = (List) this.f24360b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                h0Var.f24258F++;
                if (list.isEmpty()) {
                    return null;
                }
                C5401c c5401c = (C5401c) AbstractC6663m.m12750N(list);
                return new C6361k(c5401c.f27096b.f23849f, new Integer(c5401c.f27095a));
            default:
                wx.w0 w0Var = h0Var.f24253A;
                Throwable th2 = (Throwable) this.f24360b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                th2.printStackTrace();
                if (th2 instanceof DataNotFoundException) {
                    h0Var.f24273n.m16238m("CallHistoryTabViewModel", (Exception) th2);
                }
                ((C4507b) w0Var.f39340a.getValue()).f22421c.size();
                Objects.toString(h0Var.f24272m);
                m1 m1Var = h0Var.f24285z;
                if (((C4507b) w0Var.f39340a.getValue()).f22421c.isEmpty()) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C4507b.m9340a((C4507b) value2, false, null, null, false, false, 0, null, null, null, 2030)));
                } else {
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C4507b.m9340a((C4507b) value, false, null, null, false, true, 0, null, null, null, 2014)));
                }
                if (!h0Var.f24260H) {
                    h0Var.m9800l();
                }
                return a0Var;
        }
    }
}
