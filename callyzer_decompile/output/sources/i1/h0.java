package i1;

import android.content.Context;
import android.widget.EdgeEffect;
import com.skydoves.balloon.internals.DefinitionKt;
import og.se;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends EdgeEffect {

    /* renamed from: a */
    public final float f16878a;

    /* renamed from: b */
    public float f16879b;

    public h0(Context context) {
        super(context);
        this.f16878a = se.m10913a(context).f32198a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f16879b = DefinitionKt.NO_Float_VALUE;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f10) {
        this.f16879b = DefinitionKt.NO_Float_VALUE;
        super.onPull(f6, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f16879b = DefinitionKt.NO_Float_VALUE;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f16879b = DefinitionKt.NO_Float_VALUE;
        super.onPull(f6);
    }
}
