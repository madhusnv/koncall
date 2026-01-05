package p001o;

/* loaded from: classes2.dex */
public abstract class w5 {

    /* renamed from: a */
    public static final int[] f51492a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f51493b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: o.w5$b */
    public static final class C17781b {

        /* renamed from: a */
        public final int f51494a;

        /* renamed from: b */
        public final int f51495b;

        /* renamed from: c */
        public final String f51496c;

        public C17781b(int i, int i2, String str) {
            this.f51494a = i;
            this.f51495b = i2;
            this.f51496c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m53962a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f51492a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f51493b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m53963b(2, i4, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    /* renamed from: b */
    public static byte[] m53963b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: c */
    public static int m53964c(ywc ywcVar) {
        int iM58444h = ywcVar.m58444h(5);
        return iM58444h == 31 ? ywcVar.m58444h(6) + 32 : iM58444h;
    }

    /* renamed from: d */
    public static int m53965d(ywc ywcVar) throws byc {
        int iM58444h = ywcVar.m58444h(4);
        if (iM58444h == 15) {
            if (ywcVar.m58438b() >= 24) {
                return ywcVar.m58444h(24);
            }
            throw byc.m19921a("AAC header insufficient data", null);
        }
        if (iM58444h < 13) {
            return f51492a[iM58444h];
        }
        throw byc.m19921a("AAC header wrong Sampling Frequency Index", null);
    }

    /* renamed from: e */
    public static C17781b m53966e(ywc ywcVar, boolean z) throws byc {
        int iM53964c = m53964c(ywcVar);
        int iM53965d = m53965d(ywcVar);
        int iM58444h = ywcVar.m58444h(4);
        String str = "mp4a.40." + iM53964c;
        if (iM53964c == 5 || iM53964c == 29) {
            iM53965d = m53965d(ywcVar);
            iM53964c = m53964c(ywcVar);
            if (iM53964c == 22) {
                iM58444h = ywcVar.m58444h(4);
            }
        }
        if (z) {
            if (iM53964c != 1 && iM53964c != 2 && iM53964c != 3 && iM53964c != 4 && iM53964c != 6 && iM53964c != 7 && iM53964c != 17) {
                switch (iM53964c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw byc.m19924d("Unsupported audio object type: " + iM53964c);
                }
            }
            m53968g(ywcVar, iM53964c, iM58444h);
            switch (iM53964c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM58444h2 = ywcVar.m58444h(2);
                    if (iM58444h2 == 2 || iM58444h2 == 3) {
                        throw byc.m19924d("Unsupported epConfig: " + iM58444h2);
                    }
            }
        }
        int i = f51493b[iM58444h];
        if (i != -1) {
            return new C17781b(iM53965d, i, str);
        }
        throw byc.m19921a(null, null);
    }

    /* renamed from: f */
    public static C17781b m53967f(byte[] bArr) {
        return m53966e(new ywc(bArr), false);
    }

    /* renamed from: g */
    public static void m53968g(ywc ywcVar, int i, int i2) {
        if (ywcVar.m58443g()) {
            ria.m46824h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (ywcVar.m58443g()) {
            ywcVar.m58454r(14);
        }
        boolean zM58443g = ywcVar.m58443g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            ywcVar.m58454r(3);
        }
        if (zM58443g) {
            if (i == 22) {
                ywcVar.m58454r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                ywcVar.m58454r(3);
            }
            ywcVar.m58454r(1);
        }
    }
}
