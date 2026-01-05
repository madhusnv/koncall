package p001o;

/* loaded from: classes6.dex */
public abstract class qh2 extends ph2 {
    /* renamed from: f */
    public static final int m45485f(char c) {
        int iM43652b = ph2.m43652b(c, 10);
        if (iM43652b >= 0) {
            return iM43652b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    /* renamed from: g */
    public static final boolean m45486g(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: h */
    public static final boolean m45487h(char c) {
        return 55296 <= c && c < 57344;
    }

    /* renamed from: i */
    public static final String m45488i(char c) {
        return agj.m17036a(c);
    }
}
