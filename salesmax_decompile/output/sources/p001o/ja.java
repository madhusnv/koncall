package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.common.DrmInitData;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ja {

    /* renamed from: a */
    public static final int[] f30011a = {CastStatusCodes.CANCELED, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: o.ja$b */
    public static final class C14477b {

        /* renamed from: a */
        public final int f30012a;

        /* renamed from: b */
        public final int f30013b;

        /* renamed from: c */
        public final int f30014c;

        /* renamed from: d */
        public final int f30015d;

        /* renamed from: e */
        public final int f30016e;

        public C14477b(int i, int i2, int i3, int i4, int i5) {
            this.f30012a = i;
            this.f30014c = i2;
            this.f30013b = i3;
            this.f30015d = i4;
            this.f30016e = i5;
        }
    }

    /* renamed from: a */
    public static void m33427a(int i, zwc zwcVar) {
        zwcVar.m60013Q(7);
        byte[] bArrM60024e = zwcVar.m60024e();
        bArrM60024e[0] = -84;
        bArrM60024e[1] = 64;
        bArrM60024e[2] = -1;
        bArrM60024e[3] = -1;
        bArrM60024e[4] = (byte) ((i >> 16) & Constants.MAX_HOST_LENGTH);
        bArrM60024e[5] = (byte) ((i >> 8) & Constants.MAX_HOST_LENGTH);
        bArrM60024e[6] = (byte) (i & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: b */
    public static C2181a m33428b(zwc zwcVar, String str, String str2, DrmInitData drmInitData) {
        zwcVar.m60018V(1);
        return new C2181a.b().a0(str).o0("audio/ac4").m6751N(2).p0(((zwcVar.m60004H() & 32) >> 5) == 1 ? 48000 : 44100).m6758U(drmInitData).e0(str2).m6748K();
    }

    /* renamed from: c */
    public static int m33429c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return m33430d(new ywc(bArr)).f30016e;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14477b m33430d(ywc ywcVar) {
        int i;
        int i2;
        int iM58444h = ywcVar.m58444h(16);
        int iM58444h2 = ywcVar.m58444h(16);
        if (iM58444h2 == 65535) {
            iM58444h2 = ywcVar.m58444h(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM58444h2 + i;
        if (iM58444h == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iM58444h3 = ywcVar.m58444h(2);
        if (iM58444h3 == 3) {
            iM58444h3 += m33432f(ywcVar, 2);
        }
        int i5 = iM58444h3;
        int iM58444h4 = ywcVar.m58444h(10);
        if (ywcVar.m58443g() && ywcVar.m58444h(3) > 0) {
            ywcVar.m58454r(2);
        }
        int i6 = ywcVar.m58443g() ? 48000 : 44100;
        int iM58444h5 = ywcVar.m58444h(4);
        if (i6 == 44100 && iM58444h5 == 13) {
            i2 = f30011a[iM58444h5];
        } else if (i6 == 48000) {
            int[] iArr = f30011a;
            if (iM58444h5 < iArr.length) {
                int i7 = iArr[iM58444h5];
                int i8 = iM58444h4 % 5;
                if (i8 == 1) {
                    if (iM58444h5 == 3 || iM58444h5 == 8) {
                        i7++;
                    }
                    i2 = i7;
                } else if (i8 == 2) {
                    if (iM58444h5 == 8 || iM58444h5 == 11) {
                    }
                    i2 = i7;
                } else if (i8 != 3) {
                    if (i8 == 4 && (iM58444h5 == 3 || iM58444h5 == 8 || iM58444h5 == 11)) {
                    }
                    i2 = i7;
                }
            } else {
                i2 = 0;
            }
        }
        return new C14477b(i5, 2, i6, i4, i2);
    }

    /* renamed from: e */
    public static int m33431e(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    /* renamed from: f */
    public static int m33432f(ywc ywcVar, int i) {
        int i2 = 0;
        while (true) {
            int iM58444h = i2 + ywcVar.m58444h(i);
            if (!ywcVar.m58443g()) {
                return iM58444h;
            }
            i2 = (iM58444h + 1) << i;
        }
    }
}
