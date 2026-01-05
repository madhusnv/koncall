package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import p001o.lk0;
import p001o.mbe;

/* loaded from: classes2.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: H */
    public RectF f6784H;

    /* renamed from: L */
    public Drawable[] f6785L;

    /* renamed from: M */
    public LayerDrawable f6786M;

    /* renamed from: Q */
    public float f6787Q;

    /* renamed from: d */
    public C1996c f6788d;

    /* renamed from: e */
    public boolean f6789e;

    /* renamed from: f */
    public Drawable f6790f;

    /* renamed from: g */
    public Drawable f6791g;

    /* renamed from: h */
    public float f6792h;
    public float h0;
    public float i0;
    public float j0;

    /* renamed from: q */
    public float f6793q;

    /* renamed from: s */
    public float f6794s;

    /* renamed from: x */
    public Path f6795x;

    /* renamed from: y */
    public ViewOutlineProvider f6796y;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C1994a extends ViewOutlineProvider {
        public C1994a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f6793q) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C1995b extends ViewOutlineProvider {
        public C1995b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f6794s);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C1996c {

        /* renamed from: a */
        public float[] f6799a = new float[20];

        /* renamed from: b */
        public ColorMatrix f6800b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f6801c = new ColorMatrix();

        /* renamed from: d */
        public float f6802d = 1.0f;

        /* renamed from: e */
        public float f6803e = 1.0f;

        /* renamed from: f */
        public float f6804f = 1.0f;

        /* renamed from: g */
        public float f6805g = 1.0f;

        /* renamed from: a */
        public final void m5569a(float f) {
            float[] fArr = this.f6799a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void m5570b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f6799a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void m5571c(ImageView imageView) {
            boolean z;
            this.f6800b.reset();
            float f = this.f6803e;
            boolean z2 = true;
            if (f != 1.0f) {
                m5570b(f);
                this.f6800b.set(this.f6799a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f6804f;
            if (f2 != 1.0f) {
                this.f6801c.setScale(f2, f2, f2, 1.0f);
                this.f6800b.postConcat(this.f6801c);
                z = true;
            }
            float f3 = this.f6805g;
            if (f3 != 1.0f) {
                m5572d(f3);
                this.f6801c.set(this.f6799a);
                this.f6800b.postConcat(this.f6801c);
                z = true;
            }
            float f4 = this.f6802d;
            if (f4 != 1.0f) {
                m5569a(f4);
                this.f6801c.set(this.f6799a);
                this.f6800b.postConcat(this.f6801c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f6800b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void m5572d(float f) {
            float fLog;
            float fPow;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f2 = (5000.0f / f) / 100.0f;
            if (f2 > 66.0f) {
                double d = f2 - 60.0f;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f2)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f2 < 66.0f ? f2 > 19.0f ? (((float) Math.log(f2 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            float[] fArr = this.f6799a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f6788d = new C1996c();
        this.f6789e = true;
        this.f6790f = null;
        this.f6791g = null;
        this.f6792h = 0.0f;
        this.f6793q = 0.0f;
        this.f6794s = Float.NaN;
        this.f6785L = new Drawable[2];
        this.f6787Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5566e(context, null);
    }

    private void setOverlay(boolean z) {
        this.f6789e = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void m5566e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f6790f = typedArrayObtainStyledAttributes.getDrawable(mbe.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.ImageFilterView_crossfade) {
                    this.f6792h = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == mbe.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == mbe.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == mbe.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f6789e));
                } else if (index == mbe.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f6787Q));
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
            this.f6791g = drawable;
            if (this.f6790f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f6791g = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f6785L;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f6791g = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f6785L;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f6791g = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f6785L[1] = this.f6790f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f6785L);
            this.f6786M = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f6792h * 255.0f));
            if (!this.f6789e) {
                this.f6786M.getDrawable(0).setAlpha((int) ((1.0f - this.f6792h) * 255.0f));
            }
            super.setImageDrawable(this.f6786M);
        }
    }

    /* renamed from: f */
    public final void m5567f() {
        if (Float.isNaN(this.f6787Q) && Float.isNaN(this.h0) && Float.isNaN(this.i0) && Float.isNaN(this.j0)) {
            return;
        }
        float f = Float.isNaN(this.f6787Q) ? 0.0f : this.f6787Q;
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

    /* renamed from: g */
    public final void m5568g() {
        if (Float.isNaN(this.f6787Q) && Float.isNaN(this.h0) && Float.isNaN(this.i0) && Float.isNaN(this.j0)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m5567f();
        }
    }

    public float getBrightness() {
        return this.f6788d.f6802d;
    }

    public float getContrast() {
        return this.f6788d.f6804f;
    }

    public float getCrossfade() {
        return this.f6792h;
    }

    public float getImagePanX() {
        return this.f6787Q;
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
        return this.f6794s;
    }

    public float getRoundPercent() {
        return this.f6793q;
    }

    public float getSaturation() {
        return this.f6788d.f6803e;
    }

    public float getWarmth() {
        return this.f6788d.f6805g;
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m5567f();
    }

    public void setAltImageDrawable(Drawable drawable) {
        Drawable drawableMutate = drawable.mutate();
        this.f6790f = drawableMutate;
        Drawable[] drawableArr = this.f6785L;
        drawableArr[0] = this.f6791g;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6785L);
        this.f6786M = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6792h);
    }

    public void setAltImageResource(int i) {
        Drawable drawableM37353b = lk0.m37353b(getContext(), i);
        this.f6790f = drawableM37353b;
        setAltImageDrawable(drawableM37353b);
    }

    public void setBrightness(float f) {
        C1996c c1996c = this.f6788d;
        c1996c.f6802d = f;
        c1996c.m5571c(this);
    }

    public void setContrast(float f) {
        C1996c c1996c = this.f6788d;
        c1996c.f6804f = f;
        c1996c.m5571c(this);
    }

    public void setCrossfade(float f) {
        this.f6792h = f;
        if (this.f6785L != null) {
            if (!this.f6789e) {
                this.f6786M.getDrawable(0).setAlpha((int) ((1.0f - this.f6792h) * 255.0f));
            }
            this.f6786M.getDrawable(1).setAlpha((int) (this.f6792h * 255.0f));
            super.setImageDrawable(this.f6786M);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f6790f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f6791g = drawableMutate;
        Drawable[] drawableArr = this.f6785L;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f6790f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6785L);
        this.f6786M = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6792h);
    }

    public void setImagePanX(float f) {
        this.f6787Q = f;
        m5568g();
    }

    public void setImagePanY(float f) {
        this.h0 = f;
        m5568g();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f6790f == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = lk0.m37353b(getContext(), i).mutate();
        this.f6791g = drawableMutate;
        Drawable[] drawableArr = this.f6785L;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f6790f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f6785L);
        this.f6786M = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f6792h);
    }

    public void setImageRotate(float f) {
        this.j0 = f;
        m5568g();
    }

    public void setImageZoom(float f) {
        this.i0 = f;
        m5568g();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f6794s = f;
            float f2 = this.f6793q;
            this.f6793q = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f6794s != f;
        this.f6794s = f;
        if (f != 0.0f) {
            if (this.f6795x == null) {
                this.f6795x = new Path();
            }
            if (this.f6784H == null) {
                this.f6784H = new RectF();
            }
            if (this.f6796y == null) {
                C1995b c1995b = new C1995b();
                this.f6796y = c1995b;
                setOutlineProvider(c1995b);
            }
            setClipToOutline(true);
            this.f6784H.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f6795x.reset();
            Path path = this.f6795x;
            RectF rectF = this.f6784H;
            float f3 = this.f6794s;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f6793q != f;
        this.f6793q = f;
        if (f != 0.0f) {
            if (this.f6795x == null) {
                this.f6795x = new Path();
            }
            if (this.f6784H == null) {
                this.f6784H = new RectF();
            }
            if (this.f6796y == null) {
                C1994a c1994a = new C1994a();
                this.f6796y = c1994a;
                setOutlineProvider(c1994a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f6793q) / 2.0f;
            this.f6784H.set(0.0f, 0.0f, width, height);
            this.f6795x.reset();
            this.f6795x.addRoundRect(this.f6784H, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C1996c c1996c = this.f6788d;
        c1996c.f6803e = f;
        c1996c.m5571c(this);
    }

    public void setWarmth(float f) {
        C1996c c1996c = this.f6788d;
        c1996c.f6805g = f;
        c1996c.m5571c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6788d = new C1996c();
        this.f6789e = true;
        this.f6790f = null;
        this.f6791g = null;
        this.f6792h = 0.0f;
        this.f6793q = 0.0f;
        this.f6794s = Float.NaN;
        this.f6785L = new Drawable[2];
        this.f6787Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5566e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6788d = new C1996c();
        this.f6789e = true;
        this.f6790f = null;
        this.f6791g = null;
        this.f6792h = 0.0f;
        this.f6793q = 0.0f;
        this.f6794s = Float.NaN;
        this.f6785L = new Drawable[2];
        this.f6787Q = Float.NaN;
        this.h0 = Float.NaN;
        this.i0 = Float.NaN;
        this.j0 = Float.NaN;
        m5566e(context, attributeSet);
    }
}
