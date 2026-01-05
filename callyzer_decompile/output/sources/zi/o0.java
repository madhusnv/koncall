package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public long f43221a;

    /* renamed from: b */
    public String f43222b;

    /* renamed from: c */
    public d2 f43223c;

    /* renamed from: d */
    public e2 f43224d;

    /* renamed from: e */
    public f2 f43225e;

    /* renamed from: f */
    public i2 f43226f;

    /* renamed from: g */
    public byte f43227g;

    /* renamed from: a */
    public final p0 m16452a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f43227g == 1 && (str = this.f43222b) != null && (d2Var = this.f43223c) != null && (e2Var = this.f43224d) != null) {
            return new p0(this.f43221a, str, d2Var, e2Var, this.f43225e, this.f43226f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f43227g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f43222b == null) {
            sb2.append(" type");
        }
        if (this.f43223c == null) {
            sb2.append(" app");
        }
        if (this.f43224d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
