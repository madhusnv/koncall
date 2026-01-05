package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes.dex */
public final class C0314i extends AbstractC0315j {

    /* renamed from: c */
    public final FileInputStream f2344c;

    /* renamed from: d */
    public final byte[] f2345d;

    /* renamed from: e */
    public int f2346e;

    /* renamed from: f */
    public int f2347f;

    /* renamed from: g */
    public int f2348g;

    /* renamed from: h */
    public int f2349h;

    /* renamed from: j */
    public int f2350j;

    /* renamed from: k */
    public int f2351k = Integer.MAX_VALUE;

    public C0314i(FileInputStream fileInputStream) {
        Charset charset = b0.f2293a;
        this.f2344c = fileInputStream;
        this.f2345d = new byte[4096];
        this.f2346e = 0;
        this.f2348g = 0;
        this.f2350j = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: A */
    public final int mo873A() {
        return m915J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: B */
    public final long mo874B() {
        return m916K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: C */
    public final boolean mo875C(int i10) throws InvalidProtocolBufferException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                m920O(8);
                return true;
            }
            if (i11 == 2) {
                m920O(m915J());
                return true;
            }
            if (i11 == 3) {
                m924D();
                mo883a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.m804b();
            }
            m920O(4);
            return true;
        }
        int i13 = this.f2346e - this.f2348g;
        byte[] bArr = this.f2345d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f2348g;
                this.f2348g = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw InvalidProtocolBufferException.m805c();
        }
        while (i12 < 10) {
            if (this.f2348g == this.f2346e) {
                m919N(1);
            }
            int i15 = this.f2348g;
            this.f2348g = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw InvalidProtocolBufferException.m805c();
        return true;
    }

