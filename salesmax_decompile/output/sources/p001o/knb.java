package p001o;

/* loaded from: classes2.dex */
public abstract class knb {

    /* renamed from: o.knb$b */
    public static class C14888b {

        /* renamed from: a */
        public int f32472a;

        /* renamed from: b */
        public long f32473b;

        /* renamed from: c */
        public int f32474c;
    }

    /* renamed from: o.knb$c */
    public static class C14889c {

        /* renamed from: a */
        public final int f32475a;

        /* renamed from: b */
        public final int f32476b;

        /* renamed from: c */
        public final int f32477c;

        /* renamed from: d */
        public final byte[] f32478d;

        public C14889c(int i, int i2, int i3, byte[] bArr) {
            this.f32475a = i;
            this.f32476b = i2;
            this.f32477c = i3;
            this.f32478d = bArr;
        }
    }

    /* renamed from: a */
    public static int m35949a(int i) throws byc {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw byc.m19924d("Unsupported coreSbrFrameLengthIndex " + i);
    }

    /* renamed from: b */
    public static double m35950b(int i) throws byc {
        switch (i) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw byc.m19924d("Unsupported sampling rate " + i);
        }
    }

    /* renamed from: c */
    public static int m35951c(int i) throws byc {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw byc.m19924d("Unsupported sampling rate index " + i);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    /* renamed from: d */
    public static int m35952d(int i) throws byc {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw byc.m19924d("Unsupported coreSbrFrameLengthIndex " + i);
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static boolean m35953e(int i) {
        return (i & 16777215) == 12583333;
    }

    /* renamed from: f */
    public static int m35954f(ywc ywcVar) {
        if (!ywcVar.m58443g()) {
            return 0;
        }
        ywcVar.m58454r(2);
        return ywcVar.m58444h(13);
    }

    /* renamed from: g */
    public static boolean m35955g(ywc ywcVar, C14888b c14888b) throws byc {
        ywcVar.m58440d();
        int iM35959k = m35959k(ywcVar, 3, 8, 8);
        c14888b.f32472a = iM35959k;
        if (iM35959k == -1) {
            return false;
        }
        long jM35960l = m35960l(ywcVar, 2, 8, 32);
        c14888b.f32473b = jM35960l;
        if (jM35960l == -1) {
            return false;
        }
        if (jM35960l > 16) {
            throw byc.m19924d("Contains sub-stream with an invalid packet label " + c14888b.f32473b);
        }
        if (jM35960l == 0) {
            int i = c14888b.f32472a;
            if (i == 1) {
                throw byc.m19921a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw byc.m19921a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw byc.m19921a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iM35959k2 = m35959k(ywcVar, 11, 24, 24);
        c14888b.f32474c = iM35959k2;
        return iM35959k2 != -1;
    }

    /* renamed from: h */
    public static C14889c m35956h(ywc ywcVar) throws byc {
        int iM58444h = ywcVar.m58444h(8);
        int iM58444h2 = ywcVar.m58444h(5);
        int iM58444h3 = iM58444h2 == 31 ? ywcVar.m58444h(24) : m35951c(iM58444h2);
        int iM58444h4 = ywcVar.m58444h(3);
        int iM35949a = m35949a(iM58444h4);
        int iM35952d = m35952d(iM58444h4);
        ywcVar.m58454r(2);
        m35964p(ywcVar);
        m35961m(ywcVar, m35958j(ywcVar), iM35952d);
        byte[] bArr = null;
        if (ywcVar.m58443g()) {
            int iM35959k = m35959k(ywcVar, 2, 4, 8) + 1;
            for (int i = 0; i < iM35959k; i++) {
                int iM35959k2 = m35959k(ywcVar, 4, 8, 16);
                int iM35959k3 = m35959k(ywcVar, 4, 8, 16);
                if (iM35959k2 == 7) {
                    int iM58444h5 = ywcVar.m58444h(4) + 1;
                    ywcVar.m58454r(4);
                    byte[] bArr2 = new byte[iM58444h5];
                    for (int i2 = 0; i2 < iM58444h5; i2++) {
                        bArr2[i2] = (byte) ywcVar.m58444h(8);
                    }
                    bArr = bArr2;
                } else {
                    ywcVar.m58454r(iM35959k3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dM35950b = m35950b(iM58444h3);
        return new C14889c(iM58444h, (int) (iM58444h3 * dM35950b), (int) (iM35949a * dM35950b), bArr3);
    }

    /* renamed from: i */
    public static boolean m35957i(ywc ywcVar) {
        ywcVar.m58454r(3);
        boolean zM58443g = ywcVar.m58443g();
        if (zM58443g) {
            ywcVar.m58454r(13);
        }
        return zM58443g;
    }

    /* renamed from: j */
    public static int m35958j(ywc ywcVar) {
        int iM58444h = ywcVar.m58444h(5);
        int iM35959k = 0;
        for (int i = 0; i < iM58444h + 1; i++) {
            int iM58444h2 = ywcVar.m58444h(3);
            iM35959k += m35959k(ywcVar, 5, 8, 16) + 1;
            if ((iM58444h2 == 0 || iM58444h2 == 2) && ywcVar.m58443g()) {
                m35964p(ywcVar);
            }
        }
        return iM35959k;
    }

    /* renamed from: k */
    public static int m35959k(ywc ywcVar, int i, int i2, int i3) {
        op0.m42511a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        fl8.m27017a(fl8.m27017a(i4, i5), 1 << i3);
        if (ywcVar.m58438b() < i) {
            return -1;
        }
        int iM58444h = ywcVar.m58444h(i);
        if (iM58444h != i4) {
            return iM58444h;
        }
        if (ywcVar.m58438b() < i2) {
            return -1;
        }
        int iM58444h2 = ywcVar.m58444h(i2);
        int i6 = iM58444h + iM58444h2;
        if (iM58444h2 != i5) {
            return i6;
        }
        if (ywcVar.m58438b() < i3) {
            return -1;
        }
        return i6 + ywcVar.m58444h(i3);
    }

    /* renamed from: l */
    public static long m35960l(ywc ywcVar, int i, int i2, int i3) {
        op0.m42511a(Math.max(Math.max(i, i2), i3) <= 63);
        long j = (1 << i) - 1;
        long j2 = (1 << i2) - 1;
        kla.m35833a(kla.m35833a(j, j2), 1 << i3);
        if (ywcVar.m58438b() < i) {
            return -1L;
        }
        long jM58446j = ywcVar.m58446j(i);
        if (jM58446j != j) {
            return jM58446j;
        }
        if (ywcVar.m58438b() < i2) {
            return -1L;
        }
        long jM58446j2 = ywcVar.m58446j(i2);
        long j3 = jM58446j + jM58446j2;
        if (jM58446j2 != j2) {
            return j3;
        }
        if (ywcVar.m58438b() < i3) {
            return -1L;
        }
        return j3 + ywcVar.m58446j(i3);
    }

    /* renamed from: m */
    public static void m35961m(ywc ywcVar, int i, int i2) {
        int iM58444h;
        int iM35959k = m35959k(ywcVar, 4, 8, 16) + 1;
        ywcVar.m58453q();
        for (int i3 = 0; i3 < iM35959k; i3++) {
            int iM58444h2 = ywcVar.m58444h(2);
            if (iM58444h2 == 0) {
                m35957i(ywcVar);
                if (i2 > 0) {
                    m35963o(ywcVar);
                }
            } else if (iM58444h2 == 1) {
                if (m35957i(ywcVar)) {
                    ywcVar.m58453q();
                }
                if (i2 > 0) {
                    m35963o(ywcVar);
                    iM58444h = ywcVar.m58444h(2);
                } else {
                    iM58444h = 0;
                }
                if (iM58444h > 0) {
                    ywcVar.m58454r(6);
                    int iM58444h3 = ywcVar.m58444h(2);
                    ywcVar.m58454r(4);
                    if (ywcVar.m58443g()) {
                        ywcVar.m58454r(5);
                    }
                    if (iM58444h == 2 || iM58444h == 3) {
                        ywcVar.m58454r(6);
                    }
                    if (iM58444h3 == 2) {
                        ywcVar.m58453q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int iM58444h4 = ywcVar.m58444h(2);
                if (iM58444h4 > 0 && ywcVar.m58443g()) {
                    ywcVar.m58454r(iFloor);
                }
                if (ywcVar.m58443g()) {
                    ywcVar.m58454r(iFloor);
                }
                if (i2 == 0 && iM58444h4 == 0) {
                    ywcVar.m58453q();
                }
            } else if (iM58444h2 == 3) {
                m35959k(ywcVar, 4, 8, 16);
                int iM35959k2 = m35959k(ywcVar, 4, 8, 16);
                if (ywcVar.m58443g()) {
                    m35959k(ywcVar, 8, 16, 0);
                }
                ywcVar.m58453q();
                if (iM35959k2 > 0) {
                    ywcVar.m58454r(iM35959k2 * 8);
                }
            }
        }
    }

    /* renamed from: n */
    public static void m35962n(ywc ywcVar, int i) {
        int iM58444h;
        boolean zM58443g = ywcVar.m58443g();
        int i2 = zM58443g ? 1 : 5;
        int i3 = zM58443g ? 7 : 5;
        int i4 = zM58443g ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (ywcVar.m58443g()) {
                ywcVar.m58454r(7);
                iM58444h = 0;
            } else {
                if (ywcVar.m58444h(2) == 3 && ywcVar.m58444h(i3) * i2 != 0) {
                    ywcVar.m58453q();
                }
                iM58444h = ywcVar.m58444h(i4) * i2;
                if (iM58444h != 0 && iM58444h != 180) {
                    ywcVar.m58453q();
                }
                ywcVar.m58453q();
            }
            if (iM58444h != 0 && iM58444h != 180 && ywcVar.m58443g()) {
                i5++;
            }
            i5++;
        }
    }

    /* renamed from: o */
    public static void m35963o(ywc ywcVar) {
        ywcVar.m58454r(3);
        ywcVar.m58454r(8);
        boolean zM58443g = ywcVar.m58443g();
        boolean zM58443g2 = ywcVar.m58443g();
        if (zM58443g) {
            ywcVar.m58454r(5);
        }
        if (zM58443g2) {
            ywcVar.m58454r(6);
        }
    }

    /* renamed from: p */
    public static void m35964p(ywc ywcVar) {
        int iM58444h = ywcVar.m58444h(2);
        if (iM58444h == 0) {
            ywcVar.m58454r(6);
            return;
        }
        int iM35959k = m35959k(ywcVar, 5, 8, 16) + 1;
        if (iM58444h == 1) {
            ywcVar.m58454r(iM35959k * 7);
        } else if (iM58444h == 2) {
            m35962n(ywcVar, iM35959k);
        }
    }
}
