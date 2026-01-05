package h4;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import c9.C0910e;
import cp.C1475f;
import i4.C3167a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.b */
/* loaded from: classes.dex */
public abstract class AbstractC2825b {
    /* renamed from: a */
    public static int[] m6928a(C2841r c2841r, RectF rectF, int i10, final C1475f c1475f) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i10 == 1) {
            graphemeClusterSegmentFinder = new C3167a(new C0910e(7, c2841r.f15832f.getText(), c2841r.m6976j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(c2841r.f15832f.getText(), c2841r.f15827a);
        }
        return c2841r.f15832f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: h4.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) c1475f.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
