package p001o;

/* loaded from: classes3.dex */
public abstract class gy7 {

    /* renamed from: a */
    public static final char[] f25940a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        sq8.m48648g(charArray, "toCharArray(...)");
        f25940a = charArray;
    }

    /* renamed from: a */
    public static final String m29641a(byte[] bArr) {
        sq8.m48649h(bArr, "bytes");
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f25940a;
            sb.append(cArr[i >> 4]);
            sb.append(cArr[i & 15]);
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public static final String m29642b(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return m29641a(bArr);
    }
}
