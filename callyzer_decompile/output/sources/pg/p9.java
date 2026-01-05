package pg;

import android.view.DragEvent;
import uf.C7427b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class p9 {

    /* renamed from: a */
    public static final /* synthetic */ int f29025a = 0;

    /* renamed from: a */
    public static final long m11825a(C7427b c7427b) {
        DragEvent dragEvent = (DragEvent) c7427b.f35231b;
        float x3 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x3) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }
}
