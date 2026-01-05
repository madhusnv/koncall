package pt;

import ap.C0395h;
import bu.C0782a;
import c9.C0908c;
import cj.C0979e;
import d7.w0;
import en.C2073f;
import fb.AbstractC2227a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import mt.C4873b;
import mt.C4874c;
import mt.C4875d;
import mt.C4876e;
import mt.C4877f;
import mt.C4878g;
import mt.C4879h;
import mt.C4880i;
import mt.C4881j;
import mt.C4882k;
import nn.C5113e;
import nt.C5137a;
import nt.C5138b;
import nt.C5139c;
import nx.AbstractC5185w;
import ot.C5740h;
import p7.C5835f;
import pg.o6;
import qn.C6263l;
import rt.C6617a;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.C6668r;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.q4;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pt.f */
/* loaded from: classes3.dex */
public final class C6032f extends w0 {

    /* renamed from: b */
    public final C6263l f29471b;

    /* renamed from: c */
    public final C0979e f29472c;

    /* renamed from: d */
    public final C5113e f29473d;

    /* renamed from: e */
    public final C0908c f29474e;

    /* renamed from: f */
    public final C8803r f29475f;

    /* renamed from: g */
    public final C8805t f29476g;

    /* renamed from: h */
    public final C8810d f29477h;

    /* renamed from: i */
    public final m1 f29478i;

    /* renamed from: j */
    public final wx.w0 f29479j;

    /* renamed from: k */
    public final C7806h f29480k;

    /* renamed from: l */
    public final C8203d f29481l;

