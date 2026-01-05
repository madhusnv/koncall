package h4;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.d */
/* loaded from: classes.dex */
public abstract class AbstractC2827d {
    /* renamed from: a */
    public static final BoringLayout.Metrics m6930a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    /* renamed from: b */
    public static final boolean m6931b(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    /* renamed from: c */
    public static final boolean m6932c(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* renamed from: d */
    public static final void m6933d(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
