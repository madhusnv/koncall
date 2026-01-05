package dt;

import android.content.Context;
import at.C0431b;
import at.EnumC0434e;
import aw.C0483w;
import bq.C0732l;
import bs.C0749g;
import d7.w0;
import java.util.Iterator;
import java.util.List;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C4166x;
import kotlin.jvm.internal.C4168z;
import nn.C5113e;
import og.pe;
import pg.o6;
import qn.C6263l;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yk.C8687a;
import yx.C8810d;
import zs.C9048m;
import zs.C9049n;
import zs.C9050o;
import zs.C9051p;
import zs.C9052q;
import zs.C9053r;
import zs.C9054s;
import zs.C9055t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.s */
/* loaded from: classes3.dex */
public final class C1813s extends w0 {

    /* renamed from: b */
    public final C6263l f8758b;

    /* renamed from: c */
    public final C8687a f8759c;

    /* renamed from: d */
    public final C5113e f8760d;

    /* renamed from: e */
    public final C8810d f8761e;

    /* renamed from: f */
    public final Context f8762f;

    /* renamed from: g */
    public final Context f8763g;

    /* renamed from: h */
    public final m1 f8764h;

    /* renamed from: i */
    public final wx.w0 f8765i;

    /* renamed from: j */
    public final C7806h f8766j;

    /* renamed from: k */
    public final C8203d f8767k;

    public C1813s(C6263l c6263l, C8687a c8687a, C5113e c5113e, C8810d c8810d, Context context, Context context2) {
        this.f8758b = c6263l;
        this.f8759c = c8687a;
        this.f8760d = c5113e;
        this.f8761e = c8810d;
        this.f8762f = context;
        this.f8763g = context2;
        EnumC0434e enumC0434e = EnumC0434e.CREATE_SCREEN;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C0431b("", 0, "", 0, true, true, null, null, "", false, "", 0, enumC0434e, c6668r, c6668r, "", "", "", false, false, false));
        this.f8764h = m1VarM15372c;
        this.f8765i = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f8766j = c7806hM11805a;
        this.f8767k = c1.m15389t(c7806hM11805a);
        c0.m13502y(c8810d, null, null, new C0732l(this, null, 3), 3);
    }

    /* renamed from: e */
    public static final Object m5478e(C1813s c1813s, AbstractC8199i abstractC8199i) {
        return c1813s.f8758b.m12265k(((C0431b) c1813s.f8765i.f39340a.getValue()).f3179k, abstractC8199i);
    }

    /* renamed from: f */
    public final void m5479f(sc.c0 c0Var) {
        Object value;
        Object value2;
        String str;
        Object value3;
        String str2;
        Object value4;
        C0431b c0431b;
        Integer num;
        Integer num2;
        Object value5;
        boolean z6 = c0Var instanceof C9048m;
        m1 m1Var = this.f8764h;
        if (z6) {
            do {
                value5 = m1Var.getValue();
            } while (!m1Var.m15397i(value5, C0431b.m1454a((C0431b) value5, null, 0, null, 0, false, false, null, null, null, ((C9048m) c0Var).f43557a, null, null, null, null, null, null, null, null, false, 2096639)));
            return;
        }
        boolean z10 = c0Var instanceof C9050o;
        C8810d c8810d = this.f8761e;
        InterfaceC7559c interfaceC7559c = null;
        C8687a c8687a = this.f8759c;
        if (!z10) {
            if (c0Var instanceof C9052q) {
                do {
                    value3 = m1Var.getValue();
                    str2 = ((C9052q) c0Var).f43562a;
                    c8687a.getClass();
                } while (!m1Var.m15397i(value3, C0431b.m1454a((C0431b) value3, null, 0, str2, 0, false, C8687a.m16039p(str2).f21088a, null, C8687a.m16039p(str2).f21089b, null, false, null, null, null, null, null, null, null, null, false, 2096987)));
                return;
            }
            if (c0Var instanceof C9055t) {
                do {
                    value2 = m1Var.getValue();
                    str = ((C9055t) c0Var).f43565a;
                    c8687a.getClass();
                } while (!m1Var.m15397i(value2, C0431b.m1454a((C0431b) value2, str, 0, null, 0, C8687a.m16041r(str).f21088a, false, C8687a.m16041r(str).f21089b, null, null, false, null, null, null, null, null, null, null, null, false, 2097070)));
                return;
            }
            if (c0Var instanceof C9051p) {
                C4166x c4166x = new C4166x();
                C4168z c4168z = new C4168z();
                c4168z.f21164a = "";
                c0.m13502y(c8810d, null, null, new C0749g(this, c0Var, c4166x, c4168z, null, 2), 3);
                return;
            }
            if (c0Var instanceof C9053r) {
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C0431b.m1454a((C0431b) value, null, 0, null, 0, false, false, null, null, null, false, null, null, null, null, null, ((C9053r) c0Var).f43563a, null, null, false, 2064383)));
                return;
            } else if (c0Var instanceof C9054s) {
                c0.m13502y(c8810d, null, null, new C1811q(c0Var, this, null), 3);
                return;
            } else {
                if (!(c0Var instanceof C9049n)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0.m13502y(c8810d, null, null, new C1808n(this, interfaceC7559c, 2), 3);
                return;
            }
        }
        wx.w0 w0Var = this.f8765i;
        String str3 = ((C0431b) w0Var.f39340a.getValue()).f3169a;
        c8687a.getClass();
        C4132l c4132lM16041r = C8687a.m16041r(str3);
        C4132l c4132lM16039p = C8687a.m16039p(((C0431b) w0Var.f39340a.getValue()).f3171c);
        C4132l c4132lM16040q = C8687a.m16040q(((C0431b) w0Var.f39340a.getValue()).f3169a);
        C4132l c4132lM16040q2 = C8687a.m16040q(((C0431b) w0Var.f39340a.getValue()).f3171c);
        boolean z11 = c4132lM16041r.f21088a && c4132lM16040q.f21088a;
        boolean z12 = c4132lM16039p.f21088a && c4132lM16040q2.f21088a;
        List listM10834i = pe.m10834i(Boolean.valueOf(z11), Boolean.valueOf(z12));
        if (!listM10834i.isEmpty()) {
            Iterator it = listM10834i.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    do {
                        value4 = m1Var.getValue();
                        c0431b = (C0431b) value4;
                        if (z11) {
                            num = null;
                        } else {
                            Integer num3 = c4132lM16041r.f21089b;
                            if (num3 == null) {
                                num3 = c4132lM16040q.f21089b;
                            }
                            num = num3;
                        }
                        if (z12) {
                            num2 = null;
                        } else {
                            Integer num4 = c4132lM16039p.f21089b;
                            if (num4 == null) {
                                num4 = c4132lM16040q2.f21089b;
                            }
                            num2 = num4;
                        }
                    } while (!m1Var.m15397i(value4, C0431b.m1454a(c0431b, null, 0, null, 0, z11, z12, num, num2, null, false, null, null, null, null, null, null, null, null, false, 2096911)));
                    return;
                }
            }
        }
        int i10 = AbstractC1805k.f8738a[((C0431b) w0Var.f39340a.getValue()).f3181m.ordinal()];
        if (i10 == 1) {
            c0.m13502y(c8810d, null, null, new C1809o(this, interfaceC7559c, 0), 3);
        } else if (i10 == 2) {
            c0.m13502y(c8810d, null, null, new C1809o(this, interfaceC7559c, 1), 3);
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c0.m13502y(c8810d, null, null, new C0483w(this, interfaceC7559c, 2), 3);
        }
    }
}
