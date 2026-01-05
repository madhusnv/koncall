package a1;

import android.animation.ValueAnimator;
import c0.t0;
import com.skydoves.balloon.internals.DefinitionKt;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.u */
/* loaded from: classes.dex */
public final class C0022u implements t0 {

    /* renamed from: a */
    public ValueAnimator f90a;

    /* renamed from: b */
    public final /* synthetic */ C0023v f91b;

    public C0022u(C0023v c0023v) {
        this.f91b = c0023v;
    }

    @Override // c0.t0
    public final void clear() {
        u1.m10942a("ScreenFlashView");
        ValueAnimator valueAnimator = this.f90a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f90a = null;
        }
        C0023v c0023v = this.f91b;
        c0023v.setAlpha(DefinitionKt.NO_Float_VALUE);
        c0023v.setBrightness(DefinitionKt.NO_Float_VALUE);
    }
}
