package p001o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public abstract class rvh {

    /* renamed from: a */
    public static final RectF f44139a = new RectF();

    /* renamed from: a */
    public static float m47187a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m47188b(float f, float f2, float f3, float f4, float f5) {
        return m47189c(f, f2, f3, f4, f5, false);
    }

    /* renamed from: c */
    public static float m47189c(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : m47187a(f, f2, (f5 - f3) / (f4 - f3)) : m47187a(f, f2, f5);
    }

    /* renamed from: d */
    public static boolean m47190d(Transition transition, Context context, int i) {
        int iM51785f;
        if (i == 0 || transition.m9856B() != -1 || (iM51785f = umb.m51785f(context, i, -1)) == -1) {
            return false;
        }
        transition.w0(iM51785f);
        return true;
    }

    /* renamed from: e */
    public static boolean m47191e(Transition transition, Context context, int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.m9859E() != null) {
            return false;
        }
        transition.z0(umb.m51786g(context, i, timeInterpolator));
        return true;
    }
}
