package p001o;

import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes2.dex */
public abstract class dv7 {
    /* renamed from: a */
    public static void m23888a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m23889b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
