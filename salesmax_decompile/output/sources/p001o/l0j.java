package p001o;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes3.dex */
public abstract class l0j {

    /* renamed from: a */
    public static final int[] f32965a = {R.attr.stateListAnimator};

    /* renamed from: a */
    public static void m36441a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m36442b(View view, float f) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(b9e.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, x5e.state_liftable, -x5e.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m36443c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, f32965a, i, i2, new int[0]);
        try {
            if (typedArrayM19305i.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayM19305i.getResourceId(0, 0)));
            }
        } finally {
            typedArrayM19305i.recycle();
        }
    }
}
