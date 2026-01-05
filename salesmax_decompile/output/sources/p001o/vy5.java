package p001o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class vy5 {

    /* renamed from: a */
    public static final int[] f51029a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f51030b = new int[0];

    /* renamed from: c */
    public static final Rect f51031c = new Rect();

    /* renamed from: o.vy5$a */
    public static class C17694a {

        /* renamed from: a */
        public static final boolean f51032a;

        /* renamed from: b */
        public static final Method f51033b;

        /* renamed from: c */
        public static final Field f51034c;

        /* renamed from: d */
        public static final Field f51035d;

        /* renamed from: e */
        public static final Field f51036e;

        /* renamed from: f */
        public static final Field f51037f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            } catch (ClassNotFoundException unused) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused2) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
                field = null;
            }
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field3 = null;
                    }
                    try {
                        field4 = cls.getField("bottom");
                        z = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                        field4 = null;
                        z = false;
                        if (z) {
                        }
                    }
                } catch (ClassNotFoundException unused6) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchFieldException unused7) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                } catch (NoSuchMethodException unused8) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                    }
                }
            } catch (ClassNotFoundException unused9) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchFieldException unused10) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            } catch (NoSuchMethodException unused11) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z = false;
                if (z) {
                }
            }
            if (z) {
                f51033b = null;
                f51034c = null;
                f51035d = null;
                f51036e = null;
                f51037f = null;
                f51032a = false;
                return;
            }
            f51033b = method;
            f51034c = field;
            f51035d = field2;
            f51036e = field3;
            f51037f = field4;
            f51032a = true;
        }

        /* renamed from: a */
        public static Rect m53600a(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29 && f51032a) {
                try {
                    Object objInvoke = f51033b.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f51034c.getInt(objInvoke), f51035d.getInt(objInvoke), f51036e.getInt(objInvoke), f51037f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return vy5.f51031c;
        }
    }

    /* renamed from: o.vy5$b */
    public static class C17695b {
        /* renamed from: a */
        public static Insets m53601a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m53595a(Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    public static void m53596b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        m53597c(drawable);
    }

    /* renamed from: c */
    public static void m53597c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f51029a);
        } else {
            drawable.setState(f51030b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m53598d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C17694a.m53600a(fy5.m27743q(drawable));
        }
        Insets insetsM53601a = C17695b.m53601a(drawable);
        return new Rect(insetsM53601a.left, insetsM53601a.top, insetsM53601a.right, insetsM53601a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m53599e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
