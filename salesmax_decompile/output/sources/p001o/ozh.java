package p001o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.emoji2.text.C2066c;

/* loaded from: classes2.dex */
public final class ozh extends r56 {

    /* renamed from: g */
    public static Paint f39117g;

    /* renamed from: f */
    public TextPaint f39118f;

    public ozh(nzh nzhVar) {
        super(nzhVar);
    }

    /* renamed from: e */
    public static Paint m42820e() {
        if (f39117g == null) {
            TextPaint textPaint = new TextPaint();
            f39117g = textPaint;
            textPaint.setColor(C2066c.m6064c().m6069d());
            f39117g.setStyle(Paint.Style.FILL);
        }
        return f39117g;
    }

    /* renamed from: c */
    public final TextPaint m42821c(CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f39118f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f39118f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    /* renamed from: d */
    public void m42822d(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintM42821c = m42821c(charSequence, i, i2, paint2);
        if (textPaintM42821c != null && textPaintM42821c.bgColor != 0) {
            m42822d(canvas, textPaintM42821c, f, f + m46237b(), i3, i5);
        }
        if (C2066c.m6064c().m6071j()) {
            canvas.drawRect(f, i3, f + m46237b(), i5, m42820e());
        }
        nzh nzhVarM46236a = m46236a();
        float f2 = i4;
        if (textPaintM42821c != null) {
            paint2 = textPaintM42821c;
        }
        nzhVarM46236a.m41325a(canvas, f, f2, paint2);
    }
}
