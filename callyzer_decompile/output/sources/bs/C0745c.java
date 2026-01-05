package bs;

import a9.C0073l;
import as.C0428a;
import as.C0429b;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import im.g1;
import im.h1;
import im.i1;
import im.j1;
import im.k1;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import og.od;
import og.pe;
import or.C5439b;
import pg.f9;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.r3;
import zr.C9031a;
import zr.C9032b;
import zr.C9033c;
import zr.C9034d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bs.c */
/* loaded from: classes3.dex */
public final class C0745c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4699a;

    /* renamed from: b */
    public int f4700b;

    /* renamed from: c */
    public final /* synthetic */ C0751i f4701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0745c(C0751i c0751i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4699a = i10;
        this.f4701c = c0751i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4699a) {
            case 0:
                return new C0745c(this.f4701c, interfaceC7559c, 0);
            case 1:
                return new C0745c(this.f4701c, interfaceC7559c, 1);
            case 2:
                return new C0745c(this.f4701c, interfaceC7559c, 2);
            case 3:
                return new C0745c(this.f4701c, interfaceC7559c, 3);
            case 4:
                return new C0745c(this.f4701c, interfaceC7559c, 4);
            case 5:
                return new C0745c(this.f4701c, interfaceC7559c, 5);
            default:
                return new C0745c(this.f4701c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4699a) {
        }
        return ((C0745c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        Object objM232y;
        Object value;
        C9034d c9034d;
        Object value2;
        C9034d c9034d2;
        Object value3;
        C9034d c9034d3;
        Object objM232y2;
        Object value4;
        C9034d c9034d4;
        Object value5;
        C9034d c9034d5;
        Object value6;
        C9034d c9034d6;
        Object objM228u;
        Object value7;
        C9034d c9034d7;
        Object objM229v;
        Object value8;
        C9034d c9034d8;
        switch (this.f4699a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f4700b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0751i c0751i = this.f4701c;
                    w0 w0Var = c0751i.f4748k;
                    C0744b c0744b = new C0744b(c0751i, null, 0);
                    this.f4700b = 1;
                    if (c1.m15379j(w0Var, c0744b, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                C0751i c0751i2 = this.f4701c;
                w0 w0Var2 = c0751i2.f4732F;
                m1 m1Var = c0751i2.f4731E;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f4700b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C0073l c0073l = c0751i2.f4741d;
                    C4802m c4802m = ((C9034d) w0Var2.f39340a.getValue()).f43541b.f43508b;
                    boolean z6 = c0751i2.f4757t;
                    this.f4700b = 1;
                    objM232y = c0073l.m232y(c4802m, z6, this);
                    if (objM232y == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                    objM232y = obj;
                }
                k1 k1Var = (k1) objM232y;
                if ((k1Var instanceof g1) || AbstractC4154l.m8918a(k1Var, j1.f17563a)) {
                    do {
                        value = m1Var.getValue();
                        c9034d = (C9034d) value;
                    } while (!m1Var.m15397i(value, C9034d.m16498a(c9034d, null, C9032b.m16496a(c9034d.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, f9.m11628b(c0751i2.f4739b, R.string.something_went_wrong), true, true, null, false, null, false, null, null, null, null, null, -956301313, 511), null, 5)));
                } else if (k1Var instanceof i1) {
                    C5439b c5439b = (C5439b) ((i1) k1Var).f17561a;
                    c0751i2.f4733G = c5439b.f27349b;
                    do {
                        value3 = m1Var.getValue();
                        c9034d3 = (C9034d) value3;
                    } while (!m1Var.m15397i(value3, C9034d.m16498a(c9034d3, null, C9032b.m16496a(c9034d3.f43541b, null, null, false, c5439b.f27348a, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, null, false, false, null, false, null, false, null, null, null, null, null, -16777225, 511), null, 5)));
                    if (((C9034d) w0Var2.f39340a.getValue()).f43541b.f43508b != null) {
                        this.f4700b = 2;
                        if (C0751i.m2050j(c0751i2, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (!(k1Var instanceof h1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value2 = m1Var.getValue();
                        c9034d2 = (C9034d) value2;
                    } while (!m1Var.m15397i(value2, C9034d.m16498a(c9034d2, null, C9032b.m16496a(c9034d2.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, ((h1) k1Var).f17560a, true, true, null, false, null, false, null, null, null, null, null, -956301313, 511), null, 5)));
                }
                return a0.f30746a;
            case 2:
                C0751i c0751i3 = this.f4701c;
                m1 m1Var2 = c0751i3.f4731E;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f4700b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C0073l c0073l2 = c0751i3.f4741d;
                    C4802m c4802m2 = ((C9034d) c0751i3.f4732F.f39340a.getValue()).f43541b.f43508b;
                    boolean z10 = c0751i3.f4757t;
                    this.f4700b = 1;
                    objM232y2 = c0073l2.m232y(c4802m2, z10, this);
                    if (objM232y2 == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM232y2 = obj;
                }
                k1 k1Var2 = (k1) objM232y2;
                if ((k1Var2 instanceof g1) || AbstractC4154l.m8918a(k1Var2, j1.f17563a)) {
                    do {
                        value4 = m1Var2.getValue();
                        c9034d4 = (C9034d) value4;
                    } while (!m1Var2.m15397i(value4, C9034d.m16498a(c9034d4, null, C9032b.m16496a(c9034d4.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, f9.m11628b(c0751i3.f4739b, R.string.something_went_wrong), true, true, null, false, null, false, null, null, null, null, null, -956301313, 511), null, 5)));
                } else {
                    if (k1Var2 instanceof i1) {
                        C5439b c5439b2 = (C5439b) ((i1) k1Var2).f17561a;
                        c0751i3.f4733G = c5439b2.f27349b;
                        return c5439b2.f27348a;
                    }
                    if (!(k1Var2 instanceof h1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value5 = m1Var2.getValue();
                        c9034d5 = (C9034d) value5;
                    } while (!m1Var2.m15397i(value5, C9034d.m16498a(c9034d5, null, C9032b.m16496a(c9034d5.f43541b, null, null, false, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, 0, null, 0, null, null, false, false, false, ((h1) k1Var2).f17560a, true, true, null, false, null, false, null, null, null, null, null, -956301313, 511), null, 5)));
                }
                return C6668r.f31943a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f4700b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C0073l c0073l3 = this.f4701c.f4741d;
                this.f4700b = 1;
                Object objM15610i = ((r3) c0073l3.f267d).m15610i(true, this);
                return objM15610i == enumC7794a4 ? enumC7794a4 : objM15610i;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f4700b;
                C0751i c0751i4 = this.f4701c;
                if (i14 == 0) {
                    od.m10798c(obj);
                    if (c0751i4.f4734H) {
                        m1 m1Var3 = c0751i4.f4731E;
                        do {
                            value6 = m1Var3.getValue();
                            c9034d6 = (C9034d) value6;
                        } while (!m1Var3.m15397i(value6, C9034d.m16498a(c9034d6, null, null, C9031a.m16495a(c9034d6.f43542c, null, null, null, null, null, true, false, false, 223), 3)));
                        C0073l c0073l4 = c0751i4.f4741d;
                        this.f4700b = 1;
                        objM228u = c0073l4.m228u(this);
                        if (objM228u == enumC7794a5) {
                            return enumC7794a5;
                        }
                    }
                    return a0.f30746a;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                objM228u = obj;
                ArrayList arrayListD0 = AbstractC6663m.d0((Collection) objM228u);
                if (!c0751i4.f4757t && !arrayListD0.isEmpty()) {
                    for (C0428a c0428a : ((C9034d) c0751i4.f4732F.f39340a.getValue()).f43542c.f43485b) {
                        int size = arrayListD0.size();
                        int i15 = 0;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj2 = arrayListD0.get(i16);
                            i16++;
                            int i17 = i15 + 1;
                            if (i15 < 0) {
                                pe.m10842q();
                                throw null;
                            }
                            if (AbstractC4154l.m8918a(c0428a.f3147a.m4716b(), ((C0428a) obj2).f3147a.m4716b())) {
                                arrayListD0.set(i15, C0428a.m1451a((C0428a) arrayListD0.get(i15), true));
                            }
                            i15 = i17;
                        }
                    }
                }
                m1 m1Var4 = c0751i4.f4731E;
                do {
                    value7 = m1Var4.getValue();
                    c9034d7 = (C9034d) value7;
                } while (!m1Var4.m15397i(value7, C9034d.m16498a(c9034d7, null, null, C9031a.m16495a(c9034d7.f43542c, arrayListD0, null, arrayListD0, arrayListD0, null, false, false, false, 210), 3)));
                c0751i4.f4734H = arrayListD0.isEmpty();
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f4700b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    this.f4700b = 1;
                    if (c0.m13489l(1000L, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                this.f4701c.m2061u();
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f4700b;
                C0751i c0751i5 = this.f4701c;
                if (i19 == 0) {
                    od.m10798c(obj);
                    C0073l c0073l5 = c0751i5.f4741d;
                    this.f4700b = 1;
                    objM229v = c0073l5.m229v(this);
                    if (objM229v == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM229v = obj;
                }
                C6361k c6361k = (C6361k) objM229v;
                ArrayList arrayListD02 = AbstractC6663m.d0((Collection) c6361k.f30755a);
                ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(arrayListD02, 10));
                int size2 = arrayListD02.size();
                int i20 = 0;
                while (i20 < size2) {
                    Object obj3 = arrayListD02.get(i20);
                    i20++;
                    arrayList.add(((C0429b) obj3).f3151a);
                }
                c0751i5.m2051k(arrayList, false);
                c0751i5.f4729C = AbstractC6663m.c0(c0751i5.f4728B);
                m1 m1Var5 = c0751i5.f4731E;
                do {
                    value8 = m1Var5.getValue();
                    c9034d8 = (C9034d) value8;
                } while (!m1Var5.m15397i(value8, C9034d.m16498a(c9034d8, C9033c.m16497a(c9034d8.f43540a, false, false, null, null, c0751i5.m2052l(null), AbstractC6663m.c0(c0751i5.f4730D), false, 77), null, null, 6)));
                c0751i5.f4735I = ((Boolean) c6361k.f30756b).booleanValue();
                return a0.f30746a;
        }
    }
}
