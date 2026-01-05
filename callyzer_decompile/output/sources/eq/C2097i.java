package eq;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mn.g0;
import og.od;
import qp.C6264a;
import qw.C6363m;
import qw.C6364n;
import qw.a0;
import rw.AbstractC6663m;
import rw.C6668r;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import zp.C9010j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.i */
/* loaded from: classes3.dex */
public final class C2097i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9824a;

    /* renamed from: b */
    public int f9825b;

    /* renamed from: c */
    public final /* synthetic */ C2100l f9826c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f9827d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f9828e;

    /* renamed from: f */
    public final /* synthetic */ boolean f9829f;

    /* renamed from: g */
    public final /* synthetic */ List f9830g;

    /* renamed from: h */
    public final /* synthetic */ String f9831h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2097i(C2100l c2100l, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, List list, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9824a = i10;
        this.f9826c = c2100l;
        this.f9827d = localDateTime;
        this.f9828e = localDateTime2;
        this.f9829f = z6;
        this.f9830g = list;
        this.f9831h = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9824a) {
            case 0:
                return new C2097i(this.f9826c, this.f9827d, this.f9828e, this.f9829f, this.f9830g, this.f9831h, interfaceC7559c, 0);
            default:
                return new C2097i(this.f9826c, this.f9827d, this.f9828e, this.f9829f, this.f9830g, this.f9831h, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9824a) {
        }
        return ((C2097i) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM9773q;
        Object value;
        C6264a c6264a;
        ArrayList arrayListD0;
        Object objM9772p;
        Object value2;
        C6264a c6264a2;
        ArrayList arrayListD02;
        switch (this.f9824a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9825b;
                C2100l c2100l = this.f9826c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    g0 g0Var = c2100l.f9835g;
                    this.f9825b = 1;
                    objM9773q = g0Var.m9773q(this.f9831h, this.f9827d, this.f9828e, this.f9830g, this, this.f9829f);
                    if (objM9773q == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9773q = ((C6364n) obj).f30758a;
                }
                if (objM9773q instanceof C6363m) {
                    objM9773q = null;
                }
                Iterable iterable = (List) objM9773q;
                if (iterable == null) {
                    iterable = C6668r.f31943a;
                }
                c2100l.f9842n.m16232g("AnalyticsViewModel", "Total call data fetched: " + iterable);
                m1 m1Var = c2100l.f9844p;
                do {
                    value = m1Var.getValue();
                    c6264a = (C6264a) value;
                    arrayListD0 = AbstractC6663m.d0(c6264a.f30357a);
                    Iterator it = iterable.iterator();
                    while (true) {
                        int i11 = 0;
                        if (it.hasNext()) {
                            C9010j c9010j = (C9010j) it.next();
                            int size = arrayListD0.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    Object obj2 = arrayListD0.get(i12);
                                    i12++;
                                    if (((C9010j) obj2).f43405b != c9010j.f43405b) {
                                        i11++;
                                    }
                                } else {
                                    i11 = -1;
                                }
                            }
                            if (i11 != -1) {
                                arrayListD0.set(i11, c9010j);
                            } else {
                                arrayListD0.add(c9010j);
                            }
                        }
                    }
                } while (!m1Var.m15397i(value, C6264a.m12269a(c6264a, arrayListD0, null, false, false, null, null, null, null, false, 2046)));
                c2100l.m5806m(false);
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f9825b;
                C2100l c2100l2 = this.f9826c;
                if (i13 == 0) {
                    od.m10798c(obj);
                    g0 g0Var2 = c2100l2.f9835g;
                    this.f9825b = 1;
                    objM9772p = g0Var2.m9772p(this.f9831h, this.f9827d, this.f9828e, this.f9830g, this, this.f9829f);
                    if (objM9772p == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9772p = ((C6364n) obj).f30758a;
                }
                if (objM9772p instanceof C6363m) {
                    objM9772p = null;
                }
                Iterable iterable2 = (List) objM9772p;
                if (iterable2 == null) {
                    iterable2 = C6668r.f31943a;
                }
                c2100l2.f9842n.m16232g("AnalyticsViewModel", "Never attended and not picked up data fetched: " + iterable2);
                m1 m1Var2 = c2100l2.f9844p;
                do {
                    value2 = m1Var2.getValue();
                    c6264a2 = (C6264a) value2;
                    arrayListD02 = AbstractC6663m.d0(c6264a2.f30357a);
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        int i14 = 0;
                        if (it2.hasNext()) {
                            C9010j c9010j2 = (C9010j) it2.next();
                            int size2 = arrayListD02.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj3 = arrayListD02.get(i15);
                                    i15++;
                                    if (((C9010j) obj3).f43405b != c9010j2.f43405b) {
                                        i14++;
                                    }
                                } else {
                                    i14 = -1;
                                }
                            }
                            if (i14 != -1) {
                                arrayListD02.set(i14, c9010j2);
                            } else {
                                arrayListD02.add(c9010j2);
                            }
                        }
                    }
                } while (!m1Var2.m15397i(value2, C6264a.m12269a(c6264a2, arrayListD02, null, false, false, null, null, null, null, false, 2046)));
                c2100l2.m5806m(false);
                return a0.f30746a;
        }
    }
}
