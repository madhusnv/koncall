package hh;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.websoptimization.callyzerbiz.R;
import d6.C1613c;
import d6.C1617g;
import java.util.ArrayList;
import m6.AbstractC4666b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.c */
/* loaded from: classes.dex */
public final class C2926c extends AbstractC4666b {

    /* renamed from: q */
    public final /* synthetic */ Chip f15958q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2926c(Chip chip, Chip chip2) {
        super(chip2);
        this.f15958q = chip;
    }

    @Override // m6.AbstractC4666b
    /* renamed from: m */
    public final void mo7031m(ArrayList arrayList) {
        C2928e c2928e;
        arrayList.add(0);
        Rect rect = Chip.f6808x;
        Chip chip = this.f15958q;
        if (!chip.m4080d() || (c2928e = chip.f6811e) == null || !c2928e.f15972T || chip.f6814h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // m6.AbstractC4666b
    /* renamed from: p */
    public final void mo7032p(int i10, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f6808x);
            return;
        }
        Chip chip = this.f15958q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        c1617g.m5284b(C1613c.f8043e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
