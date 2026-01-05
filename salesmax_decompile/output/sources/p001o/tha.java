package p001o;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes2.dex */
public abstract class tha {

    /* renamed from: o.tha$a */
    public static class C17112a {
        /* renamed from: a */
        public static LocaleList m49887a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        public static LocaleList m49888b(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    /* renamed from: a */
    public static pha m49885a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return pha.m43682b(nm0.m40780b(context));
        }
        Object objM49886b = m49886b(context);
        return objM49886b != null ? pha.m43684i(C17112a.m49887a(objM49886b)) : pha.m43683d();
    }

    /* renamed from: b */
    public static Object m49886b(Context context) {
        return context.getSystemService("locale");
    }
}
