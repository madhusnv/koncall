package j4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.g */
/* loaded from: classes.dex */
public final class C3579g implements LineHeightSpan {

    /* renamed from: a */
    public final float f19130a;

    public C3579g(float f6) {
        this.f19130a = f6;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.f19130a));
    }
}
