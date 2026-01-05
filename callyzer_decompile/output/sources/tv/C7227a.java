package tv;

import bu.C0782a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.retrofit.ApiException;
import ex.InterfaceC2141e;
import io.C3328c;
import kn.C4132l;
import og.od;
import pg.f9;
import qw.a0;
import sv.C6953a;
import tx.InterfaceC7266z;
import tx.c0;
import ug.C7452w;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.g0;
import xm.y4;
import xm.y5;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tv.a */
/* loaded from: classes3.dex */
public final class C7227a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34561a;

    /* renamed from: b */
    public int f34562b;

    /* renamed from: c */
    public final /* synthetic */ C7230d f34563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7227a(C7230d c7230d, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f34561a = i10;
        this.f34563c = c7230d;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f34561a) {
            case 0:
                return new C7227a(this.f34563c, interfaceC7559c, 0);
            case 1:
                return new C7227a(this.f34563c, interfaceC7559c, 1);
            case 2:
                return new C7227a(this.f34563c, interfaceC7559c, 2);
            case 3:
                return new C7227a(this.f34563c, interfaceC7559c, 3);
            default:
                return new C7227a(this.f34563c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f34561a) {
        }
        return ((C7227a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM13475K;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object objM15576c;
        Object value5;
        int i10 = this.f34561a;
        InterfaceC7559c interfaceC7559c = null;
        C7230d c7230d = this.f34563c;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f34562b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f34562b = 1;
                    return C7230d.m13455e(c7230d, this) == enumC7794a ? enumC7794a : a0Var;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f34562b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C3328c c3328c = c7230d.f34571c;
                    this.f34562b = 1;
                    y5 y5Var = (y5) c3328c.f17610b;
                    objM13475K = c0.m13475K(y5Var.f41052d.f42488a, new y4(y5Var, interfaceC7559c, 0), this);
                    if (objM13475K == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM13475K = obj;
                }
                String str = (String) objM13475K;
                C8791f c8791f = C8791f.f42457a;
                if (!C8791f.m16171d(str)) {
                    return a0Var;
                }
                m1 m1Var = c7230d.f34577i;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6953a.m13205a((C6953a) value, null, false, str, null, false, false, false, null, 235)));
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f34562b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                w0 w0Var = c7230d.f34574f;
                C0782a c0782a = new C0782a(c7230d, interfaceC7559c, 24);
                this.f34562b = 1;
                return c1.m15379j(w0Var, c0782a, this) == enumC7794a3 ? enumC7794a3 : a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f34562b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C7806h c7806h = c7230d.f34579k;
                this.f34562b = 1;
                return c7806h.mo14775g(C7237k.f34588a, this) == enumC7794a4 ? enumC7794a4 : a0Var;
            default:
                m1 m1Var2 = c7230d.f34578j;
                m1 m1Var3 = c7230d.f34577i;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f34562b;
                try {
                    if (i15 == 0) {
                        od.m10798c(obj);
                        C7452w c7452w = c7230d.f34572d;
                        String str2 = ((C6953a) m1Var2.getValue()).f33643c;
                        c7452w.getClass();
                        C4132l c4132lM14173i = C7452w.m14173i(str2);
                        do {
                            value3 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value3, C6953a.m13205a((C6953a) value3, null, false, null, c4132lM14173i.f21089b, false, false, false, null, 247)));
                        if (!c4132lM14173i.f21088a) {
                            return a0Var;
                        }
                        do {
                            value4 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value4, C6953a.m13205a((C6953a) value4, null, false, null, null, false, false, true, null, 191)));
                        C3328c c3328c2 = c7230d.f34571c;
                        String str3 = ((C6953a) m1Var2.getValue()).f33643c;
                        this.f34562b = 1;
                        g0 g0Var = (g0) c3328c2.f17613e;
                        g0Var.getClass();
                        g0Var.f40321i = str3;
                        objM15576c = g0Var.m15576c(this);
                        if (objM15576c == enumC7794a5) {
                        }
                        return enumC7794a5;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                    objM15576c = obj;
                    if (!((Boolean) objM15576c).booleanValue()) {
                        do {
                            value5 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value5, C6953a.m13205a((C6953a) value5, null, false, null, null, false, false, false, f9.m11628b(c7230d.f34570b, R.string.invalid_company_code), 63)));
                        return a0Var;
                    }
                    this.f34562b = 2;
                    if (C7230d.m13456f(c7230d, this) != enumC7794a5) {
                        return a0Var;
                    }
                    return enumC7794a5;
                } catch (ApiException e2) {
                    do {
                        value2 = m1Var3.getValue();
                    } while (!m1Var3.m15397i(value2, C6953a.m13205a((C6953a) value2, null, false, null, null, false, false, false, e2.f7377a, 63)));
                    return a0Var;
                }
        }
    }
}
