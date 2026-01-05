package p001o;

import androidx.media3.exoplayer.C2213j;
import p001o.x4b;

/* loaded from: classes2.dex */
public final class ylh implements x4b, x4b.InterfaceC18049a {

    /* renamed from: a */
    public final x4b f55684a;

    /* renamed from: b */
    public final long f55685b;

    /* renamed from: c */
    public x4b.InterfaceC18049a f55686c;

    /* renamed from: o.ylh$a */
    public static final class C18429a implements t0f {

        /* renamed from: a */
        public final t0f f55687a;

        /* renamed from: b */
        public final long f55688b;

        public C18429a(t0f t0fVar, long j) {
            this.f55687a = t0fVar;
            this.f55688b = j;
        }

        @Override // p001o.t0f
        /* renamed from: a */
        public void mo26371a() {
            this.f55687a.mo26371a();
        }

        /* renamed from: b */
        public t0f m57990b() {
            return this.f55687a;
        }

        @Override // p001o.t0f
        /* renamed from: f */
        public int mo26373f(if7 if7Var, a85 a85Var, int i) {
            int iMo26373f = this.f55687a.mo26373f(if7Var, a85Var, i);
            if (iMo26373f == -4) {
                a85Var.f14284f += this.f55688b;
            }
            return iMo26373f;
        }

        @Override // p001o.t0f
        public boolean isReady() {
            return this.f55687a.isReady();
        }

        @Override // p001o.t0f
        /* renamed from: p */
        public int mo26374p(long j) {
            return this.f55687a.mo26374p(j - this.f55688b);
        }
    }

    public ylh(x4b x4bVar, long j) {
        this.f55684a = x4bVar;
        this.f55685b = j;
    }

    /* renamed from: a */
    public x4b m57988a() {
        return this.f55684a;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: b */
    public boolean mo7002b() {
        return this.f55684a.mo7002b();
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: c */
    public boolean mo7003c(C2213j c2213j) {
        return this.f55684a.mo7003c(c2213j.m7267a().m7273f(c2213j.f8421a - this.f55685b).m7271d());
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: d */
    public long mo7004d() {
        long jMo7004d = this.f55684a.mo7004d();
        if (jMo7004d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f55685b + jMo7004d;
    }

    @Override // p001o.x4b
    /* renamed from: e */
    public long mo7005e(long j, abf abfVar) {
        return this.f55684a.mo7005e(j - this.f55685b, abfVar) + this.f55685b;
    }

    @Override // p001o.x4b.InterfaceC18049a
    /* renamed from: f */
    public void mo7240f(x4b x4bVar) {
        ((x4b.InterfaceC18049a) op0.m42515e(this.f55686c)).mo7240f(this);
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: g */
    public long mo7006g() {
        long jMo7006g = this.f55684a.mo7006g();
        if (jMo7006g == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f55685b + jMo7006g;
    }

    @Override // p001o.x4b, p001o.lef
    /* renamed from: h */
    public void mo7007h(long j) {
        this.f55684a.mo7007h(j - this.f55685b);
    }

    @Override // p001o.x4b
    /* renamed from: i */
    public long mo7008i(long j) {
        return this.f55684a.mo7008i(j - this.f55685b) + this.f55685b;
    }

    @Override // p001o.x4b
    /* renamed from: j */
    public long mo7009j() {
        long jMo7009j = this.f55684a.mo7009j();
        if (jMo7009j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f55685b + jMo7009j;
    }

    @Override // p001o.lef.InterfaceC15066a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo7010k(x4b x4bVar) {
        ((x4b.InterfaceC18049a) op0.m42515e(this.f55686c)).mo7010k(this);
    }

    @Override // p001o.x4b
    /* renamed from: n */
    public void mo7011n() {
        this.f55684a.mo7011n();
    }

    @Override // p001o.x4b
    /* renamed from: q */
    public void mo7013q(x4b.InterfaceC18049a interfaceC18049a, long j) {
        this.f55686c = interfaceC18049a;
        this.f55684a.mo7013q(this, j - this.f55685b);
    }

    @Override // p001o.x4b
    /* renamed from: s */
    public sth mo7014s() {
        return this.f55684a.mo7014s();
    }

    @Override // p001o.x4b
    /* renamed from: t */
    public void mo7015t(long j, boolean z) {
        this.f55684a.mo7015t(j - this.f55685b, z);
    }

    @Override // p001o.x4b
    /* renamed from: u */
    public long mo7016u(ko6[] ko6VarArr, boolean[] zArr, t0f[] t0fVarArr, boolean[] zArr2, long j) {
        t0f[] t0fVarArr2 = new t0f[t0fVarArr.length];
        int i = 0;
        while (true) {
            t0f t0fVarM57990b = null;
            if (i >= t0fVarArr.length) {
                break;
            }
            C18429a c18429a = (C18429a) t0fVarArr[i];
            if (c18429a != null) {
                t0fVarM57990b = c18429a.m57990b();
            }
            t0fVarArr2[i] = t0fVarM57990b;
            i++;
        }
        long jMo7016u = this.f55684a.mo7016u(ko6VarArr, zArr, t0fVarArr2, zArr2, j - this.f55685b);
        for (int i2 = 0; i2 < t0fVarArr.length; i2++) {
            t0f t0fVar = t0fVarArr2[i2];
            if (t0fVar == null) {
                t0fVarArr[i2] = null;
            } else {
                t0f t0fVar2 = t0fVarArr[i2];
                if (t0fVar2 == null || ((C18429a) t0fVar2).m57990b() != t0fVar) {
                    t0fVarArr[i2] = new C18429a(t0fVar, this.f55685b);
                }
            }
        }
        return jMo7016u + this.f55685b;
    }
}
