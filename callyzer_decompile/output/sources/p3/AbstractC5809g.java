package p3;

import android.view.MotionEvent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.g */
/* loaded from: classes.dex */
public abstract class AbstractC5809g {
    /* renamed from: a */
    public static long m11389a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        float rawY = motionEvent.getRawY(i10);
        return (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
