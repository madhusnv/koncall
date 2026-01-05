package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import p001o.mc2;
import p001o.md0;
import p001o.s8e;
import p001o.sq8;

/* loaded from: classes2.dex */
public class DrawChildContainer extends ViewGroup {

    /* renamed from: a */
    public boolean f6364a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        setClipChildren(false);
        setTag(s8e.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m5092a(mc2 mc2Var, View view, long j) {
        sq8.m48649h(mc2Var, "canvas");
        sq8.m48649h(view, "view");
        super.drawChild(md0.m38750b(mc2Var), view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        sq8.m48649h(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            sq8.m48647f(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).m5112t()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f6364a = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f6364a = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f6364a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
