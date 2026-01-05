package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oh5 implements a2g {

    /* renamed from: a */
    public final e2g f38354a;

    /* renamed from: b */
    public final Map f38355b;

    /* renamed from: c */
    public final List f38356c;

    public oh5(e2g e2gVar) {
        this.f38354a = e2gVar;
        this.f38355b = hsa.m31056f(vyh.m53620a("CreateToken", bh3.m18963e(xz0.m56985b(d01.f18915b.m22173a(), null, 2, null))));
        this.f38356c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(z1g z1gVar, n64 n64Var) {
        Object obj = this.f38355b.get(z1gVar.m58652a());
        if (obj == null) {
            obj = this.f38356c;
        }
        return (List) obj;
    }

    public /* synthetic */ oh5(e2g e2gVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : e2gVar);
    }
}
