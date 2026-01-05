package h4;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.e */
/* loaded from: classes.dex */
public abstract class AbstractC2828e {
    /* renamed from: a */
    public static boolean m6934a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    /* renamed from: b */
    public static boolean m6935b(Canvas canvas, float f6, float f10, float f11, float f12) {
        return canvas.clipOutRect(f6, f10, f11, f12);
    }

    /* renamed from: c */
    public static boolean m6936c(Canvas canvas, int i10, int i11, int i12, int i13) {
        return canvas.clipOutRect(i10, i11, i12, i13);
    }

    /* renamed from: d */
    public static boolean m6937d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* renamed from: e */
    public static boolean m6938e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    /* renamed from: f */
    public static final void m6939f(StaticLayout.Builder builder, int i10) {
        builder.setJustificationMode(i10);
    }
}
