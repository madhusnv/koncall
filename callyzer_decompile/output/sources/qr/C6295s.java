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
import tx.m0;
import ur.C7530w;
import ur.h0;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import wx.u0;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.s */
/* loaded from: classes3.dex */
public final class C6295s extends AbstractC6297u {

    /* renamed from: d */
    public final C7530w f30599d;

    /* renamed from: e */
    public final Context f30600e;

    /* renamed from: f */
    public final InterfaceC2137a f30601f;

    /* renamed from: g */
    public final InterfaceC2137a f30602g;

    /* renamed from: h */
    public final m1 f30603h;

    /* renamed from: i */
    public final w0 f30604i;

    /* renamed from: j */
    public final m1 f30605j;

    /* renamed from: k */
    public final w0 f30606k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295s(C7530w c7530w, Context context, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        super(f9.m11628b(context, R.string.exclude_numbers), f9.m11628b(context, R.string.exclude_number), c7530w);
        AbstractC4154l.m8923f(context, "context");
        this.f30599d = c7530w;
        this.f30600e = context;
        this.f30601f = interfaceC2137a;
        this.f30602g = interfaceC2137a2;
        m1 m1VarM15372c = c1.m15372c(c7530w);
        this.f30603h = m1VarM15372c;
        this.f30604i = new w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c(c7530w);
        this.f30605j = m1VarM15372c2;
        this.f30606k = new w0(m1VarM15372c2);
        C0496f c0496f = m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4032f(this, (InterfaceC7559c) null, 8), 3);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: d */
    public final w0 mo12301d() {
        return this.f30606k;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: e */
    public final String mo12302e() {
        ur.g0 g0VarM12318o = m12318o();
        ur.g0 g0Var = ur.g0.YES;
        Context context = this.f30600e;
        return g0VarM12318o == g0Var ? f9.m11628b(context, R.string.ex_no_yes) : f9.m11628b(context, R.string.ex_no_no);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6295s)) {
            return false;
        }
        C6295s c6295s = (C6295s) obj;
        return AbstractC4154l.m8918a(this.f30599d, c6295s.f30599d) && AbstractC4154l.m8918a(this.f30600e, c6295s.f30600e) && AbstractC4154l.m8918a(this.f30601f, c6295s.f30601f) && AbstractC4154l.m8918a(this.f30602g, c6295s.f30602g);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: f */
    public final h0 mo12303f() {
        return h0.EXCLUDE_NUMBER;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: g */
    public final InterfaceC2137a mo12304g() {
        return this.f30602g;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: h */
    public final w0 mo12305h() {
        return this.f30604i;
    }

    public final int hashCode() {
        return this.f30602g.hashCode() + ((this.f30601f.hashCode() + ((this.f30600e.hashCode() + (this.f30599d.hashCode() * 31)) * 31)) * 31);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: i */
    public final u0 mo12306i() {
        return this.f30605j;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: j */
    public final u0 mo12307j() {
        return this.f30603h;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: k */
    public final boolean mo12308k() {
        return true;
    }

    /* renamed from: n */
    public final List m12317n() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f30599d.f36269a.iterator();
        while (it.hasNext()) {
            arrayList.add(f9.m11628b(this.f30600e, ((ur.g0) it.next()).getExcludeTitle()));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final ur.g0 m12318o() {
        w0 w0Var = this.f30604i;
        return (ur.g0) ((C7530w) w0Var.f39340a.getValue()).f36269a.get(((C7530w) w0Var.f39340a.getValue()).f36270b);
    }

    /* renamed from: p */
    public final void m12319p(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30603h;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    /* renamed from: q */
    public final void m12320q(int i10) {
        m1 m1Var;
        Object value;
        do {
            m1Var = this.f30605j;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7530w.m14295a((C7530w) value, null, i10, 5)));
    }

    public final String toString() {
        return "ExcludeNumber(filterType=" + this.f30599d + ", context=" + this.f30600e + ", transferToExcludeNumber=" + this.f30601f + ", resetState=" + this.f30602g + ")";
    }
}
