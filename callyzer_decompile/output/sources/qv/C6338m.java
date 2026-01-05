package qv;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import nn.C5113e;
import pg.y8;
import rw.AbstractC6663m;
import rw.C6668r;
import tx.c0;
import wx.c1;
import wx.m1;
import yv.C8801p;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.m */
/* loaded from: classes3.dex */
public final class C6338m extends w0 {

    /* renamed from: b */
    public final Context f30719b;

    /* renamed from: c */
    public final C5113e f30720c;

    /* renamed from: d */
    public final C9000c f30721d;

    /* renamed from: e */
    public final C4494g f30722e;

    /* renamed from: f */
    public final wx.w0 f30723f;

    /* renamed from: g */
    public final m1 f30724g;

    /* renamed from: h */
    public final m1 f30725h;

    public C6338m(Context context, C5113e c5113e, C9000c c9000c, C4494g c4494g, wx.w0 w0Var) {
        this.f30719b = context;
        this.f30720c = c5113e;
        this.f30721d = c9000c;
        this.f30722e = c4494g;
        this.f30723f = w0Var;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C6328c("", null, c6668r, c6668r));
        this.f30724g = m1VarM15372c;
        this.f30725h = m1VarM15372c;
        c0.m13502y(q0.m5340g(this), null, null, new C6337l(this, null, 0), 3);
    }

    /* renamed from: e */
    public final void m12362e(AbstractC6349x event) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C6347v;
        m1 m1Var = this.f30724g;
        if (z6) {
            do {
                value6 = m1Var.getValue();
            } while (!m1Var.m15397i(value6, C6328c.m12361a((C6328c) value6, ((C6347v) event).f30741a, null, null, null, 14)));
            return;
        }
        if (event instanceof C6342q) {
            do {
                value5 = m1Var.getValue();
            } while (!m1Var.m15397i(value5, C6328c.m12361a((C6328c) value5, null, null, null, ((C6342q) event).f30736a, 7)));
            return;
        }
        if (event instanceof C6344s) {
            do {
                value4 = m1Var.getValue();
            } while (!m1Var.m15397i(value4, C6328c.m12361a((C6328c) value4, null, ((C6344s) event).f30738a, null, null, 13)));
            return;
        }
        if (event instanceof C6345t) {
            ArrayList arrayListD0 = AbstractC6663m.d0(((C6328c) this.f30725h.getValue()).f30687c);
            arrayListD0.add(((C6345t) event).f30739a);
            do {
                value3 = m1Var.getValue();
            } while (!m1Var.m15397i(value3, C6328c.m12361a((C6328c) value3, null, null, arrayListD0, null, 11)));
            arrayListD0.toString();
            return;
        }
        if (event instanceof C6346u) {
            if (!((C8801p) this.f30723f.f39340a.getValue()).f42464a) {
                y8.m11949d(this.f30719b, R.string.no_internet_connection);
                return;
            } else {
                c0.m13502y(q0.m5340g(this), null, null, new C6337l(this, null, 1), 3);
                return;
            }
        }
        if (event instanceof C6343r) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C6328c.m12361a((C6328c) value2, null, null, C6668r.f31943a, null, 11)));
        } else {
            if (!(event instanceof C6348w)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C6328c.m12361a((C6328c) value, null, null, null, ((C6348w) event).f30742a, 7)));
        }
    }
}
