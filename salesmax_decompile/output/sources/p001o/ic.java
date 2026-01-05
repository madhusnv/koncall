package p001o;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes2.dex */
public abstract class ic {
    /* renamed from: a */
    public static void m31892a(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* renamed from: b */
    public static void m31893b(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    /* renamed from: c */
    public static void m31894c(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }
}
