package p001o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p001o.wkf;

/* loaded from: classes6.dex */
public abstract class ay5 {
    /* renamed from: a */
    public static final void m17967a(wkf wkfVar, Canvas canvas, Paint paint, float f, ge8 ge8Var) {
        sq8.m48649h(wkfVar, "<this>");
        sq8.m48649h(canvas, "canvas");
        sq8.m48649h(paint, "paint");
        sq8.m48649h(ge8Var, "imageStore");
        if (sq8.m48644c(wkfVar, wkf.C17923b.f52276a)) {
            canvas.drawRect(0.0f, 0.0f, f, f, paint);
            return;
        }
        wkf.C17922a c17922a = wkf.C17922a.f52274a;
        if (sq8.m48644c(wkfVar, c17922a)) {
            c17922a.m54671a().m33323h(0.0f, 0.0f, f, f);
            canvas.drawOval(new RectF(c17922a.m54671a().mo31624c(), c17922a.m54671a().mo31625d(), c17922a.m54671a().getWidth(), c17922a.m54671a().getHeight()), paint);
        }
    }
}
