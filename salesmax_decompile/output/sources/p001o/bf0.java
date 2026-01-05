package p001o;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public abstract class bf0 {
    /* renamed from: a */
    public static final ewc m18808a() {
        return new af0();
    }

    /* renamed from: b */
    public static final Paint m18809b() {
        return new Paint(7);
    }

    /* renamed from: c */
    public static final void m18810c(Paint paint, float f) {
        sq8.m48649h(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    /* renamed from: d */
    public static final void m18811d(Paint paint, long j) {
        sq8.m48649h(paint, "$this$setNativeColor");
        paint.setColor(rh3.m46769d(j));
    }

    /* renamed from: e */
    public static final void m18812e(Paint paint, float f) {
        sq8.m48649h(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: f */
    public static final void m18813f(Paint paint, int i) {
        sq8.m48649h(paint, "$this$setNativeStyle");
        paint.setStyle(gwc.m29551c(i, gwc.f25862a.m29552a()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
