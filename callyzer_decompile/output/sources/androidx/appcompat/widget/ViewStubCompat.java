package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p009j.AbstractC3500a;
import p013o.k2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f1812a;

    /* renamed from: b */
    public int f1813b;

    /* renamed from: c */
    public WeakReference f1814c;

    /* renamed from: d */
    public LayoutInflater f1815d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1812a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18365v, 0, 0);
        this.f1813b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f1812a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f1813b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1815d;
    }

    public int getLayoutResource() {
        return this.f1812a;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1813b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1815d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1812a = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference weakReference = this.f1814c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f1812a == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflaterFrom = this.f1815d;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
            }
            View viewInflate = layoutInflaterFrom.inflate(this.f1812a, viewGroup, false);
            int i11 = this.f1813b;
            if (i11 != -1) {
                viewInflate.setId(i11);
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(viewInflate, iIndexOfChild);
            }
            this.f1814c = new WeakReference(viewInflate);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(k2 k2Var) {
    }
}
