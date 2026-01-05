package p001o;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public final class os1 implements ls1 {

    /* renamed from: a */
    public final Matrix f38801a = new Matrix();

    /* renamed from: b */
    public final int[] f38802b = new int[2];

    @Override // p001o.ls1
    /* renamed from: a */
    public void mo37856a(View view, float[] fArr) {
        sq8.m48649h(view, "view");
        sq8.m48649h(fArr, "matrix");
        this.f38801a.reset();
        view.transformMatrixToGlobal(this.f38801a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.f38802b);
        int[] iArr = this.f38802b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f38802b;
        this.f38801a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        ze0.m59285b(fArr, this.f38801a);
    }
}
