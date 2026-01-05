package p001o;

import androidx.media3.common.C2181a;
import androidx.media3.exoplayer.C2213j;
import p001o.gb3;
import p001o.x4b;

/* loaded from: classes2.dex */
public final class fb3 implements x4b, x4b.InterfaceC18049a {

    /* renamed from: a */
    public final x4b f23078a;

    /* renamed from: b */
    public x4b.InterfaceC18049a f23079b;

    /* renamed from: c */
    public C13381a[] f23080c = new C13381a[0];

    /* renamed from: d */
    public long f23081d;

    /* renamed from: e */
    public long f23082e;

    /* renamed from: f */
    public long f23083f;

    /* renamed from: g */
    public gb3.C13664b f23084g;

    /* renamed from: o.fb3$a */
    public final class C13381a implements t0f {

        /* renamed from: a */
        public final t0f f23085a;

        /* renamed from: b */
        public boolean f23086b;

        public C13381a(t0f t0fVar) {
            this.f23085a = t0fVar;
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() {
            this.f23085a.mo26371a();
        }

        /* renamed from: b */
        public void m26372b() {
            this.f23086b = false;
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            if (fb3.this.m26367l()) {
                return -3;
            }
            if (this.f23086b) {
                a85Var.m50154t(4);
                return -4;
            }
            long jMo7006g = fb3.this.mo7006g();
            int iMo26373f = this.f23085a.mo26373f(if7Var, a85Var, i);
            if (iMo26373f == -5) {
                C2181a c2181a = (C2181a) op0.m42515e(if7Var.f28594b);
                int i2 = c2181a.f7922E;
                if (i2 != 0 || c2181a.f7923F != 0) {
                    fb3 fb3Var = fb3.this;
                    if (fb3Var.f23082e != 0) {
                        i2 = 0;
                    }
                    if7Var.f28594b = c2181a.m6707a().m6759V(i2).m6760W(fb3Var.f23083f == Long.MIN_VALUE ? c2181a.f7923F : 0).m6748K();
                }
                return -5;
            }
            long j = fb3.this.f23083f;
            if (j == Long.MIN_VALUE || ((iMo26373f != -4 || a85Var.f14284f < j) && !(iMo26373f == -3 && jMo7006g == Long.MIN_VALUE && !a85Var.f14283e))) {
                return iMo26373f;
            }
            a85Var.mo16674h();
            a85Var.m50154t(4);
            this.f23086b = true;
            return -4;
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return !fb3.this.m26367l() && this.f23085a.isReady();
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            if (fb3.this.m26367l()) {
                return -3;
            }
            return this.f23085a.mo26374p(j);
        }
    }

    public fb3(x4b x4bVar, boolean z, long j, long j2) {
        this.f23078a = x4bVar;
        this.f23081d = z ? j : -9223372036854775807L;
        this.f23082e = j;
        this.f23083f = j2;
    }

