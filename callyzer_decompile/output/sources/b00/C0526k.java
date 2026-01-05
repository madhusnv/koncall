package b00;

import c00.AbstractC0834a;
import c00.AbstractC0835b;
import com.sun.mail.util.AbstractC1452a;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import nx.AbstractC5163a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.k */
/* loaded from: classes3.dex */
public final class C0526k implements InterfaceC0528m, InterfaceC0527l, Cloneable, ByteChannel {

    /* renamed from: a */
    public e0 f3637a;

    /* renamed from: b */
    public long f3638b;

    /* renamed from: A */
    public final void m1586A(C0526k out, long j6, long j10) {
        AbstractC4154l.m8923f(out, "out");
        long j11 = j6;
        AbstractC0517b.m1526e(this.f3638b, j11, j10);
        if (j10 == 0) {
            return;
        }
        out.f3638b += j10;
        e0 e0Var = this.f3637a;
        while (true) {
            AbstractC4154l.m8920c(e0Var);
            long j12 = e0Var.f3609c - e0Var.f3608b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            e0Var = e0Var.f3612f;
        }
        e0 e0Var2 = e0Var;
        long j13 = j10;
        while (j13 > 0) {
            AbstractC4154l.m8920c(e0Var2);
            e0 e0VarM1554c = e0Var2.m1554c();
            int i10 = e0VarM1554c.f3608b + ((int) j11);
            e0VarM1554c.f3608b = i10;
            e0VarM1554c.f3609c = Math.min(i10 + ((int) j13), e0VarM1554c.f3609c);
            e0 e0Var3 = out.f3637a;
            if (e0Var3 == null) {
                e0VarM1554c.f3613g = e0VarM1554c;
                e0VarM1554c.f3612f = e0VarM1554c;
                out.f3637a = e0VarM1554c;
            } else {
                e0 e0Var4 = e0Var3.f3613g;
                AbstractC4154l.m8920c(e0Var4);
                e0Var4.m1553b(e0VarM1554c);
            }
            j13 -= e0VarM1554c.f3609c - e0VarM1554c.f3608b;
            e0Var2 = e0Var2.f3612f;
            j11 = 0;
        }
    }

    public final void A0(C0529n byteString) {
        AbstractC4154l.m8923f(byteString, "byteString");
        byteString.mo1574s(this, byteString.mo1563d());
    }

