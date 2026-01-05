package p013o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ j1 f25537a;

    public i1(j1 j1Var) {
        this.f25537a = j1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        j1 j1Var = this.f25537a;
        f1 f1Var = j1Var.f25560p;
        Handler handler = j1Var.f25564t;
        C5238x c5238x = j1Var.f25568y;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && c5238x != null && c5238x.isShowing() && x3 >= 0 && x3 < c5238x.getWidth() && y10 >= 0 && y10 < c5238x.getHeight()) {
            handler.postDelayed(f1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(f1Var);
        return false;
    }
}
