package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.C0872b;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.websoptimization.callyzerbiz.R;
import d6.C1616f;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C1346j extends C0872b {

    /* renamed from: d */
    public final /* synthetic */ int f6862d;

    /* renamed from: e */
    public final /* synthetic */ Object f6863e;

    public /* synthetic */ C1346j(int i10, Object obj) {
        this.f6862d = i10;
        this.f6863e = obj;
    }

    @Override // c6.C0872b
    /* renamed from: c */
    public void mo2337c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6862d) {
            case 2:
                super.mo2337c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f6863e).f6920d);
                break;
            default:
                super.mo2337c(view, accessibilityEvent);
                break;
        }
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        int i10 = this.f6862d;
        Object obj = this.f6863e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5422a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1617g.f8062a);
                C1350n c1350n = (C1350n) obj;
                c1617g.m5296o(c1350n.f6880k.getVisibility() == 0 ? c1350n.getString(R.string.mtrl_picker_toggle_to_year_selection) : c1350n.getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1617g.f8062a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.f6797l;
                int i12 = -1;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i13) == view) {
                                i12 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.m4074c(i13)) {
                                    i14++;
                                }
                                i13++;
                            }
                        }
                    }
                }
                c1617g.m5294m(C1616f.m5280a(((MaterialButton) view).f6794p, 0, 1, i12, 1));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f6921e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f6920d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1617g.f8062a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f6924B);
                break;
        }
    }
}
