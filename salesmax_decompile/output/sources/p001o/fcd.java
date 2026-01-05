package p001o;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes3.dex */
public class fcd extends td9 {

    /* renamed from: i */
    public final PointF f23138i;

    public fcd(List list) {
        super(list);
        this.f23138i = new PointF();
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF mo20015i(sd9 sd9Var, float f) {
        return mo26455j(sd9Var, f, f, f);
    }

    @Override // p001o.gc1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF mo26455j(sd9 sd9Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = sd9Var.f45243b;
        if (obj2 == null || (obj = sd9Var.f45244c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        qma qmaVar = this.f24896e;
        if (qmaVar != null && (pointF = (PointF) qmaVar.m45654b(sd9Var.f45248g, sd9Var.f45249h.floatValue(), pointF2, pointF3, f, m28373e(), m28374f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f23138i;
        float f4 = pointF2.x;
        float f5 = f4 + (f2 * (pointF3.x - f4));
        float f6 = pointF2.y;
        pointF4.set(f5, f6 + (f3 * (pointF3.y - f6)));
        return this.f23138i;
    }
}
