package p001o;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class yd5 implements uq6 {

    /* renamed from: b */
    public final pu4 f55289b;

    /* renamed from: c */
    public final long f55290c;

    /* renamed from: d */
    public long f55291d;

    /* renamed from: f */
    public int f55293f;

    /* renamed from: g */
    public int f55294g;

    /* renamed from: e */
    public byte[] f55292e = new byte[65536];

    /* renamed from: a */
    public final byte[] f55288a = new byte[4096];

    static {
        t2b.m49198a("media3.extractor");
    }

    public yd5(pu4 pu4Var, long j, long j2) {
        this.f55289b = pu4Var;
        this.f55291d = j;
        this.f55290c = j2;
    }

    @Override // p001o.uq6
    /* renamed from: a */
    public boolean mo40489a(byte[] bArr, int i, int i2, boolean z) {
        if (!mo40497l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f55292e, this.f55293f - i2, bArr, i, i2);
        return true;
    }

    @Override // p001o.uq6
    /* renamed from: c */
    public void mo40490c() {
        this.f55293f = 0;
    }

    @Override // p001o.uq6
    /* renamed from: d */
    public int mo40491d(int i) throws EOFException, InterruptedIOException {
        int iM57621r = m57621r(i);
        if (iM57621r == 0) {
            byte[] bArr = this.f55288a;
            iM57621r = m57620q(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m57617n(iM57621r);
        return iM57621r;
    }

    @Override // p001o.uq6
    /* renamed from: f */
    public boolean mo40492f(byte[] bArr, int i, int i2, boolean z) throws EOFException, InterruptedIOException {
        int iM57619p = m57619p(bArr, i, i2);
        while (iM57619p < i2 && iM57619p != -1) {
            iM57619p = m57620q(bArr, i, i2, iM57619p, z);
        }
        m57617n(iM57619p);
        return iM57619p != -1;
    }

    @Override // p001o.uq6
    /* renamed from: g */
    public long mo40493g() {
        return this.f55291d + this.f55293f;
    }

    @Override // p001o.uq6
    public long getLength() {
        return this.f55290c;
    }

    @Override // p001o.uq6
    public long getPosition() {
        return this.f55291d;
    }

    @Override // p001o.uq6
    /* renamed from: h */
    public void mo40494h(int i) throws EOFException, InterruptedIOException {
        mo40497l(i, false);
    }

    @Override // p001o.uq6
    /* renamed from: i */
    public int mo40495i(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        m57618o(i2);
        int i3 = this.f55294g;
        int i4 = this.f55293f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = m57620q(this.f55292e, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f55294g += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.f55292e, this.f55293f, bArr, i, iMin);
        this.f55293f += iMin;
        return iMin;
    }

    @Override // p001o.uq6
    /* renamed from: k */
    public void mo40496k(int i) throws EOFException, InterruptedIOException {
        m57622s(i, false);
    }

    @Override // p001o.uq6
    /* renamed from: l */
    public boolean mo40497l(int i, boolean z) throws EOFException, InterruptedIOException {
        m57618o(i);
        int iM57620q = this.f55294g - this.f55293f;
        while (iM57620q < i) {
            iM57620q = m57620q(this.f55292e, this.f55293f, i, iM57620q, z);
            if (iM57620q == -1) {
                return false;
            }
            this.f55294g = this.f55293f + iM57620q;
        }
        this.f55293f += i;
        return true;
    }

    @Override // p001o.uq6
    /* renamed from: m */
    public void mo40498m(byte[] bArr, int i, int i2) {
        mo40489a(bArr, i, i2, false);
    }

    /* renamed from: n */
    public final void m57617n(int i) {
        if (i != -1) {
            this.f55291d += i;
        }
    }

    /* renamed from: o */
    public final void m57618o(int i) {
        int i2 = this.f55293f + i;
        byte[] bArr = this.f55292e;
        if (i2 > bArr.length) {
            this.f55292e = Arrays.copyOf(this.f55292e, sqi.m48736o(bArr.length * 2, 65536 + i2, i2 + Opcodes.ASM8));
        }
    }

    /* renamed from: p */
    public final int m57619p(byte[] bArr, int i, int i2) {
        int i3 = this.f55294g;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.f55292e, 0, bArr, i, iMin);
        m57623t(iMin);
        return iMin;
    }

    /* renamed from: q */
    public final int m57620q(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.f55289b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: r */
    public final int m57621r(int i) {
        int iMin = Math.min(this.f55294g, i);
        m57623t(iMin);
        return iMin;
    }

    @Override // p001o.uq6, p001o.pu4
    public int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int iM57619p = m57619p(bArr, i, i2);
        if (iM57619p == 0) {
            iM57619p = m57620q(bArr, i, i2, 0, true);
        }
        m57617n(iM57619p);
        return iM57619p;
    }

    @Override // p001o.uq6
    public void readFully(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        mo40492f(bArr, i, i2, false);
    }

    /* renamed from: s */
    public boolean m57622s(int i, boolean z) throws EOFException, InterruptedIOException {
        int iM57621r = m57621r(i);
        while (iM57621r < i && iM57621r != -1) {
            iM57621r = m57620q(this.f55288a, -iM57621r, Math.min(i, this.f55288a.length + iM57621r), iM57621r, z);
        }
        m57617n(iM57621r);
        return iM57621r != -1;
    }

    /* renamed from: t */
    public final void m57623t(int i) {
        int i2 = this.f55294g - i;
        this.f55294g = i2;
        this.f55293f = 0;
        byte[] bArr = this.f55292e;
        byte[] bArr2 = i2 < bArr.length - Opcodes.ASM8 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f55292e = bArr2;
    }
}
