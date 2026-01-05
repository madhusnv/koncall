package p013o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.skydoves.balloon.internals.DefinitionKt;
import p012n.ViewOnTouchListenerC4921a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25684a;

    /* renamed from: b */
    public final /* synthetic */ ViewOnTouchListenerC4921a f25685b;

    public /* synthetic */ z0(ViewOnTouchListenerC4921a viewOnTouchListenerC4921a, int i10) {
        this.f25684a = i10;
        this.f25685b = viewOnTouchListenerC4921a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25684a) {
            case 0:
                ViewParent parent = this.f25685b.f24486d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC4921a viewOnTouchListenerC4921a = this.f25685b;
                viewOnTouchListenerC4921a.m9826a();
                View view = viewOnTouchListenerC4921a.f24486d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC4921a.m9828c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    viewOnTouchListenerC4921a.f24489g = true;
                    break;
                }
                break;
        }
    }
}