    /* renamed from: E */
    public final byte[] m910E(int i10) throws IOException {
        byte[] bArrM911F = m911F(i10);
        if (bArrM911F != null) {
            return bArrM911F;
        }
        int i11 = this.f2348g;
        int i12 = this.f2346e;
        int length = i12 - i11;
        this.f2350j += i12;
        this.f2348g = 0;
        this.f2346e = 0;
        ArrayList arrayListM912G = m912G(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f2345d, i11, bArr, 0, length);
        int size = arrayListM912G.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListM912G.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: F */
    public final byte[] m911F(int i10) throws IOException {
        if (i10 == 0) {
            return b0.f2294b;
        }
        if (i10 < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        int i11 = this.f2350j;
        int i12 = this.f2348g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f2351k;
        if (i13 > i14) {
            m920O((i14 - i11) - i12);
            throw InvalidProtocolBufferException.m807e();
        }
        int i15 = this.f2346e - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.f2344c;
        if (i16 >= 4096) {
            try {
                if (i16 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e2) {
                e2.f2291a = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f2345d, this.f2348g, bArr, 0, i15);
        this.f2350j += this.f2346e;
        this.f2348g = 0;
        this.f2346e = 0;
        while (i15 < i10) {
            try {
                int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.m807e();
                }
                this.f2350j += i17;
                i15 += i17;
            } catch (InvalidProtocolBufferException e10) {
                e10.f2291a = true;
                throw e10;
            }
        }
        return bArr;
    }

    /* renamed from: G */
    public final ArrayList m912G(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f2344c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.m807e();
                }
                this.f2350j += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: H */
    public final int m913H() throws InvalidProtocolBufferException {
        int i10 = this.f2348g;
        if (this.f2346e - i10 < 4) {
            m919N(4);
            i10 = this.f2348g;
        }
        this.f2348g = i10 + 4;
        byte[] bArr = this.f2345d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: I */
    public final long m914I() throws InvalidProtocolBufferException {
        int i10 = this.f2348g;
        if (this.f2346e - i10 < 8) {
            m919N(8);
            i10 = this.f2348g;
        }
        this.f2348g = i10 + 8;
        byte[] bArr = this.f2345d;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* renamed from: J */
    public final int m915J() {
        int i10;
        int i11 = this.f2348g;
        int i12 = this.f2346e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f2345d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f2348g = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f2348g = i14;
                return i10;
            }
        }
        return (int) m917L();
    }

    /* renamed from: K */
    public final long m916K() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f2348g;
        int i11 = this.f2346e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2345d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f2348g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j6 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (bArr[i17] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (bArr[i13] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (bArr[i17] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (bArr[i13] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j6 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j6 = j11 ^ j14;
                        }
                        i13 = i17;
                        j6 = j12;
                    }
                }
                this.f2348g = i13;
                return j6;
            }
        }
        return m917L();
    }

    /* renamed from: L */
    public final long m917L() throws InvalidProtocolBufferException {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f2348g == this.f2346e) {
                m919N(1);
            }
            int i11 = this.f2348g;
            this.f2348g = i11 + 1;
            j6 |= (r3 & 127) << i10;
            if ((this.f2345d[i11] & 128) == 0) {
                return j6;
            }
        }
        throw InvalidProtocolBufferException.m805c();
    }

    /* renamed from: M */
    public final void m918M() {
        int i10 = this.f2346e + this.f2347f;
        this.f2346e = i10;
        int i11 = this.f2350j + i10;
        int i12 = this.f2351k;
        if (i11 <= i12) {
            this.f2347f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f2347f = i13;
        this.f2346e = i10 - i13;
    }

    /* renamed from: N */
    public final void m919N(int i10) throws InvalidProtocolBufferException {
        if (m921P(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f2350j) - this.f2348g) {
            throw InvalidProtocolBufferException.m807e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: O */
    public final void m920O(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f2346e;
        int i12 = this.f2348g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f2348g = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.f2344c;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        int i14 = this.f2350j;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f2351k;
        if (i16 > i17) {
            m920O((i17 - i14) - i12);
            throw InvalidProtocolBufferException.m807e();
        }
        this.f2350j = i15;
        this.f2346e = 0;
        this.f2348g = 0;
        while (i13 < i10) {
            long j6 = i10 - i13;
            try {
                try {
                    long jSkip = fileInputStream.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.f2291a = true;
                    throw e2;
                }
            } catch (Throwable th2) {
                this.f2350j += i13;
                m918M();
                throw th2;
            }
        }
        this.f2350j += i13;
        m918M();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f2346e;
        int i19 = i18 - this.f2348g;
        this.f2348g = i18;
        m919N(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f2346e;
            if (i20 <= i21) {
                this.f2348g = i20;
                return;
            } else {
                i19 += i21;
                this.f2348g = i21;
                m919N(1);
            }
        }
    }

    /* renamed from: P */
    public final boolean m921P(int i10) throws IOException {
        FileInputStream fileInputStream = this.f2344c;
        int i11 = this.f2348g;
        int i12 = i11 + i10;
        int i13 = this.f2346e;
        if (i12 <= i13) {
            throw new IllegalStateException(AbstractC5601a.m11232c(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f2350j;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f2351k) {
            byte[] bArr = this.f2345d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f2350j += i11;
                this.f2346e -= i11;
                this.f2348g = 0;
            }
            int i15 = this.f2346e;
            try {
                int i16 = fileInputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f2350j) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f2346e += i16;
                    m918M();
                    if (this.f2346e >= i10) {
                        return true;
                    }
                    return m921P(i10);
                }
            } catch (InvalidProtocolBufferException e2) {
                e2.f2291a = true;
                throw e2;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: a */
    public final void mo883a(int i10) throws InvalidProtocolBufferException {
        if (this.f2349h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: b */
    public final int mo884b() {
        return this.f2350j + this.f2348g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: c */
    public final boolean mo885c() {
        return this.f2348g == this.f2346e && !m921P(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: i */
    public final void mo886i(int i10) {
        this.f2351k = i10;
        m918M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: j */
    public final int mo887j(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        int i11 = this.f2350j + this.f2348g + i10;
        if (i11 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i12 = this.f2351k;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.m807e();
        }
        this.f2351k = i11;
        m918M();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: k */
    public final boolean mo888k() {
        return m916K() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: l */
    public final C0312g mo889l() throws IOException {
        int iM915J = m915J();
        int i10 = this.f2346e;
        int i11 = this.f2348g;
        int i12 = i10 - i11;
        byte[] bArr = this.f2345d;
        if (iM915J <= i12 && iM915J > 0) {
            C0312g c0312gM870c = C0312g.m870c(i11, iM915J, bArr);
            this.f2348g += iM915J;
            return c0312gM870c;
        }
        if (iM915J == 0) {
            return C0312g.f2325c;
        }
        if (iM915J < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        byte[] bArrM911F = m911F(iM915J);
        if (bArrM911F != null) {
            return C0312g.m870c(0, bArrM911F.length, bArrM911F);
        }
        int i13 = this.f2348g;
        int i14 = this.f2346e;
        int length = i14 - i13;
        this.f2350j += i14;
        this.f2348g = 0;
        this.f2346e = 0;
        ArrayList arrayListM912G = m912G(iM915J - length);
        byte[] bArr2 = new byte[iM915J];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        int size = arrayListM912G.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayListM912G.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0312g c0312g = C0312g.f2325c;
        return new C0312g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: m */
    public final double mo890m() {
        return Double.longBitsToDouble(m914I());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: n */
    public final int mo891n() {
        return m915J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: o */
    public final int mo892o() {
        return m913H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: p */
    public final long mo893p() {
        return m914I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: q */
    public final float mo894q() {
        return Float.intBitsToFloat(m913H());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: r */
    public final int mo895r() {
        return m915J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: s */
    public final long mo896s() {
        return m916K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: t */
    public final int mo897t() {
        return m913H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: u */
    public final long mo898u() {
        return m914I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: v */
    public final int mo899v() {
        int iM915J = m915J();
        return (-(iM915J & 1)) ^ (iM915J >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: w */
    public final long mo900w() {
        long jM916K = m916K();
        return (-(jM916K & 1)) ^ (jM916K >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: x */
    public final String mo901x() throws InvalidProtocolBufferException {
        int iM915J = m915J();
        byte[] bArr = this.f2345d;
        if (iM915J > 0) {
            int i10 = this.f2346e;
            int i11 = this.f2348g;
            if (iM915J <= i10 - i11) {
                String str = new String(bArr, i11, iM915J, b0.f2293a);
                this.f2348g += iM915J;
                return str;
            }
        }
        if (iM915J == 0) {
            return "";
        }
        if (iM915J < 0) {
            throw InvalidProtocolBufferException.m806d();
        }
        if (iM915J > this.f2346e) {
            return new String(m910E(iM915J), b0.f2293a);
        }
        m919N(iM915J);
        String str2 = new String(bArr, this.f2348g, iM915J, b0.f2293a);
        this.f2348g += iM915J;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: y */
    public final String mo902y() throws IOException {
        int iM915J = m915J();
        int i10 = this.f2348g;
        int i11 = this.f2346e;
        int i12 = i11 - i10;
        byte[] bArrM910E = this.f2345d;
        if (iM915J <= i12 && iM915J > 0) {
            this.f2348g = i10 + iM915J;
        } else {
            if (iM915J == 0) {
                return "";
            }
            if (iM915J < 0) {
                throw InvalidProtocolBufferException.m806d();
            }
            i10 = 0;
            if (iM915J <= i11) {
                m919N(iM915J);
                this.f2348g = iM915J;
            } else {
                bArrM910E = m910E(iM915J);
            }
        }
        return q1.f2407a.m1030g(i10, iM915J, bArrM910E);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315j
    /* renamed from: z */
    public final int mo903z() throws InvalidProtocolBufferException {
        if (mo885c()) {
            this.f2349h = 0;
            return 0;
        }
        int iM915J = m915J();
        this.f2349h = iM915J;
        if ((iM915J >>> 3) != 0) {
            return iM915J;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }
}
