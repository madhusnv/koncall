package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p001o.alb;
import p001o.gtb;
import p001o.h1f;
import p001o.htb;
import p001o.ksi;
import p001o.rzi;
import p001o.sn3;
import p001o.sq8;
import p001o.tzi;
import p001o.uk7;
import p001o.v9c;
import p001o.wxf;
import p001o.xca;
import p001o.xk7;
import p001o.zh9;
import p001o.zl5;

/* loaded from: classes2.dex */
public class AndroidViewHolder extends ViewGroup implements gtb, sn3 {

    /* renamed from: H */
    public final uk7 f6534H;

    /* renamed from: L */
    public xk7 f6535L;

    /* renamed from: M */
    public final int[] f6536M;

    /* renamed from: Q */
    public int f6537Q;

    /* renamed from: a */
    public final View f6538a;

    /* renamed from: b */
    public uk7 f6539b;

    /* renamed from: c */
    public boolean f6540c;

    /* renamed from: d */
    public uk7 f6541d;

    /* renamed from: e */
    public uk7 f6542e;

    /* renamed from: f */
    public alb f6543f;

    /* renamed from: g */
    public xk7 f6544g;

    /* renamed from: h */
    public zl5 f6545h;
    public int h0;
    public final htb i0;
    public final zh9 j0;

    /* renamed from: q */
    public xk7 f6546q;

    /* renamed from: s */
    public xca f6547s;

    /* renamed from: x */
    public h1f f6548x;

    /* renamed from: y */
    public final wxf f6549y;

    /* renamed from: a */
    public final void m5283a() {
        int i;
        int i2 = this.f6537Q;
        if (i2 == Integer.MIN_VALUE || (i = this.h0) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // p001o.sn3
    /* renamed from: b */
    public void mo5284b() {
        this.f6542e.invoke();
    }

    @Override // p001o.sn3
    /* renamed from: c */
    public void mo5285c() {
        this.f6541d.invoke();
        removeAllViewsInLayout();
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        sq8.m48649h(view, "child");
        sq8.m48649h(view2, "target");
        this.i0.m31122c(view, view2, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f6536M);
        int[] iArr = this.f6536M;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.f6536M[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final zl5 getDensity() {
        return this.f6545h;
    }

    public final View getInteropView() {
        return this.f6538a;
    }

    public final zh9 getLayoutNode() {
        return this.j0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f6538a.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final xca getLifecycleOwner() {
        return this.f6547s;
    }

    public final alb getModifier() {
        return this.f6543f;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.i0.m31120a();
    }

    public final xk7 getOnDensityChanged$ui_release() {
        return this.f6546q;
    }

    public final xk7 getOnModifierChanged$ui_release() {
        return this.f6544g;
    }

    public final xk7 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f6535L;
    }

    public final uk7 getRelease() {
        return this.f6542e;
    }

    public final uk7 getReset() {
        return this.f6541d;
    }

    public final h1f getSavedStateRegistryOwner() {
        return this.f6548x;
    }

    public final uk7 getUpdate() {
        return this.f6539b;
    }

    public final View getView() {
        return this.f6538a;
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        sq8.m48649h(view, "target");
        this.i0.m31124e(view, i);
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        sq8.m48649h(view, "target");
        sq8.m48649h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            v9c.m52474a(AbstractC1974a.m5292d(i), AbstractC1974a.m5292d(i2));
            AbstractC1974a.m5294f(i3);
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.j0.m0();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f6538a.isNestedScrollingEnabled();
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        sq8.m48649h(view, "target");
        sq8.m48649h(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            v9c.m52474a(AbstractC1974a.m5292d(i), AbstractC1974a.m5292d(i2));
            v9c.m52474a(AbstractC1974a.m5292d(i3), AbstractC1974a.m5292d(i4));
            AbstractC1974a.m5294f(i5);
            throw null;
        }
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
        sq8.m48649h(view, "target");
        if (isNestedScrollingEnabled()) {
            v9c.m52474a(AbstractC1974a.m5292d(i), AbstractC1974a.m5292d(i2));
            v9c.m52474a(AbstractC1974a.m5292d(i3), AbstractC1974a.m5292d(i4));
            AbstractC1974a.m5294f(i5);
            throw null;
        }
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        sq8.m48649h(view, "child");
        sq8.m48649h(view2, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6549y.m55363r();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        sq8.m48649h(view, "child");
        sq8.m48649h(view2, "target");
        super.onDescendantInvalidated(view, view2);
        this.j0.m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6549y.m55364s();
        this.f6549y.m55355j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6538a.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f6538a.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        this.f6538a.measure(i, i2);
        setMeasuredDimension(this.f6538a.getMeasuredWidth(), this.f6538a.getMeasuredHeight());
        this.f6537Q = i;
        this.h0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        sq8.m48649h(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        ksi.m36189a(AbstractC1974a.m5293e(f), AbstractC1974a.m5293e(f2));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        sq8.m48649h(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        ksi.m36189a(AbstractC1974a.m5293e(f), AbstractC1974a.m5293e(f2));
        throw null;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        xk7 xk7Var = this.f6535L;
        if (xk7Var != null) {
            xk7Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(zl5 zl5Var) {
        sq8.m48649h(zl5Var, "value");
        if (zl5Var != this.f6545h) {
            this.f6545h = zl5Var;
            xk7 xk7Var = this.f6546q;
            if (xk7Var != null) {
                xk7Var.invoke(zl5Var);
            }
        }
    }

    public final void setLifecycleOwner(xca xcaVar) {
        if (xcaVar != this.f6547s) {
            this.f6547s = xcaVar;
            rzi.m47366b(this, xcaVar);
        }
    }

    public final void setModifier(alb albVar) {
        sq8.m48649h(albVar, "value");
        if (albVar != this.f6543f) {
            this.f6543f = albVar;
            xk7 xk7Var = this.f6544g;
            if (xk7Var != null) {
                xk7Var.invoke(albVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(xk7 xk7Var) {
        this.f6546q = xk7Var;
    }

    public final void setOnModifierChanged$ui_release(xk7 xk7Var) {
        this.f6544g = xk7Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(xk7 xk7Var) {
        this.f6535L = xk7Var;
    }

    public final void setRelease(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "<set-?>");
        this.f6542e = uk7Var;
    }

    public final void setReset(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "<set-?>");
        this.f6541d = uk7Var;
    }

    public final void setSavedStateRegistryOwner(h1f h1fVar) {
        if (h1fVar != this.f6548x) {
            this.f6548x = h1fVar;
            tzi.m50817b(this, h1fVar);
        }
    }

    public final void setUpdate(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "value");
        this.f6539b = uk7Var;
        this.f6540c = true;
        this.f6534H.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
