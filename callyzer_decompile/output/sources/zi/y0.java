package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a */
    public String f43318a;

    /* renamed from: b */
    public int f43319b;

    /* renamed from: c */
    public int f43320c;

    /* renamed from: d */
    public boolean f43321d;

    /* renamed from: e */
    public byte f43322e;

    /* renamed from: a */
    public final z0 m16456a() {
        String str;
        if (this.f43322e == 7 && (str = this.f43318a) != null) {
            return new z0(str, this.f43319b, this.f43320c, this.f43321d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f43318a == null) {
            sb2.append(" processName");
        }
        if ((this.f43322e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f43322e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f43322e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
