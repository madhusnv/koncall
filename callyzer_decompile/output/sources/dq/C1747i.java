package dq;

import ao.C0372k;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import og.od;
import qp.C6274k;
import qw.a0;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.i */
/* loaded from: classes3.dex */
public final class C1747i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8459a;

    /* renamed from: b */
    public /* synthetic */ Object f8460b;

    /* renamed from: c */
    public final /* synthetic */ C1750l f8461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1747i(C1750l c1750l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8459a = i10;
        this.f8461c = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8459a) {
            case 0:
                C1747i c1747i = new C1747i(this.f8461c, interfaceC7559c, 0);
                c1747i.f8460b = obj;
                return c1747i;
            default:
                C1747i c1747i2 = new C1747i(this.f8461c, interfaceC7559c, 1);
                c1747i2.f8460b = obj;
                return c1747i2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8459a) {
            case 0:
                C1747i c1747i = (C1747i) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c1747i.invokeSuspend(a0Var);
                return a0Var;
            default:
                C1747i c1747i2 = (C1747i) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c1747i2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f8459a;
        a0 a0Var = a0.f30746a;
        C1750l c1750l = this.f8461c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f8460b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c1750l.f8468g, null, null, new C0372k(interfaceC3307i, c1750l, (InterfaceC7559c) null, 26), 3);
                return a0Var;
            default:
                List list = (List) this.f8460b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c1750l.f8475n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6274k.m12278a((C6274k) value, C6668r.f31943a, false, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262142)));
                while (true) {
                    Object value2 = m1Var.getValue();
                    C6274k c6274k = (C6274k) value2;
                    int size = list.size();
                    c1750l.f8467f.getClass();
                    a0 a0Var2 = a0Var;
                    if (m1Var.m15397i(value2, C6274k.m12278a(c6274k, list, size < 50, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262140))) {
                        return a0Var2;
                    }
                    a0Var = a0Var2;
                }
        }
    }
}
