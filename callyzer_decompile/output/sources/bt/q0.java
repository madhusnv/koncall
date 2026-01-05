package bt;

import at.C0431b;
import av.EnumC0460c;
import ct.C1502a;
import dr.C1770t;
import dt.C1813s;
import ev.C2136a;
import ex.InterfaceC2141e;
import fv.C2386k;
import og.od;
import qw.C6361k;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4902a = 0;

    /* renamed from: b */
    public /* synthetic */ boolean f4903b;

    /* renamed from: c */
    public final /* synthetic */ d7.w0 f4904c;

    /* renamed from: d */
    public final /* synthetic */ Object f4905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(C1813s c1813s, l7.a0 a0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4904c = c1813s;
        this.f4905d = a0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4902a) {
            case 0:
                q0 q0Var = new q0((C1813s) this.f4904c, (l7.a0) this.f4905d, interfaceC7559c);
                q0Var.f4903b = ((Boolean) obj).booleanValue();
                return q0Var;
            default:
                return new q0(this.f4903b, (C2386k) this.f4904c, (C1502a) this.f4905d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4902a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                q0 q0Var = (q0) create(bool, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                q0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                q0 q0Var2 = (q0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                q0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f4902a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f4905d;
        d7.w0 w0Var = this.f4904c;
        switch (i10) {
            case 0:
                l7.a0 a0Var2 = (l7.a0) obj2;
                boolean z6 = this.f4903b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (z6) {
                    if (!((C0431b) ((C1813s) w0Var).f8765i.f39340a.getValue()).f3188t) {
                        a0Var2.m9188g();
                        break;
                    } else {
                        l7.a0.m9182h(a0Var2, "call_note_templates", false);
                        break;
                    }
                }
                break;
            default:
                C2386k c2386k = (C2386k) w0Var;
                m1 m1Var = c2386k.f10867r;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (this.f4903b) {
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C2136a.m5817a((C2136a) value, null, null, null, null, false, null, null, null, false, false, null, null, 0, false, null, null, null, null, EnumC0460c.Saved, new C6361k("", Boolean.FALSE), 67108863)));
                    tx.c0.m13502y(c2386k.f10860k, null, null, new C1770t(c2386k, (C1502a) obj2, null, 18), 3);
                    break;
                } else {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C2136a.m5817a((C2136a) value2, null, null, null, null, false, null, null, null, false, false, null, null, 0, false, null, null, null, null, EnumC0460c.Error, null, 201326591)));
                }
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(boolean z6, C2386k c2386k, C1502a c1502a, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4903b = z6;
        this.f4904c = c2386k;
        this.f4905d = c1502a;
    }
}
