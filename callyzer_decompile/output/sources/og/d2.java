package og;

import com.sun.mail.util.AbstractC1452a;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d2 {
    /* renamed from: a */
    public static final long m10598a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    /* renamed from: b */
    public static void m10599b(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "radix ", " was not in valid range ");
            sbM4567n.append(new C4266h(2, 36, 1));
            throw new IllegalArgumentException(sbM4567n.toString());
        }
    }

    /* renamed from: c */
    public static int m10600c(char c2) {
        m10599b(16);
        int iDigit = Character.digit((int) c2, 16);
        Integer numValueOf = Integer.valueOf(iDigit);
        if (iDigit < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=16");
    }

    /* renamed from: d */
    public static final boolean m10601d(char c2, char c10, boolean z6) {
        if (c2 == c10) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: e */
    public static final long m10602e(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* renamed from: f */
    public static boolean m10603f(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    /* renamed from: g */
    public static String m10604g(char c2, Locale locale) {
        String strValueOf = String.valueOf(c2);
        AbstractC4154l.m8921d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            String strValueOf2 = String.valueOf(c2);
            AbstractC4154l.m8921d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
            AbstractC4154l.m8922e(upperCase2, "toUpperCase(...)");
            if (upperCase.equals(upperCase2)) {
                return String.valueOf(Character.toTitleCase(c2));
            }
        } else if (c2 != 329) {
            char cCharAt = upperCase.charAt(0);
            String strSubstring = upperCase.substring(1);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return upperCase;
    }
}
