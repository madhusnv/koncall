package lh;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.c */
/* loaded from: classes.dex */
public abstract class AbstractC4467c {

    /* renamed from: a */
    public static final ThreadLocal f22269a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f22270b = new ThreadLocal();

    /* renamed from: a */
    public static void m9322a(TextInputLayout textInputLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != textInputLayout) {
            m9322a(textInputLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
