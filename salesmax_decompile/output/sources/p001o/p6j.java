package p001o;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class p6j {

    /* renamed from: a */
    public static final Pattern f39431a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m43013a(zwc zwcVar) {
        String strM60038s = zwcVar.m60038s();
        return strM60038s != null && strM60038s.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m43014b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m43015c(String str) {
        String[] strArrJ1 = sqi.j1(str, "\\.");
        long j = 0;
        for (String str2 : sqi.i1(strArrJ1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrJ1.length == 2) {
            j2 += Long.parseLong(strArrJ1[1]);
        }
        return j2 * 1000;
    }

    /* renamed from: d */
    public static void m43016d(zwc zwcVar) throws byc {
        int iM60025f = zwcVar.m60025f();
        if (m43013a(zwcVar)) {
            return;
        }
        zwcVar.m60017U(iM60025f);
        throw byc.m19921a("Expected WEBVTT. Got " + zwcVar.m60038s(), null);
    }
}
