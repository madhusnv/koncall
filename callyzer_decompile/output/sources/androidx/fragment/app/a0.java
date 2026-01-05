package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends g0 {

    /* renamed from: a */
    public final /* synthetic */ j0 f2455a;

    public a0(j0 j0Var) {
        this.f2455a = j0Var;
    }

    @Override // androidx.fragment.app.g0
    /* renamed from: a */
    public final void mo1095a() {
        j0 j0Var = this.f2455a;
        j0Var.mSavedStateRegistryController.m6567a();
        d7.q0.m5336c(j0Var);
        Bundle bundle = j0Var.mSavedFragmentState;
        j0Var.mSavedStateRegistryController.m6568b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
