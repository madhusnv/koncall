package p001o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class agd implements Spannable {

    /* renamed from: o.agd$a */
    public static final class C12167a {

        /* renamed from: a */
        public final TextPaint f14670a;

        /* renamed from: b */
        public final TextDirectionHeuristic f14671b;

        /* renamed from: c */
        public final int f14672c;

        /* renamed from: d */
        public final int f14673d;

        /* renamed from: e */
        public final PrecomputedText.Params f14674e;

        /* renamed from: o.agd$a$a */
        public static class a {

            /* renamed from: a */
            public final TextPaint f14675a;

            /* renamed from: c */
            public int f14677c = 1;

            /* renamed from: d */
            public int f14678d = 1;

            /* renamed from: b */
            public TextDirectionHeuristic f14676b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.f14675a = textPaint;
            }

            /* renamed from: a */
            public C12167a m17030a() {
                return new C12167a(this.f14675a, this.f14676b, this.f14677c, this.f14678d);
            }

            /* renamed from: b */
            public a m17031b(int i) {
                this.f14677c = i;
                return this;
            }

            /* renamed from: c */
            public a m17032c(int i) {
                this.f14678d = i;
                return this;
            }

            /* renamed from: d */
            public a m17033d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f14676b = textDirectionHeuristic;
                return this;
            }
        }

        public C12167a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f14674e = zfd.m59379a(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f14674e = null;
            }
            this.f14670a = textPaint;
            this.f14671b = textDirectionHeuristic;
            this.f14672c = i;
            this.f14673d = i2;
        }

        /* renamed from: a */
        public boolean m17025a(C12167a c12167a) {
            if (this.f14672c == c12167a.m17026b() && this.f14673d == c12167a.m17027c() && this.f14670a.getTextSize() == c12167a.m17029e().getTextSize() && this.f14670a.getTextScaleX() == c12167a.m17029e().getTextScaleX() && this.f14670a.getTextSkewX() == c12167a.m17029e().getTextSkewX() && this.f14670a.getLetterSpacing() == c12167a.m17029e().getLetterSpacing() && TextUtils.equals(this.f14670a.getFontFeatureSettings(), c12167a.m17029e().getFontFeatureSettings()) && this.f14670a.getFlags() == c12167a.m17029e().getFlags() && this.f14670a.getTextLocales().equals(c12167a.m17029e().getTextLocales())) {
                return this.f14670a.getTypeface() == null ? c12167a.m17029e().getTypeface() == null : this.f14670a.getTypeface().equals(c12167a.m17029e().getTypeface());
            }
            return false;
        }

        /* renamed from: b */
        public int m17026b() {
            return this.f14672c;
        }

        /* renamed from: c */
        public int m17027c() {
            return this.f14673d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m17028d() {
            return this.f14671b;
        }

        /* renamed from: e */
        public TextPaint m17029e() {
            return this.f14670a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C12167a)) {
                return false;
            }
            C12167a c12167a = (C12167a) obj;
            return m17025a(c12167a) && this.f14671b == c12167a.m17028d();
        }

        public int hashCode() {
            return s6c.m47910b(Float.valueOf(this.f14670a.getTextSize()), Float.valueOf(this.f14670a.getTextScaleX()), Float.valueOf(this.f14670a.getTextSkewX()), Float.valueOf(this.f14670a.getLetterSpacing()), Integer.valueOf(this.f14670a.getFlags()), this.f14670a.getTextLocales(), this.f14670a.getTypeface(), Boolean.valueOf(this.f14670a.isElegantTextHeight()), this.f14671b, Integer.valueOf(this.f14672c), Integer.valueOf(this.f14673d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f14670a.getTextSize());
            sb.append(", textScaleX=" + this.f14670a.getTextScaleX());
            sb.append(", textSkewX=" + this.f14670a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f14670a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f14670a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f14670a.getTextLocales());
            sb.append(", typeface=" + this.f14670a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f14670a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f14671b);
            sb.append(", breakStrategy=" + this.f14672c);
            sb.append(", hyphenationFrequency=" + this.f14673d);
            sb.append("}");
            return sb.toString();
        }

        public C12167a(PrecomputedText.Params params) {
            this.f14670a = params.getTextPaint();
            this.f14671b = params.getTextDirection();
            this.f14672c = params.getBreakStrategy();
            this.f14673d = params.getHyphenationFrequency();
            this.f14674e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
