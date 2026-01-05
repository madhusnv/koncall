package j4;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.f */
/* loaded from: classes.dex */
public final class C3578f extends MetricAffectingSpan {

    /* renamed from: a */
    public final float f19129a;

    public C3578f(float f6) {
        this.f19129a = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == DefinitionKt.NO_Float_VALUE) {
            return;
        }
        textPaint.setLetterSpacing(this.f19129a / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == DefinitionKt.NO_Float_VALUE) {
            return;
        }
        textPaint.setLetterSpacing(this.f19129a / textScaleX);
    }
}
