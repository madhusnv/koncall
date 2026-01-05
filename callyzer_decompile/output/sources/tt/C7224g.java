package tt;

import a2.AbstractC0030c;
import android.content.Context;
import ay.ExecutorC0495e;
import bq.C0724d;
import bu.C0782a;
import c9.C0908c;
import cj.C0979e;
import d7.q0;
import d7.w0;
import en.C2073f;
import im.p1;
import kotlin.NoWhenBranchMatchedException;
import ln.C4494g;
import o6.s0;
import og.kd;
import pg.o6;
import qt.C6309d;
import qt.C6310e;
import qt.C6311f;
import qt.C6312g;
import qt.C6313h;
import qt.C6314i;
import qt.C6315j;
import qt.C6316k;
import rt.C6617a;
import rt.C6618b;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.q4;
import yv.C8791f;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tt.g */
/* loaded from: classes3.dex */
public final class C7224g extends w0 {

    /* renamed from: b */
    public final C0979e f34542b;

    /* renamed from: c */
    public final C0908c f34543c;

    /* renamed from: d */
    public final C4494g f34544d;

    /* renamed from: e */
    public final Context f34545e;

    /* renamed from: f */
    public final C8810d f34546f;

    /* renamed from: g */
    public final m1 f34547g;

    /* renamed from: h */
    public final wx.w0 f34548h;

    /* renamed from: i */
    public final m1 f34549i;

    /* renamed from: j */
    public final wx.w0 f34550j;

    /* renamed from: k */
    public final C7806h f34551k;

    /* renamed from: l */
    public final C8203d f34552l;

    /* renamed from: m */
    public final String f34553m;

