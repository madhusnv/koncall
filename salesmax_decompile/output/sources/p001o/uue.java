package p001o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class uue extends Drawable {

    /* renamed from: a */
    public float f49505a;

    /* renamed from: c */
    public final RectF f49507c;

    /* renamed from: d */
    public final Rect f49508d;

    /* renamed from: e */
    public float f49509e;

    /* renamed from: h */
    public ColorStateList f49512h;

    /* renamed from: i */
    public PorterDuffColorFilter f49513i;

    /* renamed from: j */
    public ColorStateList f49514j;

    /* renamed from: f */
    public boolean f49510f = false;

    /* renamed from: g */
    public boolean f49511g = true;

    /* renamed from: k */
    public PorterDuff.Mode f49515k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f49506b = new Paint(5);

    public uue(ColorStateList colorStateList, float f) {
        this.f49505a = f;
        m52036e(colorStateList);
        this.f49507c = new RectF();
        this.f49508d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m52032a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList m52033b() {
        return this.f49512h;
    }

    /* renamed from: c */
    public float m52034c() {
        return this.f49509e;
    }

    /* renamed from: d */
    public float m52035d() {
        return this.f49505a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f49506b;
        if (this.f49513i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f49513i);
            z = true;
        }
        RectF rectF = this.f49507c;
        float f = this.f49505a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: e */
    public final void m52036e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f49512h = colorStateList;
        this.f49506b.setColor(colorStateList.getColorForState(getState(), this.f49512h.getDefaultColor()));
    }

    /* renamed from: f */
    public void m52037f(ColorStateList colorStateList) {
        m52036e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m52038g(float f, boolean z, boolean z2) {
        if (f == this.f49509e && this.f49510f == z && this.f49511g == z2) {
            return;
        }
        this.f49509e = f;
        this.f49510f = z;
        this.f49511g = z2;
        m52040i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f49508d, this.f49505a);
    }

    /* renamed from: h */
    public void m52039h(float f) {
        if (f == this.f49505a) {
            return;
        }
        this.f49505a = f;
        m52040i(null);
        invalidateSelf();
    }

    /* renamed from: i */
    public final void m52040i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f49507c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f49508d.set(rect);
        if (this.f49510f) {
            this.f49508d.inset((int) Math.ceil(vue.m53455a(this.f49509e, this.f49505a, this.f49511g)), (int) Math.ceil(vue.m53456b(this.f49509e, this.f49505a, this.f49511g)));
            this.f49507c.set(this.f49508d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f49514j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f49512h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m52040i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f49512h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f49506b.getColor();
        if (z) {
            this.f49506b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f49514j;
        if (colorStateList2 == null || (mode = this.f49515k) == null) {
            return z;
        }
        this.f49513i = m52032a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f49506b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f49506b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f49514j = colorStateList;
        this.f49513i = m52032a(colorStateList, this.f49515k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f49515k = mode;
        this.f49513i = m52032a(this.f49514j, mode);
        invalidateSelf();
    }
}
