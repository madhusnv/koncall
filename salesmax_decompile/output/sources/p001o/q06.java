package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class q06 {

    /* renamed from: a */
    public static final int[] f41032a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f41033b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f41034c = {64, 112, 128, Opcodes.CHECKCAST, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final int[] f41035d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e */
    public static final int[] f41036e = {5, 8, 10, 12};

    /* renamed from: f */
    public static final int[] f41037f = {6, 9, 12, 15};

    /* renamed from: g */
    public static final int[] f41038g = {2, 4, 6, 8};

    /* renamed from: h */
    public static final int[] f41039h = {9, 11, 13, 16};

    /* renamed from: i */
    public static final int[] f41040i = {5, 8, 10, 12};

    /* renamed from: o.q06$b */
    public static final class C16266b {

        /* renamed from: a */
        public final String f41041a;

        /* renamed from: b */
        public final int f41042b;

        /* renamed from: c */
        public final int f41043c;

        /* renamed from: d */
        public final int f41044d;

        /* renamed from: e */
        public final long f41045e;

        /* renamed from: f */
        public final int f41046f;

        public C16266b(String str, int i, int i2, int i3, long j, int i4) {
            this.f41041a = str;
            this.f41043c = i;
            this.f41042b = i2;
            this.f41044d = i3;
            this.f41045e = j;
            this.f41046f = i4;
        }
    }

    /* renamed from: a */
    public static void m44592a(byte[] bArr, int i) throws byc {
        int i2 = i - 2;
        if (((bArr[i - 1] & 255) | ((bArr[i2] << 8) & 65535)) != sqi.m48742u(bArr, 0, i2, 65535)) {
            throw byc.m19921a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m44593b(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            return !z ? (i2 * 16) / 14 : i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (!z) {
        }
    }

    /* renamed from: c */
    public static int m44594c(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    /* renamed from: d */
    public static ywc m44595d(byte[] bArr) {
        byte b = bArr[0];
        if (b == 127 || b == 100 || b == 64 || b == 113) {
            return new ywc(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (m44596e(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b2 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b2;
            }
        }
        ywc ywcVar = new ywc(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ywc ywcVar2 = new ywc(bArrCopyOf);
            while (ywcVar2.m58438b() >= 16) {
                ywcVar2.m58454r(2);
                ywcVar.m58442f(ywcVar2.m58444h(14), 14);
            }
        }
        ywcVar.m58450n(bArrCopyOf);
        return ywcVar;
    }

    /* renamed from: e */
    public static boolean m44596e(byte[] bArr) {
        byte b = bArr[0];
        return b == -2 || b == -1 || b == 37 || b == -14 || b == -24;
    }

    /* renamed from: f */
    public static int m44597f(ByteBuffer byteBuffer) {
        int i;
        byte b;
        int i2;
        byte b2;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b3 = byteBuffer.get(iPosition);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 7);
            } else if (b3 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition + 6);
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b = byteBuffer.get(iPosition + 4);
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static int m44598g(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: h */
    public static C2181a m44599h(byte[] bArr, String str, String str2, int i, DrmInitData drmInitData) {
        ywc ywcVarM44595d = m44595d(bArr);
        ywcVarM44595d.m58454r(60);
        int i2 = f41032a[ywcVarM44595d.m58444h(6)];
        int i3 = f41033b[ywcVarM44595d.m58444h(4)];
        int iM58444h = ywcVarM44595d.m58444h(5);
        int[] iArr = f41034c;
        int i4 = iM58444h >= iArr.length ? -1 : (iArr[iM58444h] * 1000) / 2;
        ywcVarM44595d.m58454r(10);
        return new C2181a.b().a0(str).o0("audio/vnd.dts").m6750M(i4).m6751N(i2 + (ywcVarM44595d.m58444h(2) > 0 ? 1 : 0)).p0(i3).m6758U(drmInitData).e0(str2).m0(i).m6748K();
    }

    /* renamed from: i */
    public static C16266b m44600i(byte[] bArr) throws byc {
        int i;
        int i2;
        int iM58444h;
        int i3;
        int iM58444h2;
        long jA1;
        int i4;
        ywc ywcVarM44595d = m44595d(bArr);
        ywcVarM44595d.m58454r(40);
        int iM58444h3 = ywcVarM44595d.m58444h(2);
        if (ywcVarM44595d.m58443g()) {
            i = 20;
            i2 = 12;
        } else {
            i = 16;
            i2 = 8;
        }
        ywcVarM44595d.m58454r(i2);
        int iM58444h4 = ywcVarM44595d.m58444h(i) + 1;
        boolean zM58443g = ywcVarM44595d.m58443g();
        int i5 = 0;
        if (zM58443g) {
            iM58444h = ywcVarM44595d.m58444h(2);
            int iM58444h5 = (ywcVarM44595d.m58444h(3) + 1) * 512;
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58454r(36);
            }
            int iM58444h6 = ywcVarM44595d.m58444h(3) + 1;
            int iM58444h7 = ywcVarM44595d.m58444h(3) + 1;
            if (iM58444h6 != 1 || iM58444h7 != 1) {
                throw byc.m19924d("Multiple audio presentations or assets not supported");
            }
            int i6 = iM58444h3 + 1;
            int iM58444h8 = ywcVarM44595d.m58444h(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iM58444h8 >> i7) & 1) == 1) {
                    ywcVarM44595d.m58454r(8);
                }
            }
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58454r(2);
                int iM58444h9 = (ywcVarM44595d.m58444h(2) + 1) << 2;
                int iM58444h10 = ywcVarM44595d.m58444h(2) + 1;
                while (i5 < iM58444h10) {
                    ywcVarM44595d.m58454r(iM58444h9);
                    i5++;
                }
            }
            i5 = iM58444h5;
        } else {
            iM58444h = -1;
        }
        ywcVarM44595d.m58454r(i);
        ywcVarM44595d.m58454r(12);
        if (zM58443g) {
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58454r(4);
            }
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58454r(24);
            }
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58455s(ywcVarM44595d.m58444h(10) + 1);
            }
            ywcVarM44595d.m58454r(5);
            int i8 = f41035d[ywcVarM44595d.m58444h(4)];
            iM58444h2 = ywcVarM44595d.m58444h(8) + 1;
            i3 = i8;
        } else {
            i3 = -2147483647;
            iM58444h2 = -1;
        }
        if (zM58443g) {
            if (iM58444h == 0) {
                i4 = 32000;
            } else if (iM58444h == 1) {
                i4 = 44100;
            } else {
                if (iM58444h != 2) {
                    throw byc.m19921a("Unsupported reference clock code in DTS HD header: " + iM58444h, null);
                }
                i4 = 48000;
            }
            jA1 = sqi.a1(i5, 1000000L, i4);
        } else {
            jA1 = -9223372036854775807L;
        }
        return new C16266b("audio/vnd.dts.hd;profile=lbr", iM58444h2, i3, iM58444h4, jA1, 0);
    }

    /* renamed from: j */
    public static int m44601j(byte[] bArr) {
        ywc ywcVarM44595d = m44595d(bArr);
        ywcVarM44595d.m58454r(42);
        return ywcVarM44595d.m58444h(ywcVarM44595d.m58443g() ? 12 : 8) + 1;
    }

    /* renamed from: k */
    public static C16266b m44602k(byte[] bArr, AtomicInteger atomicInteger) throws byc {
        int iM58444h;
        long jA1;
        int i;
        int i2;
        ywc ywcVarM44595d = m44595d(bArr);
        int i3 = ywcVarM44595d.m58444h(32) == 1078008818 ? 1 : 0;
        int iM44604m = m44604m(ywcVarM44595d, f41036e, true) + 1;
        if (i3 == 0) {
            iM58444h = -2147483647;
            jA1 = -9223372036854775807L;
        } else {
            if (!ywcVarM44595d.m58443g()) {
                throw byc.m19924d("Only supports full channel mask-based audio presentation");
            }
            m44592a(bArr, iM44604m);
            int iM58444h2 = ywcVarM44595d.m58444h(2);
            if (iM58444h2 == 0) {
                i = 512;
            } else if (iM58444h2 == 1) {
                i = 480;
            } else {
                if (iM58444h2 != 2) {
                    throw byc.m19921a("Unsupported base duration index in DTS UHD header: " + iM58444h2, null);
                }
                i = 384;
            }
            int iM58444h3 = i * (ywcVarM44595d.m58444h(3) + 1);
            int iM58444h4 = ywcVarM44595d.m58444h(2);
            if (iM58444h4 == 0) {
                i2 = 32000;
            } else if (iM58444h4 == 1) {
                i2 = 44100;
            } else {
                if (iM58444h4 != 2) {
                    throw byc.m19921a("Unsupported clock rate index in DTS UHD header: " + iM58444h4, null);
                }
                i2 = 48000;
            }
            if (ywcVarM44595d.m58443g()) {
                ywcVarM44595d.m58454r(36);
            }
            iM58444h = (1 << ywcVarM44595d.m58444h(2)) * i2;
            jA1 = sqi.a1(iM58444h3, 1000000L, i2);
        }
        int i4 = iM58444h;
        long j = jA1;
        int iM44604m2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            iM44604m2 += m44604m(ywcVarM44595d, f41037f, true);
        }
        if (i3 != 0) {
            atomicInteger.set(m44604m(ywcVarM44595d, f41038g, true));
        }
        return new C16266b("audio/vnd.dts.uhd;profile=p2", 2, i4, iM44604m + iM44604m2 + (atomicInteger.get() != 0 ? m44604m(ywcVarM44595d, f41039h, true) : 0), j, 0);
    }

    /* renamed from: l */
    public static int m44603l(byte[] bArr) {
        ywc ywcVarM44595d = m44595d(bArr);
        ywcVarM44595d.m58454r(32);
        return m44604m(ywcVarM44595d, f41040i, true) + 1;
    }

    /* renamed from: m */
    public static int m44604m(ywc ywcVar, int[] iArr, boolean z) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && ywcVar.m58443g(); i3++) {
            i2++;
        }
        if (z) {
            int i4 = 0;
            while (i < i2) {
                i4 += 1 << iArr[i];
                i++;
            }
            i = i4;
        }
        return i + ywcVar.m58444h(iArr[i2]);
    }
}
