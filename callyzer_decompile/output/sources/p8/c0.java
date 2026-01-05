package p8;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends b0 {
    @Override // p8.b0, og.lb
    /* renamed from: b */
    public final void mo10746b(int i10, View view) {
        view.setTransitionVisibility(i10);
    }

    @Override // p8.a0
    /* renamed from: c */
    public final float mo11415c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p8.a0
    /* renamed from: d */
    public final void mo11416d(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // p8.b0
    /* renamed from: e */
    public final void mo11417e(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // p8.b0
    /* renamed from: f */
    public final void mo11418f(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p8.b0
    /* renamed from: g */
    public final void mo11419g(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
