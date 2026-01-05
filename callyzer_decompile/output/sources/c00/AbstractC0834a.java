package c00;

import b00.C0526k;
import b00.e0;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5163a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c00.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0834a {

    /* renamed from: a */
    public static final byte[] f5296a;

    /* renamed from: b */
    public static final long[] f5297b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC5163a.f25245a);
        AbstractC4154l.m8922e(bytes, "getBytes(...)");
        f5296a = bytes;
        f5297b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* renamed from: a */
    public static final boolean m2245a(e0 e0Var, int i10, byte[] bArr, int i11, int i12) {
        int i13 = e0Var.f3609c;
        byte[] bArr2 = e0Var.f3607a;
        while (i11 < i12) {
            if (i10 == i13) {
                e0Var = e0Var.f3612f;
                AbstractC4154l.m8920c(e0Var);
                byte[] bArr3 = e0Var.f3607a;
                bArr2 = bArr3;
                i10 = e0Var.f3608b;
                i13 = e0Var.f3609c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    /* renamed from: b */
    public static final String m2246b(C0526k c0526k, long j6) throws EOFException {
        if (j6 > 0) {
            long j10 = j6 - 1;
            if (c0526k.m1587H(j10) == 13) {
                String strA0 = c0526k.a0(j10, AbstractC5163a.f25245a);
                c0526k.skip(2L);
                return strA0;
            }
        }
        String strA02 = c0526k.a0(j6, AbstractC5163a.f25245a);
        c0526k.skip(1L);
        return strA02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m2247c(b00.C0526k r16, b00.C0541z r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c00.AbstractC0834a.m2247c(b00.k, b00.z, boolean):int");
    }
}
