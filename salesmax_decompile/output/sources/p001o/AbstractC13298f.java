package p001o;

import com.google.firebase.perf.util.Constants;
import p001o.rl1;

/* renamed from: o.f */
/* loaded from: classes6.dex */
public abstract class AbstractC13298f {

    /* renamed from: a */
    public static final rl1.C16621b f22463a = new rl1.C16621b();

    /* renamed from: b */
    public static final int f22464b = -1234567890;

    /* renamed from: a */
    public static final boolean m25884a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        sq8.m48649h(bArr, "a");
        sq8.m48649h(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m25885b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m25886c() {
        return f22464b;
    }

    /* renamed from: d */
    public static final rl1.C16621b m25887d() {
        return f22463a;
    }

    /* renamed from: e */
    public static final int m25888e(zq1 zq1Var, int i) {
        sq8.m48649h(zq1Var, "<this>");
        return i == f22464b ? zq1Var.m59694L() : i;
    }

    /* renamed from: f */
    public static final int m25889f(byte[] bArr, int i) {
        sq8.m48649h(bArr, "<this>");
        return i == f22464b ? bArr.length : i;
    }

    /* renamed from: g */
    public static final rl1.C16621b m25890g(rl1.C16621b c16621b) {
        sq8.m48649h(c16621b, "unsafeCursor");
        return c16621b == f22463a ? new rl1.C16621b() : c16621b;
    }

    /* renamed from: h */
    public static final int m25891h(int i) {
        return ((i & Constants.MAX_HOST_LENGTH) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: i */
    public static final long m25892i(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* renamed from: j */
    public static final short m25893j(short s) {
        int i = s & 65535;
        return (short) (((i & Constants.MAX_HOST_LENGTH) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: k */
    public static final String m25894k(byte b) {
        return e9g.m24598p(new char[]{AbstractC12520c.m19991f()[(b >> 4) & 15], AbstractC12520c.m19991f()[b & 15]});
    }

    /* renamed from: l */
    public static final String m25895l(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {AbstractC12520c.m19991f()[(i >> 28) & 15], AbstractC12520c.m19991f()[(i >> 24) & 15], AbstractC12520c.m19991f()[(i >> 20) & 15], AbstractC12520c.m19991f()[(i >> 16) & 15], AbstractC12520c.m19991f()[(i >> 12) & 15], AbstractC12520c.m19991f()[(i >> 8) & 15], AbstractC12520c.m19991f()[(i >> 4) & 15], AbstractC12520c.m19991f()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return e9g.m24599q(cArr, i2, 8);
    }
}
