package p001o;

import java.util.Set;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public abstract class p99 {

    /* renamed from: a */
    public static final Set f39672a = kh3.V0(new kh2('0', '9'));

    /* renamed from: b */
    public static final Set f39673b = nif.m40668i('e', 'E');

    /* renamed from: c */
    public static final Set f39674c = nif.m40668i('-', '+');

    /* renamed from: f */
    public static final char m43248f(String str) {
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= str.length()) {
                z = true;
                break;
            }
            char cCharAt = str.charAt(i);
            if (!('0' <= cCharAt && cCharAt < ':')) {
                if (!('a' <= cCharAt && cCharAt < 'g')) {
                    if (!('A' <= cCharAt && cCharAt < 'G')) {
                        z2 = false;
                    }
                }
            }
            if (!z2) {
                break;
            }
            i++;
        }
        if (z) {
            return (char) Integer.parseInt(str, ph2.m43651a(16));
        }
        throw new IllegalStateException(("Invalid unicode escape: `\\u" + str + '`').toString());
    }

    /* renamed from: g */
    public static final boolean m43249g(char c) {
        return c >= 0 && c < ' ';
    }

    /* renamed from: h */
    public static final int m43250h(String str, int i, StringBuilder sb) {
        int i2 = i + 4;
        if (!(i2 <= str.length())) {
            throw new IllegalStateException("Unexpected EOF reading escaped high surrogate".toString());
        }
        String strSubstring = str.substring(i, i2);
        sq8.m48648g(strSubstring, "substring(...)");
        char cM43248f = m43248f(strSubstring);
        if (!Character.isHighSurrogate(cM43248f)) {
            sb.append(cM43248f);
            return 4;
        }
        String strSubstring2 = str.substring(i2, i2 + 6);
        sq8.m48648g(strSubstring2, "substring(...)");
        if (!e9g.m24597K(strSubstring2, "\\u", false, 2, null)) {
            throw new IllegalStateException(("Expected surrogate pair, found `" + strSubstring2 + '`').toString());
        }
        String strSubstring3 = strSubstring2.substring(2);
        sq8.m48648g(strSubstring3, "substring(...)");
        char cM43248f2 = m43248f(strSubstring3);
        if (Character.isLowSurrogate(cM43248f2)) {
            b9g.m18466i(sb, Character.valueOf(cM43248f), Character.valueOf(cM43248f2));
            return 10;
        }
        throw new IllegalStateException(("Invalid surrogate pair: (" + ((int) cM43248f) + ", " + ((int) cM43248f2) + ')').toString());
    }

    /* renamed from: i */
    public static final String m43251i(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                int iM43250h = i2 + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '\"') {
                    sb.append(TokenParser.DQUOTE);
                } else if (cCharAt2 == '/') {
                    sb.append('/');
                } else if (cCharAt2 == '\\') {
                    sb.append(TokenParser.ESCAPE);
                } else if (cCharAt2 == 'b') {
                    sb.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb.append('\f');
                } else if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append(TokenParser.CR);
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else {
                    if (cCharAt2 != 'u') {
                        throw new an5("Invalid escape character: `" + cCharAt2 + '`');
                    }
                    iM43250h += m43250h(str, iM43250h, sb);
                    y3i y3iVar = y3i.f54824a;
                }
                i = iM43250h;
            } else {
                sb.append(cCharAt);
                i++;
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }
}
