package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import p001o.db;
import p001o.jjh;
import p001o.n8e;
import p001o.n9e;
import p001o.wvi;
import p001o.xzi;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f13148a;

    /* renamed from: b */
    public final TextInputLayout f13149b;

    /* renamed from: c */
    public final EditText f13150c;

    /* renamed from: d */
    public TextWatcher f13151d;

    /* renamed from: e */
    public TextView f13152e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C11156b extends jjh {
        public C11156b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f13148a.setText(ChipTextInputComboView.this.m15459d("00"));
                return;
            }
            String strM15459d = ChipTextInputComboView.this.m15459d(editable);
            Chip chip = ChipTextInputComboView.this.f13148a;
            if (TextUtils.isEmpty(strM15459d)) {
                strM15459d = ChipTextInputComboView.this.m15459d("00");
            }
            chip.setText(strM15459d);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public void m15458c(InputFilter inputFilter) {
        InputFilter[] filters = this.f13150c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f13150c.setFilters(inputFilterArr);
    }

    /* renamed from: d */
    public final String m15459d(CharSequence charSequence) {
        return TimeModel.m15523a(getResources(), charSequence);
    }

    /* renamed from: e */
    public TextInputLayout m15460e() {
        return this.f13149b;
    }

    /* renamed from: f */
    public void m15461f(db dbVar) {
        wvi.m0(this.f13148a, dbVar);
    }

    /* renamed from: g */
    public void m15462g(CharSequence charSequence) {
        String strM15459d = m15459d(charSequence);
        this.f13148a.setText(strM15459d);
        if (TextUtils.isEmpty(strM15459d)) {
            return;
        }
        this.f13150c.removeTextChangedListener(this.f13151d);
        this.f13150c.setText(strM15459d);
        this.f13150c.addTextChangedListener(this.f13151d);
    }

    /* renamed from: h */
    public final void m15463h() {
        this.f13150c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13148a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m15463h();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f13148a.setChecked(z);
        this.f13150c.setVisibility(z ? 0 : 4);
        this.f13148a.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            xzi.m57083s(this.f13150c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13148a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f13148a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f13148a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(n9e.material_time_chip, (ViewGroup) this, false);
        this.f13148a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(n9e.material_time_input, (ViewGroup) this, false);
        this.f13149b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f13150c = editText;
        editText.setVisibility(4);
        C11156b c11156b = new C11156b();
        this.f13151d = c11156b;
        editText.addTextChangedListener(c11156b);
        m15463h();
        addView(chip);
        addView(textInputLayout);
        this.f13152e = (TextView) findViewById(n8e.material_label);
        editText.setId(View.generateViewId());
        this.f13152e.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
