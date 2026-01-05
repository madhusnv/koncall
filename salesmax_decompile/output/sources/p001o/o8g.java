package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class o8g {

    /* renamed from: a */
    public static final String[] f37941a;

    /* renamed from: b */
    public static final byte[] f37942b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m41775e(i >> 12) + m41775e(i >> 8) + m41775e(i >> 4) + m41775e(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f37941a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f37942b = bArr;
    }

    /* renamed from: a */
    public static final byte[] m41771a() {
        return f37942b;
    }

    /* renamed from: b */
    public static final String[] m41772b() {
        return f37941a;
    }

    /* renamed from: c */
    public static final void m41773c(StringBuilder sb, String str) {
        sq8.m48649h(sb, "<this>");
        sq8.m48649h(str, "value");
        sb.append(TokenParser.DQUOTE);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = f37941a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append(TokenParser.DQUOTE);
    }

    /* renamed from: d */
    public static final Boolean m41774d(String str) {
        sq8.m48649h(str, "<this>");
        if (e9g.m24606x(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (e9g.m24606x(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: e */
    public static final char m41775e(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
