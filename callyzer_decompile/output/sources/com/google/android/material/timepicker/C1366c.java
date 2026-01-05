package com.google.android.material.timepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.C0872b;
import com.websoptimization.callyzerbiz.R;
import d6.C1616f;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C1366c extends C0872b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f7009d;

    public C1366c(ClockFaceView clockFaceView) {
        this.f7009d = clockFaceView;
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        this.f5422a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f7009d.f6993y.get(iIntValue - 1));
        }
        c1617g.m5294m(C1616f.m5280a(view.isSelected(), 0, 1, iIntValue, 1));
    }
}
