package j0;

import android.util.Rational;
import android.util.Size;
import og.y0;
import p0.AbstractC5787a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j0.b */
/* loaded from: classes.dex */
public abstract class AbstractC3502b {

    /* renamed from: a */
    public static final Rational f18368a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f18369b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f18370c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f18371d = new Rational(9, 16);

    /* renamed from: a */
    public static boolean m8054a(Rational rational, Size size) {
        Size size2 = AbstractC5787a.f28369b;
        if (rational != null) {
            if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                return true;
            }
            if (size.getHeight() * size.getWidth() >= AbstractC5787a.m11337a(size2)) {
                int width = size.getWidth();
                int height = size.getHeight();
                Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                int i10 = width % 16;
                if (i10 == 0 && height % 16 == 0) {
                    if (m8055b(Math.max(0, height - 16), width, rational) || m8055b(Math.max(0, width - 16), height, rational2)) {
                        return true;
                    }
                } else {
                    if (i10 == 0) {
                        return m8055b(height, width, rational);
                    }
                    if (height % 16 == 0) {
                        return m8055b(width, height, rational2);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m8055b(int i10, int i11, Rational rational) {
        y0.m11052b(i11 % 16 == 0);
        double numerator = (rational.getNumerator() * i10) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
