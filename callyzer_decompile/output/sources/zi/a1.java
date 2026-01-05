package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a */
    public Double f42985a;

    /* renamed from: b */
    public int f42986b;

    /* renamed from: c */
    public boolean f42987c;

    /* renamed from: d */
    public int f42988d;

    /* renamed from: e */
    public long f42989e;

    /* renamed from: f */
    public long f42990f;

    /* renamed from: g */
    public byte f42991g;

    /* renamed from: a */
    public final b1 m16444a() {
        if (this.f42991g == 31) {
            return new b1(this.f42985a, this.f42986b, this.f42987c, this.f42988d, this.f42989e, this.f42990f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f42991g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.f42991g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.f42991g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.f42991g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.f42991g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
