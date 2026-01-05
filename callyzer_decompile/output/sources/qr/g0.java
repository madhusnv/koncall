package qr;

import android.content.Context;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.f9;
import ur.C7530w;
import ur.k0;
import ur.x0;
import wx.c1;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a */
    public final String f30547a;

    /* renamed from: b */
    public final C7530w f30548b;

    /* renamed from: c */
    public final Context f30549c;

    /* renamed from: d */
    public final m1 f30550d;

    /* renamed from: e */
    public final w0 f30551e;

    public g0(String str, C7530w c7530w, Context context) {
        AbstractC4154l.m8923f(context, "context");
        this.f30547a = str;
        this.f30548b = c7530w;
        this.f30549c = context;
        m1 m1VarM15372c = c1.m15372c(c7530w);
        this.f30550d = m1VarM15372c;
        this.f30551e = new w0(m1VarM15372c);
    }

    /* renamed from: a */
    public final void m12281a(int i10, InterfaceC2137a closeSheet, InterfaceC2139c onEvent, InterfaceC3962k interfaceC3962k) {
        AbstractC4154l.m8923f(onEvent, "onEvent");
        AbstractC4154l.m8923f(closeSheet, "closeSheet");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1872855799);
        int i11 = (c3966o.m8616i(onEvent) ? 4 : 2) | i10 | (c3966o.m8616i(this) ? 256 : 128);
        if (!c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            c3966o.m8601S();
        } else {
            if (!(this instanceof g0)) {
                c3966o.m8607Y(-223122065);
                c3966o.m8623p(false);
                throw new NoWhenBranchMatchedException();
            }
            c3966o.m8607Y(1673216578);
            C7530w c7530w = (C7530w) C3953b.m8509l(this.f30551e, c3966o).getValue();
            ArrayList arrayList = new ArrayList();
            for (x0 x0Var : this.f30548b.f36269a) {
                arrayList.add(new k0(f9.m11628b(this.f30549c, x0Var.f36275a), x0Var.f36276b));
            }
            boolean z6 = (i11 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new e0(closeSheet, onEvent);
                c3966o.j0(objM8596M);
            }
            AbstractC6287k.m12287d(c7530w, arrayList, (InterfaceC2139c) objM8596M, c3966o, 0);
            c3966o.m8623p(false);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(this, onEvent, closeSheet, i10, 0);
        }
    }

    /* renamed from: b */
    public final x0 m12282b() {
        w0 w0Var = this.f30551e;
        return (x0) ((C7530w) w0Var.f39340a.getValue()).f36269a.get(((C7530w) w0Var.f39340a.getValue()).f36270b);
    }

    /* renamed from: c */
    public final void m12283c(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30550d;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 1)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f30547a.equals(g0Var.f30547a) && this.f30548b.equals(g0Var.f30548b) && AbstractC4154l.m8918a(this.f30549c, g0Var.f30549c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f30549c.hashCode() + ((this.f30548b.hashCode() + (this.f30547a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SortCallHistoryByCallFilter(title=" + this.f30547a + ", filterType=" + this.f30548b + ", context=" + this.f30549c + ", selected=true)";
    }
}
