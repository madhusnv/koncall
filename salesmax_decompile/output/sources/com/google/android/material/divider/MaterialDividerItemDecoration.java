package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.pae;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.yya;

/* loaded from: classes3.dex */
public class MaterialDividerItemDecoration extends RecyclerView.AbstractC2378o {

    /* renamed from: i */
    public static final int f12546i = pae.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public Drawable f12547a;

    /* renamed from: b */
    public int f12548b;

    /* renamed from: c */
    public int f12549c;

    /* renamed from: d */
    public int f12550d;

    /* renamed from: e */
    public int f12551e;

    /* renamed from: f */
    public int f12552f;

    /* renamed from: g */
    public boolean f12553g;

    /* renamed from: h */
    public final Rect f12554h;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, x5e.materialDividerStyle, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: g */
    public void mo9226g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        rect.set(0, 0, 0, 0);
        if (m14583q(recyclerView, view)) {
            if (this.f12550d == 1) {
                rect.bottom = this.f12548b;
            } else if (xzi.m57079o(recyclerView)) {
                rect.left = this.f12548b;
            } else {
                rect.right = this.f12548b;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: i */
    public void mo9228i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f12550d == 1) {
            m14579m(canvas, recyclerView);
        } else {
            m14578l(canvas, recyclerView);
        }
    }

    /* renamed from: l */
    public final void m14578l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i3 = paddingTop + this.f12551e;
        int i4 = height - this.f12552f;
        boolean zM57079o = xzi.m57079o(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            if (m14583q(recyclerView, childAt)) {
                recyclerView.getLayoutManager().f0(childAt, this.f12554h);
                int iRound = Math.round(childAt.getTranslationX());
                if (zM57079o) {
                    i2 = this.f12554h.left + iRound;
                    i = this.f12548b + i2;
                } else {
                    i = iRound + this.f12554h.right;
                    i2 = i - this.f12548b;
                }
                this.f12547a.setBounds(i2, i3, i, i4);
                this.f12547a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f12547a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: m */
    public final void m14579m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zM57079o = xzi.m57079o(recyclerView);
        int i = paddingLeft + (zM57079o ? this.f12552f : this.f12551e);
        int i2 = width - (zM57079o ? this.f12551e : this.f12552f);
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (m14583q(recyclerView, childAt)) {
                recyclerView.getLayoutManager().f0(childAt, this.f12554h);
                int iRound = this.f12554h.bottom + Math.round(childAt.getTranslationY());
                this.f12547a.setBounds(i, iRound - this.f12548b, i2, iRound);
                this.f12547a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f12547a.draw(canvas);
            }
        }
        canvas.restore();
    }

    /* renamed from: n */
    public void m14580n(int i) {
        this.f12549c = i;
        Drawable drawableM27744r = fy5.m27744r(this.f12547a);
        this.f12547a = drawableM27744r;
        drawableM27744r.setTint(i);
    }

    /* renamed from: o */
    public void m14581o(int i) {
        if (i == 0 || i == 1) {
            this.f12550d = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: p */
    public boolean m14582p(int i, RecyclerView.AbstractC2371h abstractC2371h) {
        return true;
    }

    /* renamed from: q */
    public final boolean m14583q(RecyclerView recyclerView, View view) {
        int iI0 = recyclerView.i0(view);
        RecyclerView.AbstractC2371h adapter = recyclerView.getAdapter();
        boolean z = adapter != null && iI0 == adapter.getItemCount() - 1;
        if (iI0 != -1) {
            return (!z || this.f12553g) && m14582p(iI0, adapter);
        }
        return false;
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f12554h = new Rect();
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.MaterialDivider, i, f12546i, new int[0]);
        this.f12549c = yya.m58494a(context, typedArrayM19305i, ebe.MaterialDivider_dividerColor).getDefaultColor();
        this.f12548b = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(x6e.material_divider_thickness));
        this.f12551e = typedArrayM19305i.getDimensionPixelOffset(ebe.MaterialDivider_dividerInsetStart, 0);
        this.f12552f = typedArrayM19305i.getDimensionPixelOffset(ebe.MaterialDivider_dividerInsetEnd, 0);
        this.f12553g = typedArrayM19305i.getBoolean(ebe.MaterialDivider_lastItemDecorated, true);
        typedArrayM19305i.recycle();
        this.f12547a = new ShapeDrawable();
        m14580n(this.f12549c);
        m14581o(i2);
    }
}
