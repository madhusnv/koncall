package p001o;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class irb {

    /* renamed from: a */
    public static final byte[] f29113a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f29114b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f29115c = new Object();

    /* renamed from: d */
    public static int[] f29116d = new int[10];

    /* renamed from: o.irb$a */
    public static final class C14354a {

        /* renamed from: a */
        public final int f29117a;

        /* renamed from: b */
        public final boolean f29118b;

        /* renamed from: c */
        public final int f29119c;

        /* renamed from: d */
        public final int f29120d;

        /* renamed from: e */
        public final int f29121e;

        /* renamed from: f */
        public final int f29122f;

        /* renamed from: g */
        public final int f29123g;

        /* renamed from: h */
        public final int[] f29124h;

        /* renamed from: i */
        public final int f29125i;

        /* renamed from: j */
        public final int f29126j;

        /* renamed from: k */
        public final int f29127k;

        /* renamed from: l */
        public final int f29128l;

        /* renamed from: m */
        public final float f29129m;

        /* renamed from: n */
        public final int f29130n;

        /* renamed from: o */
        public final int f29131o;

        /* renamed from: p */
        public final int f29132p;

        /* renamed from: q */
        public final int f29133q;

        public C14354a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13, int i14) {
            this.f29117a = i;
            this.f29118b = z;
            this.f29119c = i2;
            this.f29120d = i3;
            this.f29121e = i4;
            this.f29122f = i5;
            this.f29123g = i6;
            this.f29124h = iArr;
            this.f29125i = i7;
            this.f29126j = i8;
            this.f29127k = i9;
            this.f29128l = i10;
            this.f29129m = f;
            this.f29130n = i11;
            this.f29131o = i12;
            this.f29132p = i13;
            this.f29133q = i14;
        }
    }

    /* renamed from: o.irb$b */
    public static final class C14355b {

        /* renamed from: a */
        public final int f29134a;

        /* renamed from: b */
        public final int f29135b;

        /* renamed from: c */
        public final boolean f29136c;

        public C14355b(int i, int i2, boolean z) {
            this.f29134a = i;
            this.f29135b = i2;
            this.f29136c = z;
        }
    }

    /* renamed from: o.irb$c */
    public static final class C14356c {

        /* renamed from: a */
        public final int f29137a;

        /* renamed from: b */
        public final int f29138b;

        /* renamed from: c */
        public final int f29139c;

        /* renamed from: d */
        public final int f29140d;

        /* renamed from: e */
        public final int f29141e;

        /* renamed from: f */
        public final int f29142f;

        /* renamed from: g */
        public final int f29143g;

        /* renamed from: h */
        public final float f29144h;

        /* renamed from: i */
        public final int f29145i;

        /* renamed from: j */
        public final int f29146j;

        /* renamed from: k */
        public final boolean f29147k;

        /* renamed from: l */
        public final boolean f29148l;

        /* renamed from: m */
        public final int f29149m;

        /* renamed from: n */
        public final int f29150n;

        /* renamed from: o */
        public final int f29151o;

        /* renamed from: p */
        public final boolean f29152p;

        /* renamed from: q */
        public final int f29153q;

        /* renamed from: r */
        public final int f29154r;

        /* renamed from: s */
        public final int f29155s;

        /* renamed from: t */
        public final int f29156t;

        public C14356c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.f29137a = i;
            this.f29138b = i2;
            this.f29139c = i3;
            this.f29140d = i4;
            this.f29141e = i5;
            this.f29142f = i6;
            this.f29143g = i7;
            this.f29144h = f;
            this.f29145i = i8;
            this.f29146j = i9;
            this.f29147k = z;
            this.f29148l = z2;
            this.f29149m = i10;
            this.f29150n = i11;
            this.f29151o = i12;
            this.f29152p = z3;
            this.f29153q = i13;
            this.f29154r = i14;
            this.f29155s = i15;
            this.f29156t = i16;
        }
    }

    /* renamed from: a */
    public static void m32612a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m32613b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* renamed from: c */
    public static int m32614c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        op0.m42517g(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m32612a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m32612a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m32612a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m32612a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* renamed from: d */
    public static int m32615d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: e */
    public static int m32616e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m32617f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m32618g(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
    }

    /* renamed from: h */
    public static C14354a m32619h(byte[] bArr, int i, int i2) {
        return m32620i(bArr, i + 2, i2);
    }

    /* renamed from: i */
    public static C14354a m32620i(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iM43662k;
        int i6;
        axc axcVar = new axc(bArr, i, i2);
        axcVar.m17947l(4);
        int iM17940e = axcVar.m17940e(3);
        axcVar.m17946k();
        int iM17940e2 = axcVar.m17940e(2);
        boolean zM17939d = axcVar.m17939d();
        int iM17940e3 = axcVar.m17940e(5);
        int i7 = 0;
        for (int i8 = 0; i8 < 32; i8++) {
            if (axcVar.m17939d()) {
                i7 |= 1 << i8;
            }
        }
        int[] iArr = new int[6];
        for (int i9 = 0; i9 < 6; i9++) {
            iArr[i9] = axcVar.m17940e(8);
        }
        int iM17940e4 = axcVar.m17940e(8);
        int i10 = 0;
        for (int i11 = 0; i11 < iM17940e; i11++) {
            if (axcVar.m17939d()) {
                i10 += 89;
            }
            if (axcVar.m17939d()) {
                i10 += 8;
            }
        }
        axcVar.m17947l(i10);
        if (iM17940e > 0) {
            axcVar.m17947l((8 - iM17940e) * 2);
        }
        int iM17943h = axcVar.m17943h();
        int iM17943h2 = axcVar.m17943h();
        if (iM17943h2 == 3) {
            axcVar.m17946k();
        }
        int iM17943h3 = axcVar.m17943h();
        int iM17943h4 = axcVar.m17943h();
        if (axcVar.m17939d()) {
            int iM17943h5 = axcVar.m17943h();
            int iM17943h6 = axcVar.m17943h();
            int iM17943h7 = axcVar.m17943h();
            int iM17943h8 = axcVar.m17943h();
            iM17943h3 -= ((iM17943h2 == 1 || iM17943h2 == 2) ? 2 : 1) * (iM17943h5 + iM17943h6);
            iM17943h4 -= (iM17943h2 == 1 ? 2 : 1) * (iM17943h7 + iM17943h8);
        }
        int i12 = iM17943h4;
        int i13 = iM17943h3;
        int i14 = i12;
        int iM17943h9 = axcVar.m17943h();
        int iM17943h10 = axcVar.m17943h();
        int iM17943h11 = axcVar.m17943h();
        int iM43661j = -1;
        int iMax = -1;
        for (int i15 = axcVar.m17939d() ? 0 : iM17940e; i15 <= iM17940e; i15++) {
            axcVar.m17943h();
            iMax = Math.max(axcVar.m17943h(), iMax);
            axcVar.m17943h();
        }
        axcVar.m17943h();
        axcVar.m17943h();
        axcVar.m17943h();
        axcVar.m17943h();
        axcVar.m17943h();
        axcVar.m17943h();
        if (axcVar.m17939d() && axcVar.m17939d()) {
            m32625n(axcVar);
        }
        axcVar.m17947l(2);
        if (axcVar.m17939d()) {
            axcVar.m17947l(8);
            axcVar.m17943h();
            axcVar.m17943h();
            axcVar.m17946k();
        }
        m32628q(axcVar);
        if (axcVar.m17939d()) {
            int iM17943h12 = axcVar.m17943h();
            for (int i16 = 0; i16 < iM17943h12; i16++) {
                axcVar.m17947l(iM17943h11 + 4 + 1);
            }
        }
        axcVar.m17947l(2);
        float f = 1.0f;
        if (axcVar.m17939d()) {
            if (axcVar.m17939d()) {
                int iM17940e5 = axcVar.m17940e(8);
                if (iM17940e5 == 255) {
                    int iM17940e6 = axcVar.m17940e(16);
                    int iM17940e7 = axcVar.m17940e(16);
                    if (iM17940e6 != 0 && iM17940e7 != 0) {
                        f = iM17940e6 / iM17940e7;
                    }
                } else {
                    float[] fArr = f29114b;
                    if (iM17940e5 < fArr.length) {
                        f = fArr[iM17940e5];
                    } else {
                        ria.m46824h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM17940e5);
                    }
                }
            }
            if (axcVar.m17939d()) {
                axcVar.m17946k();
            }
            if (axcVar.m17939d()) {
                axcVar.m17947l(3);
                i6 = axcVar.m17939d() ? 1 : 2;
                if (axcVar.m17939d()) {
                    int iM17940e8 = axcVar.m17940e(8);
                    int iM17940e9 = axcVar.m17940e(8);
                    axcVar.m17947l(8);
                    iM43661j = ph3.m43661j(iM17940e8);
                    iM43662k = ph3.m43662k(iM17940e9);
                } else {
                    iM43662k = -1;
                }
            } else {
                iM43662k = -1;
                i6 = -1;
            }
            if (axcVar.m17939d()) {
                axcVar.m17943h();
                axcVar.m17943h();
            }
            axcVar.m17946k();
            if (axcVar.m17939d()) {
                i14 *= 2;
            }
            i5 = i6;
            i3 = i14;
            i4 = iM43661j;
            iM43661j = iM43662k;
        } else {
            i3 = i14;
            i4 = -1;
            i5 = -1;
        }
        return new C14354a(iM17940e2, zM17939d, iM17940e3, i7, iM17943h2, iM17943h9, iM17943h10, iArr, iM17940e4, iM17943h, i13, i3, f, iMax, i4, i5, iM43661j);
    }

    /* renamed from: j */
    public static C14355b m32621j(byte[] bArr, int i, int i2) {
        return m32622k(bArr, i + 1, i2);
    }

    /* renamed from: k */
    public static C14355b m32622k(byte[] bArr, int i, int i2) {
        axc axcVar = new axc(bArr, i, i2);
        int iM17943h = axcVar.m17943h();
        int iM17943h2 = axcVar.m17943h();
        axcVar.m17946k();
        return new C14355b(iM17943h, iM17943h2, axcVar.m17939d());
    }

    /* renamed from: l */
    public static C14356c m32623l(byte[] bArr, int i, int i2) {
        return m32624m(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14356c m32624m(byte[] bArr, int i, int i2) {
        int iM17943h;
        boolean zM17939d;
        int iM17943h2;
        int iM17943h3;
        int i3;
        int iM17943h4;
        boolean z;
        boolean zM17939d2;
        int i4;
        int i5;
        float f;
        int i6;
        int iM43662k;
        int i7;
        int i8;
        int i9;
        axc axcVar = new axc(bArr, i, i2);
        int iM17940e = axcVar.m17940e(8);
        int iM17940e2 = axcVar.m17940e(8);
        int iM17940e3 = axcVar.m17940e(8);
        int iM17943h5 = axcVar.m17943h();
        if (iM17940e == 100 || iM17940e == 110 || iM17940e == 122 || iM17940e == 244 || iM17940e == 44 || iM17940e == 83 || iM17940e == 86 || iM17940e == 118 || iM17940e == 128 || iM17940e == 138) {
            iM17943h = axcVar.m17943h();
            zM17939d = iM17943h == 3 ? axcVar.m17939d() : false;
            iM17943h2 = axcVar.m17943h();
            iM17943h3 = axcVar.m17943h();
            axcVar.m17946k();
            if (axcVar.m17939d()) {
                int i10 = iM17943h == 3 ? 12 : 8;
                int i11 = 0;
                while (i11 < i10) {
                    if (axcVar.m17939d()) {
                        m32627p(axcVar, i11 < 6 ? 16 : 64);
                    }
                    i11++;
                }
            }
        } else {
            iM17943h = 1;
            zM17939d = false;
            iM17943h2 = 0;
            iM17943h3 = 0;
        }
        int iM17943h6 = axcVar.m17943h() + 4;
        int iM17943h7 = axcVar.m17943h();
        if (iM17943h7 == 0) {
            i3 = iM17940e;
            iM17943h4 = axcVar.m17943h() + 4;
        } else {
            if (iM17943h7 == 1) {
                boolean zM17939d3 = axcVar.m17939d();
                axcVar.m17942g();
                axcVar.m17942g();
                i3 = iM17940e;
                long jM17943h = axcVar.m17943h();
                for (int i12 = 0; i12 < jM17943h; i12++) {
                    axcVar.m17943h();
                }
                z = zM17939d3;
                iM17943h4 = 0;
                int iM17943h8 = axcVar.m17943h();
                axcVar.m17946k();
                int iM17943h9 = axcVar.m17943h() + 1;
                int iM17943h10 = axcVar.m17943h() + 1;
                zM17939d2 = axcVar.m17939d();
                int i13 = (2 - (zM17939d2 ? 1 : 0)) * iM17943h10;
                if (!zM17939d2) {
                    axcVar.m17946k();
                }
                axcVar.m17946k();
                int i14 = iM17943h9 * 16;
                int i15 = i13 * 16;
                if (axcVar.m17939d()) {
                    int iM17943h11 = axcVar.m17943h();
                    int iM17943h12 = axcVar.m17943h();
                    int iM17943h13 = axcVar.m17943h();
                    int iM17943h14 = axcVar.m17943h();
                    if (iM17943h == 0) {
                        i9 = 2 - (zM17939d2 ? 1 : 0);
                        i8 = 1;
                    } else {
                        i8 = iM17943h == 3 ? 1 : 2;
                        i9 = (iM17943h == 1 ? 2 : 1) * (2 - (zM17939d2 ? 1 : 0));
                    }
                    i14 -= (iM17943h11 + iM17943h12) * i8;
                    i15 -= (iM17943h13 + iM17943h14) * i9;
                }
                int i16 = i15;
                int i17 = i3;
                int i18 = i14;
                int iM17943h15 = ((i17 != 44 || i17 == 86 || i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244) && (iM17940e2 & 16) != 0) ? 0 : 16;
                int iM43661j = -1;
                float f2 = 1.0f;
                if (axcVar.m17939d()) {
                    i4 = iM17943h15;
                    i5 = -1;
                    f = 1.0f;
                    i6 = -1;
                } else {
                    if (axcVar.m17939d()) {
                        int iM17940e4 = axcVar.m17940e(8);
                        if (iM17940e4 == 255) {
                            int iM17940e5 = axcVar.m17940e(16);
                            int iM17940e6 = axcVar.m17940e(16);
                            if (iM17940e5 != 0 && iM17940e6 != 0) {
                                f2 = iM17940e5 / iM17940e6;
                            }
                        } else {
                            float[] fArr = f29114b;
                            if (iM17940e4 < fArr.length) {
                                f2 = fArr[iM17940e4];
                            } else {
                                ria.m46824h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM17940e4);
                            }
                        }
                    }
                    if (axcVar.m17939d()) {
                        axcVar.m17946k();
                    }
                    if (axcVar.m17939d()) {
                        axcVar.m17947l(3);
                        i7 = axcVar.m17939d() ? 1 : 2;
                        if (axcVar.m17939d()) {
                            int iM17940e7 = axcVar.m17940e(8);
                            int iM17940e8 = axcVar.m17940e(8);
                            axcVar.m17947l(8);
                            iM43661j = ph3.m43661j(iM17940e7);
                            iM43662k = ph3.m43662k(iM17940e8);
                        } else {
                            iM43662k = -1;
                        }
                    } else {
                        iM43662k = -1;
                        i7 = -1;
                    }
                    if (axcVar.m17939d()) {
                        axcVar.m17943h();
                        axcVar.m17943h();
                    }
                    if (axcVar.m17939d()) {
                        axcVar.m17947l(65);
                    }
                    boolean zM17939d4 = axcVar.m17939d();
                    if (zM17939d4) {
                        m32626o(axcVar);
                    }
                    boolean zM17939d5 = axcVar.m17939d();
                    if (zM17939d5) {
                        m32626o(axcVar);
                    }
                    if (zM17939d4 || zM17939d5) {
                        axcVar.m17946k();
                    }
                    axcVar.m17946k();
                    if (axcVar.m17939d()) {
                        axcVar.m17946k();
                        axcVar.m17943h();
                        axcVar.m17943h();
                        axcVar.m17943h();
                        axcVar.m17943h();
                        iM17943h15 = axcVar.m17943h();
                        axcVar.m17943h();
                    }
                    i4 = iM17943h15;
                    i5 = iM43662k;
                    f = f2;
                    i6 = i7;
                }
                return new C14356c(i17, iM17940e2, iM17940e3, iM17943h5, iM17943h8, i18, i16, f, iM17943h2, iM17943h3, zM17939d, zM17939d2, iM17943h6, iM17943h7, iM17943h4, z, iM43661j, i6, i5, i4);
            }
            i3 = iM17940e;
            iM17943h4 = 0;
        }
        z = false;
        int iM17943h82 = axcVar.m17943h();
        axcVar.m17946k();
        int iM17943h92 = axcVar.m17943h() + 1;
        int iM17943h102 = axcVar.m17943h() + 1;
        zM17939d2 = axcVar.m17939d();
        int i132 = (2 - (zM17939d2 ? 1 : 0)) * iM17943h102;
        if (!zM17939d2) {
        }
        axcVar.m17946k();
        int i142 = iM17943h92 * 16;
        int i152 = i132 * 16;
        if (axcVar.m17939d()) {
        }
        int i162 = i152;
        int i172 = i3;
        int i182 = i142;
        if (i172 != 44) {
        }
        int iM43661j2 = -1;
        float f22 = 1.0f;
        if (axcVar.m17939d()) {
        }
        return new C14356c(i172, iM17940e2, iM17940e3, iM17943h5, iM17943h82, i182, i162, f, iM17943h2, iM17943h3, zM17939d, zM17939d2, iM17943h6, iM17943h7, iM17943h4, z, iM43661j2, i6, i5, i4);
    }

    /* renamed from: n */
    public static void m32625n(axc axcVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (axcVar.m17939d()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        axcVar.m17942g();
                    }
                    for (int i4 = 0; i4 < iMin; i4++) {
                        axcVar.m17942g();
                    }
                } else {
                    axcVar.m17943h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: o */
    public static void m32626o(axc axcVar) {
        int iM17943h = axcVar.m17943h() + 1;
        axcVar.m17947l(8);
        for (int i = 0; i < iM17943h; i++) {
            axcVar.m17943h();
            axcVar.m17943h();
            axcVar.m17946k();
        }
        axcVar.m17947l(20);
    }

    /* renamed from: p */
    public static void m32627p(axc axcVar, int i) {
        int iM17942g = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iM17942g != 0) {
                iM17942g = ((axcVar.m17942g() + i2) + 256) % 256;
            }
            if (iM17942g != 0) {
                i2 = iM17942g;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static void m32628q(axc axcVar) {
        int iM17943h = axcVar.m17943h();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        while (i2 < iM17943h) {
            if ((i2 != 0 && axcVar.m17939d()) == true) {
                int i4 = i + i3;
                int iM17943h2 = (1 - ((axcVar.m17939d() ? 1 : 0) * 2)) * (axcVar.m17943h() + 1);
                int i5 = i4 + 1;
                boolean[] zArr = new boolean[i5];
                for (int i6 = 0; i6 <= i4; i6++) {
                    if (axcVar.m17939d()) {
                        zArr[i6] = true;
                    } else {
                        zArr[i6] = axcVar.m17939d();
                    }
                }
                int[] iArr2 = new int[i5];
                int[] iArr3 = new int[i5];
                int i7 = 0;
                for (int i8 = i3 - 1; i8 >= 0; i8--) {
                    int i9 = iArrCopyOf[i8] + iM17943h2;
                    if (i9 < 0 && zArr[i + i8]) {
                        iArr2[i7] = i9;
                        i7++;
                    }
                }
                if (iM17943h2 < 0 && zArr[i4]) {
                    iArr2[i7] = iM17943h2;
                    i7++;
                }
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = iArr[i10] + iM17943h2;
                    if (i11 < 0 && zArr[i10]) {
                        iArr2[i7] = i11;
                        i7++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i7);
                int i12 = 0;
                for (int i13 = i - 1; i13 >= 0; i13--) {
                    int i14 = iArr[i13] + iM17943h2;
                    if (i14 > 0 && zArr[i13]) {
                        iArr3[i12] = i14;
                        i12++;
                    }
                }
                if (iM17943h2 > 0 && zArr[i4]) {
                    iArr3[i12] = iM17943h2;
                    i12++;
                }
                for (int i15 = 0; i15 < i3; i15++) {
                    int i16 = iArrCopyOf[i15] + iM17943h2;
                    if (i16 > 0 && zArr[i + i15]) {
                        iArr3[i12] = i16;
                        i12++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i12);
                iArr = iArrCopyOf2;
                i = i7;
                i3 = i12;
            } else {
                int iM17943h3 = axcVar.m17943h();
                int iM17943h4 = axcVar.m17943h();
                int[] iArr4 = new int[iM17943h3];
                int i17 = 0;
                while (i17 < iM17943h3) {
                    iArr4[i17] = (i17 > 0 ? iArr4[i17 - 1] : 0) - (axcVar.m17943h() + 1);
                    axcVar.m17946k();
                    i17++;
                }
                int[] iArr5 = new int[iM17943h4];
                int i18 = 0;
                while (i18 < iM17943h4) {
                    iArr5[i18] = (i18 > 0 ? iArr5[i18 - 1] : 0) + axcVar.m17943h() + 1;
                    axcVar.m17946k();
                    i18++;
                }
                i = iM17943h3;
                iArr = iArr4;
                i3 = iM17943h4;
                iArrCopyOf = iArr5;
            }
            i2++;
        }
    }

    /* renamed from: r */
    public static int m32629r(byte[] bArr, int i) {
        int i2;
        synchronized (f29115c) {
            int iM32615d = 0;
            int i3 = 0;
            while (iM32615d < i) {
                try {
                    iM32615d = m32615d(bArr, iM32615d, i);
                    if (iM32615d < i) {
                        int[] iArr = f29116d;
                        if (iArr.length <= i3) {
                            f29116d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f29116d[i3] = iM32615d;
                        iM32615d += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = f29116d[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i9 + 1;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }
}
