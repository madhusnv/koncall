package c6;

import android.view.WindowInsets;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class s1 extends r1 {

    /* renamed from: o */
    public C7340b f5516o;

    /* renamed from: p */
    public C7340b f5517p;

    /* renamed from: q */
    public C7340b f5518q;

    public s1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
        this.f5516o = null;
        this.f5517p = null;
        this.f5518q = null;
    }

    @Override // c6.v1
    /* renamed from: i */
    public C7340b mo2512i() {
        if (this.f5517p == null) {
            this.f5517p = C7340b.m13737c(this.f5501c.getMandatorySystemGestureInsets());
        }
        return this.f5517p;
    }

    @Override // c6.v1
    /* renamed from: k */
    public C7340b mo2513k() {
        if (this.f5516o == null) {
            this.f5516o = C7340b.m13737c(this.f5501c.getSystemGestureInsets());
        }
        return this.f5516o;
    }

    @Override // c6.v1
    /* renamed from: m */
    public C7340b mo2514m() {
        if (this.f5518q == null) {
            this.f5518q = C7340b.m13737c(this.f5501c.getTappableElementInsets());
        }
        return this.f5518q;
    }

    @Override // c6.p1, c6.v1
    /* renamed from: n */
    public y1 mo2478n(int i10, int i11, int i12, int i13) {
        return y1.m2537d(null, this.f5501c.inset(i10, i11, i12, i13));
    }

    public s1(y1 y1Var, s1 s1Var) {
        super(y1Var, s1Var);
        this.f5516o = null;
        this.f5517p = null;
        this.f5518q = null;
    }

    @Override // c6.q1, c6.v1
    /* renamed from: u */
    public void mo2497u(C7340b c7340b) {
    }
}
