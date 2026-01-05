package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import mm.AbstractC4801l;
import og.cb;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r0 implements Iterable, Serializable {

    /* renamed from: b */
    public static final q0 f6641b = new q0(l1.f6595b);

    /* renamed from: a */
    public int f6642a = 0;

    static {
        int i10 = l0.f6593a;
    }

    /* renamed from: c */
    public static r0 m3945c(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (r0) it.next();
        }
        int i11 = i10 >>> 1;
        r0 r0VarM3945c = m3945c(it, i11);
        r0 r0VarM3945c2 = m3945c(it, i10 - i11);
        if (Integer.MAX_VALUE - r0VarM3945c.mo3818e() < r0VarM3945c2.mo3818e()) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("ByteString would be too long: ", r0VarM3945c.mo3818e(), r0VarM3945c2.mo3818e(), "+"));
        }
        if (r0VarM3945c2.mo3818e() == 0) {
            return r0VarM3945c;
        }
        if (r0VarM3945c.mo3818e() == 0) {
            return r0VarM3945c2;
        }
        int iMo3818e = r0VarM3945c2.mo3818e() + r0VarM3945c.mo3818e();
        if (iMo3818e < 128) {
            int iMo3818e2 = r0VarM3945c.mo3818e();
            int iMo3818e3 = r0VarM3945c2.mo3818e();
            int i12 = iMo3818e2 + iMo3818e3;
            byte[] bArr = new byte[i12];
            m3946u(0, iMo3818e2, r0VarM3945c.mo3818e());
            m3946u(0, iMo3818e2, i12);
            if (iMo3818e2 > 0) {
                r0VarM3945c.mo3819g(0, 0, bArr, iMo3818e2);
            }
            m3946u(0, iMo3818e3, r0VarM3945c2.mo3818e());
            m3946u(iMo3818e2, i12, i12);
            if (iMo3818e3 > 0) {
                r0VarM3945c2.mo3819g(0, iMo3818e2, bArr, iMo3818e3);
            }
            return new q0(bArr);
        }
        if (r0VarM3945c instanceof d2) {
            d2 d2Var = (d2) r0VarM3945c;
            r0 r0Var = d2Var.f6520d;
            r0 r0Var2 = d2Var.f6521e;
            if (r0VarM3945c2.mo3818e() + r0Var2.mo3818e() < 128) {
                int iMo3818e4 = r0Var2.mo3818e();
                int iMo3818e5 = r0VarM3945c2.mo3818e();
                int i13 = iMo3818e4 + iMo3818e5;
                byte[] bArr2 = new byte[i13];
                m3946u(0, iMo3818e4, r0Var2.mo3818e());
                m3946u(0, iMo3818e4, i13);
                if (iMo3818e4 > 0) {
                    r0Var2.mo3819g(0, 0, bArr2, iMo3818e4);
                }
                m3946u(0, iMo3818e5, r0VarM3945c2.mo3818e());
                m3946u(iMo3818e4, i13, i13);
                if (iMo3818e5 > 0) {
                    r0VarM3945c2.mo3819g(0, iMo3818e4, bArr2, iMo3818e5);
                }
                return new d2(r0Var, new q0(bArr2));
            }
            if (r0Var.mo3820h() > r0Var2.mo3820h() && d2Var.f6523g > r0VarM3945c2.mo3820h()) {
                return new d2(r0Var, new d2(r0Var2, r0VarM3945c2));
            }
        }
        if (iMo3818e >= d2.m3815z(Math.max(r0VarM3945c.mo3820h(), r0VarM3945c2.mo3820h()) + 1)) {
            return new d2(r0VarM3945c, r0VarM3945c2);
        }
        p1 p1Var = new p1(3);
        p1Var.m3934c(r0VarM3945c);
        p1Var.m3934c(r0VarM3945c2);
        ArrayDeque arrayDeque = (ArrayDeque) p1Var.f6630a;
        r0 d2Var2 = (r0) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            d2Var2 = new d2((r0) arrayDeque.pop(), d2Var2);
        }
        return d2Var2;
    }

    /* renamed from: u */
    public static int m3946u(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11232c(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC5601a.m11235f("End index: ", i11, i12, " >= "));
    }

    /* renamed from: w */
    public static q0 m3947w(int i10, int i11, byte[] bArr) {
        m3946u(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new q0(bArr2);
    }

    /* renamed from: x */
    public static r0 m3948x(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = inputStream.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    break;
                }
                i10 += i11;
            }
            q0 q0VarM3947w = i10 == 0 ? null : m3947w(0, i10, bArr);
            if (q0VarM3947w == null) {
                break;
            }
            arrayList.add(q0VarM3947w);
            iMin = Math.min(iMin + iMin, 8192);
        }
        int size = arrayList.size();
        return size == 0 ? f6641b : m3945c(arrayList.iterator(), size);
    }

    /* renamed from: y */
    public static void m3949y(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC5601a.m11235f("Index > length: ", i10, i11, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC4801l.m9730d(i10, "Index < 0: "));
        }
    }

    /* renamed from: a */
    public abstract byte mo3816a(int i10);

    /* renamed from: b */
    public abstract byte mo3817b(int i10);

    /* renamed from: e */
    public abstract int mo3818e();

    /* renamed from: g */
    public abstract void mo3819g(int i10, int i11, byte[] bArr, int i12);

    /* renamed from: h */
    public abstract int mo3820h();

    public final int hashCode() {
        int iMo3822k = this.f6642a;
        if (iMo3822k == 0) {
            int iMo3818e = mo3818e();
            iMo3822k = mo3822k(iMo3818e, 0, iMo3818e);
            if (iMo3822k == 0) {
                iMo3822k = 1;
            }
            this.f6642a = iMo3822k;
        }
        return iMo3822k;
    }

    /* renamed from: j */
    public abstract boolean mo3821j();

    /* renamed from: k */
    public abstract int mo3822k(int i10, int i11, int i12);

    /* renamed from: m */
    public abstract int mo3823m(int i10, int i11, int i12);

    /* renamed from: q */
    public abstract r0 mo3824q(int i10, int i11);

    /* renamed from: r */
    public abstract String mo3825r(Charset charset);

    /* renamed from: s */
    public abstract void mo3826s(s0 s0Var);

    /* renamed from: t */
    public abstract boolean mo3827t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return AbstractC1452a.m4564k(AbstractC0030c.m125p(mo3818e(), "<ByteString@", hexString, " size=", " contents=\""), mo3818e() <= 50 ? cb.m10576d(this) : cb.m10576d(mo3824q(0, 47)).concat("..."), "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public o0 iterator() {
        return new n0(this);
    }
}
