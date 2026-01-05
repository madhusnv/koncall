package p001o;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes2.dex */
public abstract class eb {
    /* renamed from: a */
    public static int m24667a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* renamed from: b */
    public static void m24668b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
