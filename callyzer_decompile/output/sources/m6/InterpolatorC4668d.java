package m6;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m6.d */
/* loaded from: classes.dex */
public final class InterpolatorC4668d implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f23082a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f23082a) {
        }
        float f10 = f6 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
