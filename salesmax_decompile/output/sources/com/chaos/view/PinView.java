package com.chaos.view;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import p001o.if5;
import p001o.j7e;
import p001o.ppe;
import p001o.w5e;
import p001o.wvi;
import p001o.zae;

/* loaded from: classes5.dex */
public class PinView extends AppCompatEditText {
    public static final InputFilter[] A0 = new InputFilter[0];
    public static final int[] B0 = {R.attr.state_selected};

    /* renamed from: H */
    public final Paint f11224H;

    /* renamed from: L */
    public final TextPaint f11225L;

    /* renamed from: M */
    public ColorStateList f11226M;

    /* renamed from: Q */
    public int f11227Q;

    /* renamed from: g */
    public int f11228g;

    /* renamed from: h */
    public int f11229h;
    public int h0;
    public final Rect i0;
    public final RectF j0;
    public final RectF k0;
    public final Path l0;
    public final PointF m0;
    public ValueAnimator n0;
    public boolean o0;
    public boolean p0;

    /* renamed from: q */
    public int f11230q;
    public RunnableC10738c q0;
    public boolean r0;

    /* renamed from: s */
    public int f11231s;
    public boolean s0;
    public float t0;
    public int u0;
    public int v0;
    public int w0;

    /* renamed from: x */
    public int f11232x;
    public Drawable x0;

    /* renamed from: y */
    public int f11233y;
    public boolean y0;
    public String z0;

