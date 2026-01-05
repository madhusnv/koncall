package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p001o.age;
import p001o.fbe;
import p001o.fy5;
import p001o.gjh;
import p001o.jri;
import p001o.r6f;
import p001o.vaf;
import p001o.y5e;
import p001o.zg5;

/* loaded from: classes5.dex */
public class FastScroller extends LinearLayout {

    /* renamed from: H */
    public r6f f11823H;

    /* renamed from: L */
    public vaf f11824L;

    /* renamed from: a */
    public final age f11825a;

    /* renamed from: b */
    public RecyclerView f11826b;

    /* renamed from: c */
    public View f11827c;

    /* renamed from: d */
    public View f11828d;

    /* renamed from: e */
    public TextView f11829e;

    /* renamed from: f */
    public int f11830f;

    /* renamed from: g */
    public int f11831g;

    /* renamed from: h */
    public int f11832h;

    /* renamed from: q */
    public int f11833q;

    /* renamed from: s */
    public int f11834s;

    /* renamed from: x */
    public int f11835x;

    /* renamed from: y */
    public boolean f11836y;

    /* renamed from: com.futuremind.recyclerviewfastscroll.FastScroller$a */
    public class ViewGroupOnHierarchyChangeListenerC10885a implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC10885a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            FastScroller.this.m13624j();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            FastScroller.this.m13624j();
        }
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.FastScroller$b */
    public class ViewOnTouchListenerC10886b implements View.OnTouchListener {
        public ViewOnTouchListenerC10886b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            FastScroller.this.requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                FastScroller.this.f11836y = false;
                if (FastScroller.this.f11824L != null) {
                    FastScroller.this.f11823H.m46266g();
                }
                return true;
            }
            if (FastScroller.this.f11824L != null && motionEvent.getAction() == 0) {
                FastScroller.this.f11823H.m46265f();
            }
            FastScroller.this.f11836y = true;
            float fM13622h = FastScroller.this.m13622h(motionEvent);
            FastScroller.this.setScrollerPosition(fM13622h);
            FastScroller.this.setRecyclerViewPosition(fM13622h);
            return true;
        }
    }

    public FastScroller(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        TextView textView;
        RecyclerView recyclerView = this.f11826b;
        if (recyclerView == null) {
            return;
        }
        int itemCount = recyclerView.getAdapter().getItemCount();
        int iM34413a = (int) jri.m34413a(0.0f, itemCount - 1, (int) (f * itemCount));
        this.f11826b.s1(iM34413a);
        vaf vafVar = this.f11824L;
        if (vafVar == null || (textView = this.f11829e) == null) {
            return;
        }
        textView.setText(vafVar.mo47980b(iM34413a));
    }

    /* renamed from: g */
    public final void m13621g() {
        int i = this.f11832h;
        if (i != -1) {
            m13627m(this.f11829e, i);
        }
        int i2 = this.f11831g;
        if (i2 != -1) {
            m13627m(this.f11828d, i2);
        }
        int i3 = this.f11833q;
        if (i3 != -1) {
            gjh.m28914m(this.f11829e, i3);
        }
    }

    public r6f getViewProvider() {
        return this.f11823H;
    }

    /* renamed from: h */
    public final float m13622h(MotionEvent motionEvent) {
        float rawX;
        int width;
        int width2;
        if (m13626l()) {
            rawX = motionEvent.getRawY() - jri.m34415c(this.f11828d);
            width = getHeight();
            width2 = this.f11828d.getHeight();
        } else {
            rawX = motionEvent.getRawX() - jri.m34414b(this.f11828d);
            width = getWidth();
            width2 = this.f11828d.getWidth();
        }
        return rawX / (width - width2);
    }

    /* renamed from: i */
    public final void m13623i() {
        this.f11828d.setOnTouchListener(new ViewOnTouchListenerC10886b());
    }

    /* renamed from: j */
    public final void m13624j() {
        if (this.f11826b.getAdapter() == null || this.f11826b.getAdapter().getItemCount() == 0 || this.f11826b.getChildAt(0) == null || m13625k() || this.f11835x != 0) {
            super.setVisibility(4);
        } else {
            super.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final boolean m13625k() {
        return m13626l() ? this.f11826b.getChildAt(0).getHeight() * this.f11826b.getAdapter().getItemCount() <= this.f11826b.getHeight() : this.f11826b.getChildAt(0).getWidth() * this.f11826b.getAdapter().getItemCount() <= this.f11826b.getWidth();
    }

    /* renamed from: l */
    public boolean m13626l() {
        return this.f11834s == 1;
    }

    /* renamed from: m */
    public final void m13627m(View view, int i) {
        Drawable drawableM27744r = fy5.m27744r(view.getBackground());
        if (drawableM27744r == null) {
            return;
        }
        fy5.m27740n(drawableM27744r.mutate(), i);
        jri.m34416d(view, drawableM27744r);
    }

    /* renamed from: n */
    public boolean m13628n() {
        return (this.f11828d == null || this.f11836y || this.f11826b.getChildCount() <= 0) ? false : true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m13623i();
        this.f11830f = this.f11823H.mo46261b();
        m13621g();
        if (isInEditMode()) {
            return;
        }
        this.f11825a.m17035d(this.f11826b);
    }

    public void setBubbleColor(int i) {
        this.f11832h = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.f11833q = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f11831g = i;
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.f11834s = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f11826b = recyclerView;
        if (recyclerView.getAdapter() instanceof vaf) {
            this.f11824L = (vaf) recyclerView.getAdapter();
        }
        recyclerView.m9090l(this.f11825a);
        m13624j();
        recyclerView.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC10885a());
    }

    public void setScrollerPosition(float f) {
        if (m13626l()) {
            this.f11827c.setY(jri.m34413a(0.0f, getHeight() - this.f11827c.getHeight(), ((getHeight() - this.f11828d.getHeight()) * f) + this.f11830f));
            this.f11828d.setY(jri.m34413a(0.0f, getHeight() - this.f11828d.getHeight(), f * (getHeight() - this.f11828d.getHeight())));
        } else {
            this.f11827c.setX(jri.m34413a(0.0f, getWidth() - this.f11827c.getWidth(), ((getWidth() - this.f11828d.getWidth()) * f) + this.f11830f));
            this.f11828d.setX(jri.m34413a(0.0f, getWidth() - this.f11828d.getWidth(), f * (getWidth() - this.f11828d.getWidth())));
        }
    }

    public void setViewProvider(r6f r6fVar) {
        removeAllViews();
        this.f11823H = r6fVar;
        r6fVar.m46274o(this);
        this.f11827c = r6fVar.mo46271l(this);
        this.f11828d = r6fVar.mo46273n(this);
        this.f11829e = r6fVar.mo46270k();
        addView(this.f11827c);
        addView(this.f11828d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.f11835x = i;
        m13624j();
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11825a = new age(this);
        setClipChildren(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fbe.fastscroll__fastScroller, y5e.fastscroll__style, 0);
        try {
            this.f11832h = typedArrayObtainStyledAttributes.getColor(fbe.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.f11831g = typedArrayObtainStyledAttributes.getColor(fbe.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.f11833q = typedArrayObtainStyledAttributes.getResourceId(fbe.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.f11835x = getVisibility();
            setViewProvider(new zg5());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
