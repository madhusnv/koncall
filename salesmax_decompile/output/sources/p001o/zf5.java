package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zf5 implements kdd {

    /* renamed from: a */
    public final odd f57125a;

    /* renamed from: b */
    public final Map f57126b;

    /* renamed from: c */
    public final List f57127c;

    public zf5(odd oddVar) {
        this.f57125a = oddVar;
        this.f57126b = isa.m32681h();
        this.f57127c = bh3.m18963e(orf.m42606d(false, null, null, null, null, 31, null));
    }

    @Override // p001o.e01
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object mo22809a(jdd jddVar, n64 n64Var) {
        Object obj = this.f57126b.get(jddVar.m33603a());
        if (obj == null) {
            obj = this.f57127c;
        }
        return (List) obj;
    }

    public /* synthetic */ zf5(odd oddVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : oddVar);
    }
}
