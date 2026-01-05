package h4;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.l */
/* loaded from: classes.dex */
public final class C2835l {

    /* renamed from: a */
    public final CharSequence f15816a;

    /* renamed from: b */
    public final TextPaint f15817b;

    /* renamed from: c */
    public final int f15818c;

    /* renamed from: d */
    public float f15819d = Float.NaN;

    /* renamed from: e */
    public float f15820e = Float.NaN;

    /* renamed from: f */
    public BoringLayout.Metrics f15821f;

    /* renamed from: g */
    public boolean f15822g;

    /* renamed from: h */
    public CharSequence f15823h;

    public C2835l(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f15816a = charSequence;
        this.f15817b = textPaint;
        this.f15818c = i10;
    }

    /* renamed from: a */
    public final BoringLayout.Metrics m6956a() {
        if (!this.f15822g) {
            TextDirectionHeuristic textDirectionHeuristicM6977a = AbstractC2842s.m6977a(this.f15818c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f15816a;
            TextPaint textPaint = this.f15817b;
            this.f15821f = i10 >= 33 ? AbstractC2827d.m6930a(charSequence, textPaint, textDirectionHeuristicM6977a) : !textDirectionHeuristicM6977a.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f15822g = true;
        }
        return this.f15821f;
    }

    /* renamed from: b */
    public final CharSequence m6957b() {
        CharSequence charSequence = this.f15823h;
        if (charSequence != null) {
            AbstractC4154l.m8920c(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f15816a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (AbstractC2838o.m6966f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f15823h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m6958c() {
        /*
            r6 = this;
            float r0 = r6.f15819d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f15819d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.m6956a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f15817b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.m6957b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.m6957b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f15816a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<j4.f> r4 = j4.C3578f.class
            boolean r4 = h4.AbstractC2838o.m6966f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<j4.e> r4 = j4.C3577e.class
            boolean r2 = h4.AbstractC2838o.m6966f(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f15819d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C2835l.m6958c():float");
    }
}
