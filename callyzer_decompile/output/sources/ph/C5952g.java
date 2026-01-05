package ph;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.BitSet;
import java.util.Objects;
import kh.C4077a;
import l4.d0;
import lv.C4531c;
import mb.o3;
import oh.C5386a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.m6;
import u5.AbstractC7339a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ph.g */
/* loaded from: classes.dex */
public class C5952g extends Drawable implements InterfaceC5965t {

    /* renamed from: z */
    public static final Paint f29151z = new Paint(1);

    /* renamed from: a */
    public C5951f f29152a;

    /* renamed from: b */
    public final AbstractC5963r[] f29153b;

    /* renamed from: c */
    public final AbstractC5963r[] f29154c;

    /* renamed from: d */
    public final BitSet f29155d;

    /* renamed from: e */
    public boolean f29156e;

    /* renamed from: f */
    public final Matrix f29157f;

    /* renamed from: g */
    public final Path f29158g;

    /* renamed from: h */
    public final Path f29159h;

    /* renamed from: j */
    public final RectF f29160j;

    /* renamed from: k */
    public final RectF f29161k;

    /* renamed from: l */
    public final Region f29162l;

    /* renamed from: m */
    public final Region f29163m;

    /* renamed from: n */
    public C5955j f29164n;

    /* renamed from: p */
    public final Paint f29165p;

    /* renamed from: q */
    public final Paint f29166q;

    /* renamed from: r */
    public final C5386a f29167r;

    /* renamed from: s */
    public final d0 f29168s;

    /* renamed from: t */
    public final C4531c f29169t;

    /* renamed from: v */
    public PorterDuffColorFilter f29170v;

    /* renamed from: w */
    public PorterDuffColorFilter f29171w;

    /* renamed from: x */
    public final RectF f29172x;

    /* renamed from: y */
    public final boolean f29173y;

    public C5952g() {
        this(new C5955j());
    }

    /* renamed from: a */
    public final void m11980a(RectF rectF, Path path) {
        C5951f c5951f = this.f29152a;
        this.f29169t.m9377a(c5951f.f29135a, c5951f.f29143i, rectF, this.f29168s, path);
        if (this.f29152a.f29142h != 1.0f) {
            Matrix matrix = this.f29157f;
            matrix.reset();
            float f6 = this.f29152a.f29142h;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f29172x, true);
    }

