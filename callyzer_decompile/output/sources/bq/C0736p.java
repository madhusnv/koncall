package bq;

import dq.C1750l;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Iterator;
import og.od;
import og.pe;
import qp.C6271h;
import qp.C6272i;
import qp.C6274k;
import qr.AbstractC6297u;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qw.a0;
import sp.C6883f;
import tx.InterfaceC7266z;
import up.C7494g;
import ur.AbstractC7524q;
import ur.g0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wp.C8141g;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.p */
/* loaded from: classes3.dex */
public final class C0736p extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4633a;

    /* renamed from: b */
    public Iterator f4634b;

    /* renamed from: c */
    public int f4635c;

    /* renamed from: d */
    public int f4636d;

    /* renamed from: e */
    public int f4637e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f4638f;

    /* renamed from: g */
    public AbstractC7524q f4639g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC7524q f4640h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0736p(ArrayList arrayList, AbstractC7524q abstractC7524q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4633a = i10;
        this.f4638f = arrayList;
        this.f4640h = abstractC7524q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4633a) {
            case 0:
                return new C0736p(this.f4638f, (C0737q) this.f4640h, interfaceC7559c, 0);
            case 1:
                return new C0736p(this.f4638f, (C1750l) this.f4640h, interfaceC7559c, 1);
            case 2:
                return new C0736p(this.f4638f, (C6883f) this.f4640h, interfaceC7559c, 2);
            case 3:
                return new C0736p(this.f4638f, (C7494g) this.f4640h, interfaceC7559c, 3);
            default:
                return new C0736p(this.f4638f, (C8141g) this.f4640h, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4633a) {
        }
        return ((C0736p) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C0737q c0737q;
        int i10;
        Iterator it;
        int i11;
        Object value;
        Object value2;
        C1750l c1750l;
        int i12;
        Iterator it2;
        int i13;
        Object value3;
        Object value4;
        C6883f c6883f;
        int i14;
        Iterator it3;
        int i15;
        Object value5;
        Object value6;
        Object value7;
        C7494g c7494g;
        int i16;
        Iterator it4;
        int i17;
        Object value8;
        Object value9;
        Object value10;
        C8141g c8141g;
        int i18;
        Iterator it5;
        int i19;
        Object value11;
        Object value12;
        Object value13;
        switch (this.f4633a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f4637e;
                if (i20 == 0) {
                    od.m10798c(obj);
                    c0737q = (C0737q) this.f4640h;
                    i10 = 0;
                    it = this.f4638f.iterator();
                    i11 = 0;
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f4636d;
                    i11 = this.f4635c;
                    it = this.f4634b;
                    c0737q = (C0737q) this.f4639g;
                    od.m10798c(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    int i21 = i10 + 1;
                    if (i10 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u = (AbstractC6297u) next;
                    abstractC6297u.m12328l();
                    if (abstractC6297u instanceof C6294r) {
                        m1 m1Var = c0737q.f4649n;
                        C6294r c6294r = c0737q.f4652q;
                        do {
                            value2 = m1Var.getValue();
                        } while (!m1Var.m15397i(value2, C6274k.m12278a((C6274k) value2, null, false, null, c6294r.m12314o().mo14292b(), c6294r.m12314o().mo14291a(), null, false, false, false, false, false, false, 0, false, false, 262047)));
                    } else if (abstractC6297u instanceof C6296t) {
                        m1 m1Var2 = c0737q.f4649n;
                        do {
                            value = m1Var2.getValue();
                        } while (!m1Var2.m15397i(value, C6274k.m12278a((C6274k) value, null, false, c0737q.f4653r.m12322o().f36248a, null, null, null, false, false, false, false, false, false, 0, false, false, 262127)));
                    }
                    this.f4639g = c0737q;
                    this.f4634b = it;
                    this.f4635c = i11;
                    this.f4636d = i21;
                    this.f4637e = 1;
                    if (C0737q.m2032k(c0737q, this) == enumC7794a) {
                        return enumC7794a;
                    }
                    i10 = i21;
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i22 = this.f4637e;
                if (i22 == 0) {
                    od.m10798c(obj);
                    c1750l = (C1750l) this.f4640h;
                    i12 = 0;
                    it2 = this.f4638f.iterator();
                    i13 = 0;
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f4636d;
                    i13 = this.f4635c;
                    it2 = this.f4634b;
                    c1750l = (C1750l) this.f4639g;
                    od.m10798c(obj);
                }
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i23 = i12 + 1;
                    if (i12 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u2 = (AbstractC6297u) next2;
                    abstractC6297u2.m12328l();
                    if (abstractC6297u2 instanceof C6294r) {
                        m1 m1Var3 = c1750l.f8475n;
                        C6294r c6294r2 = c1750l.f8478q;
                        do {
                            value4 = m1Var3.getValue();
                        } while (!m1Var3.m15397i(value4, C6274k.m12278a((C6274k) value4, null, false, null, c6294r2.m12314o().mo14292b(), c6294r2.m12314o().mo14291a(), null, false, false, false, false, false, false, 0, false, false, 262047)));
                    } else if (abstractC6297u2 instanceof C6296t) {
                        m1 m1Var4 = c1750l.f8475n;
                        do {
                            value3 = m1Var4.getValue();
                        } while (!m1Var4.m15397i(value3, C6274k.m12278a((C6274k) value3, null, false, c1750l.f8479r.m12322o().f36248a, null, null, null, false, false, false, false, false, false, 0, false, false, 262127)));
                    }
                    this.f4639g = c1750l;
                    this.f4634b = it2;
                    this.f4635c = i13;
                    this.f4636d = i23;
                    this.f4637e = 1;
                    if (C1750l.m5441k(c1750l, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                    i12 = i23;
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i24 = this.f4637e;
                if (i24 == 0) {
                    od.m10798c(obj);
                    c6883f = (C6883f) this.f4640h;
                    i14 = 0;
                    it3 = this.f4638f.iterator();
                    i15 = 0;
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = this.f4636d;
                    i15 = this.f4635c;
                    it3 = this.f4634b;
                    c6883f = (C6883f) this.f4639g;
                    od.m10798c(obj);
                }
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    int i25 = i14 + 1;
                    if (i14 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u3 = (AbstractC6297u) next3;
                    abstractC6297u3.m12328l();
                    if (abstractC6297u3 instanceof C6294r) {
                        m1 m1Var5 = c6883f.f32719n;
                        C6294r c6294r3 = c6883f.f32722q;
                        do {
                            value7 = m1Var5.getValue();
                        } while (!m1Var5.m15397i(value7, C6271h.m12275a((C6271h) value7, null, null, c6294r3.m12314o().mo14292b(), c6294r3.m12314o().mo14291a(), null, false, false, false, 243)));
                    } else if (abstractC6297u3 instanceof C6295s) {
                        m1 m1Var6 = c6883f.f32719n;
                        do {
                            value6 = m1Var6.getValue();
                        } while (!m1Var6.m15397i(value6, C6271h.m12275a((C6271h) value6, null, null, null, null, null, false, false, c6883f.f32721p.m12318o() == g0.YES, 127)));
                    } else if (abstractC6297u3 instanceof C6296t) {
                        m1 m1Var7 = c6883f.f32719n;
                        do {
                            value5 = m1Var7.getValue();
                        } while (!m1Var7.m15397i(value5, C6271h.m12275a((C6271h) value5, null, c6883f.f32723r.m12322o().f36248a, null, null, null, false, false, false, 253)));
                    }
                    this.f4639g = c6883f;
                    this.f4634b = it3;
                    this.f4635c = i15;
                    this.f4636d = i25;
                    this.f4637e = 1;
                    if (C6883f.m13070h(c6883f, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                    i14 = i25;
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i26 = this.f4637e;
                if (i26 == 0) {
                    od.m10798c(obj);
                    c7494g = (C7494g) this.f4640h;
                    i16 = 0;
                    it4 = this.f4638f.iterator();
                    i17 = 0;
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i16 = this.f4636d;
                    i17 = this.f4635c;
                    it4 = this.f4634b;
                    c7494g = (C7494g) this.f4639g;
                    od.m10798c(obj);
                }
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    int i27 = i16 + 1;
                    if (i16 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u4 = (AbstractC6297u) next4;
                    abstractC6297u4.m12328l();
                    if (abstractC6297u4 instanceof C6294r) {
                        m1 m1Var8 = c7494g.f36182o;
                        C6294r c6294r4 = c7494g.f36185r;
                        do {
                            value10 = m1Var8.getValue();
                        } while (!m1Var8.m15397i(value10, C6272i.m12276a((C6272i) value10, null, null, null, null, c6294r4.m12314o().mo14292b(), c6294r4.m12314o().mo14291a(), null, false, false, 975)));
                    } else if (abstractC6297u4 instanceof C6295s) {
                        m1 m1Var9 = c7494g.f36182o;
                        do {
                            value9 = m1Var9.getValue();
                        } while (!m1Var9.m15397i(value9, C6272i.m12276a((C6272i) value9, null, null, null, null, null, null, null, false, c7494g.f36184q.m12318o() == g0.YES, 511)));
                    } else if (abstractC6297u4 instanceof C6296t) {
                        m1 m1Var10 = c7494g.f36182o;
                        do {
                            value8 = m1Var10.getValue();
                        } while (!m1Var10.m15397i(value8, C6272i.m12276a((C6272i) value8, null, null, null, c7494g.f36186s.m12322o().f36248a, null, null, null, false, false, 1015)));
                    }
                    this.f4639g = c7494g;
                    this.f4634b = it4;
                    this.f4635c = i17;
                    this.f4636d = i27;
                    this.f4637e = 1;
                    if (C7494g.m14290h(c7494g, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                    i16 = i27;
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i28 = this.f4637e;
                if (i28 == 0) {
                    od.m10798c(obj);
                    c8141g = (C8141g) this.f4640h;
                    i18 = 0;
                    it5 = this.f4638f.iterator();
                    i19 = 0;
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i18 = this.f4636d;
                    i19 = this.f4635c;
                    it5 = this.f4634b;
                    c8141g = (C8141g) this.f4639g;
                    od.m10798c(obj);
                }
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    int i29 = i18 + 1;
                    if (i18 < 0) {
                        pe.m10842q();
                        throw null;
                    }
                    AbstractC6297u abstractC6297u5 = (AbstractC6297u) next5;
                    abstractC6297u5.m12328l();
                    if (abstractC6297u5 instanceof C6294r) {
                        m1 m1Var11 = c8141g.f38990o;
                        C6294r c6294r5 = c8141g.f38993r;
                        do {
                            value13 = m1Var11.getValue();
                        } while (!m1Var11.m15397i(value13, C6272i.m12276a((C6272i) value13, null, null, null, null, c6294r5.m12314o().mo14292b(), c6294r5.m12314o().mo14291a(), null, false, false, 975)));
                    } else if (abstractC6297u5 instanceof C6295s) {
                        m1 m1Var12 = c8141g.f38990o;
                        do {
                            value12 = m1Var12.getValue();
                        } while (!m1Var12.m15397i(value12, C6272i.m12276a((C6272i) value12, null, null, null, null, null, null, null, false, c8141g.f38992q.m12318o() == g0.YES, 511)));
                    } else if (abstractC6297u5 instanceof C6296t) {
                        m1 m1Var13 = c8141g.f38990o;
                        do {
                            value11 = m1Var13.getValue();
                        } while (!m1Var13.m15397i(value11, C6272i.m12276a((C6272i) value11, null, null, null, c8141g.f38994s.m12322o().f36248a, null, null, null, false, false, 1015)));
                    }
                    this.f4639g = c8141g;
                    this.f4634b = it5;
                    this.f4635c = i19;
                    this.f4636d = i29;
                    this.f4637e = 1;
                    if (C8141g.m15318h(c8141g, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                    i18 = i29;
                }
                return a0.f30746a;
        }
    }
}
