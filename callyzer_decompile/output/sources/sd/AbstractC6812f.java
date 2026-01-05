package sd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sd.f */
/* loaded from: classes.dex */
public abstract class AbstractC6812f {

    /* renamed from: a */
    public static final char[] f32356a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        AbstractC4154l.m8922e(charArray, "toCharArray(...)");
        f32356a = charArray;
    }

    /* renamed from: a */
    public static final String m12986a(byte[] bArr) {
        AbstractC4154l.m8923f(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            char[] cArr = f32356a;
            sb2.append(cArr[(b10 & 255) >> 4]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
