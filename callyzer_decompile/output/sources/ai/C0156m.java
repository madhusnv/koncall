package ai;

import java.util.Arrays;
import pg.q6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ai.m */
/* loaded from: classes.dex */
public final class C0156m implements Comparable {

    /* renamed from: a */
    public final byte[] f491a;

    public C0156m(byte[] bArr) {
        this.f491a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0156m c0156m = (C0156m) obj;
        byte[] bArr = this.f491a;
        int length = bArr.length;
        byte[] bArr2 = c0156m.f491a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = c0156m.f491a[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0156m) {
            return Arrays.equals(this.f491a, ((C0156m) obj).f491a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f491a);
    }

    public final String toString() {
        return q6.m11831c(this.f491a);
    }
}
