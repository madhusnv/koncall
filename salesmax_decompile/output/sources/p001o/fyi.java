package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class fyi {
    /* renamed from: a */
    public static Map m27765a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        fgd.m26658b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((k7g) entry.getValue()).mo35129e().getWidth(), ((k7g) entry.getValue()).mo35129e().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((w8i) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFM27771g = m27771g(rectF2, ke8.m35533f(i, rational), i2, z, i3, i);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFM27771g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((w8i) entry2.getKey(), rect2);
        }
        return map3;
    }

    /* renamed from: b */
    public static RectF m27766b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2 = i == 0 && !z;
        boolean z3 = i == 90 && z;
        if (z2 || z3) {
            return rectF2;
        }
        boolean z4 = i == 0 && z;
        boolean z5 = i == 270 && !z;
        if (z4 || z5) {
            return m27767c(rectF2, rectF.centerX());
        }
        boolean z6 = i == 90 && !z;
        boolean z7 = i == 180 && z;
        if (z6 || z7) {
            return m27768d(rectF2, rectF.centerY());
        }
        boolean z8 = i == 180 && !z;
        boolean z9 = i == 270 && z;
        if (z8 || z9) {
            return m27767c(m27768d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
    }

    /* renamed from: c */
    public static RectF m27767c(RectF rectF, float f) {
        return new RectF(m27769e(rectF.right, f), rectF.top, m27769e(rectF.left, f), rectF.bottom);
    }

    /* renamed from: d */
    public static RectF m27768d(RectF rectF, float f) {
        return new RectF(rectF.left, m27770f(rectF.bottom, f), rectF.right, m27770f(rectF.top, f));
    }

    /* renamed from: e */
    public static float m27769e(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: f */
    public static float m27770f(float f, float f2) {
        return (f2 + f2) - f;
    }

    /* renamed from: g */
    public static RectF m27771g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m27766b(m27772h(z, i2), i3, rectF, rectF3);
    }

    /* renamed from: h */
    public static boolean m27772h(boolean z, int i) {
        return z ^ (i == 1);
    }
}
