package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ int f2743a;

    /* renamed from: b */
    public final /* synthetic */ Rect f2744b;

    public /* synthetic */ w1(int i10, Rect rect) {
        this.f2743a = i10;
        this.f2744b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f2743a) {
            case 0:
                return this.f2744b;
            default:
                Rect rect = this.f2744b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
