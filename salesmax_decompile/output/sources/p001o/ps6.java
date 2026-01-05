package p001o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class ps6 extends Drawable {

    /* renamed from: a */
    public final Drawable f40472a;

    /* renamed from: b */
    public final Drawable f40473b;

    /* renamed from: c */
    public final float[] f40474c;

    /* renamed from: d */
    public float f40475d;

    /* renamed from: o.ps6$b */
    public static class C16172b extends Drawable {
        public C16172b() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public ps6(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new C16172b();
        this.f40472a = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new C16172b();
        this.f40473b = drawableMutate2;
        int iM27732f = drawable != null ? fy5.m27732f(drawable) : 3;
        int iM27732f2 = drawable2 != null ? fy5.m27732f(drawable2) : 3;
        fy5.m27739m(drawableMutate, iM27732f);
        fy5.m27739m(drawableMutate2, iM27732f2);
        drawableMutate2.setAlpha(0);
        this.f40474c = new float[2];
    }

    /* renamed from: a */
    public void m44104a(float f) {
        if (this.f40475d != f) {
            this.f40475d = f;
            ss6.m48834a(f, this.f40474c);
            this.f40472a.setAlpha((int) (this.f40474c[0] * 255.0f));
            this.f40473b.setAlpha((int) (this.f40474c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f40472a.draw(canvas);
        this.f40473b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f40472a.getIntrinsicHeight(), this.f40473b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f40472a.getIntrinsicWidth(), this.f40473b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f40472a.getMinimumHeight(), this.f40473b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f40472a.getMinimumWidth(), this.f40473b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f40472a.isStateful() || this.f40473b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f40475d <= 0.5f) {
            this.f40472a.setAlpha(i);
            this.f40473b.setAlpha(0);
        } else {
            this.f40472a.setAlpha(0);
            this.f40473b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f40472a.setBounds(i, i2, i3, i4);
        this.f40473b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f40472a.setColorFilter(colorFilter);
        this.f40473b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f40472a.setState(iArr) || this.f40473b.setState(iArr);
    }
}
