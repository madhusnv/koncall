package p010l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import i0.m0;
import p009j.AbstractC3500a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C4300a extends Drawable {

    /* renamed from: l */
    public static final float f21709l = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f21710a;

    /* renamed from: b */
    public final float f21711b;

    /* renamed from: c */
    public final float f21712c;

    /* renamed from: d */
    public final float f21713d;

    /* renamed from: e */
    public final float f21714e;

    /* renamed from: f */
    public final boolean f21715f;

    /* renamed from: g */
    public final Path f21716g;

    /* renamed from: h */
    public final int f21717h;

    /* renamed from: i */
    public float f21718i;

    /* renamed from: j */
    public final float f21719j;

    /* renamed from: k */
    public final int f21720k;

    public C4300a(Context context) {
        Paint paint = new Paint();
        this.f21710a = paint;
        this.f21716g = new Path();
        this.f21720k = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC3500a.f18354k, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, DefinitionKt.NO_Float_VALUE);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f21719j = (float) (Math.cos(f21709l) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f21715f != z6) {
            this.f21715f = z6;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, DefinitionKt.NO_Float_VALUE));
        if (fRound != this.f21714e) {
            this.f21714e = fRound;
            invalidateSelf();
        }
        this.f21717h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f21712c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, DefinitionKt.NO_Float_VALUE));
        this.f21711b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, DefinitionKt.NO_Float_VALUE));
        this.f21713d = typedArrayObtainStyledAttributes.getDimension(1, DefinitionKt.NO_Float_VALUE);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static float m9023a(float f6, float f10, float f11) {
        return m0.m7368a(f10, f6, f11, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z6 = false;
        int i10 = this.f21720k;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z6 = true;
        }
        float f6 = this.f21711b;
        float fSqrt = (float) Math.sqrt(f6 * f6 * 2.0f);
        float f10 = this.f21718i;
        float f11 = this.f21712c;
        float fM9023a = m9023a(f11, fSqrt, f10);
        float fM9023a2 = m9023a(f11, this.f21713d, this.f21718i);
        float fRound = Math.round(m9023a(DefinitionKt.NO_Float_VALUE, this.f21719j, this.f21718i));
        float fM9023a3 = m9023a(DefinitionKt.NO_Float_VALUE, f21709l, this.f21718i);
        float fM9023a4 = m9023a(z6 ? 0.0f : -180.0f, z6 ? 180.0f : 0.0f, this.f21718i);
        double d2 = fM9023a;
        double d10 = fM9023a3;
        float fRound2 = Math.round(Math.cos(d10) * d2);
        float fRound3 = Math.round(Math.sin(d10) * d2);
        Path path = this.f21716g;
        path.rewind();
        float f12 = this.f21714e;
        Paint paint = this.f21710a;
        float fM9023a5 = m9023a(f12 + paint.getStrokeWidth(), -this.f21719j, this.f21718i);
        float f13 = (-fM9023a2) / 2.0f;
        path.moveTo(f13 + fRound, DefinitionKt.NO_Float_VALUE);
        path.rLineTo(fM9023a2 - (fRound * 2.0f), DefinitionKt.NO_Float_VALUE);
        path.moveTo(f13, fM9023a5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f13, -fM9023a5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f21714e + ((((int) (fHeight - (r7 * 2.0f))) / 4) * 2));
        if (this.f21715f) {
            canvas.rotate(fM9023a4 * (z6 ? -1 : 1));
        } else if (z6) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21717h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21717h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f21710a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21710a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f6) {
        if (this.f21718i != f6) {
            this.f21718i = f6;
            invalidateSelf();
        }
    }
}
