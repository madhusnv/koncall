package p001o;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class vd5 implements s26 {

    /* renamed from: a */
    public final byte[] f50144a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f50145b = new ArrayDeque();

    /* renamed from: c */
    public final dsi f50146c = new dsi();

    /* renamed from: d */
    public r26 f50147d;

    /* renamed from: e */
    public int f50148e;

    /* renamed from: f */
    public int f50149f;

    /* renamed from: g */
    public long f50150g;

    /* renamed from: o.vd5$b */
    public static final class C17550b {

        /* renamed from: a */
        public final int f50151a;

        /* renamed from: b */
        public final long f50152b;

        public C17550b(int i, long j) {
            this.f50151a = i;
            this.f50152b = j;
        }
    }

    /* renamed from: f */
    public static String m52581f(uq6 uq6Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        uq6Var.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // p001o.s26
    /* renamed from: a */
    public boolean mo47451a(uq6 uq6Var) throws byc {
        op0.m42519i(this.f50147d);
        while (true) {
            C17550b c17550b = (C17550b) this.f50145b.peek();
            if (c17550b != null && uq6Var.getPosition() >= c17550b.f50152b) {
                this.f50147d.mo46059a(((C17550b) this.f50145b.pop()).f50151a);
                return true;
            }
            if (this.f50148e == 0) {
                long jM23773d = this.f50146c.m23773d(uq6Var, true, false, 4);
                if (jM23773d == -2) {
                    jM23773d = m52582c(uq6Var);
                }
                if (jM23773d == -1) {
                    return false;
                }
                this.f50149f = (int) jM23773d;
                this.f50148e = 1;
            }
            if (this.f50148e == 1) {
                this.f50150g = this.f50146c.m23773d(uq6Var, false, true, 8);
                this.f50148e = 2;
            }
            int iMo46062d = this.f50147d.mo46062d(this.f50149f);
            if (iMo46062d != 0) {
                if (iMo46062d == 1) {
                    long position = uq6Var.getPosition();
                    this.f50145b.push(new C17550b(this.f50149f, this.f50150g + position));
                    this.f50147d.mo46066h(this.f50149f, position, this.f50150g);
                    this.f50148e = 0;
                    return true;
                }
                if (iMo46062d == 2) {
                    long j = this.f50150g;
                    if (j <= 8) {
                        this.f50147d.mo46061c(this.f50149f, m52584e(uq6Var, (int) j));
                        this.f50148e = 0;
                        return true;
                    }
                    throw byc.m19921a("Invalid integer size: " + this.f50150g, null);
                }
                if (iMo46062d == 3) {
                    long j2 = this.f50150g;
                    if (j2 <= 2147483647L) {
                        this.f50147d.mo46064f(this.f50149f, m52581f(uq6Var, (int) j2));
                        this.f50148e = 0;
                        return true;
                    }
                    throw byc.m19921a("String element size: " + this.f50150g, null);
                }
                if (iMo46062d == 4) {
                    this.f50147d.mo46065g(this.f50149f, (int) this.f50150g, uq6Var);
                    this.f50148e = 0;
                    return true;
                }
                if (iMo46062d != 5) {
                    throw byc.m19921a("Invalid element type " + iMo46062d, null);
                }
                long j3 = this.f50150g;
                if (j3 == 4 || j3 == 8) {
                    this.f50147d.mo46060b(this.f50149f, m52583d(uq6Var, (int) j3));
                    this.f50148e = 0;
                    return true;
                }
                throw byc.m19921a("Invalid float size: " + this.f50150g, null);
            }
            uq6Var.mo40496k((int) this.f50150g);
            this.f50148e = 0;
        }
    }

    @Override // p001o.s26
    /* renamed from: b */
    public void mo47452b(r26 r26Var) {
        this.f50147d = r26Var;
    }

    /* renamed from: c */
    public final long m52582c(uq6 uq6Var) {
        uq6Var.mo40490c();
        while (true) {
            uq6Var.mo40498m(this.f50144a, 0, 4);
            int iM23771c = dsi.m23771c(this.f50144a[0]);
            if (iM23771c != -1 && iM23771c <= 4) {
                int iM23770a = (int) dsi.m23770a(this.f50144a, iM23771c, false);
                if (this.f50147d.mo46063e(iM23770a)) {
                    uq6Var.mo40496k(iM23771c);
                    return iM23770a;
                }
            }
            uq6Var.mo40496k(1);
        }
    }

    /* renamed from: d */
    public final double m52583d(uq6 uq6Var, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m52584e(uq6Var, i));
    }

    /* renamed from: e */
    public final long m52584e(uq6 uq6Var, int i) {
        uq6Var.readFully(this.f50144a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f50144a[i2] & 255);
        }
        return j;
    }

    @Override // p001o.s26
    public void reset() {
        this.f50148e = 0;
        this.f50145b.clear();
        this.f50146c.m23774e();
    }
}
