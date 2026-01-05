package p001o;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class pha {

    /* renamed from: b */
    public static final pha f40102b = m43681a(new Locale[0]);

    /* renamed from: a */
    public final rha f40103a;

    /* renamed from: o.pha$a */
    public static class C16114a {

        /* renamed from: a */
        public static final Locale[] f40104a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        public static Locale m43690a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m43691b(Locale locale) {
            for (Locale locale2 : f40104a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m43692c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m43691b(locale) || m43691b(locale2)) {
                return false;
            }
            String strM24373a = e68.m24373a(locale);
            if (!strM24373a.isEmpty()) {
                return strM24373a.equals(e68.m24373a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* renamed from: o.pha$b */
    public static class C16115b {
        /* renamed from: a */
        public static LocaleList m43693a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m43694b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m43695c() {
            return LocaleList.getDefault();
        }
    }

    public pha(rha rhaVar) {
        this.f40103a = rhaVar;
    }

    /* renamed from: a */
    public static pha m43681a(Locale... localeArr) {
        return m43684i(C16115b.m43693a(localeArr));
    }

    /* renamed from: b */
    public static pha m43682b(String str) {
        if (str == null || str.isEmpty()) {
            return m43683d();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C16114a.m43690a(strArrSplit[i]);
        }
        return m43681a(localeArr);
    }

    /* renamed from: d */
    public static pha m43683d() {
        return f40102b;
    }

    /* renamed from: i */
    public static pha m43684i(LocaleList localeList) {
        return new pha(new sha(localeList));
    }

    /* renamed from: c */
    public Locale m43685c(int i) {
        return this.f40103a.get(i);
    }

    /* renamed from: e */
    public boolean m43686e() {
        return this.f40103a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof pha) && this.f40103a.equals(((pha) obj).f40103a);
    }

    /* renamed from: f */
    public int m43687f() {
        return this.f40103a.size();
    }

    /* renamed from: g */
    public String m43688g() {
        return this.f40103a.mo46775a();
    }

    /* renamed from: h */
    public Object m43689h() {
        return this.f40103a.mo46776b();
    }

    public int hashCode() {
        return this.f40103a.hashCode();
    }

    public String toString() {
        return this.f40103a.toString();
    }
}
