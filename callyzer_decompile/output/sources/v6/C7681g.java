package v6;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.g */
/* loaded from: classes.dex */
public final class C7681g implements TextWatcher {

    /* renamed from: a */
    public final EditText f37170a;

    /* renamed from: b */
    public boolean f37171b = true;

    public C7681g(EditText editText) {
        this.f37170a = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f37170a.isInEditMode();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
