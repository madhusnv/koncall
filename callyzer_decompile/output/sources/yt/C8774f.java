package yt;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import c9.C0908c;
import c9.C0914i;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import dr.C1768r;
import i7.C3178a;
import k9.C4032f;
import kn.C4132l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.m6;
import rw.C6668r;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vt.C7778i;
import vt.C7779j;
import vt.C7780k;
import vt.C7781l;
import vt.C7782m;
import vt.C7783n;
import vt.C7784o;
import vt.C7785p;
import vt.C7786q;
import vt.C7787r;
import wt.C8185c;
import wx.b1;
import wx.c1;
import wx.m1;
import yv.C8791f;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yt.f */
/* loaded from: classes3.dex */
public final class C8774f extends w0 {

    /* renamed from: b */
    public final C0914i f42410b;

    /* renamed from: c */
    public final C0908c f42411c;

    /* renamed from: d */
    public final C8805t f42412d;

    /* renamed from: e */
    public final C8810d f42413e;

    /* renamed from: f */
    public final Context f42414f;

    /* renamed from: g */
    public final m1 f42415g;

    /* renamed from: h */
    public final wx.w0 f42416h;

    /* renamed from: i */
    public final b1 f42417i;

    /* renamed from: j */
    public final b1 f42418j;

    public C8774f(C0914i c0914i, C0908c c0908c, C8805t c8805t, C8810d c8810d, Context context) {
        this.f42410b = c0914i;
        this.f42411c = c0908c;
        this.f42412d = c8805t;
        this.f42413e = c8810d;
        this.f42414f = context;
        m1 m1VarM15372c = c1.m15372c(new C8185c(false, C6668r.f31943a, false, false, -1, "", null, true, ""));
        this.f42415g = m1VarM15372c;
        this.f42416h = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        b1 b1VarM15371b = c1.m15371b(0, 0, null, 7);
        this.f42417i = b1VarM15371b;
        this.f42418j = b1VarM15371b;
        c0.m13502y(c8810d, null, null, new C8771c(this, interfaceC7559c, 0), 3);
        C3178a c3178aM5340g = q0.m5340g(this);
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c3178aM5340g, ExecutorC0495e.f3538c, null, new C4032f(this, interfaceC7559c, 28), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r1 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16128e(yt.C8774f r20, ww.AbstractC8193c r21) {
        /*
            r0 = r20
            r1 = r21
            c9.c r2 = r0.f42411c
            boolean r3 = r1 instanceof yt.C8772d
            if (r3 == 0) goto L19
            r3 = r1
            yt.d r3 = (yt.C8772d) r3
            int r4 = r3.f42405c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f42405c = r4
            goto L1e
        L19:
            yt.d r3 = new yt.d
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.f42403a
            vw.a r4 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r5 = r3.f42405c
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L3d
            if (r5 == r8) goto L39
            if (r5 != r6) goto L31
            og.od.m10798c(r1)
            goto L6a
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            og.od.m10798c(r1)
            goto L4d
        L3d:
            og.od.m10798c(r1)
            r3.f42405c = r8
            java.lang.Object r1 = r2.f5574b
            xm.y5 r1 = (xm.y5) r1
            java.lang.Object r1 = r1.m15696l(r3)
            if (r1 != r4) goto L4d
            goto L69
        L4d:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = rw.AbstractC6663m.m12743G(r1)
            mm.m r1 = (mm.C4802m) r1
            if (r1 == 0) goto L5a
            java.lang.String r1 = r1.f23891c
            goto L5b
        L5a:
            r1 = 0
        L5b:
            if (r1 == 0) goto L73
            r3.f42405c = r6
            java.lang.Object r2 = r2.f5574b
            xm.y5 r2 = (xm.y5) r2
            java.lang.Object r1 = r2.m15704t(r1, r3)
            if (r1 != r4) goto L6a
        L69:
            return r4
        L6a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r8) goto L73
            r7 = r8
        L73:
            if (r7 != 0) goto La3
            wx.m1 r1 = r0.f42415g
        L77:
            java.lang.Object r2 = r1.getValue()
            r9 = r2
            wt.c r9 = (wt.C8185c) r9
            wx.w0 r3 = r0.f42416h
            wx.k1 r3 = r3.f39340a
            java.lang.Object r3 = r3.getValue()
            wt.c r3 = (wt.C8185c) r3
            boolean r3 = r3.f39147d
            r13 = r3 ^ 1
            r18 = 0
            r19 = 503(0x1f7, float:7.05E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            wt.c r3 = wt.C8185c.m15342a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = r1.m15397i(r2, r3)
            if (r2 == 0) goto L77
        La3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.C8774f.m16128e(yt.f, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m16129f(m6 m6Var) {
        Object value;
        C8185c c8185c;
        C4132l c4132l;
        Object value2;
        Object value3;
        boolean z6 = m6Var instanceof C7782m;
        int i10 = 0;
        C8810d c8810d = this.f42413e;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C8773e(this, m6Var, interfaceC7559c, i10), 3);
            return;
        }
        int i11 = 1;
        if (m6Var instanceof C7778i) {
            c0.m13502y(c8810d, null, null, new C8773e(this, m6Var, interfaceC7559c, i11), 3);
            return;
        }
        if (m6Var instanceof C7786q) {
            c0.m13502y(c8810d, null, null, new C8773e(this, m6Var, interfaceC7559c, 2), 3);
            return;
        }
        boolean zEquals = m6Var.equals(C7780k.f37443a);
        m1 m1Var = this.f42415g;
        if (zEquals) {
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C8185c.m15342a((C8185c) value3, false, null, false, false, 0, null, null, false, null, 507)));
            return;
        }
        if (m6Var.equals(C7785p.f37449a)) {
            c0.m13502y(c8810d, null, null, new C1768r(this, interfaceC7559c, 12), 3);
            return;
        }
        if (m6Var.equals(C7781l.f37444a)) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C8185c.m15342a((C8185c) value2, false, null, false, false, 0, null, null, false, null, 503)));
            return;
        }
        if (m6Var instanceof C7779j) {
            do {
                value = m1Var.getValue();
                c8185c = (C8185c) value;
                String title = ((C7779j) m6Var).f37442a;
                this.f42410b.getClass();
                AbstractC4154l.m8923f(title, "title");
                String string = AbstractC5178p.g0(title).toString();
                c4132l = AbstractC5178p.m10101L(string) ? new C4132l(false, Integer.valueOf(R.string.this_field_required)) : string.length() > 150 ? new C4132l(false, Integer.valueOf(R.string.name_exceeds_150_ch)) : new C4132l(true, null);
            } while (!m1Var.m15397i(value, C8185c.m15342a(c8185c, false, null, false, false, 0, null, c4132l.f21089b, c4132l.f21088a, null, 319)));
            return;
        }
        if (m6Var instanceof C7787r) {
            this.f42412d.m16232g("Redirect to ExtensionLink", "extension redirection time error " + ((C7787r) m6Var).f37451a + " ");
            return;
        }
        if (m6Var.equals(C7784o.f37448a)) {
            c0.m13502y(c8810d, null, null, new C8771c(this, interfaceC7559c, i11), 3);
        } else {
            if (!m6Var.equals(C7783n.f37447a)) {
                throw new NoWhenBranchMatchedException();
            }
            C8791f c8791f = C8791f.f42457a;
            C8791f.m16174g(this.f42414f, "https://youtube.com/shorts/2kYYg4qEt8Y?si=Udj1_A9IP5B3QA9E");
        }
    }
}
