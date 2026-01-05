package p001o;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes6.dex */
public class nq8 implements TextWatcher {

    /* renamed from: a */
    public u6d f37165a;

    /* renamed from: c */
    public boolean f37167c;

    /* renamed from: d */
    public jp0 f37168d;

    /* renamed from: e */
    public String f37169e;

    /* renamed from: g */
    public int f37171g;

    /* renamed from: q */
    public boolean f37173q;

    /* renamed from: b */
    public boolean f37166b = false;

    /* renamed from: f */
    public Editable f37170f = null;

    /* renamed from: h */
    public boolean f37172h = false;

    public nq8(Context context, String str, int i, boolean z) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.f37165a = u6d.m51000e(context);
        m40921d(str, i);
        this.f37173q = z;
    }

    /* renamed from: a */
    public final boolean m40918a(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        if (this.f37167c) {
            if (editable.length() == 0) {
                z = false;
            }
            this.f37167c = z;
            return;
        }
        if (this.f37166b) {
            return;
        }
        int selectionEnd = Selection.getSelectionEnd(editable);
        boolean z2 = selectionEnd == editable.length();
        String strM40919b = m40919b(editable);
        if (!strM40919b.equals(editable.toString())) {
            if (!z2) {
                int i = 0;
                for (int i2 = 0; i2 < editable.length() && i2 < selectionEnd; i2++) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                        i++;
                    }
                }
                selectionEnd = 0;
                int i3 = 0;
                while (true) {
                    if (selectionEnd >= strM40919b.length()) {
                        selectionEnd = 0;
                        break;
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        if (PhoneNumberUtils.isNonSeparator(strM40919b.charAt(selectionEnd))) {
                            i3++;
                        }
                        selectionEnd++;
                    }
                }
            } else {
                selectionEnd = strM40919b.length();
            }
        }
        if (!z2) {
            while (true) {
                int i4 = selectionEnd - 1;
                if (i4 > 0 && !PhoneNumberUtils.isNonSeparator(strM40919b.charAt(i4))) {
                    selectionEnd--;
                }
            }
        }
        try {
            this.f37166b = true;
            editable.replace(0, editable.length(), strM40919b, 0, strM40919b.length());
            this.f37166b = false;
            this.f37170f = editable;
            Selection.setSelection(editable, selectionEnd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final String m40919b(CharSequence charSequence) {
        this.f37168d.m34177h();
        String str = "+" + this.f37171g;
        if (this.f37173q || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + ((Object) charSequence);
        }
        int length = charSequence.length();
        char c = 0;
        String strM34183n = "";
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(cCharAt)) {
                if (c != 0) {
                    strM34183n = this.f37168d.m34183n(c);
                }
                c = cCharAt;
            }
        }
        if (c != 0) {
            strM34183n = this.f37168d.m34183n(c);
        }
        String strTrim = strM34183n.trim();
        if (this.f37173q || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            strTrim = strTrim.length() > str.length() ? strTrim.charAt(str.length()) == ' ' ? strTrim.substring(str.length() + 1) : strTrim.substring(str.length()) : "";
        }
        return TextUtils.isEmpty(strTrim) ? "" : strTrim;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f37166b || this.f37167c || i2 <= 0 || !m40918a(charSequence, i, i2) || this.f37172h) {
            return;
        }
        m40920c();
    }

    /* renamed from: c */
    public final void m40920c() {
        this.f37167c = true;
        this.f37168d.m34177h();
    }

    /* renamed from: d */
    public void m40921d(String str, int i) {
        this.f37169e = str;
        this.f37171g = i;
        jp0 jp0VarM51034q = this.f37165a.m51034q(str);
        this.f37168d = jp0VarM51034q;
        jp0VarM51034q.m34177h();
        Editable editable = this.f37170f;
        if (editable != null) {
            this.f37172h = true;
            String strM50996R = u6d.m50996R(editable);
            Editable editable2 = this.f37170f;
            editable2.replace(0, editable2.length(), strM50996R, 0, strM50996R.length());
            this.f37172h = false;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f37166b || this.f37167c || i3 <= 0 || !m40918a(charSequence, i, i3)) {
            return;
        }
        m40920c();
    }
}
