package d3;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.j */
/* loaded from: classes.dex */
public final class C1556j {

    /* renamed from: a */
    public final PathMeasure f7777a;

    public C1556j(PathMeasure pathMeasure) {
        this.f7777a = pathMeasure;
    }

    /* renamed from: a */
    public final void m5175a(float f6, float f10, C1555i c1555i) {
        if (c1555i == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f7777a.getSegment(f6, f10, c1555i.f7752a, true);
    }
}
