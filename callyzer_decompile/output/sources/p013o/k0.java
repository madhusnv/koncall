package p013o;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class k0 {
    /* renamed from: a */
    public static StaticLayout m10249a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, n0 n0Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            n0Var.mo10250a(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }
}
