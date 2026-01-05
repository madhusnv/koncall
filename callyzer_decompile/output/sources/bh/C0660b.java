package bh;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import e1.u0;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bh.b */
/* loaded from: classes.dex */
public final class C0660b {

    /* renamed from: a */
    public final u0 f4207a = new u0(0);

    /* renamed from: b */
    public final u0 f4208b = new u0(0);

    /* renamed from: a */
    public static C0660b m1930a(Context context, int i10) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m1931b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m1931b(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i10);
            return null;
        }
    }

    /* renamed from: b */
    public static C0660b m1931b(ArrayList arrayList) {
        C0660b c0660b = new C0660b();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0660b.f4208b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC0659a.f4204b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC0659a.f4205c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC0659a.f4206d;
            }
            C0661c c0661c = new C0661c();
            c0661c.f4212d = 0;
            c0661c.f4213e = 1;
            c0661c.f4209a = startDelay;
            c0661c.f4210b = duration;
            c0661c.f4211c = interpolator;
            c0661c.f4212d = objectAnimator.getRepeatCount();
            c0661c.f4213e = objectAnimator.getRepeatMode();
            c0660b.f4207a.put(propertyName, c0661c);
        }
        return c0660b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0660b) {
            return this.f4207a.equals(((C0660b) obj).f4207a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4207a.hashCode();
    }

    public final String toString() {
        return "\n" + C0660b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4207a + "}\n";
    }
}
