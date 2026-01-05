package fh;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import ph.C5951f;
import ph.C5952g;
import rh.C6535n;
import y7.C8575j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fh.b */
/* loaded from: classes.dex */
public final class C2287b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f10321a;

    /* renamed from: b */
    public final /* synthetic */ Object f10322b;

    public /* synthetic */ C2287b(int i10, Object obj) {
        this.f10321a = i10;
        this.f10322b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10321a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C5952g c5952g = ((BottomSheetBehavior) this.f10322b).f6764i;
                if (c5952g != null) {
                    C5951f c5951f = c5952g.f29152a;
                    if (c5951f.f29143i != fFloatValue) {
                        c5951f.f29143i = fFloatValue;
                        c5952g.f29156e = true;
                        c5952g.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((C6535n) this.f10322b).f31338c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((TextInputLayout) this.f10322b).M1.m9320i(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C8575j c8575j = (C8575j) this.f10322b;
                c8575j.f41663c.setAlpha(iFloatValue);
                c8575j.f41664d.setAlpha(iFloatValue);
                c8575j.f41679s.invalidate();
                break;
        }
    }
}
