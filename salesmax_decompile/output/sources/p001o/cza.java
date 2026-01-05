package p001o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class cza extends iza {
    public static final int L0 = x5e.motionDurationLong1;
    public static final int M0 = x5e.motionEasingEmphasizedInterpolator;
    public final int J0;
    public final boolean K0;

    public cza(int i, boolean z) {
        super(a1(i, z), b1());
        this.J0 = i;
        this.K0 = z;
    }

    public static z0j a1(int i, boolean z) {
        if (i == 0) {
            return new xvf(z ? 8388613 : 8388611);
        }
        if (i == 1) {
            return new xvf(z ? 80 : 48);
        }
        if (i == 2) {
            return new m4f(z);
        }
        throw new IllegalArgumentException("Invalid axis: " + i);
    }

    public static z0j b1() {
        return new qs6();
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
        return L0;
    }

    @Override // p001o.iza
    public int Y0(boolean z) {
        return M0;
    }
}
