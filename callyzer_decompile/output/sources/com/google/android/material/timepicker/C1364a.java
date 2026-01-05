package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import lh.AbstractC4474j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C1364a extends AbstractC4474j {

    /* renamed from: a */
    public final /* synthetic */ ChipTextInputComboView f7007a;

    public C1364a(ChipTextInputComboView chipTextInputComboView) {
        this.f7007a = chipTextInputComboView;
    }

    @Override // lh.AbstractC4474j, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ChipTextInputComboView chipTextInputComboView = this.f7007a;
        Chip chip = chipTextInputComboView.f6979a;
        if (TextUtils.isEmpty(editable)) {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
