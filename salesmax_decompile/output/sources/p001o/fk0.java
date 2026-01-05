package p001o;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes2.dex */
public class fk0 {

    /* renamed from: a */
    public final EditText f23541a;

    /* renamed from: b */
    public final l56 f23542b;

    public fk0(EditText editText) {
        this.f23541a = editText;
        this.f23542b = new l56(editText, false);
    }

    /* renamed from: a */
    public KeyListener m26940a(KeyListener keyListener) {
        return m26941b(keyListener) ? this.f23542b.m36585a(keyListener) : keyListener;
    }

    /* renamed from: b */
    public boolean m26941b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public void m26942c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f23541a.getContext().obtainStyledAttributes(attributeSet, bbe.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m26944e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public InputConnection m26943d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f23542b.m36586b(inputConnection, editorInfo);
    }

    /* renamed from: e */
    public void m26944e(boolean z) {
        this.f23542b.m36587c(z);
    }
}
