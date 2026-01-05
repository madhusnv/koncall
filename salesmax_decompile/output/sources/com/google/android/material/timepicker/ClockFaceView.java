package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p001o.cc;
import p001o.db;
import p001o.ebe;
import p001o.lk0;
import p001o.n8e;
import p001o.n9e;
import p001o.pae;
import p001o.r6e;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.yya;

/* loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.InterfaceC11161c {
    public final float[] A0;
    public final int B0;
    public final int C0;
    public final int D0;
    public final int E0;
    public String[] F0;
    public float G0;
    public final ColorStateList H0;
    public final ClockHandView t0;
    public final Rect u0;
    public final RectF v0;
    public final Rect w0;
    public final SparseArray x0;
    public final db y0;
    public final int[] z0;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class ViewTreeObserverOnPreDrawListenerC11157a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC11157a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo15469G(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.t0.m15489j()) - ClockFaceView.this.B0);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C11158b extends db {
        public C11158b() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            int iIntValue = ((Integer) view.getTag(n8e.material_value_index)).intValue();
            if (iIntValue > 0) {
                ccVar.X0((View) ClockFaceView.this.x0.get(iIntValue - 1));
            }
            ccVar.r0(cc.C12629f.m20832a(0, 1, iIntValue, 1, false, view.isSelected()));
            ccVar.p0(true);
            ccVar.m20778b(cc.C12624a.f17797i);
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.mo5939j(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.u0);
            float fCenterX = ClockFaceView.this.u0.centerX();
            float fCenterY = ClockFaceView.this.u0.centerY();
            ClockFaceView.this.t0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.t0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialClockStyle);
    }

    /* renamed from: S */
    public static float m15468S(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: G */
    public void mo15469G(int i) {
        if (i != m15521F()) {
            super.mo15469G(i);
            this.t0.m15494p(m15521F());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    /* renamed from: I */
    public void mo15470I() {
        super.mo15470I();
        for (int i = 0; i < this.x0.size(); i++) {
            ((TextView) this.x0.get(i)).setVisibility(0);
        }
    }

    /* renamed from: O */
    public final void m15471O() {
        RectF rectFM15485f = this.t0.m15485f();
        TextView textViewM15474R = m15474R(rectFM15485f);
        for (int i = 0; i < this.x0.size(); i++) {
            TextView textView = (TextView) this.x0.get(i);
            if (textView != null) {
                textView.setSelected(textView == textViewM15474R);
                textView.getPaint().setShader(m15473Q(rectFM15485f, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: P */
    public int m15472P() {
        return this.t0.m15484e();
    }

    /* renamed from: Q */
    public final RadialGradient m15473Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.u0);
        this.v0.set(this.u0);
        textView.getLineBounds(0, this.w0);
        RectF rectF2 = this.v0;
        Rect rect = this.w0;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.v0)) {
            return new RadialGradient(rectF.centerX() - this.v0.left, rectF.centerY() - this.v0.top, rectF.width() * 0.5f, this.z0, this.A0, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* renamed from: R */
    public final TextView m15474R(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.x0.size(); i++) {
            TextView textView2 = (TextView) this.x0.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.u0);
                this.v0.set(this.u0);
                this.v0.union(rectF);
                float fWidth = this.v0.width() * this.v0.height();
                if (fWidth < f) {
                    textView = textView2;
                    f = fWidth;
                }
            }
        }
        return textView;
    }

    /* renamed from: T */
    public void m15475T(int i) {
        this.t0.m15495q(i);
    }

    /* renamed from: U */
    public void m15476U(String[] strArr, int i) {
        this.F0 = strArr;
        m15477V(i);
    }

    /* renamed from: V */
    public final void m15477V(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.x0.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.F0.length, size); i2++) {
            TextView textView = (TextView) this.x0.get(i2);
            if (i2 >= this.F0.length) {
                removeView(textView);
                this.x0.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(n9e.material_clockface_textview, (ViewGroup) this, false);
                    this.x0.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.F0[i2]);
                textView.setTag(n8e.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(n8e.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                wvi.m0(textView, this.y0);
                textView.setTextColor(this.H0);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.F0[i2]));
                }
            }
        }
        this.t0.m15499u(z);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC11161c
    /* renamed from: d */
    public void mo15478d(float f, boolean z) {
        if (Math.abs(this.G0 - f) > 0.001f) {
            this.G0 = f;
            m15471O();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(1, this.F0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m15471O();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM15468S = (int) (this.E0 / m15468S(this.C0 / displayMetrics.heightPixels, this.D0 / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM15468S, 1073741824);
        setMeasuredDimension(iM15468S, iM15468S);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u0 = new Rect();
        this.v0 = new RectF();
        this.w0 = new Rect();
        this.x0 = new SparseArray();
        this.A0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ClockFaceView, i, pae.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListM58494a = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.ClockFaceView_clockNumberTextColor);
        this.H0 = colorStateListM58494a;
        LayoutInflater.from(context).inflate(n9e.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(n8e.material_clock_hand);
        this.t0 = clockHandView;
        this.B0 = resources.getDimensionPixelSize(x6e.material_clock_hand_padding);
        int colorForState = colorStateListM58494a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM58494a.getDefaultColor());
        this.z0 = new int[]{colorForState, colorForState, colorStateListM58494a.getDefaultColor()};
        clockHandView.m15481b(this);
        int defaultColor = lk0.m37352a(context, r6e.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListM58494a2 = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListM58494a2 != null ? colorStateListM58494a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC11157a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.y0 = new C11158b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m15476U(strArr, 0);
        this.C0 = resources.getDimensionPixelSize(x6e.material_time_picker_minimum_screen_height);
        this.D0 = resources.getDimensionPixelSize(x6e.material_time_picker_minimum_screen_width);
        this.E0 = resources.getDimensionPixelSize(x6e.material_clock_size);
    }
}
