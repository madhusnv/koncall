package p001o;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C2066c;

/* loaded from: classes2.dex */
public final class o56 extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f37786a;

    /* renamed from: b */
    public final C15712a f37787b;

    /* renamed from: o.o56$a */
    public static class C15712a {
        /* renamed from: a */
        public boolean m41611a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C2066c.m6065f(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void m41612b(EditorInfo editorInfo) {
            if (C2066c.m6068i()) {
                C2066c.m6064c().m6083v(editorInfo);
            }
        }
    }

    public o56(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C15712a());
    }

    /* renamed from: a */
    public final Editable m41610a() {
        return this.f37786a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f37787b.m41611a(this, m41610a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f37787b.m41611a(this, m41610a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public o56(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C15712a c15712a) {
        super(inputConnection, false);
        this.f37786a = textView;
        this.f37787b = c15712a;
        c15712a.m41612b(editorInfo);
    }
}
