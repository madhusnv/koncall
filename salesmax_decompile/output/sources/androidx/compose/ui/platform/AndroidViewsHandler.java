package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p001o.sq8;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class AndroidViewsHandler extends ViewGroup {

    /* renamed from: a */
    public final HashMap f6358a;

    /* renamed from: b */
    public final HashMap f6359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        setClipChildren(false);
        this.f6358a = new HashMap();
        this.f6359b = new HashMap();
    }

    /* renamed from: a */
    public Void m5090a(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, zh9> getHolderToLayoutNode() {
        return this.f6358a;
    }

    public final HashMap<zh9, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f6359b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) m5090a(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        sq8.m48649h(view, "child");
        sq8.m48649h(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> setKeySet = this.f6358a.keySet();
        sq8.m48648g(setKeySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : setKeySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Set setKeySet = this.f6358a.keySet();
        sq8.m48648g(setKeySet, "holderToLayoutNode.keys");
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            ((AndroidViewHolder) it.next()).m5283a();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            zh9 zh9Var = (zh9) this.f6358a.get(childAt);
            if (childAt.isLayoutRequested() && zh9Var != null) {
                zh9.U0(zh9Var, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
