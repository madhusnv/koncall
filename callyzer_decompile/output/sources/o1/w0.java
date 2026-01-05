package o1;

import android.os.Build;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import c6.InterfaceC0893w;
import c9.C0917l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends AbstractC0315j implements Runnable, InterfaceC0893w, View.OnAttachStateChangeListener {

    /* renamed from: c */
    public final w1 f25859c;

    /* renamed from: d */
    public boolean f25860d;

    /* renamed from: e */
    public boolean f25861e;

    /* renamed from: f */
    public c6.y1 f25862f;

    public w0(w1 w1Var) {
        super(!w1Var.f25882s ? 1 : 0);
        this.f25859c = w1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: d */
    public final void mo925d(c6.i1 i1Var) {
        this.f25860d = false;
        this.f25861e = false;
        c6.y1 y1Var = this.f25862f;
        if (i1Var.f5469a.mo2385a() != 0 && y1Var != null) {
            c6.v1 v1Var = y1Var.f5541a;
            w1 w1Var = this.f25859c;
            w1Var.f25881r.m10372f(AbstractC5244c.m10332q(v1Var.mo2475g(8)));
            w1Var.f25880q.m10372f(AbstractC5244c.m10332q(v1Var.mo2475g(8)));
            w1.m10374a(w1Var, y1Var);
        }
        this.f25862f = null;
    }

    @Override // c6.InterfaceC0893w
    /* renamed from: e */
    public final c6.y1 mo2531e(View view, c6.y1 y1Var) {
        this.f25862f = y1Var;
        w1 w1Var = this.f25859c;
        t1 t1Var = w1Var.f25880q;
        c6.v1 v1Var = y1Var.f5541a;
        t1Var.m10372f(AbstractC5244c.m10332q(v1Var.mo2475g(8)));
        if (this.f25860d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f25861e) {
            w1Var.f25881r.m10372f(AbstractC5244c.m10332q(v1Var.mo2475g(8)));
            w1.m10374a(w1Var, y1Var);
        }
        return w1Var.f25882s ? c6.y1.f5540b : y1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: f */
    public final void mo926f() {
        this.f25860d = true;
        this.f25861e = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: g */
    public final c6.y1 mo927g(c6.y1 y1Var) {
        w1 w1Var = this.f25859c;
        w1.m10374a(w1Var, y1Var);
        return w1Var.f25882s ? c6.y1.f5540b : y1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: h */
    public final C0917l mo928h(C0917l c0917l) {
        this.f25860d = false;
        return c0917l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f25860d) {
            this.f25860d = false;
            this.f25861e = false;
            c6.y1 y1Var = this.f25862f;
            if (y1Var != null) {
                w1 w1Var = this.f25859c;
                w1Var.f25881r.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2475g(8)));
                w1.m10374a(w1Var, y1Var);
                this.f25862f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
