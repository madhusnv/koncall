package p001o;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* loaded from: classes2.dex */
public class wr8 {

    /* renamed from: a */
    public final LargeJpegImageQuirk f52593a = (LargeJpegImageQuirk) xq5.m56605b(LargeJpegImageQuirk.class);

    /* renamed from: a */
    public static int m54930a(byte[] bArr) {
        byte b;
        int i = 2;
        while (i + 4 <= bArr.length && (b = bArr[i]) == -1) {
            int i2 = i + 2;
            int i3 = ((bArr[i2] & 255) << 8) | (bArr[i + 3] & 255);
            if (b == -1 && bArr[i + 1] == -38) {
                while (true) {
                    int i4 = i2 + 2;
                    if (i4 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i2] == -1 && bArr[i2 + 1] == -39) {
                        return i4;
                    }
                    i2++;
                }
            } else {
                i += i3 + 2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m54931b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f52593a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.m4720g(bArr)) {
            return bArr.length;
        }
        int iM54930a = m54930a(bArr);
        return iM54930a != -1 ? iM54930a : bArr.length;
    }
}
