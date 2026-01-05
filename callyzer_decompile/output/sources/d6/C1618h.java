package d6;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.h */
/* loaded from: classes.dex */
public class C1618h extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C8989c f8065a;

    public C1618h(C8989c c8989c) {
        this.f8065a = c8989c;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        C1617g c1617gA0 = this.f8065a.a0(i10);
        if (c1617gA0 == null) {
            return null;
        }
        return c1617gA0.f8062a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f8065a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        C1617g c1617gB0 = this.f8065a.b0(i10);
        if (c1617gB0 == null) {
            return null;
        }
        return c1617gB0.f8062a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f8065a.d0(i10, i11, bundle);
    }
}
