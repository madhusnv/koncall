package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a */
    public String f42972a;

    /* renamed from: b */
    public String f42973b;

    /* renamed from: c */
    public int f42974c;

    /* renamed from: d */
    public String f42975d;

    /* renamed from: e */
    public String f42976e;

    /* renamed from: f */
    public String f42977f;

    /* renamed from: g */
    public String f42978g;

    /* renamed from: h */
    public String f42979h;

    /* renamed from: i */
    public String f42980i;

    /* renamed from: j */
    public m2 f42981j;

    /* renamed from: k */
    public s1 f42982k;

    /* renamed from: l */
    public p1 f42983l;

    /* renamed from: m */
    public byte f42984m;

    /* renamed from: a */
    public final b0 m16443a() {
        if (this.f42984m == 1 && this.f42972a != null && this.f42973b != null && this.f42975d != null && this.f42979h != null && this.f42980i != null) {
            return new b0(this.f42972a, this.f42973b, this.f42974c, this.f42975d, this.f42976e, this.f42977f, this.f42978g, this.f42979h, this.f42980i, this.f42981j, this.f42982k, this.f42983l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f42972a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f42973b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.f42984m) == 0) {
            sb2.append(" platform");
        }
        if (this.f42975d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f42979h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f42980i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
