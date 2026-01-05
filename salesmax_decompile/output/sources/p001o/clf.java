package p001o;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class clf {

    /* renamed from: a */
    public final List f18300a;

    /* renamed from: b */
    public PointF f18301b;

    /* renamed from: c */
    public boolean f18302c;

    public clf(PointF pointF, boolean z, List list) {
        this.f18301b = pointF;
        this.f18302c = z;
        this.f18300a = new ArrayList(list);
    }

    /* renamed from: a */
    public List m21382a() {
        return this.f18300a;
    }

    /* renamed from: b */
    public PointF m21383b() {
        return this.f18301b;
    }

    /* renamed from: c */
    public void m21384c(clf clfVar, clf clfVar2, float f) {
        if (this.f18301b == null) {
            this.f18301b = new PointF();
        }
        this.f18302c = clfVar.m21385d() || clfVar2.m21385d();
        if (clfVar.m21382a().size() != clfVar2.m21382a().size()) {
            rja.m46866c("Curves must have the same number of control points. Shape 1: " + clfVar.m21382a().size() + "\tShape 2: " + clfVar2.m21382a().size());
        }
        int iMin = Math.min(clfVar.m21382a().size(), clfVar2.m21382a().size());
        if (this.f18300a.size() < iMin) {
            for (int size = this.f18300a.size(); size < iMin; size++) {
                this.f18300a.add(new zc4());
            }
        } else if (this.f18300a.size() > iMin) {
            for (int size2 = this.f18300a.size() - 1; size2 >= iMin; size2--) {
                List list = this.f18300a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFM21383b = clfVar.m21383b();
        PointF pointFM21383b2 = clfVar2.m21383b();
        m21386e(zeb.m59356k(pointFM21383b.x, pointFM21383b2.x, f), zeb.m59356k(pointFM21383b.y, pointFM21383b2.y, f));
        for (int size3 = this.f18300a.size() - 1; size3 >= 0; size3--) {
            zc4 zc4Var = (zc4) clfVar.m21382a().get(size3);
            zc4 zc4Var2 = (zc4) clfVar2.m21382a().get(size3);
            PointF pointFM59172a = zc4Var.m59172a();
            PointF pointFM59173b = zc4Var.m59173b();
            PointF pointFM59174c = zc4Var.m59174c();
            PointF pointFM59172a2 = zc4Var2.m59172a();
            PointF pointFM59173b2 = zc4Var2.m59173b();
            PointF pointFM59174c2 = zc4Var2.m59174c();
            ((zc4) this.f18300a.get(size3)).m59175d(zeb.m59356k(pointFM59172a.x, pointFM59172a2.x, f), zeb.m59356k(pointFM59172a.y, pointFM59172a2.y, f));
            ((zc4) this.f18300a.get(size3)).m59176e(zeb.m59356k(pointFM59173b.x, pointFM59173b2.x, f), zeb.m59356k(pointFM59173b.y, pointFM59173b2.y, f));
            ((zc4) this.f18300a.get(size3)).m59177f(zeb.m59356k(pointFM59174c.x, pointFM59174c2.x, f), zeb.m59356k(pointFM59174c.y, pointFM59174c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m21385d() {
        return this.f18302c;
    }

    /* renamed from: e */
    public final void m21386e(float f, float f2) {
        if (this.f18301b == null) {
            this.f18301b = new PointF();
        }
        this.f18301b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f18300a.size() + "closed=" + this.f18302c + '}';
    }

    public clf() {
        this.f18300a = new ArrayList();
    }
}
