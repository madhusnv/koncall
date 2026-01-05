package h2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import k2.C3953b;
import k2.e1;
import k2.h2;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 implements AccessibilityManager.AccessibilityStateChangeListener, h2 {

    /* renamed from: a */
    public final e1 f15684a = C3953b.m8517t(Boolean.FALSE);

    /* renamed from: b */
    public final b0 f15685b = new b0();

    /* renamed from: c */
    public final a0 f15686c;

    public c0() {
        this.f15686c = Build.VERSION.SDK_INT >= 33 ? new a0(this) : null;
    }

    /* renamed from: b */
    public static boolean m6887b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i10).getSettingsActivityName();
            if (settingsActivityName != null && AbstractC5178p.m10116x(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // k2.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r2 = this;
            k2.e1 r0 = r2.f15684a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L38
            h2.b0 r0 = r2.f15685b
            if (r0 == 0) goto L20
            k2.e1 r0 = r0.f15683a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L37
            h2.a0 r0 = r2.f15686c
            if (r0 == 0) goto L34
            k2.e1 r0 = r0.f15679a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L35
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto L38
        L37:
            r1 = 1
        L38:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c0.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z6) {
        this.f15684a.setValue(Boolean.valueOf(z6));
    }
}
