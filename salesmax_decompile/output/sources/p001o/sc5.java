package p001o;

import java.util.List;
import java.util.Map;
import p001o.d01;

/* loaded from: classes3.dex */
public final class sc5 implements ag3 {

    /* renamed from: a */
    public final eg3 f45171a;

    /* renamed from: b */
    public final Map f45172b;

    /* renamed from: c */
    public final List f45173c;

    public sc5(eg3 eg3Var) {
        this.f45171a = eg3Var;
        d01.C12776a c12776a = d01.f18915b;
        this.f45172b = isa.m32684k(vyh.m53620a("GetCredentialsForIdentity", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetId", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("GetOpenIdToken", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))), vyh.m53620a("UnlinkIdentity", bh3.m18963e(xz0.m56985b(c12776a.m22173a(), null, 2, null))));
        this.f45173c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(zf3 zf3Var, n64 n64Var) {
        Object obj = this.f45172b.get(zf3Var.m59371a());
        if (obj == null) {
            obj = this.f45173c;
        }
        return (List) obj;
    }

    public /* synthetic */ sc5(eg3 eg3Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : eg3Var);
    }
}
