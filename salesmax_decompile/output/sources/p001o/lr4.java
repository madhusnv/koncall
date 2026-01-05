package p001o;

/* loaded from: classes2.dex */
public final class lr4 implements jr4 {

    /* renamed from: a */
    public final n93 f34286a;

    /* renamed from: b */
    public final long f34287b;

    public lr4(n93 n93Var, long j) {
        this.f34286a = n93Var;
        this.f34287b = j;
    }

    @Override // p001o.jr4
    /* renamed from: b */
    public long mo34363b(long j) {
        return this.f34286a.f36582e[(int) j] - this.f34287b;
    }

    @Override // p001o.jr4
    /* renamed from: c */
    public long mo34364c(long j, long j2) {
        return this.f34286a.f36581d[(int) j];
    }

    @Override // p001o.jr4
    /* renamed from: d */
    public long mo34365d(long j, long j2) {
        return 0L;
    }

    @Override // p001o.jr4
    /* renamed from: e */
    public long mo34366e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // p001o.jr4
    /* renamed from: f */
    public zbe mo34367f(long j) {
        return new zbe(null, this.f34286a.f36580c[(int) j], r0.f36579b[r8]);
    }

    @Override // p001o.jr4
    /* renamed from: g */
    public long mo34368g(long j, long j2) {
        return this.f34286a.m40253a(j + this.f34287b);
    }

    @Override // p001o.jr4
    /* renamed from: h */
    public long mo34369h(long j) {
        return this.f34286a.f36578a;
    }

    @Override // p001o.jr4
    /* renamed from: i */
    public boolean mo34370i() {
        return true;
    }

    @Override // p001o.jr4
    /* renamed from: j */
    public long mo34371j() {
        return 0L;
    }

    @Override // p001o.jr4
    /* renamed from: k */
    public long mo34372k(long j, long j2) {
        return this.f34286a.f36578a;
    }
}
