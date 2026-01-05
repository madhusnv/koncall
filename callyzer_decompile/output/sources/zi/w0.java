package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a */
    public long f43300a;

    /* renamed from: b */
    public String f43301b;

    /* renamed from: c */
    public String f43302c;

    /* renamed from: d */
    public long f43303d;

    /* renamed from: e */
    public int f43304e;

    /* renamed from: f */
    public byte f43305f;

    /* renamed from: a */
    public final x0 m16455a() {
        String str;
        if (this.f43305f == 7 && (str = this.f43301b) != null) {
            return new x0(this.f43300a, str, this.f43302c, this.f43303d, this.f43304e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f43305f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f43301b == null) {
            sb2.append(" symbol");
        }
        if ((this.f43305f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f43305f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
