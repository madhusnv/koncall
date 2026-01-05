package ip;

import eo.C2082h;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import lv.C4531c;
import og.od;
import og.pe;
import qp.C6266c;
import qr.AbstractC6297u;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qw.a0;
import rw.AbstractC6663m;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.g0;
import ur.i0;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.c */
/* loaded from: classes3.dex */
public final class C3333c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17633a;

    /* renamed from: b */
    public int f17634b;

    /* renamed from: c */
    public final /* synthetic */ C3342l f17635c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3333c(C3342l c3342l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17633a = i10;
        this.f17635c = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17633a) {
            case 0:
                return new C3333c(this.f17635c, interfaceC7559c, 0);
            case 1:
                return new C3333c(this.f17635c, interfaceC7559c, 1);
            case 2:
                return new C3333c(this.f17635c, interfaceC7559c, 2);
            case 3:
                return new C3333c(this.f17635c, interfaceC7559c, 3);
            case 4:
                return new C3333c(this.f17635c, interfaceC7559c, 4);
            case 5:
                return new C3333c(this.f17635c, interfaceC7559c, 5);
            default:
                return new C3333c(this.f17635c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f17633a) {
        }
        return ((C3333c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15700p;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        switch (this.f17633a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f17634b;
                C3342l c3342l = this.f17635c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c3342l.f17692h;
                    this.f17634b = 1;
                    objM15700p = c2082h.f9747b.m15700p(this);
                    if (objM15700p == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15700p = obj;
                }
                EnumC7204p enumC7204p = (EnumC7204p) objM15700p;
                m1 m1Var = c3342l.f17698n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, null, false, null, enumC7204p, null, null, null, false, false, false, false, false, false, 0, false, false, 262111)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f17634b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f17635c.f36254d;
                    this.f17634b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f17634b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C3342l c3342l2 = this.f17635c;
                    c3342l2.f17696l.getClass();
                    v0 v0Var = x1.f40990o;
                    C3339i c3339i = new C3339i(c3342l2, null, 0);
                    this.f17634b = 1;
                    if (c1.m15379j(v0Var, c3339i, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f17634b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f17635c.f17700p;
                    this.f17634b = 1;
                    if (c4531c.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f17634b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f17634b = 1;
                    if (C3342l.m7667k(this.f17635c, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f17634b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f17634b = 1;
                    if (C3342l.m7667k(this.f17635c, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                C3342l c3342l3 = this.f17635c;
                m1 m1Var2 = c3342l3.f17698n;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f17634b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    ArrayList arrayListD0 = AbstractC6663m.d0(((i0) c3342l3.f36253c.f39340a.getValue()).f36224a);
                    int size = arrayListD0.size();
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj2 = arrayListD0.get(i18);
                        i18++;
                        int i19 = i17 + 1;
                        if (i17 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        AbstractC6297u abstractC6297u = (AbstractC6297u) obj2;
                        abstractC6297u.m12328l();
                        if (abstractC6297u instanceof C6294r) {
                            C6294r c6294r = c3342l3.f17701q;
                            do {
                                value4 = m1Var2.getValue();
                            } while (!m1Var2.m15397i(value4, C6266c.m12271a((C6266c) value4, null, false, null, null, c6294r.m12314o().mo14292b(), c6294r.m12314o().mo14291a(), null, false, false, false, false, false, false, 0, false, false, 261951)));
                        } else if (abstractC6297u instanceof C6296t) {
                            do {
                                value3 = m1Var2.getValue();
                            } while (!m1Var2.m15397i(value3, C6266c.m12271a((C6266c) value3, null, false, null, c3342l3.f17702r.m12322o().f36248a, null, null, null, false, false, false, false, false, false, 0, false, false, 262111)));
                        } else if (abstractC6297u instanceof C6295s) {
                            do {
                                value2 = m1Var2.getValue();
                            } while (!m1Var2.m15397i(value2, C6266c.m12271a((C6266c) value2, null, false, null, null, null, null, null, false, false, false, false, false, false, 0, false, c3342l3.f17703s.m12318o() == g0.YES, 131071)));
                        }
                        i17 = i19;
                    }
                    this.f17634b = 1;
                    if (C3342l.m7667k(c3342l3, this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
