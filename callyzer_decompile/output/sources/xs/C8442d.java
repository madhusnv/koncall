package xs;

import ex.InterfaceC2141e;
import java.util.List;
import java.util.Objects;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ws.C8181v;
import ww.AbstractC8199i;
import wx.m1;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.d */
/* loaded from: classes3.dex */
public final class C8442d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41174a;

    /* renamed from: b */
    public /* synthetic */ Object f41175b;

    /* renamed from: c */
    public final /* synthetic */ C8449k f41176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8442d(C8449k c8449k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41174a = i10;
        this.f41176c = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41174a) {
            case 0:
                C8442d c8442d = new C8442d(this.f41176c, interfaceC7559c, 0);
                c8442d.f41175b = obj;
                return c8442d;
            case 1:
                C8442d c8442d2 = new C8442d(this.f41176c, interfaceC7559c, 1);
                c8442d2.f41175b = obj;
                return c8442d2;
            default:
                C8442d c8442d3 = new C8442d(this.f41176c, interfaceC7559c, 2);
                c8442d3.f41175b = obj;
                return c8442d3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41174a) {
            case 0:
                C8442d c8442d = (C8442d) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8442d.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C8442d c8442d2 = (C8442d) create((Throwable) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c8442d2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C8442d c8442d3 = (C8442d) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c8442d3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i10 = this.f41174a;
        a0 a0Var = a0.f30746a;
        C8449k c8449k = this.f41176c;
        switch (i10) {
            case 0:
                C8801p c8801p = (C8801p) this.f41175b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c8449k.f41223m;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, !c8801p.f42464a, false, null, 0, null, 4063231)));
            case 1:
                Throwable th2 = (Throwable) this.f41175b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Objects.toString(th2);
                m1 m1Var2 = c8449k.f41223m;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C8181v.m15340a((C8181v) value2, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4188159)));
            default:
                List list = (List) this.f41175b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var3 = c8449k.f41223m;
                do {
                    value3 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value3, C8181v.m15340a((C8181v) value3, null, null, null, false, list, 0, false, false, false, false, false, list.isEmpty(), false, false, 0, false, false, null, 0, null, 4186047)));
        }
        return a0Var;
    }
}
