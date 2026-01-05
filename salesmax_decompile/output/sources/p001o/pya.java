package p001o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class pya extends iza {
    public static final int J0 = x5e.motionDurationLong1;
    public static final int K0 = x5e.motionEasingEmphasizedInterpolator;

    public pya() {
        super(a1(), b1());
    }

    public static qs6 a1() {
        return new qs6();
    }

    public static z0j b1() {
        m4f m4fVar = new m4f();
        m4fVar.m38359f(false);
        m4fVar.m38357d(0.92f);
        return m4fVar;
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

    @Override // p001o.iza
    public int X0(boolean z) {
        return J0;
    }

    @Override // p001o.iza
    public int Y0(boolean z) {
        return K0;
    }
}
