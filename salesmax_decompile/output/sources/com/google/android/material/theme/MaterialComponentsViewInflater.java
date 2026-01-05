package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import p001o.sk0;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends sk0 {
    @Override // p001o.sk0
    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo15451c(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // p001o.sk0
    /* renamed from: d */
    public AppCompatButton mo15452d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p001o.sk0
    /* renamed from: e */
    public AppCompatCheckBox mo15453e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // p001o.sk0
    /* renamed from: k */
    public AppCompatRadioButton mo15454k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // p001o.sk0
    /* renamed from: o */
    public AppCompatTextView mo15455o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