    public C6032f(C6263l c6263l, C0979e c0979e, C5113e c5113e, C0908c c0908c, C8803r networkMonitorUtil, C8805t c8805t, C8810d c8810d) {
        Object value;
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        this.f29471b = c6263l;
        this.f29472c = c0979e;
        this.f29473d = c5113e;
        this.f29474e = c0908c;
        this.f29475f = networkMonitorUtil;
        this.f29476g = c8805t;
        this.f29477h = c8810d;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C5137a(c6668r, c6668r, c6668r, false, false, c6668r, c6668r, "", "", false, "", "", true, true, true, "", false, null));
        this.f29478i = m1VarM15372c;
        this.f29479j = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f29480k = c7806hM11805a;
        this.f29481l = c1.m15389t(c7806hM11805a);
        C6617a c6617a = ((C2073f) ((q4) c0979e.f5804c).f40744d.getValue()).f9688c;
        if (c6617a != null) {
            boolean z6 = c6617a.f31779i == 2;
            String str = z6 ? c6617a.f31780j : c6617a.f31772b;
            String str2 = z6 ? c6617a.f31781k : c6617a.f31774d;
            do {
                value = m1VarM15372c.getValue();
            } while (!m1VarM15372c.m15397i(value, C5137a.m10057a((C5137a) value, null, null, null, false, false, null, null, null, false, str, str2, false, false, null, false, null, 1036287)));
        }
        c0.m13502y(this.f29477h, null, null, new C6027a(this, interfaceC7559c, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12045e(pt.C6032f r5, ww.AbstractC8193c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof pt.C6030d
            if (r0 == 0) goto L16
            r0 = r6
            pt.d r0 = (pt.C6030d) r0
            int r1 = r0.f29465c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f29465c = r1
            goto L1b
        L16:
            pt.d r0 = new pt.d
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f29463a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29465c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            og.od.m10798c(r6)
            goto L68
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            og.od.m10798c(r6)
            goto L4b
        L39:
            og.od.m10798c(r6)
            c9.c r6 = r5.f29474e
            r0.f29465c = r4
            java.lang.Object r6 = r6.f5574b
            xm.y5 r6 = (xm.y5) r6
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L4b
            goto L67
        L4b:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = rw.AbstractC6663m.m12743G(r6)
            mm.m r6 = (mm.C4802m) r6
            if (r6 == 0) goto L6f
            java.lang.String r6 = r6.f23891c
            if (r6 == 0) goto L6f
            cj.e r5 = r5.f29472c
            r0.f29465c = r3
            java.lang.Object r5 = r5.f5803b
            xm.y5 r5 = (xm.y5) r5
            java.lang.Object r6 = r5.m15704t(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            goto L70
        L6f:
            r5 = 0
        L70:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.C6032f.m12045e(pt.f, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final void m12046f(C6032f c6032f) {
        Object value;
        String strM12748L;
        Object value2;
        m1 m1Var = c6032f.f29478i;
        C8810d c8810d = c6032f.f29477h;
        wx.w0 w0Var = c6032f.f29479j;
        InterfaceC7559c interfaceC7559c = null;
        if (((C5137a) w0Var.f39340a.getValue()).f25160j) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C5137a.m10057a((C5137a) value2, null, null, AbstractC6663m.c0(AbstractC6663m.g0(AbstractC2227a.m5931b(((C5137a) m1Var.getValue()).f25158h))), false, false, null, null, ((C5137a) w0Var.f39340a.getValue()).f25158h, false, null, null, false, false, null, false, null, 1047547)));
            c0.m13502y(c8810d, null, null, new C0782a(c6032f, interfaceC7559c, 14), 3);
        } else {
            do {
                value = m1Var.getValue();
                strM12748L = AbstractC6663m.m12748L(((C5137a) m1Var.getValue()).f25152b, "\n\n", null, null, new C5835f(5), 30);
            } while (!m1Var.m15397i(value, C5137a.m10057a((C5137a) value, null, null, AbstractC6663m.c0(AbstractC6663m.g0(AbstractC2227a.m5931b(strM12748L))), false, false, null, null, strM12748L, false, null, null, false, false, null, false, null, 1047547)));
            c0.m13502y(c8810d, null, null, new C0782a(c6032f, interfaceC7559c, 14), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (((wx.InterfaceC8209j) r14).collect(r5, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12047g(java.lang.String r13, ww.AbstractC8193c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof pt.C6028b
            if (r0 == 0) goto L13
            r0 = r14
            pt.b r0 = (pt.C6028b) r0
            int r1 = r0.f29450f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29450f = r1
            goto L18
        L13:
            pt.b r0 = new pt.b
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f29448d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29450f
            r3 = 3
            r4 = 2
            cj.e r5 = r12.f29472c
            r6 = 1
            if (r2 == 0) goto L50
            if (r2 == r6) goto L45
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            og.od.m10798c(r14)
            goto Lb3
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            java.lang.String r13 = r0.f29447c
            rt.a r2 = r0.f29446b
            java.lang.String r4 = r0.f29445a
            og.od.m10798c(r14)
            r9 = r13
            r7 = r4
        L43:
            r8 = r2
            goto L9a
        L45:
            rt.a r13 = r0.f29446b
            java.lang.String r2 = r0.f29445a
            og.od.m10798c(r14)
            r11 = r2
            r2 = r13
            r13 = r11
            goto L85
        L50:
            og.od.m10798c(r14)
            java.lang.Object r14 = r5.f5804c
            xm.q4 r14 = (xm.q4) r14
            wx.m1 r14 = r14.f40744d
            java.lang.Object r14 = r14.getValue()
            en.f r14 = (en.C2073f) r14
            rt.a r14 = r14.f9688c
            r0.f29445a = r13
            r0.f29446b = r14
            r0.f29450f = r6
            java.lang.Object r2 = r5.f5802a
            xm.b0 r2 = (xm.b0) r2
            java.lang.Object r2 = r2.f40147a
            gn.x2 r2 = (gn.x2) r2
            bn.c r2 = r2.f14950j
            z7.w r2 = r2.f4517a
            an.v1 r7 = new an.v1
            r8 = 14
            r7.<init>(r13, r8)
            r8 = 0
            java.lang.Object r2 = og.pe.m10839n(r0, r2, r6, r8, r7)
            if (r2 != r1) goto L82
            goto Lb2
        L82:
            r11 = r2
            r2 = r14
            r14 = r11
        L85:
            java.lang.String r14 = (java.lang.String) r14
            r0.f29445a = r13
            r0.f29446b = r2
            r0.f29447c = r14
            r0.f29450f = r4
            java.lang.Object r4 = r5.m2778l(r13, r2, r0)
            if (r4 != r1) goto L96
            goto Lb2
        L96:
            r7 = r13
            r9 = r14
            r14 = r4
            goto L43
        L9a:
            wx.j r14 = (wx.InterfaceC8209j) r14
            g2.e4 r5 = new g2.e4
            r10 = 2
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r13 = 0
            r0.f29445a = r13
            r0.f29446b = r13
            r0.f29447c = r13
            r0.f29450f = r3
            java.lang.Object r13 = r14.collect(r5, r0)
            if (r13 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            qw.a0 r13 = qw.a0.f30746a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.C6032f.m12047g(java.lang.String, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void m12048h(og.c1 c1Var) {
        Object value;
        Object value2;
        C5137a c5137a;
        String strM10136r;
        Object value3;
        Object value4;
        boolean z6 = c1Var instanceof C4873b;
        C8810d c8810d = this.f29477h;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new ps.c0(this, c1Var, interfaceC7559c, 2), 3);
            return;
        }
        boolean zEquals = c1Var.equals(C4875d.f24387a);
        m1 m1Var = this.f29478i;
        if (zEquals) {
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C5137a.m10057a((C5137a) value4, null, null, null, !r4.f25154d, false, null, null, null, false, null, null, false, false, null, false, null, 1048567)));
            return;
        }
        if (c1Var instanceof C4876e) {
            c0.m13502y(c8810d, null, null, new C5740h(this, ((C4876e) c1Var).f24388a, interfaceC7559c, 1), 3);
            return;
        }
        if (c1Var instanceof C4878g) {
            c0.m13502y(c8810d, null, null, new ps.c0(this, ((C4878g) c1Var).f24390a, interfaceC7559c, 1), 3);
            return;
        }
        if (c1Var instanceof C4879h) {
            C4879h c4879h = (C4879h) c1Var;
            c0.m13502y(c8810d, null, null, new C6031e(this, c4879h.f24391a, c4879h.f24392b, null), 3);
            return;
        }
        if (c1Var instanceof C4877f) {
            c0.m13502y(c8810d, null, null, new C6027a(this, interfaceC7559c, 1), 3);
            return;
        }
        boolean z10 = c1Var instanceof C4881j;
        wx.w0 w0Var = this.f29479j;
        if (z10) {
            int i10 = ((C4881j) c1Var).f24395a;
            List<C5138b> list = ((C5137a) w0Var.f39340a.getValue()).f25151a;
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
            for (C5138b c5138b : list) {
                int i11 = c5138b.f25169a;
                if (i11 == i10) {
                    c5138b = new C5138b(i11, c5138b.f25170b, c5138b.f25171c, c5138b.f25172d, c5138b.f25173e, !c5138b.f25174f, c5138b.f25175g);
                }
                arrayList.add(c5138b);
            }
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C5137a.m10057a((C5137a) value3, arrayList, null, null, false, false, null, null, null, false, null, null, false, false, null, false, null, 1048574)));
            return;
        }
        if (c1Var instanceof C4880i) {
            C4880i c4880i = (C4880i) c1Var;
            boolean z11 = c4880i.f24394b;
            Map map = c4880i.f24393a;
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C5137a.m10057a((C5137a) value, null, null, C6668r.f31943a, false, false, null, null, null, false, null, null, false, false, null, false, null, 1048571)));
            if (z11) {
                String str = ((C5137a) w0Var.f39340a.getValue()).f25159i;
                if (map != null) {
                    do {
                        value2 = m1Var.getValue();
                        c5137a = (C5137a) value2;
                        strM10136r = str;
                        for (Map.Entry entry : map.entrySet()) {
                            strM10136r = AbstractC5185w.m10136r(strM10136r, (String) entry.getKey(), (String) entry.getValue());
                        }
                    } while (!m1Var.m15397i(value2, C5137a.m10057a(c5137a, null, null, null, false, false, null, null, strM10136r, false, null, null, false, false, null, false, null, 1047551)));
                }
                c0.m13502y(c8810d, null, null, new C0782a(this, interfaceC7559c, 14), 3);
                return;
            }
            return;
        }
        if (c1Var instanceof C4874c) {
            C4874c c4874c = (C4874c) c1Var;
            c0.m13502y(c8810d, null, null, new C0395h(this, c4874c.f24384a, c4874c.f24385b, c4874c.f24386c, null), 3);
            return;
        }
        if (!(c1Var instanceof C4882k)) {
            throw new NoWhenBranchMatchedException();
        }
        long j6 = ((C4882k) c1Var).f24396a;
        C8805t c8805t = this.f29476g;
        if (j6 == -1) {
            c8805t.m16231f("MessageTemplate document download failed — id == " + j6);
        } else {
            c8805t.m16231f("MessageTemplate document downloaded successfully — id == " + j6);
        }
        m12049i(-2, j6, false);
    }

    /* renamed from: i */
    public final void m12049i(int i10, long j6, boolean z6) {
        C6032f c6032f = this;
        List<C5139c> list = ((C5137a) c6032f.f29479j.f39340a.getValue()).f25156f;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
        for (C5139c c5139c : list) {
            int i11 = c5139c.f25176a;
            if (i11 == i10 || c5139c.f25181f == j6) {
                long j10 = z6 ? j6 : -1L;
                String name = c5139c.f25177b;
                String uri = c5139c.f25178c;
                String messageTemplateId = c5139c.f25179d;
                AbstractC4154l.m8923f(name, "name");
                AbstractC4154l.m8923f(uri, "uri");
                AbstractC4154l.m8923f(messageTemplateId, "messageTemplateId");
                c5139c = new C5139c(i11, name, uri, messageTemplateId, z6, j10);
            }
            arrayList.add(c5139c);
        }
        while (true) {
            m1 m1Var = c6032f.f29478i;
            Object value = m1Var.getValue();
            if (m1Var.m15397i(value, C5137a.m10057a((C5137a) value, null, null, null, false, false, arrayList, null, null, false, null, null, false, false, null, false, null, 1048511))) {
                return;
            } else {
                c6032f = this;
            }
        }
    }
}
