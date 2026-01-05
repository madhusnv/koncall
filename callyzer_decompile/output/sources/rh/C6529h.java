package rh;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.h */
/* loaded from: classes.dex */
public final class C6529h extends AbstractC6536o {

    /* renamed from: d */
    public final /* synthetic */ int f31313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6529h(TextInputLayout textInputLayout, int i10) {
        super(textInputLayout);
        this.f31313d = i10;
    }

    @Override // rh.AbstractC6536o
    /* renamed from: a */
    public final void mo12551a() {
        switch (this.f31313d) {
            case 0:
                TextInputLayout textInputLayout = this.f31336a;
                textInputLayout.setEndIconOnClickListener(null);
                textInputLayout.setEndIconOnLongClickListener(null);
                break;
            default:
                TextInputLayout textInputLayout2 = this.f31336a;
                textInputLayout2.setEndIconOnClickListener(null);
                textInputLayout2.setEndIconDrawable((Drawable) null);
                textInputLayout2.setEndIconContentDescription((CharSequence) null);
                break;
        }
    }
}
