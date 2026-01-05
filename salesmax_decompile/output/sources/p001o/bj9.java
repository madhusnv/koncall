package p001o;

import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class bj9 {
    /* renamed from: b */
    public static final String m19247b(char c) {
        String string = Integer.toString(c, ph2.m43651a(16));
        sq8.m48648g(string, "toString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        sq8.m48648g(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
