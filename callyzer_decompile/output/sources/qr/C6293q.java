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
import ur.AbstractC7529v;
import ur.C7531x;
import ur.h0;
import ur.k0;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import wx.u0;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.q */
/* loaded from: classes3.dex */
public final class C6293q extends AbstractC6297u {

    /* renamed from: d */
    public final C7531x f30583d;

    /* renamed from: e */
    public final InterfaceC2137a f30584e;

    /* renamed from: f */
    public final Context f30585f;

    /* renamed from: g */
    public final m1 f30586g;

    /* renamed from: h */
    public final w0 f30587h;

    /* renamed from: i */
    public final m1 f30588i;

    /* renamed from: j */
    public final w0 f30589j;

    /* renamed from: k */
    public final h0 f30590k;

    public C6293q(C7531x c7531x, InterfaceC2137a interfaceC2137a, Context context) {
        super(f9.m11628b(context, R.string.calltype), f9.m11628b(context, R.string.select_call_type), c7531x);
        this.f30583d = c7531x;
        this.f30584e = interfaceC2137a;
        this.f30585f = context;
        m1 m1VarM15372c = c1.m15372c(c7531x);
        this.f30586g = m1VarM15372c;
        this.f30587h = new w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c(c7531x);
        this.f30588i = m1VarM15372c2;
        this.f30589j = new w0(m1VarM15372c2);
        C0496f c0496f = m0.f34659a;
        tx.c0.m13502y(tx.c0.m13479b(ExecutorC0495e.f3538c), null, null, new C4032f(this, (InterfaceC7559c) null, 7), 3);
        this.f30590k = h0.CALL_TYPE;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: d */
    public final w0 mo12301d() {
        return this.f30589j;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: e */
    public final String mo12302e() {
        boolean zIsEmpty = m12310o().isEmpty();
        Context context = this.f30585f;
        if (zIsEmpty) {
            return f9.m11628b(context, R.string.call_type);
        }
        return f9.m11628b(context, R.string.call_type) + " (" + m12310o().size() + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6293q)) {
            return false;
        }
        C6293q c6293q = (C6293q) obj;
        return AbstractC4154l.m8918a(this.f30583d, c6293q.f30583d) && AbstractC4154l.m8918a(this.f30584e, c6293q.f30584e) && AbstractC4154l.m8918a(this.f30585f, c6293q.f30585f);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: f */
    public final h0 mo12303f() {
        return this.f30590k;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: g */
    public final InterfaceC2137a mo12304g() {
        return this.f30584e;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: h */
    public final w0 mo12305h() {
        return this.f30587h;
    }

    public final int hashCode() {
        return this.f30585f.hashCode() + ((this.f30584e.hashCode() + (this.f30583d.hashCode() * 31)) * 31);
    }

    @Override // qr.AbstractC6297u
    /* renamed from: i */
    public final u0 mo12306i() {
        return this.f30588i;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: j */
    public final u0 mo12307j() {
        return this.f30586g;
    }

    @Override // qr.AbstractC6297u
    /* renamed from: k */
    public final boolean mo12308k() {
        return !((C7531x) this.f30589j.f39340a.getValue()).f36274b.isEmpty();
    }

    /* renamed from: n */
    public final ArrayList m12309n() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7529v abstractC7529v : this.f30583d.f36273a) {
            arrayList.add(new k0(f9.m11628b(this.f30585f, abstractC7529v.f36265a), abstractC7529v.f36266b));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final ArrayList m12310o() {
        ArrayList arrayList = new ArrayList();
        w0 w0Var = this.f30587h;
        Iterator it = ((C7531x) w0Var.f39340a.getValue()).f36274b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C7531x) w0Var.f39340a.getValue()).f36273a.get(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m12311p(List position) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(position, "position");
        do {
            m1Var = this.f30588i;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7531x.m14296a((C7531x) value, position, 1)));
    }

    /* renamed from: q */
    public final void m12312q(List position) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(position, "position");
        do {
            m1Var = this.f30586g;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C7531x.m14296a((C7531x) value, position, 1)));
    }

    public final String toString() {
        return "CallTypeSelectionFilter(filterType=" + this.f30583d + ", resetState=" + this.f30584e + ", context=" + this.f30585f + ")";
    }
}
