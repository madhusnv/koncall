package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ug0 {
    /* renamed from: a */
    public static List m51550a(ka9 ka9Var, float f, ama amaVar, wri wriVar) {
        return vd9.m52587a(ka9Var, amaVar, f, wriVar, false);
    }

    /* renamed from: b */
    public static List m51551b(ka9 ka9Var, ama amaVar, wri wriVar) {
        return vd9.m52587a(ka9Var, amaVar, 1.0f, wriVar, false);
    }

    /* renamed from: c */
    public static eg0 m51552c(ka9 ka9Var, ama amaVar) {
        return new eg0(m51551b(ka9Var, amaVar, uh3.f48935a));
    }

    /* renamed from: d */
    public static og0 m51553d(ka9 ka9Var, ama amaVar) {
        return new og0(m51551b(ka9Var, amaVar, xv5.f54325a));
    }

    /* renamed from: e */
    public static fg0 m51554e(ka9 ka9Var, ama amaVar) {
        return m51555f(ka9Var, amaVar, true);
    }

    /* renamed from: f */
    public static fg0 m51555f(ka9 ka9Var, ama amaVar, boolean z) {
        return new fg0(m51550a(ka9Var, z ? hri.m31025e() : 1.0f, amaVar, k37.f31416a));
    }

    /* renamed from: g */
    public static gg0 m51556g(ka9 ka9Var, ama amaVar, int i) {
        return new gg0(m51551b(ka9Var, amaVar, new ou7(i)));
    }

    /* renamed from: h */
    public static hg0 m51557h(ka9 ka9Var, ama amaVar) {
        return new hg0(m51551b(ka9Var, amaVar, tl8.f47368a));
    }

    /* renamed from: i */
    public static kg0 m51558i(ka9 ka9Var, ama amaVar) {
        return new kg0(vd9.m52587a(ka9Var, amaVar, hri.m31025e(), ecd.f21395a, true));
    }

    /* renamed from: j */
    public static lg0 m51559j(ka9 ka9Var, ama amaVar) {
        return new lg0(m51551b(ka9Var, amaVar, o4f.f37763a));
    }

    /* renamed from: k */
    public static mg0 m51560k(ka9 ka9Var, ama amaVar) {
        return new mg0(m51550a(ka9Var, hri.m31025e(), amaVar, dlf.f20191a));
    }
}
