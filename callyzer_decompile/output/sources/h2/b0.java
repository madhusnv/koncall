package h2;

import android.view.accessibility.AccessibilityManager;
import k2.C3953b;
import k2.e1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final e1 f15683a = C3953b.m8517t(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        this.f15683a.setValue(Boolean.valueOf(z6));
    }
}
