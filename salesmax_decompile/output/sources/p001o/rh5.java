package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rh5 implements x9g {

    /* renamed from: a */
    public final bag f43630a;

    /* renamed from: b */
    public final Map f43631b;

    /* renamed from: c */
    public final List f43632c;

    public rh5(bag bagVar) {
        this.f43630a = bagVar;
        this.f43631b = hsa.m31056f(vyh.m53620a("AssumeRoleWithWebIdentity", bh3.m18963e(xz0.m56985b(d01.f18915b.m22173a(), null, 2, null))));
        this.f43632c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(w9g w9gVar, n64 n64Var) {
        Object obj = this.f43631b.get(w9gVar.m54122a());
        if (obj == null) {
            obj = this.f43632c;
        }
        return (List) obj;
    }

    public /* synthetic */ rh5(bag bagVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : bagVar);
    }
}
