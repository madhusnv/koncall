package ly;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.d */
/* loaded from: classes3.dex */
public final class C4580d {

    /* renamed from: a */
    public static final char[] f22708a = new char[117];

    /* renamed from: b */
    public static final byte[] f22709b = new byte[126];

    static {
        for (int i10 = 0; i10 < 32; i10++) {
        }
        m9419a(8, 'b');
        m9419a(9, 't');
        m9419a(10, 'n');
        m9419a(12, 'f');
        m9419a(13, 'r');
        m9419a(47, '/');
        m9419a(34, '\"');
        m9419a(92, '\\');
        byte[] bArr = f22709b;
        for (int i11 = 0; i11 < 33; i11++) {
            bArr[i11] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* renamed from: a */
    public static void m9419a(int i10, char c2) {
        if (c2 != 'u') {
            f22708a[c2] = (char) i10;
        }
    }
}
