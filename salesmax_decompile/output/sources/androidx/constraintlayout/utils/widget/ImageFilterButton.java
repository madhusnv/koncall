package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import p001o.lk0;
import p001o.mbe;

/* loaded from: classes2.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: H */
    public boolean f6769H;

    /* renamed from: L */
    public Drawable f6770L;

    /* renamed from: M */
    public Drawable f6771M;

    /* renamed from: Q */
    public float f6772Q;

    /* renamed from: d */
    public ImageFilterView.C1996c f6773d;

    /* renamed from: e */
    public float f6774e;

    /* renamed from: f */
    public float f6775f;

    /* renamed from: g */
    public float f6776g;

    /* renamed from: h */
    public Path f6777h;
    public float h0;
    public float i0;
    public float j0;

    /* renamed from: q */
    public ViewOutlineProvider f6778q;

    /* renamed from: s */
    public RectF f6779s;

    /* renamed from: x */
    public Drawable[] f6780x;

    /* renamed from: y */
    public LayerDrawable f6781y;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    public class C1992a extends ViewOutlineProvider {
        public C1992a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f6775f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    public class C1993b extends ViewOutlineProvider {
        public C1993b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f6776g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f6773d = new ImageFilterView.C1996c();
        this.f6774e = 0.0f;
        this.f6775f = 0.0f;
        this.f6776g = Float.NaN;
        this.f6780x = new Drawable[2];
        this.f6769H = true;
        this.f6770L = null;
        this.f6771M = null;
        this.f6772Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5561c(context, null);
    }

    private void setOverlay(boolean z) {
        this.f6769H = z;
    }

    /* renamed from: c */
    public final void m5561c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f6770L = typedArrayObtainStyledAttributes.getDrawable(mbe.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ImageFilterView_crossfade) {
                    this.f6774e = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == mbe.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == mbe.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f6769H));
                } else if (index == mbe.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f6772Q));
                } else if (index == mbe.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.h0));
                } else if (index == mbe.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.j0));
                } else if (index == mbe.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.i0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f6771M = drawable;
            if (this.f6770L == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f6771M = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f6780x;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f6771M = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f6780x;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f6771M = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f6780x[1] = this.f6770L.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f6780x);
            this.f6781y = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f6774e * 255.0f));
            if (!this.f6769H) {
                this.f6781y.getDrawable(0).setAlpha((int) ((1.0f - this.f6774e) * 255.0f));
            }
            super.setImageDrawable(this.f6781y);
        }
    }

    /* renamed from: d */
    public final void m5562d() {
        if (Float.isNaN(this.f6772Q) && Float.isNaN(this.h0) && Float.isNaN(this.i0) && Float.isNaN(this.j0)) {
            return;
        }
        float f = Float.isNaN(this.f6772Q) ? 0.0f : this.f6772Q;
        float f2 = Float.isNaN(this.h0) ? 0.0f : this.h0;
        float f3 = Float.isNaN(this.i0) ? 1.0f : this.i0;
        float f4 = Float.isNaN(this.j0) ? 0.0f : this.j0;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f6)) + width) - f6) * 0.5f, (((f2 * (height - f7)) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m5563e() {
        if (Float.isNaN(this.f6772Q) && Float.isNaN(this.h0) && Float.isNaN(this.i0) && Float.isNaN(this.j0)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m5562d();
        }
    }

    public float getContrast() {
        return this.f6773d.f6804f;
    }

    public float getCrossfade() {
        return this.f6774e;
    }

    public float getImagePanX() {
        return this.f6772Q;
    }

    public float getImagePanY() {
        return this.h0;
    }

    public float getImageRotate() {
        return this.j0;
    }

    public float getImageZoom() {
        return this.i0;
    }

    public float getRound() {
        return this.f6776g;
    }

    public float getRoundPercent() {
        return this.f6775f;
    }

    public float getSaturation() {
        return this.f6773d.f6803e;
    }

    public float getWarmth() {
        return this.f6773d.f6805g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m5562d();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = lk0.m37353b(getContext(), i).mutate();
        this.f6770L = drawableMutate;
        Drawable[] drawableArr = this.f6780x;
        drawableArr[0] = this.f6771M;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6780x);
        this.f6781y = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6774e);
    }

    public void setBrightness(float f) {
        ImageFilterView.C1996c c1996c = this.f6773d;
        c1996c.f6802d = f;
        c1996c.m5571c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C1996c c1996c = this.f6773d;
        c1996c.f6804f = f;
        c1996c.m5571c(this);
    }

    public void setCrossfade(float f) {
        this.f6774e = f;
        if (this.f6780x != null) {
            if (!this.f6769H) {
                this.f6781y.getDrawable(0).setAlpha((int) ((1.0f - this.f6774e) * 255.0f));
            }
            this.f6781y.getDrawable(1).setAlpha((int) (this.f6774e * 255.0f));
            super.setImageDrawable(this.f6781y);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f6770L == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f6771M = drawableMutate;
        Drawable[] drawableArr = this.f6780x;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f6770L;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6780x);
        this.f6781y = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6774e);
    }

    public void setImagePanX(float f) {
        this.f6772Q = f;
        m5563e();
    }

    public void setImagePanY(float f) {
        this.h0 = f;
        m5563e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f6770L == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = lk0.m37353b(getContext(), i).mutate();
        this.f6771M = drawableMutate;
        Drawable[] drawableArr = this.f6780x;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f6770L;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6780x);
        this.f6781y = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6774e);
    }

    public void setImageRotate(float f) {
        this.j0 = f;
        m5563e();
    }

    public void setImageZoom(float f) {
        this.i0 = f;
        m5563e();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f6776g = f;
            float f2 = this.f6775f;
            this.f6775f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f6776g != f;
        this.f6776g = f;
        if (f != 0.0f) {
            if (this.f6777h == null) {
                this.f6777h = new Path();
            }
            if (this.f6779s == null) {
                this.f6779s = new RectF();
            }
            if (this.f6778q == null) {
                C1993b c1993b = new C1993b();
                this.f6778q = c1993b;
                setOutlineProvider(c1993b);
            }
            setClipToOutline(true);
            this.f6779s.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f6777h.reset();
            Path path = this.f6777h;
            RectF rectF = this.f6779s;
            float f3 = this.f6776g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f6775f != f;
        this.f6775f = f;
        if (f != 0.0f) {
            if (this.f6777h == null) {
                this.f6777h = new Path();
            }
            if (this.f6779s == null) {
                this.f6779s = new RectF();
            }
            if (this.f6778q == null) {
                C1992a c1992a = new C1992a();
                this.f6778q = c1992a;
                setOutlineProvider(c1992a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f6775f) / 2.0f;
            this.f6779s.set(0.0f, 0.0f, width, height);
            this.f6777h.reset();
            this.f6777h.addRoundRect(this.f6779s, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C1996c c1996c = this.f6773d;
        c1996c.f6803e = f;
        c1996c.m5571c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C1996c c1996c = this.f6773d;
        c1996c.f6805g = f;
        c1996c.m5571c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6773d = new ImageFilterView.C1996c();
        this.f6774e = 0.0f;
        this.f6775f = 0.0f;
        this.f6776g = Float.NaN;
        this.f6780x = new Drawable[2];
        this.f6769H = true;
        this.f6770L = null;
        this.f6771M = null;
        this.f6772Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5561c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6773d = new ImageFilterView.C1996c();
        this.f6774e = 0.0f;
        this.f6775f = 0.0f;
        this.f6776g = Float.NaN;
        this.f6780x = new Drawable[2];
        this.f6769H = true;
        this.f6770L = null;
        this.f6771M = null;
        this.f6772Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5561c(context, attributeSet);
    }
}
