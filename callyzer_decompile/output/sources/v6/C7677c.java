package v6;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import u6.AbstractC7347a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v6.c */
/* loaded from: classes.dex */
public final class C7677c implements InputFilter {

    /* renamed from: a */
    public final TextView f37163a;

    public C7677c(TextView textView) {
        this.f37163a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f37163a.isInEditMode()) {
            return charSequence;
        }
        AbstractC7347a.m13754b();
        throw null;
    }
}
