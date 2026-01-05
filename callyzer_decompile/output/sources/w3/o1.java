package w3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.websoptimization.callyzerbiz.R;
import d3.AbstractC1550d;
import d3.InterfaceC1563q;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class o1 extends ViewGroup {

    /* renamed from: a */
    public boolean f37906a;

    public o1(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m14998a(InterfaceC1563q interfaceC1563q, u2 u2Var, long j6) {
        super.drawChild(AbstractC1550d.m5119a(interfaceC1563q), u2Var, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC4154l.m8921d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((u2) childAt).f37995h) {
                this.f37906a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f37906a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f37906a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
