package p001o;

import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class agj {
    /* renamed from: a */
    public static final String m17036a(char c) {
        String strValueOf = String.valueOf(c);
        sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        sq8.m48647f(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        sq8.m48647f(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
