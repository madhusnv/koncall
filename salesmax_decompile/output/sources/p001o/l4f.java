package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class l4f extends td9 {

    /* renamed from: i */
    public final n4f f33248i;

    public l4f(List list) {
        super(list);
        this.f33248i = new n4f();
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public n4f mo20015i(sd9 sd9Var, float f) {
        Object obj;
        n4f n4fVar;
        Object obj2 = sd9Var.f45243b;
        if (obj2 == null || (obj = sd9Var.f45244c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        n4f n4fVar2 = (n4f) obj2;
        n4f n4fVar3 = (n4f) obj;
        qma qmaVar = this.f24896e;
        if (qmaVar != null && (n4fVar = (n4f) qmaVar.m45654b(sd9Var.f45248g, sd9Var.f45249h.floatValue(), n4fVar2, n4fVar3, f, m28373e(), m28374f())) != null) {
            return n4fVar;
        }
        this.f33248i.m40077d(zeb.m59356k(n4fVar2.m40075b(), n4fVar3.m40075b(), f), zeb.m59356k(n4fVar2.m40076c(), n4fVar3.m40076c(), f));
        return this.f33248i;
    }
}
