package v6;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import u6.AbstractC7347a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.h */
/* loaded from: classes.dex */
public final class C7682h implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f37172a;

    public C7682h(TransformationMethod transformationMethod) {
        this.f37172a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f37172a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        AbstractC7347a.m13754b();
        throw null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z6, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f37172a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z6, i10, rect);
        }
    }
}
