package j0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import mm.AbstractC4801l;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j0.f */
/* loaded from: classes.dex */
public abstract class AbstractC3506f {

    /* renamed from: a */
    public static final RectF f18377a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m8066a(RectF rectF, RectF rectF2, int i10, boolean z6) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f18377a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i10);
        if (z6) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: b */
    public static int m8067b(Matrix matrix) {
        matrix.getValues(new float[9]);
        return m8072g((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    /* renamed from: c */
    public static boolean m8068c(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Invalid rotation degrees: "));
    }

    /* renamed from: d */
    public static boolean m8069d(Size size, boolean z6, Size size2) {
        float width;
        float width2;
        if (z6) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    /* renamed from: e */
    public static Size m8070e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* renamed from: f */
    public static Size m8071f(Size size, int i10) {
        y0.m11051a("Invalid rotation degrees: " + i10, i10 % 90 == 0);
        return m8068c(m8072g(i10)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: g */
    public static int m8072g(int i10) {
        return ((i10 % 360) + 360) % 360;
    }
}
