package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f6979a;

    /* renamed from: b */
    public final EditText f6980b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f6979a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f6980b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new C1364a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        editText.setSaveEnabled(false);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6979a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6980b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z6) {
        Chip chip = this.f6979a;
        chip.setChecked(z6);
        int i10 = z6 ? 0 : 4;
        EditText editText = this.f6980b;
        editText.setVisibility(i10);
        chip.setVisibility(z6 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            if (TextUtils.isEmpty(editText.getText())) {
                return;
            }
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6979a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f6979a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f6979a.toggle();
    }
}
