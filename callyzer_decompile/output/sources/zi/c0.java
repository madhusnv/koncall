package zi;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public int f43023a;

    /* renamed from: b */
    public String f43024b;

    /* renamed from: c */
    public int f43025c;

    /* renamed from: d */
    public int f43026d;

    /* renamed from: e */
    public long f43027e;

    /* renamed from: f */
    public long f43028f;

    /* renamed from: g */
    public long f43029g;

    /* renamed from: h */
    public String f43030h;

    /* renamed from: i */
    public List f43031i;

    /* renamed from: j */
    public byte f43032j;

    /* renamed from: a */
    public final d0 m16446a() {
        String str;
        if (this.f43032j == 63 && (str = this.f43024b) != null) {
            return new d0(this.f43023a, str, this.f43025c, this.f43026d, this.f43027e, this.f43028f, this.f43029g, this.f43030h, this.f43031i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f43032j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f43024b == null) {
            sb2.append(" processName");
        }
        if ((this.f43032j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f43032j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f43032j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f43032j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f43032j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(p020v.a1.m14334n(sb2, "Missing required properties:"));
    }
}
