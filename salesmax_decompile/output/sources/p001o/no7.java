package p001o;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class no7 {

    /* renamed from: a */
    public final GestureDetector f37099a;

    public no7(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m40865a(MotionEvent motionEvent) {
        return this.f37099a.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public void m40866b(boolean z) {
        this.f37099a.setIsLongpressEnabled(z);
    }

    public no7(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f37099a = new GestureDetector(context, onGestureListener, handler);
    }
}
