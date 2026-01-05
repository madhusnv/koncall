package p001o;

import android.content.Context;

/* loaded from: classes2.dex */
public final class xf0 {

    /* renamed from: a */
    public static final xf0 f53677a = new xf0();

    /* renamed from: b */
    public static float f53678b = 1.0f;

    /* renamed from: c */
    public static final int f53679c = 8;

    /* renamed from: a */
    public final void m56204a(Context context) {
        try {
            f53678b = context.getResources().getDisplayMetrics().density;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final int m56205b(float f, Context context) {
        sq8.m48649h(context, "context");
        if (f53678b == 1.0f) {
            m56204a(context);
        }
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(f53678b * f);
    }
}
