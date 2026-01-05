package p001o;

import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class ph2 {
    /* renamed from: a */
    public static final int m43651a(int i) {
        boolean z = false;
        if (2 <= i && i < 37) {
            z = true;
        }
        if (z) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new kl8(2, 36));
    }

    /* renamed from: b */
    public static final int m43652b(char c, int i) {
        return Character.digit((int) c, i);
    }

    /* renamed from: c */
    public static final boolean m43653c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: d */
    public static final String m43654d(char c, Locale locale) {
        sq8.m48649h(locale, "locale");
        String strM43655e = m43655e(c, locale);
        if (strM43655e.length() <= 1) {
            String strValueOf = String.valueOf(c);
            sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            sq8.m48648g(upperCase, "toUpperCase(...)");
            return !sq8.m48644c(strM43655e, upperCase) ? strM43655e : String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return strM43655e;
        }
        char cCharAt = strM43655e.charAt(0);
        sq8.m48647f(strM43655e, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = strM43655e.substring(1);
        sq8.m48648g(strSubstring, "substring(...)");
        sq8.m48647f(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    /* renamed from: e */
    public static final String m43655e(char c, Locale locale) {
        sq8.m48649h(locale, "locale");
        String strValueOf = String.valueOf(c);
        sq8.m48647f(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
