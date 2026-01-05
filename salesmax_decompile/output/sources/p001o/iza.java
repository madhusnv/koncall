package p001o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Visibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class iza extends Visibility {
    public final z0j G0;
    public z0j H0;
    public final List I0 = new ArrayList();

    public iza(z0j z0jVar, z0j z0jVar2) {
        this.G0 = z0jVar;
        this.H0 = z0jVar2;
    }

    public static void S0(List list, z0j z0jVar, ViewGroup viewGroup, View view, boolean z) {
        if (z0jVar == null) {
            return;
        }
        Animator animatorMo38356b = z ? z0jVar.mo38356b(viewGroup, view) : z0jVar.mo38355a(viewGroup, view);
        if (animatorMo38356b != null) {
            list.add(animatorMo38356b);
        }
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return T0(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        return T0(viewGroup, view, false);
    }

    public final Animator T0(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        S0(arrayList, this.G0, viewGroup, view, z);
        S0(arrayList, this.H0, viewGroup, view, z);
        Iterator it = this.I0.iterator();
        while (it.hasNext()) {
            S0(arrayList, (z0j) it.next(), viewGroup, view, z);
        }
        Z0(viewGroup.getContext(), z);
        lh0.m37166a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    public TimeInterpolator U0(boolean z) {
        return gh0.f25147b;
    }

    public int X0(boolean z) {
        return 0;
    }

    public int Y0(boolean z) {
        return 0;
    }

    public final void Z0(Context context, boolean z) {
        rvh.m47190d(this, context, X0(z));
        rvh.m47191e(this, context, Y0(z), U0(z));
    }
}
