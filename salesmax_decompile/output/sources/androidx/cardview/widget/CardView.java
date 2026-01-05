package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p001o.a6e;
import p001o.he2;
import p001o.ie2;
import p001o.jae;
import p001o.je2;
import p001o.lbe;
import p001o.m6e;

/* loaded from: classes2.dex */
public class CardView extends FrameLayout {

    /* renamed from: h */
    public static final int[] f6206h = {R.attr.colorBackground};

    /* renamed from: q */
    public static final je2 f6207q;

    /* renamed from: a */
    public boolean f6208a;

    /* renamed from: b */
    public boolean f6209b;

    /* renamed from: c */
    public int f6210c;

    /* renamed from: d */
    public int f6211d;

    /* renamed from: e */
    public final Rect f6212e;

    /* renamed from: f */
    public final Rect f6213f;

    /* renamed from: g */
    public final ie2 f6214g;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C1911a implements ie2 {

        /* renamed from: a */
        public Drawable f6215a;

        public C1911a() {
        }

        @Override // p001o.ie2
        /* renamed from: a */
        public void mo4826a(int i, int i2, int i3, int i4) {
            CardView.this.f6213f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f6212e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // p001o.ie2
        /* renamed from: b */
        public void mo4827b(Drawable drawable) {
            this.f6215a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // p001o.ie2
        /* renamed from: c */
        public boolean mo4828c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // p001o.ie2
        /* renamed from: d */
        public Drawable mo4829d() {
            return this.f6215a;
        }

        @Override // p001o.ie2
        /* renamed from: e */
        public boolean mo4830e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // p001o.ie2
        /* renamed from: f */
        public View mo4831f() {
            return CardView.this;
        }
    }

    static {
        he2 he2Var = new he2();
        f6207q = he2Var;
        he2Var.mo30292n();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f6207q.mo30283e(this.f6214g);
    }

    public float getCardElevation() {
        return f6207q.mo30290l(this.f6214g);
    }

    public int getContentPaddingBottom() {
        return this.f6212e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f6212e.left;
    }

    public int getContentPaddingRight() {
        return this.f6212e.right;
    }

    public int getContentPaddingTop() {
        return this.f6212e.top;
    }

    public float getMaxCardElevation() {
        return f6207q.mo30284f(this.f6214g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f6209b;
    }

    public float getRadius() {
        return f6207q.mo30281c(this.f6214g);
    }

    public boolean getUseCompatPadding() {
        return this.f6208a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (f6207q instanceof he2) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo30279a(this.f6214g)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo30285g(this.f6214g)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f6207q.mo30293o(this.f6214g, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f6207q.mo30282d(this.f6214g, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f6212e.set(i, i2, i3, i4);
        f6207q.mo30289k(this.f6214g);
    }

    public void setMaxCardElevation(float f) {
        f6207q.mo30291m(this.f6214g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f6211d = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f6210c = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f6209b) {
            this.f6209b = z;
            f6207q.mo30280b(this.f6214g);
        }
    }

    public void setRadius(float f) {
        f6207q.mo30286h(this.f6214g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f6208a != z) {
            this.f6208a = z;
            f6207q.mo30287i(this.f6214g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a6e.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f6207q.mo30293o(this.f6214g, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f6212e = rect;
        this.f6213f = new Rect();
        C1911a c1911a = new C1911a();
        this.f6214g = c1911a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lbe.CardView, i, jae.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(lbe.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(lbe.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f6206h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(m6e.cardview_light_background);
            } else {
                color = getResources().getColor(m6e.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(lbe.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(lbe.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(lbe.CardView_cardMaxElevation, 0.0f);
        this.f6208a = typedArrayObtainStyledAttributes.getBoolean(lbe.CardView_cardUseCompatPadding, false);
        this.f6209b = typedArrayObtainStyledAttributes.getBoolean(lbe.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f6210c = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_android_minWidth, 0);
        this.f6211d = typedArrayObtainStyledAttributes.getDimensionPixelSize(lbe.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        f6207q.mo30288j(c1911a, context, colorStateList, dimension, dimension2, f);
    }
}
