package p001o;

import java.util.Locale;
import p001o.vre;

/* loaded from: classes3.dex */
public abstract class l9d {
    /* renamed from: c */
    public static final odc m36813c() {
        Object objM53351b;
        String property = System.getProperty("os.name");
        sq8.m48648g(property, "getProperty(...)");
        String strM36815e = m36815e(property);
        ofc ofcVar = m36814d() ? ofc.Android : f9g.m26306P(strM36815e, "windows", false, 2, null) ? ofc.Windows : f9g.m26306P(strM36815e, "linux", false, 2, null) ? ofc.Linux : f9g.m26306P(strM36815e, "macosx", false, 2, null) ? ofc.MacOs : ofc.Unknown;
        try {
            vre.C17665a c17665a = vre.f50797b;
            objM53351b = vre.m53351b(System.getProperty("os.version"));
        } catch (Throwable th) {
            vre.C17665a c17665a2 = vre.f50797b;
            objM53351b = vre.m53351b(wre.m54933a(th));
        }
        return new odc(ofcVar, (String) (vre.m53356g(objM53351b) ? null : objM53351b));
    }

    /* renamed from: d */
    public static final boolean m36814d() throws ClassNotFoundException {
        try {
            Class.forName("android.os.Build");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static final String m36815e(String str) {
        Locale locale = Locale.US;
        sq8.m48648g(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return new mge("[^a-z0-9+]").m38996h(lowerCase, "");
    }
}
