package os;

import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import lp.C4504f;
import ls.C4511b;
import og.od;
import og.ya;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.c */
/* loaded from: classes3.dex */
public final class C5725c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28211a;

    /* renamed from: b */
    public /* synthetic */ Object f28212b;

    /* renamed from: c */
    public final /* synthetic */ C5731i f28213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5725c(C5731i c5731i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28211a = i10;
        this.f28213c = c5731i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28211a) {
            case 0:
                C5725c c5725c = new C5725c(this.f28213c, interfaceC7559c, 0);
                c5725c.f28212b = obj;
                return c5725c;
            case 1:
                C5725c c5725c2 = new C5725c(this.f28213c, interfaceC7559c, 1);
                c5725c2.f28212b = obj;
                return c5725c2;
            case 2:
                C5725c c5725c3 = new C5725c(this.f28213c, interfaceC7559c, 2);
                c5725c3.f28212b = obj;
                return c5725c3;
            default:
                C5725c c5725c4 = new C5725c(this.f28213c, interfaceC7559c, 3);
                c5725c4.f28212b = obj;
                return c5725c4;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28211a) {
            case 0:
                C5725c c5725c = (C5725c) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c5725c.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C5725c c5725c2 = (C5725c) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c5725c2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                return ((C5725c) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                C5725c c5725c3 = (C5725c) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c5725c3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z6;
        Object value2;
        int i10 = this.f28211a;
        a0 a0Var = a0.f30746a;
        C5731i c5731i = this.f28213c;
        switch (i10) {
            case 0:
                C8801p c8801p = (C8801p) this.f28212b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c5731i.f28251i;
                do {
                    value = m1Var.getValue();
                    z6 = c8801p.f42464a;
                } while (!m1Var.m15397i(value, C4511b.m9347a((C4511b) value, null, false, false, false, 0, false, !z6, z6, false, null, false, null, null, 65151)));
                if (c8801p.f42464a) {
                    c5731i.m11286j();
                }
                return a0Var;
            case 1:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f28212b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c5731i.f28246d, null, null, new C4504f(interfaceC3307i, c5731i, null, 21), 3);
                return a0Var;
            case 2:
                List list = (List) this.f28212b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(list.size() + ((C4511b) c5731i.f28251i.getValue()).f22455e);
            default:
                List list2 = (List) this.f28212b;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c5731i.f28251i;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C4511b.m9347a((C4511b) value2, list2, false, false, false, 0, false, false, false, false, ya.m11063a(list2), false, null, null, 64494)));
                return a0Var;
        }
    }
}
