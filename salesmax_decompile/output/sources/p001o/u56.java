package p001o;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C2066c;

/* loaded from: classes2.dex */
public class u56 implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f48355a;

    public u56(TransformationMethod transformationMethod) {
        this.f48355a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod m50954a() {
        return this.f48355a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f48355a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C2066c.m6064c().m6070e() != 1) ? charSequence : C2066c.m6064c().m6077p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f48355a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
