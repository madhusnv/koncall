package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class inb {

    /* renamed from: a */
    public static final String[] f28956a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    public static final int[] f28957b = {44100, 48000, 32000};

    /* renamed from: c */
    public static final int[] f28958c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    public static final int[] f28959d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    public static final int[] f28960e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    public static final int[] f28961f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    public static final int[] f28962g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: o.inb$a */
    public static final class C14334a {

        /* renamed from: a */
        public int f28963a;

        /* renamed from: b */
        public String f28964b;

        /* renamed from: c */
        public int f28965c;

        /* renamed from: d */
        public int f28966d;

        /* renamed from: e */
        public int f28967e;

        /* renamed from: f */
        public int f28968f;

        /* renamed from: g */
        public int f28969g;

        public C14334a() {
        }

        public C14334a(C14334a c14334a) {
            this.f28963a = c14334a.f28963a;
            this.f28964b = c14334a.f28964b;
            this.f28965c = c14334a.f28965c;
            this.f28966d = c14334a.f28966d;
            this.f28967e = c14334a.f28967e;
            this.f28968f = c14334a.f28968f;
            this.f28969g = c14334a.f28969g;
        }

        /* renamed from: a */
        public boolean m32454a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!inb.m32452l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f28963a = i2;
            this.f28964b = inb.f28956a[3 - i3];
            int i6 = inb.f28957b[i5];
            this.f28966d = i6;
            if (i2 == 2) {
                this.f28966d = i6 / 2;
            } else if (i2 == 0) {
                this.f28966d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f28969g = inb.m32451k(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? inb.f28958c[i4 - 1] : inb.f28959d[i4 - 1];
                this.f28968f = i8;
                this.f28965c = (((i8 * 12) / this.f28966d) + i7) * 4;
            } else {
                int i9 = Opcodes.D2F;
                if (i2 == 3) {
                    int i10 = i3 == 2 ? inb.f28960e[i4 - 1] : inb.f28961f[i4 - 1];
                    this.f28968f = i10;
                    this.f28965c = ((i10 * Opcodes.D2F) / this.f28966d) + i7;
                } else {
                    int i11 = inb.f28962g[i4 - 1];
                    this.f28968f = i11;
                    if (i3 == 1) {
                        i9 = 72;
                    }
                    this.f28965c = ((i9 * i11) / this.f28966d) + i7;
                }
            }
            this.f28967e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* renamed from: j */
    public static int m32450j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!m32452l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = f28957b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f28958c[i4 - 1] : f28959d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? f28960e[i4 - 1] : f28961f[i4 - 1] : f28962g[i4 - 1];
        int i9 = Opcodes.D2F;
        if (i2 == 3) {
            return ((i8 * Opcodes.D2F) / i6) + i7;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    /* renamed from: k */
    public static int m32451k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static boolean m32452l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* renamed from: m */
    public static int m32453m(int i) {
        int i2;
        int i3;
        if (!m32452l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m32451k(i2, i3);
    }
}
