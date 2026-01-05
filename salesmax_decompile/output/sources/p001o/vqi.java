package p001o;

import android.widget.ImageView;

/* loaded from: classes5.dex */
public abstract class vqi {

    /* renamed from: o.vqi$a */
    public static /* synthetic */ class C17656a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50758a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f50758a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m53293a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: b */
    public static int m53294b(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: c */
    public static boolean m53295c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: d */
    public static boolean m53296d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C17656a.f50758a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
