package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p001o.ebe;
import p001o.gza;
import p001o.lk0;
import p001o.pae;
import p001o.rlf;
import p001o.ykf;
import p001o.yya;
import p001o.zkf;
import p001o.zya;

/* loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements rlf {
    public static final int m0 = pae.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: H */
    public float f12661H;

    /* renamed from: L */
    public Path f12662L;

    /* renamed from: M */
    public int f12663M;

    /* renamed from: Q */
    public int f12664Q;

    /* renamed from: d */
    public final zkf f12665d;

    /* renamed from: e */
    public final RectF f12666e;

    /* renamed from: f */
    public final RectF f12667f;

    /* renamed from: g */
    public final Paint f12668g;

    /* renamed from: h */
    public final Paint f12669h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;

    /* renamed from: q */
    public final Path f12670q;

    /* renamed from: s */
    public ColorStateList f12671s;

    /* renamed from: x */
    public zya f12672x;

    /* renamed from: y */
    public ykf f12673y;

    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C11063a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f12674a = new Rect();

        public C11063a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f12673y == null) {
                return;
            }
            if (ShapeableImageView.this.f12672x == null) {
                ShapeableImageView.this.f12672x = new zya(ShapeableImageView.this.f12673y);
            }
            ShapeableImageView.this.f12666e.round(this.f12674a);
            ShapeableImageView.this.f12672x.setBounds(this.f12674a);
            ShapeableImageView.this.f12672x.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: g */
    public final void m14738g(Canvas canvas) {
        if (this.f12671s == null) {
            return;
        }
        this.f12668g.setStrokeWidth(this.f12661H);
        int colorForState = this.f12671s.getColorForState(getDrawableState(), this.f12671s.getDefaultColor());
        if (this.f12661H <= 0.0f || colorForState == 0) {
            return;
        }
        this.f12668g.setColor(colorForState);
        canvas.drawPath(this.f12670q, this.f12668g);
    }

    public int getContentPaddingBottom() {
        return this.i0;
    }

    public final int getContentPaddingEnd() {
        int i = this.k0;
        return i != Integer.MIN_VALUE ? i : m14740i() ? this.f12663M : this.h0;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (m14739h()) {
            if (m14740i() && (i2 = this.k0) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m14740i() && (i = this.j0) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f12663M;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (m14739h()) {
            if (m14740i() && (i2 = this.j0) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m14740i() && (i = this.k0) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.h0;
    }

    public final int getContentPaddingStart() {
        int i = this.j0;
        return i != Integer.MIN_VALUE ? i : m14740i() ? this.h0 : this.f12663M;
    }

    public int getContentPaddingTop() {
        return this.f12664Q;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public ykf getShapeAppearanceModel() {
        return this.f12673y;
    }

    public ColorStateList getStrokeColor() {
        return this.f12671s;
    }

    public float getStrokeWidth() {
        return this.f12661H;
    }

    /* renamed from: h */
    public final boolean m14739h() {
        return (this.j0 == Integer.MIN_VALUE && this.k0 == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: i */
    public final boolean m14740i() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: j */
    public final void m14741j(int i, int i2) {
        this.f12666e.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f12665d.m59555d(this.f12673y, 1.0f, this.f12666e, this.f12670q);
        this.f12662L.rewind();
        this.f12662L.addPath(this.f12670q);
        this.f12667f.set(0.0f, 0.0f, i, i2);
        this.f12662L.addRect(this.f12667f, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f12662L, this.f12669h);
        m14738g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.l0 && isLayoutDirectionResolved()) {
            this.l0 = true;
            if (isPaddingRelative() || m14739h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m14741j(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f12663M) + i, (super.getPaddingTop() - this.f12664Q) + i2, (super.getPaddingRight() - this.h0) + i3, (super.getPaddingBottom() - this.i0) + i4);
        this.f12663M = i;
        this.f12664Q = i2;
        this.h0 = i3;
        this.i0 = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.f12664Q) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.i0) + i4);
        this.f12663M = m14740i() ? i3 : i;
        this.f12664Q = i2;
        if (!m14740i()) {
            i = i3;
        }
        this.h0 = i;
        this.i0 = i4;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        this.f12673y = ykfVar;
        zya zyaVar = this.f12672x;
        if (zyaVar != null) {
            zyaVar.setShapeAppearanceModel(ykfVar);
        }
        m14741j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f12671s = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(lk0.m37352a(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f12661H != f) {
            this.f12661H = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        int i2 = m0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12665d = zkf.m59551l();
        this.f12670q = new Path();
        this.l0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f12669h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f12666e = new RectF();
        this.f12667f = new RectF();
        this.f12662L = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ebe.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.f12671s = yya.m58494a(context2, typedArrayObtainStyledAttributes, ebe.ShapeableImageView_strokeColor);
        this.f12661H = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPadding, 0);
        this.f12663M = dimensionPixelSize;
        this.f12664Q = dimensionPixelSize;
        this.h0 = dimensionPixelSize;
        this.i0 = dimensionPixelSize;
        this.f12663M = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f12664Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f12668g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f12673y = ykf.m57925e(context2, attributeSet, i, i2).m57970m();
        setOutlineProvider(new C11063a());
    }
}
