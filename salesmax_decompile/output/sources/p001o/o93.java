package p001o;

import java.util.Arrays;
import p001o.zaf;

/* loaded from: classes2.dex */
public final class o93 {

    /* renamed from: a */
    public final uth f37948a;

    /* renamed from: b */
    public final int f37949b;

    /* renamed from: c */
    public final int f37950c;

    /* renamed from: d */
    public final long f37951d;

    /* renamed from: e */
    public final int f37952e;

    /* renamed from: f */
    public int f37953f;

    /* renamed from: g */
    public int f37954g;

    /* renamed from: h */
    public int f37955h;

    /* renamed from: i */
    public int f37956i;

    /* renamed from: j */
    public int f37957j;

    /* renamed from: k */
    public long[] f37958k;

    /* renamed from: l */
    public int[] f37959l;

    public o93(int i, int i2, long j, int i3, uth uthVar) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        op0.m42511a(z);
        this.f37951d = j;
        this.f37952e = i3;
        this.f37948a = uthVar;
        this.f37949b = m41793d(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f37950c = i2 == 2 ? m41793d(i, 1650720768) : -1;
        this.f37958k = new long[512];
        this.f37959l = new int[512];
    }

    /* renamed from: d */
    public static int m41793d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* renamed from: a */
    public void m41794a() {
        this.f37955h++;
    }

    /* renamed from: b */
    public void m41795b(long j) {
        if (this.f37957j == this.f37959l.length) {
            long[] jArr = this.f37958k;
            this.f37958k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f37959l;
            this.f37959l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f37958k;
        int i = this.f37957j;
        jArr2[i] = j;
        this.f37959l[i] = this.f37956i;
        this.f37957j = i + 1;
    }

    /* renamed from: c */
    public void m41796c() {
        this.f37958k = Arrays.copyOf(this.f37958k, this.f37957j);
        this.f37959l = Arrays.copyOf(this.f37959l, this.f37957j);
    }

    /* renamed from: e */
    public final long m41797e(int i) {
        return (this.f37951d * i) / this.f37952e;
    }

    /* renamed from: f */
    public long m41798f() {
        return m41797e(this.f37955h);
    }

    /* renamed from: g */
    public long m41799g() {
        return m41797e(1);
    }

    /* renamed from: h */
    public final bbf m41800h(int i) {
        return new bbf(this.f37959l[i] * m41799g(), this.f37958k[i]);
    }

    /* renamed from: i */
    public zaf.C18603a m41801i(long j) {
        int iM41799g = (int) (j / m41799g());
        int iM48727f = sqi.m48727f(this.f37959l, iM41799g, true, true);
        if (this.f37959l[iM48727f] == iM41799g) {
            return new zaf.C18603a(m41800h(iM48727f));
        }
        bbf bbfVarM41800h = m41800h(iM48727f);
        int i = iM48727f + 1;
        return i < this.f37958k.length ? new zaf.C18603a(bbfVarM41800h, m41800h(i)) : new zaf.C18603a(bbfVarM41800h);
    }

    /* renamed from: j */
    public boolean m41802j(int i) {
        return this.f37949b == i || this.f37950c == i;
    }

    /* renamed from: k */
    public void m41803k() {
        this.f37956i++;
    }

    /* renamed from: l */
    public boolean m41804l() {
        return Arrays.binarySearch(this.f37959l, this.f37955h) >= 0;
    }

    /* renamed from: m */
    public boolean m41805m(uq6 uq6Var) {
        int i = this.f37954g;
        int iM52026c = i - this.f37948a.m52026c(uq6Var, i, false);
        this.f37954g = iM52026c;
        boolean z = iM52026c == 0;
        if (z) {
            if (this.f37953f > 0) {
                this.f37948a.mo7071a(m41798f(), m41804l() ? 1 : 0, this.f37953f, 0, null);
            }
            m41794a();
        }
        return z;
    }

    /* renamed from: n */
    public void m41806n(int i) {
        this.f37953f = i;
        this.f37954g = i;
    }

    /* renamed from: o */
    public void m41807o(long j) {
        if (this.f37957j == 0) {
            this.f37955h = 0;
        } else {
            this.f37955h = this.f37959l[sqi.m48728g(this.f37958k, j, true, true)];
        }
    }
}
