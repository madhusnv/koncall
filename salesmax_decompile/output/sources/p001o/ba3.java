package p001o;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes2.dex */
public class ba3 extends a1j {

    /* renamed from: b */
    public float f15822b = 3.0f;

    /* renamed from: h */
    public static float m18501h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // p001o.pvh
    /* renamed from: c */
    public long mo18502c(ViewGroup viewGroup, Transition transition, svh svhVar, svh svhVar2) {
        int i;
        int iRound;
        int iCenterX;
        if (svhVar == null && svhVar2 == null) {
            return 0L;
        }
        if (svhVar2 == null || m16337e(svhVar) == 0) {
            i = -1;
        } else {
            svhVar = svhVar2;
            i = 1;
        }
        int iM16338f = m16338f(svhVar);
        int iM16339g = m16339g(svhVar);
        Rect rectM9857C = transition.m9857C();
        if (rectM9857C != null) {
            iCenterX = rectM9857C.centerX();
            iRound = rectM9857C.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fM18501h = m18501h(iM16338f, iM16339g, iCenterX, iRound) / m18501h(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long jM9856B = transition.m9856B();
        if (jM9856B < 0) {
            jM9856B = 300;
        }
        return Math.round(((jM9856B * i) / this.f15822b) * fM18501h);
    }
}
