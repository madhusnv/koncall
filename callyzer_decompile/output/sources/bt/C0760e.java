package bt;

import at.C0430a;
import ct.C1502a;
import ds.C1788l;
import dt.C1804j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.rb;
import gt.C2729a;
import hq.C3002g;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import l7.AbstractC4422v;
import l7.C4409i;
import og.pe;
import op.AbstractC5432a;
import org.bouncycastle.asn1.BERTags;
import pg.AbstractC5937r;
import qv.AbstractC6327b;
import qv.C6328c;
import rr.AbstractC6601a;
import s2.AbstractC6740i;
import sq.b1;
import sq.c3;
import sq.g2;
import sq.g3;
import sq.j3;
import t1.AbstractC7000y;
import tq.EnumC7204p;
import ts.C7216c;
import tx.InterfaceC7266z;
import vs.AbstractC7766h;
import w2.C7876o;
import w2.InterfaceC7879r;
import wx.InterfaceC8209j;
import xu.AbstractC8463b;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0760e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4804a;

    /* renamed from: b */
    public final /* synthetic */ Object f4805b;

    /* renamed from: c */
    public final /* synthetic */ Object f4806c;

    /* renamed from: d */
    public final /* synthetic */ Object f4807d;

    /* renamed from: e */
    public final /* synthetic */ Object f4808e;

    /* renamed from: f */
    public final /* synthetic */ Object f4809f;

    public /* synthetic */ C0760e(C1502a c1502a, InterfaceC2137a interfaceC2137a, C0430a c0430a, C1804j c1804j, InterfaceC2137a interfaceC2137a2, int i10) {
        this.f4804a = 0;
        this.f4806c = c1502a;
        this.f4805b = interfaceC2137a;
        this.f4808e = c0430a;
        this.f4809f = c1804j;
        this.f4807d = interfaceC2137a2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C3966o c3966o;
        AbstractC4422v abstractC4422v;
        switch (this.f4804a) {
            case 0:
                ((Integer) obj2).getClass();
                b0.m2074m((C1502a) this.f4806c, (InterfaceC2137a) this.f4805b, (C0430a) this.f4808e, (C1804j) this.f4809f, (InterfaceC2137a) this.f4807d, (InterfaceC3962k) obj, C3953b.m8496A(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11841e((C2729a) this.f4806c, (List) this.f4807d, (InterfaceC7879r) this.f4808e, (InterfaceC2137a) this.f4805b, (InterfaceC2139c) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(9));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11139d((EnumC7204p) this.f4806c, (C9008h) this.f4805b, (InterfaceC2139c) this.f4807d, (InterfaceC2141e) this.f4808e, (InterfaceC2139c) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 3:
                String str = (String) this.f4806c;
                List list = (List) this.f4805b;
                l7.a0 a0Var = (l7.a0) this.f4807d;
                h2 h2Var = (h2) this.f4808e;
                h2 h2Var2 = (h2) this.f4809f;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (str != null) {
                        c3966o2.m8607Y(1296068648);
                        C4409i c4409i = (C4409i) h2Var.getValue();
                        String str2 = (c4409i == null || (abstractC4422v = c4409i.f22046b) == null) ? null : abstractC4422v.f22135b.f29940f;
                        boolean z6 = ((C7216c) h2Var2.getValue()).f34520h;
                        boolean zM8616i = c3966o2.m8616i(a0Var);
                        Object objM8596M = c3966o2.m8596M();
                        if (zM8616i || objM8596M == C3961j.f20408a) {
                            objM8596M = new C3002g(a0Var, 1);
                            c3966o2.j0(objM8596M);
                        }
                        InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M;
                        c3966o = c3966o2;
                        AbstractC8463b.m15769b(str2, list, interfaceC2139c, z6, c3966o, 0);
                    } else {
                        c3966o = c3966o2;
                        c3966o.m8607Y(1271652149);
                    }
                    c3966o.m8623p(false);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12349n((rv.h0) this.f4806c, (C6328c) this.f4805b, (InterfaceC2139c) this.f4807d, (InterfaceC2139c) this.f4808e, (l7.a0) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12350o((l7.a0) this.f4806c, (rv.h0) this.f4805b, (InterfaceC2139c) this.f4807d, (InterfaceC8209j) this.f4808e, (InterfaceC2139c) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC6601a.m12660c((LocalDate) this.f4806c, (LocalDate) this.f4807d, (String) this.f4808e, (String) this.f4809f, (InterfaceC2137a) this.f4805b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC6601a.m12662e((InterfaceC7879r) this.f4806c, (String) this.f4807d, (List) this.f4808e, (InterfaceC2137a) this.f4805b, (InterfaceC2139c) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                g2.m13130H((String) this.f4806c, (String) this.f4808e, (InterfaceC2137a) this.f4805b, (InterfaceC2137a) this.f4807d, (InterfaceC2137a) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(3457));
                break;
            case 9:
                ((Integer) obj2).getClass();
                b1.m13101e((k2.w0) this.f4806c, (LocalDateTime) this.f4807d, (LocalDateTime) this.f4808e, (InterfaceC2141e) this.f4809f, (InterfaceC2137a) this.f4805b, (InterfaceC3962k) obj, C3953b.m8496A(7));
                break;
            case 10:
                List list2 = (List) this.f4806c;
                AbstractC7000y abstractC7000y = (AbstractC7000y) this.f4805b;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f4807d;
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f4808e;
                g4.o0 o0Var = (g4.o0) this.f4809f;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k2;
                if (c3966o3.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i10 = 0;
                    for (Object obj3 : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        g3 g3Var = (g3) obj3;
                        boolean z10 = abstractC7000y.m13263j() == i10;
                        c3 c3Var = new c3();
                        boolean zM8616i2 = c3966o3.m8616i(interfaceC7266z) | c3966o3.m8614g(abstractC7000y) | c3966o3.m8612e(i10);
                        Object objM8596M2 = c3966o3.m8596M();
                        if (zM8616i2 || objM8596M2 == C3961j.f20408a) {
                            objM8596M2 = new j3(interfaceC7266z, abstractC7000y, i10, 2);
                            c3966o3.j0(objM8596M2);
                        }
                        rb.m6295b(z10, (InterfaceC2137a) objM8596M2, C7876o.f37669a, AbstractC6740i.m12902d(-378682270, new C1788l(g3Var, interfaceC7879r, z10, o0Var), c3966o3), null, 0L, 0L, c3Var, c3966o3, 28032, BERTags.FLAGS);
                        i10 = i11;
                    }
                } else {
                    c3966o3.m8601S();
                }
                return qw.a0.f30746a;
            case 11:
                ((Integer) obj2).getClass();
                b1.m13094X((ArrayList) this.f4806c, (AbstractC7000y) this.f4805b, (InterfaceC7879r) this.f4807d, (InterfaceC7879r) this.f4808e, (g4.o0) this.f4809f, (InterfaceC3962k) obj, C3953b.m8496A(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC7766h.m14742a((String) this.f4806c, (String) this.f4807d, (String) this.f4808e, (String) this.f4809f, (InterfaceC2137a) this.f4805b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C0760e(Object obj, Object obj2, Object obj3, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f4804a = i11;
        this.f4806c = obj;
        this.f4807d = obj2;
        this.f4808e = obj3;
        this.f4805b = interfaceC2137a;
        this.f4809f = interfaceC2139c;
    }

    public /* synthetic */ C0760e(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f4804a = i11;
        this.f4806c = obj;
        this.f4807d = obj2;
        this.f4808e = obj3;
        this.f4809f = obj4;
        this.f4805b = interfaceC2137a;
    }

    public /* synthetic */ C0760e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4804a = i10;
        this.f4806c = obj;
        this.f4805b = obj2;
        this.f4807d = obj3;
        this.f4808e = obj4;
        this.f4809f = obj5;
    }

    public /* synthetic */ C0760e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f4804a = i11;
        this.f4806c = obj;
        this.f4805b = obj2;
        this.f4807d = obj3;
        this.f4808e = obj4;
        this.f4809f = obj5;
    }

    public /* synthetic */ C0760e(String str, String str2, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC2137a interfaceC2137a3, int i10) {
        this.f4804a = 8;
        this.f4806c = str;
        this.f4808e = str2;
        this.f4805b = interfaceC2137a;
        this.f4807d = interfaceC2137a2;
        this.f4809f = interfaceC2137a3;
    }
}
