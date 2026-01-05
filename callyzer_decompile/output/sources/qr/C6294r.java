package qr;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import pg.f9;
import rw.AbstractC6663m;
import tx.m0;
import ur.C7530w;
import ur.h0;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import wx.u0;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.r */
/* loaded from: classes3.dex */
public final class C6294r extends AbstractC6297u {

    /* renamed from: d */
    public final C7530w f30591d;

    /* renamed from: e */
    public final InterfaceC2137a f30592e;

    /* renamed from: f */
    public final Context f30593f;

    /* renamed from: g */
    public final m1 f30594g;

    /* renamed from: h */
    public final w0 f30595h;

    /* renamed from: i */
    public final m1 f30596i;

    /* renamed from: j */
    public final w0 f30597j;

    /* renamed from: k */
    public final h0 f30598k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6294r(C7530w c7530w, InterfaceC2137a interfaceC2137a, Context context) {
        super(f9.m11628b(context, R.string.duration), f9.m11628b(context, R.string.select_date), c7530w);
        AbstractC4154l.m8923f(context, "context");
        this.f30591d = c7530w;
        this.f30592e = interfaceC2137a;
        this.f30593f = context;
        m1 m1VarM15372c = c1.m15372c(c7530w);
        this.f30594g = m1VarM15372c;
        this.f30595h = new w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c(c7530w);
        this.f30596i = m1VarM15372c2;
        this.f30597j = new w0(m1VarM15372c2);
        C0496f c0496f = m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4032f(this, (InterfaceC7559c) null, 10), 3);
        this.f30598k = h0.DATE_FILTER;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: d */
    public final w0 mo12301d() {
        return this.f30597j;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: e */
    public final String mo12302e() {
        return f9.m11628b(this.f30593f, m12314o().f36215a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6294r)) {
            return false;
        }
        C6294r c6294r = (C6294r) obj;
        return AbstractC4154l.m8918a(this.f30591d, c6294r.f30591d) && AbstractC4154l.m8918a(this.f30592e, c6294r.f30592e) && AbstractC4154l.m8918a(this.f30593f, c6294r.f30593f);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: f */
    public final h0 mo12303f() {
        return this.f30598k;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: g */
    public final InterfaceC2137a mo12304g() {
        return this.f30592e;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: h */
    public final w0 mo12305h() {
        return this.f30595h;
    }

    public final int hashCode() {
        return this.f30593f.hashCode() + ((this.f30592e.hashCode() + (this.f30591d.hashCode() * 31)) * 31);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: i */
    public final u0 mo12306i() {
        return this.f30596i;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: j */
    public final u0 mo12307j() {
        return this.f30594g;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: k */
    public final boolean mo12308k() {
        return ((C7530w) this.f30595h.f39340a.getValue()).f36270b != -1;
    }

    /* renamed from: n */
    public final List m12313n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f30591d.f36269a.iterator();
        while (it.hasNext()) {
            arrayList.add(f9.m11628b(this.f30593f, ((ur.f0) it.next()).f36215a));
        }
        return AbstractC6663m.c0(arrayList);
    }

    /* renamed from: o */
    public final ur.f0 m12314o() {
        w0 w0Var = this.f30595h;
        return (ur.f0) ((C7530w) w0Var.f39340a.getValue()).f36269a.get(((C7530w) w0Var.f39340a.getValue()).f36270b);
    }

    /* renamed from: p */
    public final void m12315p(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30594g;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    /* renamed from: q */
    public final void m12316q(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30596i;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    public final String toString() {
        return "DateFilter(filterType=" + this.f30591d + ", resetState=" + this.f30592e + ", context=" + this.f30593f + ")";
    }
}
