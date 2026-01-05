package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p001o.s5e;
import p001o.smb;
import p001o.yed;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: q */
    public Map f13283q;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: L */
    public boolean mo15591L(View view, View view2, boolean z, boolean z2) {
        k0(view2, z);
        return super.mo15591L(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.C11185e i0(Context context, boolean z) {
        int i = z ? s5e.mtrl_fab_transformation_sheet_expand_spec : s5e.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C11185e c11185e = new FabTransformationBehavior.C11185e();
        c11185e.f13276a = smb.m48547d(context, i);
        c11185e.f13277b = new yed(17, 0.0f, 0.0f);
        return c11185e;
    }

    public final void k0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f13283q = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C2012e) && (((CoordinatorLayout.C2012e) childAt.getLayoutParams()).m5798f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        this.f13283q.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        Map map = this.f13283q;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f13283q.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.f13283q = null;
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
