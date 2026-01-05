package qz;

import b00.AbstractC0517b;
import b00.C0526k;
import b00.C0529n;
import b00.d0;
import ch.C0972b;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.e */
/* loaded from: classes3.dex */
public final class C6387e {

    /* renamed from: c */
    public final d0 f30805c;

    /* renamed from: f */
    public int f30808f;

    /* renamed from: g */
    public int f30809g;

    /* renamed from: a */
    public int f30803a = 4096;

    /* renamed from: b */
    public final ArrayList f30804b = new ArrayList();

    /* renamed from: d */
    public C6386d[] f30806d = new C6386d[8];

    /* renamed from: e */
    public int f30807e = 7;

    public C6387e(C6401s c6401s) {
        this.f30805c = AbstractC0517b.m1524c(c6401s);
    }

    /* renamed from: a */
    public final int m12372a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f30806d.length;
            while (true) {
                length--;
                i11 = this.f30807e;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                C6386d c6386d = this.f30806d[length];
                AbstractC4154l.m8920c(c6386d);
                int i13 = c6386d.f30802c;
                i10 -= i13;
                this.f30809g -= i13;
                this.f30808f--;
                i12++;
            }
            C6386d[] c6386dArr = this.f30806d;
            System.arraycopy(c6386dArr, i11 + 1, c6386dArr, i11 + 1 + i12, this.f30808f);
            this.f30807e += i12;
        }
        return i12;
    }

    /* renamed from: b */
    public final C0529n m12373b(int i10) throws IOException {
        if (i10 >= 0) {
            C6386d[] c6386dArr = AbstractC6389g.f30818a;
            if (i10 <= c6386dArr.length - 1) {
                return c6386dArr[i10].f30800a;
            }
        }
        int length = this.f30807e + 1 + (i10 - AbstractC6389g.f30818a.length);
        if (length >= 0) {
            C6386d[] c6386dArr2 = this.f30806d;
            if (length < c6386dArr2.length) {
                C6386d c6386d = c6386dArr2[length];
                AbstractC4154l.m8920c(c6386d);
                return c6386d.f30800a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    /* renamed from: c */
    public final void m12374c(C6386d c6386d) {
        this.f30804b.add(c6386d);
        int i10 = c6386d.f30802c;
        int i11 = this.f30803a;
        if (i10 > i11) {
            C6386d[] c6386dArr = this.f30806d;
            AbstractC6662l.m12726p(c6386dArr, 0, c6386dArr.length, null);
            this.f30807e = this.f30806d.length - 1;
            this.f30808f = 0;
            this.f30809g = 0;
            return;
        }
        m12372a((this.f30809g + i10) - i11);
        int i12 = this.f30808f + 1;
        C6386d[] c6386dArr2 = this.f30806d;
        if (i12 > c6386dArr2.length) {
            C6386d[] c6386dArr3 = new C6386d[c6386dArr2.length * 2];
            System.arraycopy(c6386dArr2, 0, c6386dArr3, c6386dArr2.length, c6386dArr2.length);
            this.f30807e = this.f30806d.length - 1;
            this.f30806d = c6386dArr3;
        }
        int i13 = this.f30807e;
        this.f30807e = i13 - 1;
        this.f30806d[i13] = c6386d;
        this.f30808f++;
        this.f30809g += i10;
    }

    /* renamed from: d */
    public final C0529n m12375d() {
        d0 source = this.f30805c;
        byte b10 = source.readByte();
        byte[] bArr = AbstractC4297c.f21703a;
        int i10 = b10 & 255;
        int i11 = 0;
        boolean z6 = (b10 & 128) == 128;
        long jM12376e = m12376e(i10, 127);
        if (!z6) {
            return source.mo1549o(jM12376e);
        }
        C0526k c0526k = new C0526k();
        int[] iArr = AbstractC6408z.f30916a;
        AbstractC4154l.m8923f(source, "source");
        C0972b c0972b = AbstractC6408z.f30918c;
        C0972b c0972b2 = c0972b;
        int i12 = 0;
        for (long j6 = 0; j6 < jM12376e; j6++) {
            byte b11 = source.readByte();
            byte[] bArr2 = AbstractC4297c.f21703a;
            i11 = (i11 << 8) | (b11 & 255);
            i12 += 8;
            while (i12 >= 8) {
                C0972b[] c0972bArr = (C0972b[]) c0972b2.f5785d;
                AbstractC4154l.m8920c(c0972bArr);
                c0972b2 = c0972bArr[(i11 >>> (i12 - 8)) & 255];
                AbstractC4154l.m8920c(c0972b2);
                if (((C0972b[]) c0972b2.f5785d) == null) {
                    c0526k.B0(c0972b2.f5783b);
                    i12 -= c0972b2.f5784c;
                    c0972b2 = c0972b;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            C0972b[] c0972bArr2 = (C0972b[]) c0972b2.f5785d;
            AbstractC4154l.m8920c(c0972bArr2);
            C0972b c0972b3 = c0972bArr2[(i11 << (8 - i12)) & 255];
            AbstractC4154l.m8920c(c0972b3);
            int i13 = c0972b3.f5784c;
            if (((C0972b[]) c0972b3.f5785d) != null || i13 > i12) {
                break;
            }
            c0526k.B0(c0972b3.f5783b);
            i12 -= i13;
            c0972b2 = c0972b;
        }
        return c0526k.mo1549o(c0526k.f3638b);
    }

    /* renamed from: e */
    public final int m12376e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b10 = this.f30805c.readByte();
            byte[] bArr = AbstractC4297c.f21703a;
            int i14 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b10 & 127) << i13;
            i13 += 7;
        }
    }
}
