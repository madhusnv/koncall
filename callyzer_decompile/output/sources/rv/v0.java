package rv;

import android.content.Context;
import bu.C0782a;
import c9.C0908c;
import d7.w0;
import l4.C4367l;
import nn.C5113e;
import pg.o6;
import sv.C6956d;
import uw.InterfaceC7559c;
import vx.C7806h;
import wo.C8134s;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v0 extends w0 {

    /* renamed from: b */
    public final Context f31915b;

    /* renamed from: c */
    public final ao.c0 f31916c;

    /* renamed from: d */
    public final C8810d f31917d;

    /* renamed from: e */
    public final C5113e f31918e;

    /* renamed from: f */
    public final C4367l f31919f;

    /* renamed from: g */
    public final C8805t f31920g;

    /* renamed from: h */
    public final C8134s f31921h;

    /* renamed from: i */
    public final C0908c f31922i;

    /* renamed from: j */
    public final wx.w0 f31923j;

    /* renamed from: k */
    public final m1 f31924k;

    /* renamed from: l */
    public final m1 f31925l;

    /* renamed from: m */
    public final C7806h f31926m;

    /* renamed from: n */
    public final C8203d f31927n;

    /* renamed from: o */
    public final String f31928o;

    public v0(Context context, ao.c0 c0Var, C8810d c8810d, C5113e c5113e, C4367l c4367l, C8805t c8805t, C8134s c8134s, C0908c c0908c, wx.w0 w0Var) {
        Object value;
        this.f31915b = context;
        this.f31916c = c0Var;
        this.f31917d = c8810d;
        this.f31918e = c5113e;
        this.f31919f = c4367l;
        this.f31920g = c8805t;
        this.f31921h = c8134s;
        this.f31922i = c0908c;
        this.f31923j = w0Var;
        m1 m1VarM15372c = c1.m15372c(new C6956d(0, "", "", null, true, false));
        this.f31924k = m1VarM15372c;
        this.f31925l = m1VarM15372c;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f31926m = c7806hM11805a;
        this.f31927n = c1.m15389t(c7806hM11805a);
        this.f31928o = "SyncedCallLogsViewModel";
        tx.c0.m13502y(c8810d, null, null, new r0(this, interfaceC7559c, 0), 3);
        do {
            value = m1VarM15372c.getValue();
        } while (!m1VarM15372c.m15397i(value, C6956d.m13208a((C6956d) value, 0, null, null, null, true, 47)));
        tx.c0.m13502y(this.f31917d, null, null, new r0(this, interfaceC7559c, 4), 3);
        tx.c0.m13502y(this.f31917d, null, null, new C0782a(this, interfaceC7559c, 21), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (wx.c1.m15379j((wx.InterfaceC8209j) r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12687e(rv.v0 r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof rv.t0
            if (r0 == 0) goto L13
            r0 = r7
            rv.t0 r0 = (rv.t0) r0
            int r1 = r0.f31907c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31907c = r1
            goto L18
        L13:
            rv.t0 r0 = new rv.t0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31905a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f31907c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            og.od.m10798c(r7)
            goto L48
        L36:
            og.od.m10798c(r7)
            ao.c0 r7 = r6.f31916c
            java.lang.String r2 = r6.f31928o
            r0.f31907c = r4
            r7.f2941s = r4
            java.lang.Object r7 = r7.m1394i(r2, r0)
            if (r7 != r1) goto L48
            goto L5a
        L48:
            wx.j r7 = (wx.InterfaceC8209j) r7
            ps.c0 r2 = new ps.c0
            r4 = 0
            r5 = 19
            r2.<init>(r6, r4, r5)
            r0.f31907c = r3
            java.lang.Object r6 = wx.c1.m15379j(r7, r2, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.v0.m12687e(rv.v0, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m12688f() {
        tx.c0.m13502y(d7.q0.m5340g(this), null, null, new r0(this, null, 3), 3);
    }
}
