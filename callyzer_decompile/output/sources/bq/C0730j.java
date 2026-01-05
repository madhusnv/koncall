package bq;

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
/* renamed from: bq.j */
/* loaded from: classes3.dex */
public final class C0730j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4600a;

    /* renamed from: b */
    public /* synthetic */ Object f4601b;

    /* renamed from: c */
    public final /* synthetic */ C0737q f4602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0730j(C0737q c0737q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4600a = i10;
        this.f4602c = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4600a) {
            case 0:
                C0730j c0730j = new C0730j(this.f4602c, interfaceC7559c, 0);
                c0730j.f4601b = obj;
                return c0730j;
            default:
                C0730j c0730j2 = new C0730j(this.f4602c, interfaceC7559c, 1);
                c0730j2.f4601b = obj;
                return c0730j2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4600a) {
            case 0:
                C0730j c0730j = (C0730j) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0730j.invokeSuspend(a0Var);
                return a0Var;
            default:
                C0730j c0730j2 = (C0730j) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0730j2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f4600a;
        a0 a0Var = a0.f30746a;
        C0737q c0737q = this.f4602c;
        switch (i10) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f4601b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c0737q.f4642g, null, null, new C0372k(interfaceC3307i, c0737q, (InterfaceC7559c) null, 8), 3);
                break;
            default:
                List list = (List) this.f4601b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c0737q.f4649n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6274k.m12278a((C6274k) value, C6668r.f31943a, false, null, null, null, null, false, false, false, false, false, false, 0, false, false, 262142)));
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C6274k.m12278a((C6274k) value2, list, list.isEmpty(), null, null, null, null, false, false, false, false, false, false, 0, false, false, 262140)));
        }
        return a0Var;
    }
}
