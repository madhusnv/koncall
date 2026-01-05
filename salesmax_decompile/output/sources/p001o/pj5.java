package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pj5 implements vvh {

    /* renamed from: a */
    public final zvh f40165a;

    /* renamed from: b */
    public final Map f40166b;

    /* renamed from: c */
    public final List f40167c;

    public pj5(zvh zvhVar) {
        this.f40165a = zvhVar;
        this.f40166b = isa.m32681h();
        this.f40167c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(uvh uvhVar, n64 n64Var) {
        Object obj = this.f40166b.get(uvhVar.m52056a());
        if (obj == null) {
            obj = this.f40167c;
        }
        return (List) obj;
    }

    public /* synthetic */ pj5(zvh zvhVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : zvhVar);
    }
}
