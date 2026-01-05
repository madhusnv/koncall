package rh;

import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.s */
/* loaded from: classes.dex */
public final class RunnableC6540s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f31368a;

    /* renamed from: b */
    public final /* synthetic */ TextInputLayout f31369b;

    public /* synthetic */ RunnableC6540s(TextInputLayout textInputLayout, int i10) {
        this.f31368a = i10;
        this.f31369b = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31368a) {
            case 0:
                TextInputLayout textInputLayout = this.f31369b;
                textInputLayout.f43900n1.performClick();
                textInputLayout.f43900n1.jumpDrawablesToCurrentState();
                break;
            default:
                this.f31369b.f6960e.requestLayout();
                break;
        }
    }
}
