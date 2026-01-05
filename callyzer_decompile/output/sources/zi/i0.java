package zi;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public String f43107a;

    /* renamed from: b */
    public String f43108b;

    /* renamed from: c */
    public String f43109c;

    /* renamed from: d */
    public long f43110d;

    /* renamed from: e */
    public Long f43111e;

    /* renamed from: f */
    public boolean f43112f;

    /* renamed from: g */
    public u1 f43113g;

    /* renamed from: h */
    public l2 f43114h;

    /* renamed from: i */
    public k2 f43115i;

    /* renamed from: j */
    public v1 f43116j;

    /* renamed from: k */
    public List f43117k;

    /* renamed from: l */
    public int f43118l;

    /* renamed from: m */
    public byte f43119m;

    /* renamed from: a */
    public final j0 m16449a() {
        String str;
        String str2;
        u1 u1Var;
        if (this.f43119m == 7 && (str = this.f43107a) != null && (str2 = this.f43108b) != null && (u1Var = this.f43113g) != null) {
            return new j0(str, str2, this.f43109c, this.f43110d, this.f43111e, this.f43112f, u1Var, this.f43114h, this.f43115i, this.f43116j, this.f43117k, this.f43118l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f43107a == null) {
            sb2.append(" generator");
        }
        if (this.f43108b == null) {
            sb2.append(" identifier");
        }
        if ((this.f43119m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f43119m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f43113g == null) {
            sb2.append(" app");
        }
        if ((this.f43119m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
