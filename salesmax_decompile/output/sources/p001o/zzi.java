package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class zzi {

    /* renamed from: a */
    public static final c0j f57934a;

    /* renamed from: b */
    public static final Property f57935b;

    /* renamed from: c */
    public static final Property f57936c;

    /* renamed from: o.zzi$a */
    public class C18737a extends Property {
        public C18737a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(zzi.m60169b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            zzi.m60173f(view, f.floatValue());
        }
    }

    /* renamed from: o.zzi$b */
    public class C18738b extends Property {
        public C18738b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f57934a = new k0j();
        } else {
            f57934a = new j0j();
        }
        f57935b = new C18737a(Float.class, "translationAlpha");
        f57936c = new C18738b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m60168a(View view) {
        f57934a.m20027a(view);
    }

    /* renamed from: b */
    public static float m60169b(View view) {
        return f57934a.mo20028b(view);
    }

    /* renamed from: c */
    public static void m60170c(View view) {
        f57934a.m20029c(view);
    }

    /* renamed from: d */
    public static void m60171d(View view, Matrix matrix) {
        f57934a.mo20030d(view, matrix);
    }

    /* renamed from: e */
    public static void m60172e(View view, int i, int i2, int i3, int i4) {
        f57934a.mo20031e(view, i, i2, i3, i4);
    }

    /* renamed from: f */
    public static void m60173f(View view, float f) {
        f57934a.mo20032f(view, f);
    }

    /* renamed from: g */
    public static void m60174g(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f57934a.mo20033g(view, i);
    }

    /* renamed from: h */
    public static void m60175h(View view, Matrix matrix) {
        f57934a.mo20034h(view, matrix);
    }

    /* renamed from: i */
    public static void m60176i(View view, Matrix matrix) {
        f57934a.mo20035i(view, matrix);
    }
}
