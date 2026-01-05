package w3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements d1 {

    /* renamed from: a */
    public final Matrix f37776a = new Matrix();

    /* renamed from: b */
    public final int[] f37777b = new int[2];

    @Override // w3.d1
    /* renamed from: k */
    public void mo2601k(View view, float[] fArr) {
        Matrix matrix = this.f37776a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f37777b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        d3.h0.m5145q(matrix, fArr);
    }
}
