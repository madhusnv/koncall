package a6;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a6.c */
/* loaded from: classes.dex */
public final class C0055c {

    /* renamed from: a */
    public final TextPaint f228a;

    /* renamed from: b */
    public final TextDirectionHeuristic f229b;

    /* renamed from: c */
    public final int f230c;

    /* renamed from: d */
    public final int f231d;

    public C0055c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
        }
        this.f228a = textPaint;
        this.f229b = textDirectionHeuristic;
        this.f230c = i10;
        this.f231d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0055c)) {
            return false;
        }
        C0055c c0055c = (C0055c) obj;
        if (this.f230c != c0055c.f230c || this.f231d != c0055c.f231d) {
            return false;
        }
        TextPaint textPaint = this.f228a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0055c.f228a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f229b == c0055c.f229b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f228a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f229b, Integer.valueOf(this.f230c), Integer.valueOf(this.f231d));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f228a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb2.append(", textLocale=" + textPaint.getTextLocales());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            sb2.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb2.append(", textDir=" + this.f229b);
        sb2.append(", breakStrategy=" + this.f230c);
        sb2.append(", hyphenationFrequency=" + this.f231d);
        sb2.append("}");
        return sb2.toString();
    }

    public C0055c(PrecomputedText.Params params) {
        this.f228a = params.getTextPaint();
        this.f229b = params.getTextDirection();
        this.f230c = params.getBreakStrategy();
        this.f231d = params.getHyphenationFrequency();
    }
}
