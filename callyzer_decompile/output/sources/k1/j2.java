package k1;

import b00.InterfaceC0528m;
import c3.C0847b;
import c9.C0910e;
import eb.i3;
import iz.C3389v;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import p3.C5819q;
import sf.AbstractC6840z;
import ug.C7439j;
import yg.InterfaceC8647d;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 implements InterfaceC8647d {

    /* renamed from: a */
    public final /* synthetic */ int f20149a;

    /* renamed from: b */
    public long f20150b;

    /* renamed from: c */
    public Object f20151c;

    public /* synthetic */ j2(int i10, long j6, Object obj) {
        this.f20149a = i10;
        this.f20151c = obj;
        this.f20150b = j6;
    }

    /* renamed from: a */
    public long m8454a(C5819q c5819q, float f6) {
        long jM2276g = C0847b.m2276g(this.f20150b, C0847b.m2275f(c5819q.f28478c, c5819q.f28482g));
        this.f20150b = jM2276g;
        x0 x0Var = (x0) this.f20151c;
        if ((x0Var == null ? C0847b.m2272c(jM2276g) : Math.abs(m8460g(jM2276g))) < f6) {
            return 9205357640488583168L;
        }
        if (x0Var == null) {
            long j6 = this.f20150b;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / C0847b.m2272c(j6);
            return C0847b.m2275f(this.f20150b, C0847b.m2277h(f6, (4294967295L & Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) / r9)) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)));
        }
        float fM8460g = m8460g(this.f20150b) - (Math.signum(m8460g(this.f20150b)) * f6);
        long j10 = this.f20150b;
        x0 x0Var2 = x0.Horizontal;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (x0Var == x0Var2 ? j10 & 4294967295L : j10 >> 32));
        if (x0Var == x0Var2) {
            return (Float.floatToRawIntBits(fM8460g) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2));
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (4294967295L & Float.floatToRawIntBits(fM8460g));
    }

    /* renamed from: b */
    public void m8455b(int i10) {
        if (i10 < 64) {
            this.f20150b &= ~(1 << i10);
            return;
        }
        j2 j2Var = (j2) this.f20151c;
        if (j2Var != null) {
            j2Var.m8455b(i10 - 64);
        }
    }

    /* renamed from: c */
    public int m8456c(int i10) {
        j2 j2Var = (j2) this.f20151c;
        if (j2Var == null) {
            return i10 >= 64 ? Long.bitCount(this.f20150b) : Long.bitCount(this.f20150b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f20150b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f20150b) + j2Var.m8456c(i10 - 64);
    }

    /* renamed from: d */
    public void m8457d() {
        if (((j2) this.f20151c) == null) {
            this.f20151c = new j2();
        }
    }

    /* renamed from: e */
    public boolean m8458e(int i10) {
        if (i10 < 64) {
            return (this.f20150b & (1 << i10)) != 0;
        }
        m8457d();
        return ((j2) this.f20151c).m8458e(i10 - 64);
    }

    /* renamed from: f */
    public void m8459f(int i10, boolean z6) {
        if (i10 >= 64) {
            m8457d();
            ((j2) this.f20151c).m8459f(i10 - 64, z6);
            return;
        }
        long j6 = this.f20150b;
        boolean z10 = (Long.MIN_VALUE & j6) != 0;
        long j10 = (1 << i10) - 1;
        this.f20150b = ((j6 & (~j10)) << 1) | (j6 & j10);
        if (z6) {
            m8464k(i10);
        } else {
            m8455b(i10);
        }
        if (z10 || ((j2) this.f20151c) != null) {
            m8457d();
            ((j2) this.f20151c).m8459f(0, z10);
        }
    }

    /* renamed from: g */
    public float m8460g(long j6) {
        return Float.intBitsToFloat((int) (((x0) this.f20151c) == x0.Horizontal ? j6 >> 32 : j6 & 4294967295L));
    }

    /* renamed from: h */
    public C3389v m8461h() {
        i3 i3Var = new i3(2);
        while (true) {
            String strMo1541C = ((InterfaceC0528m) this.f20151c).mo1541C(this.f20150b);
            this.f20150b -= strMo1541C.length();
            if (strMo1541C.length() == 0) {
                return i3Var.m5727e();
            }
            int iM10098I = AbstractC5178p.m10098I(strMo1541C, ':', 1, 4);
            if (iM10098I != -1) {
                String strSubstring = strMo1541C.substring(0, iM10098I);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                String strSubstring2 = strMo1541C.substring(iM10098I + 1);
                AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                i3Var.m5724b(strSubstring, strSubstring2);
            } else if (strMo1541C.charAt(0) == ':') {
                String strSubstring3 = strMo1541C.substring(1);
                AbstractC4154l.m8922e(strSubstring3, "substring(...)");
                i3Var.m5724b("", strSubstring3);
            } else {
                i3Var.m5724b("", strMo1541C);
            }
        }
    }

    /* renamed from: i */
    public boolean m8462i(int i10) {
        if (i10 >= 64) {
            m8457d();
            return ((j2) this.f20151c).m8462i(i10 - 64);
        }
        long j6 = 1 << i10;
        long j10 = this.f20150b;
        boolean z6 = (j10 & j6) != 0;
        long j11 = j10 & (~j6);
        this.f20150b = j11;
        long j12 = j6 - 1;
        this.f20150b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        j2 j2Var = (j2) this.f20151c;
        if (j2Var != null) {
            if (j2Var.m8458e(0)) {
                m8464k(63);
            }
            ((j2) this.f20151c).m8462i(0);
        }
        return z6;
    }

    /* renamed from: j */
    public void m8463j() {
        this.f20150b = 0L;
        j2 j2Var = (j2) this.f20151c;
        if (j2Var != null) {
            j2Var.m8463j();
        }
    }

    /* renamed from: k */
    public void m8464k(int i10) {
        if (i10 < 64) {
            this.f20150b |= 1 << i10;
        } else {
            m8457d();
            ((j2) this.f20151c).m8464k(i10 - 64);
        }
    }

    @Override // yg.InterfaceC8647d
    /* renamed from: n */
    public void mo780n(Exception exc) {
        switch (this.f20149a) {
            case 1:
                C0910e c0910e = (C0910e) this.f20151c;
                ((AtomicLong) c0910e.f5580c).set(this.f20150b);
                break;
            default:
                C7439j c7439j = (C7439j) this.f20151c;
                ((AtomicLong) c7439j.f35539d).set(this.f20150b);
                break;
        }
    }

    public String toString() {
        switch (this.f20149a) {
            case 5:
                if (((j2) this.f20151c) == null) {
                    return Long.toBinaryString(this.f20150b);
                }
                return ((j2) this.f20151c).toString() + "xx" + Long.toBinaryString(this.f20150b);
            default:
                return super.toString();
        }
    }

    public j2(C8946a c8946a) {
        this.f20149a = 4;
        AbstractC6840z.m13036g(c8946a);
        this.f20151c = c8946a;
    }

    public j2(InterfaceC0528m source) {
        this.f20149a = 2;
        AbstractC4154l.m8923f(source, "source");
        this.f20151c = source;
        this.f20150b = 262144L;
    }

    public j2() {
        this.f20149a = 5;
        this.f20150b = 0L;
    }
}
