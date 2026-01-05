package b2;

import ex.InterfaceC2139c;
import g4.C2492h;
import g4.C2501q;
import java.text.BreakIterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4356a;
import l4.C4379x;
import l4.C4381z;
import l4.InterfaceC4362g;
import l4.InterfaceC4374s;
import og.pe;
import og.yf;
import r4.EnumC6455j;
import x1.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public final C2492h f3809a;

    /* renamed from: b */
    public final long f3810b;

    /* renamed from: c */
    public final g4.l0 f3811c;

    /* renamed from: d */
    public final InterfaceC4374s f3812d;

    /* renamed from: e */
    public final g1 f3813e;

    /* renamed from: f */
    public long f3814f;

    /* renamed from: g */
    public final C2492h f3815g;

    /* renamed from: h */
    public final C4381z f3816h;

    /* renamed from: i */
    public final r1 f3817i;

    public r0(C4381z c4381z, InterfaceC4374s interfaceC4374s, r1 r1Var, g1 g1Var) {
        C2492h c2492h = c4381z.f21945a;
        long j6 = c4381z.f21946b;
        g4.l0 l0Var = r1Var != null ? r1Var.f39668a : null;
        this.f3809a = c2492h;
        this.f3810b = j6;
        this.f3811c = l0Var;
        this.f3812d = interfaceC4374s;
        this.f3813e = g1Var;
        this.f3814f = j6;
        this.f3815g = c2492h;
        this.f3816h = c4381z;
        this.f3817i = r1Var;
    }

    /* renamed from: a */
    public final List m1661a(InterfaceC2139c interfaceC2139c) {
        if (!g4.n0.m6455b(this.f3814f)) {
            return pe.m10834i(new C4356a("", 0), new C4379x(g4.n0.m6458e(this.f3814f), g4.n0.m6458e(this.f3814f)));
        }
        InterfaceC4362g interfaceC4362g = (InterfaceC4362g) interfaceC2139c.invoke(this);
        if (interfaceC4362g != null) {
            return pe.m10833h(interfaceC4362g);
        }
        return null;
    }

    /* renamed from: b */
    public final Integer m1662b() {
        g4.l0 l0Var = this.f3811c;
        if (l0Var == null) {
            return null;
        }
        C2501q c2501q = l0Var.f13671b;
        int iM6457d = g4.n0.m6457d(this.f3814f);
        InterfaceC4374s interfaceC4374s = this.f3812d;
        return Integer.valueOf(interfaceC4374s.mo2753w(c2501q.m6470c(c2501q.m6471d(interfaceC4374s.mo2733Y(iM6457d)), true)));
    }

    /* renamed from: c */
    public final Integer m1663c() {
        g4.l0 l0Var = this.f3811c;
        if (l0Var == null) {
            return null;
        }
        int iM6458e = g4.n0.m6458e(this.f3814f);
        InterfaceC4374s interfaceC4374s = this.f3812d;
        return Integer.valueOf(interfaceC4374s.mo2753w(l0Var.m6449g(l0Var.f13671b.m6471d(interfaceC4374s.mo2733Y(iM6458e)))));
    }

    /* renamed from: d */
    public final Integer m1664d() {
        int length;
        g4.l0 l0Var = this.f3811c;
        if (l0Var == null) {
            return null;
        }
        int iM1677q = m1677q();
        while (true) {
            C2492h c2492h = this.f3809a;
            if (iM1677q < c2492h.f13620b.length()) {
                int length2 = this.f3815g.f13620b.length() - 1;
                if (iM1677q <= length2) {
                    length2 = iM1677q;
                }
                long jM6452j = l0Var.m6452j(length2);
                int i10 = g4.n0.f13685c;
                int i11 = (int) (jM6452j & 4294967295L);
                if (i11 > iM1677q) {
                    length = this.f3812d.mo2753w(i11);
                    break;
                }
                iM1677q++;
            } else {
                length = c2492h.f13620b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* renamed from: e */
    public final Integer m1665e() {
        int iMo2753w;
        g4.l0 l0Var = this.f3811c;
        if (l0Var == null) {
            return null;
        }
        int iM1677q = m1677q();
        while (true) {
            if (iM1677q <= 0) {
                iMo2753w = 0;
                break;
            }
            int length = this.f3815g.f13620b.length() - 1;
            if (iM1677q <= length) {
                length = iM1677q;
            }
            long jM6452j = l0Var.m6452j(length);
            int i10 = g4.n0.f13685c;
            int i11 = (int) (jM6452j >> 32);
            if (i11 < iM1677q) {
                iMo2753w = this.f3812d.mo2753w(i11);
                break;
            }
            iM1677q--;
        }
        return Integer.valueOf(iMo2753w);
    }

    /* renamed from: f */
    public final boolean m1666f() {
        g4.l0 l0Var = this.f3811c;
        return (l0Var != null ? l0Var.m6450h(m1677q()) : null) != EnumC6455j.Rtl;
    }

    /* renamed from: g */
    public final int m1667g(g4.l0 l0Var, int i10) {
        int iM1677q = m1677q();
        g1 g1Var = this.f3813e;
        if (g1Var.f3748a == null) {
            g1Var.f3748a = Float.valueOf(l0Var.m6445c(iM1677q).f5354a);
        }
        C2501q c2501q = l0Var.f13671b;
        int iM6471d = c2501q.m6471d(iM1677q) + i10;
        if (iM6471d < 0) {
            return 0;
        }
        if (iM6471d >= c2501q.f13702f) {
            return this.f3815g.f13620b.length();
        }
        float fM6469b = c2501q.m6469b(iM6471d) - 1;
        Float f6 = g1Var.f3748a;
        AbstractC4154l.m8920c(f6);
        float fFloatValue = f6.floatValue();
        if ((m1666f() && fFloatValue >= l0Var.m6448f(iM6471d)) || (!m1666f() && fFloatValue <= l0Var.m6447e(iM6471d))) {
            return c2501q.m6470c(iM6471d, true);
        }
        return this.f3812d.mo2753w(c2501q.m6474g((Float.floatToRawIntBits(fM6469b) & 4294967295L) | (Float.floatToRawIntBits(f6.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1668h(x1.r1 r9, int r10) {
        /*
            r8 = this;
            t3.t r0 = r9.f39669b
            g4.l0 r1 = r9.f39668a
            if (r0 == 0) goto L13
            t3.t r9 = r9.f39670c
            if (r9 == 0) goto L10
            r2 = 1
            c3.c r9 = r9.mo13298S(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            c3.c r9 = c3.C0848c.f5353e
        L15:
            l4.z r0 = r8.f3816h
            long r2 = r0.f21946b
            int r0 = g4.n0.f13685c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            l4.s r2 = r8.f3812d
            int r0 = r2.mo2733Y(r0)
            c3.c r0 = r1.m6445c(r0)
            float r3 = r0.f5354a
            float r0 = r0.f5355b
            long r6 = r9.m2281c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            g4.q r0 = r1.f13671b
            int r9 = r0.m6474g(r9)
            int r9 = r2.mo2753w(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.r0.m1668h(x1.r1, int):int");
    }

    /* renamed from: i */
    public final void m1669i() {
        g1 g1Var = this.f3813e;
        g1Var.f3748a = null;
        C2492h c2492h = this.f3815g;
        if (c2492h.f13620b.length() > 0) {
            if (m1666f()) {
                g1Var.f3748a = null;
                if (c2492h.f13620b.length() > 0) {
                    String str = c2492h.f13620b;
                    long j6 = this.f3814f;
                    int i10 = g4.n0.f13685c;
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(str);
                    int iPreceding = characterInstance.preceding((int) (j6 & 4294967295L));
                    if (iPreceding != -1) {
                        m1676p(iPreceding, iPreceding);
                        return;
                    }
                    return;
                }
                return;
            }
            g1Var.f3748a = null;
            if (c2492h.f13620b.length() > 0) {
                String str2 = c2492h.f13620b;
                long j10 = this.f3814f;
                int i11 = g4.n0.f13685c;
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(str2);
                int iFollowing = characterInstance2.following((int) (j10 & 4294967295L));
                if (iFollowing != -1) {
                    m1676p(iFollowing, iFollowing);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m1670j() {
        this.f3813e.f3748a = null;
        C2492h c2492h = this.f3815g;
        String str = c2492h.f13620b;
        String str2 = c2492h.f13620b;
        if (str.length() > 0) {
            int iM15458r = x1.r0.m15458r(str2, g4.n0.m6457d(this.f3814f));
            if (iM15458r == g4.n0.m6457d(this.f3814f) && iM15458r != str2.length()) {
                iM15458r = x1.r0.m15458r(str2, iM15458r + 1);
            }
            m1676p(iM15458r, iM15458r);
        }
    }

    /* renamed from: k */
    public final void m1671k() {
        this.f3813e.f3748a = null;
        C2492h c2492h = this.f3815g;
        String str = c2492h.f13620b;
        String str2 = c2492h.f13620b;
        if (str.length() > 0) {
            int iM15459s = x1.r0.m15459s(str2, g4.n0.m6458e(this.f3814f));
            if (iM15459s == g4.n0.m6458e(this.f3814f) && iM15459s != 0) {
                iM15459s = x1.r0.m15459s(str2, iM15459s - 1);
            }
            m1676p(iM15459s, iM15459s);
        }
    }

    /* renamed from: l */
    public final void m1672l() {
        g1 g1Var = this.f3813e;
        g1Var.f3748a = null;
        C2492h c2492h = this.f3815g;
        if (c2492h.f13620b.length() > 0) {
            if (m1666f()) {
                g1Var.f3748a = null;
                if (c2492h.f13620b.length() > 0) {
                    String str = c2492h.f13620b;
                    long j6 = this.f3814f;
                    int i10 = g4.n0.f13685c;
                    BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                    characterInstance.setText(str);
                    int iFollowing = characterInstance.following((int) (j6 & 4294967295L));
                    if (iFollowing != -1) {
                        m1676p(iFollowing, iFollowing);
                        return;
                    }
                    return;
                }
                return;
            }
            g1Var.f3748a = null;
            if (c2492h.f13620b.length() > 0) {
                String str2 = c2492h.f13620b;
                long j10 = this.f3814f;
                int i11 = g4.n0.f13685c;
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(str2);
                int iPreceding = characterInstance2.preceding((int) (j10 & 4294967295L));
                if (iPreceding != -1) {
                    m1676p(iPreceding, iPreceding);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m1673m() {
        Integer numM1662b;
        this.f3813e.f3748a = null;
        if (this.f3815g.f13620b.length() <= 0 || (numM1662b = m1662b()) == null) {
            return;
        }
        int iIntValue = numM1662b.intValue();
        m1676p(iIntValue, iIntValue);
    }

    /* renamed from: n */
    public final void m1674n() {
        Integer numM1663c;
        this.f3813e.f3748a = null;
        if (this.f3815g.f13620b.length() <= 0 || (numM1663c = m1663c()) == null) {
            return;
        }
        int iIntValue = numM1663c.intValue();
        m1676p(iIntValue, iIntValue);
    }

    /* renamed from: o */
    public final void m1675o() {
        if (this.f3815g.f13620b.length() > 0) {
            int i10 = g4.n0.f13685c;
            this.f3814f = yf.m11072a((int) (this.f3810b >> 32), (int) (this.f3814f & 4294967295L));
        }
    }

    /* renamed from: p */
    public final void m1676p(int i10, int i11) {
        this.f3814f = yf.m11072a(i10, i11);
    }

    /* renamed from: q */
    public final int m1677q() {
        long j6 = this.f3814f;
        int i10 = g4.n0.f13685c;
        return this.f3812d.mo2733Y((int) (j6 & 4294967295L));
    }
}
