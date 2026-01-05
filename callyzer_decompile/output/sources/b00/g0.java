package b00;

import c00.AbstractC0835b;
import com.sun.mail.util.AbstractC1452a;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 extends C0529n {

    /* renamed from: e */
    public final transient byte[][] f3625e;

    /* renamed from: f */
    public final transient int[] f3626f;

    public g0(byte[][] bArr, int[] iArr) {
        super(C0529n.f3647d.f3648a);
        this.f3625e = bArr;
        this.f3626f = iArr;
    }

    @Override // b00.C0529n
    /* renamed from: a */
    public final String mo1561a() {
        throw null;
    }

    @Override // b00.C0529n
    /* renamed from: c */
    public final C0529n mo1562c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f3625e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f3626f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC4154l.m8920c(bArrDigest);
        return new C0529n(bArrDigest);
    }

    @Override // b00.C0529n
    /* renamed from: d */
    public final int mo1563d() {
        return this.f3626f[this.f3625e.length - 1];
    }

    @Override // b00.C0529n
    /* renamed from: e */
    public final String mo1564e() {
        return m1576u().mo1564e();
    }

    @Override // b00.C0529n
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0529n) {
            C0529n c0529n = (C0529n) obj;
            if (c0529n.mo1563d() == mo1563d() && mo1570m(0, c0529n, mo1563d())) {
                return true;
            }
        }
        return false;
    }

    @Override // b00.C0529n
    /* renamed from: f */
    public final int mo1565f(int i10, byte[] other) {
        AbstractC4154l.m8923f(other, "other");
        return m1576u().mo1565f(i10, other);
    }

    @Override // b00.C0529n
    /* renamed from: h */
    public final byte[] mo1566h() {
        return m1575t();
    }

    @Override // b00.C0529n
    public final int hashCode() {
        int i10 = this.f3649b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f3625e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f3626f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f3649b = i12;
        return i12;
    }

    @Override // b00.C0529n
    /* renamed from: i */
    public final byte mo1567i(int i10) {
        byte[][] bArr = this.f3625e;
        int length = bArr.length - 1;
        int[] iArr = this.f3626f;
        AbstractC0517b.m1526e(iArr[length], i10, 1L);
        int iM2254g = AbstractC0835b.m2254g(this, i10);
        return bArr[iM2254g][(i10 - (iM2254g == 0 ? 0 : iArr[iM2254g - 1])) + iArr[bArr.length + iM2254g]];
    }

    @Override // b00.C0529n
    /* renamed from: j */
    public final int mo1568j(byte[] other) {
        AbstractC4154l.m8923f(other, "other");
        return m1576u().mo1568j(other);
    }

    @Override // b00.C0529n
    /* renamed from: l */
    public final boolean mo1569l(int i10, int i11, byte[] other, int i12) {
        AbstractC4154l.m8923f(other, "other");
        if (i10 < 0 || i10 > mo1563d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM2254g = AbstractC0835b.m2254g(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f3626f;
            int i14 = iM2254g == 0 ? 0 : iArr[iM2254g - 1];
            int i15 = iArr[iM2254g] - i14;
            byte[][] bArr = this.f3625e;
            int i16 = iArr[bArr.length + iM2254g];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC0517b.m1522a((i10 - i14) + i16, bArr[iM2254g], i11, other, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM2254g++;
        }
        return true;
    }

    @Override // b00.C0529n
    /* renamed from: m */
    public final boolean mo1570m(int i10, C0529n other, int i11) {
        AbstractC4154l.m8923f(other, "other");
        if (i10 >= 0 && i10 <= mo1563d() - i11) {
            int i12 = i11 + i10;
            int iM2254g = AbstractC0835b.m2254g(this, i10);
            int i13 = 0;
            while (i10 < i12) {
                int[] iArr = this.f3626f;
                int i14 = iM2254g == 0 ? 0 : iArr[iM2254g - 1];
                int i15 = iArr[iM2254g] - i14;
                byte[][] bArr = this.f3625e;
                int i16 = iArr[bArr.length + iM2254g];
                int iMin = Math.min(i12, i15 + i14) - i10;
                if (other.mo1569l(i13, (i10 - i14) + i16, bArr[iM2254g], iMin)) {
                    i13 += iMin;
                    i10 += iMin;
                    iM2254g++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // b00.C0529n
    /* renamed from: n */
    public final String mo1571n(Charset charset) {
        AbstractC4154l.m8923f(charset, "charset");
        return m1576u().mo1571n(charset);
    }

    @Override // b00.C0529n
    /* renamed from: o */
    public final C0529n mo1572o(int i10, int i11) {
        if (i11 == -1234567890) {
            i11 = mo1563d();
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "beginIndex=", " < 0").toString());
        }
        if (i11 > mo1563d()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i11, "endIndex=", " > length(");
            sbM4567n.append(mo1563d());
            sbM4567n.append(')');
            throw new IllegalArgumentException(sbM4567n.toString().toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("endIndex=", i11, i10, " < beginIndex=").toString());
        }
        if (i10 == 0 && i11 == mo1563d()) {
            return this;
        }
        if (i10 == i11) {
            return C0529n.f3647d;
        }
        int iM2254g = AbstractC0835b.m2254g(this, i10);
        int iM2254g2 = AbstractC0835b.m2254g(this, i11 - 1);
        byte[][] bArr = this.f3625e;
        byte[][] bArr2 = (byte[][]) AbstractC6662l.m12724n(bArr, iM2254g, iM2254g2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f3626f;
        if (iM2254g <= iM2254g2) {
            int i13 = iM2254g;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iM2254g2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iM2254g != 0 ? iArr2[iM2254g - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new g0(bArr2, iArr);
    }

    @Override // b00.C0529n
    /* renamed from: q */
    public final C0529n mo1573q() {
        return m1576u().mo1573q();
    }

    @Override // b00.C0529n
    /* renamed from: s */
    public final void mo1574s(C0526k c0526k, int i10) {
        int iM2254g = AbstractC0835b.m2254g(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f3626f;
            int i12 = iM2254g == 0 ? 0 : iArr[iM2254g - 1];
            int i13 = iArr[iM2254g] - i12;
            byte[][] bArr = this.f3625e;
            int i14 = iArr[bArr.length + iM2254g];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            e0 e0Var = new e0(bArr[iM2254g], i15, i15 + iMin, true, false);
            e0 e0Var2 = c0526k.f3637a;
            if (e0Var2 == null) {
                e0Var.f3613g = e0Var;
                e0Var.f3612f = e0Var;
                c0526k.f3637a = e0Var;
            } else {
                e0 e0Var3 = e0Var2.f3613g;
                AbstractC4154l.m8920c(e0Var3);
                e0Var3.m1553b(e0Var);
            }
            i11 += iMin;
            iM2254g++;
        }
        c0526k.f3638b += i10;
    }

    /* renamed from: t */
    public final byte[] m1575t() {
        byte[] bArr = new byte[mo1563d()];
        byte[][] bArr2 = this.f3625e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f3626f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            AbstractC6662l.m12716f(i12, bArr2[i10], i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // b00.C0529n
    public final String toString() {
        return m1576u().toString();
    }

    /* renamed from: u */
    public final C0529n m1576u() {
        return new C0529n(m1575t());
    }
}
