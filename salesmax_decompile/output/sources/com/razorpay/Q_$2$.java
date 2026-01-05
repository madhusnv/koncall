package com.razorpay;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
final class Q_$2$ {

    /* renamed from: a */
    private View f13669a;

    /* renamed from: b */
    private int f13670b;

    /* renamed from: c */
    private FrameLayout.LayoutParams f13671c;

    /* renamed from: d */
    private int f13672d;

    private Q_$2$(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(android.R.id.content)).getChildAt(0);
        this.f13669a = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.razorpay.D$_X_
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Q_$2$.m16018a(this.f13604a);
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13669a.getLayoutParams();
        this.f13671c = layoutParams;
        this.f13672d = layoutParams.height;
    }

    /* renamed from: a */
    public static void m16017a(Activity activity) {
        new Q_$2$(activity);
    }

    /* renamed from: a */
    public static /* synthetic */ void m16018a(Q_$2$ q_$2$) {
        Rect rect = new Rect();
        q_$2$.f13669a.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != q_$2$.f13670b) {
            int height = q_$2$.f13669a.getRootView().getHeight();
            if (height - i > height / 4) {
                q_$2$.f13671c.height = i;
            } else {
                q_$2$.f13671c.height = q_$2$.f13672d;
            }
            q_$2$.f13669a.requestLayout();
            q_$2$.f13670b = i;
        }
    }
}
