package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a */
    public int f43092a;

    /* renamed from: b */
    public String f43093b;

    /* renamed from: c */
    public String f43094c;

    /* renamed from: d */
    public boolean f43095d;

    /* renamed from: e */
    public byte f43096e;

    /* renamed from: a */
    public final i1 m16448a() {
        String str;
        String str2;
        if (this.f43096e == 3 && (str = this.f43093b) != null && (str2 = this.f43094c) != null) {
            return new i1(this.f43092a, str, str2, this.f43095d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f43096e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f43093b == null) {
            sb2.append(" version");
        }
        if (this.f43094c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f43096e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
