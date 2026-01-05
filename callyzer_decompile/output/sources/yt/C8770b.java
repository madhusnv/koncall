package yt;

import c9.C0914i;
import d7.w0;
import kotlin.NoWhenBranchMatchedException;
import pg.l6;
import tx.c0;
import vt.C7770a;
import vt.C7771b;
import wt.C8184b;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yt.b */
/* loaded from: classes3.dex */
public final class C8770b extends w0 {

    /* renamed from: b */
    public final C0914i f42391b;

    /* renamed from: c */
    public final C8810d f42392c;

    /* renamed from: d */
    public final m1 f42393d;

    /* renamed from: e */
    public final wx.w0 f42394e;

    public C8770b(C0914i c0914i, C8810d c8810d) {
        this.f42391b = c0914i;
        this.f42392c = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C8184b(false));
        this.f42393d = m1VarM15372c;
        this.f42394e = new wx.w0(m1VarM15372c);
    }

    /* renamed from: e */
    public final void m16127e(l6 l6Var) {
        m1 m1Var;
        Object value;
        boolean z6;
        if (l6Var instanceof C7770a) {
            c0.m13502y(this.f42392c, null, null, new C8769a(this, l6Var, null, 0), 3);
        } else {
            if (!(l6Var instanceof C7771b)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                m1Var = this.f42393d;
                value = m1Var.getValue();
                z6 = !((C8184b) this.f42394e.f39340a.getValue()).f39143a;
                ((C8184b) value).getClass();
            } while (!m1Var.m15397i(value, new C8184b(z6)));
        }
    }
}
