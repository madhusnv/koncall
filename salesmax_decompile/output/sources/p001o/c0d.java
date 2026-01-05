package p001o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes3.dex */
public class c0d extends td9 {

    /* renamed from: i */
    public final PointF f17064i;

    /* renamed from: j */
    public final float[] f17065j;

    /* renamed from: k */
    public final PathMeasure f17066k;

    /* renamed from: l */
    public b0d f17067l;

    public c0d(List list) {
        super(list);
        this.f17064i = new PointF();
        this.f17065j = new float[2];
        this.f17066k = new PathMeasure();
    }

    @Override // p001o.gc1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF mo20015i(sd9 sd9Var, float f) {
        PointF pointF;
        b0d b0dVar = (b0d) sd9Var;
        Path pathM18084j = b0dVar.m18084j();
        if (pathM18084j == null) {
            return (PointF) sd9Var.f45243b;
        }
        qma qmaVar = this.f24896e;
        if (qmaVar != null && (pointF = (PointF) qmaVar.m45654b(b0dVar.f45248g, b0dVar.f45249h.floatValue(), (PointF) b0dVar.f45243b, (PointF) b0dVar.f45244c, m28373e(), f, m28374f())) != null) {
            return pointF;
        }
        if (this.f17067l != b0dVar) {
            this.f17066k.setPath(pathM18084j, false);
            this.f17067l = b0dVar;
        }
        PathMeasure pathMeasure = this.f17066k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f17065j, null);
        PointF pointF2 = this.f17064i;
        float[] fArr = this.f17065j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f17064i;
    }
}
