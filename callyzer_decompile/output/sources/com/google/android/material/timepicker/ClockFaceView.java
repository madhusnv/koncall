package com.google.android.material.timepicker;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d6.C1615e;
import java.util.Arrays;
import og.y0;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
class ClockFaceView extends AbstractC1369f implements InterfaceC1367d {

    /* renamed from: B */
    public final int[] f6981B;

    /* renamed from: C */
    public final float[] f6982C;

    /* renamed from: D */
    public final int f6983D;

    /* renamed from: E */
    public final int f6984E;

    /* renamed from: F */
    public final int f6985F;

    /* renamed from: G */
    public final int f6986G;

    /* renamed from: H */
    public final String[] f6987H;

    /* renamed from: I */
    public float f6988I;

    /* renamed from: K */
    public final ColorStateList f6989K;

    /* renamed from: v */
    public final ClockHandView f6990v;

    /* renamed from: w */
    public final Rect f6991w;

    /* renamed from: x */
    public final RectF f6992x;

    /* renamed from: y */
    public final SparseArray f6993y;

    /* renamed from: z */
    public final C1366c f6994z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6991w = new Rect();
        this.f6992x = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f6993y = sparseArray;
        this.f6982C = new float[]{DefinitionKt.NO_Float_VALUE, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f455d, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM11057g = y0.m11057g(context, typedArrayObtainStyledAttributes, 1);
        this.f6989K = colorStateListM11057g;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f6990v = clockHandView;
        this.f6983D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListM11057g.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListM11057g.getDefaultColor());
        this.f6981B = new int[]{colorForState, colorForState, colorStateListM11057g.getDefaultColor()};
        clockHandView.f6995a.add(this);
        int defaultColor = s8.m11863a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM11057g2 = y0.m11057g(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListM11057g2 != null ? colorStateListM11057g2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1365b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f6994z = new C1366c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6987H = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i10 = 0; i10 < Math.max(this.f6987H.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f6987H.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f6987H[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                v0.m2528j(textView, this.f6994z);
                textView.setTextColor(this.f6989K);
            }
        }
        this.f6984E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f6985F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f6986G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    /* renamed from: f */
    public final void m4143f() {
        RadialGradient radialGradient;
        RectF rectF = this.f6990v.f6999e;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f6993y;
            if (i10 >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i10);
            if (textView != null) {
                Rect rect = this.f6991w;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.f6992x;
                rectF2.set(rect);
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.f6981B, this.f6982C, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i10++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1615e.m5279a(1, this.f6987H.length, 1).f8059a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        m4143f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f6986G / Math.max(Math.max(this.f6984E / displayMetrics.heightPixels, this.f6985F / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
