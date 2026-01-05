package k4;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.ArrayList;
import og.se;
import u4.AbstractC7338a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a */
    public static final ThreadLocal f20664a = new ThreadLocal();

    /* renamed from: a */
    public static Typeface m8759a(Typeface typeface, C3997r c3997r, Context context) {
        ArrayList arrayList = c3997r.f20691a;
        if (typeface == null) {
            return null;
        }
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = f20664a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(AbstractC7338a.m13729a(arrayList, null, new c0(0, se.m10913a(context)), 31));
        return paint.getTypeface();
    }
}
