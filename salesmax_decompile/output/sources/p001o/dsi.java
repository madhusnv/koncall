package p001o;

/* loaded from: classes2.dex */
public final class dsi {

    /* renamed from: d */
    public static final long[] f20482d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f20483a = new byte[8];

    /* renamed from: b */
    public int f20484b;

    /* renamed from: c */
    public int f20485c;

    /* renamed from: a */
    public static long m23770a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f20482d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m23771c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f20482d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & i) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int m23772b() {
        return this.f20485c;
    }

    /* renamed from: d */
    public long m23773d(uq6 uq6Var, boolean z, boolean z2, int i) {
        if (this.f20484b == 0) {
            if (!uq6Var.mo40492f(this.f20483a, 0, 1, z)) {
                return -1L;
            }
            int iM23771c = m23771c(this.f20483a[0] & 255);
            this.f20485c = iM23771c;
            if (iM23771c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f20484b = 1;
        }
        int i2 = this.f20485c;
        if (i2 > i) {
            this.f20484b = 0;
            return -2L;
        }
        if (i2 != 1) {
            uq6Var.readFully(this.f20483a, 1, i2 - 1);
        }
        this.f20484b = 0;
        return m23770a(this.f20483a, this.f20485c, z2);
    }

    /* renamed from: e */
    public void m23774e() {
        this.f20484b = 0;
        this.f20485c = 0;
    }
}
