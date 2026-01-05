package p001o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public final class ms1 implements ls1 {

    /* renamed from: a */
    public final int[] f35898a = new int[2];

    /* renamed from: b */
    public final float[] f35899b = qza.m45993b(null, 1, null);

    @Override // p001o.ls1
    /* renamed from: a */
    public void mo37856a(View view, float[] fArr) {
        sq8.m48649h(view, "view");
        sq8.m48649h(fArr, "matrix");
        qza.m45996e(fArr);
        m39599d(view, fArr);
    }

    /* renamed from: b */
    public final void m39597b(float[] fArr, Matrix matrix) {
        ze0.m59285b(this.f35899b, matrix);
        ee0.m24834f(fArr, this.f35899b);
    }

    /* renamed from: c */
    public final void m39598c(float[] fArr, float f, float f2) {
        qza.m45996e(this.f35899b);
        qza.m45998g(this.f35899b, f, f2, 0.0f, 4, null);
        ee0.m24834f(fArr, this.f35899b);
    }

    /* renamed from: d */
    public final void m39599d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m39599d((View) parent, fArr);
            m39598c(fArr, -view.getScrollX(), -view.getScrollY());
            m39598c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.f35898a);
            m39598c(fArr, -view.getScrollX(), -view.getScrollY());
            m39598c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        sq8.m48648g(matrix, "viewMatrix");
        m39597b(fArr, matrix);
    }
}
