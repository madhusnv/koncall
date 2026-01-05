package m0;

import android.util.Rational;
import android.util.Size;
import i0.b1;
import i0.e0;
import pg.j7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.j */
/* loaded from: classes.dex */
public final class C4616j {

    /* renamed from: a */
    public final int f22858a;

    /* renamed from: b */
    public final int f22859b;

    /* renamed from: c */
    public final Rational f22860c;

    /* renamed from: d */
    public final boolean f22861d;

    public C4616j(e0 e0Var, Rational rational) {
        this.f22858a = e0Var.mo7322d();
        this.f22859b = e0Var.mo7326i();
        this.f22860c = rational;
        boolean z6 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z6 = false;
        }
        this.f22861d = z6;
    }

    /* renamed from: a */
    public final Size m9500a(b1 b1Var) {
        int iM7300C = b1Var.m7300C();
        Size size = (Size) b1Var.mo7401e(b1.f44336l0, null);
        if (size != null) {
            int iM11712b = j7.m11712b(j7.m11713c(iM7300C), this.f22858a, 1 == this.f22859b);
            if (iM11712b == 90 || iM11712b == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }
}
