package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.C1350n;
import com.google.android.material.textfield.TextInputLayout;
import p012n.MenuItemC4930j;
import p013o.a2;
import p013o.e2;
import rh.C6528g;
import rh.C6535n;
import rh.C6539r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1348l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f6867a;

    /* renamed from: b */
    public final /* synthetic */ Object f6868b;

    public /* synthetic */ ViewOnClickListenerC1348l(int i10, Object obj) {
        this.f6867a = i10;
        this.f6868b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6867a) {
            case 0:
                C1350n c1350n = (C1350n) this.f6868b;
                C1350n.a aVar = c1350n.f6875e;
                C1350n.a aVar2 = C1350n.a.YEAR;
                if (aVar == aVar2) {
                    c1350n.m4098j(C1350n.a.DAY);
                    return;
                } else {
                    if (aVar == C1350n.a.DAY) {
                        c1350n.m4098j(aVar2);
                        return;
                    }
                    return;
                }
            case 1:
                C1351o c1351o = (C1351o) this.f6868b;
                Button button = c1351o.f6886G;
                c1351o.getClass();
                throw null;
            case 2:
                a2 a2Var = ((Toolbar) this.f6868b).f1787T;
                MenuItemC4930j menuItemC4930j = a2Var == null ? null : a2Var.f25437b;
                if (menuItemC4930j != null) {
                    menuItemC4930j.collapseActionView();
                    return;
                }
                return;
            case 3:
                e2 e2Var = (e2) this.f6868b;
                if (e2Var.f25475k != null) {
                    e2Var.getClass();
                    return;
                }
                return;
            case 4:
                TextInputLayout textInputLayout = ((C6528g) this.f6868b).f31336a;
                Editable text = textInputLayout.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
                textInputLayout.m4127k(textInputLayout.f43900n1, textInputLayout.f43902p1);
                return;
            case 5:
                C6535n c6535n = (C6535n) this.f6868b;
                C6535n.m12555d(c6535n, (AutoCompleteTextView) c6535n.f31336a.getEditText());
                return;
            default:
                C6539r c6539r = (C6539r) this.f6868b;
                TextInputLayout textInputLayout2 = c6539r.f31336a;
                EditText editText = textInputLayout2.getEditText();
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (C6539r.m12570d(c6539r)) {
                    editText.setTransformationMethod(null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                textInputLayout2.m4127k(textInputLayout2.f43900n1, textInputLayout2.f43902p1);
                return;
        }
    }

    public ViewOnClickListenerC1348l(e2 e2Var) {
        this.f6867a = 3;
        this.f6868b = e2Var;
        e2Var.f25465a.getContext();
    }
}
