package hh;

import android.widget.CompoundButton;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.f */
/* loaded from: classes.dex */
public final class C2929f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ChipGroup f15977a;

    public C2929f(ChipGroup chipGroup) {
        this.f15977a = chipGroup;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
        ChipGroup chipGroup = this.f15977a;
        if (chipGroup.f6834m) {
            return;
        }
        if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.f6830h) {
            chipGroup.m4088c(compoundButton.getId(), true);
            chipGroup.f6833l = compoundButton.getId();
            return;
        }
        int id2 = compoundButton.getId();
        if (!z6) {
            if (chipGroup.f6833l == id2) {
                chipGroup.setCheckedId(-1);
            }
        } else {
            int i10 = chipGroup.f6833l;
            if (i10 != -1 && i10 != id2 && chipGroup.f6829g) {
                chipGroup.m4088c(i10, false);
            }
            chipGroup.setCheckedId(id2);
        }
    }
}
