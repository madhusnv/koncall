package w6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w6.c */
/* loaded from: classes.dex */
public final class C7936c {

    /* renamed from: a */
    public final int f38158a;

    /* renamed from: b */
    public final int f38159b;

    /* renamed from: c */
    public final long f38160c;

    /* renamed from: d */
    public final byte[] f38161d;

    public C7936c(int i10, int i11, byte[] bArr) {
        this(-1L, bArr, i10, i11);
    }

    /* renamed from: a */
    public static C7936c m15060a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C7940g.f38180M);
        return new C7936c(2, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C7936c m15061b(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7940g.f38171D[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new C7936c(4, jArr.length, byteBufferWrap.array());
    }

    /* renamed from: c */
    public static C7936c m15062c(C7938e[] c7938eArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7940g.f38171D[5] * c7938eArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C7938e c7938e : c7938eArr) {
            byteBufferWrap.putInt((int) c7938e.f38166a);
            byteBufferWrap.putInt((int) c7938e.f38167b);
        }
        return new C7936c(5, c7938eArr.length, byteBufferWrap.array());
    }

    /* renamed from: d */
    public static C7936c m15063d(int i10, ByteOrder byteOrder) {
        int[] iArr = {i10};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7940g.f38171D[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putShort((short) i11);
        }
        return new C7936c(3, iArr.length, byteBufferWrap.array());
    }

    /* renamed from: e */
    public final double m15064e(ByteOrder byteOrder) throws Throwable {
        Object objM15067h = m15067h(byteOrder);
        if (objM15067h == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM15067h instanceof String) {
            return Double.parseDouble((String) objM15067h);
        }
        if (objM15067h instanceof long[]) {
            if (((long[]) objM15067h).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM15067h instanceof int[]) {
            if (((int[]) objM15067h).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM15067h instanceof double[]) {
            double[] dArr = (double[]) objM15067h;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM15067h instanceof C7938e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C7938e[] c7938eArr = (C7938e[]) objM15067h;
        if (c7938eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C7938e c7938e = c7938eArr[0];
        return c7938e.f38166a / c7938e.f38167b;
    }

    /* renamed from: f */
    public final int m15065f(ByteOrder byteOrder) throws Throwable {
        Object objM15067h = m15067h(byteOrder);
        if (objM15067h == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM15067h instanceof String) {
            return Integer.parseInt((String) objM15067h);
        }
        if (objM15067h instanceof long[]) {
            long[] jArr = (long[]) objM15067h;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM15067h instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM15067h;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* renamed from: g */
    public final String m15066g(ByteOrder byteOrder) throws Throwable {
        Object objM15067h = m15067h(byteOrder);
        if (objM15067h == null) {
            return null;
        }
        if (objM15067h instanceof String) {
            return (String) objM15067h;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (objM15067h instanceof long[]) {
            long[] jArr = (long[]) objM15067h;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objM15067h instanceof int[]) {
            int[] iArr = (int[]) objM15067h;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objM15067h instanceof double[]) {
            double[] dArr = (double[]) objM15067h;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objM15067h instanceof C7938e[])) {
            return null;
        }
        C7938e[] c7938eArr = (C7938e[]) objM15067h;
        while (i10 < c7938eArr.length) {
            sb2.append(c7938eArr[i10].f38166a);
            sb2.append('/');
            sb2.append(c7938eArr[i10].f38167b);
            i10++;
            if (i10 != c7938eArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:59|(2:61|(2:62|(2:64|(2:148|66)(1:67))(2:149|68)))|69|(2:71|(6:151|73|79|143|80|81)(3:74|(2:76|153)(2:77|152)|78))|150|79|143|80|81) */
    /* JADX WARN: Type inference failed for: r12v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, w6.e[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.io.Serializable, w6.e[]] */
    /* JADX WARN: Type inference failed for: r12v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m15067h(java.nio.ByteOrder r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C7936c.m15067h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(C7940g.f38170C[this.f38158a]);
        sb2.append(", data length:");
        return AbstractC5601a.m11233d(this.f38161d.length, ")", sb2);
    }

    public C7936c(long j6, byte[] bArr, int i10, int i11) {
        this.f38158a = i10;
        this.f38159b = i11;
        this.f38160c = j6;
        this.f38161d = bArr;
    }
}
