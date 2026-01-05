package w3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import s3.AbstractC6744a;
import v4.AbstractC7663i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 extends ViewGroup {

    /* renamed from: a */
    public final HashMap f38067a;

    /* renamed from: b */
    public final HashMap f38068b;

    public z0(Context context) {
        super(context);
        setClipChildren(false);
        this.f38067a = new HashMap();
        this.f38068b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC7663i, v3.g0> getHolderToLayoutNode() {
        return this.f38067a;
    }

    public final HashMap<v3.g0, AbstractC7663i> getLayoutNodeToHolder() {
        return this.f38068b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        for (AbstractC7663i abstractC7663i : this.f38067a.keySet()) {
            abstractC7663i.layout(abstractC7663i.getLeft(), abstractC7663i.getTop(), abstractC7663i.getRight(), abstractC7663i.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            AbstractC6744a.m12906a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            AbstractC6744a.m12906a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (AbstractC7663i abstractC7663i : this.f38067a.keySet()) {
            int i13 = abstractC7663i.f37127x;
            if (i13 != Integer.MIN_VALUE && (i12 = abstractC7663i.f37128y) != Integer.MIN_VALUE) {
                abstractC7663i.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            v3.g0 g0Var = (v3.g0) this.f38067a.get(childAt);
            if (childAt.isLayoutRequested() && g0Var != null) {
                v3.g0.m14568W(g0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
