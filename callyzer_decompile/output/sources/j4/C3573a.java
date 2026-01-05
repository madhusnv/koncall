package j4;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.a */
/* loaded from: classes.dex */
public final class C3573a extends MetricAffectingSpan {

    /* renamed from: a */
    public final /* synthetic */ int f19123a;

    /* renamed from: b */
    public final float f19124b;

    public /* synthetic */ C3573a(float f6, int i10) {
        this.f19123a = i10;
        this.f19124b = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f19123a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f19124b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f19124b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f19123a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f19124b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f19124b);
                break;
        }
    }
}
