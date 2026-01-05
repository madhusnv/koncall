package p001o;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class b0d extends sd9 {

    /* renamed from: q */
    public Path f15428q;

    /* renamed from: r */
    public final sd9 f15429r;

    public b0d(ama amaVar, sd9 sd9Var) {
        super(amaVar, (PointF) sd9Var.f45243b, (PointF) sd9Var.f45244c, sd9Var.f45245d, sd9Var.f45246e, sd9Var.f45247f, sd9Var.f45248g, sd9Var.f45249h);
        this.f15429r = sd9Var;
        m18083i();
    }

    /* renamed from: i */
    public void m18083i() {
        Object obj;
        Object obj2;
        Object obj3 = this.f45244c;
        boolean z = (obj3 == null || (obj2 = this.f45243b) == null || !((PointF) obj2).equals(((PointF) obj3).x, ((PointF) obj3).y)) ? false : true;
        Object obj4 = this.f45243b;
        if (obj4 == null || (obj = this.f45244c) == null || z) {
            return;
        }
        sd9 sd9Var = this.f15429r;
        this.f15428q = hri.m31024d((PointF) obj4, (PointF) obj, sd9Var.f45256o, sd9Var.f45257p);
    }

    /* renamed from: j */
    public Path m18084j() {
        return this.f15428q;
    }
}