    public C7224g(C0979e c0979e, C0908c c0908c, C4494g c4494g, Context context, C8810d c8810d) {
        this.f34542b = c0979e;
        this.f34543c = c0908c;
        this.f34544d = c4494g;
        this.f34545e = context;
        this.f34546f = c8810d;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C6618b(c6668r, c6668r, "", "", "", "", "", true, false, null, -1, 1, c6668r, "", "", "", true));
        this.f34547g = m1VarM15372c;
        this.f34548h = new wx.w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c("");
        this.f34549i = m1VarM15372c2;
        this.f34550j = new wx.w0(m1VarM15372c2);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f34551k = c7806hM11805a;
        this.f34552l = c1.m15389t(c7806hM11805a);
        this.f34553m = "Send to";
        c0.m13502y(c8810d, null, null, new C7220c(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C7220c(this, interfaceC7559c, 0), 3);
        C6617a c6617a = ((C2073f) ((q4) c0979e.f5804c).f40744d.getValue()).f9688c;
        if (c6617a != null) {
            String str = c6617a.f31778h;
            boolean z6 = c6617a.f31779i == 2;
            String strM121l = (str == null || str.length() == 0 || str.equals("lead")) ? AbstractC0030c.m121l("Send to +", z6 ? c6617a.f31781k : c6617a.f31774d, " ", z6 ? c6617a.f31780j : c6617a.f31772b) : "Message Templates";
            while (true) {
                Object value = m1VarM15372c.getValue();
                C6617a c6617a2 = c6617a;
                if (m1VarM15372c.m15397i(value, C6618b.m12669a((C6618b) value, null, null, null, c6617a.f31772b, c6617a.f31774d, c6617a.f31780j, c6617a.f31781k, false, false, c6617a2, 0, c6617a.f31779i, null, null, null, strM121l, false, 191879))) {
                    break;
                } else {
                    c6617a = c6617a2;
                }
            }
        }
        c0.m13502y(this.f34546f, null, null, new C7220c(this, interfaceC7559c, 3), 3);
        c0.m13502y(q0.m5340g(this), ExecutorC0495e.f3538c, null, new C7220c(this, interfaceC7559c, 4), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13450e(tt.C7224g r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof tt.C7218a
            if (r0 == 0) goto L13
            r0 = r6
            tt.a r0 = (tt.C7218a) r0
            int r1 = r0.f34528c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34528c = r1
            goto L18
        L13:
            tt.a r0 = new tt.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f34526a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34528c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r6)
            goto L65
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            og.od.m10798c(r6)
            goto L48
        L36:
            og.od.m10798c(r6)
            c9.c r6 = r5.f34543c
            r0.f34528c = r4
            java.lang.Object r6 = r6.f5574b
            xm.y5 r6 = (xm.y5) r6
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L48
            goto L64
        L48:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = rw.AbstractC6663m.m12743G(r6)
            mm.m r6 = (mm.C4802m) r6
            if (r6 == 0) goto L6c
            java.lang.String r6 = r6.f23891c
            if (r6 == 0) goto L6c
            cj.e r5 = r5.f34542b
            r0.f34528c = r3
            java.lang.Object r5 = r5.f5803b
            xm.y5 r5 = (xm.y5) r5
            java.lang.Object r6 = r5.m15704t(r6, r0)
            if (r6 != r1) goto L65
        L64:
            return r1
        L65:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            goto L6d
        L6c:
            r5 = 0
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.C7224g.m13450e(tt.g, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13451f(tt.C7224g r21, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.C7224g.m13451f(tt.g, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r1 == r6) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13452g(tt.C7224g r21, ww.AbstractC8193c r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt.C7224g.m13452g(tt.g, ww.c):java.lang.Object");
    }

    @Override // d7.w0
    /* renamed from: d */
    public final void mo1209d() {
        this.f34544d.m9337b(p1.MESSAGE_TEMPLATE_CALL_LOG_DATA, null);
    }

    /* renamed from: h */
    public final void m13453h(kd kdVar) {
        Object value;
        m1 m1Var;
        Object value2;
        C6315j c6315j;
        Object value3;
        boolean zEquals = kdVar.equals(C6309d.f30638a);
        C8810d c8810d = this.f34546f;
        InterfaceC7559c interfaceC7559c = null;
        if (zEquals) {
            c0.m13502y(c8810d, null, null, new C0782a(this, interfaceC7559c, 23), 3);
            return;
        }
        boolean z6 = kdVar instanceof C6315j;
        m1 m1Var2 = this.f34547g;
        if (z6) {
            do {
                m1Var = this.f34549i;
                value2 = m1Var.getValue();
                c6315j = (C6315j) kdVar;
            } while (!m1Var.m15397i(value2, c6315j.f30647a));
            do {
                value3 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value3, C6618b.m12669a((C6618b) value3, null, null, c6315j.f30647a, null, null, null, null, false, false, null, 0, 0, null, null, null, null, false, 262139)));
            return;
        }
        if (kdVar instanceof C6316k) {
            c0.m13502y(c8810d, null, null, new ps.c0(this, ((C6316k) kdVar).f30648a, interfaceC7559c, 28), 3);
            return;
        }
        boolean zEquals2 = kdVar.equals(C6312g.f30642a);
        wx.w0 w0Var = this.f34548h;
        if (zEquals2) {
            do {
                value = m1Var2.getValue();
            } while (!m1Var2.m15397i(value, C6618b.m12669a((C6618b) value, null, null, null, null, null, null, null, false, !((C6618b) w0Var.f39340a.getValue()).f31791i, null, 0, 0, null, null, null, null, false, 261887)));
            return;
        }
        if (kdVar instanceof C6314i) {
            C6314i c6314i = (C6314i) kdVar;
            String str = c6314i.f30644a;
            String str2 = c6314i.f30645b;
            int i10 = c6314i.f30646c;
            boolean z10 = i10 == 2;
            c0.m13502y(c8810d, null, null, new C0724d(this, str, str2, i10, z10 ? ((C6618b) w0Var.f39340a.getValue()).f31789g : ((C6618b) w0Var.f39340a.getValue()).f31787e, z10 ? ((C6618b) w0Var.f39340a.getValue()).f31788f : ((C6618b) w0Var.f39340a.getValue()).f31786d, null), 3);
            return;
        }
        if (kdVar instanceof C6310e) {
            C6310e c6310e = (C6310e) kdVar;
            c0.m13502y(c8810d, null, null, new s0(this, c6310e.f30639a, c6310e.f30640b, interfaceC7559c, 9), 3);
        } else if (kdVar.equals(C6313h.f30643a)) {
            c0.m13502y(c8810d, null, null, new C7220c(this, interfaceC7559c, 5), 3);
        } else {
            if (!kdVar.equals(C6311f.f30641a)) {
                throw new NoWhenBranchMatchedException();
            }
            C8791f c8791f = C8791f.f42457a;
            C8791f.m16174g(this.f34545e, "https://youtube.com/shorts/BtkNU9i9ijU?si=yH6LkeSg14VxquuK");
        }
    }
}
