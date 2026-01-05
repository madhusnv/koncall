package xm;

import a2.AbstractC0030c;
import en.AbstractC2072e;
import en.C2069b;
import en.C2073f;
import en.C2074g;
import fn.C2336i;
import iu.AbstractC3353e;
import iu.C3349a;
import java.util.List;
import k9.C4032f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5415q;
import pg.o6;
import rt.C6617a;
import rw.C6668r;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q4 {

    /* renamed from: a */
    public final C8805t f40741a;

    /* renamed from: b */
    public final C2336i f40742b;

    /* renamed from: c */
    public final C8810d f40743c;

    /* renamed from: d */
    public final wx.m1 f40744d;

    /* renamed from: e */
    public final wx.v0 f40745e;

    /* renamed from: f */
    public final wx.w0 f40746f;

    /* renamed from: g */
    public final C7806h f40747g;

    /* renamed from: h */
    public final C8203d f40748h;

    /* renamed from: i */
    public final wx.m1 f40749i;

    /* renamed from: j */
    public final wx.w0 f40750j;

    /* renamed from: k */
    public final wx.m1 f40751k;

    /* renamed from: l */
    public final wx.w0 f40752l;

    /* renamed from: m */
    public final wx.m1 f40753m;

    /* renamed from: n */
    public final wx.w0 f40754n;

    public q4(C2336i dataStoreSource, C8805t c8805t, C8810d c8810d) {
        AbstractC4154l.m8923f(dataStoreSource, "dataStoreSource");
        this.f40741a = c8805t;
        this.f40742b = dataStoreSource;
        this.f40743c = c8810d;
        C6668r c6668r = C6668r.f31943a;
        wx.m1 m1VarM15372c = wx.c1.m15372c(new C2073f(false, 0, null, false, null, c6668r, false, c6668r));
        this.f40744d = m1VarM15372c;
        this.f40745e = new wx.v0(m1VarM15372c);
        this.f40746f = new wx.w0(wx.c1.m15372c(new C6617a(null, null, null, null, null, null, null, null, 0, null, null, null, 4095)));
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f40747g = c7806hM11805a;
        this.f40748h = wx.c1.m15389t(c7806hM11805a);
        wx.m1 m1VarM15372c2 = wx.c1.m15372c(C2069b.f9683a);
        this.f40749i = m1VarM15372c2;
        this.f40750j = new wx.w0(m1VarM15372c2);
        wx.m1 m1VarM15372c3 = wx.c1.m15372c(new C2074g(null, false, false, c6668r));
        this.f40751k = m1VarM15372c3;
        this.f40752l = new wx.w0(m1VarM15372c3);
        wx.m1 m1VarM15372c4 = wx.c1.m15372c(C3349a.f17731a);
        this.f40753m = m1VarM15372c4;
        this.f40754n = new wx.w0(m1VarM15372c4);
        tx.c0.m13502y(c8810d, null, null, new h3(this, interfaceC7559c, 4), 3);
        tx.c0.m13502y(c8810d, null, null, new C4032f(this, interfaceC7559c, 25), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* renamed from: a */
    public final void m15601a(im.p1 p1Var, Object obj) {
        Object value;
        Object value2;
        Object value3;
        wx.m1 m1Var;
        Object value4;
        wx.m1 m1Var2;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        q4 q4Var = this;
        im.p1 p1Var2 = p1Var;
        AbstractC4154l.m8923f(p1Var2, "const");
        int i10 = p4.f40714a[p1Var2.ordinal()];
        C8810d c8810d = q4Var.f40743c;
        wx.m1 m1Var3 = q4Var.f40751k;
        wx.m1 m1Var4 = q4Var.f40744d;
        boolean z6 = true;
        switch (i10) {
            case 1:
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(Boolean.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : 0).toString());
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                do {
                    value = m1Var4.getValue();
                } while (!m1Var4.m15397i(value, C2073f.m5790a((C2073f) value, zBooleanValue, 0, null, null, null, false, null, 254)));
                return;
            case 2:
                if (!(obj instanceof Integer)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(Integer.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                int iIntValue = ((Number) obj).intValue();
                do {
                    value2 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value2, C2073f.m5790a((C2073f) value2, false, iIntValue, null, null, null, false, null, 253)));
                return;
            case 3:
                if (obj != null) {
                    z6 = obj instanceof C5415q;
                }
                if (!z6) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(C5415q.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                C5415q c5415q = (C5415q) obj;
                while (true) {
                    Object value10 = m1Var3.getValue();
                    C5415q c5415q2 = c5415q;
                    if (m1Var3.m15397i(value10, C2074g.m5791a((C2074g) value10, c5415q2, false, false, null, 14))) {
                        tx.c0.m13502y(c8810d, null, null, new o6.s0(c5415q2, q4Var, p1Var2, (InterfaceC7559c) str, 25), 3);
                        return;
                    } else {
                        q4Var = this;
                        p1Var2 = p1Var;
                        c5415q = c5415q2;
                    }
                }
            case 4:
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(Boolean.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                while (true) {
                    Object value11 = m1Var3.getValue();
                    boolean z10 = zBooleanValue2;
                    if (m1Var3.m15397i(value11, C2074g.m5791a((C2074g) value11, null, zBooleanValue2, false, null, 13))) {
                        return;
                    } else {
                        zBooleanValue2 = z10;
                    }
                }
            case 5:
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(Boolean.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                while (true) {
                    Object value12 = m1Var3.getValue();
                    boolean z11 = zBooleanValue3;
                    if (m1Var3.m15397i(value12, C2074g.m5791a((C2074g) value12, null, false, zBooleanValue3, null, 11))) {
                        return;
                    } else {
                        zBooleanValue3 = z11;
                    }
                }
            case 6:
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(List.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                List list = (List) obj;
                do {
                    value3 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value3, C2074g.m5791a((C2074g) value3, null, false, false, list, 7)));
                tx.c0.m13502y(c8810d, null, null, new h3(q4Var, list, str, 6), 3);
                return;
            case 7:
                if (!(obj instanceof AbstractC3353e)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(AbstractC3353e.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                AbstractC3353e abstractC3353e = (AbstractC3353e) obj;
                do {
                    m1Var = q4Var.f40753m;
                    value4 = m1Var.getValue();
                } while (!m1Var.m15397i(value4, abstractC3353e));
                return;
            case 8:
                if (!(obj instanceof AbstractC2072e)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(AbstractC2072e.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                AbstractC2072e abstractC2072e = (AbstractC2072e) obj;
                do {
                    m1Var2 = q4Var.f40749i;
                    value5 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value5, abstractC2072e));
                return;
            case 9:
                if (obj != null) {
                    z6 = obj instanceof C6617a;
                }
                if (!z6) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(C6617a.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                C6617a c6617a = (C6617a) obj;
                do {
                    value6 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value6, C2073f.m5790a((C2073f) value6, false, 0, c6617a, null, null, false, null, 251)));
                return;
            case 10:
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(List.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                List list2 = (List) obj;
                do {
                    value7 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value7, C2073f.m5790a((C2073f) value7, false, 0, null, null, list2, false, null, 223)));
                return;
            case 11:
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(Boolean.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                do {
                    value8 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value8, C2073f.m5790a((C2073f) value8, false, 0, null, null, null, zBooleanValue4, null, 191)));
                return;
            case 12:
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException(AbstractC0030c.m121l("Expected ", kotlin.jvm.internal.a0.m8901a(List.class).m8914c(), " but got ", obj != null ? obj.getClass().getSimpleName() : null).toString());
                }
                List list3 = (List) obj;
                do {
                    value9 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value9, C2073f.m5790a((C2073f) value9, false, 0, null, null, null, false, list3, 127)));
                return;
            case 13:
                tx.c0.m13502y(c8810d, null, null, new h3(q4Var, obj, str, 5), 3);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
