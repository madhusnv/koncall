package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public abstract class kp0 {
    /* renamed from: a */
    public static boolean m35991a(CharSequence charSequence, CharSequence charSequence2) {
        int iM35992b;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iM35992b = m35992b(cCharAt)) >= 26 || iM35992b != m35992b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m35992b(char c) {
        return (char) ((c | TokenParser.SP) - 97);
    }

    /* renamed from: c */
    public static boolean m35993c(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: d */
    public static boolean m35994d(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: e */
    public static String m35995e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m35994d(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m35994d(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m35996f(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m35993c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m35993c(c)) {
                        charArray[i] = (char) (c ^ TokenParser.SP);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
