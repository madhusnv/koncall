package net.schmizz.sshj.common;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.Arrays;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5022b {

    /* renamed from: d */
    public static final BigInteger f24774d;

    /* renamed from: a */
    public byte[] f24775a;

    /* renamed from: b */
    public int f24776b;

    /* renamed from: c */
    public int f24777c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        f24774d = bigInteger.shiftLeft(64).subtract(bigInteger);
    }

    public AbstractC5022b() {
        this(new byte[m9906e(256)], false);
    }

    /* renamed from: e */
    public static int m9906e(int i10) {
        int i11 = 1;
        while (i11 < i10) {
            i11 <<= 1;
            if (i11 <= 0) {
                throw new IllegalArgumentException(AbstractC5601a.m11232c(i10, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i11;
    }

    /* renamed from: a */
    public final int m9907a() {
        return this.f24777c - this.f24776b;
    }

    /* renamed from: b */
    public final void m9908b(int i10) throws Buffer$BufferException {
        if (m9907a() < i10) {
            throw new Buffer$BufferException("Underflow");
        }
    }

    /* renamed from: c */
    public final void m9909c(int i10) {
        int length = this.f24775a.length;
        int i11 = this.f24777c;
        if (length - i11 < i10) {
            byte[] bArr = new byte[m9906e(i11 + i10)];
            byte[] bArr2 = this.f24775a;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f24775a = bArr;
        }
    }

    /* renamed from: d */
    public final byte[] m9910d() {
        int iM9907a = m9907a();
        if (iM9907a <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM9907a];
        System.arraycopy(this.f24775a, this.f24776b, bArr, 0, iM9907a);
        return bArr;
    }

    /* renamed from: f */
    public final void m9911f(byte b10) {
        m9909c(1);
        byte[] bArr = this.f24775a;
        int i10 = this.f24777c;
        this.f24777c = i10 + 1;
        bArr[i10] = b10;
    }

    /* renamed from: g */
    public final void m9912g(int i10, byte[] bArr) {
        m9918m(i10);
        m9914i(0, i10, bArr);
    }

    /* renamed from: h */
    public final void m9913h(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        m9918m(byteArray.length);
        m9914i(0, byteArray.length, byteArray);
    }

    /* renamed from: i */
    public final void m9914i(int i10, int i11, byte[] bArr) {
        m9909c(i11);
        System.arraycopy(bArr, i10, this.f24775a, this.f24777c, i11);
        this.f24777c += i11;
    }

    /* renamed from: j */
    public final void m9915j(char[] cArr) {
        if (cArr == null) {
            byte[] bytes = "".getBytes(StandardCharsets.UTF_8);
            m9912g(bytes.length, bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) (charsetEncoderNewEncoder.maxBytesPerChar() * cArr.length));
        charsetEncoderNewEncoder.encode(CharBuffer.wrap(cArr), byteBufferAllocate, true);
        Arrays.fill(cArr, ' ');
        int iPosition = byteBufferAllocate.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBufferAllocate.array(), 0, bArr, 0, iPosition);
        Arrays.fill(byteBufferAllocate.array(), (byte) 0);
        m9918m(iPosition);
        m9909c(iPosition);
        for (int i10 = 0; i10 < iPosition; i10++) {
            byte b10 = bArr[i10];
            byte[] bArr2 = this.f24775a;
            int i11 = this.f24777c;
            this.f24777c = i11 + 1;
            bArr2[i11] = b10;
        }
        Arrays.fill(bArr, (byte) 0);
    }

    /* renamed from: k */
    public final void m9916k(String str) {
        m9917l(str, StandardCharsets.UTF_8);
    }

    /* renamed from: l */
    public final void m9917l(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        m9912g(bytes.length, bytes);
    }

    /* renamed from: m */
    public final void m9918m(long j6) {
        m9909c(4);
        if (j6 < 0 || j6 > 4294967295L) {
            throw new IllegalArgumentException(a1.m14330j("Invalid value: ", j6));
        }
        byte[] bArr = this.f24775a;
        int i10 = this.f24777c;
        int i11 = i10 + 1;
        this.f24777c = i11;
        bArr[i10] = (byte) (j6 >> 24);
        int i12 = i10 + 2;
        this.f24777c = i12;
        bArr[i11] = (byte) (j6 >> 16);
        int i13 = i10 + 3;
        this.f24777c = i13;
        bArr[i12] = (byte) (j6 >> 8);
        this.f24777c = i10 + 4;
        bArr[i13] = (byte) j6;
    }

    /* renamed from: n */
    public final void m9919n(int i10) {
        m9909c(4);
        byte[] bArr = this.f24775a;
        int i11 = this.f24777c;
        int i12 = i11 + 1;
        this.f24777c = i12;
        bArr[i11] = (byte) (i10 >> 24);
        int i13 = i11 + 2;
        this.f24777c = i13;
        bArr[i12] = (byte) (i10 >> 16);
        int i14 = i11 + 3;
        this.f24777c = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this.f24777c = i11 + 4;
        bArr[i14] = (byte) i10;
    }

    /* renamed from: o */
    public final void m9920o(long j6) {
        if (j6 < 0) {
            throw new IllegalArgumentException(a1.m14330j("Invalid value: ", j6));
        }
        m9922q(j6);
    }

    /* renamed from: p */
    public final void m9921p(BigInteger bigInteger) {
        if (bigInteger.compareTo(f24774d) <= 0 && bigInteger.compareTo(BigInteger.ZERO) >= 0) {
            m9922q(bigInteger.longValue());
        } else {
            throw new IllegalArgumentException("Invalid value: " + bigInteger);
        }
    }

    /* renamed from: q */
    public final void m9922q(long j6) {
        m9909c(8);
        byte[] bArr = this.f24775a;
        int i10 = this.f24777c;
        int i11 = i10 + 1;
        this.f24777c = i11;
        bArr[i10] = (byte) (j6 >> 56);
        int i12 = i10 + 2;
        this.f24777c = i12;
        bArr[i11] = (byte) (j6 >> 48);
        int i13 = i10 + 3;
        this.f24777c = i13;
        bArr[i12] = (byte) (j6 >> 40);
        int i14 = i10 + 4;
        this.f24777c = i14;
        bArr[i13] = (byte) (j6 >> 32);
        int i15 = i10 + 5;
        this.f24777c = i15;
        bArr[i14] = (byte) (j6 >> 24);
        int i16 = i10 + 6;
        this.f24777c = i16;
        bArr[i15] = (byte) (j6 >> 16);
        int i17 = i10 + 7;
        this.f24777c = i17;
        bArr[i16] = (byte) (j6 >> 8);
        this.f24777c = i10 + 8;
        bArr[i17] = (byte) j6;
    }

    /* renamed from: r */
    public final boolean m9923r() {
        return m9924s() != 0;
    }

    /* renamed from: s */
    public final byte m9924s() throws Buffer$BufferException {
        m9908b(1);
        byte[] bArr = this.f24775a;
        int i10 = this.f24776b;
        this.f24776b = i10 + 1;
        return bArr[i10];
    }

    /* renamed from: t */
    public final byte[] m9925t() throws Buffer$BufferException {
        int iM9930y = (int) m9930y();
        if (iM9930y < 0 || iM9930y > 32768) {
            throw new Buffer$BufferException(AbstractC4801l.m9730d(iM9930y, "Bad item length: "));
        }
        byte[] bArr = new byte[iM9930y];
        m9928w(bArr);
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Buffer [rpos=");
        sb2.append(this.f24776b);
        sb2.append(", wpos=");
        sb2.append(this.f24777c);
        sb2.append(", size=");
        return AbstractC5601a.m11233d(this.f24775a.length, "]", sb2);
    }

    /* renamed from: u */
    public final BigInteger m9926u() {
        return new BigInteger(m9925t());
    }

    /* renamed from: v */
    public final PublicKey m9927v() throws Buffer$BufferException {
        EnumC5031k enumC5031kFromString = EnumC5031k.fromString(m9929x());
        try {
            return enumC5031kFromString.readPubKeyFromBuffer(this);
        } catch (UnsupportedOperationException unused) {
            throw new Buffer$BufferException("Could not decode keytype " + enumC5031kFromString);
        } catch (GeneralSecurityException e2) {
            throw new SSHRuntimeException(e2.getMessage(), e2);
        }
    }

    /* renamed from: w */
    public final void m9928w(byte[] bArr) throws Buffer$BufferException {
        int length = bArr.length;
        m9908b(length);
        System.arraycopy(this.f24775a, this.f24776b, bArr, 0, length);
        this.f24776b += length;
    }

    /* renamed from: x */
    public final String m9929x() throws Buffer$BufferException {
        Charset charset = StandardCharsets.UTF_8;
        int iM9930y = (int) m9930y();
        if (iM9930y < 0 || iM9930y > 32768) {
            throw new Buffer$BufferException(AbstractC4801l.m9730d(iM9930y, "Bad item length: "));
        }
        m9908b(iM9930y);
        String str = new String(this.f24775a, this.f24776b, iM9930y, charset);
        this.f24776b += iM9930y;
        return str;
    }

    /* renamed from: y */
    public final long m9930y() throws Buffer$BufferException {
        m9908b(4);
        byte[] bArr = this.f24775a;
        int i10 = this.f24776b;
        this.f24776b = i10 + 1;
        this.f24776b = i10 + 2;
        this.f24776b = i10 + 3;
        long j6 = ((bArr[i10] << 24) & 4278190080L) | ((bArr[r3] << 16) & 16711680) | ((bArr[r6] << 8) & 65280);
        this.f24776b = i10 + 4;
        return (bArr[r5] & 255) | j6;
    }

    /* renamed from: z */
    public final void m9931z(int i10) {
        m9909c(i10 - this.f24777c);
        this.f24777c = i10;
    }

    public AbstractC5022b(byte[] bArr, boolean z6) {
        this.f24775a = bArr;
        this.f24776b = 0;
        this.f24777c = z6 ? bArr.length : 0;
    }
}
