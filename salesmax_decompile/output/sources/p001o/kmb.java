package p001o;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public abstract class kmb {
    /* renamed from: a */
    public static boolean m35931a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