    /* renamed from: com.chaos.view.PinView$a */
    public class C10736a implements ValueAnimator.AnimatorUpdateListener {
        public C10736a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PinView.this.f11225L.setTextSize(PinView.this.getTextSize() * fFloatValue);
            PinView.this.f11225L.setAlpha((int) (255.0f * fFloatValue));
            PinView.this.postInvalidate();
        }
    }

    /* renamed from: com.chaos.view.PinView$b */
    public class C10737b extends ActionModeCallbackC10739d {
        public C10737b() {
            super(null);
        }

        @Override // com.chaos.view.PinView.ActionModeCallbackC10739d, android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            menu.removeItem(R.id.autofill);
            return true;
        }
    }

    /* renamed from: com.chaos.view.PinView$c */
    public class RunnableC10738c implements Runnable {

        /* renamed from: a */
        public boolean f11236a;

        public RunnableC10738c() {
        }

        /* renamed from: b */
        public final void m12747b() {
            if (this.f11236a) {
                return;
            }
            PinView.this.removeCallbacks(this);
            this.f11236a = true;
        }

        /* renamed from: c */
        public void m12748c() {
            this.f11236a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11236a) {
                return;
            }
            PinView.this.removeCallbacks(this);
            if (PinView.this.m12719C()) {
                PinView.this.m12743w(!r0.s0);
                PinView.this.postDelayed(this, 500L);
            }
        }

        public /* synthetic */ RunnableC10738c(PinView pinView, C10736a c10736a) {
            this();
        }
    }

    /* renamed from: com.chaos.view.PinView$d */
    public static class ActionModeCallbackC10739d implements ActionMode.Callback {
        public ActionModeCallbackC10739d() {
        }

        public /* synthetic */ ActionModeCallbackC10739d(C10736a c10736a) {
            this();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public PinView(Context context) {
        this(context, null);
    }

    private void setMaxLength(int i) {
        if (i >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            setFilters(A0);
        }
    }

    /* renamed from: x */
    public static boolean m12716x(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: A */
    public final void m12717A() {
        RunnableC10738c runnableC10738c = this.q0;
        if (runnableC10738c != null) {
            runnableC10738c.m12748c();
            m12744y();
        }
    }

    /* renamed from: B */
    public final void m12718B() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.n0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(150L);
        this.n0.setInterpolator(new DecelerateInterpolator());
        this.n0.addUpdateListener(new C10736a());
    }

    /* renamed from: C */
    public final boolean m12719C() {
        return isCursorVisible() && isFocused();
    }

    /* renamed from: D */
    public final void m12720D() {
        RunnableC10738c runnableC10738c = this.q0;
        if (runnableC10738c != null) {
            runnableC10738c.m12747b();
            m12743w(false);
        }
    }

    /* renamed from: E */
    public final void m12721E() {
        RectF rectF = this.j0;
        float fAbs = rectF.left + (Math.abs(rectF.width()) / 2.0f);
        RectF rectF2 = this.j0;
        this.m0.set(fAbs, rectF2.top + (Math.abs(rectF2.height()) / 2.0f));
    }

    /* renamed from: F */
    public final void m12722F() {
        ColorStateList colorStateList = this.f11226M;
        boolean z = false;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : getCurrentTextColor();
        if (colorForState != this.f11227Q) {
            this.f11227Q = colorForState;
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: G */
    public final void m12723G() {
        float fM12731k = m12731k(2.0f) * 2;
        this.t0 = ((float) this.f11231s) - getTextSize() > fM12731k ? getTextSize() + fM12731k : getTextSize();
    }

    /* renamed from: H */
    public final void m12724H(int i) {
        float f = this.h0 / 2.0f;
        int scrollX = getScrollX() + wvi.m55092E(this);
        int i2 = this.f11233y;
        int i3 = this.f11230q;
        float f2 = scrollX + ((i2 + i3) * i) + f;
        if (i2 == 0 && i > 0) {
            f2 -= this.h0 * i;
        }
        float scrollY = getScrollY() + getPaddingTop() + f;
        this.j0.set(f2, scrollY, (i3 + f2) - this.h0, (this.f11231s + scrollY) - this.h0);
    }

    /* renamed from: I */
    public final void m12725I() {
        this.f11224H.setColor(this.f11227Q);
        this.f11224H.setStyle(Paint.Style.STROKE);
        this.f11224H.setStrokeWidth(this.h0);
        getPaint().setColor(getCurrentTextColor());
    }

    /* renamed from: J */
    public final void m12726J(int i) {
        boolean z;
        boolean z2;
        if (this.f11233y != 0) {
            z2 = true;
            z = true;
        } else {
            boolean z3 = i == 0 && i != this.f11229h - 1;
            z = i == this.f11229h - 1 && i != 0;
            z2 = z3;
        }
        RectF rectF = this.j0;
        int i2 = this.f11232x;
        m12727K(rectF, i2, i2, z2, z);
    }

    /* renamed from: K */
    public final void m12727K(RectF rectF, float f, float f2, boolean z, boolean z2) {
        m12728L(rectF, f, f2, z, z2, z2, z);
    }

    /* renamed from: L */
    public final void m12728L(RectF rectF, float f, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.l0.reset();
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = (rectF.right - f3) - (f * 2.0f);
        float f6 = (rectF.bottom - f4) - (2.0f * f2);
        this.l0.moveTo(f3, f4 + f2);
        if (z) {
            float f7 = -f2;
            this.l0.rQuadTo(0.0f, f7, f, f7);
        } else {
            this.l0.rLineTo(0.0f, -f2);
            this.l0.rLineTo(f, 0.0f);
        }
        this.l0.rLineTo(f5, 0.0f);
        if (z2) {
            this.l0.rQuadTo(f, 0.0f, f, f2);
        } else {
            this.l0.rLineTo(f, 0.0f);
            this.l0.rLineTo(0.0f, f2);
        }
        this.l0.rLineTo(0.0f, f6);
        if (z3) {
            this.l0.rQuadTo(0.0f, f2, -f, f2);
        } else {
            this.l0.rLineTo(0.0f, f2);
            this.l0.rLineTo(-f, 0.0f);
        }
        this.l0.rLineTo(-f5, 0.0f);
        if (z4) {
            float f8 = -f;
            this.l0.rQuadTo(f8, 0.0f, f8, -f2);
        } else {
            this.l0.rLineTo(-f, 0.0f);
            this.l0.rLineTo(0.0f, -f2);
        }
        this.l0.rLineTo(0.0f, -f6);
        this.l0.close();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f11226M;
        if (colorStateList == null || colorStateList.isStateful()) {
            m12722F();
        }
    }

    public int getCurrentLineColor() {
        return this.f11227Q;
    }

    public int getCursorColor() {
        return this.v0;
    }

    public int getCursorWidth() {
        return this.u0;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return if5.m32048a();
    }

    public int getItemCount() {
        return this.f11229h;
    }

    public int getItemHeight() {
        return this.f11231s;
    }

    public int getItemRadius() {
        return this.f11232x;
    }

    public int getItemSpacing() {
        return this.f11233y;
    }

    public int getItemWidth() {
        return this.f11230q;
    }

    public ColorStateList getLineColors() {
        return this.f11226M;
    }

    public int getLineWidth() {
        return this.h0;
    }

    /* renamed from: i */
    public final void m12729i() {
        int i = this.f11228g;
        if (i == 1) {
            if (this.f11232x > this.h0 / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i == 0) {
            if (this.f11232x > this.f11230q / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.r0;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return false;
    }

    /* renamed from: j */
    public final void m12730j() {
        setCustomSelectionActionModeCallback(new ActionModeCallbackC10739d(null));
        if (Build.VERSION.SDK_INT >= 26) {
            setCustomInsertionActionModeCallback(new C10737b());
        }
    }

    /* renamed from: k */
    public final int m12731k(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: l */
    public final void m12732l(Canvas canvas, int i) {
        Paint paintM12742v = m12742v(i);
        PointF pointF = this.m0;
        canvas.drawCircle(pointF.x, pointF.y, paintM12742v.getTextSize() / 2.0f, paintM12742v);
    }

    /* renamed from: m */
    public final void m12733m(Canvas canvas) {
        if (this.s0) {
            PointF pointF = this.m0;
            float f = pointF.x;
            float f2 = pointF.y - (this.t0 / 2.0f);
            int color = this.f11224H.getColor();
            float strokeWidth = this.f11224H.getStrokeWidth();
            this.f11224H.setColor(this.v0);
            this.f11224H.setStrokeWidth(this.u0);
            canvas.drawLine(f, f2, f, f2 + this.t0, this.f11224H);
            this.f11224H.setColor(color);
            this.f11224H.setStrokeWidth(strokeWidth);
        }
    }

    /* renamed from: n */
    public final void m12734n(Canvas canvas, int i) {
        Paint paintM12742v = m12742v(i);
        paintM12742v.setColor(getCurrentHintTextColor());
        m12740t(canvas, paintM12742v, getHint(), i);
    }

    /* renamed from: o */
    public final void m12735o(Canvas canvas, boolean z) {
        if (this.x0 == null) {
            return;
        }
        float f = this.h0 / 2.0f;
        this.x0.setBounds(Math.round(this.j0.left - f), Math.round(this.j0.top - f), Math.round(this.j0.right + f), Math.round(this.j0.bottom + f));
        this.x0.setState(z ? B0 : getDrawableState());
        this.x0.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12717A();
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12720D();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m12725I();
        m12738r(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            m12745z();
            m12744y();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f11231s;
        if (mode != 1073741824) {
            int i4 = this.f11229h;
            size = wvi.m55092E(this) + ((i4 - 1) * this.f11233y) + (i4 * this.f11230q) + wvi.m55091D(this);
            if (this.f11233y == 0) {
                size -= (this.f11229h - 1) * this.h0;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + i3 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (i == 0) {
            m12720D();
        } else {
            if (i != 1) {
                return;
            }
            m12717A();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (i2 != getText().length()) {
            m12745z();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ValueAnimator valueAnimator;
        if (i != charSequence.length()) {
            m12745z();
        }
        m12744y();
        if (this.o0) {
            if ((i3 - i2 > 0) && (valueAnimator = this.n0) != null) {
                valueAnimator.end();
                this.n0.start();
            }
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod == null) {
            this.z0 = getText().toString();
        } else {
            this.z0 = transformationMethod.getTransformation(getText(), this).toString();
        }
    }

    /* renamed from: p */
    public final void m12736p(Canvas canvas, int i) {
        if (!this.y0 || i >= getText().length()) {
            canvas.drawPath(this.l0, this.f11224H);
        }
    }

    /* renamed from: q */
    public final void m12737q(Canvas canvas, int i) {
        boolean z;
        boolean z2;
        int i2;
        if (!this.y0 || i >= getText().length()) {
            if (this.f11233y == 0 && (i2 = this.f11229h) > 1) {
                if (i == 0) {
                    z = true;
                    z2 = false;
                } else if (i == i2 - 1) {
                    z2 = true;
                    z = false;
                } else {
                    z = false;
                }
                this.f11224H.setStyle(Paint.Style.FILL);
                this.f11224H.setStrokeWidth(this.h0 / 10.0f);
                float f = this.h0 / 2.0f;
                RectF rectF = this.k0;
                RectF rectF2 = this.j0;
                float f2 = rectF2.left - f;
                float f3 = rectF2.bottom;
                rectF.set(f2, f3 - f, rectF2.right + f, f3 + f);
                RectF rectF3 = this.k0;
                int i3 = this.f11232x;
                m12727K(rectF3, i3, i3, z, z2);
                canvas.drawPath(this.l0, this.f11224H);
            }
            z = true;
            z2 = z;
            this.f11224H.setStyle(Paint.Style.FILL);
            this.f11224H.setStrokeWidth(this.h0 / 10.0f);
            float f4 = this.h0 / 2.0f;
            RectF rectF4 = this.k0;
            RectF rectF22 = this.j0;
            float f22 = rectF22.left - f4;
            float f32 = rectF22.bottom;
            rectF4.set(f22, f32 - f4, rectF22.right + f4, f32 + f4);
            RectF rectF32 = this.k0;
            int i32 = this.f11232x;
            m12727K(rectF32, i32, i32, z, z2);
            canvas.drawPath(this.l0, this.f11224H);
        }
    }

    /* renamed from: r */
    public final void m12738r(Canvas canvas) {
        int length = getText().length();
        int i = 0;
        while (i < this.f11229h) {
            boolean z = isFocused() && length == i;
            this.f11224H.setColor(z ? m12741u(B0) : this.f11227Q);
            m12724H(i);
            m12721E();
            canvas.save();
            if (this.f11228g == 0) {
                m12726J(i);
                canvas.clipPath(this.l0);
            }
            m12735o(canvas, z);
            canvas.restore();
            if (z) {
                m12733m(canvas);
            }
            int i2 = this.f11228g;
            if (i2 == 0) {
                m12736p(canvas, i);
            } else if (i2 == 1) {
                m12737q(canvas, i);
            }
            if (this.z0.length() > i) {
                if (getTransformationMethod() == null && this.p0) {
                    m12732l(canvas, i);
                } else {
                    m12739s(canvas, i);
                }
            } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.f11229h) {
                m12734n(canvas, i);
            }
            i++;
        }
        if (isFocused() && getText().length() != this.f11229h && this.f11228g == 0) {
            int length2 = getText().length();
            m12724H(length2);
            m12721E();
            m12726J(length2);
            this.f11224H.setColor(m12741u(B0));
            m12736p(canvas, length2);
        }
    }

    /* renamed from: s */
    public final void m12739s(Canvas canvas, int i) {
        m12740t(canvas, m12742v(i), this.z0, i);
    }

    public void setAnimationEnable(boolean z) {
        this.o0 = z;
    }

    public void setCursorColor(int i) {
        this.v0 = i;
        if (isCursorVisible()) {
            m12743w(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            m12743w(z);
            m12744y();
        }
    }

    public void setCursorWidth(int i) {
        this.u0 = i;
        if (isCursorVisible()) {
            m12743w(true);
        }
    }

    public void setHideLineWhenFilled(boolean z) {
        this.y0 = z;
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        super.setInputType(i);
        this.p0 = m12716x(getInputType());
    }

    public void setItemBackground(Drawable drawable) {
        this.w0 = 0;
        this.x0 = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(int i) {
        Drawable drawable = this.x0;
        if (!(drawable instanceof ColorDrawable)) {
            setItemBackground(new ColorDrawable(i));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i);
            this.w0 = 0;
        }
    }

    public void setItemBackgroundResources(int i) {
        if (i == 0 || this.w0 == i) {
            Drawable drawableM44034e = ppe.m44034e(getResources(), i, getContext().getTheme());
            this.x0 = drawableM44034e;
            setItemBackground(drawableM44034e);
            this.w0 = i;
        }
    }

    public void setItemCount(int i) {
        this.f11229h = i;
        setMaxLength(i);
        requestLayout();
    }

    public void setItemHeight(int i) {
        this.f11231s = i;
        m12723G();
        requestLayout();
    }

    public void setItemRadius(int i) {
        this.f11232x = i;
        m12729i();
        requestLayout();
    }

    public void setItemSpacing(int i) {
        this.f11233y = i;
        requestLayout();
    }

    public void setItemWidth(int i) {
        this.f11230q = i;
        m12729i();
        requestLayout();
    }

    public void setLineColor(int i) {
        this.f11226M = ColorStateList.valueOf(i);
        m12722F();
    }

    public void setLineWidth(int i) {
        this.h0 = i;
        m12729i();
        requestLayout();
    }

    public void setPasswordHidden(boolean z) {
        this.p0 = z;
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        m12723G();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
    }

    /* renamed from: t */
    public final void m12740t(Canvas canvas, Paint paint, CharSequence charSequence, int i) {
        int i2 = i + 1;
        paint.getTextBounds(charSequence.toString(), i, i2, this.i0);
        PointF pointF = this.m0;
        float f = pointF.x;
        float f2 = pointF.y;
        float fAbs = f - (Math.abs(this.i0.width()) / 2.0f);
        Rect rect = this.i0;
        canvas.drawText(charSequence, i, i2, fAbs - rect.left, (f2 + (Math.abs(rect.height()) / 2.0f)) - this.i0.bottom, paint);
    }

    /* renamed from: u */
    public final int m12741u(int... iArr) {
        ColorStateList colorStateList = this.f11226M;
        return colorStateList != null ? colorStateList.getColorForState(iArr, this.f11227Q) : this.f11227Q;
    }

    /* renamed from: v */
    public final Paint m12742v(int i) {
        if (!this.o0 || i != getText().length() - 1) {
            return getPaint();
        }
        this.f11225L.setColor(getPaint().getColor());
        return this.f11225L;
    }

    /* renamed from: w */
    public final void m12743w(boolean z) {
        if (this.s0 != z) {
            this.s0 = z;
            invalidate();
        }
    }

    /* renamed from: y */
    public final void m12744y() {
        if (!m12719C()) {
            RunnableC10738c runnableC10738c = this.q0;
            if (runnableC10738c != null) {
                removeCallbacks(runnableC10738c);
                return;
            }
            return;
        }
        if (this.q0 == null) {
            this.q0 = new RunnableC10738c(this, null);
        }
        removeCallbacks(this.q0);
        this.s0 = false;
        postDelayed(this.q0, 500L);
    }

    /* renamed from: z */
    public final void m12745z() {
        setSelection(getText().length());
    }

    public PinView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w5e.pinViewStyle);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.f11225L;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    public PinView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextPaint textPaint = new TextPaint();
        this.f11225L = textPaint;
        this.f11227Q = -16777216;
        this.i0 = new Rect();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new Path();
        this.m0 = new PointF();
        this.o0 = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.f11224H = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, zae.PinView, i, 0);
        this.f11228g = typedArrayObtainStyledAttributes.getInt(zae.PinView_viewType, 0);
        this.f11229h = typedArrayObtainStyledAttributes.getInt(zae.PinView_itemCount, 4);
        this.f11231s = (int) typedArrayObtainStyledAttributes.getDimension(zae.PinView_itemHeight, resources.getDimensionPixelSize(j7e.pv_pin_view_item_size));
        this.f11230q = (int) typedArrayObtainStyledAttributes.getDimension(zae.PinView_itemWidth, resources.getDimensionPixelSize(j7e.pv_pin_view_item_size));
        this.f11233y = typedArrayObtainStyledAttributes.getDimensionPixelSize(zae.PinView_itemSpacing, resources.getDimensionPixelSize(j7e.pv_pin_view_item_spacing));
        this.f11232x = (int) typedArrayObtainStyledAttributes.getDimension(zae.PinView_itemRadius, 0.0f);
        this.h0 = (int) typedArrayObtainStyledAttributes.getDimension(zae.PinView_lineWidth, resources.getDimensionPixelSize(j7e.pv_pin_view_item_line_width));
        this.f11226M = typedArrayObtainStyledAttributes.getColorStateList(zae.PinView_lineColor);
        this.r0 = typedArrayObtainStyledAttributes.getBoolean(zae.PinView_android_cursorVisible, true);
        this.v0 = typedArrayObtainStyledAttributes.getColor(zae.PinView_cursorColor, getCurrentTextColor());
        this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(zae.PinView_cursorWidth, resources.getDimensionPixelSize(j7e.pv_pin_view_cursor_width));
        this.x0 = typedArrayObtainStyledAttributes.getDrawable(zae.PinView_android_itemBackground);
        this.y0 = typedArrayObtainStyledAttributes.getBoolean(zae.PinView_hideLineWhenFilled, false);
        typedArrayObtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.f11226M;
        if (colorStateList != null) {
            this.f11227Q = colorStateList.getDefaultColor();
        }
        m12723G();
        m12729i();
        setMaxLength(this.f11229h);
        paint.setStrokeWidth(this.h0);
        m12718B();
        setTransformationMethod(null);
        m12730j();
        this.p0 = m12716x(getInputType());
    }

    public void setLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f11226M = colorStateList;
        m12722F();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        m12723G();
    }
}
