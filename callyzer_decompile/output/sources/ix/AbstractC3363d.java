package ix;

import ax.AbstractC0490a;
import jx.C3863a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ix.d */
/* loaded from: classes3.dex */
public abstract class AbstractC3363d {

    /* renamed from: a */
    public static final C3362c f17771a = new C3362c();

    /* renamed from: b */
    public static final AbstractC3360a f17772b;

    static {
        Integer num = AbstractC0490a.f3516a;
        f17772b = (num == null || num.intValue() >= 34) ? new C3863a() : new C3361b();
    }

    /* renamed from: a */
    public abstract double mo7673a();

    /* renamed from: b */
    public double mo7675b(double d2) {
        return mo7676c(d2);
    }

    /* renamed from: c */
    public double mo7676c(double d2) {
        double dMo7673a;
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException(("Random range is empty: [" + Double.valueOf(0.0d) + ", " + Double.valueOf(d2) + ").").toString());
        }
        double d10 = d2 - 0.0d;
        if (!Double.isInfinite(d10) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            dMo7673a = 0.0d + (mo7673a() * d10);
        } else {
            double d11 = 2;
            double dMo7673a2 = ((d2 / d11) - (0.0d / d11)) * mo7673a();
            dMo7673a = 0.0d + dMo7673a2 + dMo7673a2;
        }
        return dMo7673a >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dMo7673a;
    }
}
