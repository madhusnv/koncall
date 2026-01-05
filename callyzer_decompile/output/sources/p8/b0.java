package p8;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class b0 extends a0 {

    /* renamed from: d */
    public static boolean f28546d = true;

    /* renamed from: e */
    public static boolean f28547e = true;

    /* renamed from: f */
    public static boolean f28548f = true;

    /* renamed from: g */
    public static boolean f28549g = true;

    @Override // og.lb
    /* renamed from: b */
    public void mo10746b(int i10, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo10746b(i10, view);
        } else if (f28549g) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f28549g = false;
            }
        }
    }

    /* renamed from: e */
    public void mo11417e(View view, int i10, int i11, int i12, int i13) {
        if (f28548f) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f28548f = false;
            }
        }
    }

    /* renamed from: f */
    public void mo11418f(View view, Matrix matrix) {
        if (f28546d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f28546d = false;
            }
        }
    }

    /* renamed from: g */
    public void mo11419g(View view, Matrix matrix) {
        if (f28547e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f28547e = false;
            }
        }
    }
}
