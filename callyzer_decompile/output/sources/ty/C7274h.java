package ty;

import com.sun.mail.util.AbstractC1452a;
import f00.AbstractC2175d;
import f00.InterfaceC2173b;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import l4.d0;
import mg.d1;
import mm.AbstractC4801l;
import ny.C5189c;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ty.h */
/* loaded from: classes3.dex */
public final class C7274h implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ int f34722a;

    /* renamed from: b */
    public final byte[] f34723b;

    /* renamed from: c */
    public final Object f34724c;

    /* renamed from: d */
    public Object f34725d;

    /* renamed from: e */
    public final Object f34726e;

    public C7274h(ByteArrayInputStream byteArrayInputStream) {
        this.f34722a = 1;
        this.f34723b = new byte[8];
        this.f34726e = new d0(3);
        this.f34724c = byteArrayInputStream;
    }

    /* renamed from: A */
    public void m13583A() {
        m13590u();
        if (((d1) this.f34725d).f23637b == 31) {
            throw new IllegalStateException(AbstractC4801l.m9730d(((d1) this.f34725d).f23637b, "expected definite length but found "));
        }
    }

    /* renamed from: H */
    public void m13584H(byte b10) {
        m13590u();
        if (((d1) this.f34725d).f23636a != b10) {
            throw new IllegalStateException(AbstractC5601a.m11235f("expected major type ", (b10 >> 5) & 7, (((d1) this.f34725d).f23636a >> 5) & 7, " but found "));
        }
    }

    /* renamed from: J */
    public void m13585J(int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = ((ByteArrayInputStream) this.f34724c).read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.f34725d = null;
    }

    /* renamed from: P */
    public byte[] m13586P() {
        m13583A();
        long jM13592z = m13592z();
        if (jM13592z < 0 || jM13592z > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (((ByteArrayInputStream) this.f34724c).available() < jM13592z) {
            throw new EOFException();
        }
        int i10 = (int) jM13592z;
        byte[] bArr = new byte[i10];
        m13585J(i10, bArr);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f34722a) {
            case 0:
                ((InterfaceC2173b) this.f34724c).mo5849y(this, "Closing `{}`");
                C7279m c7279m = (C7279m) this.f34725d;
                C7275i c7275iM13599j = c7279m.m13599j(EnumC7272f.CLOSE);
                byte[] bArr = this.f34723b;
                c7275iM13599j.m9912g(bArr.length, bArr);
                C5189c c5189cM13600n = c7279m.m13600n(c7275iM13599j);
                c7279m.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ((C7277k) c5189cM13600n.m10149d(30000)).m13594D();
                break;
            default:
                ((ByteArrayInputStream) this.f34724c).close();
                ((d0) this.f34726e).m9091y();
                break;
        }
    }

    /* renamed from: h */
    public long m13587h() {
        m13584H((byte) -128);
        m13583A();
        long jM13592z = m13592z();
        if (jM13592z < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jM13592z > 0) {
            ((ArrayDeque) ((d0) this.f34726e).f21881b).push(Long.valueOf(jM13592z));
        }
        return jM13592z;
    }

    /* renamed from: j */
    public long m13588j() {
        boolean z6;
        m13590u();
        byte b10 = ((d1) this.f34725d).f23636a;
        if (b10 == 0) {
            z6 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(AbstractC4801l.m9730d((((d1) this.f34725d).f23636a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z6 = false;
        }
        long jM13592z = m13592z();
        if (jM13592z >= 0) {
            return z6 ? jM13592z : ~jM13592z;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    /* renamed from: n */
    public long m13589n() {
        m13584H((byte) -96);
        m13583A();
        long jM13592z = m13592z();
        if (jM13592z < 0 || jM13592z > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jM13592z > 0) {
            ((ArrayDeque) ((d0) this.f34726e).f21881b).push(Long.valueOf(jM13592z + jM13592z));
        }
        return jM13592z;
    }

    public String toString() {
        switch (this.f34722a) {
            case 0:
                return AbstractC1452a.m4564k(new StringBuilder("RemoteResource{"), (String) this.f34726e, "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r1 != (-2)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mg.d1 m13590u() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ty.C7274h.m13590u():mg.d1");
    }

    /* renamed from: w */
    public boolean m13591w() {
        m13584H((byte) -32);
        if (((d1) this.f34725d).f23637b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iM13592z = (int) m13592z();
        if (iM13592z == 20) {
            return false;
        }
        if (iM13592z == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    /* renamed from: z */
    public long m13592z() throws IOException {
        byte b10 = ((d1) this.f34725d).f23637b;
        if (b10 < 24) {
            long j6 = b10;
            this.f34725d = null;
            return j6;
        }
        if (b10 == 24) {
            int i10 = ((ByteArrayInputStream) this.f34724c).read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f34725d = null;
            return i10 & 255;
        }
        byte[] bArr = this.f34723b;
        if (b10 == 25) {
            m13585J(2, bArr);
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (b10 == 26) {
            m13585J(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b10 != 27) {
            d1 d1Var = (d1) this.f34725d;
            throw new IOException(AbstractC5601a.m11235f("invalid additional information ", d1Var.f23637b, (d1Var.f23636a >> 5) & 7, " for major type "));
        }
        m13585J(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public C7274h(C7279m c7279m, String str, byte[] bArr) {
        this.f34722a = 0;
        this.f34725d = c7279m;
        c7279m.f34734a.getClass();
        this.f34724c = AbstractC2175d.m5852b(C7274h.class);
        this.f34726e = str;
        this.f34723b = bArr;
    }
}
