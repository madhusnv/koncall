package og;

import android.text.TextPaint;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class la {
    /* renamed from: a */
    public static final void m10744a(TextPaint textPaint, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f6 * 255));
    }
}
