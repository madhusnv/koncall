package p001o;

import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import com.androidpoet.materialintro.MaterialIntroFragment;

/* loaded from: classes5.dex */
public abstract class sg7 {
    /* renamed from: a */
    public static final /* synthetic */ Transition m48306a(Fragment fragment, Transition transition, MaterialIntroFragment materialIntroFragment, long j) {
        sq8.m48649h(fragment, "<this>");
        sq8.m48649h(transition, "transition");
        sq8.m48649h(materialIntroFragment, "materialIntro");
        transition.w0(j);
        fragment.setAllowEnterTransitionOverlap(materialIntroFragment.getEnterTransitionOverlap());
        fragment.setAllowReturnTransitionOverlap(materialIntroFragment.getReturnTransitionOverlap());
        return transition;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m48307b(Fragment fragment, MaterialIntroFragment materialIntroFragment) {
        sq8.m48649h(fragment, "<this>");
        sq8.m48649h(materialIntroFragment, "materialIntroFragment");
        Transition transitionM32120b = ih0.m32120b(materialIntroFragment.getEnterAnimation());
        fragment.setEnterTransition(transitionM32120b == null ? null : m48306a(fragment, transitionM32120b, materialIntroFragment, materialIntroFragment.getEnterDuration()));
    }
}
