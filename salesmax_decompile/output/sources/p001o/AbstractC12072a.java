package p001o;

import p001o.zq1;

/* renamed from: o.a */
/* loaded from: classes6.dex */
public abstract class AbstractC12072a {

    /* renamed from: a */
    public static final byte[] f13994a;

    /* renamed from: b */
    public static final byte[] f13995b;

    static {
        zq1.C18692a c18692a = zq1.f57497d;
        f13994a = c18692a.m59707c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m59700j();
        f13995b = c18692a.m59707c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m59700j();
    }

    /* renamed from: a */
    public static final String m16284a(byte[] bArr, byte[] bArr2) {
        sq8.m48649h(bArr, "<this>");
        sq8.m48649h(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i13] = bArr2[(b6 & 15) << 2];
            bArr3[i13 + 1] = 61;
        }
        return xfj.m56228c(bArr3);
    }

    /* renamed from: b */
    public static /* synthetic */ String m16285b(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f13994a;
        }
        return m16284a(bArr, bArr2);
    }
}
