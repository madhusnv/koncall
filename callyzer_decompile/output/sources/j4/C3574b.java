package j4;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.b */
/* loaded from: classes.dex */
public final class C3574b extends MetricAffectingSpan {

    /* renamed from: a */
    public final /* synthetic */ int f19125a;

    /* renamed from: b */
    public final Object f19126b;

    public /* synthetic */ C3574b(int i10, Object obj) {
        this.f19125a = i10;
        this.f19126b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f19125a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f19126b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f19126b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f19125a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f19126b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f19126b);
                break;
        }
    }
}
