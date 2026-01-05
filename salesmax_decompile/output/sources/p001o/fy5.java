package p001o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public abstract class fy5 {

    /* renamed from: o.fy5$a */
    public static class C13589a {
        /* renamed from: a */
        public static void m27745a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        public static boolean m27746b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        public static ColorFilter m27747c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        public static void m27748d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        public static void m27749e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        public static void m27750f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m27751g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        public static void m27752h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        public static void m27753i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: o.fy5$b */
    public static class C13590b {
        /* renamed from: a */
        public static int m27754a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        public static boolean m27755b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m27727a(Drawable drawable, Resources.Theme theme) {
        C13589a.m27745a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m27728b(Drawable drawable) {
        return C13589a.m27746b(drawable);
    }

    /* renamed from: c */
    public static void m27729c(Drawable drawable) {
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m27730d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: e */
    public static ColorFilter m27731e(Drawable drawable) {
        return C13589a.m27747c(drawable);
    }

    /* renamed from: f */
    public static int m27732f(Drawable drawable) {
        return C13590b.m27754a(drawable);
    }

    /* renamed from: g */
    public static void m27733g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C13589a.m27748d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m27734h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: i */
    public static void m27735i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m27736j(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: k */
    public static void m27737k(Drawable drawable, float f, float f2) {
        C13589a.m27749e(drawable, f, f2);
    }

    /* renamed from: l */
    public static void m27738l(Drawable drawable, int i, int i2, int i3, int i4) {
        C13589a.m27750f(drawable, i, i2, i3, i4);
    }

    /* renamed from: m */
    public static boolean m27739m(Drawable drawable, int i) {
        return C13590b.m27755b(drawable, i);
    }

    /* renamed from: n */
    public static void m27740n(Drawable drawable, int i) {
        C13589a.m27751g(drawable, i);
    }

    /* renamed from: o */
    public static void m27741o(Drawable drawable, ColorStateList colorStateList) {
        C13589a.m27752h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m27742p(Drawable drawable, PorterDuff.Mode mode) {
        C13589a.m27753i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static Drawable m27743q(Drawable drawable) {
        return drawable instanceof qcj ? ((qcj) drawable).m45106a() : drawable;
    }

    /* renamed from: r */
    public static Drawable m27744r(Drawable drawable) {
        return drawable;
    }
}