    /* renamed from: p */
    public static boolean m26365p(long j, ko6[] ko6VarArr) {
        if (j != 0) {
            for (ko6 ko6Var : ko6VarArr) {
                if (ko6Var != null) {
                    C2181a c2181aMo22955q = ko6Var.mo22955q();
                    if (!xeb.m56173a(c2181aMo22955q.f7943n, c2181aMo22955q.f7939j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final abf m26366a(long j, abf abfVar) {
        long jM48737p = sqi.m48737p(abfVar.f14453a, 0L, j - this.f23082e);
        long j2 = abfVar.f14454b;
        long j3 = this.f23083f;
        long jM48737p2 = sqi.m48737p(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jM48737p == abfVar.f14453a && jM48737p2 == abfVar.f14454b) ? abfVar : new abf(jM48737p, jM48737p2);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f23078a.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        return this.f23078a.mo7003c(c2213j);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        long jMo7004d = this.f23078a.mo7004d();
        if (jMo7004d != Long.MIN_VALUE) {
            long j = this.f23083f;
            if (j == Long.MIN_VALUE || jMo7004d < j) {
                return jMo7004d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        long j2 = this.f23082e;
        if (j == j2) {
            return j2;
        }
        return this.f23078a.mo7005e(j, m26366a(j, abfVar));
    }

    @Override // p001o.x4b.InterfaceC18049a
    /* renamed from: f */
    public void mo7240f(x4b x4bVar) {
        if (this.f23084g != null) {
            return;
        }
        ((x4b.InterfaceC18049a) op0.m42515e(this.f23079b)).mo7240f(this);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        long jMo7006g = this.f23078a.mo7006g();
        if (jMo7006g != Long.MIN_VALUE) {
            long j = this.f23083f;
            if (j == Long.MIN_VALUE || jMo7006g < j) {
                return jMo7006g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        this.f23078a.mo7007h(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // p001o.x4b
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo7008i(long j) {
        this.f23081d = -9223372036854775807L;
        boolean z = false;
        for (C13381a c13381a : this.f23080c) {
            if (c13381a != null) {
                c13381a.m26372b();
            }
        }
        long jMo7008i = this.f23078a.mo7008i(j);
        if (jMo7008i == j) {
            z = true;
        } else if (jMo7008i >= this.f23082e) {
            long j2 = this.f23083f;
            if (j2 == Long.MIN_VALUE || jMo7008i <= j2) {
            }
        }
        op0.m42517g(z);
        return jMo7008i;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        if (m26367l()) {
            long j = this.f23081d;
            this.f23081d = -9223372036854775807L;
            long jMo7009j = mo7009j();
            return jMo7009j != -9223372036854775807L ? jMo7009j : j;
        }
        long jMo7009j2 = this.f23078a.mo7009j();
        if (jMo7009j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        op0.m42517g(jMo7009j2 >= this.f23082e);
        long j2 = this.f23083f;
        if (j2 != Long.MIN_VALUE && jMo7009j2 > j2) {
            z = false;
        }
        op0.m42517g(z);
        return jMo7009j2;
    }

    /* renamed from: l */
    public boolean m26367l() {
        return this.f23081d != -9223372036854775807L;
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo7010k(x4b x4bVar) {
        ((x4b.InterfaceC18049a) op0.m42515e(this.f23079b)).mo7010k(this);
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() throws gb3.C13664b {
        gb3.C13664b c13664b = this.f23084g;
        if (c13664b != null) {
            throw c13664b;
        }
        this.f23078a.mo7011n();
    }

    /* renamed from: o */
    public void m26369o(gb3.C13664b c13664b) {
        this.f23084g = c13664b;
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f23079b = interfaceC18049a;
        this.f23078a.mo7013q(this, j);
    }

    /* renamed from: r */
    public void m26370r(long j, long j2) {
        this.f23082e = j;
        this.f23083f = j2;
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f23078a.mo7014s();
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        this.f23078a.mo7015t(j, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // p001o.x4b
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f23080c = new C13381a[t0fVarArr.length];
        t0f[] t0fVarArr2 = new t0f[t0fVarArr.length];
        int i = 0;
        while (true) {
            t0f t0fVar = null;
            if (i >= t0fVarArr.length) {
                break;
            }
            C13381a[] c13381aArr = this.f23080c;
            C13381a c13381a = (C13381a) t0fVarArr[i];
            c13381aArr[i] = c13381a;
            if (c13381a != null) {
                t0fVar = c13381a.f23085a;
            }
            t0fVarArr2[i] = t0fVar;
            i++;
        }
        long jMo7016u = this.f23078a.mo7016u(ko6VarArr, zArr, t0fVarArr2, zArr2, j);
        if (m26367l()) {
            long j3 = this.f23082e;
            j2 = (j == j3 && m26365p(j3, ko6VarArr)) ? jMo7016u : -9223372036854775807L;
        }
        this.f23081d = j2;
        if (jMo7016u == j) {
            z = true;
        } else {
            if (jMo7016u >= this.f23082e) {
                long j4 = this.f23083f;
                if (j4 == Long.MIN_VALUE || jMo7016u <= j4) {
                }
            }
            z = false;
        }
        op0.m42517g(z);
        for (int i2 = 0; i2 < t0fVarArr.length; i2++) {
            t0f t0fVar2 = t0fVarArr2[i2];
            if (t0fVar2 == null) {
                this.f23080c[i2] = null;
            } else {
                C13381a[] c13381aArr2 = this.f23080c;
                C13381a c13381a2 = c13381aArr2[i2];
                if (c13381a2 == null || c13381a2.f23085a != t0fVar2) {
                    c13381aArr2[i2] = new C13381a(t0fVar2);
                }
            }
            t0fVarArr[i2] = this.f23080c[i2];
        }
        return jMo7016u;
    }
}
