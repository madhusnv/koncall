package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p001o.bkh;
import p001o.c64;
import p001o.ebe;
import p001o.gza;
import p001o.pae;
import p001o.x5e;
import p001o.x6e;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public class MaterialDivider extends View {

    /* renamed from: f */
    public static final int f12540f = pae.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a */
    public final zya f12541a;

    /* renamed from: b */
    public int f12542b;

    /* renamed from: c */
    public int f12543c;

    /* renamed from: d */
    public int f12544d;

    /* renamed from: e */
    public int f12545e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f12543c;
    }

    public int getDividerInsetEnd() {
        return this.f12545e;
    }

    public int getDividerInsetStart() {
        return this.f12544d;
    }

    public int getDividerThickness() {
        return this.f12542b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.f12545e : this.f12544d;
        if (z) {
            width = getWidth();
            i = this.f12544d;
        } else {
            width = getWidth();
            i = this.f12545e;
        }
        this.f12541a.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.f12541a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f12542b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f12543c != i) {
            this.f12543c = i;
            this.f12541a.g0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(c64.getColor(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.f12545e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f12544d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f12542b != i) {
            this.f12542b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12540f;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.f12541a = new zya();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialDivider, i, i2, new int[0]);
        this.f12542b = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(x6e.material_divider_thickness));
        this.f12544d = typedArrayM19305i.getDimensionPixelOffset(ebe.MaterialDivider_dividerInsetStart, 0);
        this.f12545e = typedArrayM19305i.getDimensionPixelOffset(ebe.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(yya.m58494a(context2, typedArrayM19305i, ebe.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayM19305i.recycle();
    }
}
