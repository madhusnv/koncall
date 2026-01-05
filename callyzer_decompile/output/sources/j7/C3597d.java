package j7;

import androidx.fragment.app.m1;
import d7.w0;
import e1.v0;
import nf.C5042d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j7.d */
/* loaded from: classes.dex */
public class C3597d extends w0 {

    /* renamed from: d */
    public static final m1 f19219d = new m1(1);

    /* renamed from: b */
    public final v0 f19220b = new v0(0);

    /* renamed from: c */
    public boolean f19221c = false;

    @Override // d7.w0
    /* renamed from: d */
    public final void mo1209d() {
        v0 v0Var = this.f19220b;
        int iM5649f = v0Var.m5649f();
        for (int i10 = 0; i10 < iM5649f; i10++) {
            C3595b c3595b = (C3595b) v0Var.m5650g(i10);
            C5042d c5042d = c3595b.f19214l;
            c5042d.m9962a();
            c5042d.f24808c = true;
            C3596c c3596c = c3595b.f19216n;
            if (c3596c != null) {
                c3595b.mo5320j(c3596c);
            }
            C3595b c3595b2 = c5042d.f24806a;
            if (c3595b2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c3595b2 != c3595b) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c5042d.f24806a = null;
            if (c3596c != null) {
                boolean z6 = c3596c.f19218b;
            }
            c5042d.f24809d = true;
            c5042d.f24807b = false;
            c5042d.f24808c = false;
            c5042d.f24810e = false;
        }
        int i11 = v0Var.f9075d;
        Object[] objArr = v0Var.f9074c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        v0Var.f9075d = 0;
        v0Var.f9072a = false;
    }
}
