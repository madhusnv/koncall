package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.util.Objects;
import p001o.h37;
import p001o.k75;
import p001o.mbe;
import p001o.z5e;

/* loaded from: classes2.dex */
public class MotionLabel extends View implements h37 {
    public float A0;
    public float B0;
    public float C0;
    public Paint D0;
    public int E0;
    public Rect F0;
    public Paint G0;

    /* renamed from: H */
    public int f6824H;
    public float H0;
    public float I0;
    public float J0;
    public float K0;

    /* renamed from: L */
    public float f6825L;
    public float L0;

    /* renamed from: M */
    public String f6826M;

    /* renamed from: Q */
    public boolean f6827Q;

    /* renamed from: a */
    public TextPaint f6828a;

    /* renamed from: b */
    public Path f6829b;

    /* renamed from: c */
    public int f6830c;

    /* renamed from: d */
    public int f6831d;

    /* renamed from: e */
    public boolean f6832e;

    /* renamed from: f */
    public float f6833f;

    /* renamed from: g */
    public float f6834g;

    /* renamed from: h */
    public ViewOutlineProvider f6835h;
    public Rect h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public String m0;
    public Layout n0;
    public int o0;
    public int p0;

    /* renamed from: q */
    public RectF f6836q;
    public boolean q0;
    public float r0;

    /* renamed from: s */
    public float f6837s;
    public float s0;
    public float t0;
    public Drawable u0;
    public Matrix v0;
    public Bitmap w0;

    /* renamed from: x */
    public float f6838x;
    public BitmapShader x0;

