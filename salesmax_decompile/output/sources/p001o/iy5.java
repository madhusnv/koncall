package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public abstract class iy5 {

    /* renamed from: a */
    public static volatile boolean f29364a = true;

    /* renamed from: a */
    public static Drawable m32904a(Context context, int i, Resources.Theme theme) {
        return m32906c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m32905b(Context context, Context context2, int i) {
        return m32906c(context, context2, i, null);
    }

    /* renamed from: c */
    public static Drawable m32906c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f29364a) {
                return m32908e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return c64.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f29364a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m32907d(context2, i, theme);
    }

    /* renamed from: d */
    public static Drawable m32907d(Context context, int i, Resources.Theme theme) {
        return ppe.m44034e(context.getResources(), i, theme);
    }

    /* renamed from: e */
    public static Drawable m32908e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new i64(context, theme);
        }
        return lk0.m37353b(context, i);
    }
}
