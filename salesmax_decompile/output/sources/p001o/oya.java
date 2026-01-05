package p001o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class oya extends iza {
    public static final int J0 = x5e.motionDurationMedium4;
    public static final int K0 = x5e.motionDurationShort3;
    public static final int L0 = x5e.motionEasingEmphasizedDecelerateInterpolator;
    public static final int M0 = x5e.motionEasingEmphasizedAccelerateInterpolator;

    public oya() {
        super(a1(), b1());
    }

    public static ns6 a1() {
        ns6 ns6Var = new ns6();
        ns6Var.m41024d(0.3f);
        return ns6Var;
    }

    public static z0j b1() {
        m4f m4fVar = new m4f();
        m4fVar.m38359f(false);
        m4fVar.m38357d(0.8f);
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
    public TimeInterpolator U0(boolean z) {
        return gh0.f25146a;
    }

    @Override // p001o.iza
    public int X0(boolean z) {
        return z ? J0 : K0;
    }

    @Override // p001o.iza
    public int Y0(boolean z) {
        return z ? L0 : M0;
    }
}
