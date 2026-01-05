package rh;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.a */
/* loaded from: classes.dex */
public final class C6522a implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ int f31295a;

    /* renamed from: b */
    public final /* synthetic */ Object f31296b;

    public /* synthetic */ C6522a(int i10, Object obj) {
        this.f31295a = i10;
        this.f31296b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        switch (this.f31295a) {
            case 0:
                C6528g c6528g = (C6528g) this.f31296b;
                TextInputLayout textInputLayout = c6528g.f31336a;
                if (textInputLayout.getSuffixText() == null) {
                    c6528g.m12553d(textInputLayout.hasFocus() && editable.length() > 0);
                    break;
                }
                break;
            default:
                TextInputLayout textInputLayout2 = (TextInputLayout) this.f31296b;
                textInputLayout2.m4134s(!textInputLayout2.R1, false);
                if (textInputLayout2.f6965k) {
                    textInputLayout2.m4129n(editable.length());
                }
                if (textInputLayout2.f6972s) {
                    textInputLayout2.m4135t(editable.length());
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31295a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31295a;
    }

    /* renamed from: a */
    private final void m12546a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* renamed from: b */
    private final void m12547b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* renamed from: c */
    private final void m12548c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    /* renamed from: d */
    private final void m12549d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
