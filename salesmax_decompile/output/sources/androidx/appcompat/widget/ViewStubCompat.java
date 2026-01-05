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
import p001o.bbe;

/* loaded from: classes2.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    public int f6010a;

    /* renamed from: b */
    public int f6011b;

    /* renamed from: c */
    public WeakReference f6012c;

    /* renamed from: d */
    public LayoutInflater f6013d;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC1883a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m4444a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f6010a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f6013d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f6010a, viewGroup, false);
        int i = this.f6011b;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f6012c = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f6011b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f6013d;
    }

    public int getLayoutResource() {
        return this.f6010a;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f6011b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f6013d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f6010a = i;
    }

    public void setOnInflateListener(InterfaceC1883a interfaceC1883a) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f6012c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m4444a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6010a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ViewStubCompat, i, 0);
        this.f6011b = typedArrayObtainStyledAttributes.getResourceId(bbe.ViewStubCompat_android_inflatedId, -1);
        this.f6010a = typedArrayObtainStyledAttributes.getResourceId(bbe.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(bbe.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
