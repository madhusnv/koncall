package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.timepicker.d */
/* loaded from: classes3.dex */
public class ViewOnKeyListenerC11176d implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f13227a;

    /* renamed from: b */
    public final ChipTextInputComboView f13228b;

    /* renamed from: c */
    public final TimeModel f13229c;

    /* renamed from: d */
    public boolean f13230d = false;

    public ViewOnKeyListenerC11176d(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f13227a = chipTextInputComboView;
        this.f13228b = chipTextInputComboView2;
        this.f13229c = timeModel;
    }

    /* renamed from: a */
    public void m15571a() {
        TextInputLayout textInputLayoutM15460e = this.f13227a.m15460e();
        TextInputLayout textInputLayoutM15460e2 = this.f13228b.m15460e();
        EditText editText = textInputLayoutM15460e.getEditText();
        EditText editText2 = textInputLayoutM15460e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void m15572b(EditText editText) {
        if (editText.getSelectionStart() == 0 && editText.length() == 2) {
            editText.getText().clear();
        }
    }

    /* renamed from: c */
    public final void m15573c(int i) {
        this.f13228b.setChecked(i == 12);
        this.f13227a.setChecked(i == 10);
        this.f13229c.f13209f = i;
    }

    /* renamed from: d */
    public final boolean m15574d(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            m15573c(12);
            return true;
        }
        if (i >= 7 && i <= 16) {
            m15572b(editText);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m15575e(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            m15573c(10);
            return true;
        }
        if (i >= 7 && i <= 16) {
            m15572b(editText);
        }
        return false;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            m15573c(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f13230d) {
            return false;
        }
        this.f13230d = true;
        EditText editText = (EditText) view;
        boolean zM15575e = this.f13229c.f13209f == 12 ? m15575e(i, keyEvent, editText) : m15574d(i, keyEvent, editText);
        this.f13230d = false;
        return zM15575e;
    }
}
