package p001o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class jk1 extends Drawable {

    /* renamed from: b */
    public final Paint f30523b;

    /* renamed from: h */
    public float f30529h;

    /* renamed from: i */
    public int f30530i;

    /* renamed from: j */
    public int f30531j;

    /* renamed from: k */
    public int f30532k;

    /* renamed from: l */
    public int f30533l;

    /* renamed from: m */
    public int f30534m;

    /* renamed from: o */
    public ykf f30536o;

    /* renamed from: p */
    public ColorStateList f30537p;

    /* renamed from: a */
    public final zkf f30522a = zkf.m59551l();

    /* renamed from: c */
    public final Path f30524c = new Path();

    /* renamed from: d */
    public final Rect f30525d = new Rect();

    /* renamed from: e */
    public final RectF f30526e = new RectF();

    /* renamed from: f */
    public final RectF f30527f = new RectF();

    /* renamed from: g */
    public final C14554b f30528g = new C14554b();

    /* renamed from: n */
    public boolean f30535n = true;

    /* renamed from: o.jk1$b */
    public class C14554b extends Drawable.ConstantState {
        public C14554b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return jk1.this;
        }
    }

    public jk1(ykf ykfVar) {
        this.f30536o = ykfVar;
        Paint paint = new Paint(1);
        this.f30523b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final Shader m33892a() {
        copyBounds(this.f30525d);
        float fHeight = this.f30529h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{ni3.m40619k(this.f30530i, this.f30534m), ni3.m40619k(this.f30531j, this.f30534m), ni3.m40619k(ni3.m40624p(this.f30531j, 0), this.f30534m), ni3.m40619k(ni3.m40624p(this.f30533l, 0), this.f30534m), ni3.m40619k(this.f30533l, this.f30534m), ni3.m40619k(this.f30532k, this.f30534m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    public RectF m33893b() {
        this.f30527f.set(getBounds());
        return this.f30527f;
    }

    /* renamed from: c */
    public void m33894c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f30534m = colorStateList.getColorForState(getState(), this.f30534m);
        }
        this.f30537p = colorStateList;
        this.f30535n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m33895d(float f) {
        if (this.f30529h != f) {
            this.f30529h = f;
            this.f30523b.setStrokeWidth(f * 1.3333f);
            this.f30535n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f30535n) {
            this.f30523b.setShader(m33892a());
            this.f30535n = false;
        }
        float strokeWidth = this.f30523b.getStrokeWidth() / 2.0f;
        copyBounds(this.f30525d);
        this.f30526e.set(this.f30525d);
        float fMin = Math.min(this.f30536o.m57938r().mo20547a(m33893b()), this.f30526e.width() / 2.0f);
        if (this.f30536o.m57942v(m33893b())) {
            this.f30526e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f30526e, fMin, fMin, this.f30523b);
        }
    }

    /* renamed from: e */
    public void m33896e(int i, int i2, int i3, int i4) {
        this.f30530i = i;
        this.f30531j = i2;
        this.f30532k = i3;
        this.f30533l = i4;
    }

    /* renamed from: f */
    public void m33897f(ykf ykfVar) {
        this.f30536o = ykfVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f30528g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30529h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f30536o.m57942v(m33893b())) {
            outline.setRoundRect(getBounds(), this.f30536o.m57938r().mo20547a(m33893b()));
        } else {
            copyBounds(this.f30525d);
            this.f30526e.set(this.f30525d);
            this.f30522a.m59555d(this.f30536o, 1.0f, this.f30526e, this.f30524c);
            xy5.m56953l(outline, this.f30524c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f30536o.m57942v(m33893b())) {
            return true;
        }
        int iRound = Math.round(this.f30529h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f30537p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f30535n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f30537p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f30534m)) != this.f30534m) {
            this.f30535n = true;
            this.f30534m = colorForState;
        }
        if (this.f30535n) {
            invalidateSelf();
        }
        return this.f30535n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f30523b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30523b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
