package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class jlf extends hc1 {

    /* renamed from: B */
    public final x14 f30673B;

    /* renamed from: C */
    public final hp3 f30674C;

    public jlf(ema emaVar, gh9 gh9Var, hp3 hp3Var) {
        super(emaVar, gh9Var);
        this.f30674C = hp3Var;
        x14 x14Var = new x14(emaVar, this, new glf("__container", gh9Var.m28688n(), false));
        this.f30673B = x14Var;
        x14Var.mo19334b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // p001o.hc1
    /* renamed from: G */
    public void mo30177G(yc9 yc9Var, int i, List list, yc9 yc9Var2) {
        this.f30673B.mo19999c(yc9Var, i, list, yc9Var2);
    }

    @Override // p001o.hc1, p001o.dz5
    /* renamed from: e */
    public void mo20001e(RectF rectF, Matrix matrix, boolean z) {
        super.mo20001e(rectF, matrix, z);
        this.f30673B.mo20001e(rectF, this.f26619m, z);
    }

    @Override // p001o.hc1
    /* renamed from: t */
    public void mo23320t(Canvas canvas, Matrix matrix, int i) {
        this.f30673B.mo20002g(canvas, matrix, i);
    }

    @Override // p001o.hc1
    /* renamed from: v */
    public yj1 mo30195v() {
        yj1 yj1VarMo30195v = super.mo30195v();
        return yj1VarMo30195v != null ? yj1VarMo30195v : this.f30674C.mo30195v();
    }

    @Override // p001o.hc1
    /* renamed from: x */
    public tz5 mo30197x() {
        tz5 tz5VarMo30197x = super.mo30197x();
        return tz5VarMo30197x != null ? tz5VarMo30197x : this.f30674C.mo30197x();
    }
}
