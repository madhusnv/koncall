package p001o;

import android.animation.TimeInterpolator;

/* loaded from: classes3.dex */
public class fte implements TimeInterpolator {

    /* renamed from: a */
    public final TimeInterpolator f24064a;

    public fte(TimeInterpolator timeInterpolator) {
        this.f24064a = timeInterpolator;
    }

    /* renamed from: a */
    public static TimeInterpolator m27470a(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new fte(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f24064a.getInterpolation(f);
    }
}
