package h2;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import k2.C3953b;
import k2.e1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* renamed from: a */
    public final e1 f15679a = C3953b.m8517t(Boolean.FALSE);

    public a0(c0 c0Var) {
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f15679a.setValue(Boolean.valueOf(c0.m6887b(accessibilityManager)));
    }
}
