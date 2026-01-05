package h4;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import com.skydoves.balloon.internals.DefinitionKt;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.o */
/* loaded from: classes.dex */
public abstract class AbstractC2838o {
    /* renamed from: a */
    public static StaticLayout m6961a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, boolean z6, int i15, int i16, int i17, int i18) {
        if (i11 < 0) {
            AbstractC4646a.m9525a("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            AbstractC4646a.m9525a("invalid end value");
        }
        if (i12 < 0) {
            AbstractC4646a.m9525a("invalid maxLines value");
        }
        if (i10 < 0) {
            AbstractC4646a.m9525a("invalid width value");
        }
        if (i13 < 0) {
            AbstractC4646a.m9525a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i11, textPaint, i10);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i12);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i13);
        builderObtain.setLineSpacing(DefinitionKt.NO_Float_VALUE, 1.0f);
        builderObtain.setIncludePad(z6);
        builderObtain.setBreakStrategy(i15);
        builderObtain.setHyphenationFrequency(i18);
        builderObtain.setIndents(null, null);
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            AbstractC2828e.m6939f(builderObtain, i14);
        }
        if (i19 >= 28) {
            AbstractC2836m.m6959a(builderObtain);
        }
        if (i19 >= 33) {
            AbstractC2827d.m6933d(builderObtain, i16, i17);
        }
        if (i19 >= 35) {
            AbstractC2837n.m6960a(builderObtain);
        }
        return builderObtain.build();
    }

    /* renamed from: b */
    public static final Rect m6962b(TextPaint textPaint, CharSequence charSequence, int i10, int i11) {
        int i12 = i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i12 - 1, i11, MetricAffectingSpan.class) != i11) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i12 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i12, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i12, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC2829f.m6949j(textPaint2, charSequence, i12, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i12, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i12 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2829f.m6949j(textPaint, charSequence, i12, i11, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i12, i11, rect3);
        return rect3;
    }

    /* renamed from: c */
    public static final float m6963c(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    /* renamed from: d */
    public static final int m6964d(Layout layout, int i10, boolean z6) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z6) {
                    return lineForOffset - 1;
                }
            } else if (!z6) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0265 A[EDGE_INSN: B:203:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281], EDGE_INSN: B:204:0x0265->B:144:0x0265 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281]] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m6965e(h4.C2841r r19, android.text.Layout r20, a9.C0073l r21, int r22, android.graphics.RectF r23, i4.InterfaceC3170d r24, cp.C1475f r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.AbstractC2838o.m6965e(h4.r, android.text.Layout, a9.l, int, android.graphics.RectF, i4.d, cp.f, boolean):int");
    }

    /* renamed from: f */
    public static final boolean m6966f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
