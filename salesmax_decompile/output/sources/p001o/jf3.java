package p001o;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class jf3 {

    /* renamed from: a */
    public int f30307a;

    /* renamed from: b */
    public int f30308b;

    /* renamed from: c */
    public int f30309c;

    /* renamed from: d */
    public kf3 f30310d;

    /* renamed from: e */
    public boolean f30311e;

    /* renamed from: o.jf3$b */
    public static final class C14517b extends jf3 {

        /* renamed from: f */
        public final byte[] f30312f;

        /* renamed from: g */
        public final boolean f30313g;

        /* renamed from: h */
        public int f30314h;

        /* renamed from: i */
        public int f30315i;

        /* renamed from: j */
        public int f30316j;

        /* renamed from: k */
        public int f30317k;

        /* renamed from: l */
        public int f30318l;

        /* renamed from: m */
        public boolean f30319m;

        /* renamed from: n */
        public int f30320n;

        @Override // p001o.jf3
        /* renamed from: A */
        public int mo33691A() {
            return jf3.m33681b(m33719M());
        }

        @Override // p001o.jf3
        /* renamed from: B */
        public long mo33692B() {
            return jf3.m33682c(m33720N());
        }

        @Override // p001o.jf3
        /* renamed from: C */
        public String mo33693C() throws ct8 {
            int iM33719M = m33719M();
            if (iM33719M > 0) {
                int i = this.f30314h;
                int i2 = this.f30316j;
                if (iM33719M <= i - i2) {
                    String str = new String(this.f30312f, i2, iM33719M, yn8.f55724a);
                    this.f30316j += iM33719M;
                    return str;
                }
            }
            if (iM33719M == 0) {
                return "";
            }
            if (iM33719M < 0) {
                throw ct8.m21769g();
            }
            throw ct8.m21773m();
        }

        @Override // p001o.jf3
        /* renamed from: D */
        public String mo33694D() throws ct8 {
            int iM33719M = m33719M();
            if (iM33719M > 0) {
                int i = this.f30314h;
                int i2 = this.f30316j;
                if (iM33719M <= i - i2) {
                    String strM34291h = jqi.m34291h(this.f30312f, i2, iM33719M);
                    this.f30316j += iM33719M;
                    return strM34291h;
                }
            }
            if (iM33719M == 0) {
                return "";
            }
            if (iM33719M <= 0) {
                throw ct8.m21769g();
            }
            throw ct8.m21773m();
        }

        @Override // p001o.jf3
        /* renamed from: E */
        public int mo33695E() throws ct8 {
            if (mo33701e()) {
                this.f30318l = 0;
                return 0;
            }
            int iM33719M = m33719M();
            this.f30318l = iM33719M;
            if (fbj.m26425a(iM33719M) != 0) {
                return this.f30318l;
            }
            throw ct8.m21765c();
        }

        @Override // p001o.jf3
        /* renamed from: F */
        public int mo33696F() {
            return m33719M();
        }

        @Override // p001o.jf3
        /* renamed from: G */
        public long mo33697G() {
            return m33720N();
        }

        @Override // p001o.jf3
        /* renamed from: H */
        public boolean mo33698H(int i) throws ct8 {
            int iM26426b = fbj.m26426b(i);
            if (iM26426b == 0) {
                m33725S();
                return true;
            }
            if (iM26426b == 1) {
                m33724R(8);
                return true;
            }
            if (iM26426b == 2) {
                m33724R(m33719M());
                return true;
            }
            if (iM26426b == 3) {
                m33723Q();
                mo33699a(fbj.m26427c(fbj.m26425a(i), 4));
                return true;
            }
            if (iM26426b == 4) {
                return false;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            m33724R(4);
            return true;
        }

        /* renamed from: I */
        public byte m33715I() throws ct8 {
            int i = this.f30316j;
            if (i == this.f30314h) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f30312f;
            this.f30316j = i + 1;
            return bArr[i];
        }

        /* renamed from: J */
        public byte[] m33716J(int i) throws ct8 {
            if (i > 0) {
                int i2 = this.f30314h;
                int i3 = this.f30316j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f30316j = i4;
                    return Arrays.copyOfRange(this.f30312f, i3, i4);
                }
            }
            if (i > 0) {
                throw ct8.m21773m();
            }
            if (i == 0) {
                return yn8.f55726c;
            }
            throw ct8.m21769g();
        }

        /* renamed from: K */
        public int m33717K() throws ct8 {
            int i = this.f30316j;
            if (this.f30314h - i < 4) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f30312f;
            this.f30316j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: L */
        public long m33718L() throws ct8 {
            int i = this.f30316j;
            if (this.f30314h - i < 8) {
                throw ct8.m21773m();
            }
            byte[] bArr = this.f30312f;
            this.f30316j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: M */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m33719M() {
            int i;
            int i2 = this.f30316j;
            int i3 = this.f30314h;
            if (i3 != i2) {
                byte[] bArr = this.f30312f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f30316j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.f30316j = i5;
                    return i;
                }
            }
            return (int) m33721O();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long m33720N() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f30316j;
            int i3 = this.f30314h;
            if (i3 != i2) {
                byte[] bArr = this.f30312f;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f30316j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (bArr[i5] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (bArr[i5] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (bArr[i10] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                i5 = j7 < 0 ? i11 + 1 : i11;
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.f30316j = i5;
                        return j;
                    }
                    i = i6 ^ (-128);
                    j = i;
                    this.f30316j = i5;
                    return j;
                }
            }
            return m33721O();
        }

        /* renamed from: O */
        public long m33721O() throws ct8 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((m33715I() & 128) == 0) {
                    return j;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: P */
        public final void m33722P() {
            int i = this.f30314h + this.f30315i;
            this.f30314h = i;
            int i2 = i - this.f30317k;
            int i3 = this.f30320n;
            if (i2 <= i3) {
                this.f30315i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f30315i = i4;
            this.f30314h = i - i4;
        }

        /* renamed from: Q */
        public void m33723Q() throws ct8 {
            int iMo33695E;
            do {
                iMo33695E = mo33695E();
                if (iMo33695E == 0) {
                    return;
                }
            } while (mo33698H(iMo33695E));
        }

        /* renamed from: R */
        public void m33724R(int i) throws ct8 {
            if (i >= 0) {
                int i2 = this.f30314h;
                int i3 = this.f30316j;
                if (i <= i2 - i3) {
                    this.f30316j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw ct8.m21773m();
            }
            throw ct8.m21769g();
        }

        /* renamed from: S */
        public final void m33725S() throws ct8 {
            if (this.f30314h - this.f30316j >= 10) {
                m33726T();
            } else {
                m33727U();
            }
        }

        /* renamed from: T */
        public final void m33726T() throws ct8 {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f30312f;
                int i2 = this.f30316j;
                this.f30316j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: U */
        public final void m33727U() throws ct8 {
            for (int i = 0; i < 10; i++) {
                if (m33715I() >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        @Override // p001o.jf3
        /* renamed from: a */
        public void mo33699a(int i) throws ct8 {
            if (this.f30318l != i) {
                throw ct8.m21764b();
            }
        }

        @Override // p001o.jf3
        /* renamed from: d */
        public int mo33700d() {
            return this.f30316j - this.f30317k;
        }

        @Override // p001o.jf3
        /* renamed from: e */
        public boolean mo33701e() {
            return this.f30316j == this.f30314h;
        }

        @Override // p001o.jf3
        /* renamed from: m */
        public void mo33702m(int i) {
            this.f30320n = i;
            m33722P();
        }

        @Override // p001o.jf3
        /* renamed from: n */
        public int mo33703n(int i) {
            if (i < 0) {
                throw ct8.m21769g();
            }
            int iMo33700d = i + mo33700d();
            if (iMo33700d < 0) {
                throw ct8.m21770h();
            }
            int i2 = this.f30320n;
            if (iMo33700d > i2) {
                throw ct8.m21773m();
            }
            this.f30320n = iMo33700d;
            m33722P();
            return i2;
        }

        @Override // p001o.jf3
        /* renamed from: o */
        public boolean mo33704o() {
            return m33720N() != 0;
        }

        @Override // p001o.jf3
        /* renamed from: p */
        public xq1 mo33705p() {
            int iM33719M = m33719M();
            if (iM33719M > 0) {
                int i = this.f30314h;
                int i2 = this.f30316j;
                if (iM33719M <= i - i2) {
                    xq1 xq1VarM56581S = (this.f30313g && this.f30319m) ? xq1.m56581S(this.f30312f, i2, iM33719M) : xq1.m56588p(this.f30312f, i2, iM33719M);
                    this.f30316j += iM33719M;
                    return xq1VarM56581S;
                }
            }
            return iM33719M == 0 ? xq1.f54049b : xq1.m56580R(m33716J(iM33719M));
        }

        @Override // p001o.jf3
        /* renamed from: q */
        public double mo33706q() {
            return Double.longBitsToDouble(m33718L());
        }

        @Override // p001o.jf3
        /* renamed from: r */
        public int mo33707r() {
            return m33719M();
        }

        @Override // p001o.jf3
        /* renamed from: s */
        public int mo33708s() {
            return m33717K();
        }

        @Override // p001o.jf3
        /* renamed from: t */
        public long mo33709t() {
            return m33718L();
        }

        @Override // p001o.jf3
        /* renamed from: u */
        public float mo33710u() {
            return Float.intBitsToFloat(m33717K());
        }

        @Override // p001o.jf3
        /* renamed from: v */
        public int mo33711v() {
            return m33719M();
        }

        @Override // p001o.jf3
        /* renamed from: w */
        public long mo33712w() {
            return m33720N();
        }

        @Override // p001o.jf3
        /* renamed from: y */
        public int mo33713y() {
            return m33717K();
        }

        @Override // p001o.jf3
        /* renamed from: z */
        public long mo33714z() {
            return m33718L();
        }

        public C14517b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f30320n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f30312f = bArr;
            this.f30314h = i2 + i;
            this.f30316j = i;
            this.f30317k = i;
            this.f30313g = z;
        }
    }

    /* renamed from: o.jf3$c */
    public static final class C14518c extends jf3 {

        /* renamed from: f */
        public final InputStream f30321f;

        /* renamed from: g */
        public final byte[] f30322g;

        /* renamed from: h */
        public int f30323h;

        /* renamed from: i */
        public int f30324i;

        /* renamed from: j */
        public int f30325j;

        /* renamed from: k */
        public int f30326k;

        /* renamed from: l */
        public int f30327l;

        /* renamed from: m */
        public int f30328m;

        /* renamed from: I */
        public static int m33728I(InputStream inputStream) throws ct8 {
            try {
                return inputStream.available();
            } catch (ct8 e) {
                e.m21775j();
                throw e;
            }
        }

        /* renamed from: J */
        public static int m33729J(InputStream inputStream, byte[] bArr, int i, int i2) throws ct8 {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (ct8 e) {
                e.m21775j();
                throw e;
            }
        }

        /* renamed from: W */
        public static long m33730W(InputStream inputStream, long j) throws ct8 {
            try {
                return inputStream.skip(j);
            } catch (ct8 e) {
                e.m21775j();
                throw e;
            }
        }

        @Override // p001o.jf3
        /* renamed from: A */
        public int mo33691A() {
            return jf3.m33681b(m33738R());
        }

        @Override // p001o.jf3
        /* renamed from: B */
        public long mo33692B() {
            return jf3.m33682c(m33739S());
        }

        @Override // p001o.jf3
        /* renamed from: C */
        public String mo33693C() throws ct8 {
            int iM33738R = m33738R();
            if (iM33738R > 0) {
                int i = this.f30323h;
                int i2 = this.f30325j;
                if (iM33738R <= i - i2) {
                    String str = new String(this.f30322g, i2, iM33738R, yn8.f55724a);
                    this.f30325j += iM33738R;
                    return str;
                }
            }
            if (iM33738R == 0) {
                return "";
            }
            if (iM33738R > this.f30323h) {
                return new String(m33733M(iM33738R, false), yn8.f55724a);
            }
            m33742V(iM33738R);
            String str2 = new String(this.f30322g, this.f30325j, iM33738R, yn8.f55724a);
            this.f30325j += iM33738R;
            return str2;
        }

        @Override // p001o.jf3
        /* renamed from: D */
        public String mo33694D() throws IOException {
            byte[] bArrM33733M;
            int iM33738R = m33738R();
            int i = this.f30325j;
            int i2 = this.f30323h;
            if (iM33738R <= i2 - i && iM33738R > 0) {
                bArrM33733M = this.f30322g;
                this.f30325j = i + iM33738R;
            } else {
                if (iM33738R == 0) {
                    return "";
                }
                i = 0;
                if (iM33738R <= i2) {
                    m33742V(iM33738R);
                    bArrM33733M = this.f30322g;
                    this.f30325j = iM33738R + 0;
                } else {
                    bArrM33733M = m33733M(iM33738R, false);
                }
            }
            return jqi.m34291h(bArrM33733M, i, iM33738R);
        }

        @Override // p001o.jf3
        /* renamed from: E */
        public int mo33695E() throws ct8 {
            if (mo33701e()) {
                this.f30326k = 0;
                return 0;
            }
            int iM33738R = m33738R();
            this.f30326k = iM33738R;
            if (fbj.m26425a(iM33738R) != 0) {
                return this.f30326k;
            }
            throw ct8.m21765c();
        }

        @Override // p001o.jf3
        /* renamed from: F */
        public int mo33696F() {
            return m33738R();
        }

        @Override // p001o.jf3
        /* renamed from: G */
        public long mo33697G() {
            return m33739S();
        }

        @Override // p001o.jf3
        /* renamed from: H */
        public boolean mo33698H(int i) throws ct8 {
            int iM26426b = fbj.m26426b(i);
            if (iM26426b == 0) {
                a0();
                return true;
            }
            if (iM26426b == 1) {
                m33744Y(8);
                return true;
            }
            if (iM26426b == 2) {
                m33744Y(m33738R());
                return true;
            }
            if (iM26426b == 3) {
                m33743X();
                mo33699a(fbj.m26427c(fbj.m26425a(i), 4));
                return true;
            }
            if (iM26426b == 4) {
                return false;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            m33744Y(4);
            return true;
        }

        /* renamed from: K */
        public final xq1 m33731K(int i) throws IOException {
            byte[] bArrM33734N = m33734N(i);
            if (bArrM33734N != null) {
                return xq1.m56587o(bArrM33734N);
            }
            int i2 = this.f30325j;
            int i3 = this.f30323h;
            int length = i3 - i2;
            this.f30327l += i3;
            this.f30325j = 0;
            this.f30323h = 0;
            List<byte[]> listM33735O = m33735O(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f30322g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM33735O) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return xq1.m56580R(bArr);
        }

        /* renamed from: L */
        public byte m33732L() throws ct8 {
            if (this.f30325j == this.f30323h) {
                m33742V(1);
            }
            byte[] bArr = this.f30322g;
            int i = this.f30325j;
            this.f30325j = i + 1;
            return bArr[i];
        }

        /* renamed from: M */
        public final byte[] m33733M(int i, boolean z) throws IOException {
            byte[] bArrM33734N = m33734N(i);
            if (bArrM33734N != null) {
                return z ? (byte[]) bArrM33734N.clone() : bArrM33734N;
            }
            int i2 = this.f30325j;
            int i3 = this.f30323h;
            int length = i3 - i2;
            this.f30327l += i3;
            this.f30325j = 0;
            this.f30323h = 0;
            List<byte[]> listM33735O = m33735O(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f30322g, i2, bArr, 0, length);
            for (byte[] bArr2 : listM33735O) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* renamed from: N */
        public final byte[] m33734N(int i) throws ct8 {
            if (i == 0) {
                return yn8.f55726c;
            }
            if (i < 0) {
                throw ct8.m21769g();
            }
            int i2 = this.f30327l;
            int i3 = this.f30325j;
            int i4 = i2 + i3 + i;
            if (i4 - this.f30309c > 0) {
                throw ct8.m21772l();
            }
            int i5 = this.f30328m;
            if (i4 > i5) {
                m33744Y((i5 - i2) - i3);
                throw ct8.m21773m();
            }
            int i6 = this.f30323h - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > m33728I(this.f30321f)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f30322g, this.f30325j, bArr, 0, i6);
            this.f30327l += this.f30323h;
            this.f30325j = 0;
            this.f30323h = 0;
            while (i6 < i) {
                int iM33729J = m33729J(this.f30321f, bArr, i6, i - i6);
                if (iM33729J == -1) {
                    throw ct8.m21773m();
                }
                this.f30327l += iM33729J;
                i6 += iM33729J;
            }
            return bArr;
        }

        /* renamed from: O */
        public final List m33735O(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f30321f.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw ct8.m21773m();
                    }
                    this.f30327l += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: P */
        public int m33736P() throws ct8 {
            int i = this.f30325j;
            if (this.f30323h - i < 4) {
                m33742V(4);
                i = this.f30325j;
            }
            byte[] bArr = this.f30322g;
            this.f30325j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: Q */
        public long m33737Q() throws ct8 {
            int i = this.f30325j;
            if (this.f30323h - i < 8) {
                m33742V(8);
                i = this.f30325j;
            }
            byte[] bArr = this.f30322g;
            this.f30325j = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /* renamed from: R */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m33738R() {
            int i;
            int i2 = this.f30325j;
            int i3 = this.f30323h;
            if (i3 != i2) {
                byte[] bArr = this.f30322g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f30325j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                i7 = i5 + 1;
                                byte b2 = bArr[i5];
                                i = (i9 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i5 = i7 + 1;
                                    if (bArr[i7] < 0) {
                                        i7 = i5 + 1;
                                        if (bArr[i5] < 0) {
                                            i5 = i7 + 1;
                                            if (bArr[i7] < 0) {
                                                i7 = i5 + 1;
                                                if (bArr[i5] < 0) {
                                                    i5 = i7 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i5 = i7;
                    }
                    this.f30325j = i5;
                    return i;
                }
            }
            return (int) m33740T();
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /* renamed from: S */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long m33739S() {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f30325j;
            int i3 = this.f30323h;
            if (i3 != i2) {
                byte[] bArr = this.f30322g;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f30325j = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            i5 = i7;
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 < 0) {
                                i = i9 ^ (-2080896);
                            } else {
                                long j4 = i9;
                                int i10 = i5 + 1;
                                long j5 = j4 ^ (bArr[i5] << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i5 = i10 + 1;
                                    long j6 = j5 ^ (bArr[i10] << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j5 = j6 ^ (bArr[i5] << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j6 = j5 ^ (bArr[i10] << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                i5 = j7 < 0 ? i11 + 1 : i11;
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i5 = i10;
                            }
                        }
                        this.f30325j = i5;
                        return j;
                    }
                    i = i6 ^ (-128);
                    j = i;
                    this.f30325j = i5;
                    return j;
                }
            }
            return m33740T();
        }

        /* renamed from: T */
        public long m33740T() throws ct8 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((m33732L() & 128) == 0) {
                    return j;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: U */
        public final void m33741U() {
            int i = this.f30323h + this.f30324i;
            this.f30323h = i;
            int i2 = this.f30327l + i;
            int i3 = this.f30328m;
            if (i2 <= i3) {
                this.f30324i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f30324i = i4;
            this.f30323h = i - i4;
        }

        /* renamed from: V */
        public final void m33742V(int i) throws ct8 {
            if (d0(i)) {
                return;
            }
            if (i <= (this.f30309c - this.f30327l) - this.f30325j) {
                throw ct8.m21773m();
            }
            throw ct8.m21772l();
        }

        /* renamed from: X */
        public void m33743X() throws ct8 {
            int iMo33695E;
            do {
                iMo33695E = mo33695E();
                if (iMo33695E == 0) {
                    return;
                }
            } while (mo33698H(iMo33695E));
        }

        /* renamed from: Y */
        public void m33744Y(int i) throws ct8 {
            int i2 = this.f30323h;
            int i3 = this.f30325j;
            if (i > i2 - i3 || i < 0) {
                m33745Z(i);
            } else {
                this.f30325j = i3 + i;
            }
        }

        /* renamed from: Z */
        public final void m33745Z(int i) throws ct8 {
            if (i < 0) {
                throw ct8.m21769g();
            }
            int i2 = this.f30327l;
            int i3 = this.f30325j;
            int i4 = i2 + i3 + i;
            int i5 = this.f30328m;
            if (i4 > i5) {
                m33744Y((i5 - i2) - i3);
                throw ct8.m21773m();
            }
            this.f30327l = i2 + i3;
            int i6 = this.f30323h - i3;
            this.f30323h = 0;
            this.f30325j = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jM33730W = m33730W(this.f30321f, j);
                    if (jM33730W < 0 || jM33730W > j) {
                        throw new IllegalStateException(this.f30321f.getClass() + "#skip returned invalid result: " + jM33730W + "\nThe InputStream implementation is buggy.");
                    }
                    if (jM33730W == 0) {
                        break;
                    } else {
                        i6 += (int) jM33730W;
                    }
                } finally {
                    this.f30327l += i6;
                    m33741U();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i7 = this.f30323h;
            int i8 = i7 - this.f30325j;
            this.f30325j = i7;
            m33742V(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.f30323h;
                if (i9 <= i10) {
                    this.f30325j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f30325j = i10;
                    m33742V(1);
                }
            }
        }

        @Override // p001o.jf3
        /* renamed from: a */
        public void mo33699a(int i) throws ct8 {
            if (this.f30326k != i) {
                throw ct8.m21764b();
            }
        }

        public final void a0() throws ct8 {
            if (this.f30323h - this.f30325j >= 10) {
                b0();
            } else {
                c0();
            }
        }

        public final void b0() throws ct8 {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f30322g;
                int i2 = this.f30325j;
                this.f30325j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        public final void c0() throws ct8 {
            for (int i = 0; i < 10; i++) {
                if (m33732L() >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        @Override // p001o.jf3
        /* renamed from: d */
        public int mo33700d() {
            return this.f30327l + this.f30325j;
        }

        public final boolean d0(int i) throws ct8 {
            int i2 = this.f30325j;
            int i3 = i2 + i;
            int i4 = this.f30323h;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.f30309c;
            int i6 = this.f30327l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f30328m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f30322g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f30327l += i2;
                this.f30323h -= i2;
                this.f30325j = 0;
            }
            InputStream inputStream = this.f30321f;
            byte[] bArr2 = this.f30322g;
            int i7 = this.f30323h;
            int iM33729J = m33729J(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f30309c - this.f30327l) - i7));
            if (iM33729J == 0 || iM33729J < -1 || iM33729J > this.f30322g.length) {
                throw new IllegalStateException(this.f30321f.getClass() + "#read(byte[]) returned invalid result: " + iM33729J + "\nThe InputStream implementation is buggy.");
            }
            if (iM33729J <= 0) {
                return false;
            }
            this.f30323h += iM33729J;
            m33741U();
            if (this.f30323h >= i) {
                return true;
            }
            return d0(i);
        }

        @Override // p001o.jf3
        /* renamed from: e */
        public boolean mo33701e() {
            return this.f30325j == this.f30323h && !d0(1);
        }

        @Override // p001o.jf3
        /* renamed from: m */
        public void mo33702m(int i) {
            this.f30328m = i;
            m33741U();
        }

        @Override // p001o.jf3
        /* renamed from: n */
        public int mo33703n(int i) throws ct8 {
            if (i < 0) {
                throw ct8.m21769g();
            }
            int i2 = i + this.f30327l + this.f30325j;
            int i3 = this.f30328m;
            if (i2 > i3) {
                throw ct8.m21773m();
            }
            this.f30328m = i2;
            m33741U();
            return i3;
        }

        @Override // p001o.jf3
        /* renamed from: o */
        public boolean mo33704o() {
            return m33739S() != 0;
        }

        @Override // p001o.jf3
        /* renamed from: p */
        public xq1 mo33705p() {
            int iM33738R = m33738R();
            int i = this.f30323h;
            int i2 = this.f30325j;
            if (iM33738R > i - i2 || iM33738R <= 0) {
                return iM33738R == 0 ? xq1.f54049b : m33731K(iM33738R);
            }
            xq1 xq1VarM56588p = xq1.m56588p(this.f30322g, i2, iM33738R);
            this.f30325j += iM33738R;
            return xq1VarM56588p;
        }

        @Override // p001o.jf3
        /* renamed from: q */
        public double mo33706q() {
            return Double.longBitsToDouble(m33737Q());
        }

        @Override // p001o.jf3
        /* renamed from: r */
        public int mo33707r() {
            return m33738R();
        }

        @Override // p001o.jf3
        /* renamed from: s */
        public int mo33708s() {
            return m33736P();
        }

        @Override // p001o.jf3
        /* renamed from: t */
        public long mo33709t() {
            return m33737Q();
        }

        @Override // p001o.jf3
        /* renamed from: u */
        public float mo33710u() {
            return Float.intBitsToFloat(m33736P());
        }

        @Override // p001o.jf3
        /* renamed from: v */
        public int mo33711v() {
            return m33738R();
        }

        @Override // p001o.jf3
        /* renamed from: w */
        public long mo33712w() {
            return m33739S();
        }

        @Override // p001o.jf3
        /* renamed from: y */
        public int mo33713y() {
            return m33736P();
        }

        @Override // p001o.jf3
        /* renamed from: z */
        public long mo33714z() {
            return m33737Q();
        }

        public C14518c(InputStream inputStream, int i) {
            super();
            this.f30328m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            yn8.m58013b(inputStream, "input");
            this.f30321f = inputStream;
            this.f30322g = new byte[i];
            this.f30323h = 0;
            this.f30325j = 0;
            this.f30327l = 0;
        }
    }

    /* renamed from: o.jf3$d */
    public static final class C14519d extends jf3 {

        /* renamed from: f */
        public final ByteBuffer f30329f;

        /* renamed from: g */
        public final boolean f30330g;

        /* renamed from: h */
        public final long f30331h;

        /* renamed from: i */
        public long f30332i;

        /* renamed from: j */
        public long f30333j;

        /* renamed from: k */
        public long f30334k;

        /* renamed from: l */
        public int f30335l;

        /* renamed from: m */
        public int f30336m;

        /* renamed from: n */
        public boolean f30337n;

        /* renamed from: o */
        public int f30338o;

        /* renamed from: J */
        public static boolean m33746J() {
            return z4i.m58698J();
        }

        @Override // p001o.jf3
        /* renamed from: A */
        public int mo33691A() {
            return jf3.m33681b(m33751N());
        }

        @Override // p001o.jf3
        /* renamed from: B */
        public long mo33692B() {
            return jf3.m33682c(m33752O());
        }

        @Override // p001o.jf3
        /* renamed from: C */
        public String mo33693C() throws ct8 {
            int iM33751N = m33751N();
            if (iM33751N <= 0 || iM33751N > m33755R()) {
                if (iM33751N == 0) {
                    return "";
                }
                if (iM33751N < 0) {
                    throw ct8.m21769g();
                }
                throw ct8.m21773m();
            }
            byte[] bArr = new byte[iM33751N];
            long j = iM33751N;
            z4i.m58728p(this.f30333j, bArr, 0L, j);
            String str = new String(bArr, yn8.f55724a);
            this.f30333j += j;
            return str;
        }

        @Override // p001o.jf3
        /* renamed from: D */
        public String mo33694D() throws ct8 {
            int iM33751N = m33751N();
            if (iM33751N > 0 && iM33751N <= m33755R()) {
                String strM34290g = jqi.m34290g(this.f30329f, m33747I(this.f30333j), iM33751N);
                this.f30333j += iM33751N;
                return strM34290g;
            }
            if (iM33751N == 0) {
                return "";
            }
            if (iM33751N <= 0) {
                throw ct8.m21769g();
            }
            throw ct8.m21773m();
        }

        @Override // p001o.jf3
        /* renamed from: E */
        public int mo33695E() throws ct8 {
            if (mo33701e()) {
                this.f30336m = 0;
                return 0;
            }
            int iM33751N = m33751N();
            this.f30336m = iM33751N;
            if (fbj.m26425a(iM33751N) != 0) {
                return this.f30336m;
            }
            throw ct8.m21765c();
        }

        @Override // p001o.jf3
        /* renamed from: F */
        public int mo33696F() {
            return m33751N();
        }

        @Override // p001o.jf3
        /* renamed from: G */
        public long mo33697G() {
            return m33752O();
        }

        @Override // p001o.jf3
        /* renamed from: H */
        public boolean mo33698H(int i) throws ct8 {
            int iM26426b = fbj.m26426b(i);
            if (iM26426b == 0) {
                m33758U();
                return true;
            }
            if (iM26426b == 1) {
                m33757T(8);
                return true;
            }
            if (iM26426b == 2) {
                m33757T(m33751N());
                return true;
            }
            if (iM26426b == 3) {
                m33756S();
                mo33699a(fbj.m26427c(fbj.m26425a(i), 4));
                return true;
            }
            if (iM26426b == 4) {
                return false;
            }
            if (iM26426b != 5) {
                throw ct8.m21767e();
            }
            m33757T(4);
            return true;
        }

        /* renamed from: I */
        public final int m33747I(long j) {
            return (int) (j - this.f30331h);
        }

        /* renamed from: K */
        public byte m33748K() throws ct8 {
            long j = this.f30333j;
            if (j == this.f30332i) {
                throw ct8.m21773m();
            }
            this.f30333j = 1 + j;
            return z4i.m58735w(j);
        }

        /* renamed from: L */
        public int m33749L() throws ct8 {
            long j = this.f30333j;
            if (this.f30332i - j < 4) {
                throw ct8.m21773m();
            }
            this.f30333j = 4 + j;
            return ((z4i.m58735w(j + 3) & 255) << 24) | (z4i.m58735w(j) & 255) | ((z4i.m58735w(1 + j) & 255) << 8) | ((z4i.m58735w(2 + j) & 255) << 16);
        }

        /* renamed from: M */
        public long m33750M() throws ct8 {
            long j = this.f30333j;
            if (this.f30332i - j < 8) {
                throw ct8.m21773m();
            }
            this.f30333j = 8 + j;
            return ((z4i.m58735w(j + 7) & 255) << 56) | (z4i.m58735w(j) & 255) | ((z4i.m58735w(1 + j) & 255) << 8) | ((z4i.m58735w(2 + j) & 255) << 16) | ((z4i.m58735w(3 + j) & 255) << 24) | ((z4i.m58735w(4 + j) & 255) << 32) | ((z4i.m58735w(5 + j) & 255) << 40) | ((z4i.m58735w(6 + j) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (p001o.z4i.m58735w(r4) < 0) goto L34;
         */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int m33751N() {
            int i;
            long j = this.f30333j;
            if (this.f30332i != j) {
                long j2 = j + 1;
                byte bM58735w = z4i.m58735w(j);
                if (bM58735w >= 0) {
                    this.f30333j = j2;
                    return bM58735w;
                }
                if (this.f30332i - j2 >= 9) {
                    long j3 = j2 + 1;
                    int iM58735w = bM58735w ^ (z4i.m58735w(j2) << 7);
                    if (iM58735w < 0) {
                        i = iM58735w ^ (-128);
                    } else {
                        long j4 = j3 + 1;
                        int iM58735w2 = iM58735w ^ (z4i.m58735w(j3) << 14);
                        if (iM58735w2 >= 0) {
                            i = iM58735w2 ^ 16256;
                        } else {
                            j3 = j4 + 1;
                            int iM58735w3 = iM58735w2 ^ (z4i.m58735w(j4) << 21);
                            if (iM58735w3 < 0) {
                                i = iM58735w3 ^ (-2080896);
                            } else {
                                j4 = j3 + 1;
                                byte bM58735w2 = z4i.m58735w(j3);
                                i = (iM58735w3 ^ (bM58735w2 << 28)) ^ 266354560;
                                if (bM58735w2 < 0) {
                                    j3 = j4 + 1;
                                    if (z4i.m58735w(j4) < 0) {
                                        j4 = j3 + 1;
                                        if (z4i.m58735w(j3) < 0) {
                                            j3 = j4 + 1;
                                            if (z4i.m58735w(j4) < 0) {
                                                j4 = j3 + 1;
                                                if (z4i.m58735w(j3) < 0) {
                                                    j3 = j4 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        j3 = j4;
                    }
                    this.f30333j = j3;
                    return i;
                }
            }
            return (int) m33753P();
        }

        /* renamed from: O */
        public long m33752O() {
            long jM58735w;
            long j;
            long j2;
            int i;
            long j3 = this.f30333j;
            if (this.f30332i != j3) {
                long j4 = j3 + 1;
                byte bM58735w = z4i.m58735w(j3);
                if (bM58735w >= 0) {
                    this.f30333j = j4;
                    return bM58735w;
                }
                if (this.f30332i - j4 >= 9) {
                    long j5 = j4 + 1;
                    int iM58735w = bM58735w ^ (z4i.m58735w(j4) << 7);
                    if (iM58735w >= 0) {
                        long j6 = j5 + 1;
                        int iM58735w2 = iM58735w ^ (z4i.m58735w(j5) << 14);
                        if (iM58735w2 >= 0) {
                            jM58735w = iM58735w2 ^ 16256;
                        } else {
                            j5 = j6 + 1;
                            int iM58735w3 = iM58735w2 ^ (z4i.m58735w(j6) << 21);
                            if (iM58735w3 < 0) {
                                i = iM58735w3 ^ (-2080896);
                            } else {
                                j6 = j5 + 1;
                                long jM58735w2 = iM58735w3 ^ (z4i.m58735w(j5) << 28);
                                if (jM58735w2 < 0) {
                                    long j7 = j6 + 1;
                                    long jM58735w3 = jM58735w2 ^ (z4i.m58735w(j6) << 35);
                                    if (jM58735w3 < 0) {
                                        j = -34093383808L;
                                    } else {
                                        j6 = j7 + 1;
                                        jM58735w2 = jM58735w3 ^ (z4i.m58735w(j7) << 42);
                                        if (jM58735w2 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            j7 = j6 + 1;
                                            jM58735w3 = jM58735w2 ^ (z4i.m58735w(j6) << 49);
                                            if (jM58735w3 >= 0) {
                                                j6 = j7 + 1;
                                                jM58735w = (jM58735w3 ^ (z4i.m58735w(j7) << 56)) ^ 71499008037633920L;
                                                if (jM58735w < 0) {
                                                    long j8 = 1 + j6;
                                                    if (z4i.m58735w(j6) >= 0) {
                                                        j5 = j8;
                                                    }
                                                }
                                                this.f30333j = j5;
                                                return jM58735w;
                                            }
                                            j = -558586000294016L;
                                        }
                                    }
                                    jM58735w = jM58735w3 ^ j;
                                    j5 = j7;
                                    this.f30333j = j5;
                                    return jM58735w;
                                }
                                j2 = 266354560;
                                jM58735w = jM58735w2 ^ j2;
                            }
                        }
                        j5 = j6;
                        this.f30333j = j5;
                        return jM58735w;
                    }
                    i = iM58735w ^ (-128);
                    jM58735w = i;
                    this.f30333j = j5;
                    return jM58735w;
                }
            }
            return m33753P();
        }

        /* renamed from: P */
        public long m33753P() throws ct8 {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((m33748K() & 128) == 0) {
                    return j;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: Q */
        public final void m33754Q() {
            long j = this.f30332i + this.f30335l;
            this.f30332i = j;
            int i = (int) (j - this.f30334k);
            int i2 = this.f30338o;
            if (i <= i2) {
                this.f30335l = 0;
                return;
            }
            int i3 = i - i2;
            this.f30335l = i3;
            this.f30332i = j - i3;
        }

        /* renamed from: R */
        public final int m33755R() {
            return (int) (this.f30332i - this.f30333j);
        }

        /* renamed from: S */
        public void m33756S() throws ct8 {
            int iMo33695E;
            do {
                iMo33695E = mo33695E();
                if (iMo33695E == 0) {
                    return;
                }
            } while (mo33698H(iMo33695E));
        }

        /* renamed from: T */
        public void m33757T(int i) throws ct8 {
            if (i >= 0 && i <= m33755R()) {
                this.f30333j += i;
            } else {
                if (i >= 0) {
                    throw ct8.m21773m();
                }
                throw ct8.m21769g();
            }
        }

        /* renamed from: U */
        public final void m33758U() throws ct8 {
            if (m33755R() >= 10) {
                m33759V();
            } else {
                m33760W();
            }
        }

        /* renamed from: V */
        public final void m33759V() throws ct8 {
            for (int i = 0; i < 10; i++) {
                long j = this.f30333j;
                this.f30333j = 1 + j;
                if (z4i.m58735w(j) >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: W */
        public final void m33760W() throws ct8 {
            for (int i = 0; i < 10; i++) {
                if (m33748K() >= 0) {
                    return;
                }
            }
            throw ct8.m21768f();
        }

        /* renamed from: X */
        public final ByteBuffer m33761X(long j, long j2) {
            int iPosition = this.f30329f.position();
            int iLimit = this.f30329f.limit();
            try {
                try {
                    this.f30329f.position(m33747I(j));
                    this.f30329f.limit(m33747I(j2));
                    return this.f30329f.slice();
                } catch (IllegalArgumentException unused) {
                    throw ct8.m21773m();
                }
            } finally {
                this.f30329f.position(iPosition);
                this.f30329f.limit(iLimit);
            }
        }

        @Override // p001o.jf3
        /* renamed from: a */
        public void mo33699a(int i) throws ct8 {
            if (this.f30336m != i) {
                throw ct8.m21764b();
            }
        }

        @Override // p001o.jf3
        /* renamed from: d */
        public int mo33700d() {
            return (int) (this.f30333j - this.f30334k);
        }

        @Override // p001o.jf3
        /* renamed from: e */
        public boolean mo33701e() {
            return this.f30333j == this.f30332i;
        }

        @Override // p001o.jf3
        /* renamed from: m */
        public void mo33702m(int i) {
            this.f30338o = i;
            m33754Q();
        }

        @Override // p001o.jf3
        /* renamed from: n */
        public int mo33703n(int i) throws ct8 {
            if (i < 0) {
                throw ct8.m21769g();
            }
            int iMo33700d = i + mo33700d();
            int i2 = this.f30338o;
            if (iMo33700d > i2) {
                throw ct8.m21773m();
            }
            this.f30338o = iMo33700d;
            m33754Q();
            return i2;
        }

        @Override // p001o.jf3
        /* renamed from: o */
        public boolean mo33704o() {
            return m33752O() != 0;
        }

        @Override // p001o.jf3
        /* renamed from: p */
        public xq1 mo33705p() throws ct8 {
            int iM33751N = m33751N();
            if (iM33751N <= 0 || iM33751N > m33755R()) {
                if (iM33751N == 0) {
                    return xq1.f54049b;
                }
                if (iM33751N < 0) {
                    throw ct8.m21769g();
                }
                throw ct8.m21773m();
            }
            if (this.f30330g && this.f30337n) {
                long j = this.f30333j;
                long j2 = iM33751N;
                ByteBuffer byteBufferM33761X = m33761X(j, j + j2);
                this.f30333j += j2;
                return xq1.m56579P(byteBufferM33761X);
            }
            byte[] bArr = new byte[iM33751N];
            long j3 = iM33751N;
            z4i.m58728p(this.f30333j, bArr, 0L, j3);
            this.f30333j += j3;
            return xq1.m56580R(bArr);
        }

        @Override // p001o.jf3
        /* renamed from: q */
        public double mo33706q() {
            return Double.longBitsToDouble(m33750M());
        }

        @Override // p001o.jf3
        /* renamed from: r */
        public int mo33707r() {
            return m33751N();
        }

        @Override // p001o.jf3
        /* renamed from: s */
        public int mo33708s() {
            return m33749L();
        }

        @Override // p001o.jf3
        /* renamed from: t */
        public long mo33709t() {
            return m33750M();
        }

        @Override // p001o.jf3
        /* renamed from: u */
        public float mo33710u() {
            return Float.intBitsToFloat(m33749L());
        }

        @Override // p001o.jf3
        /* renamed from: v */
        public int mo33711v() {
            return m33751N();
        }

        @Override // p001o.jf3
        /* renamed from: w */
        public long mo33712w() {
            return m33752O();
        }

        @Override // p001o.jf3
        /* renamed from: y */
        public int mo33713y() {
            return m33749L();
        }

        @Override // p001o.jf3
        /* renamed from: z */
        public long mo33714z() {
            return m33750M();
        }

        public C14519d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f30338o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f30329f = byteBuffer;
            long jM58723k = z4i.m58723k(byteBuffer);
            this.f30331h = jM58723k;
            this.f30332i = byteBuffer.limit() + jM58723k;
            long jPosition = jM58723k + byteBuffer.position();
            this.f30333j = jPosition;
            this.f30334k = jPosition;
            this.f30330g = z;
        }
    }

    /* renamed from: b */
    public static int m33681b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m33682c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static jf3 m33683f(InputStream inputStream) {
        return m33684g(inputStream, 4096);
    }

    /* renamed from: g */
    public static jf3 m33684g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? m33687j(yn8.f55726c) : new C14518c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    /* renamed from: h */
    public static jf3 m33685h(ByteBuffer byteBuffer) {
        return m33686i(byteBuffer, false);
    }

    /* renamed from: i */
    public static jf3 m33686i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m33689l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C14519d.m33746J()) {
            return new C14519d(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m33689l(bArr, 0, iRemaining, true);
    }

    /* renamed from: j */
    public static jf3 m33687j(byte[] bArr) {
        return m33688k(bArr, 0, bArr.length);
    }

    /* renamed from: k */
    public static jf3 m33688k(byte[] bArr, int i, int i2) {
        return m33689l(bArr, i, i2, false);
    }

    /* renamed from: l */
    public static jf3 m33689l(byte[] bArr, int i, int i2, boolean z) {
        C14517b c14517b = new C14517b(bArr, i, i2, z);
        try {
            c14517b.mo33703n(i2);
            return c14517b;
        } catch (ct8 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: x */
    public static int m33690x(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & Opcodes.LAND;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw ct8.m21773m();
            }
            i2 |= (i4 & Opcodes.LAND) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw ct8.m21773m();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw ct8.m21768f();
    }

    /* renamed from: A */
    public abstract int mo33691A();

    /* renamed from: B */
    public abstract long mo33692B();

    /* renamed from: C */
    public abstract String mo33693C();

    /* renamed from: D */
    public abstract String mo33694D();

    /* renamed from: E */
    public abstract int mo33695E();

    /* renamed from: F */
    public abstract int mo33696F();

    /* renamed from: G */
    public abstract long mo33697G();

    /* renamed from: H */
    public abstract boolean mo33698H(int i);

    /* renamed from: a */
    public abstract void mo33699a(int i);

    /* renamed from: d */
    public abstract int mo33700d();

    /* renamed from: e */
    public abstract boolean mo33701e();

    /* renamed from: m */
    public abstract void mo33702m(int i);

    /* renamed from: n */
    public abstract int mo33703n(int i);

    /* renamed from: o */
    public abstract boolean mo33704o();

    /* renamed from: p */
    public abstract xq1 mo33705p();

    /* renamed from: q */
    public abstract double mo33706q();

    /* renamed from: r */
    public abstract int mo33707r();

    /* renamed from: s */
    public abstract int mo33708s();

    /* renamed from: t */
    public abstract long mo33709t();

    /* renamed from: u */
    public abstract float mo33710u();

    /* renamed from: v */
    public abstract int mo33711v();

    /* renamed from: w */
    public abstract long mo33712w();

    /* renamed from: y */
    public abstract int mo33713y();

    /* renamed from: z */
    public abstract long mo33714z();

    public jf3() {
        this.f30308b = 100;
        this.f30309c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f30311e = false;
    }
}
