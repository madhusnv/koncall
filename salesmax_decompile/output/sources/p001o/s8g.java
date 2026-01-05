package p001o;

import java.io.UnsupportedEncodingException;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;

/* loaded from: classes6.dex */
public abstract class s8g {

    /* renamed from: a */
    public static final String f44981a = System.getProperty("line.separator", "\n");

    /* renamed from: b */
    public static final String f44982b;

    /* renamed from: c */
    public static char[] f44983c;

    static {
        String str = "ISO-8859-1";
        String property = System.getProperty("ISO_8859_1");
        if (property == null) {
            try {
                new String(new byte[]{20}, "ISO-8859-1");
            } catch (UnsupportedEncodingException unused) {
                str = "ISO8859_1";
            }
        } else {
            str = property;
        }
        f44982b = str;
        f44983c = new char[]{0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', TokenParser.CR, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, TokenParser.SP, '!', TokenParser.DQUOTE, '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '[', TokenParser.ESCAPE, ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127};
    }

    /* renamed from: a */
    public static void m47994a(StringBuffer stringBuffer, int i) {
        if (i < 100) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }
    }

    /* renamed from: b */
    public static String m47995b(String str) {
        int i;
        char[] charArray;
        char c;
        int length = str.length();
        while (true) {
            i = length - 1;
            if (length <= 0) {
                charArray = null;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127 && cCharAt != (c = f44983c[cCharAt])) {
                charArray = str.toCharArray();
                charArray[i] = c;
                break;
            }
            length = i;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            char c2 = charArray[i2];
            if (c2 <= 127) {
                charArray[i2] = f44983c[c2];
            }
            i = i2;
        }
        return charArray == null ? str : new String(charArray);
    }

    /* renamed from: c */
    public static boolean m47996c(String str) {
        return str == HTTP.UTF_8 || HTTP.UTF_8.equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str);
    }

    /* renamed from: d */
    public static String m47997d(String str, String str2, String str3) {
        String string;
        int length = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + str3.length());
        synchronized (stringBuffer) {
            do {
                stringBuffer.append(str.substring(length, iIndexOf));
                stringBuffer.append(str3);
                length = str2.length() + iIndexOf;
                iIndexOf = str.indexOf(str2, length);
            } while (iIndexOf != -1);
            if (length < str.length()) {
                stringBuffer.append(str.substring(length, str.length()));
            }
            string = stringBuffer.toString();
        }
        return string;
    }

    /* renamed from: e */
    public static String m47998e(byte[] bArr, int i, int i2, String str) {
        if (str == null || m47996c(str)) {
            return m47999f(bArr, i, i2);
        }
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m47999f(byte[] bArr, int i, int i2) {
        try {
            if (i2 >= 32) {
                return new String(bArr, i, i2, HTTP.UTF_8);
            }
            oqi oqiVar = new oqi(i2);
            oqiVar.m42548b(bArr, i, i2);
            return oqiVar.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
