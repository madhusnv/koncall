package p001o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class gm6 {

    /* renamed from: e */
    public static final Charset f25443e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    public static final String[] f25444f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    public static final int[] f25445g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    public static final byte[] f25446h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f25447a;

    /* renamed from: b */
    public final int f25448b;

    /* renamed from: c */
    public final long f25449c;

    /* renamed from: d */
    public final byte[] f25450d;

    public gm6(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* renamed from: a */
    public static gm6 m29042a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new gm6(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f25443e);
        return new gm6(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static gm6 m29043b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d : dArr) {
            byteBufferWrap.putDouble(d);
        }
        return new gm6(12, dArr.length, byteBufferWrap.array());
    }

    /* renamed from: c */
    public static gm6 m29044c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putInt(i);
        }
        return new gm6(9, iArr.length, byteBufferWrap.array());
    }

    /* renamed from: d */
    public static gm6 m29045d(ola[] olaVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[10] * olaVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (ola olaVar : olaVarArr) {
            byteBufferWrap.putInt((int) olaVar.m42390b());
            byteBufferWrap.putInt((int) olaVar.m42389a());
        }
        return new gm6(10, olaVarArr.length, byteBufferWrap.array());
    }

    /* renamed from: e */
    public static gm6 m29046e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f25443e);
        return new gm6(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static gm6 m29047f(long j, ByteOrder byteOrder) {
        return m29048g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static gm6 m29048g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new gm6(4, jArr.length, byteBufferWrap.array());
    }

    /* renamed from: h */
    public static gm6 m29049h(ola[] olaVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[5] * olaVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (ola olaVar : olaVarArr) {
            byteBufferWrap.putInt((int) olaVar.m42390b());
            byteBufferWrap.putInt((int) olaVar.m42389a());
        }
        return new gm6(5, olaVarArr.length, byteBufferWrap.array());
    }

    /* renamed from: i */
    public static gm6 m29050i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f25445g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new gm6(3, iArr.length, byteBufferWrap.array());
    }

    /* renamed from: j */
    public int m29051j() {
        return f25445g[this.f25447a] * this.f25448b;
    }

    public String toString() {
        return "(" + f25444f[this.f25447a] + ", data length:" + this.f25450d.length + ")";
    }

    public gm6(int i, int i2, long j, byte[] bArr) {
        this.f25447a = i;
        this.f25448b = i2;
        this.f25449c = j;
        this.f25450d = bArr;
    }
}
