package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class sl8 extends td9 {
    public sl8(List list) {
        super(list);
    }

    /* renamed from: p */
    public int m48456p() {
        return m48457q(m28370b(), m28372d());
    }

    /* renamed from: q */
    public int m48457q(sd9 sd9Var, float f) {
        Integer num;
        if (sd9Var.f45243b == null || sd9Var.f45244c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        qma qmaVar = this.f24896e;
        return (qmaVar == null || (num = (Integer) qmaVar.m45654b(sd9Var.f45248g, sd9Var.f45249h.floatValue(), (Integer) sd9Var.f45243b, (Integer) sd9Var.f45244c, f, m28373e(), m28374f())) == null) ? zeb.m59357l(sd9Var.m48226g(), sd9Var.m48223d(), f) : num.intValue();
    }

    @Override // p001o.gc1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer mo20015i(sd9 sd9Var, float f) {
        return Integer.valueOf(m48457q(sd9Var, f));
    }
}
