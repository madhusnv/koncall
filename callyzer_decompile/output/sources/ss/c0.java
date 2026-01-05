package ss;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import i7.C3178a;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.y8;
import ts.C7216c;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33415a;

    /* renamed from: b */
    public final /* synthetic */ z0 f33416b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(z0 z0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33415a = i10;
        this.f33416b = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33415a) {
            case 0:
                return new c0(this.f33416b, interfaceC7559c, 0);
            case 1:
                return new c0(this.f33416b, interfaceC7559c, 1);
            case 2:
                return new c0(this.f33416b, interfaceC7559c, 2);
            case 3:
                return new c0(this.f33416b, interfaceC7559c, 3);
            case 4:
                return new c0(this.f33416b, interfaceC7559c, 4);
            case 5:
                return new c0(this.f33416b, interfaceC7559c, 5);
            default:
                return new c0(this.f33416b, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f33415a) {
            case 0:
                c0 c0Var = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                c0 c0Var2 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                c0 c0Var3 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c0Var3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                c0 c0Var4 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c0Var4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                c0 c0Var5 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var5 = qw.a0.f30746a;
                c0Var5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                c0 c0Var6 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var6 = qw.a0.f30746a;
                c0Var6.invokeSuspend(a0Var6);
                return a0Var6;
            default:
                c0 c0Var7 = (c0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var7 = qw.a0.f30746a;
                c0Var7.invokeSuspend(a0Var7);
                return a0Var7;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f33415a;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        z0 z0Var = this.f33416b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(d7.q0.m5340g(z0Var), null, null, new C4032f(new C8219t(z0Var.f33550g.m10041d(), new ps.b0(z0Var, interfaceC7559c, 4), 4), interfaceC7559c, 17), 3);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3178a c3178aM5340g = d7.q0.m5340g(z0Var);
                C0496f c0496f = tx.m0.f34659a;
                tx.c0.m13502y(c3178aM5340g, ExecutorC0495e.f3538c, null, new b0(z0Var, interfaceC7559c, 16), 2);
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(z0Var.f33549f, null, null, new b0(z0Var, interfaceC7559c, 15), 3);
                break;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                z0Var.m13199v(true);
                break;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = z0Var.f33541J;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, null, null, false, null, null, null, false, !z0Var.f33562s.m6988d(), null, null, 1791)));
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                y8.m11949d(z0Var.f33545b, R.string.please_enter_valid_phone_number_with_country_code);
                break;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = z0Var.f33545b;
                String string = context.getString(R.string.call_recording_not_available);
                AbstractC4154l.m8922e(string, "getString(...)");
                y8.m11950e(context, string);
                break;
        }
        return a0Var;
    }
}
