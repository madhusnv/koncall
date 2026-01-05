package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
public final class C0317l {

    /* renamed from: a */
    public final AbstractC0315j f2362a;

    /* renamed from: b */
    public int f2363b;

    /* renamed from: c */
    public int f2364c;

    /* renamed from: d */
    public int f2365d = 0;

    public C0317l(AbstractC0315j abstractC0315j) {
        Charset charset = b0.f2293a;
        this.f2362a = abstractC0315j;
        abstractC0315j.f2355b = this;
    }

    /* renamed from: a */
    public final int m938a() {
        int i10 = this.f2365d;
        if (i10 != 0) {
            this.f2363b = i10;
            this.f2365d = 0;
        } else {
            this.f2363b = this.f2362a.mo903z();
        }
        int i11 = this.f2363b;
        if (i11 == 0 || i11 == this.f2364c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    /* renamed from: b */
    public final void m939b(Object obj, a1 a1Var, C0320o c0320o) {
        int i10 = this.f2364c;
        this.f2364c = ((this.f2363b >>> 3) << 3) | 4;
        try {
            a1Var.mo818i(obj, this, c0320o);
            if (this.f2363b == this.f2364c) {
            } else {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
        } finally {
            this.f2364c = i10;
        }
    }

    /* renamed from: c */
    public final void m940c(Object obj, a1 a1Var, C0320o c0320o) throws InvalidProtocolBufferException {
        AbstractC0315j abstractC0315j = this.f2362a;
        int iMo873A = abstractC0315j.mo873A();
        if (abstractC0315j.f2354a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo887j = abstractC0315j.mo887j(iMo873A);
        abstractC0315j.f2354a++;
        a1Var.mo818i(obj, this, c0320o);
        abstractC0315j.mo883a(0);
        abstractC0315j.f2354a--;
        abstractC0315j.mo886i(iMo887j);
    }

    /* renamed from: d */
    public final void m941d(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Boolean.valueOf(abstractC0315j.mo888k()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Boolean.valueOf(abstractC0315j.mo888k()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: e */
    public final C0312g m942e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m960w(2);
        return this.f2362a.mo889l();
    }

    /* renamed from: f */
    public final void m943f(a0 a0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo903z;
        if ((this.f2363b & 7) != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            ((y0) a0Var).add(m942e());
            AbstractC0315j abstractC0315j = this.f2362a;
            if (abstractC0315j.mo885c()) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == this.f2363b);
        this.f2365d = iMo903z;
    }

    /* renamed from: g */
    public final void m944g(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 1) {
            do {
                ((y0) a0Var).add(Double.valueOf(abstractC0315j.mo890m()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo873A = abstractC0315j.mo873A();
        if ((iMo873A & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo884b = abstractC0315j.mo884b() + iMo873A;
        do {
            ((y0) a0Var).add(Double.valueOf(abstractC0315j.mo890m()));
        } while (abstractC0315j.mo884b() < iMo884b);
    }

    /* renamed from: h */
    public final void m945h(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo891n()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo891n()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: i */
    public final Object m946i(s1 s1Var, Class cls, C0320o c0320o) throws InvalidProtocolBufferException {
        int i10 = AbstractC0316k.f2359a[s1Var.ordinal()];
        AbstractC0315j abstractC0315j = this.f2362a;
        switch (i10) {
            case 1:
                m960w(0);
                return Boolean.valueOf(abstractC0315j.mo888k());
            case 2:
                return m942e();
            case 3:
                m960w(1);
                return Double.valueOf(abstractC0315j.mo890m());
            case 4:
                m960w(0);
                return Integer.valueOf(abstractC0315j.mo891n());
            case 5:
                m960w(5);
                return Integer.valueOf(abstractC0315j.mo892o());
            case 6:
                m960w(1);
                return Long.valueOf(abstractC0315j.mo893p());
            case 7:
                m960w(5);
                return Float.valueOf(abstractC0315j.mo894q());
            case 8:
                m960w(0);
                return Integer.valueOf(abstractC0315j.mo895r());
            case 9:
                m960w(0);
                return Long.valueOf(abstractC0315j.mo896s());
            case 10:
                m960w(2);
                a1 a1VarM1073a = x0.f2424c.m1073a(cls);
                AbstractC0335z abstractC0335zMo812c = a1VarM1073a.mo812c();
                m940c(abstractC0335zMo812c, a1VarM1073a, c0320o);
                a1VarM1073a.mo810a(abstractC0335zMo812c);
                return abstractC0335zMo812c;
            case 11:
                m960w(5);
                return Integer.valueOf(abstractC0315j.mo897t());
            case 12:
                m960w(1);
                return Long.valueOf(abstractC0315j.mo898u());
            case 13:
                m960w(0);
                return Integer.valueOf(abstractC0315j.mo899v());
            case 14:
                m960w(0);
                return Long.valueOf(abstractC0315j.mo900w());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m960w(2);
                return abstractC0315j.mo902y();
            case 16:
                m960w(0);
                return Integer.valueOf(abstractC0315j.mo873A());
            case 17:
                m960w(0);
                return Long.valueOf(abstractC0315j.mo874B());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: j */
    public final void m947j(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 2) {
            int iMo873A = abstractC0315j.mo873A();
            if ((iMo873A & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo884b = abstractC0315j.mo884b() + iMo873A;
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo892o()));
            } while (abstractC0315j.mo884b() < iMo884b);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo892o()));
            if (abstractC0315j.mo885c()) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == this.f2363b);
        this.f2365d = iMo903z;
    }

    /* renamed from: k */
    public final void m948k(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 1) {
            do {
                ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo893p()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo873A = abstractC0315j.mo873A();
        if ((iMo873A & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo884b = abstractC0315j.mo884b() + iMo873A;
        do {
            ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo893p()));
        } while (abstractC0315j.mo884b() < iMo884b);
    }

    /* renamed from: l */
    public final void m949l(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 2) {
            int iMo873A = abstractC0315j.mo873A();
            if ((iMo873A & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo884b = abstractC0315j.mo884b() + iMo873A;
            do {
                ((y0) a0Var).add(Float.valueOf(abstractC0315j.mo894q()));
            } while (abstractC0315j.mo884b() < iMo884b);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            ((y0) a0Var).add(Float.valueOf(abstractC0315j.mo894q()));
            if (abstractC0315j.mo885c()) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == this.f2363b);
        this.f2365d = iMo903z;
    }

    /* renamed from: m */
    public final void m950m(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo895r()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo895r()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: n */
    public final void m951n(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo896s()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo896s()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: o */
    public final void m952o(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 2) {
            int iMo873A = abstractC0315j.mo873A();
            if ((iMo873A & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo884b = abstractC0315j.mo884b() + iMo873A;
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo897t()));
            } while (abstractC0315j.mo884b() < iMo884b);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo897t()));
            if (abstractC0315j.mo885c()) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == this.f2363b);
        this.f2365d = iMo903z;
    }

    /* renamed from: p */
    public final void m953p(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 1) {
            do {
                ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo898u()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo873A = abstractC0315j.mo873A();
        if ((iMo873A & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo884b = abstractC0315j.mo884b() + iMo873A;
        do {
            ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo898u()));
        } while (abstractC0315j.mo884b() < iMo884b);
    }

    /* renamed from: q */
    public final void m954q(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo899v()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo899v()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: r */
    public final void m955r(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo900w()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo900w()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: s */
    public final void m956s(a0 a0Var, boolean z6) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo901x;
        int iMo903z;
        if ((this.f2363b & 7) != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        do {
            AbstractC0315j abstractC0315j = this.f2362a;
            if (z6) {
                m960w(2);
                strMo901x = abstractC0315j.mo902y();
            } else {
                m960w(2);
                strMo901x = abstractC0315j.mo901x();
            }
            ((y0) a0Var).add(strMo901x);
            if (abstractC0315j.mo885c()) {
                return;
            } else {
                iMo903z = abstractC0315j.mo903z();
            }
        } while (iMo903z == this.f2363b);
        this.f2365d = iMo903z;
    }

    /* renamed from: t */
    public final void m957t(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo873A()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Integer.valueOf(abstractC0315j.mo873A()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: u */
    public final void m958u(a0 a0Var) throws InvalidProtocolBufferException {
        int iMo903z;
        int i10 = this.f2363b & 7;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (i10 == 0) {
            do {
                ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo874B()));
                if (abstractC0315j.mo885c()) {
                    return;
                } else {
                    iMo903z = abstractC0315j.mo903z();
                }
            } while (iMo903z == this.f2363b);
            this.f2365d = iMo903z;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.m804b();
        }
        int iMo884b = abstractC0315j.mo884b() + abstractC0315j.mo873A();
        do {
            ((y0) a0Var).add(Long.valueOf(abstractC0315j.mo874B()));
        } while (abstractC0315j.mo884b() < iMo884b);
        m959v(iMo884b);
    }

    /* renamed from: v */
    public final void m959v(int i10) throws InvalidProtocolBufferException {
        if (this.f2362a.mo884b() != i10) {
            throw InvalidProtocolBufferException.m807e();
        }
    }

    /* renamed from: w */
    public final void m960w(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f2363b & 7) != i10) {
            throw InvalidProtocolBufferException.m804b();
        }
    }

    /* renamed from: x */
    public final boolean m961x() {
        int i10;
        AbstractC0315j abstractC0315j = this.f2362a;
        if (abstractC0315j.mo885c() || (i10 = this.f2363b) == this.f2364c) {
            return false;
        }
        return abstractC0315j.mo875C(i10);
    }
}
