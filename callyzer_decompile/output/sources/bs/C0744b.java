package bs;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import wx.w0;
import yv.C8801p;
import zr.C9031a;
import zr.C9032b;
import zr.C9033c;
import zr.C9034d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bs.b */
/* loaded from: classes3.dex */
public final class C0744b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4697a;

    /* renamed from: b */
    public final /* synthetic */ C0751i f4698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0744b(C0751i c0751i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4697a = i10;
        this.f4698b = c0751i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4697a) {
            case 0:
                return new C0744b(this.f4698b, interfaceC7559c, 0);
            case 1:
                return new C0744b(this.f4698b, interfaceC7559c, 1);
            default:
                return new C0744b(this.f4698b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4697a) {
            case 0:
                C0744b c0744b = (C0744b) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0744b.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C0744b c0744b2 = (C0744b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0744b2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C0744b c0744b3 = (C0744b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c0744b3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C9034d c9034d;
        C9032b c9032b;
        w0 w0Var;
        Object value2;
        C9034d c9034d2;
        int i10 = this.f4697a;
        a0 a0Var = a0.f30746a;
        C0751i c0751i = this.f4698b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c0751i.f4731E;
                do {
                    value = m1Var.getValue();
                    c9034d = (C9034d) value;
                    c9032b = c9034d.f43541b;
                    w0Var = c0751i.f4748k;
                } while (!m1Var.m15397i(value, new C9034d(C9033c.m16497a(c9034d.f43540a, ((C8801p) w0Var.f39340a.getValue()).f42464a, false, null, null, null, null, false, 126), C9032b.m16496a(c9032b, null, null, ((C8801p) w0Var.f39340a.getValue()).f42464a, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -5, 511), C9031a.m16495a(c9034d.f43542c, null, null, null, null, null, false, false, ((C8801p) w0Var.f39340a.getValue()).f42464a, 127))));
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c0751i.f4731E;
                do {
                    value2 = m1Var2.getValue();
                    c9034d2 = (C9034d) value2;
                } while (!m1Var2.m15397i(value2, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9034d2.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -33554433, 479), null, 5)));
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0751i.m2059s((C9034d) c0751i.f4732F.f39340a.getValue(), ((C9034d) c0751i.f4732F.f39340a.getValue()).f43541b.f43510d, C0752j.f4764a);
                break;
        }
        return a0Var;
    }
}
