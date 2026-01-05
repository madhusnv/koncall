package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public class qh3 extends td9 {
    public qh3(List list) {
        super(list);
    }

    /* renamed from: p */
    public int m45489p() {
        return m45490q(m28370b(), m28372d());
    }

    /* renamed from: q */
    public int m45490q(sd9 sd9Var, float f) {
        Integer num;
        Object obj = sd9Var.f45243b;
        if (obj == null || sd9Var.f45244c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) sd9Var.f45244c).intValue();
        qma qmaVar = this.f24896e;
        return (qmaVar == null || (num = (Integer) qmaVar.m45654b(sd9Var.f45248g, sd9Var.f45249h.floatValue(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), f, m28373e(), m28374f())) == null) ? fn7.m27125c(zeb.m59348c(f, 0.0f, 1.0f), iIntValue, iIntValue2) : num.intValue();
    }

    @Override // p001o.gc1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer mo20015i(sd9 sd9Var, float f) {
        return Integer.valueOf(m45490q(sd9Var, f));
    }
}
