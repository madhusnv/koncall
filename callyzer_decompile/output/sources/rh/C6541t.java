package rh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import c6.C0872b;
import com.google.android.material.textfield.TextInputLayout;
import com.websoptimization.callyzerbiz.R;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.t */
/* loaded from: classes.dex */
public class C6541t extends C0872b {

    /* renamed from: d */
    public final TextInputLayout f31370d;

    public C6541t(TextInputLayout textInputLayout) {
        this.f31370d = textInputLayout;
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public void mo2338d(View view, C1617g c1617g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        this.f5422a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f31370d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.L1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        if (!zIsEmpty) {
            c1617g.m5300s(text);
        } else if (!TextUtils.isEmpty(string)) {
            c1617g.m5300s(string);
            if (!z6 && placeholderText != null) {
                c1617g.m5300s(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c1617g.m5300s(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c1617g.m5296o(string);
            } else {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                c1617g.m5300s(string);
            }
            c1617g.m5299r(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.textinput_helper_text);
        }
    }
}
