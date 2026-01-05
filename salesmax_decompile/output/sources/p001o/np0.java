package p001o;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class np0 {

    /* renamed from: a */
    public static final Rational f37119a = new Rational(4, 3);

    /* renamed from: b */
    public static final Rational f37120b = new Rational(3, 4);

    /* renamed from: c */
    public static final Rational f37121c = new Rational(16, 9);

    /* renamed from: d */
    public static final Rational f37122d = new Rational(9, 16);

    /* renamed from: o.np0$a */
    public static final class C15625a implements Comparator {

        /* renamed from: a */
        public final Rational f37123a;

        /* renamed from: b */
        public final RectF f37124b;

        /* renamed from: c */
        public final Rational f37125c;

        public C15625a(Rational rational, Rational rational2) {
            this.f37123a = rational;
            this.f37125c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f37124b = m40893d(rational);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFM40893d = m40893d(rational);
            RectF rectFM40893d2 = m40893d(rational2);
            boolean zM40894e = m40894e(rectFM40893d, this.f37124b);
            boolean zM40894e2 = m40894e(rectFM40893d2, this.f37124b);
            if (zM40894e && zM40894e2) {
                return (int) Math.signum(m40891b(rectFM40893d) - m40891b(rectFM40893d2));
            }
            if (zM40894e) {
                return -1;
            }
            if (zM40894e2) {
                return 1;
            }
            return -((int) Math.signum(m40892c(rectFM40893d, this.f37124b) - m40892c(rectFM40893d2, this.f37124b)));
        }

        /* renamed from: b */
        public final float m40891b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* renamed from: c */
        public final float m40892c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        /* renamed from: d */
        public final RectF m40893d(Rational rational) {
            return rational.floatValue() == this.f37125c.floatValue() ? new RectF(0.0f, 0.0f, this.f37125c.getNumerator(), this.f37125c.getDenominator()) : rational.floatValue() > this.f37125c.floatValue() ? new RectF(0.0f, 0.0f, this.f37125c.getNumerator(), (rational.getDenominator() * this.f37125c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f37125c.getDenominator()) / rational.getDenominator(), this.f37125c.getDenominator());
        }

        /* renamed from: e */
        public final boolean m40894e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }
    }

    /* renamed from: a */
    public static boolean m40886a(Size size, Rational rational) {
        return m40887b(size, rational, mvf.f36040c);
    }

    /* renamed from: b */
    public static boolean m40887b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (mvf.m39726b(size) >= mvf.m39726b(size2)) {
            return m40888c(size, rational);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m40888c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return m40889d(Math.max(0, height + (-16)), width, rational) || m40889d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i == 0) {
            return m40889d(height, width, rational);
        }
        if (height % 16 == 0) {
            return m40889d(width, height, rational2);
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m40889d(int i, int i2, Rational rational) {
        fgd.m26657a(i2 % 16 == 0);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
