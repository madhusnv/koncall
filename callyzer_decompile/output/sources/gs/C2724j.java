package gs;

import android.content.Context;
import d7.q0;
import d7.w0;
import fo.C2348l;
import fs.C2371b;
import kotlin.jvm.internal.AbstractC4154l;
import pn.C5979e;
import tx.c0;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.j */
/* loaded from: classes3.dex */
public final class C2724j extends w0 {

    /* renamed from: b */
    public final C2348l f15193b;

    /* renamed from: c */
    public final wx.w0 f15194c;

    /* renamed from: d */
    public final C5979e f15195d;

    /* renamed from: e */
    public final Context f15196e;

    /* renamed from: f */
    public final String f15197f;

    /* renamed from: g */
    public final m1 f15198g;

    /* renamed from: h */
    public final wx.w0 f15199h;

    /* renamed from: i */
    public final m1 f15200i;

    public C2724j(C2348l c2348l, wx.w0 w0Var, C5979e c5979e, C8810d c8810d, Context context, String leadId, String str) {
        AbstractC4154l.m8923f(leadId, "leadId");
        this.f15193b = c2348l;
        this.f15194c = w0Var;
        this.f15195d = c5979e;
        this.f15196e = context;
        this.f15197f = str;
        m1 m1VarM15372c = c1.m15372c(new C2371b());
        this.f15198g = m1VarM15372c;
        this.f15199h = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        m1 m1VarM15372c2 = c1.m15372c(null);
        this.f15200i = m1VarM15372c2;
        c0.m13502y(c8810d, null, null, new C2722h(this, interfaceC7559c, 0), 3);
        m1VarM15372c2.m15399k(null, leadId);
        c0.m13502y(c8810d, null, null, new C2722h(this, interfaceC7559c, 1), 3);
        Object value = m1VarM15372c2.getValue();
        AbstractC4154l.m8920c(value);
        m6726f((String) value);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6725e(gs.C2724j r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof gs.C2723i
            if (r0 == 0) goto L13
            r0 = r7
            gs.i r0 = (gs.C2723i) r0
            int r1 = r0.f15192c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15192c = r1
            goto L18
        L13:
            gs.i r0 = new gs.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f15190a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15192c
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
            pn.e r7 = r6.f15195d     // Catch: java.lang.Exception -> L4a
            r7.getClass()     // Catch: java.lang.Exception -> L4a
            wx.v0 r7 = xm.x1.f40990o     // Catch: java.lang.Exception -> L4a
            ap.a r2 = new ap.a     // Catch: java.lang.Exception -> L4a
            r4 = 0
            r5 = 15
            r2.<init>(r6, r4, r5)     // Catch: java.lang.Exception -> L4a
            r0.f15192c = r3     // Catch: java.lang.Exception -> L4a
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
        throw new UnsupportedOperationException("Method not decompiled: gs.C2724j.m6725e(gs.j, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m6726f(String str) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f15198g;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C2371b.m6058a((C2371b) value, true, null, null, null, null, null, false, false, null, null, 4094)));
        c0.m13502y(q0.m5340g(this), null, null, new C2715a(this, str, null, 2), 3);
    }
}
