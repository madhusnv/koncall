package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* loaded from: classes2.dex */
public abstract class wuh {

    /* renamed from: a */
    public static final RectF f52680a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static float m55032a(float f, float f2, float f3, float f4) {
        float f5 = (f * f3) + (f2 * f4);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f * f) + (f2 * f2)) * Math.sqrt((f3 * f3) + (f4 * f4));
        return (float) Math.toDegrees(Math.atan2(f6 / dSqrt, f5 / dSqrt));
    }

    /* renamed from: b */
    public static Matrix m55033b(Rect rect) {
        return m55034c(new RectF(rect));
    }

    /* renamed from: c */
    public static Matrix m55034c(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f52680a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: d */
    public static Matrix m55035d(RectF rectF, RectF rectF2, int i) {
        return m55036e(rectF, rectF2, i, false);
    }

    /* renamed from: e */
    public static Matrix m55036e(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f52680a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(m55034c(rectF2));
        return matrix;
    }

    /* renamed from: f */
    public static Size m55037f(Rect rect, int i) {
        return m55046o(m55044m(rect), i);
    }

    /* renamed from: g */
    public static int m55038g(Matrix matrix) {
        matrix.getValues(new float[9]);
        return m55052u((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    /* renamed from: h */
    public static boolean m55039h(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* renamed from: i */
    public static boolean m55040i(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    /* renamed from: j */
    public static boolean m55041j(Size size, Size size2) {
        return m55042k(size, false, size2, false);
    }

    /* renamed from: k */
    public static boolean m55042k(Size size, boolean z, Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    /* renamed from: l */
    public static boolean m55043l(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return m55032a(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    /* renamed from: m */
    public static Size m55044m(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* renamed from: n */
    public static Size m55045n(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: o */
    public static Size m55046o(Size size, int i) {
        fgd.m26658b(i % 90 == 0, "Invalid rotation degrees: " + i);
        return m55040i(m55052u(i)) ? m55045n(size) : size;
    }

    /* renamed from: p */
    public static Rect m55047p(Size size) {
        return m55048q(size, 0, 0);
    }

    /* renamed from: q */
    public static Rect m55048q(Size size, int i, int i2) {
        return new Rect(i, i2, size.getWidth() + i, size.getHeight() + i2);
    }

    /* renamed from: r */
    public static RectF m55049r(Size size) {
        return m55050s(size, 0, 0);
    }

    /* renamed from: s */
    public static RectF m55050s(Size size, int i, int i2) {
        return new RectF(i, i2, i + size.getWidth(), i2 + size.getHeight());
    }

    /* renamed from: t */
    public static Matrix m55051t(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    /* renamed from: u */
    public static int m55052u(int i) {
        return ((i % 360) + 360) % 360;
    }
}
