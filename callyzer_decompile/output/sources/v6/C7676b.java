package v6;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import ug.C7454y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.b */
/* loaded from: classes.dex */
public final class C7676b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f37161a;

    /* renamed from: b */
    public final C7454y f37162b;

    public C7676b(EditText editText, InputConnection inputConnection) {
        C7454y c7454y = new C7454y(20);
        super(inputConnection, false);
        this.f37161a = editText;
        this.f37162b = c7454y;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f37161a.getEditableText();
        this.f37162b.getClass();
        return C7454y.m14193e(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f37161a.getEditableText();
        this.f37162b.getClass();
        return C7454y.m14193e(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
