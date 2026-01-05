package p001o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes2.dex */
public class drf extends a1j {

    /* renamed from: b */
    public float f20450b = 3.0f;

    /* renamed from: c */
    public int f20451c = 80;

    @Override // p001o.pvh
    /* renamed from: c */
    public long mo18502c(ViewGroup viewGroup, Transition transition, svh svhVar, svh svhVar2) {
        int i;
        int iCenterX;
        int iCenterY;
        svh svhVar3 = svhVar;
        if (svhVar3 == null && svhVar2 == null) {
            return 0L;
        }
        Rect rectM9857C = transition.m9857C();
        if (svhVar2 == null || m16337e(svhVar3) == 0) {
            i = -1;
        } else {
            svhVar3 = svhVar2;
            i = 1;
        }
        int iM16338f = m16338f(svhVar3);
        int iM16339g = m16339g(svhVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (rectM9857C != null) {
            iCenterX = rectM9857C.centerX();
            iCenterY = rectM9857C.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fM23707h = m23707h(viewGroup, iM16338f, iM16339g, iCenterX, iCenterY, iRound, iRound2, width, height) / m23708i(viewGroup);
        long jM9856B = transition.m9856B();
        if (jM9856B < 0) {
            jM9856B = 300;
        }
        return Math.round(((jM9856B * i) / this.f20450b) * fM23707h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m23707h(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f20451c;
        if (i9 == 8388611) {
            i9 = view.getLayoutDirection() == 1 ? 5 : 3;
        } else if (i9 == 8388613) {
            if (view.getLayoutDirection() == 1) {
            }
        }
        if (i9 == 3) {
            return (i7 - i) + Math.abs(i4 - i2);
        }
        if (i9 == 5) {
            return (i - i5) + Math.abs(i4 - i2);
        }
        if (i9 == 48) {
            return (i8 - i2) + Math.abs(i3 - i);
        }
        if (i9 != 80) {
            return 0;
        }
        return (i2 - i6) + Math.abs(i3 - i);
    }

    /* renamed from: i */
    public final int m23708i(ViewGroup viewGroup) {
        int i = this.f20451c;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    /* renamed from: j */
    public void m23709j(int i) {
        this.f20451c = i;
    }
}
