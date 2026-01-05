package p001o;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes5.dex */
public abstract class jri {
    /* renamed from: a */
    public static float m34413a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    /* renamed from: b */
    public static float m34414b(View view) {
        ((View) view.getParent()).getLocationInWindow(new int[]{(int) view.getX(), 0});
        return r0[0];
    }

    /* renamed from: c */
    public static float m34415c(View view) {
        ((View) view.getParent()).getLocationInWindow(new int[]{0, (int) view.getY()});
        return r0[1];
    }

    /* renamed from: d */
    public static void m34416d(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
