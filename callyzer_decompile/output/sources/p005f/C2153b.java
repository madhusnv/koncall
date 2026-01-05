package p005f;

import android.view.View;
import b2.y0;
import d7.q0;
import g2.n5;
import g2.o7;
import k2.e0;
import p007h.C2756h;
import qw.a0;
import s1.C6726u;
import s1.d0;
import s1.h0;
import ur.AbstractC7524q;
import ur.C7508a;
import w3.n1;
import w4.C7927s;
import w4.DialogC7924p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.b */
/* loaded from: classes.dex */
public final class C2153b implements e0 {

    /* renamed from: a */
    public final /* synthetic */ int f9996a;

    /* renamed from: b */
    public final /* synthetic */ Object f9997b;

    public /* synthetic */ C2153b(int i10, Object obj) {
        this.f9996a = i10;
        this.f9997b = obj;
    }

    @Override // k2.e0
    public final void dispose() {
        a0 a0Var;
        switch (this.f9996a) {
            case 0:
                C2756h c2756h = ((C2152a) this.f9997b).f9995a;
                if (c2756h != null) {
                    c2756h.m6749b();
                    a0Var = a0.f30746a;
                } else {
                    a0Var = null;
                }
                if (a0Var == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 1:
                ((C2158g) this.f9997b).m5514e();
                return;
            case 2:
                ((C2164m) this.f9997b).m5514e();
                return;
            case 3:
                n5 n5Var = (n5) this.f9997b;
                View view = n5Var.f12190b;
                if (n5Var.f12189a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(n5Var);
                    n5Var.f12189a = false;
                }
                view.removeOnAttachStateChangeListener(n5Var);
                return;
            case 4:
                o7 o7Var = (o7) this.f9997b;
                o7Var.dismiss();
                o7Var.f12287g.disposeComposition();
                return;
            case 5:
                ((AbstractC7524q) this.f9997b).mo2033e(C7508a.f36203a);
                return;
            case 6:
                ((C6726u) this.f9997b).f32141d = null;
                return;
            case 7:
                ((h0) this.f9997b).f32073c = null;
                return;
            case 8:
                ((d0) this.f9997b).f32061f = true;
                return;
            case 9:
                ((n1) this.f9997b).f37897a.invoke();
                return;
            case 10:
                DialogC7924p dialogC7924p = (DialogC7924p) this.f9997b;
                dialogC7924p.dismiss();
                dialogC7924p.f38119g.disposeComposition();
                return;
            case 11:
                C7927s c7927s = (C7927s) this.f9997b;
                c7927s.disposeComposition();
                c7927s.getClass();
                q0.m5341h(c7927s, null);
                c7927s.f38131f.removeViewImmediate(c7927s);
                return;
            default:
                ((y0) this.f9997b).m1702l();
                return;
        }
    }
}
