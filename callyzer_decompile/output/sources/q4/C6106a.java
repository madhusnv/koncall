package q4;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import f3.AbstractC2199e;
import f3.C2201g;
import f3.C2202h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q4.a */
/* loaded from: classes.dex */
public final class C6106a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a */
    public final AbstractC2199e f29813a;

    public C6106a(AbstractC2199e abstractC2199e) {
        this.f29813a = abstractC2199e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C2201g c2201g = C2201g.f10129a;
            AbstractC2199e abstractC2199e = this.f29813a;
            if (AbstractC4154l.m8918a(abstractC2199e, c2201g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC2199e instanceof C2202h) {
                textPaint.setStyle(Paint.Style.STROKE);
                C2202h c2202h = (C2202h) abstractC2199e;
                textPaint.setStrokeWidth(c2202h.f10130a);
                textPaint.setStrokeMiter(c2202h.f10131b);
                int i10 = c2202h.f10133d;
                textPaint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i11 = c2202h.f10132c;
                textPaint.setStrokeCap(i11 == 0 ? Paint.Cap.BUTT : i11 == 1 ? Paint.Cap.ROUND : i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                textPaint.setPathEffect(null);
            }
        }
    }
}
