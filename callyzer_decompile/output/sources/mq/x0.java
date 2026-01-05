package mq;

import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import lp.C4504f;
import lq.C4508c;
import og.od;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24350a;

    /* renamed from: b */
    public /* synthetic */ Object f24351b;

    /* renamed from: c */
    public final /* synthetic */ a1 f24352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(a1 a1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24350a = i10;
        this.f24352c = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24350a) {
            case 0:
                x0 x0Var = new x0(this.f24352c, interfaceC7559c, 0);
                x0Var.f24351b = obj;
                return x0Var;
            case 1:
                x0 x0Var2 = new x0(this.f24352c, interfaceC7559c, 1);
                x0Var2.f24351b = obj;
                return x0Var2;
            default:
                x0 x0Var3 = new x0(this.f24352c, interfaceC7559c, 2);
                x0Var3.f24351b = obj;
                return x0Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24350a) {
            case 0:
                x0 x0Var = (x0) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                x0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                x0 x0Var2 = (x0) create((EnumC7204p) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                x0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                x0 x0Var3 = (x0) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                x0Var3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        InterfaceC7559c interfaceC7559c = null;
        switch (this.f24350a) {
            case 0:
                InterfaceC3307i interfaceC3307i = (InterfaceC3307i) this.f24351b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                a1 a1Var = this.f24352c;
                Objects.toString(interfaceC3307i);
                tx.c0.m13502y(a1Var.f24154u, null, null, new C4504f(interfaceC3307i, a1Var, interfaceC7559c, 9), 3);
                return qw.a0.f30746a;
            case 1:
                qw.a0 a0Var = qw.a0.f30746a;
                EnumC7204p enumC7204p = (EnumC7204p) this.f24351b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Objects.toString(enumC7204p);
                EnumC7204p enumC7204p2 = this.f24352c.f24147n;
                if (enumC7204p2 == null) {
                    AbstractC4154l.m8928k("simSelectionMode");
                    throw null;
                }
                if (enumC7204p2 != enumC7204p) {
                    this.f24352c.f24147n = enumC7204p;
                    a1 a1Var2 = this.f24352c;
                    tx.c0.m13502y(a1Var2.f24154u, null, null, new u0(a1Var2, interfaceC7559c, 4), 3);
                    a1.m9790g(this.f24352c);
                }
                return a0Var;
            default:
                a1 a1Var3 = this.f24352c;
                wx.w0 w0Var = a1Var3.f24149p;
                Throwable th2 = (Throwable) this.f24351b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                th2.printStackTrace();
                if (th2 instanceof DataNotFoundException) {
                    int i10 = ((C4508c) w0Var.f39340a.getValue()).f22431d;
                    ((C4508c) w0Var.f39340a.getValue()).f22428a.size();
                }
                m1 m1Var = a1Var3.f24148o;
                if (((C4508c) w0Var.f39340a.getValue()).f22428a.isEmpty()) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C4508c.m9341a((C4508c) value2, null, false, false, 0, false, 0, false, null, false, null, 1003)));
                } else {
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C4508c.m9341a((C4508c) value, null, true, false, 0, false, 0, false, null, false, null, 1017)));
                }
                return qw.a0.f30746a;
        }
    }
}