    public final void B0(int i10) {
        e0 e0VarW0 = w0(1);
        byte[] bArr = e0VarW0.f3607a;
        int i11 = e0VarW0.f3609c;
        e0VarW0.f3609c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f3638b++;
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: C */
    public final String mo1541C(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("limit < 0: ", j6).toString());
        }
        long j10 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long jM1588J = m1588J((byte) 10, 0L, j10);
        if (jM1588J != -1) {
            return AbstractC0834a.m2246b(this, jM1588J);
        }
        if (j10 < this.f3638b && m1587H(j10 - 1) == 13 && m1587H(j10) == 10) {
            return AbstractC0834a.m2246b(this, j10);
        }
        C0526k c0526k = new C0526k();
        m1586A(c0526k, 0L, Math.min(32, this.f3638b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f3638b, j6) + " content=" + c0526k.mo1549o(c0526k.f3638b).mo1564e() + (char) 8230);
    }

    public final void C0(long j6) {
        boolean z6;
        if (j6 == 0) {
            B0(48);
            return;
        }
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                H0("-9223372036854775808");
                return;
            }
            z6 = true;
        } else {
            z6 = false;
        }
        byte[] bArr = AbstractC0834a.f5296a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j6)) * 10) >>> 5;
        int i10 = iNumberOfLeadingZeros + (j6 > AbstractC0834a.f5297b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z6) {
            i10++;
        }
        e0 e0VarW0 = w0(i10);
        byte[] bArr2 = e0VarW0.f3607a;
        int i11 = e0VarW0.f3609c + i10;
        while (j6 != 0) {
            long j10 = 10;
            i11--;
            bArr2[i11] = AbstractC0834a.f5296a[(int) (j6 % j10)];
            j6 /= j10;
        }
        if (z6) {
            bArr2[i11 - 1] = 45;
        }
        e0VarW0.f3609c += i10;
        this.f3638b += i10;
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: D */
    public final int mo1542D(C0541z options) throws EOFException {
        AbstractC4154l.m8923f(options, "options");
        int iM2247c = AbstractC0834a.m2247c(this, options, false);
        if (iM2247c == -1) {
            return -1;
        }
        skip(options.f3680a[iM2247c].mo1563d());
        return iM2247c;
    }

    public final void D0(long j6) {
        if (j6 == 0) {
            B0(48);
            return;
        }
        long j10 = (j6 >>> 1) | j6;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        e0 e0VarW0 = w0(i10);
        byte[] bArr = e0VarW0.f3607a;
        int i11 = e0VarW0.f3609c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = AbstractC0834a.f5296a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        e0VarW0.f3609c += i10;
        this.f3638b += i10;
    }

    public final void E0(int i10) {
        e0 e0VarW0 = w0(4);
        byte[] bArr = e0VarW0.f3607a;
        int i11 = e0VarW0.f3609c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        e0VarW0.f3609c = i11 + 4;
        this.f3638b += 4;
    }

    public final void F0(int i10) {
        e0 e0VarW0 = w0(2);
        byte[] bArr = e0VarW0.f3607a;
        int i11 = e0VarW0.f3609c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        e0VarW0.f3609c = i11 + 2;
        this.f3638b += 2;
    }

    public final void G0(int i10, int i11, String string) {
        char cCharAt;
        AbstractC4154l.m8923f(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(AbstractC5601a.m11235f("endIndex < beginIndex: ", i11, i10, " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i11, "endIndex > string.length: ", " > ");
            sbM4567n.append(string.length());
            throw new IllegalArgumentException(sbM4567n.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                e0 e0VarW0 = w0(1);
                byte[] bArr = e0VarW0.f3607a;
                int i12 = e0VarW0.f3609c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = e0VarW0.f3609c;
                int i15 = (i12 + i10) - i14;
                e0VarW0.f3609c = i14 + i15;
                this.f3638b += i15;
            } else {
                if (cCharAt2 < 2048) {
                    e0 e0VarW02 = w0(2);
                    byte[] bArr2 = e0VarW02.f3607a;
                    int i16 = e0VarW02.f3609c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | BERTags.PRIVATE);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarW02.f3609c = i16 + 2;
                    this.f3638b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    e0 e0VarW03 = w0(3);
                    byte[] bArr3 = e0VarW03.f3607a;
                    int i17 = e0VarW03.f3609c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | BERTags.FLAGS);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    e0VarW03.f3609c = i17 + 3;
                    this.f3638b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        B0(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        e0 e0VarW04 = w0(4);
                        byte[] bArr4 = e0VarW04.f3607a;
                        int i20 = e0VarW04.f3609c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        e0VarW04.f3609c = i20 + 4;
                        this.f3638b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    /* renamed from: H */
    public final byte m1587H(long j6) {
        AbstractC0517b.m1526e(this.f3638b, j6, 1L);
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            AbstractC4154l.m8920c(null);
            throw null;
        }
        long j10 = this.f3638b;
        if (j10 - j6 < j6) {
            while (j10 > j6) {
                e0Var = e0Var.f3613g;
                AbstractC4154l.m8920c(e0Var);
                j10 -= e0Var.f3609c - e0Var.f3608b;
            }
            return e0Var.f3607a[(int) ((e0Var.f3608b + j6) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i10 = e0Var.f3609c;
            int i11 = e0Var.f3608b;
            long j12 = (i10 - i11) + j11;
            if (j12 > j6) {
                return e0Var.f3607a[(int) ((i11 + j6) - j11)];
            }
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j11 = j12;
        }
    }

    public final void H0(String string) {
        AbstractC4154l.m8923f(string, "string");
        G0(0, string.length(), string);
    }

    public final void I0(int i10) {
        if (i10 < 128) {
            B0(i10);
            return;
        }
        if (i10 < 2048) {
            e0 e0VarW0 = w0(2);
            byte[] bArr = e0VarW0.f3607a;
            int i11 = e0VarW0.f3609c;
            bArr[i11] = (byte) ((i10 >> 6) | BERTags.PRIVATE);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            e0VarW0.f3609c = i11 + 2;
            this.f3638b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            B0(63);
            return;
        }
        if (i10 < 65536) {
            e0 e0VarW02 = w0(3);
            byte[] bArr2 = e0VarW02.f3607a;
            int i12 = e0VarW02.f3609c;
            bArr2[i12] = (byte) ((i10 >> 12) | BERTags.FLAGS);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            e0VarW02.f3609c = i12 + 3;
            this.f3638b += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC0517b.m1531j(i10)));
        }
        e0 e0VarW03 = w0(4);
        byte[] bArr3 = e0VarW03.f3607a;
        int i13 = e0VarW03.f3609c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        e0VarW03.f3609c = i13 + 4;
        this.f3638b += 4;
    }

    /* renamed from: J */
    public final long m1588J(byte b10, long j6, long j10) {
        e0 e0Var;
        long j11 = 0;
        if (0 > j6 || j6 > j10) {
            throw new IllegalArgumentException(("size=" + this.f3638b + " fromIndex=" + j6 + " toIndex=" + j10).toString());
        }
        long j12 = this.f3638b;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j6 == j10 || (e0Var = this.f3637a) == null) {
            return -1L;
        }
        if (j12 - j6 < j6) {
            while (j12 > j6) {
                e0Var = e0Var.f3613g;
                AbstractC4154l.m8920c(e0Var);
                j12 -= e0Var.f3609c - e0Var.f3608b;
            }
            while (j12 < j10) {
                byte[] bArr = e0Var.f3607a;
                int iMin = (int) Math.min(e0Var.f3609c, (e0Var.f3608b + j10) - j12);
                for (int i10 = (int) ((e0Var.f3608b + j6) - j12); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - e0Var.f3608b) + j12;
                    }
                }
                j12 += e0Var.f3609c - e0Var.f3608b;
                e0Var = e0Var.f3612f;
                AbstractC4154l.m8920c(e0Var);
                j6 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (e0Var.f3609c - e0Var.f3608b) + j11;
            if (j13 > j6) {
                break;
            }
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j11 = j13;
        }
        while (j11 < j10) {
            byte[] bArr2 = e0Var.f3607a;
            int iMin2 = (int) Math.min(e0Var.f3609c, (e0Var.f3608b + j10) - j11);
            for (int i11 = (int) ((e0Var.f3608b + j6) - j11); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return (i11 - e0Var.f3608b) + j11;
                }
            }
            j11 += e0Var.f3609c - e0Var.f3608b;
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j6 = j11;
        }
        return -1L;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: M */
    public final /* bridge */ /* synthetic */ InterfaceC0527l mo1533M(int i10, byte[] bArr) {
        write(bArr, 0, i10);
        return this;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: N */
    public final /* bridge */ /* synthetic */ InterfaceC0527l mo1534N(String str) {
        H0(str);
        return this;
    }

    /* renamed from: P */
    public final long m1589P(C0529n targetBytes) {
        int i10;
        int i11;
        AbstractC4154l.m8923f(targetBytes, "targetBytes");
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            return -1L;
        }
        long j6 = this.f3638b;
        long j10 = 0;
        if (j6 < 0) {
            while (j6 > 0) {
                e0Var = e0Var.f3613g;
                AbstractC4154l.m8920c(e0Var);
                j6 -= e0Var.f3609c - e0Var.f3608b;
            }
            if (targetBytes.mo1563d() == 2) {
                byte bMo1567i = targetBytes.mo1567i(0);
                byte bMo1567i2 = targetBytes.mo1567i(1);
                while (j6 < this.f3638b) {
                    byte[] bArr = e0Var.f3607a;
                    i10 = (int) ((e0Var.f3608b + j10) - j6);
                    int i12 = e0Var.f3609c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bMo1567i || b10 == bMo1567i2) {
                            i11 = e0Var.f3608b;
                        } else {
                            i10++;
                        }
                    }
                    j10 = (e0Var.f3609c - e0Var.f3608b) + j6;
                    e0Var = e0Var.f3612f;
                    AbstractC4154l.m8920c(e0Var);
                    j6 = j10;
                }
                return -1L;
            }
            byte[] bArrMo1566h = targetBytes.mo1566h();
            while (j6 < this.f3638b) {
                byte[] bArr2 = e0Var.f3607a;
                i10 = (int) ((e0Var.f3608b + j10) - j6);
                int i13 = e0Var.f3609c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrMo1566h) {
                        if (b11 == b12) {
                            i11 = e0Var.f3608b;
                        }
                    }
                    i10++;
                }
                j10 = (e0Var.f3609c - e0Var.f3608b) + j6;
                e0Var = e0Var.f3612f;
                AbstractC4154l.m8920c(e0Var);
                j6 = j10;
            }
            return -1L;
        }
        j6 = 0;
        while (true) {
            long j11 = (e0Var.f3609c - e0Var.f3608b) + j6;
            if (j11 > 0) {
                break;
            }
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j6 = j11;
        }
        if (targetBytes.mo1563d() == 2) {
            byte bMo1567i3 = targetBytes.mo1567i(0);
            byte bMo1567i4 = targetBytes.mo1567i(1);
            while (j6 < this.f3638b) {
                byte[] bArr3 = e0Var.f3607a;
                i10 = (int) ((e0Var.f3608b + j10) - j6);
                int i14 = e0Var.f3609c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bMo1567i3 || b13 == bMo1567i4) {
                        i11 = e0Var.f3608b;
                    } else {
                        i10++;
                    }
                }
                j10 = (e0Var.f3609c - e0Var.f3608b) + j6;
                e0Var = e0Var.f3612f;
                AbstractC4154l.m8920c(e0Var);
                j6 = j10;
            }
            return -1L;
        }
        byte[] bArrMo1566h2 = targetBytes.mo1566h();
        while (j6 < this.f3638b) {
            byte[] bArr4 = e0Var.f3607a;
            i10 = (int) ((e0Var.f3608b + j10) - j6);
            int i15 = e0Var.f3609c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrMo1566h2) {
                    if (b14 == b15) {
                        i11 = e0Var.f3608b;
                    }
                }
                i10++;
            }
            j10 = (e0Var.f3609c - e0Var.f3608b) + j6;
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
            j6 = j10;
        }
        return -1L;
        return (i10 - i11) + j6;
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: Q */
    public final String mo1543Q(Charset charset) {
        AbstractC4154l.m8923f(charset, "charset");
        return a0(this.f3638b, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1590R(b00.C0529n r22) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.C0526k.m1590R(b00.n):boolean");
    }

    /* renamed from: S */
    public final byte[] m1591S(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(a1.m14330j("byteCount: ", j6).toString());
        }
        if (this.f3638b < j6) {
            throw new EOFException();
        }
        int i10 = (int) j6;
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        return bArr;
    }

    /* renamed from: U */
    public final short m1592U() throws EOFException {
        short s5 = readShort();
        return (short) (((s5 & 255) << 8) | ((65280 & s5) >>> 8));
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: V */
    public final /* bridge */ /* synthetic */ InterfaceC0527l mo1535V(long j6) {
        D0(j6);
        return this;
    }

    public final String a0(long j6, Charset charset) throws EOFException {
        AbstractC4154l.m8923f(charset, "charset");
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(a1.m14330j("byteCount: ", j6).toString());
        }
        if (this.f3638b < j6) {
            throw new EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        int i10 = e0Var.f3608b;
        if (i10 + j6 > e0Var.f3609c) {
            return new String(m1591S(j6), charset);
        }
        int i11 = (int) j6;
        String str = new String(e0Var.f3607a, i10, i11, charset);
        int i12 = e0Var.f3608b + i11;
        e0Var.f3608b = i12;
        this.f3638b -= j6;
        if (i12 == e0Var.f3609c) {
            this.f3637a = e0Var.m1552a();
            f0.m1559a(e0Var);
        }
        return str;
    }

    @Override // b00.InterfaceC0528m
    public final String b0() {
        return mo1541C(Long.MAX_VALUE);
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: e */
    public final boolean mo1545e() {
        return this.f3638b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0526k)) {
            return false;
        }
        long j6 = this.f3638b;
        C0526k c0526k = (C0526k) obj;
        if (j6 != c0526k.f3638b) {
            return false;
        }
        if (j6 == 0) {
            return true;
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        e0 e0Var2 = c0526k.f3637a;
        AbstractC4154l.m8920c(e0Var2);
        int i10 = e0Var.f3608b;
        int i11 = e0Var2.f3608b;
        long j10 = 0;
        while (j10 < this.f3638b) {
            long jMin = Math.min(e0Var.f3609c - i10, e0Var2.f3609c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (e0Var.f3607a[i10] != e0Var2.f3607a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == e0Var.f3609c) {
                e0Var = e0Var.f3612f;
                AbstractC4154l.m8920c(e0Var);
                i10 = e0Var.f3608b;
            }
            if (i11 == e0Var2.f3609c) {
                e0Var2 = e0Var2.f3612f;
                AbstractC4154l.m8920c(e0Var2);
                i11 = e0Var2.f3608b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // b00.i0
    /* renamed from: f */
    public final k0 mo1532f() {
        return k0.f3639d;
    }

    public final void f0(C0523h unsafeCursor) {
        AbstractC4154l.m8923f(unsafeCursor, "unsafeCursor");
        byte[] bArr = AbstractC0834a.f5296a;
        if (unsafeCursor == AbstractC0517b.f3587a) {
            unsafeCursor = new C0523h();
        }
        if (unsafeCursor.f3627a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f3627a = this;
    }

    @Override // b00.i0
    public final long g0(C0526k sink, long j6) {
        AbstractC4154l.m8923f(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("byteCount < 0: ", j6).toString());
        }
        long j10 = this.f3638b;
        if (j10 == 0) {
            return -1L;
        }
        if (j6 > j10) {
            j6 = j10;
        }
        sink.h0(this, j6);
        return j6;
    }

    @Override // b00.h0
    public final void h0(C0526k source, long j6) {
        e0 e0VarM1560b;
        AbstractC4154l.m8923f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0517b.m1526e(source.f3638b, 0L, j6);
        while (j6 > 0) {
            e0 e0Var = source.f3637a;
            AbstractC4154l.m8920c(e0Var);
            int i10 = e0Var.f3609c;
            e0 e0Var2 = source.f3637a;
            AbstractC4154l.m8920c(e0Var2);
            long j10 = i10 - e0Var2.f3608b;
            int i11 = 0;
            if (j6 < j10) {
                e0 e0Var3 = this.f3637a;
                e0 e0Var4 = e0Var3 != null ? e0Var3.f3613g : null;
                if (e0Var4 != null && e0Var4.f3611e) {
                    if ((e0Var4.f3609c + j6) - (e0Var4.f3610d ? 0 : e0Var4.f3608b) <= 8192) {
                        e0 e0Var5 = source.f3637a;
                        AbstractC4154l.m8920c(e0Var5);
                        e0Var5.m1555d(e0Var4, (int) j6);
                        source.f3638b -= j6;
                        this.f3638b += j6;
                        return;
                    }
                }
                e0 e0Var6 = source.f3637a;
                AbstractC4154l.m8920c(e0Var6);
                int i12 = (int) j6;
                if (i12 <= 0 || i12 > e0Var6.f3609c - e0Var6.f3608b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    e0VarM1560b = e0Var6.m1554c();
                } else {
                    e0VarM1560b = f0.m1560b();
                    byte[] bArr = e0Var6.f3607a;
                    byte[] bArr2 = e0VarM1560b.f3607a;
                    int i13 = e0Var6.f3608b;
                    AbstractC6662l.m12721k(i13, bArr, i13 + i12, bArr2, 2);
                }
                e0VarM1560b.f3609c = e0VarM1560b.f3608b + i12;
                e0Var6.f3608b += i12;
                e0 e0Var7 = e0Var6.f3613g;
                AbstractC4154l.m8920c(e0Var7);
                e0Var7.m1553b(e0VarM1560b);
                source.f3637a = e0VarM1560b;
            }
            e0 e0Var8 = source.f3637a;
            AbstractC4154l.m8920c(e0Var8);
            long j11 = e0Var8.f3609c - e0Var8.f3608b;
            source.f3637a = e0Var8.m1552a();
            e0 e0Var9 = this.f3637a;
            if (e0Var9 == null) {
                this.f3637a = e0Var8;
                e0Var8.f3613g = e0Var8;
                e0Var8.f3612f = e0Var8;
            } else {
                e0 e0Var10 = e0Var9.f3613g;
                AbstractC4154l.m8920c(e0Var10);
                e0Var10.m1553b(e0Var8);
                e0 e0Var11 = e0Var8.f3613g;
                if (e0Var11 == e0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC4154l.m8920c(e0Var11);
                if (e0Var11.f3611e) {
                    int i14 = e0Var8.f3609c - e0Var8.f3608b;
                    e0 e0Var12 = e0Var8.f3613g;
                    AbstractC4154l.m8920c(e0Var12);
                    int i15 = 8192 - e0Var12.f3609c;
                    e0 e0Var13 = e0Var8.f3613g;
                    AbstractC4154l.m8920c(e0Var13);
                    if (!e0Var13.f3610d) {
                        e0 e0Var14 = e0Var8.f3613g;
                        AbstractC4154l.m8920c(e0Var14);
                        i11 = e0Var14.f3608b;
                    }
                    if (i14 <= i15 + i11) {
                        e0 e0Var15 = e0Var8.f3613g;
                        AbstractC4154l.m8920c(e0Var15);
                        e0Var8.m1555d(e0Var15, i14);
                        e0Var8.m1552a();
                        f0.m1559a(e0Var8);
                    }
                }
            }
            source.f3638b -= j11;
            this.f3638b += j11;
            j6 -= j11;
        }
    }

    public final int hashCode() {
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = e0Var.f3609c;
            for (int i12 = e0Var.f3608b; i12 < i11; i12++) {
                i10 = (i10 * 31) + e0Var.f3607a[i12];
            }
            e0Var = e0Var.f3612f;
            AbstractC4154l.m8920c(e0Var);
        } while (e0Var != this.f3637a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // b00.InterfaceC0527l
    public final long j0(i0 source) {
        AbstractC4154l.m8923f(source, "source");
        long j6 = 0;
        while (true) {
            long jG0 = source.g0(this, 8192L);
            if (jG0 == -1) {
                return j6;
            }
            j6 += jG0;
        }
    }

    @Override // b00.InterfaceC0528m
    public final long l0(InterfaceC0527l interfaceC0527l) {
        long j6 = this.f3638b;
        if (j6 > 0) {
            interfaceC0527l.h0(this, j6);
        }
        return j6;
    }

    /* renamed from: n */
    public final void m1593n() throws EOFException {
        skip(this.f3638b);
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: o */
    public final C0529n mo1549o(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(a1.m14330j("byteCount: ", j6).toString());
        }
        if (this.f3638b < j6) {
            throw new EOFException();
        }
        if (j6 < 4096) {
            return new C0529n(m1591S(j6));
        }
        C0529n c0529nV0 = v0((int) j6);
        skip(j6);
        return c0529nV0;
    }

    public final String o0() {
        return a0(this.f3638b, AbstractC5163a.f25245a);
    }

    @Override // b00.InterfaceC0527l
    public final /* bridge */ /* synthetic */ InterfaceC0527l p0(C0529n c0529n) {
        A0(c0529n);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC4154l.m8923f(sink, "sink");
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), e0Var.f3609c - e0Var.f3608b);
        sink.put(e0Var.f3607a, e0Var.f3608b, iMin);
        int i10 = e0Var.f3608b + iMin;
        e0Var.f3608b = i10;
        this.f3638b -= iMin;
        if (i10 == e0Var.f3609c) {
            this.f3637a = e0Var.m1552a();
            f0.m1559a(e0Var);
        }
        return iMin;
    }

    @Override // b00.InterfaceC0528m
    public final byte readByte() throws EOFException {
        if (this.f3638b == 0) {
            throw new EOFException();
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        int i10 = e0Var.f3608b;
        int i11 = e0Var.f3609c;
        int i12 = i10 + 1;
        byte b10 = e0Var.f3607a[i10];
        this.f3638b--;
        if (i12 != i11) {
            e0Var.f3608b = i12;
            return b10;
        }
        this.f3637a = e0Var.m1552a();
        f0.m1559a(e0Var);
        return b10;
    }

    @Override // b00.InterfaceC0528m
    public final int readInt() throws EOFException {
        if (this.f3638b < 4) {
            throw new EOFException();
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        int i10 = e0Var.f3608b;
        int i11 = e0Var.f3609c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = e0Var.f3607a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f3638b -= 4;
        if (i14 != i11) {
            e0Var.f3608b = i14;
            return i15;
        }
        this.f3637a = e0Var.m1552a();
        f0.m1559a(e0Var);
        return i15;
    }

    @Override // b00.InterfaceC0528m
    public final short readShort() throws EOFException {
        if (this.f3638b < 2) {
            throw new EOFException();
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        int i10 = e0Var.f3608b;
        int i11 = e0Var.f3609c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = e0Var.f3607a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f3638b -= 2;
        if (i14 == i11) {
            this.f3637a = e0Var.m1552a();
            f0.m1559a(e0Var);
        } else {
            e0Var.f3608b = i14;
        }
        return (short) i15;
    }

    @Override // b00.InterfaceC0528m
    public final boolean request(long j6) {
        return this.f3638b >= j6;
    }

    @Override // b00.InterfaceC0528m
    public final void s0(long j6) throws EOFException {
        if (this.f3638b < j6) {
            throw new EOFException();
        }
    }

    @Override // b00.InterfaceC0528m
    public final void skip(long j6) throws EOFException {
        while (j6 > 0) {
            e0 e0Var = this.f3637a;
            if (e0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j6, e0Var.f3609c - e0Var.f3608b);
            long j10 = iMin;
            this.f3638b -= j10;
            j6 -= j10;
            int i10 = e0Var.f3608b + iMin;
            e0Var.f3608b = i10;
            if (i10 == e0Var.f3609c) {
                this.f3637a = e0Var.m1552a();
                f0.m1559a(e0Var);
            }
        }
    }

    public final int t0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (this.f3638b == 0) {
            throw new EOFException();
        }
        byte bM1587H = m1587H(0L);
        if ((bM1587H & 128) == 0) {
            i10 = bM1587H & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bM1587H & 224) == 192) {
            i10 = bM1587H & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bM1587H & 240) == 224) {
            i10 = bM1587H & 15;
            i11 = 3;
            i12 = NewHope.SENDB_BYTES;
        } else {
            if ((bM1587H & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bM1587H & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j6 = i11;
        if (this.f3638b < j6) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i11, "size < ", ": ");
            sbM4567n.append(this.f3638b);
            sbM4567n.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC0835b.f5298a;
            sbM4567n.append(new String(new char[]{cArr[(bM1587H >> 4) & 15], cArr[bM1587H & 15]}));
            sbM4567n.append(')');
            throw new EOFException(sbM4567n.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j10 = i13;
            byte bM1587H2 = m1587H(j10);
            if ((bM1587H2 & 192) != 128) {
                skip(j10);
                return 65533;
            }
            i10 = (i10 << 6) | (bM1587H2 & 63);
        }
        skip(j6);
        if (i10 <= 1114111 && ((55296 > i10 || i10 >= 57344) && i10 >= i12)) {
            return i10;
        }
        return 65533;
    }

    public final String toString() {
        long j6 = this.f3638b;
        if (j6 <= 2147483647L) {
            return v0((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3638b).toString());
    }

    public final C0529n v0(int i10) {
        if (i10 == 0) {
            return C0529n.f3647d;
        }
        AbstractC0517b.m1526e(this.f3638b, 0L, i10);
        e0 e0Var = this.f3637a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC4154l.m8920c(e0Var);
            int i14 = e0Var.f3609c;
            int i15 = e0Var.f3608b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            e0Var = e0Var.f3612f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        e0 e0Var2 = this.f3637a;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC4154l.m8920c(e0Var2);
            bArr[i16] = e0Var2.f3607a;
            i11 += e0Var2.f3609c - e0Var2.f3608b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = e0Var2.f3608b;
            e0Var2.f3610d = true;
            i16++;
            e0Var2 = e0Var2.f3612f;
        }
        return new g0(bArr, iArr);
    }

    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C0526k clone() {
        C0526k c0526k = new C0526k();
        if (this.f3638b == 0) {
            return c0526k;
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        e0 e0VarM1554c = e0Var.m1554c();
        c0526k.f3637a = e0VarM1554c;
        e0VarM1554c.f3613g = e0VarM1554c;
        e0VarM1554c.f3612f = e0VarM1554c;
        for (e0 e0Var2 = e0Var.f3612f; e0Var2 != e0Var; e0Var2 = e0Var2.f3612f) {
            e0 e0Var3 = e0VarM1554c.f3613g;
            AbstractC4154l.m8920c(e0Var3);
            AbstractC4154l.m8920c(e0Var2);
            e0Var3.m1553b(e0Var2.m1554c());
        }
        c0526k.f3638b = this.f3638b;
        return c0526k;
    }

    public final e0 w0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            e0 e0VarM1560b = f0.m1560b();
            this.f3637a = e0VarM1560b;
            e0VarM1560b.f3613g = e0VarM1560b;
            e0VarM1560b.f3612f = e0VarM1560b;
            return e0VarM1560b;
        }
        e0 e0Var2 = e0Var.f3613g;
        AbstractC4154l.m8920c(e0Var2);
        if (e0Var2.f3609c + i10 <= 8192 && e0Var2.f3611e) {
            return e0Var2;
        }
        e0 e0VarM1560b2 = f0.m1560b();
        e0Var2.m1553b(e0VarM1560b2);
        return e0VarM1560b2;
    }

    @Override // b00.InterfaceC0527l
    public final InterfaceC0527l write(byte[] source) {
        AbstractC4154l.m8923f(source, "source");
        write(source, 0, source.length);
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final /* bridge */ /* synthetic */ InterfaceC0527l writeByte(int i10) {
        B0(i10);
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final /* bridge */ /* synthetic */ InterfaceC0527l writeInt(int i10) {
        E0(i10);
        return this;
    }

    @Override // b00.InterfaceC0527l
    public final /* bridge */ /* synthetic */ InterfaceC0527l writeShort(int i10) {
        F0(i10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // b00.InterfaceC0528m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long x0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f3638b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            b00.e0 r7 = r15.f3637a
            kotlin.jvm.internal.AbstractC4154l.m8920c(r7)
            byte[] r8 = r7.f3607a
            int r9 = r7.f3608b
            int r10 = r7.f3609c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            b00.k r0 = new b00.k
            r0.<init>()
            r0.D0(r4)
            r0.B0(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.o0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = c00.AbstractC0835b.f5298a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            b00.e0 r8 = r7.m1552a()
            r15.f3637a = r8
            b00.f0.m1559a(r7)
            goto L9c
        L9a:
            r7.f3608b = r9
        L9c:
            if (r6 != 0) goto La2
            b00.e0 r7 = r15.f3637a
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f3638b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f3638b = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.C0526k.x0():long");
    }

    /* renamed from: z */
    public final long m1595z() {
        long j6 = this.f3638b;
        if (j6 == 0) {
            return 0L;
        }
        e0 e0Var = this.f3637a;
        AbstractC4154l.m8920c(e0Var);
        e0 e0Var2 = e0Var.f3613g;
        AbstractC4154l.m8920c(e0Var2);
        return (e0Var2.f3609c >= 8192 || !e0Var2.f3611e) ? j6 : j6 - (r3 - e0Var2.f3608b);
    }

    @Override // b00.InterfaceC0528m
    public final InputStream z0() {
        return new C0524i(this, 0);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC4154l.m8923f(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            e0 e0VarW0 = w0(1);
            int iMin = Math.min(i10, 8192 - e0VarW0.f3609c);
            source.get(e0VarW0.f3607a, e0VarW0.f3609c, iMin);
            i10 -= iMin;
            e0VarW0.f3609c += iMin;
        }
        this.f3638b += iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC0517b.m1526e(bArr.length, i10, i11);
        e0 e0Var = this.f3637a;
        if (e0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, e0Var.f3609c - e0Var.f3608b);
        byte[] bArr2 = e0Var.f3607a;
        int i12 = e0Var.f3608b;
        AbstractC6662l.m12716f(i10, bArr2, i12, bArr, i12 + iMin);
        int i13 = e0Var.f3608b + iMin;
        e0Var.f3608b = i13;
        this.f3638b -= iMin;
        if (i13 == e0Var.f3609c) {
            this.f3637a = e0Var.m1552a();
            f0.m1559a(e0Var);
        }
        return iMin;
    }

    public final void write(byte[] source, int i10, int i11) {
        AbstractC4154l.m8923f(source, "source");
        long j6 = i11;
        AbstractC0517b.m1526e(source.length, i10, j6);
        int i12 = i11 + i10;
        while (i10 < i12) {
            e0 e0VarW0 = w0(1);
            int iMin = Math.min(i12 - i10, 8192 - e0VarW0.f3609c);
            int i13 = i10 + iMin;
            AbstractC6662l.m12716f(e0VarW0.f3609c, source, i10, e0VarW0.f3607a, i13);
            e0VarW0.f3609c += iMin;
            i10 = i13;
        }
        this.f3638b += j6;
    }

    @Override // b00.InterfaceC0528m
    /* renamed from: a */
    public final C0526k mo1544a() {
        return this;
    }

    @Override // b00.InterfaceC0527l
    /* renamed from: c */
    public final InterfaceC0527l mo1537c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, b00.h0
    public final void close() {
    }

    @Override // b00.InterfaceC0527l, b00.h0, java.io.Flushable
    public final void flush() {
    }
}
