package ss;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import ay.C0496f;
import ay.ExecutorC0495e;
import b3.C0575g;
import c9.C0908c;
import c9.C0910e;
import cj.C0979e;
import h6.C2856l;
import im.EnumC3310l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import l4.C4381z;
import ln.C4493f;
import ln.C4494g;
import nn.C5113e;
import nx.AbstractC5178p;
import og.pe;
import pg.o6;
import pn.C5979e;
import ps.AbstractC6007g;
import ps.C6002b;
import ps.C6003c;
import ps.C6004d;
import ps.C6006f;
import rw.C6668r;
import so.C6877c;
import tb.C7105p;
import tq.EnumC7204p;
import ts.C7216c;
import ts.C7217d;
import uo.C7485j;
import uw.InterfaceC7559c;
import v0.C7622f;
import vw.EnumC7794a;
import vx.C7806h;
import wo.C8134s;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.m1;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class z0 extends d7.w0 {

    /* renamed from: A */
    public final C8203d f33532A;

    /* renamed from: B */
    public final C7806h f33533B;

    /* renamed from: C */
    public final C8203d f33534C;

    /* renamed from: D */
    public final m1 f33535D;

    /* renamed from: E */
    public final wx.w0 f33536E;

    /* renamed from: F */
    public final C7806h f33537F;

    /* renamed from: G */
    public final C8203d f33538G;

    /* renamed from: H */
    public final C8810d f33539H;

    /* renamed from: I */
    public boolean f33540I;

    /* renamed from: J */
    public final m1 f33541J;

    /* renamed from: K */
    public final wx.w0 f33542K;

    /* renamed from: L */
    public final m1 f33543L;

    /* renamed from: M */
    public final wx.w0 f33544M;

    /* renamed from: b */
    public final Context f33545b;

    /* renamed from: c */
    public final C0910e f33546c;

    /* renamed from: d */
    public final C6877c f33547d;

    /* renamed from: e */
    public final C8805t f33548e;

    /* renamed from: f */
    public final C8810d f33549f;

    /* renamed from: g */
    public final C5113e f33550g;

    /* renamed from: h */
    public final rn.h0 f33551h;

    /* renamed from: i */
    public final C8803r f33552i;

    /* renamed from: j */
    public final C0908c f33553j;

    /* renamed from: k */
    public final C7105p f33554k;

    /* renamed from: l */
    public final C7485j f33555l;

    /* renamed from: m */
    public final C7622f f33556m;

    /* renamed from: n */
    public final C5979e f33557n;

    /* renamed from: o */
    public final C8134s f33558o;

    /* renamed from: p */
    public final C4327p f33559p;

    /* renamed from: q */
    public final C9000c f33560q;

    /* renamed from: r */
    public final C4493f f33561r;

    /* renamed from: s */
    public final C2856l f33562s;

    /* renamed from: t */
    public final C0979e f33563t;

    /* renamed from: u */
    public final C5113e f33564u;

    /* renamed from: v */
    public final C4494g f33565v;

    /* renamed from: w */
    public final d7.n0 f33566w;

    /* renamed from: x */
    public final m1 f33567x;

    /* renamed from: y */
    public final wx.w0 f33568y;

    /* renamed from: z */
    public final C7806h f33569z;

    public z0(Context context, C0910e c0910e, C6877c phoneNumberUseCase, C8805t c8805t, C8810d c8810d, C5113e c5113e, rn.h0 callRecordingUseCase, C8803r networkMonitorUtil, C0908c c0908c, C7105p c7105p, C7485j c7485j, C7622f c7622f, C5979e c5979e, C8134s c8134s, C4327p c4327p, C9000c c9000c, C4493f c4493f, C2856l c2856l, C0979e c0979e, C5113e c5113e2, C4494g c4494g, d7.n0 savedStateHandle) {
        AbstractC4154l.m8923f(phoneNumberUseCase, "phoneNumberUseCase");
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(networkMonitorUtil, "networkMonitorUtil");
        AbstractC4154l.m8923f(savedStateHandle, "savedStateHandle");
        this.f33545b = context;
        this.f33546c = c0910e;
        this.f33547d = phoneNumberUseCase;
        this.f33548e = c8805t;
        this.f33549f = c8810d;
        this.f33550g = c5113e;
        this.f33551h = callRecordingUseCase;
        this.f33552i = networkMonitorUtil;
        this.f33553j = c0908c;
        this.f33554k = c7105p;
        this.f33555l = c7485j;
        this.f33556m = c7622f;
        this.f33557n = c5979e;
        this.f33558o = c8134s;
        this.f33559p = c4327p;
        this.f33560q = c9000c;
        this.f33561r = c4493f;
        this.f33562s = c2856l;
        this.f33563t = c0979e;
        this.f33564u = c5113e2;
        this.f33565v = c4494g;
        this.f33566w = savedStateHandle;
        m1 m1VarM15372c = wx.c1.m15372c(new C6912a(EnumC3310l.FrequentContactCalls));
        this.f33567x = m1VarM15372c;
        this.f33568y = new wx.w0(m1VarM15372c);
        int i10 = 0;
        InterfaceC7559c interfaceC7559c = null;
        int i11 = 7;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f33569z = c7806hM11805a;
        this.f33532A = wx.c1.m15389t(c7806hM11805a);
        C7806h c7806hM11805a2 = o6.m11805a(0, null, null, 7);
        this.f33533B = c7806hM11805a2;
        this.f33534C = wx.c1.m15389t(c7806hM11805a2);
        m1 m1VarM15372c2 = wx.c1.m15372c(new a1(new C4381z("", 6, 0L)));
        this.f33535D = m1VarM15372c2;
        this.f33536E = new wx.w0(m1VarM15372c2);
        C7806h c7806hM11805a3 = o6.m11805a(0, null, null, 7);
        this.f33537F = c7806hM11805a3;
        this.f33538G = wx.c1.m15389t(c7806hM11805a3);
        C0496f c0496f = tx.m0.f34659a;
        this.f33539H = tx.c0.m13479b(ExecutorC0495e.f3538c);
        List listM10834i = (List) savedStateHandle.m5330a("bottom_navigation_list");
        int i12 = 2;
        int i13 = 1;
        int i14 = 4;
        listM10834i = listM10834i == null ? pe.m10834i(C6003c.f29336c, C6002b.f29332c, C6004d.f29341c, C6006f.f29354c) : listM10834i;
        C6668r c6668r = C6668r.f31943a;
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        m1 m1VarM15372c3 = wx.c1.m15372c(new C7216c(listM10834i, new C7217d(c6668r, enumC7204p, enumC7204p), false, null, null, null, false, false, null, null));
        this.f33541J = m1VarM15372c3;
        this.f33542K = new wx.w0(m1VarM15372c3);
        C0575g c0575g = new C0575g(0, this, z0.class, "onFolderSelectClickInAppBar", "onFolderSelectClickInAppBar()V", 0, 4);
        C0575g c0575g2 = new C0575g(0, this, z0.class, "onFolderSelectDismissInAppBar", "onFolderSelectDismissInAppBar()V", 0, 5);
        C0575g c0575g3 = new C0575g(0, this, z0.class, "onRecordingReSyncClick", "onRecordingReSyncClick()V", 0, 6);
        Boolean bool = Boolean.FALSE;
        m1 m1VarM15372c4 = wx.c1.m15372c(new C6913b(false, false, bool, null, 0, bool, false, c0575g, c0575g2, c0575g3));
        this.f33543L = m1VarM15372c4;
        this.f33544M = new wx.w0(m1VarM15372c4);
        tx.c0.m13502y(d7.q0.m5340g(this), null, null, new ps.c0(this, null), 3);
        tx.c0.m13502y(c8810d, null, null, new ps.b0(this, interfaceC7559c, i13), 3);
        tx.c0.m13502y(d7.q0.m5340g(this), null, null, new ps.b0(this, interfaceC7559c, i12), 3);
        tx.c0.m13502y(d7.q0.m5340g(this), null, null, new c0(this, interfaceC7559c, i14), 3);
        tx.c0.m13502y(c8810d, null, null, new b0(this, interfaceC7559c, i11), 3);
        tx.c0.m13502y(c8810d, null, null, new d0(this, interfaceC7559c, i10), 3);
        tx.c0.m13502y(c8810d, null, null, new b0(this, interfaceC7559c, 10), 3);
        tx.c0.m13502y(c8810d, null, null, new b0(this, interfaceC7559c, 11), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13182e(ss.z0 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof ss.f0
            if (r0 == 0) goto L13
            r0 = r7
            ss.f0 r0 = (ss.f0) r0
            int r1 = r0.f33432c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33432c = r1
            goto L18
        L13:
            ss.f0 r0 = new ss.f0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f33430a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33432c
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            og.od.m10798c(r7)
            return r3
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            og.od.m10798c(r7)
            goto L4c
        L38:
            og.od.m10798c(r7)
            nn.e r7 = r6.f33550g
            r0.f33432c = r5
            xm.z r7 = r7.f25030a
            fn.i r7 = r7.f41069a
            java.lang.String r2 = "app_version_api"
            java.lang.Object r7 = r7.m6022b(r2, r0)
            if (r7 != r1) goto L4c
            goto L6d
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6e
            yv.t r7 = r6.f33548e
            java.lang.String r2 = "OnAppUpdate API calling again"
            r7.m16231f(r2)
            l1.p r6 = r6.f33559p
            r0.f33432c = r4
            java.lang.Object r6 = r6.f21788b
            xm.b0 r6 = (xm.b0) r6
            java.lang.Object r6 = r6.m15566l(r0)
            if (r6 != r1) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13182e(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r0.m2773g(r1) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13183f(ss.z0 r5, ww.AbstractC8193c r6) {
        /*
            cj.e r0 = r5.f33563t
            boolean r1 = r6 instanceof ss.g0
            if (r1 == 0) goto L15
            r1 = r6
            ss.g0 r1 = (ss.g0) r1
            int r2 = r1.f33436c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f33436c = r2
            goto L1a
        L15:
            ss.g0 r1 = new ss.g0
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r5 = r1.f33434a
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r1.f33436c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            og.od.m10798c(r5)
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            og.od.m10798c(r5)
            goto L44
        L38:
            og.od.m10798c(r5)
            r1.f33436c = r4
            java.lang.Object r5 = r0.m2774h(r1)
            if (r5 != r6) goto L44
            goto L4c
        L44:
            r1.f33436c = r3
            java.lang.Object r5 = r0.m2773g(r1)
            if (r5 != r6) goto L4d
        L4c:
            return r6
        L4d:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13183f(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13184g(ss.z0 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof ss.i0
            if (r0 == 0) goto L13
            r0 = r7
            ss.i0 r0 = (ss.i0) r0
            int r1 = r0.f33446c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33446c = r1
            goto L18
        L13:
            ss.i0 r0 = new ss.i0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f33444a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33446c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L4a
            goto L4e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r7)
            pn.e r7 = r6.f33557n     // Catch: java.lang.Exception -> L4a
            r7.getClass()     // Catch: java.lang.Exception -> L4a
            wx.v0 r7 = xm.x1.f40990o     // Catch: java.lang.Exception -> L4a
            ss.b0 r2 = new ss.b0     // Catch: java.lang.Exception -> L4a
            r4 = 0
            r5 = 14
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L4a
            r0.f33446c = r3     // Catch: java.lang.Exception -> L4a
            java.lang.Object r6 = wx.c1.m15379j(r7, r2, r0)     // Catch: java.lang.Exception -> L4a
            if (r6 != r1) goto L4e
            return r1
        L4a:
            r6 = move-exception
            r6.toString()
        L4e:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13184g(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (wx.c1.m15379j((wx.InterfaceC8209j) r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13185h(ss.z0 r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof ss.j0
            if (r0 == 0) goto L13
            r0 = r8
            ss.j0 r0 = (ss.j0) r0
            int r1 = r0.f33450c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33450c = r1
            goto L18
        L13:
            ss.j0 r0 = new ss.j0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f33448a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33450c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            og.od.m10798c(r8)
            goto L82
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            og.od.m10798c(r8)
            goto L71
        L37:
            og.od.m10798c(r8)
            c9.c r8 = r7.f33553j
            r0.f33450c = r5
            java.lang.Object r8 = r8.f5574b
            xm.y5 r8 = (xm.y5) r8
            fn.i r8 = r8.f41050b
            km.a r8 = r8.f10585a
            km.o r8 = (km.C4120o) r8
            r8.getClass()
            java.lang.String r2 = "sim_state_change"
            s6.d r2 = og.cf.m10580a(r2)
            android.content.Context r5 = r8.f21052a
            o6.f r8 = r8.m8881c(r5)
            wx.j r8 = r8.getData()
            km.f r5 = new km.f
            r6 = 0
            r5.<init>(r8, r2, r6)
            dr.s r8 = new dr.s
            r2 = 3
            r6 = 4
            r8.<init>(r2, r6, r3)
            wx.t r2 = new wx.t
            r2.<init>(r5, r8)
            if (r2 != r1) goto L70
            goto L81
        L70:
            r8 = r2
        L71:
            wx.j r8 = (wx.InterfaceC8209j) r8
            ss.k0 r2 = new ss.k0
            r5 = 0
            r2.<init>(r7, r3, r5)
            r0.f33450c = r4
            java.lang.Object r7 = wx.c1.m15379j(r8, r2, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            qw.a0 r7 = qw.a0.f30746a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13185h(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13186i(ss.z0 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof ss.l0
            if (r0 == 0) goto L13
            r0 = r7
            ss.l0 r0 = (ss.l0) r0
            int r1 = r0.f33458c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33458c = r1
            goto L18
        L13:
            ss.l0 r0 = new ss.l0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f33456a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33458c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L4a
            goto L4e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r7)
            v0.f r7 = r6.f33556m     // Catch: java.lang.Exception -> L4a
            java.lang.Object r7 = r7.f36778a     // Catch: java.lang.Exception -> L4a
            xm.y5 r7 = (xm.y5) r7     // Catch: java.lang.Exception -> L4a
            wx.v0 r7 = r7.f41058j     // Catch: java.lang.Exception -> L4a
            ss.k0 r2 = new ss.k0     // Catch: java.lang.Exception -> L4a
            r4 = 0
            r5 = 1
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L4a
            r0.f33458c = r3     // Catch: java.lang.Exception -> L4a
            java.lang.Object r6 = wx.c1.m15379j(r7, r2, r0)     // Catch: java.lang.Exception -> L4a
            if (r6 != r1) goto L4e
            return r1
        L4a:
            r6 = move-exception
            r6.toString()
        L4e:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13186i(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vw.EnumC7794a m13187j(ss.z0 r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof ss.m0
            if (r0 == 0) goto L13
            r0 = r6
            ss.m0 r0 = (ss.m0) r0
            int r1 = r0.f33462c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33462c = r1
            goto L18
        L13:
            ss.m0 r0 = new ss.m0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f33460a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33462c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            og.od.m10798c(r6)
            goto L47
        L2f:
            og.od.m10798c(r6)
            yv.r r6 = r5.f33552i
            wx.w0 r6 = r6.f42471f
            ss.n0 r2 = new ss.n0
            r4 = 0
            r2.<init>(r5, r4)
            r0.f33462c = r3
            wx.k1 r5 = r6.f39340a
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13187j(ss.z0, ww.c):vw.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13188k(ss.z0 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof ss.o0
            if (r0 == 0) goto L13
            r0 = r7
            ss.o0 r0 = (ss.o0) r0
            int r1 = r0.f33469c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33469c = r1
            goto L18
        L13:
            ss.o0 r0 = new ss.o0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f33467a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33469c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)     // Catch: java.lang.Exception -> L50
            goto L54
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            og.od.m10798c(r7)
            v0.f r7 = r6.f33556m     // Catch: java.lang.Exception -> L50
            java.lang.Object r7 = r7.f36778a     // Catch: java.lang.Exception -> L50
            xm.y5 r7 = (xm.y5) r7     // Catch: java.lang.Exception -> L50
            wx.v0 r7 = r7.f41060l     // Catch: java.lang.Exception -> L50
            r4 = 1000(0x3e8, double:4.94E-321)
            wx.j r7 = wx.c1.m15381l(r7, r4)     // Catch: java.lang.Exception -> L50
            dr.r r2 = new dr.r     // Catch: java.lang.Exception -> L50
            r4 = 0
            r5 = 7
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L50
            r0.f33469c = r3     // Catch: java.lang.Exception -> L50
            java.lang.Object r6 = wx.c1.m15379j(r7, r2, r0)     // Catch: java.lang.Exception -> L50
            if (r6 != r1) goto L54
            return r1
        L50:
            r6 = move-exception
            r6.toString()
        L54:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13188k(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13189l(ss.z0 r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof ss.p0
            if (r0 == 0) goto L13
            r0 = r6
            ss.p0 r0 = (ss.p0) r0
            int r1 = r0.f33473c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33473c = r1
            goto L18
        L13:
            ss.p0 r0 = new ss.p0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f33471a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33473c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            og.od.m10798c(r6)     // Catch: java.lang.Exception -> L50
            goto L4a
        L2f:
            og.od.m10798c(r6)
            pn.e r6 = r5.f33557n     // Catch: java.lang.Exception -> L50
            r6.getClass()     // Catch: java.lang.Exception -> L50
            wx.v0 r6 = xm.x1.f40989n     // Catch: java.lang.Exception -> L50
            ss.n0 r2 = new ss.n0     // Catch: java.lang.Exception -> L50
            r4 = 1
            r2.<init>(r5, r4)     // Catch: java.lang.Exception -> L50
            r0.f33473c = r3     // Catch: java.lang.Exception -> L50
            wx.x0 r5 = r6.f39335a     // Catch: java.lang.Exception -> L50
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Exception -> L50
            if (r5 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Exception -> L50
            r5.<init>()     // Catch: java.lang.Exception -> L50
            throw r5     // Catch: java.lang.Exception -> L50
        L50:
            r5 = move-exception
            r5.toString()
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13189l(ss.z0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13190m(ss.z0 r11, uw.InterfaceC7559c r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof ss.t0
            if (r0 == 0) goto L13
            r0 = r12
            ss.t0 r0 = (ss.t0) r0
            int r1 = r0.f33495c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33495c = r1
            goto L18
        L13:
            ss.t0 r0 = new ss.t0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f33493a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33495c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r12)
            goto L3f
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            og.od.m10798c(r12)
            wo.s r12 = r11.f33558o
            r0.f33495c = r3
            r2 = 30
            java.lang.Object r12 = r12.m15305h(r2, r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r12 = (java.lang.String) r12
            wx.m1 r0 = r11.f33543L
        L43:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            ss.b r2 = (ss.C6913b) r2
            yv.r r3 = r11.f33552i
            boolean r3 = r3.m16221c()
            if (r3 == 0) goto L54
            r6 = r12
            goto L56
        L54:
            r3 = 0
            r6 = r3
        L56:
            r9 = 0
            r10 = 1015(0x3f7, float:1.422E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            ss.b r2 = ss.C6913b.m13179a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r0.m15397i(r1, r2)
            if (r1 == 0) goto L43
            qw.a0 r11 = qw.a0.f30746a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13190m(ss.z0, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13191n(ss.z0 r5, ww.AbstractC8193c r6) {
        /*
            uo.j r0 = r5.f33555l
            boolean r1 = r6 instanceof ss.v0
            if (r1 == 0) goto L15
            r1 = r6
            ss.v0 r1 = (ss.v0) r1
            int r2 = r1.f33509c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f33509c = r2
            goto L1a
        L15:
            ss.v0 r1 = new ss.v0
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.f33507a
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f33509c
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            og.od.m10798c(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r6)
            r1.f33509c = r4
            xm.y2 r6 = r0.f36143b
            fn.i r6 = r6.f41035a
            java.lang.String r3 = "need_to_update_device_settings"
            java.lang.Object r6 = r6.m6022b(r3, r1)
            if (r6 != r2) goto L43
            return r2
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            yv.t r6 = r5.f33548e
            java.lang.String r1 = "saveDeviceSettings calling again"
            r6.m16231f(r1)
            android.content.Context r5 = r5.f33545b
            r0.m14286c(r5)
            goto L6b
        L58:
            qw.p r5 = r0.f36149h
            java.lang.Object r5 = r5.getValue()
            tx.z r5 = (tx.InterfaceC7266z) r5
            u7.a r6 = new u7.a
            r1 = 4
            r2 = 0
            r6.<init>(r0, r2, r1)
            r0 = 3
            tx.c0.m13502y(r5, r2, r2, r6, r0)
        L6b:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13191n(ss.z0, ww.c):java.lang.Object");
    }

    /* renamed from: o */
    public static final void m13192o(z0 z0Var, boolean z6) {
        z0Var.getClass();
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            tx.c0.m13502y(d7.q0.m5340g(z0Var), null, null, new b0(z0Var, interfaceC7559c, 12), 3);
        } else {
            tx.c0.m13502y(d7.q0.m5340g(z0Var), null, null, new b0(z0Var, interfaceC7559c, 24), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13193p(ss.z0 r19, ww.AbstractC8193c r20) {
        /*
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof ss.x0
            if (r2 == 0) goto L17
            r2 = r1
            ss.x0 r2 = (ss.x0) r2
            int r3 = r2.f33524e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f33524e = r3
            goto L1c
        L17:
            ss.x0 r2 = new ss.x0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f33522c
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f33524e
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L46
            if (r4 == r8) goto L42
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L34
            ts.d r2 = r2.f33521b
            og.od.m10798c(r1)
            goto L94
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            tq.p r4 = r2.f33520a
            og.od.m10798c(r1)
            goto L6a
        L42:
            og.od.m10798c(r1)
            goto L56
        L46:
            og.od.m10798c(r1)
            nn.e r1 = r0.f33550g
            r2.f33524e = r8
            xm.y5 r1 = r1.f25031b
            java.lang.Enum r1 = r1.m15700p(r2)
            if (r1 != r3) goto L56
            goto L8e
        L56:
            r4 = r1
            tq.p r4 = (tq.EnumC7204p) r4
            c9.c r1 = r0.f33553j
            r2.f33520a = r4
            r2.f33524e = r7
            java.lang.Object r1 = r1.f5574b
            xm.y5 r1 = (xm.y5) r1
            java.lang.Object r1 = r1.m15696l(r2)
            if (r1 != r3) goto L6a
            goto L8e
        L6a:
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lba
            tq.p r1 = tq.EnumC7204p.DEFAULT
            if (r4 == r1) goto Lba
            wx.w0 r1 = r0.f33542K
            wx.k1 r1 = r1.f39340a
            java.lang.Object r1 = r1.getValue()
            ts.c r1 = (ts.C7216c) r1
            ts.d r1 = r1.f34514b
            r2.f33520a = r5
            r2.f33521b = r1
            r2.f33524e = r6
            java.lang.Object r2 = r0.m13198u(r4, r2)
            if (r2 != r3) goto L8f
        L8e:
            return r3
        L8f:
            r18 = r2
            r2 = r1
            r1 = r18
        L94:
            java.util.List r1 = (java.util.List) r1
            r3 = 6
            ts.d r8 = ts.C7217d.m13449a(r2, r1, r5, r5, r3)
            wx.m1 r0 = r0.f33541J
        L9d:
            java.lang.Object r1 = r0.getValue()
            r6 = r1
            ts.c r6 = (ts.C7216c) r6
            r16 = 0
            r17 = 2045(0x7fd, float:2.866E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            ts.c r2 = ts.C7216c.m13448a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r0.m15397i(r1, r2)
            if (r1 == 0) goto L9d
        Lba:
            qw.a0 r0 = qw.a0.f30746a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13193p(ss.z0, ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public final void m13194q() {
        m1 m1Var;
        Object value;
        C4493f c4493f = this.f33561r;
        C8805t c8805t = c4493f.f22366b;
        c8805t.m16231f("OverlayPermissionUseCase >> checking android Go Edition");
        String str = Build.VERSION.RELEASE;
        c8805t.m16231f("OverlayPermissionUseCase >> version release: " + str);
        AbstractC4154l.m8920c(str);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        boolean zIsLowRamDevice = true;
        if (!AbstractC5178p.m10116x(lowerCase, "go", true)) {
            Object systemService = c4493f.f22365a.getSystemService("activity");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            zIsLowRamDevice = ((ActivityManager) systemService).isLowRamDevice();
            c8805t.m16231f("OverlayPermissionUseCase >> isLowRamDevice >> " + zIsLowRamDevice);
        }
        this.f33548e.m16231f("isAndroid Go Edition >>> " + zIsLowRamDevice);
        if (Settings.canDrawOverlays(this.f33545b)) {
            tx.c0.m13502y(d7.q0.m5340g(this), null, null, new b0(this, null, 13), 3);
        } else {
            do {
                m1Var = this.f33541J;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, null, null, true, null, null, null, false, false, null, null, 2043)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13195r(ww.AbstractC8193c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ss.h0
            if (r0 == 0) goto L13
            r0 = r11
            ss.h0 r0 = (ss.h0) r0
            int r1 = r0.f33442e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33442e = r1
            goto L18
        L13:
            ss.h0 r0 = new ss.h0
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f33440c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f33442e
            java.lang.String r3 = "lead"
            java.lang.String r4 = "callHistory"
            nn.e r5 = r10.f33564u
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L4c
            if (r2 == r8) goto L44
            if (r2 == r7) goto L3e
            if (r2 != r6) goto L36
            kotlin.jvm.internal.z r0 = r0.f33438a
            og.od.m10798c(r11)
            goto Lc2
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3e:
            kotlin.jvm.internal.z r2 = r0.f33438a
            og.od.m10798c(r11)
            goto La2
        L44:
            kotlin.jvm.internal.z r2 = r0.f33439b
            kotlin.jvm.internal.z r8 = r0.f33438a
            og.od.m10798c(r11)
            goto L64
        L4c:
            og.od.m10798c(r11)
            kotlin.jvm.internal.z r2 = new kotlin.jvm.internal.z
            r2.<init>()
            r0.f33438a = r2
            r0.f33439b = r2
            r0.f33442e = r8
            xm.z r11 = r5.f25030a
            java.lang.Enum r11 = r11.m15712b(r0)
            if (r11 != r1) goto L63
            goto Lc0
        L63:
            r8 = r2
        L64:
            yv.h r11 = (yv.EnumC8793h) r11
            int r11 = r11.getOptionValue()
            yv.h r9 = yv.EnumC8793h.DEFAULT_CALL_HISTORY
            int r9 = r9.getOptionValue()
            if (r11 != r9) goto L74
            r11 = r4
            goto L8b
        L74:
            yv.h r9 = yv.EnumC8793h.DEFAULT_ANALYTICS
            int r9 = r9.getOptionValue()
            if (r11 != r9) goto L7f
            java.lang.String r11 = "analytics"
            goto L8b
        L7f:
            yv.h r9 = yv.EnumC8793h.DEFAULT_LEAD
            int r9 = r9.getOptionValue()
            if (r11 != r9) goto L89
            r11 = r3
            goto L8b
        L89:
            java.lang.String r11 = "more"
        L8b:
            r2.f21164a = r11
            r0.f33438a = r8
            r11 = 0
            r0.f33439b = r11
            r0.f33442e = r7
            c9.c r11 = r10.f33553j
            java.lang.Object r11 = r11.f5574b
            xm.y5 r11 = (xm.y5) r11
            java.io.Serializable r11 = r11.m15694j(r0)
            if (r11 != r1) goto La1
            goto Lc0
        La1:
            r2 = r8
        La2:
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto Lc3
            java.lang.Object r11 = r2.f21164a
            boolean r11 = kotlin.jvm.internal.AbstractC4154l.m8918a(r11, r3)
            if (r11 == 0) goto Lc3
            r2.f21164a = r4
            yv.h r11 = yv.EnumC8793h.DEFAULT_CALL_HISTORY
            r0.f33438a = r2
            r0.f33442e = r6
            java.lang.Object r11 = r5.m10043f(r11, r0)
            if (r11 != r1) goto Lc1
        Lc0:
            return r1
        Lc1:
            r0 = r2
        Lc2:
            r2 = r0
        Lc3:
            java.lang.Object r11 = r2.f21164a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13195r(ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03f7, code lost:
    
        r0 = android.os.Build.BRAND;
        kotlin.jvm.internal.AbstractC4154l.m8922e(r0, "BRAND");
        r5 = java.util.Locale.ROOT;
        kotlin.jvm.internal.AbstractC4154l.m8922e(r5, "ROOT");
        r0 = r0.toLowerCase(r5);
        kotlin.jvm.internal.AbstractC4154l.m8922e(r0, "toLowerCase(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0415, code lost:
    
        if (r0.equals("huawei") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0417, code lost:
    
        r0 = new android.content.Intent();
        r0.setAction("huawei.intent.action.HSM_BOOTAPP_MANAGER");
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0421, code lost:
    
        r10.startActivity(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0425, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0426, code lost:
    
        r0 = "HuaweiAutoStart Could not open auto-start settings: " + r0.getMessage();
        kotlin.jvm.internal.AbstractC4154l.m8923f(r0, "message");
        si.C6847c.m13044a().m13045b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0444, code lost:
    
        si.C6847c.m13044a().m13045b("AutoStartPermission");
        si.C6847c.m13044a().m13046c(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x060b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13196s(ss.a0 r27) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13196s(ss.a0):void");
    }

    /* renamed from: t */
    public final void m13197t() {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f33541J;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, null, null, false, null, null, null, false, false, null, null, 2039)));
        tx.c0.m13502y(this.f33549f, null, null, new b0(this, null, 23), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13198u(tq.EnumC7204p r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13198u(tq.p, ww.c):java.lang.Object");
    }

    /* renamed from: v */
    public final void m13199v(boolean z6) {
        tx.c0.m13502y(this.f33549f, null, null, new b2.s0(6, this, null, z6), 3);
    }

    /* renamed from: w */
    public final Object m13200w(ArrayList arrayList, AbstractC8199i abstractC8199i) {
        String str;
        Object value;
        boolean zIsEmpty = arrayList.isEmpty();
        m1 m1Var = this.f33541J;
        if (zIsEmpty) {
            str = null;
        } else {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((AbstractC6007g) obj).f29356a.equals(((C7216c) m1Var.getValue()).f34521i)) {
                    str = ((C7216c) m1Var.getValue()).f34521i;
                    break;
                }
            }
            str = null;
        }
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7216c.m13448a((C7216c) value, arrayList, null, false, null, null, null, false, false, str, null, 1534)));
        this.f33566w.m5331b("bottom_navigation_list", arrayList);
        Object objM13202y = m13202y(null, abstractC8199i);
        return objM13202y == EnumC7794a.COROUTINE_SUSPENDED ? objM13202y : qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0085 -> B:17:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13201x(java.lang.Boolean r26, ww.AbstractC8193c r27) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13201x(java.lang.Boolean, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13202y(java.lang.String r27, ww.AbstractC8193c r28) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.z0.m13202y(java.lang.String, ww.c):java.lang.Object");
    }
}
