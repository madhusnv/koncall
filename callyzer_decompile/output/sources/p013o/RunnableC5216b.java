package p013o;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.b */
/* loaded from: classes.dex */
public final class RunnableC5216b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25439a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f25440b;

    public /* synthetic */ RunnableC5216b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f25439a = i10;
        this.f25440b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25439a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f25440b;
                actionBarOverlayLayout.m560b();
                actionBarOverlayLayout.f1746w = actionBarOverlayLayout.f1729c.animate().translationY(DefinitionKt.NO_Float_VALUE).setListener(actionBarOverlayLayout.f1747x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f25440b;
                actionBarOverlayLayout2.m560b();
                actionBarOverlayLayout2.f1746w = actionBarOverlayLayout2.f1729c.animate().translationY(-actionBarOverlayLayout2.f1729c.getHeight()).setListener(actionBarOverlayLayout2.f1747x);
                break;
        }
    }
}
