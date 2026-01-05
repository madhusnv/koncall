package qz;

import b00.C0526k;
import b00.C0529n;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.f */
/* loaded from: classes3.dex */
public final class C6388f {

    /* renamed from: a */
    public final C0526k f30810a;

    /* renamed from: c */
    public boolean f30812c;

    /* renamed from: g */
    public int f30816g;

    /* renamed from: h */
    public int f30817h;

    /* renamed from: b */
    public int f30811b = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f30813d = 4096;

    /* renamed from: e */
    public C6386d[] f30814e = new C6386d[8];

    /* renamed from: f */
    public int f30815f = 7;

    public C6388f(C0526k c0526k) {
        this.f30810a = c0526k;
    }

    /* renamed from: a */
    public final void m12377a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f30814e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f30815f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C6386d c6386d = this.f30814e[length];
                AbstractC4154l.m8920c(c6386d);
                i10 -= c6386d.f30802c;
                int i13 = this.f30817h;
                C6386d c6386d2 = this.f30814e[length];
                AbstractC4154l.m8920c(c6386d2);
                this.f30817h = i13 - c6386d2.f30802c;
                this.f30816g--;
                i12++;
                length--;
            }
            C6386d[] c6386dArr = this.f30814e;
            int i14 = i11 + 1;
            System.arraycopy(c6386dArr, i14, c6386dArr, i14 + i12, this.f30816g);
            C6386d[] c6386dArr2 = this.f30814e;
            int i15 = this.f30815f + 1;
            Arrays.fill(c6386dArr2, i15, i15 + i12, (Object) null);
            this.f30815f += i12;
        }
    }

    /* renamed from: b */
    public final void m12378b(C6386d c6386d) {
        int i10 = c6386d.f30802c;
        int i11 = this.f30813d;
        if (i10 > i11) {
            C6386d[] c6386dArr = this.f30814e;
            AbstractC6662l.m12726p(c6386dArr, 0, c6386dArr.length, null);
            this.f30815f = this.f30814e.length - 1;
            this.f30816g = 0;
            this.f30817h = 0;
            return;
        }
        m12377a((this.f30817h + i10) - i11);
        int i12 = this.f30816g + 1;
        C6386d[] c6386dArr2 = this.f30814e;
        if (i12 > c6386dArr2.length) {
            C6386d[] c6386dArr3 = new C6386d[c6386dArr2.length * 2];
            System.arraycopy(c6386dArr2, 0, c6386dArr3, c6386dArr2.length, c6386dArr2.length);
            this.f30815f = this.f30814e.length - 1;
            this.f30814e = c6386dArr3;
        }
        int i13 = this.f30815f;
        this.f30815f = i13 - 1;
        this.f30814e[i13] = c6386d;
        this.f30816g++;
        this.f30817h += i10;
    }

    /* renamed from: c */
    public final void m12379c(C0529n data) throws EOFException {
        AbstractC4154l.m8923f(data, "data");
        int[] iArr = AbstractC6408z.f30916a;
        int iMo1563d = data.mo1563d();
        long j6 = 0;
        long j10 = 0;
        for (int i10 = 0; i10 < iMo1563d; i10++) {
            byte bMo1567i = data.mo1567i(i10);
            byte[] bArr = AbstractC4297c.f21703a;
            j10 += AbstractC6408z.f30917b[bMo1567i & 255];
        }
        int i11 = (int) ((j10 + 7) >> 3);
        int iMo1563d2 = data.mo1563d();
        C0526k c0526k = this.f30810a;
        if (i11 >= iMo1563d2) {
            m12381e(data.mo1563d(), 127, 0);
            c0526k.A0(data);
            return;
        }
        C0526k c0526k2 = new C0526k();
        int[] iArr2 = AbstractC6408z.f30916a;
        int iMo1563d3 = data.mo1563d();
        int i12 = 0;
        for (int i13 = 0; i13 < iMo1563d3; i13++) {
            byte bMo1567i2 = data.mo1567i(i13);
            byte[] bArr2 = AbstractC4297c.f21703a;
            int i14 = bMo1567i2 & 255;
            int i15 = AbstractC6408z.f30916a[i14];
            byte b10 = AbstractC6408z.f30917b[i14];
            j6 = (j6 << b10) | i15;
            i12 += b10;
            while (i12 >= 8) {
                i12 -= 8;
                c0526k2.B0((int) (j6 >> i12));
            }
        }
        if (i12 > 0) {
            c0526k2.B0((int) ((j6 << (8 - i12)) | (255 >>> i12)));
        }
        C0529n c0529nMo1549o = c0526k2.mo1549o(c0526k2.f3638b);
        m12381e(c0529nMo1549o.mo1563d(), 127, 128);
        c0526k.A0(c0529nMo1549o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12380d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C6388f.m12380d(java.util.ArrayList):void");
    }

    /* renamed from: e */
    public final void m12381e(int i10, int i11, int i12) {
        C0526k c0526k = this.f30810a;
        if (i10 < i11) {
            c0526k.B0(i10 | i12);
            return;
        }
        c0526k.B0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            c0526k.B0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        c0526k.B0(i13);
    }
}
