package p001o;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class omb {

    /* renamed from: a */
    public static final omb f38592a = new omb();

    /* renamed from: a */
    public final boolean m42438a(MotionEvent motionEvent, int i) {
        sq8.m48649h(motionEvent, "event");
        float rawX = motionEvent.getRawX(i);
        if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
            float rawY = motionEvent.getRawY(i);
            if ((Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
