package p001o;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public abstract class pe8 {

    /* renamed from: a */
    public static boolean f39946a = true;

    /* renamed from: o.pe8$a */
    public static class C16079a {
        /* renamed from: a */
        public static void m43514a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    /* renamed from: a */
    public static void m43512a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            C16079a.m43514a(imageView, matrix);
            return;
        }
        if (matrix != null) {
            m43513b(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    /* renamed from: b */
    public static void m43513b(ImageView imageView, Matrix matrix) {
        if (f39946a) {
            try {
                C16079a.m43514a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f39946a = false;
            }
        }
    }
}
