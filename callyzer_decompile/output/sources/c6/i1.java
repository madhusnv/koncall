package c6;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a */
    public h1 f5469a;

    public i1(int i10, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f5469a = new g1(e1.m2379b(i10, interpolator, j6));
        } else {
            this.f5469a = new d1(interpolator, j6);
        }
    }
}
