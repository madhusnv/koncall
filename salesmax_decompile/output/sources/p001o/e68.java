package p001o;

import android.icu.util.ULocale;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class e68 {

    /* renamed from: o.e68$a */
    public static class C13113a {
        /* renamed from: a */
        public static ULocale m24374a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        public static ULocale m24375b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        public static String m24376c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    /* renamed from: a */
    public static String m24373a(Locale locale) {
        return C13113a.m24376c(C13113a.m24374a(C13113a.m24375b(locale)));
    }
}
