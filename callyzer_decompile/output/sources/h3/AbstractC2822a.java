package h3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d3.AbstractC1550d;
import d3.InterfaceC1563q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2822a extends ViewGroup {
    /* renamed from: a */
    public final void m6927a(InterfaceC1563q interfaceC1563q, View view, long j6) {
        super.drawChild(AbstractC1550d.m5119a(interfaceC1563q), view, j6);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