    /* renamed from: b */
    public final int m11981b(int i10) {
        C5951f c5951f = this.f29152a;
        float f6 = c5951f.f29147m;
        float fMin = DefinitionKt.NO_Float_VALUE;
        float f10 = f6 + DefinitionKt.NO_Float_VALUE + c5951f.f29146l;
        C4077a c4077a = c5951f.f29136b;
        if (c4077a == null || !c4077a.f20947a || AbstractC7339a.m13734d(i10, 255) != c4077a.f20949c) {
            return i10;
        }
        if (c4077a.f20950d > DefinitionKt.NO_Float_VALUE && f10 > DefinitionKt.NO_Float_VALUE) {
            fMin = Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return AbstractC7339a.m13734d(m6.m11787b(fMin, AbstractC7339a.m13734d(i10, 255), c4077a.f20948b), Color.alpha(i10));
    }

    /* renamed from: c */
    public final void m11982c(Canvas canvas) {
        this.f29155d.cardinality();
        int i10 = this.f29152a.f29149o;
        Path path = this.f29158g;
        C5386a c5386a = this.f29167r;
        if (i10 != 0) {
            canvas.drawPath(path, c5386a.f27053a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            AbstractC5963r abstractC5963r = this.f29153b[i11];
            int i12 = this.f29152a.f29148n;
            Matrix matrix = AbstractC5963r.f29204a;
            abstractC5963r.mo11997a(matrix, c5386a, i12, canvas);
            this.f29154c[i11].mo11997a(matrix, c5386a, this.f29152a.f29148n, canvas);
        }
        if (this.f29173y) {
            double d2 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d2)) * this.f29152a.f29149o);
            int iCos = (int) (Math.cos(Math.toRadians(d2)) * this.f29152a.f29149o);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f29151z);
            canvas.translate(iSin, iCos);
        }
    }

    /* renamed from: d */
    public final void m11983d(Canvas canvas, Paint paint, Path path, C5955j c5955j, RectF rectF) {
        if (!c5955j.m11995d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo11975a = c5955j.f29180f.mo11975a(rectF) * this.f29152a.f29143i;
            canvas.drawRoundRect(rectF, fMo11975a, fMo11975a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f29170v;
        Paint paint2 = this.f29165p;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i10 = this.f29152a.f29145k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29171w;
        Paint paint3 = this.f29166q;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f29152a.f29144j);
        int alpha2 = paint3.getAlpha();
        int i11 = this.f29152a.f29145k;
        paint3.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z6 = this.f29156e;
        RectF rectF2 = this.f29161k;
        float strokeWidth = DefinitionKt.NO_Float_VALUE;
        Path path = this.f29159h;
        Path path2 = this.f29158g;
        if (z6) {
            float f6 = -(m11985f() ? paint3.getStrokeWidth() / 2.0f : 0.0f);
            C5955j c5955j = this.f29152a.f29135a;
            o3 o3VarM11996e = c5955j.m11996e();
            InterfaceC5948c c5947b = c5955j.f29179e;
            if (!(c5947b instanceof C5953h)) {
                c5947b = new C5947b(f6, c5947b);
            }
            o3VarM11996e.f23376e = c5947b;
            InterfaceC5948c c5947b2 = c5955j.f29180f;
            if (!(c5947b2 instanceof C5953h)) {
                c5947b2 = new C5947b(f6, c5947b2);
            }
            o3VarM11996e.f23377f = c5947b2;
            InterfaceC5948c c5947b3 = c5955j.f29182h;
            if (!(c5947b3 instanceof C5953h)) {
                c5947b3 = new C5947b(f6, c5947b3);
            }
            o3VarM11996e.f23379h = c5947b3;
            InterfaceC5948c c5947b4 = c5955j.f29181g;
            if (!(c5947b4 instanceof C5953h)) {
                c5947b4 = new C5947b(f6, c5947b4);
            }
            o3VarM11996e.f23378g = c5947b4;
            C5955j c5955jM9582a = o3VarM11996e.m9582a();
            this.f29164n = c5955jM9582a;
            float f10 = this.f29152a.f29143i;
            rectF2.set(m11984e());
            float strokeWidth2 = m11985f() ? paint3.getStrokeWidth() / 2.0f : 0.0f;
            rectF2.inset(strokeWidth2, strokeWidth2);
            rectF = rectF2;
            this.f29169t.m9377a(c5955jM9582a, f10, rectF, null, path);
            m11980a(m11984e(), path2);
            this.f29156e = false;
        } else {
            rectF = rectF2;
        }
        C5951f c5951f = this.f29152a;
        c5951f.getClass();
        if (c5951f.f29148n > 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (!this.f29152a.f29135a.m11995d(m11984e()) && !path2.isConvex() && i12 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (this.f29152a.f29149o * Math.sin(Math.toRadians(d2))), (int) (Math.cos(Math.toRadians(d2)) * this.f29152a.f29149o));
                if (this.f29173y) {
                    RectF rectF3 = this.f29172x;
                    int iWidth = (int) (rectF3.width() - getBounds().width());
                    int iHeight = (int) (rectF3.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AbstractC5601a.m11230a(this.f29152a.f29148n, 2, (int) rectF3.width(), iWidth), AbstractC5601a.m11230a(this.f29152a.f29148n, 2, (int) rectF3.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f11 = (getBounds().left - this.f29152a.f29148n) - iWidth;
                    float f12 = (getBounds().top - this.f29152a.f29148n) - iHeight;
                    canvas2.translate(-f11, -f12);
                    m11982c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m11982c(canvas);
                    canvas.restore();
                }
            }
        }
        C5951f c5951f2 = this.f29152a;
        Paint.Style style = c5951f2.f29150p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m11983d(canvas, paint2, path2, c5951f2.f29135a, m11984e());
        }
        if (m11985f()) {
            C5955j c5955j2 = this.f29164n;
            rectF.set(m11984e());
            if (m11985f()) {
                strokeWidth = paint3.getStrokeWidth() / 2.0f;
            }
            rectF.inset(strokeWidth, strokeWidth);
            paint = paint3;
            m11983d(canvas, paint, path, c5955j2, rectF);
        } else {
            paint = paint3;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    /* renamed from: e */
    public final RectF m11984e() {
        Rect bounds = getBounds();
        RectF rectF = this.f29160j;
        rectF.set(bounds);
        return rectF;
    }

    /* renamed from: f */
    public final boolean m11985f() {
        Paint.Style style = this.f29152a.f29150p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f29166q.getStrokeWidth() > DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: g */
    public final void m11986g(Context context) {
        this.f29152a.f29136b = new C4077a(context);
        m11991l();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f29152a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f29152a.getClass();
        if (this.f29152a.f29135a.m11995d(m11984e())) {
            outline.setRoundRect(getBounds(), this.f29152a.f29135a.f29179e.mo11975a(m11984e()) * this.f29152a.f29143i);
            return;
        }
        RectF rectFM11984e = m11984e();
        Path path = this.f29158g;
        m11980a(rectFM11984e, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f29152a.f29141g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f29162l;
        region.set(bounds);
        RectF rectFM11984e = m11984e();
        Path path = this.f29158g;
        m11980a(rectFM11984e, path);
        Region region2 = this.f29163m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final void m11987h(float f6) {
        C5951f c5951f = this.f29152a;
        if (c5951f.f29147m != f6) {
            c5951f.f29147m = f6;
            m11991l();
        }
    }

    /* renamed from: i */
    public final void m11988i(ColorStateList colorStateList) {
        C5951f c5951f = this.f29152a;
        if (c5951f.f29137c != colorStateList) {
            c5951f.f29137c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f29156e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f29152a.f29139e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f29152a.getClass();
        ColorStateList colorStateList2 = this.f29152a.f29138d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f29152a.f29137c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* renamed from: j */
    public final boolean m11989j(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f29152a.f29137c == null || color2 == (colorForState2 = this.f29152a.f29137c.getColorForState(iArr, (color2 = (paint2 = this.f29165p).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f29152a.f29138d == null || color == (colorForState = this.f29152a.f29138d.getColorForState(iArr, (color = (paint = this.f29166q).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: k */
    public final boolean m11990k() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29170v;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f29171w;
        C5951f c5951f = this.f29152a;
        ColorStateList colorStateList = c5951f.f29139e;
        PorterDuff.Mode mode = c5951f.f29140f;
        if (colorStateList == null || mode == null) {
            int color = this.f29165p.getColor();
            int iM11981b = m11981b(color);
            porterDuffColorFilter = iM11981b != color ? new PorterDuffColorFilter(iM11981b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m11981b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f29170v = porterDuffColorFilter;
        this.f29152a.getClass();
        this.f29171w = null;
        this.f29152a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f29170v) && Objects.equals(porterDuffColorFilter3, this.f29171w)) ? false : true;
    }

    /* renamed from: l */
    public final void m11991l() {
        C5951f c5951f = this.f29152a;
        float f6 = c5951f.f29147m + DefinitionKt.NO_Float_VALUE;
        c5951f.f29148n = (int) Math.ceil(0.75f * f6);
        this.f29152a.f29149o = (int) Math.ceil(f6 * 0.25f);
        m11990k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        C5951f c5951f = this.f29152a;
        C5951f c5951f2 = new C5951f();
        c5951f2.f29137c = null;
        c5951f2.f29138d = null;
        c5951f2.f29139e = null;
        c5951f2.f29140f = PorterDuff.Mode.SRC_IN;
        c5951f2.f29141g = null;
        c5951f2.f29142h = 1.0f;
        c5951f2.f29143i = 1.0f;
        c5951f2.f29145k = 255;
        c5951f2.f29146l = DefinitionKt.NO_Float_VALUE;
        c5951f2.f29147m = DefinitionKt.NO_Float_VALUE;
        c5951f2.f29148n = 0;
        c5951f2.f29149o = 0;
        c5951f2.f29150p = Paint.Style.FILL_AND_STROKE;
        c5951f2.f29135a = c5951f.f29135a;
        c5951f2.f29136b = c5951f.f29136b;
        c5951f2.f29144j = c5951f.f29144j;
        c5951f2.f29137c = c5951f.f29137c;
        c5951f2.f29138d = c5951f.f29138d;
        c5951f2.f29140f = c5951f.f29140f;
        c5951f2.f29139e = c5951f.f29139e;
        c5951f2.f29145k = c5951f.f29145k;
        c5951f2.f29142h = c5951f.f29142h;
        c5951f2.f29149o = c5951f.f29149o;
        c5951f2.f29143i = c5951f.f29143i;
        c5951f2.f29146l = c5951f.f29146l;
        c5951f2.f29147m = c5951f.f29147m;
        c5951f2.f29148n = c5951f.f29148n;
        c5951f2.f29150p = c5951f.f29150p;
        if (c5951f.f29141g != null) {
            c5951f2.f29141g = new Rect(c5951f.f29141g);
        }
        this.f29152a = c5951f2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f29156e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z6 = m11989j(iArr) || m11990k();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        C5951f c5951f = this.f29152a;
        if (c5951f.f29145k != i10) {
            c5951f.f29145k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29152a.getClass();
        super.invalidateSelf();
    }

    @Override // ph.InterfaceC5965t
    public final void setShapeAppearanceModel(C5955j c5955j) {
        this.f29152a.f29135a = c5955j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f29152a.f29139e = colorStateList;
        m11990k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C5951f c5951f = this.f29152a;
        if (c5951f.f29140f != mode) {
            c5951f.f29140f = mode;
            m11990k();
            super.invalidateSelf();
        }
    }

    public C5952g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C5955j.m11993b(context, attributeSet, i10, i11).m9582a());
    }

    public C5952g(C5955j c5955j) {
        C5951f c5951f = new C5951f();
        c5951f.f29137c = null;
        c5951f.f29138d = null;
        c5951f.f29139e = null;
        c5951f.f29140f = PorterDuff.Mode.SRC_IN;
        c5951f.f29141g = null;
        c5951f.f29142h = 1.0f;
        c5951f.f29143i = 1.0f;
        c5951f.f29145k = 255;
        c5951f.f29146l = DefinitionKt.NO_Float_VALUE;
        c5951f.f29147m = DefinitionKt.NO_Float_VALUE;
        c5951f.f29148n = 0;
        c5951f.f29149o = 0;
        c5951f.f29150p = Paint.Style.FILL_AND_STROKE;
        c5951f.f29135a = c5955j;
        c5951f.f29136b = null;
        this(c5951f);
    }

    public C5952g(C5951f c5951f) {
        C4531c c4531c;
        this.f29153b = new AbstractC5963r[4];
        this.f29154c = new AbstractC5963r[4];
        this.f29155d = new BitSet(8);
        this.f29157f = new Matrix();
        this.f29158g = new Path();
        this.f29159h = new Path();
        this.f29160j = new RectF();
        this.f29161k = new RectF();
        this.f29162l = new Region();
        this.f29163m = new Region();
        Paint paint = new Paint(1);
        this.f29165p = paint;
        Paint paint2 = new Paint(1);
        this.f29166q = paint2;
        this.f29167r = new C5386a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c4531c = AbstractC5956k.f29187a;
        } else {
            c4531c = new C4531c();
        }
        this.f29169t = c4531c;
        this.f29172x = new RectF();
        this.f29173y = true;
        this.f29152a = c5951f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f29151z;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m11990k();
        m11989j(getState());
        this.f29168s = new d0(12, this);
    }
}
