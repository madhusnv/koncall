package h4;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.f */
/* loaded from: classes.dex */
public abstract class AbstractC2829f {
    /* renamed from: a */
    public static void m6940a(Canvas canvas) {
        canvas.disableZ();
    }

    /* renamed from: b */
    public static void m6941b(Canvas canvas, int i10, BlendMode blendMode) {
        canvas.drawColor(i10, blendMode);
    }

    /* renamed from: c */
    public static void m6942c(Canvas canvas, long j6) {
        canvas.drawColor(j6);
    }

    /* renamed from: d */
    public static void m6943d(Canvas canvas, long j6, BlendMode blendMode) {
        canvas.drawColor(j6, blendMode);
    }

    /* renamed from: e */
    public static void m6944e(Canvas canvas, RectF rectF, float f6, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f6, f10, rectF2, f11, f12, paint);
    }

    /* renamed from: f */
    public static void m6945f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    /* renamed from: g */
    public static void m6946g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* renamed from: h */
    public static void m6947h(Canvas canvas, MeasuredText measuredText, int i10, int i11, int i12, int i13, float f6, float f10, boolean z6, Paint paint) {
        canvas.drawTextRun(measuredText, i10, i11, i12, i13, f6, f10, z6, paint);
    }

    /* renamed from: i */
    public static void m6948i(Canvas canvas) {
        canvas.enableZ();
    }

    /* renamed from: j */
    public static final void m6949j(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        paint.getTextBounds(charSequence, i10, i11, rect);
    }
}
