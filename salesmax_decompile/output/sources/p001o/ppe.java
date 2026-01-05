package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p001o.xb7;

/* loaded from: classes2.dex */
public abstract class ppe {

    /* renamed from: a */
    public static final ThreadLocal f40388a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f40389b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f40390c = new Object();

    /* renamed from: o.ppe$a */
    public static class C16157a {
        /* renamed from: a */
        public static Drawable m44044a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        public static Drawable m44045b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: o.ppe$b */
    public static class C16158b {
        /* renamed from: a */
        public static int m44046a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        public static ColorStateList m44047b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: o.ppe$c */
    public static class C16159c {

        /* renamed from: a */
        public final ColorStateList f40391a;

        /* renamed from: b */
        public final Configuration f40392b;

        /* renamed from: c */
        public final int f40393c;

        public C16159c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f40391a = colorStateList;
            this.f40392b = configuration;
            this.f40393c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: o.ppe$d */
    public static final class C16160d {

        /* renamed from: a */
        public final Resources f40394a;

        /* renamed from: b */
        public final Resources.Theme f40395b;

        public C16160d(Resources resources, Resources.Theme theme) {
            this.f40394a = resources;
            this.f40395b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16160d.class != obj.getClass()) {
                return false;
            }
            C16160d c16160d = (C16160d) obj;
            return this.f40394a.equals(c16160d.f40394a) && s6c.m47909a(this.f40395b, c16160d.f40395b);
        }

        public int hashCode() {
            return s6c.m47910b(this.f40394a, this.f40395b);
        }
    }

