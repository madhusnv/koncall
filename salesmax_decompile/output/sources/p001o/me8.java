package p001o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public abstract class me8 {

    /* renamed from: o.me8$a */
    public static class C15292a {
        /* renamed from: a */
        public static ColorStateList m38814a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m38815b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m38816c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m38817d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m38810a(ImageView imageView) {
        return C15292a.m38814a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m38811b(ImageView imageView) {
        return C15292a.m38815b(imageView);
    }

    /* renamed from: c */
    public static void m38812c(ImageView imageView, ColorStateList colorStateList) {
        C15292a.m38816c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m38813d(ImageView imageView, PorterDuff.Mode mode) {
        C15292a.m38817d(imageView, mode);
    }
}
