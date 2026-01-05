package p001o;

/* loaded from: classes6.dex */
public abstract class s4g {

    /* renamed from: a */
    public static final lgg f44811a = new lgg("NONE");

    /* renamed from: b */
    public static final lgg f44812b = new lgg("PENDING");

    /* renamed from: a */
    public static final cqb m47838a(Object obj) {
        if (obj == null) {
            obj = y4c.f54875a;
        }
        return new r4g(obj);
    }

    /* renamed from: d */
    public static final v37 m47841d(q4g q4gVar, q74 q74Var, int i, wl1 wl1Var) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        return ((z || i == -2) && wl1Var == wl1.DROP_OLDEST) ? q4gVar : bmf.m19388e(q4gVar, q74Var, i, wl1Var);
    }
}
