package p001o;

import java.io.EOFException;
import p001o.rl1;

/* renamed from: o.b */
/* loaded from: classes6.dex */
public abstract class AbstractC12275b {

    /* renamed from: a */
    public static final byte[] f15411a = xfj.m56226a("0123456789abcdef");

    /* renamed from: a */
    public static final rl1.C16621b m18066a(rl1 rl1Var, rl1.C16621b c16621b) {
        sq8.m48649h(rl1Var, "<this>");
        sq8.m48649h(c16621b, "unsafeCursor");
        rl1.C16621b c16621bM25890g = AbstractC13298f.m25890g(c16621b);
        if (!(c16621bM25890g.f43760a == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c16621bM25890g.f43760a = rl1Var;
        c16621bM25890g.f43761b = true;
        return c16621bM25890g;
    }

    /* renamed from: b */
    public static final rl1.C16621b m18067b(rl1 rl1Var, rl1.C16621b c16621b) {
        sq8.m48649h(rl1Var, "<this>");
        sq8.m48649h(c16621b, "unsafeCursor");
        rl1.C16621b c16621bM25890g = AbstractC13298f.m25890g(c16621b);
        if (!(c16621bM25890g.f43760a == null)) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        c16621bM25890g.f43760a = rl1Var;
        c16621bM25890g.f43761b = false;
        return c16621bM25890g;
    }

    /* renamed from: c */
    public static final byte[] m18068c() {
        return f15411a;
    }

    /* renamed from: d */
    public static final boolean m18069d(hbf hbfVar, int i, byte[] bArr, int i2, int i3) {
        sq8.m48649h(hbfVar, "segment");
        sq8.m48649h(bArr, "bytes");
        int i4 = hbfVar.f26589c;
        byte[] bArr2 = hbfVar.f26587a;
        while (i2 < i3) {
            if (i == i4) {
                hbfVar = hbfVar.f26592f;
                sq8.m48646e(hbfVar);
                byte[] bArr3 = hbfVar.f26587a;
                bArr2 = bArr3;
                i = hbfVar.f26588b;
                i4 = hbfVar.f26589c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: e */
    public static final String m18070e(rl1 rl1Var, long j) throws EOFException {
        sq8.m48649h(rl1Var, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (rl1Var.m46918s(j2) == 13) {
                String strT1 = rl1Var.t1(j2);
                rl1Var.skip(2L);
                return strT1;
            }
        }
        String strT12 = rl1Var.t1(j);
        rl1Var.skip(1L);
        return strT12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m18071f(rl1 rl1Var, qec qecVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        hbf hbfVar;
        sq8.m48649h(rl1Var, "<this>");
        sq8.m48649h(qecVar, "options");
        hbf hbfVar2 = rl1Var.f43757a;
        if (hbfVar2 != null) {
            byte[] bArr = hbfVar2.f26587a;
            int i5 = hbfVar2.f26588b;
            int i6 = hbfVar2.f26589c;
            int[] iArrM45284p = qecVar.m45284p();
            hbf hbfVar3 = hbfVar2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArrM45284p[i8];
                int i11 = i9 + 1;
                int i12 = iArrM45284p[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (hbfVar3 == null) {
                    break;
                }
                if (i10 >= 0) {
                    i = i5 + 1;
                    int i13 = bArr[i5] & 255;
                    int i14 = i11 + i10;
                    while (i11 != i14) {
                        if (i13 == iArrM45284p[i11]) {
                            i2 = iArrM45284p[i11 + i10];
                            if (i == i6) {
                                hbfVar3 = hbfVar3.f26592f;
                                sq8.m48646e(hbfVar3);
                                i = hbfVar3.f26588b;
                                bArr = hbfVar3.f26587a;
                                i6 = hbfVar3.f26589c;
                                if (hbfVar3 == hbfVar2) {
                                    hbfVar3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                int i15 = i11 + (i10 * (-1));
                while (true) {
                    int i16 = i5 + 1;
                    int i17 = i11 + 1;
                    if ((bArr[i5] & 255) != iArrM45284p[i11]) {
                        return i7;
                    }
                    boolean z2 = i17 == i15;
                    if (i16 == i6) {
                        sq8.m48646e(hbfVar3);
                        hbf hbfVar4 = hbfVar3.f26592f;
                        sq8.m48646e(hbfVar4);
                        i4 = hbfVar4.f26588b;
                        byte[] bArr2 = hbfVar4.f26587a;
                        i3 = hbfVar4.f26589c;
                        if (hbfVar4 != hbfVar2) {
                            hbfVar = hbfVar4;
                            bArr = bArr2;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            hbfVar = null;
                        }
                    } else {
                        hbf hbfVar5 = hbfVar3;
                        i3 = i6;
                        i4 = i16;
                        hbfVar = hbfVar5;
                    }
                    if (z2) {
                        i2 = iArrM45284p[i17];
                        i = i4;
                        i6 = i3;
                        hbfVar3 = hbfVar;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    i11 = i17;
                    hbfVar3 = hbfVar;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
        } else {
            return z ? -2 : -1;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m18072g(rl1 rl1Var, qec qecVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m18071f(rl1Var, qecVar, z);
    }
}
