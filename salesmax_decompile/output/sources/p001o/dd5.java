package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dd5 implements sp3 {

    /* renamed from: a */
    public final wp3 f19602a;

    /* renamed from: b */
    public final Map f19603b;

    /* renamed from: c */
    public final List f19604c;

    public dd5(wp3 wp3Var) {
        this.f19602a = wp3Var;
        this.f19603b = isa.m32681h();
        this.f19604c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(rp3 rp3Var, n64 n64Var) {
        Object obj = this.f19603b.get(rp3Var.m47043a());
        if (obj == null) {
            obj = this.f19604c;
        }
        return (List) obj;
    }

    public /* synthetic */ dd5(wp3 wp3Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : wp3Var);
    }
}
