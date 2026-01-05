package p001o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class nya extends iza {
    public final boolean J0;

    public nya(boolean z) {
        super(a1(z), b1());
        this.J0 = z;
    }

    public static m4f a1(boolean z) {
        m4f m4fVar = new m4f(z);
        m4fVar.m38358e(0.85f);
        m4fVar.m38357d(0.85f);
        return m4fVar;
    }

    public static z0j b1() {
        return new ns6();
    }

    @Override // p001o.iza, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return super.M0(viewGroup, view, svhVar, svhVar2);
    }

    @Override // p001o.iza, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return super.O0(viewGroup, view, svhVar, svhVar2);
    }

    @Override // p001o.iza, androidx.transition.Transition
    /* renamed from: U */
    public /* bridge */ /* synthetic */ boolean mo9806U() {
        return super.mo9806U();
    }
}
