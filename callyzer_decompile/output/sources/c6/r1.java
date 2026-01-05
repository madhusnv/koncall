package c6;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class r1 extends q1 {
    public r1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // c6.v1
    /* renamed from: a */
    public y1 mo2500a() {
        return y1.m2537d(null, this.f5501c.consumeDisplayCutout());
    }

    @Override // c6.p1, c6.v1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return Objects.equals(this.f5501c, r1Var.f5501c) && Objects.equals(this.f5505g, r1Var.f5505g) && p1.m2468C(this.f5506h, r1Var.f5506h);
    }

    @Override // c6.v1
    /* renamed from: f */
    public C0881k mo2501f() {
        DisplayCutout displayCutout = this.f5501c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0881k(displayCutout);
    }

    @Override // c6.v1
    public int hashCode() {
        return this.f5501c.hashCode();
    }

    public r1(y1 y1Var, r1 r1Var) {
        super(y1Var, r1Var);
    }
}
