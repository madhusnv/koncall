package p001o;

/* loaded from: classes2.dex */
public final class eyh {

    /* renamed from: a */
    public final int f22405a;

    /* renamed from: d */
    public boolean f22408d;

    /* renamed from: e */
    public boolean f22409e;

    /* renamed from: f */
    public boolean f22410f;

    /* renamed from: b */
    public final umh f22406b = new umh(0);

    /* renamed from: g */
    public long f22411g = -9223372036854775807L;

    /* renamed from: h */
    public long f22412h = -9223372036854775807L;

    /* renamed from: i */
    public long f22413i = -9223372036854775807L;

    /* renamed from: c */
    public final zwc f22407c = new zwc();

    public eyh(int i) {
        this.f22405a = i;
    }

    /* renamed from: a */
    public final int m25846a(uq6 uq6Var) {
        this.f22407c.m60014R(sqi.f45795f);
        this.f22408d = true;
        uq6Var.mo40490c();
        return 0;
    }

    /* renamed from: b */
    public long m25847b() {
        return this.f22413i;
    }

    /* renamed from: c */
    public umh m25848c() {
        return this.f22406b;
    }

    /* renamed from: d */
    public boolean m25849d() {
        return this.f22408d;
    }

    /* renamed from: e */
    public int m25850e(uq6 uq6Var, ued uedVar, int i) {
        if (i <= 0) {
            return m25846a(uq6Var);
        }
        if (!this.f22410f) {
            return m25853h(uq6Var, uedVar, i);
        }
        if (this.f22412h == -9223372036854775807L) {
            return m25846a(uq6Var);
        }
        if (!this.f22409e) {
            return m25851f(uq6Var, uedVar, i);
        }
        long j = this.f22411g;
        if (j == -9223372036854775807L) {
            return m25846a(uq6Var);
        }
        this.f22413i = this.f22406b.m51796c(this.f22412h) - this.f22406b.m51795b(j);
        return m25846a(uq6Var);
    }

    /* renamed from: f */
    public final int m25851f(uq6 uq6Var, ued uedVar, int i) {
        int iMin = (int) Math.min(this.f22405a, uq6Var.getLength());
        long j = 0;
        if (uq6Var.getPosition() != j) {
            uedVar.f48772a = j;
            return 1;
        }
        this.f22407c.m60013Q(iMin);
        uq6Var.mo40490c();
        uq6Var.mo40498m(this.f22407c.m60024e(), 0, iMin);
        this.f22411g = m25852g(this.f22407c, i);
        this.f22409e = true;
        return 0;
    }

    /* renamed from: g */
    public final long m25852g(zwc zwcVar, int i) {
        int iM60026g = zwcVar.m60026g();
        for (int iM60025f = zwcVar.m60025f(); iM60025f < iM60026g; iM60025f++) {
            if (zwcVar.m60024e()[iM60025f] == 71) {
                long jM32916c = iyh.m32916c(zwcVar, iM60025f, i);
                if (jM32916c != -9223372036854775807L) {
                    return jM32916c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final int m25853h(uq6 uq6Var, ued uedVar, int i) {
        long length = uq6Var.getLength();
        int iMin = (int) Math.min(this.f22405a, length);
        long j = length - iMin;
        if (uq6Var.getPosition() != j) {
            uedVar.f48772a = j;
            return 1;
        }
        this.f22407c.m60013Q(iMin);
        uq6Var.mo40490c();
        uq6Var.mo40498m(this.f22407c.m60024e(), 0, iMin);
        this.f22412h = m25854i(this.f22407c, i);
        this.f22410f = true;
        return 0;
    }

    /* renamed from: i */
    public final long m25854i(zwc zwcVar, int i) {
        int iM60025f = zwcVar.m60025f();
        int iM60026g = zwcVar.m60026g();
        for (int i2 = iM60026g - 188; i2 >= iM60025f; i2--) {
            if (iyh.m32915b(zwcVar.m60024e(), iM60025f, iM60026g, i2)) {
                long jM32916c = iyh.m32916c(zwcVar, i2, i);
                if (jM32916c != -9223372036854775807L) {
                    return jM32916c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
