package j4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4154l;
import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j4.i */
/* loaded from: classes.dex */
public final class C3581i extends ReplacementSpan {

    /* renamed from: a */
    public Paint.FontMetricsInt f19143a;

    /* renamed from: b */
    public int f19144b;

    /* renamed from: c */
    public int f19145c;

    /* renamed from: d */
    public boolean f19146d;

    /* renamed from: a */
    public final Paint.FontMetricsInt m8106a() {
        Paint.FontMetricsInt fontMetricsInt = this.f19143a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC4154l.m8928k("fontMetrics");
        throw null;
    }

    /* renamed from: b */
    public final int m8107b() {
        if (!this.f19146d) {
            AbstractC4646a.m9526b("PlaceholderSpan is not laid out yet.");
        }
        return this.f19145c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f19146d = true;
        paint.getTextSize();
        this.f19143a = paint.getFontMetricsInt();
        if (m8106a().descent <= m8106a().ascent) {
            AbstractC4646a.m9525a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f19144b = (int) Math.ceil(DefinitionKt.NO_Float_VALUE);
        this.f19145c = (int) Math.ceil(DefinitionKt.NO_Float_VALUE);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m8106a().ascent;
            fontMetricsInt.descent = m8106a().descent;
            fontMetricsInt.leading = m8106a().leading;
            if (fontMetricsInt.ascent > (-m8107b())) {
                fontMetricsInt.ascent = -m8107b();
            }
            fontMetricsInt.top = Math.min(m8106a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m8106a().bottom, fontMetricsInt.descent);
        }
        if (!this.f19146d) {
            AbstractC4646a.m9526b("PlaceholderSpan is not laid out yet.");
        }
        return this.f19144b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f6, int i12, int i13, int i14, Paint paint) {
    }
}
