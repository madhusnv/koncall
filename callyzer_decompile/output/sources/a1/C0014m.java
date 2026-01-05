package a1;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.m */
/* loaded from: classes.dex */
public final class C0014m implements DisplayManager.DisplayListener {

    /* renamed from: a */
    public final /* synthetic */ C0018q f69a;

    public C0014m(C0018q c0018q) {
        this.f69a = c0018q;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        C0018q c0018q = this.f69a;
        Display defaultDisplay = c0018q.getDefaultDisplay();
        if (defaultDisplay == null || defaultDisplay.getDisplayId() != i10) {
            return;
        }
        c0018q.m99a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
