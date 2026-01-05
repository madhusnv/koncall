package qr;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import java.util.ArrayList;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import pg.f9;
import tx.m0;
import ur.C7530w;
import ur.h0;
import ur.k0;
import ur.o0;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import wx.u0;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.t */
/* loaded from: classes3.dex */
public final class C6296t extends AbstractC6297u {

    /* renamed from: d */
    public final C7530w f30607d;

    /* renamed from: e */
    public final InterfaceC2137a f30608e;

    /* renamed from: f */
    public final Context f30609f;

    /* renamed from: g */
    public final m1 f30610g;

    /* renamed from: h */
    public final w0 f30611h;

    /* renamed from: i */
    public final m1 f30612i;

    /* renamed from: j */
    public final w0 f30613j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6296t(C7530w c7530w, InterfaceC2137a resetState, Context context) {
        super(f9.m11628b(context, R.string.sim), f9.m11628b(context, R.string.select_sim_app_bar_title), c7530w);
        AbstractC4154l.m8923f(resetState, "resetState");
        AbstractC4154l.m8923f(context, "context");
        this.f30607d = c7530w;
        this.f30608e = resetState;
        this.f30609f = context;
        m1 m1VarM15372c = c1.m15372c(c7530w);
        this.f30610g = m1VarM15372c;
        this.f30611h = new w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c(c7530w);
        this.f30612i = m1VarM15372c2;
        this.f30613j = new w0(m1VarM15372c2);
        C0496f c0496f = m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4032f(this, (InterfaceC7559c) null, 9), 3);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: d */
    public final w0 mo12301d() {
        return this.f30613j;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: e */
    public final String mo12302e() {
        return m12322o().f36250c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6296t)) {
            return false;
        }
        C6296t c6296t = (C6296t) obj;
        return AbstractC4154l.m8918a(this.f30607d, c6296t.f30607d) && AbstractC4154l.m8918a(this.f30608e, c6296t.f30608e) && AbstractC4154l.m8918a(this.f30609f, c6296t.f30609f);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: f */
    public final h0 mo12303f() {
        return h0.SIM_FILTER;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: g */
    public final InterfaceC2137a mo12304g() {
        return this.f30608e;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: h */
    public final w0 mo12305h() {
        return this.f30611h;
    }

    public final int hashCode() {
        return this.f30609f.hashCode() + ((this.f30608e.hashCode() + (this.f30607d.hashCode() * 31)) * 31);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: i */
    public final u0 mo12306i() {
        return this.f30612i;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: j */
    public final u0 mo12307j() {
        return this.f30610g;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: k */
    public final boolean mo12308k() {
        return ((C7530w) this.f30613j.f39340a.getValue()).f36270b != -1;
    }

    /* renamed from: n */
    public final ArrayList m12321n() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : this.f30607d.f36269a) {
            arrayList.add(new k0(o0Var.f36250c, o0Var.f36249b));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final o0 m12322o() {
        w0 w0Var = this.f30611h;
        return (o0) ((C7530w) w0Var.f39340a.getValue()).f36269a.get(((C7530w) w0Var.f39340a.getValue()).f36270b);
    }

    /* renamed from: p */
    public final void m12323p(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30610g;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    /* renamed from: q */
    public final void m12324q(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30612i;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    public final String toString() {
        return "SimSelection(filterType=" + this.f30607d + ", resetState=" + this.f30608e + ", context=" + this.f30609f + ")";
    }
}
