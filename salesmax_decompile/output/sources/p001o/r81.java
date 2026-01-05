package p001o;

import java.util.Map;

/* loaded from: classes2.dex */
public final class r81 {

    /* renamed from: a */
    public final Map f43128a;

    /* renamed from: b */
    public final r71 f43129b;

    public r81(Map map, r71 r71Var) {
        sq8.m48649h(map, "sections");
        sq8.m48649h(r71Var, "source");
        this.f43128a = map;
        this.f43129b = r71Var;
    }

    /* renamed from: a */
    public final vq3 m46332a() {
        vq3 vq3Var = (vq3) m46333b().get(this.f43129b.m46305c());
        return vq3Var == null ? new vq3(this.f43129b.m46305c(), isa.m32681h(), null, 4, null) : vq3Var;
    }

    /* renamed from: b */
    public final Map m46333b() {
        Map map = (Map) this.f43128a.get(wq3.PROFILE);
        return map == null ? isa.m32681h() : map;
    }

    /* renamed from: c */
    public final Map m46334c() {
        Map map = (Map) this.f43128a.get(wq3.SERVICES);
        return map == null ? isa.m32681h() : map;
    }

    /* renamed from: d */
    public final Map m46335d() {
        Map map = (Map) this.f43128a.get(wq3.SSO_SESSION);
        return map == null ? isa.m32681h() : map;
    }
}