    /* renamed from: y */
    public int f6839y;
    public Matrix y0;
    public float z0;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    public class C1999a extends ViewOutlineProvider {
        public C1999a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f6833f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    public class C2000b extends ViewOutlineProvider {
        public C2000b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f6834g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        this.f6828a = new TextPaint();
        this.f6829b = new Path();
        this.f6830c = 65535;
        this.f6831d = 65535;
        this.f6832e = false;
        this.f6833f = 0.0f;
        this.f6834g = Float.NaN;
        this.f6837s = 48.0f;
        this.f6838x = Float.NaN;
        this.f6825L = 0.0f;
        this.f6826M = "Hello World";
        this.f6827Q = true;
        this.h0 = new Rect();
        this.i0 = 1;
        this.j0 = 1;
        this.k0 = 1;
        this.l0 = 1;
        this.o0 = 8388659;
        this.p0 = 0;
        this.q0 = false;
        this.z0 = Float.NaN;
        this.A0 = Float.NaN;
        this.B0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = new Paint();
        this.E0 = 0;
        this.I0 = Float.NaN;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        m5583g(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f6838x) ? 1.0f : this.f6837s / this.f6838x;
        TextPaint textPaint = this.f6828a;
        String str = this.f6826M;
        return (((((Float.isNaN(this.s0) ? getMeasuredWidth() : this.s0) - getPaddingLeft()) - getPaddingRight()) - (f * textPaint.measureText(str, 0, str.length()))) * (this.B0 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f6838x) ? 1.0f : this.f6837s / this.f6838x;
        Paint.FontMetrics fontMetrics = this.f6828a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.t0) ? getMeasuredHeight() : this.t0) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((measuredHeight - ((f2 - f3) * f)) * (1.0f - this.C0)) / 2.0f) - (f * f3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(z5e.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f6828a;
        int i = typedValue.data;
        this.f6830c = i;
        textPaint.setColor(i);
    }

    @Override // p001o.h37
    /* renamed from: a */
    public void mo5579a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.r0 = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.s0 = f5;
        float f6 = f4 - f2;
        this.t0 = f6;
        m5580d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.q0) {
            if (this.F0 == null) {
                this.G0 = new Paint();
                this.F0 = new Rect();
                this.G0.set(this.f6828a);
                this.H0 = this.G0.getTextSize();
            }
            this.s0 = f5;
            this.t0 = f6;
            Paint paint = this.G0;
            String str = this.f6826M;
            paint.getTextBounds(str, 0, str.length(), this.F0);
            float fHeight = this.F0.height() * 1.3f;
            float f7 = (f5 - this.j0) - this.i0;
            float f8 = (f6 - this.l0) - this.k0;
            float fWidth = this.F0.width();
            if (fWidth * f8 > fHeight * f7) {
                this.f6828a.setTextSize((this.H0 * f7) / fWidth);
            } else {
                this.f6828a.setTextSize((this.H0 * f8) / fHeight);
            }
            if (this.f6832e || !Float.isNaN(this.f6838x)) {
                m5582f(Float.isNaN(this.f6838x) ? 1.0f : this.f6837s / this.f6838x);
            }
        }
    }

    /* renamed from: d */
    public final void m5580d(float f, float f2, float f3, float f4) {
        if (this.y0 == null) {
            return;
        }
        this.s0 = f3 - f;
        this.t0 = f4 - f2;
        m5587k();
    }

    /* renamed from: e */
    public Bitmap m5581e(Bitmap bitmap, int i) {
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
        }
        return bitmapCreateScaledBitmap;
    }

    /* renamed from: f */
    public void m5582f(float f) {
        if (this.f6832e || f != 1.0f) {
            this.f6829b.reset();
            String str = this.f6826M;
            int length = str.length();
            this.f6828a.getTextBounds(str, 0, length, this.h0);
            this.f6828a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f6829b);
            if (f != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(k75.m35102a());
                sb.append(" scale ");
                sb.append(f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f6829b.transform(matrix);
            }
            Rect rect = this.h0;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f6827Q = false;
        }
    }

    /* renamed from: g */
    public final void m5583g(Context context, AttributeSet attributeSet) {
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == mbe.MotionLabel_android_fontFamily) {
                    this.m0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.MotionLabel_scaleFromTextSize) {
                    this.f6838x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f6838x);
                } else if (index == mbe.MotionLabel_android_textSize) {
                    this.f6837s = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.f6837s);
                } else if (index == mbe.MotionLabel_android_textStyle) {
                    this.f6839y = typedArrayObtainStyledAttributes.getInt(index, this.f6839y);
                } else if (index == mbe.MotionLabel_android_typeface) {
                    this.f6824H = typedArrayObtainStyledAttributes.getInt(index, this.f6824H);
                } else if (index == mbe.MotionLabel_android_textColor) {
                    this.f6830c = typedArrayObtainStyledAttributes.getColor(index, this.f6830c);
                } else if (index == mbe.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.f6834g);
                    this.f6834g = dimension;
                    setRound(dimension);
                } else if (index == mbe.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f6833f);
                    this.f6833f = f;
                    setRoundPercent(f);
                } else if (index == mbe.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == mbe.MotionLabel_android_autoSizeTextType) {
                    this.p0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == mbe.MotionLabel_textOutlineColor) {
                    this.f6831d = typedArrayObtainStyledAttributes.getInt(index, this.f6831d);
                    this.f6832e = true;
                } else if (index == mbe.MotionLabel_textOutlineThickness) {
                    this.f6825L = typedArrayObtainStyledAttributes.getDimension(index, this.f6825L);
                    this.f6832e = true;
                } else if (index == mbe.MotionLabel_textBackground) {
                    this.u0 = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.f6832e = true;
                } else if (index == mbe.MotionLabel_textBackgroundPanX) {
                    this.I0 = typedArrayObtainStyledAttributes.getFloat(index, this.I0);
                } else if (index == mbe.MotionLabel_textBackgroundPanY) {
                    this.J0 = typedArrayObtainStyledAttributes.getFloat(index, this.J0);
                } else if (index == mbe.MotionLabel_textPanX) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == mbe.MotionLabel_textPanY) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == mbe.MotionLabel_textBackgroundRotate) {
                    this.L0 = typedArrayObtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == mbe.MotionLabel_textBackgroundZoom) {
                    this.K0 = typedArrayObtainStyledAttributes.getFloat(index, this.K0);
                } else if (index == mbe.MotionLabel_textureHeight) {
                    this.z0 = typedArrayObtainStyledAttributes.getDimension(index, this.z0);
                } else if (index == mbe.MotionLabel_textureWidth) {
                    this.A0 = typedArrayObtainStyledAttributes.getDimension(index, this.A0);
                } else if (index == mbe.MotionLabel_textureEffect) {
                    this.E0 = typedArrayObtainStyledAttributes.getInt(index, this.E0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        m5586j();
        m5585i();
    }

    public float getRound() {
        return this.f6834g;
    }

    public float getRoundPercent() {
        return this.f6833f;
    }

    public float getScaleFromTextSize() {
        return this.f6838x;
    }

    public float getTextBackgroundPanX() {
        return this.I0;
    }

    public float getTextBackgroundPanY() {
        return this.J0;
    }

    public float getTextBackgroundRotate() {
        return this.L0;
    }

    public float getTextBackgroundZoom() {
        return this.K0;
    }

    public int getTextOutlineColor() {
        return this.f6831d;
    }

    public float getTextPanX() {
        return this.B0;
    }

    public float getTextPanY() {
        return this.C0;
    }

    public float getTextureHeight() {
        return this.z0;
    }

    public float getTextureWidth() {
        return this.A0;
    }

    public Typeface getTypeface() {
        return this.f6828a.getTypeface();
    }

    /* renamed from: h */
    public final void m5584h(String str, int i, int i2) {
        Typeface typefaceCreate;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i2 <= 0) {
            this.f6828a.setFakeBoldText(false);
            this.f6828a.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        } else {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typefaceCreate, i2);
            setTypeface(typefaceDefaultFromStyle);
            int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
            this.f6828a.setFakeBoldText((i3 & 1) != 0);
            this.f6828a.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    /* renamed from: i */
    public void m5585i() {
        this.i0 = getPaddingLeft();
        this.j0 = getPaddingRight();
        this.k0 = getPaddingTop();
        this.l0 = getPaddingBottom();
        m5584h(this.m0, this.f6824H, this.f6839y);
        this.f6828a.setColor(this.f6830c);
        this.f6828a.setStrokeWidth(this.f6825L);
        this.f6828a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f6828a.setFlags(128);
        setTextSize(this.f6837s);
        this.f6828a.setAntiAlias(true);
    }

    /* renamed from: j */
    public final void m5586j() {
        if (this.u0 != null) {
            this.y0 = new Matrix();
            int intrinsicWidth = this.u0.getIntrinsicWidth();
            int intrinsicHeight = this.u0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.A0) ? 128 : (int) this.A0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.z0) ? 128 : (int) this.z0;
            }
            if (this.E0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.w0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.w0);
            this.u0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.u0.setFilterBitmap(true);
            this.u0.draw(canvas);
            if (this.E0 != 0) {
                this.w0 = m5581e(this.w0, 4);
            }
            Bitmap bitmap = this.w0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.x0 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: k */
    public final void m5587k() {
        float f = Float.isNaN(this.I0) ? 0.0f : this.I0;
        float f2 = Float.isNaN(this.J0) ? 0.0f : this.J0;
        float f3 = Float.isNaN(this.K0) ? 1.0f : this.K0;
        float f4 = Float.isNaN(this.L0) ? 0.0f : this.L0;
        this.y0.reset();
        float width = this.w0.getWidth();
        float height = this.w0.getHeight();
        float f5 = Float.isNaN(this.A0) ? this.s0 : this.A0;
        float f6 = Float.isNaN(this.z0) ? this.t0 : this.z0;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.y0.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.z0)) {
            f11 = this.z0 / 2.0f;
        }
        if (!Float.isNaN(this.A0)) {
            f9 = this.A0 / 2.0f;
        }
        this.y0.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.y0.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.x0.setLocalMatrix(this.y0);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f6838x);
        float f = zIsNaN ? 1.0f : this.f6837s / this.f6838x;
        this.s0 = i3 - i;
        this.t0 = i4 - i2;
        if (this.q0) {
            if (this.F0 == null) {
                this.G0 = new Paint();
                this.F0 = new Rect();
                this.G0.set(this.f6828a);
                this.H0 = this.G0.getTextSize();
            }
            Paint paint = this.G0;
            String str = this.f6826M;
            paint.getTextBounds(str, 0, str.length(), this.F0);
            int iWidth = this.F0.width();
            int iHeight = (int) (this.F0.height() * 1.3f);
            float f2 = (this.s0 - this.j0) - this.i0;
            float f3 = (this.t0 - this.l0) - this.k0;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    this.f6828a.setTextSize((this.H0 * f2) / f4);
                } else {
                    this.f6828a.setTextSize((this.H0 * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f6832e || !zIsNaN) {
            m5580d(i, i2, i3, i4);
            m5582f(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f6838x) ? 1.0f : this.f6837s / this.f6838x;
        super.onDraw(canvas);
        if (!this.f6832e && f == 1.0f) {
            canvas.drawText(this.f6826M, this.r0 + this.i0 + getHorizontalOffset(), this.k0 + getVerticalOffset(), this.f6828a);
            return;
        }
        if (this.f6827Q) {
            m5582f(f);
        }
        if (this.v0 == null) {
            this.v0 = new Matrix();
        }
        if (!this.f6832e) {
            float horizontalOffset = this.i0 + getHorizontalOffset();
            float verticalOffset = this.k0 + getVerticalOffset();
            this.v0.reset();
            this.v0.preTranslate(horizontalOffset, verticalOffset);
            this.f6829b.transform(this.v0);
            this.f6828a.setColor(this.f6830c);
            this.f6828a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f6828a.setStrokeWidth(this.f6825L);
            canvas.drawPath(this.f6829b, this.f6828a);
            this.v0.reset();
            this.v0.preTranslate(-horizontalOffset, -verticalOffset);
            this.f6829b.transform(this.v0);
            return;
        }
        this.D0.set(this.f6828a);
        this.v0.reset();
        float horizontalOffset2 = this.i0 + getHorizontalOffset();
        float verticalOffset2 = this.k0 + getVerticalOffset();
        this.v0.postTranslate(horizontalOffset2, verticalOffset2);
        this.v0.preScale(f, f);
        this.f6829b.transform(this.v0);
        if (this.x0 != null) {
            this.f6828a.setFilterBitmap(true);
            this.f6828a.setShader(this.x0);
        } else {
            this.f6828a.setColor(this.f6830c);
        }
        this.f6828a.setStyle(Paint.Style.FILL);
        this.f6828a.setStrokeWidth(this.f6825L);
        canvas.drawPath(this.f6829b, this.f6828a);
        if (this.x0 != null) {
            this.f6828a.setShader(null);
        }
        this.f6828a.setColor(this.f6831d);
        this.f6828a.setStyle(Paint.Style.STROKE);
        this.f6828a.setStrokeWidth(this.f6825L);
        canvas.drawPath(this.f6829b, this.f6828a);
        this.v0.reset();
        this.v0.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f6829b.transform(this.v0);
        this.f6828a.set(this.D0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.q0 = false;
        this.i0 = getPaddingLeft();
        this.j0 = getPaddingRight();
        this.k0 = getPaddingTop();
        this.l0 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f6828a;
            String str = this.f6826M;
            textPaint.getTextBounds(str, 0, str.length(), this.h0);
            if (mode != 1073741824) {
                size = (int) (this.h0.width() + 0.99999f);
            }
            size += this.i0 + this.j0;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.f6828a.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.k0 + this.l0 + fontMetricsInt;
            }
        } else if (this.p0 != 0) {
            this.q0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.o0) {
            invalidate();
        }
        this.o0 = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.C0 = -1.0f;
        } else if (i2 != 80) {
            this.C0 = 0.0f;
        } else {
            this.C0 = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.B0 = 0.0f;
                        return;
                    }
                }
            }
            this.B0 = 1.0f;
            return;
        }
        this.B0 = -1.0f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f6834g = f;
            float f2 = this.f6833f;
            this.f6833f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f6834g != f;
        this.f6834g = f;
        if (f != 0.0f) {
            if (this.f6829b == null) {
                this.f6829b = new Path();
            }
            if (this.f6836q == null) {
                this.f6836q = new RectF();
            }
            if (this.f6835h == null) {
                C2000b c2000b = new C2000b();
                this.f6835h = c2000b;
                setOutlineProvider(c2000b);
            }
            setClipToOutline(true);
            this.f6836q.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f6829b.reset();
            Path path = this.f6829b;
            RectF rectF = this.f6836q;
            float f3 = this.f6834g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f6833f != f;
        this.f6833f = f;
        if (f != 0.0f) {
            if (this.f6829b == null) {
                this.f6829b = new Path();
            }
            if (this.f6836q == null) {
                this.f6836q = new RectF();
            }
            if (this.f6835h == null) {
                C1999a c1999a = new C1999a();
                this.f6835h = c1999a;
                setOutlineProvider(c1999a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f6833f) / 2.0f;
            this.f6836q.set(0.0f, 0.0f, width, height);
            this.f6829b.reset();
            this.f6829b.addRoundRect(this.f6836q, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f6838x = f;
    }

    public void setText(CharSequence charSequence) {
        this.f6826M = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.I0 = f;
        m5587k();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.J0 = f;
        m5587k();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.L0 = f;
        m5587k();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.K0 = f;
        m5587k();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f6830c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f6831d = i;
        this.f6832e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f6825L = f;
        this.f6832e = true;
        if (Float.isNaN(f)) {
            this.f6825L = 1.0f;
            this.f6832e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.B0 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.C0 = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f6837s = f;
        TextPaint textPaint = this.f6828a;
        if (!Float.isNaN(this.f6838x)) {
            f = this.f6838x;
        }
        textPaint.setTextSize(f);
        m5582f(Float.isNaN(this.f6838x) ? 1.0f : this.f6837s / this.f6838x);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.z0 = f;
        m5587k();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.A0 = f;
        m5587k();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (Objects.equals(this.f6828a.getTypeface(), typeface)) {
            return;
        }
        this.f6828a.setTypeface(typeface);
        if (this.n0 != null) {
            this.n0 = null;
            requestLayout();
            invalidate();
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6828a = new TextPaint();
        this.f6829b = new Path();
        this.f6830c = 65535;
        this.f6831d = 65535;
        this.f6832e = false;
        this.f6833f = 0.0f;
        this.f6834g = Float.NaN;
        this.f6837s = 48.0f;
        this.f6838x = Float.NaN;
        this.f6825L = 0.0f;
        this.f6826M = "Hello World";
        this.f6827Q = true;
        this.h0 = new Rect();
        this.i0 = 1;
        this.j0 = 1;
        this.k0 = 1;
        this.l0 = 1;
        this.o0 = 8388659;
        this.p0 = 0;
        this.q0 = false;
        this.z0 = Float.NaN;
        this.A0 = Float.NaN;
        this.B0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = new Paint();
        this.E0 = 0;
        this.I0 = Float.NaN;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        m5583g(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6828a = new TextPaint();
        this.f6829b = new Path();
        this.f6830c = 65535;
        this.f6831d = 65535;
        this.f6832e = false;
        this.f6833f = 0.0f;
        this.f6834g = Float.NaN;
        this.f6837s = 48.0f;
        this.f6838x = Float.NaN;
        this.f6825L = 0.0f;
        this.f6826M = "Hello World";
        this.f6827Q = true;
        this.h0 = new Rect();
        this.i0 = 1;
        this.j0 = 1;
        this.k0 = 1;
        this.l0 = 1;
        this.o0 = 8388659;
        this.p0 = 0;
        this.q0 = false;
        this.z0 = Float.NaN;
        this.A0 = Float.NaN;
        this.B0 = 0.0f;
        this.C0 = 0.0f;
        this.D0 = new Paint();
        this.E0 = 0;
        this.I0 = Float.NaN;
        this.J0 = Float.NaN;
        this.K0 = Float.NaN;
        this.L0 = Float.NaN;
        m5583g(context, attributeSet);
    }
}
