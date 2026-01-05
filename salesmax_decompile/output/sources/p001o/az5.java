package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class az5 extends Drawable {

    /* renamed from: m */
    public static final float f15389m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f15390a;

    /* renamed from: b */
    public float f15391b;

    /* renamed from: c */
    public float f15392c;

    /* renamed from: d */
    public float f15393d;

    /* renamed from: e */
    public float f15394e;

    /* renamed from: f */
    public boolean f15395f;

    /* renamed from: g */
    public final Path f15396g;

    /* renamed from: h */
    public final int f15397h;

    /* renamed from: i */
    public boolean f15398i;

    /* renamed from: j */
    public float f15399j;

    /* renamed from: k */
    public float f15400k;

    /* renamed from: l */
    public int f15401l;

    public az5(Context context) {
        Paint paint = new Paint();
        this.f15390a = paint;
        this.f15396g = new Path();
        this.f15398i = false;
        this.f15401l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, bbe.DrawerArrowToggle, z5e.drawerArrowStyle, iae.Base_Widget_AppCompat_DrawerArrowToggle);
        m18033d(typedArrayObtainStyledAttributes.getColor(bbe.DrawerArrowToggle_color, 0));
        m18032c(typedArrayObtainStyledAttributes.getDimension(bbe.DrawerArrowToggle_thickness, 0.0f));
        m18035f(typedArrayObtainStyledAttributes.getBoolean(bbe.DrawerArrowToggle_spinBars, true));
        m18034e(Math.round(typedArrayObtainStyledAttributes.getDimension(bbe.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f15397h = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.DrawerArrowToggle_drawableSize, 0);
        this.f15392c = Math.round(typedArrayObtainStyledAttributes.getDimension(bbe.DrawerArrowToggle_barLength, 0.0f));
        this.f15391b = Math.round(typedArrayObtainStyledAttributes.getDimension(bbe.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f15393d = typedArrayObtainStyledAttributes.getDimension(bbe.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static float m18030b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public float m18031a() {
        return this.f15399j;
    }

    /* renamed from: c */
    public void m18032c(float f) {
        if (this.f15390a.getStrokeWidth() != f) {
            this.f15390a.setStrokeWidth(f);
            this.f15400k = (float) ((f / 2.0f) * Math.cos(f15389m));
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void m18033d(int i) {
        if (i != this.f15390a.getColor()) {
            this.f15390a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f15401l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? fy5.m27732f(this) == 0 : fy5.m27732f(this) == 1))) {
            z = true;
        }
        float f = this.f15391b;
        float fM18030b = m18030b(this.f15392c, (float) Math.sqrt(f * f * 2.0f), this.f15399j);
        float fM18030b2 = m18030b(this.f15392c, this.f15393d, this.f15399j);
        float fRound = Math.round(m18030b(0.0f, this.f15400k, this.f15399j));
        float fM18030b3 = m18030b(0.0f, f15389m, this.f15399j);
        float fM18030b4 = m18030b(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f15399j);
        double d = fM18030b;
        double d2 = fM18030b3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f15396g.rewind();
        float fM18030b5 = m18030b(this.f15394e + this.f15390a.getStrokeWidth(), -this.f15400k, this.f15399j);
        float f2 = (-fM18030b2) / 2.0f;
        this.f15396g.moveTo(f2 + fRound, 0.0f);
        this.f15396g.rLineTo(fM18030b2 - (fRound * 2.0f), 0.0f);
        this.f15396g.moveTo(f2, fM18030b5);
        this.f15396g.rLineTo(fRound2, fRound3);
        this.f15396g.moveTo(f2, -fM18030b5);
        this.f15396g.rLineTo(fRound2, -fRound3);
        this.f15396g.close();
        canvas.save();
        float strokeWidth = this.f15390a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f15394e);
        if (this.f15395f) {
            canvas.rotate(fM18030b4 * (this.f15398i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f15396g, this.f15390a);
        canvas.restore();
    }

    /* renamed from: e */
    public void m18034e(float f) {
        if (f != this.f15394e) {
            this.f15394e = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void m18035f(boolean z) {
        if (this.f15395f != z) {
            this.f15395f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15397h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15397h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f15390a.getAlpha()) {
            this.f15390a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15390a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.f15399j != f) {
            this.f15399j = f;
            invalidateSelf();
        }
    }
}
