package h4;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h4.g */
/* loaded from: classes.dex */
public abstract class AbstractC2830g {
    /* renamed from: a */
    public static boolean m6950a(Canvas canvas, float f6, float f10, float f11, float f12) {
        return canvas.quickReject(f6, f10, f11, f12);
    }

    /* renamed from: b */
    public static boolean m6951b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* renamed from: c */
    public static boolean m6952c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
