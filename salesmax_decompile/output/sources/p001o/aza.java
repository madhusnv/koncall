package p001o;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class aza {
    /* renamed from: a */
    public static o74 m18040a(int i) {
        return i != 0 ? i != 1 ? m18041b() : new fk4() : new yue();
    }

    /* renamed from: b */
    public static o74 m18041b() {
        return new yue();
    }

    /* renamed from: c */
    public static e36 m18042c() {
        return new e36();
    }

    /* renamed from: d */
    public static void m18043d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof zya) {
            ((zya) background).f0(f);
        }
    }

    /* renamed from: e */
    public static void m18044e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof zya) {
            m18045f(view, (zya) background);
        }
    }

    /* renamed from: f */
    public static void m18045f(View view, zya zyaVar) {
        if (zyaVar.m60117W()) {
            zyaVar.k0(xzi.m57077m(view));
        }
    }
}
