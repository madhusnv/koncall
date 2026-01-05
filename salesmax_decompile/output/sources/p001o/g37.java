package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class g37 extends td9 {
    public g37(List list) {
        super(list);
    }

    /* renamed from: p */
    public float m28012p() {
        return m28013q(m28370b(), m28372d());
    }

    /* renamed from: q */
    public float m28013q(sd9 sd9Var, float f) {
        Float f2;
        if (sd9Var.f45243b == null || sd9Var.f45244c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qma qmaVar = this.f24896e;
        return (qmaVar == null || (f2 = (Float) qmaVar.m45654b(sd9Var.f45248g, sd9Var.f45249h.floatValue(), (Float) sd9Var.f45243b, (Float) sd9Var.f45244c, f, m28373e(), m28374f())) == null) ? zeb.m59356k(sd9Var.m48225f(), sd9Var.m48222c(), f) : f2.floatValue();
    }

    @Override // p001o.gc1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float mo20015i(sd9 sd9Var, float f) {
        return Float.valueOf(m28013q(sd9Var, f));
    }
}
