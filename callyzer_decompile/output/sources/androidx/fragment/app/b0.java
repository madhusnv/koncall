package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends r0 {

    /* renamed from: a */
    public final /* synthetic */ j0 f2471a;

    public b0(j0 j0Var) {
        this.f2471a = j0Var;
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: b */
    public final View mo1115b(int i10) {
        j0 j0Var = this.f2471a;
        View view = j0Var.mView;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + j0Var + " does not have a view");
    }

    @Override // androidx.fragment.app.r0
    /* renamed from: c */
    public final boolean mo1116c() {
        return this.f2471a.mView != null;
    }
}
