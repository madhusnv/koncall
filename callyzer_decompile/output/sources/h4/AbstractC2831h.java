package h4;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.h */
/* loaded from: classes.dex */
public abstract class AbstractC2831h {
    /* renamed from: a */
    public static void m6953a(Canvas canvas, int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    /* renamed from: b */
    public static void m6954b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* renamed from: c */
    public static void m6955c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
