package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y1 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Object f2754a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2755b;

    /* renamed from: c */
    public final /* synthetic */ Object f2756c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f2757d;

    /* renamed from: e */
    public final /* synthetic */ a2 f2758e;

    public y1(a2 a2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2758e = a2Var;
        this.f2754a = obj;
        this.f2755b = arrayList;
        this.f2756c = obj2;
        this.f2757d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        a2 a2Var = this.f2758e;
        Object obj = this.f2754a;
        if (obj != null) {
            a2Var.m1113u(obj, this.f2755b, null);
        }
        Object obj2 = this.f2756c;
        if (obj2 != null) {
            a2Var.m1113u(obj2, this.f2757d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
