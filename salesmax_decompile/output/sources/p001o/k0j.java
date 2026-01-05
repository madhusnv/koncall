package p001o;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public class k0j extends j0j {
    @Override // p001o.c0j
    /* renamed from: b */
    public float mo20028b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p001o.f0j, p001o.c0j
    /* renamed from: d */
    public void mo20030d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // p001o.h0j, p001o.c0j
    /* renamed from: e */
    public void mo20031e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p001o.c0j
    /* renamed from: f */
    public void mo20032f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p001o.j0j, p001o.c0j
    /* renamed from: g */
    public void mo20033g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p001o.f0j, p001o.c0j
    /* renamed from: h */
    public void mo20034h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p001o.f0j, p001o.c0j
    /* renamed from: i */
    public void mo20035i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
