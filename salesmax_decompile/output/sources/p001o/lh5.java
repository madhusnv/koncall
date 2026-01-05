package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lh5 implements o1g {

    /* renamed from: a */
    public final w1g f33808a;

    /* renamed from: b */
    public final Map f33809b;

    /* renamed from: c */
    public final List f33810c;

    public lh5(w1g w1gVar) {
        this.f33808a = w1gVar;
        this.f33809b = hsa.m31056f(vyh.m53620a("GetRoleCredentials", bh3.m18963e(xz0.m56985b(d01.f18915b.m22173a(), null, 2, null))));
        this.f33810c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(n1g n1gVar, n64 n64Var) {
        Object obj = this.f33809b.get(n1gVar.m39995a());
        if (obj == null) {
            obj = this.f33810c;
        }
        return (List) obj;
    }

    public /* synthetic */ lh5(w1g w1gVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : w1gVar);
    }
}
