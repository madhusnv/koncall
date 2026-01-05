package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public int f43184a;

    /* renamed from: b */
    public String f43185b;

    /* renamed from: c */
    public int f43186c;

    /* renamed from: d */
    public long f43187d;

    /* renamed from: e */
    public long f43188e;

    /* renamed from: f */
    public boolean f43189f;

    /* renamed from: g */
    public int f43190g;

    /* renamed from: h */
    public String f43191h;

    /* renamed from: i */
    public String f43192i;

    /* renamed from: j */
    public byte f43193j;

    /* renamed from: a */
    public final n0 m16451a() {
        String str;
        String str2;
        String str3;
        if (this.f43193j == 63 && (str = this.f43185b) != null && (str2 = this.f43191h) != null && (str3 = this.f43192i) != null) {
            return new n0(this.f43184a, str, this.f43186c, this.f43187d, this.f43188e, this.f43189f, this.f43190g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f43193j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f43185b == null) {
            sb2.append(" model");
        }
        if ((this.f43193j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f43193j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f43193j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f43193j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f43193j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f43191h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f43192i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
