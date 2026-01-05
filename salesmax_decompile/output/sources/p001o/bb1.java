package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import p001o.fe1;

/* loaded from: classes6.dex */
public class bb1 extends fe1 {

    /* renamed from: l */
    public static final byte[] f15835l = {13, 10};

    /* renamed from: m */
    public static final byte[] f15836m = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: n */
    public static final byte[] f15837n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: o */
    public static final byte[] f15838o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: g */
    public final byte[] f15839g;

    /* renamed from: h */
    public final byte[] f15840h;

    /* renamed from: i */
    public final byte[] f15841i;

    /* renamed from: j */
    public final int f15842j;

    /* renamed from: k */
    public final int f15843k;

    public bb1() {
        this(0);
    }

    /* renamed from: n */
    public static byte[] m18513n(byte[] bArr) {
        return new bb1().m26475d(bArr);
    }

    /* renamed from: o */
    public static byte[] m18514o(byte[] bArr) {
        return m18515p(bArr, false);
    }

    /* renamed from: p */
    public static byte[] m18515p(byte[] bArr, boolean z) {
        return m18516q(bArr, z, false);
    }

    /* renamed from: q */
    public static byte[] m18516q(byte[] bArr, boolean z, boolean z2) {
        return m18517r(bArr, z, z2, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: r */
    public static byte[] m18517r(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        bb1 bb1Var = z ? new bb1(z2) : new bb1(0, f15835l, z2);
        long jM26480j = bb1Var.m26480j(bArr);
        if (jM26480j <= i) {
            return bb1Var.m26476f(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jM26480j + ") than the specified maximum size of " + i);
    }

    @Override // p001o.fe1
    /* renamed from: c */
    public void mo18518c(byte[] bArr, int i, int i2, fe1.C13406a c13406a) {
        byte b;
        if (c13406a.f23174f) {
            return;
        }
        if (i2 < 0) {
            c13406a.f23174f = true;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            byte[] bArrM26478h = m26478h(this.f15842j, c13406a);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.f23164b) {
                c13406a.f23174f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = f15838o;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (c13406a.f23176h + 1) % 4;
                    c13406a.f23176h = i5;
                    int i6 = (c13406a.f23169a << 6) + b;
                    c13406a.f23169a = i6;
                    if (i5 == 0) {
                        int i7 = c13406a.f23172d;
                        int i8 = i7 + 1;
                        bArrM26478h[i7] = (byte) ((i6 >> 16) & Constants.MAX_HOST_LENGTH);
                        int i9 = i8 + 1;
                        bArrM26478h[i8] = (byte) ((i6 >> 8) & Constants.MAX_HOST_LENGTH);
                        c13406a.f23172d = i9 + 1;
                        bArrM26478h[i9] = (byte) (i6 & Constants.MAX_HOST_LENGTH);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!c13406a.f23174f || c13406a.f23176h == 0) {
            return;
        }
        byte[] bArrM26478h2 = m26478h(this.f15842j, c13406a);
        int i10 = c13406a.f23176h;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = c13406a.f23169a >> 4;
                c13406a.f23169a = i11;
                int i12 = c13406a.f23172d;
                c13406a.f23172d = i12 + 1;
                bArrM26478h2[i12] = (byte) (i11 & Constants.MAX_HOST_LENGTH);
                return;
            }
            if (i10 != 3) {
                throw new IllegalStateException("Impossible modulus " + c13406a.f23176h);
            }
            int i13 = c13406a.f23169a >> 2;
            c13406a.f23169a = i13;
            int i14 = c13406a.f23172d;
            int i15 = i14 + 1;
            bArrM26478h2[i14] = (byte) ((i13 >> 8) & Constants.MAX_HOST_LENGTH);
            c13406a.f23172d = i15 + 1;
            bArrM26478h2[i15] = (byte) (i13 & Constants.MAX_HOST_LENGTH);
        }
    }

    @Override // p001o.fe1
    /* renamed from: e */
    public void mo18519e(byte[] bArr, int i, int i2, fe1.C13406a c13406a) {
        if (c13406a.f23174f) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrM26478h = m26478h(this.f15843k, c13406a);
                int i4 = (c13406a.f23176h + 1) % 3;
                c13406a.f23176h = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (c13406a.f23169a << 8) + i6;
                c13406a.f23169a = i7;
                if (i4 == 0) {
                    int i8 = c13406a.f23172d;
                    int i9 = i8 + 1;
                    byte[] bArr2 = this.f15839g;
                    bArrM26478h[i8] = bArr2[(i7 >> 18) & 63];
                    int i10 = i9 + 1;
                    bArrM26478h[i9] = bArr2[(i7 >> 12) & 63];
                    int i11 = i10 + 1;
                    bArrM26478h[i10] = bArr2[(i7 >> 6) & 63];
                    int i12 = i11 + 1;
                    c13406a.f23172d = i12;
                    bArrM26478h[i11] = bArr2[i7 & 63];
                    int i13 = c13406a.f23175g + 4;
                    c13406a.f23175g = i13;
                    int i14 = this.f23167e;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr3 = this.f15841i;
                        System.arraycopy(bArr3, 0, bArrM26478h, i12, bArr3.length);
                        c13406a.f23172d += this.f15841i.length;
                        c13406a.f23175g = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        c13406a.f23174f = true;
        if (c13406a.f23176h == 0 && this.f23167e == 0) {
            return;
        }
        byte[] bArrM26478h2 = m26478h(this.f15843k, c13406a);
        int i15 = c13406a.f23172d;
        int i16 = c13406a.f23176h;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = i15 + 1;
                byte[] bArr4 = this.f15839g;
                int i18 = c13406a.f23169a;
                bArrM26478h2[i15] = bArr4[(i18 >> 2) & 63];
                int i19 = i17 + 1;
                c13406a.f23172d = i19;
                bArrM26478h2[i17] = bArr4[(i18 << 4) & 63];
                if (bArr4 == f15836m) {
                    int i20 = i19 + 1;
                    byte b = this.f23164b;
                    bArrM26478h2[i19] = b;
                    c13406a.f23172d = i20 + 1;
                    bArrM26478h2[i20] = b;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("Impossible modulus " + c13406a.f23176h);
                }
                int i21 = i15 + 1;
                byte[] bArr5 = this.f15839g;
                int i22 = c13406a.f23169a;
                bArrM26478h2[i15] = bArr5[(i22 >> 10) & 63];
                int i23 = i21 + 1;
                bArrM26478h2[i21] = bArr5[(i22 >> 4) & 63];
                int i24 = i23 + 1;
                c13406a.f23172d = i24;
                bArrM26478h2[i23] = bArr5[(i22 << 2) & 63];
                if (bArr5 == f15836m) {
                    c13406a.f23172d = i24 + 1;
                    bArrM26478h2[i24] = this.f23164b;
                }
            }
        }
        int i25 = c13406a.f23175g;
        int i26 = c13406a.f23172d;
        int i27 = i25 + (i26 - i15);
        c13406a.f23175g = i27;
        if (this.f23167e <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr6 = this.f15841i;
        System.arraycopy(bArr6, 0, bArrM26478h2, i26, bArr6.length);
        c13406a.f23172d += this.f15841i.length;
    }

    @Override // p001o.fe1
    /* renamed from: k */
    public boolean mo18520k(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f15840h;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public bb1(boolean z) {
        this(76, f15835l, z);
    }

    public bb1(int i) {
        this(i, f15835l);
    }

    public bb1(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public bb1(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f15840h = f15838o;
        if (bArr != null) {
            if (m26474b(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + t8g.m49565b(bArr) + "]");
            }
            if (i > 0) {
                this.f15843k = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f15841i = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f15843k = 4;
                this.f15841i = null;
            }
        } else {
            this.f15843k = 4;
            this.f15841i = null;
        }
        this.f15842j = this.f15843k - 1;
        this.f15839g = z ? f15837n : f15836m;
    }
}
