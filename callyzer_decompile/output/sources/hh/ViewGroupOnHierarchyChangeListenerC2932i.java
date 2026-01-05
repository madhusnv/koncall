package hh;

import android.view.View;
import android.view.ViewGroup;
import c6.v0;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.i */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC2932i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f15978a;

    /* renamed from: b */
    public final /* synthetic */ ChipGroup f15979b;

    public ViewGroupOnHierarchyChangeListenerC2932i(ChipGroup chipGroup) {
        this.f15979b = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f15979b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                Field field = v0.f5527a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            if (chip.isChecked()) {
                ((ChipGroup) view).m4087b(chip.getId());
            }
            chip.setOnCheckedChangeListenerInternal(chipGroup.f6831j);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f15978a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view == this.f15979b && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f15978a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
