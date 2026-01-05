package p001o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class gk0 {

    /* renamed from: a */
    public final TextView f25370a;

    /* renamed from: b */
    public final s56 f25371b;

    public gk0(TextView textView) {
        this.f25370a = textView;
        this.f25371b = new s56(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m28939a(InputFilter[] inputFilterArr) {
        return this.f25371b.m47855a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m28940b() {
        return this.f25371b.m47856b();
    }

    /* renamed from: c */
    public void m28941c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f25370a.getContext().obtainStyledAttributes(attributeSet, bbe.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(bbe.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(bbe.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m28943e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void m28942d(boolean z) {
        this.f25371b.m47857c(z);
    }

    /* renamed from: e */
    public void m28943e(boolean z) {
        this.f25371b.m47858d(z);
    }

    /* renamed from: f */
    public TransformationMethod m28944f(TransformationMethod transformationMethod) {
        return this.f25371b.m47859e(transformationMethod);
    }
}
