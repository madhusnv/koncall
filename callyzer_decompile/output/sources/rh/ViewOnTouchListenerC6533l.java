package rh;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.l */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC6533l implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f31320a;

    /* renamed from: b */
    public final /* synthetic */ C6535n f31321b;

    public ViewOnTouchListenerC6533l(C6535n c6535n, AutoCompleteTextView autoCompleteTextView) {
        this.f31321b = c6535n;
        this.f31320a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C6535n c6535n = this.f31321b;
            long j6 = jCurrentTimeMillis - c6535n.f31330k;
            if (j6 < 0 || j6 > 300) {
                c6535n.f31328i = false;
            }
            C6535n.m12555d(c6535n, this.f31320a);
        }
        return false;
    }
}
