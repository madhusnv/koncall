package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p001o.ba3;
import p001o.g8e;
import p001o.svh;

/* loaded from: classes2.dex */
public class Explode extends Visibility {
    public static final TimeInterpolator H0 = new DecelerateInterpolator();
    public static final TimeInterpolator I0 = new AccelerateInterpolator();
    public int[] G0;

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = new int[2];
        C0(new ba3());
    }

    private void I0(svh svhVar) {
        View view = svhVar.f46009b;
        view.getLocationOnScreen(this.G0);
        int[] iArr = this.G0;
        int i = iArr[0];
        int i2 = iArr[1];
        svhVar.f46008a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public static float S0(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static float T0(View view, int i, int i2) {
        return S0(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        if (svhVar2 == null) {
            return null;
        }
        Rect rect = (Rect) svhVar2.f46008a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        U0(viewGroup, rect, this.G0);
        int[] iArr = this.G0;
        return AbstractC2526e.m9959a(view, svhVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, H0, this);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        float f;
        float f2;
        if (svhVar == null) {
            return null;
        }
        Rect rect = (Rect) svhVar.f46008a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) svhVar.f46009b.getTag(g8e.transition_position);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        U0(viewGroup, rect, this.G0);
        int[] iArr2 = this.G0;
        return AbstractC2526e.m9959a(view, svhVar, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], I0, this);
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    public final void U0(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.G0);
        int[] iArr2 = this.G0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect rectM9857C = m9857C();
        if (rectM9857C == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectM9857C.centerX();
            iCenterY = rectM9857C.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fS0 = S0(fCenterX, fCenterY);
        float fT0 = T0(view, width - i, iCenterY - i2);
        iArr[0] = Math.round((fCenterX / fS0) * fT0);
        iArr[1] = Math.round(fT0 * (fCenterY / fS0));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        super.mo9807k(svhVar);
        I0(svhVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        super.mo9808n(svhVar);
        I0(svhVar);
    }
}
