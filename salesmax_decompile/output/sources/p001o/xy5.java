package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public abstract class xy5 {

    /* renamed from: o.xy5$a */
    public static class C18261a {
        /* renamed from: a */
        public static void m56957a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* renamed from: o.xy5$b */
    public static class C18262b {
        /* renamed from: a */
        public static void m56958a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    /* renamed from: a */
    public static Drawable m56942a(Drawable drawable, Drawable drawable2) {
        return m56943b(drawable, drawable2, -1, -1);
    }

    /* renamed from: b */
    public static Drawable m56943b(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1) {
            i = m56950i(drawable, drawable2);
        }
        if (i2 == -1) {
            i2 = m56949h(drawable, drawable2);
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    /* renamed from: c */
    public static Drawable m56944c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m56946e(drawable, colorStateList, mode, false);
    }

    /* renamed from: d */
    public static Drawable m56945d(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return m56946e(drawable, colorStateList, mode, false);
    }

    /* renamed from: e */
    public static Drawable m56946e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = fy5.m27744r(drawable).mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }

    /* renamed from: f */
    public static int[] m56947f(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    /* renamed from: g */
    public static ColorStateList m56948g(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !oy5.m42761a(drawable)) {
            return null;
        }
        return qy5.m45976a(drawable).getColorStateList();
    }

    /* renamed from: h */
    public static int m56949h(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    /* renamed from: i */
    public static int m56950i(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    /* renamed from: j */
    public static int[] m56951j(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    /* renamed from: k */
    public static AttributeSet m56952k(Context context, int i, CharSequence charSequence) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    /* renamed from: l */
    public static void m56953l(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C18262b.m56958a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                C18261a.m56957a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C18261a.m56957a(outline, path);
        }
    }

    /* renamed from: m */
    public static void m56954m(RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    /* renamed from: n */
    public static void m56955n(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    /* renamed from: o */
    public static PorterDuffColorFilter m56956o(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
