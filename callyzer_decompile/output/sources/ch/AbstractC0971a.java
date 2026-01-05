package ch;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.v0;
import java.lang.reflect.Field;
import o5.AbstractC5292a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ch.a */
/* loaded from: classes.dex */
public abstract class AbstractC0971a extends AbstractC5292a {

    /* renamed from: a */
    public C0972b f5781a;

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        mo2729r(coordinatorLayout, view, i10);
        if (this.f5781a == null) {
            this.f5781a = new C0972b(view);
        }
        C0972b c0972b = this.f5781a;
        View view2 = (View) c0972b.f5785d;
        c0972b.f5783b = view2.getTop();
        c0972b.f5784c = view2.getLeft();
        C0972b c0972b2 = this.f5781a;
        View view3 = (View) c0972b2.f5785d;
        int top = 0 - (view3.getTop() - c0972b2.f5783b);
        Field field = v0.f5527a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0972b2.f5784c));
        return true;
    }

    /* renamed from: r */
    public void mo2729r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.m747p(i10, view);
    }
}