    /* renamed from: o.ppe$e */
    public static abstract class AbstractC16161e {
        /* renamed from: e */
        public static Handler m44050e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m44053c(final int i, Handler handler) {
            m44050e(handler).post(new Runnable() { // from class: o.rpe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43938a.m44051f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m44054d(final Typeface typeface, Handler handler) {
            m44050e(handler).post(new Runnable() { // from class: o.qpe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42276a.m44052g(typeface);
                }
            });
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void m44051f(int i);

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void m44052g(Typeface typeface);
    }

    /* renamed from: o.ppe$f */
    public static final class C16162f {

        /* renamed from: o.ppe$f$a */
        public static class a {

            /* renamed from: a */
            public static final Object f40396a = new Object();

            /* renamed from: b */
            public static Method f40397b;

            /* renamed from: c */
            public static boolean f40398c;

            /* renamed from: a */
            public static void m44056a(Resources.Theme theme) {
                synchronized (f40396a) {
                    if (!f40398c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f40397b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f40398c = true;
                    }
                    Method method = f40397b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f40397b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: o.ppe$f$b */
        public static class b {
            /* renamed from: a */
            public static void m44057a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m44055a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.m44057a(theme);
            } else {
                a.m44056a(theme);
            }
        }
    }

    /* renamed from: a */
    public static void m44030a(C16160d c16160d, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f40390c) {
            WeakHashMap weakHashMap = f40389b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(c16160d);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(c16160d, sparseArray);
            }
            sparseArray.append(i, new C16159c(colorStateList, c16160d.f40394a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    public static ColorStateList m44031b(C16160d c16160d, int i) {
        C16159c c16159c;
        Resources.Theme theme;
        synchronized (f40390c) {
            SparseArray sparseArray = (SparseArray) f40389b.get(c16160d);
            if (sparseArray != null && sparseArray.size() > 0 && (c16159c = (C16159c) sparseArray.get(i)) != null) {
                if (c16159c.f40392b.equals(c16160d.f40394a.getConfiguration()) && (((theme = c16160d.f40395b) == null && c16159c.f40393c == 0) || (theme != null && c16159c.f40393c == theme.hashCode()))) {
                    return c16159c.f40391a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m44032c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m44042m(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static ColorStateList m44033d(Resources resources, int i, Resources.Theme theme) {
        C16160d c16160d = new C16160d(resources, theme);
        ColorStateList colorStateListM44031b = m44031b(c16160d, i);
        if (colorStateListM44031b != null) {
            return colorStateListM44031b;
        }
        ColorStateList colorStateListM44040k = m44040k(resources, i, theme);
        if (colorStateListM44040k == null) {
            return C16158b.m44047b(resources, i, theme);
        }
        m44030a(c16160d, i, colorStateListM44040k, theme);
        return colorStateListM44040k;
    }

    /* renamed from: e */
    public static Drawable m44034e(Resources resources, int i, Resources.Theme theme) {
        return C16157a.m44044a(resources, i, theme);
    }

    /* renamed from: f */
    public static Drawable m44035f(Resources resources, int i, int i2, Resources.Theme theme) {
        return C16157a.m44045b(resources, i, i2, theme);
    }

    /* renamed from: g */
    public static Typeface m44036g(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m44042m(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: h */
    public static Typeface m44037h(Context context, int i, TypedValue typedValue, int i2, AbstractC16161e abstractC16161e) {
        if (context.isRestricted()) {
            return null;
        }
        return m44042m(context, i, typedValue, i2, abstractC16161e, null, true, false);
    }

    /* renamed from: i */
    public static void m44038i(Context context, int i, AbstractC16161e abstractC16161e, Handler handler) throws Resources.NotFoundException {
        fgd.m26663g(abstractC16161e);
        if (context.isRestricted()) {
            abstractC16161e.m44053c(-4, handler);
        } else {
            m44042m(context, i, new TypedValue(), 0, abstractC16161e, handler, false, false);
        }
    }

    /* renamed from: j */
    public static TypedValue m44039j() {
        ThreadLocal threadLocal = f40388a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: k */
    public static ColorStateList m44040k(Resources resources, int i, Resources.Theme theme) {
        if (m44041l(resources, i)) {
            return null;
        }
        try {
            return ji3.m33846a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static boolean m44041l(Resources resources, int i) throws Resources.NotFoundException {
        TypedValue typedValueM44039j = m44039j();
        resources.getValue(i, typedValueM44039j, true);
        int i2 = typedValueM44039j.type;
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: m */
    public static Typeface m44042m(Context context, int i, TypedValue typedValue, int i2, AbstractC16161e abstractC16161e, Handler handler, boolean z, boolean z2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceM44043n = m44043n(context, resources, typedValue, i, i2, abstractC16161e, handler, z, z2);
        if (typefaceM44043n != null || abstractC16161e != null || z2) {
            return typefaceM44043n;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m44043n(Context context, Resources resources, TypedValue typedValue, int i, int i2, AbstractC16161e abstractC16161e, Handler handler, boolean z, boolean z2) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (abstractC16161e != null) {
                abstractC16161e.m44053c(-3, handler);
            }
            return null;
        }
        Typeface typefaceM27833f = fzh.m27833f(resources, i, string, typedValue.assetCookie, i2);
        if (typefaceM27833f != null) {
            if (abstractC16161e != null) {
                abstractC16161e.m44054d(typefaceM27833f, handler);
            }
            return typefaceM27833f;
        }
        if (z2) {
            return null;
        }
        try {
            if (string.toLowerCase().endsWith(".xml")) {
                xb7.InterfaceC18099b interfaceC18099bM55923b = xb7.m55923b(resources.getXml(i), resources);
                if (interfaceC18099bM55923b != null) {
                    return fzh.m27830c(context, interfaceC18099bM55923b, resources, i, string, typedValue.assetCookie, i2, abstractC16161e, handler, z);
                }
                if (abstractC16161e != null) {
                    abstractC16161e.m44053c(-3, handler);
                }
                return null;
            }
            Typeface typefaceM27831d = fzh.m27831d(context, resources, i, string, typedValue.assetCookie, i2);
            if (abstractC16161e != null) {
                if (typefaceM27831d != null) {
                    abstractC16161e.m44054d(typefaceM27831d, handler);
                } else {
                    abstractC16161e.m44053c(-3, handler);
                }
            }
            return typefaceM27831d;
        } catch (IOException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read xml resource ");
            sb.append(string);
            if (abstractC16161e != null) {
                abstractC16161e.m44053c(-3, handler);
            }
            return null;
        } catch (XmlPullParserException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to parse xml resource ");
            sb2.append(string);
            if (abstractC16161e != null) {
            }
            return null;
        }
    }
}
