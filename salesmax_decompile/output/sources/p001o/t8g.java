package p001o;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class t8g {
    /* renamed from: a */
    public static String m49564a(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    /* renamed from: b */
    public static String m49565b(byte[] bArr) {
        return m49564a(bArr, th2.f47122f);
    }
}
