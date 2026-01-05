package p001o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import com.google.firebase.perf.util.Constants;
import java.util.BitSet;
import p001o.klf;
import p001o.ykf;
import p001o.zkf;

/* loaded from: classes3.dex */
public class zya extends Drawable implements rlf {
    public static final ykf s0 = ykf.m57921a().m57973q(0, 0.0f).m57970m();
    public static final Paint t0;
    public static final C18730d[] u0;

    /* renamed from: H */
    public final Region f57865H;

    /* renamed from: L */
    public final Region f57866L;

    /* renamed from: M */
    public final Paint f57867M;

    /* renamed from: Q */
    public final Paint f57868Q;

    /* renamed from: X */
    public final ukf f57869X;

    /* renamed from: Y */
    public final zkf.InterfaceC18677b f57870Y;

    /* renamed from: Z */
    public final zkf f57871Z;

    /* renamed from: a */
    public final ykf.InterfaceC18427c f57872a;

    /* renamed from: b */
    public C18729c f57873b;

    /* renamed from: c */
    public final klf.AbstractC14866g[] f57874c;

    /* renamed from: d */
    public final klf.AbstractC14866g[] f57875d;

    /* renamed from: e */
    public final BitSet f57876e;

    /* renamed from: f */
    public boolean f57877f;

    /* renamed from: g */
    public boolean f57878g;

    /* renamed from: h */
    public final Matrix f57879h;
    public PorterDuffColorFilter h0;
    public PorterDuffColorFilter i0;
    public int j0;
    public final RectF k0;
    public boolean l0;
    public boolean m0;
    public ykf n0;
    public z0g o0;
    public y0g[] p0;

    /* renamed from: q */
    public final Path f57880q;
    public float[] q0;
    public float[] r0;

    /* renamed from: s */
    public final Path f57881s;

    /* renamed from: x */
    public final RectF f57882x;

    /* renamed from: y */
    public final RectF f57883y;

    /* renamed from: o.zya$a */
    public class C18727a implements ykf.InterfaceC18427c {
        public C18727a() {
        }

        @Override // p001o.ykf.InterfaceC18427c
        /* renamed from: a */
        public n74 mo17823a(n74 n74Var) {
            return n74Var instanceof whe ? n74Var : new x60(-zya.this.m60105K(), n74Var);
        }
    }

    /* renamed from: o.zya$b */
    public class C18728b implements zkf.InterfaceC18677b {
        public C18728b() {
        }

        @Override // p001o.zkf.InterfaceC18677b
        /* renamed from: a */
        public void mo59566a(klf klfVar, Matrix matrix, int i) {
            zya.this.f57876e.set(i, klfVar.m35845e());
            zya.this.f57874c[i] = klfVar.m35846f(matrix);
        }

        @Override // p001o.zkf.InterfaceC18677b
        /* renamed from: b */
        public void mo59567b(klf klfVar, Matrix matrix, int i) {
            zya.this.f57876e.set(i + 4, klfVar.m35845e());
            zya.this.f57875d[i] = klfVar.m35846f(matrix);
        }
    }

    /* renamed from: o.zya$d */
    public static class C18730d extends l37 {

        /* renamed from: b */
        public final int f57909b;

        public C18730d(int i) {
            super("cornerSizeAtIndex" + i);
            this.f57909b = i;
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(zya zyaVar) {
            if (zyaVar.q0 != null) {
                return zyaVar.q0[this.f57909b];
            }
            return 0.0f;
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(zya zyaVar, float f) {
            if (zyaVar.q0 != null) {
                zyaVar.q0[this.f57909b] = f;
                zyaVar.invalidateSelf();
            }
        }
    }

    static {
        int i = 0;
        Paint paint = new Paint(1);
        t0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        u0 = new C18730d[4];
        while (true) {
            C18730d[] c18730dArr = u0;
            if (i >= c18730dArr.length) {
                return;
            }
            c18730dArr[i] = new C18730d(i);
            i++;
        }
    }

    public zya() {
        this(new ykf());
    }

    /* renamed from: Z */
    public static int m60086Z(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: q */
    public static zya m60094q(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(gua.m29504c(context, x5e.colorSurface, zya.class.getSimpleName()));
        }
        zya zyaVar = new zya();
        zyaVar.m60115U(context);
        zyaVar.g0(colorStateList);
        zyaVar.f0(f);
        return zyaVar;
    }

    /* renamed from: A */
    public float m60095A() {
        return this.f57873b.f57901p;
    }

    /* renamed from: B */
    public ColorStateList m60096B() {
        return this.f57873b.f57890e;
    }

    /* renamed from: C */
    public float m60097C() {
        return this.f57873b.f57897l;
    }

    /* renamed from: D */
    public float m60098D() {
        return this.f57873b.f57900o;
    }

    /* renamed from: E */
    public int m60099E() {
        return this.j0;
    }

    /* renamed from: F */
    public int m60100F() {
        C18729c c18729c = this.f57873b;
        return (int) (c18729c.f57905t * Math.sin(Math.toRadians(c18729c.f57906u)));
    }

    /* renamed from: G */
    public int m60101G() {
        C18729c c18729c = this.f57873b;
        return (int) (c18729c.f57905t * Math.cos(Math.toRadians(c18729c.f57906u)));
    }

    /* renamed from: H */
    public int m60102H() {
        return this.f57873b.f57904s;
    }

    /* renamed from: I */
    public ykf m60103I() {
        return this.f57873b.f57886a;
    }

    /* renamed from: J */
    public ColorStateList m60104J() {
        return this.f57873b.f57891f;
    }

    /* renamed from: K */
    public final float m60105K() {
        if (m60114T()) {
            return this.f57868Q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: L */
    public float m60106L() {
        return this.f57873b.f57898m;
    }

    /* renamed from: M */
    public ColorStateList m60107M() {
        return this.f57873b.f57893h;
    }

    /* renamed from: N */
    public float m60108N() {
        float[] fArr = this.q0;
        return fArr != null ? fArr[3] : this.f57873b.f57886a.m57938r().mo20547a(m60134y());
    }

    /* renamed from: O */
    public float m60109O() {
        float[] fArr = this.q0;
        return fArr != null ? fArr[0] : this.f57873b.f57886a.m57940t().mo20547a(m60134y());
    }

    /* renamed from: P */
    public float m60110P() {
        return this.f57873b.f57902q;
    }

    /* renamed from: Q */
    public float m60111Q() {
        return m60095A() + m60110P();
    }

    /* renamed from: R */
    public final boolean m60112R() {
        C18729c c18729c = this.f57873b;
        int i = c18729c.f57903r;
        return i != 1 && c18729c.f57904s > 0 && (i == 2 || b0());
    }

    /* renamed from: S */
    public final boolean m60113S() {
        Paint.Style style = this.f57873b.f57908w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: T */
    public final boolean m60114T() {
        Paint.Style style = this.f57873b.f57908w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f57868Q.getStrokeWidth() > 0.0f;
    }

    /* renamed from: U */
    public void m60115U(Context context) {
        this.f57873b.f57888c = new o46(context);
        y0();
    }

    /* renamed from: V */
    public final void m60116V() {
        super.invalidateSelf();
    }

    /* renamed from: W */
    public boolean m60117W() {
        o46 o46Var = this.f57873b.f57888c;
        return o46Var != null && o46Var.m41516e();
    }

    /* renamed from: X */
    public boolean m60118X() {
        float[] fArr;
        return this.f57873b.f57886a.m57942v(m60134y()) || ((fArr = this.q0) != null && oza.m42802a(fArr) && this.f57873b.f57886a.m57941u());
    }

    /* renamed from: Y */
    public final void m60119Y(Canvas canvas) {
        if (m60112R()) {
            canvas.save();
            a0(canvas);
            if (!this.l0) {
                m60128r(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.k0.width() - getBounds().width());
            int iHeight = (int) (this.k0.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.k0.width()) + (this.f57873b.f57904s * 2) + iWidth, ((int) this.k0.height()) + (this.f57873b.f57904s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.f57873b.f57904s) - iWidth;
            float f2 = (getBounds().top - this.f57873b.f57904s) - iHeight;
            canvas2.translate(-f, -f2);
            m60128r(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void a0(Canvas canvas) {
        canvas.translate(m60100F(), m60101G());
    }

    public boolean b0() {
        return (m60118X() || this.f57880q.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void c0(float f) {
        setShapeAppearanceModel(this.f57873b.f57886a.m57944x(f));
    }

    public void d0(n74 n74Var) {
        setShapeAppearanceModel(this.f57873b.f57886a.m57945y(n74Var));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f57867M.setColorFilter(this.h0);
        int alpha = this.f57867M.getAlpha();
        this.f57867M.setAlpha(m60086Z(alpha, this.f57873b.f57899n));
        this.f57868Q.setColorFilter(this.i0);
        this.f57868Q.setStrokeWidth(this.f57873b.f57898m);
        int alpha2 = this.f57868Q.getAlpha();
        this.f57868Q.setAlpha(m60086Z(alpha2, this.f57873b.f57899n));
        if (m60113S()) {
            if (this.f57877f) {
                m60121j(m60134y(), this.f57880q);
                this.f57877f = false;
            }
            m60119Y(canvas);
            m60129s(canvas);
        }
        if (m60114T()) {
            if (this.f57878g) {
                m60124m();
                this.f57878g = false;
            }
            mo28947v(canvas);
        }
        this.f57867M.setAlpha(alpha);
        this.f57868Q.setAlpha(alpha2);
    }

    public void e0(z0g z0gVar) {
        if (this.o0 == z0gVar) {
            return;
        }
        this.o0 = z0gVar;
        int i = 0;
        while (true) {
            y0g[] y0gVarArr = this.p0;
            if (i >= y0gVarArr.length) {
                v0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (y0gVarArr[i] == null) {
                    y0gVarArr[i] = new y0g(this, u0[i]);
                }
                this.p0[i].m57093w(new z0g().m58630f(z0gVar.m58625a()).m58632h(z0gVar.m58627c()));
                i++;
            }
        }
    }

    public void f0(float f) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57901p != f) {
            c18729c.f57901p = f;
            y0();
        }
    }

    public void g0(ColorStateList colorStateList) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57890e != colorStateList) {
            c18729c.f57890e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f57873b.f57899n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f57873b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f57873b.f57903r == 2) {
            return;
        }
        RectF rectFM60134y = m60134y();
        if (rectFM60134y.isEmpty()) {
            return;
        }
        float fM60123l = m60123l(rectFM60134y, this.f57873b.f57886a, this.q0);
        if (fM60123l >= 0.0f) {
            outline.setRoundRect(getBounds(), fM60123l * this.f57873b.f57897l);
            return;
        }
        if (this.f57877f) {
            m60121j(rectFM60134y, this.f57880q);
            this.f57877f = false;
        }
        xy5.m56953l(outline, this.f57880q);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f57873b.f57895j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f57865H.set(getBounds());
        m60121j(m60134y(), this.f57880q);
        this.f57866L.setPath(this.f57880q, this.f57865H);
        this.f57865H.op(this.f57866L, Region.Op.DIFFERENCE);
        return this.f57865H;
    }

    public void h0(float f) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57897l != f) {
            c18729c.f57897l = f;
            this.f57877f = true;
            this.f57878g = true;
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public final PorterDuffColorFilter m60120i(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iM60127p = m60127p(color);
        this.j0 = iM60127p;
        if (iM60127p != color) {
            return new PorterDuffColorFilter(iM60127p, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void i0(int i, int i2, int i3, int i4) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57895j == null) {
            c18729c.f57895j = new Rect();
        }
        this.f57873b.f57895j.set(i, i2, i3, i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f57877f = true;
        this.f57878g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        w4g w4gVar;
        return super.isStateful() || ((colorStateList = this.f57873b.f57893h) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f57873b.f57892g) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f57873b.f57891f) != null && colorStateList3.isStateful()) || (((colorStateList4 = this.f57873b.f57890e) != null && colorStateList4.isStateful()) || ((w4gVar = this.f57873b.f57887b) != null && w4gVar.m53945f()))));
    }

    /* renamed from: j */
    public final void m60121j(RectF rectF, Path path) {
        m60122k(rectF, path);
        if (this.f57873b.f57896k != 1.0f) {
            this.f57879h.reset();
            Matrix matrix = this.f57879h;
            float f = this.f57873b.f57896k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f57879h);
        }
        path.computeBounds(this.k0, true);
    }

    public void j0(Paint.Style style) {
        this.f57873b.f57908w = style;
        m60116V();
    }

    /* renamed from: k */
    public final void m60122k(RectF rectF, Path path) {
        zkf zkfVar = this.f57871Z;
        C18729c c18729c = this.f57873b;
        zkfVar.m59557f(c18729c.f57886a, this.q0, c18729c.f57897l, rectF, this.f57870Y, path);
    }

    public void k0(float f) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57900o != f) {
            c18729c.f57900o = f;
            y0();
        }
    }

    /* renamed from: l */
    public final float m60123l(RectF rectF, ykf ykfVar, float[] fArr) {
        if (fArr == null) {
            if (ykfVar.m57942v(rectF)) {
                return ykfVar.m57938r().mo20547a(rectF);
            }
            return -1.0f;
        }
        if (oza.m42802a(fArr) && ykfVar.m57941u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public void l0(boolean z) {
        this.l0 = z;
    }

    /* renamed from: m */
    public final void m60124m() {
        w0();
        this.f57871Z.m59557f(this.n0, this.r0, this.f57873b.f57897l, m60135z(), null, this.f57881s);
    }

    public void m0(int i) {
        this.f57869X.m51687d(i);
        this.f57873b.f57907v = false;
        m60116V();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f57873b = new C18729c(this.f57873b);
        return this;
    }

    /* renamed from: n */
    public final PorterDuffColorFilter m60125n(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m60127p(colorForState);
        }
        this.j0 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void n0(int i) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57903r != i) {
            c18729c.f57903r = i;
            m60116V();
        }
    }

    /* renamed from: o */
    public final PorterDuffColorFilter m60126o(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? m60120i(paint, z) : m60125n(colorStateList, mode, z);
    }

    public void o0(w4g w4gVar) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57887b != w4gVar) {
            c18729c.f57887b = w4gVar;
            v0(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f57877f = true;
        this.f57878g = true;
        super.onBoundsChange(rect);
        if (this.f57873b.f57887b != null && !rect.isEmpty()) {
            v0(getState(), this.m0);
        }
        this.m0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, p001o.ygh.InterfaceC18403b
    public boolean onStateChange(int[] iArr) {
        if (this.f57873b.f57887b != null) {
            u0(iArr);
        }
        boolean z = t0(iArr) || x0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public int m60127p(int i) {
        float fM60111Q = m60111Q() + m60098D();
        o46 o46Var = this.f57873b.f57888c;
        return o46Var != null ? o46Var.m41514c(i, fM60111Q) : i;
    }

    public void p0(float f, int i) {
        s0(f);
        r0(ColorStateList.valueOf(i));
    }

    public void q0(float f, ColorStateList colorStateList) {
        s0(f);
        r0(colorStateList);
    }

    /* renamed from: r */
    public final void m60128r(Canvas canvas) {
        this.f57876e.cardinality();
        if (this.f57873b.f57905t != 0) {
            canvas.drawPath(this.f57880q, this.f57869X.m51686c());
        }
        for (int i = 0; i < 4; i++) {
            this.f57874c[i].m35889b(this.f57869X, this.f57873b.f57904s, canvas);
            this.f57875d[i].m35889b(this.f57869X, this.f57873b.f57904s, canvas);
        }
        if (this.l0) {
            int iM60100F = m60100F();
            int iM60101G = m60101G();
            canvas.translate(-iM60100F, -iM60101G);
            canvas.drawPath(this.f57880q, t0);
            canvas.translate(iM60100F, iM60101G);
        }
    }

    public void r0(ColorStateList colorStateList) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57891f != colorStateList) {
            c18729c.f57891f = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: s */
    public final void m60129s(Canvas canvas) {
        m60131u(canvas, this.f57867M, this.f57880q, this.f57873b.f57886a, this.q0, m60134y());
    }

    public void s0(float f) {
        this.f57873b.f57898m = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57899n != i) {
            c18729c.f57899n = i;
            m60116V();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f57873b.f57889d = colorFilter;
        m60116V();
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        C18729c c18729c = this.f57873b;
        c18729c.f57886a = ykfVar;
        c18729c.f57887b = null;
        this.q0 = null;
        this.r0 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f57873b.f57893h = colorStateList;
        x0();
        m60116V();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C18729c c18729c = this.f57873b;
        if (c18729c.f57894i != mode) {
            c18729c.f57894i = mode;
            x0();
            m60116V();
        }
    }

    /* renamed from: t */
    public void m60130t(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m60131u(canvas, paint, path, this.f57873b.f57886a, this.q0, rectF);
    }

    public final boolean t0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f57873b.f57890e == null || color2 == (colorForState2 = this.f57873b.f57890e.getColorForState(iArr, (color2 = this.f57867M.getColor())))) {
            z = false;
        } else {
            this.f57867M.setColor(colorForState2);
            z = true;
        }
        if (this.f57873b.f57891f == null || color == (colorForState = this.f57873b.f57891f.getColorForState(iArr, (color = this.f57868Q.getColor())))) {
            return z;
        }
        this.f57868Q.setColor(colorForState);
        return true;
    }

    /* renamed from: u */
    public final void m60131u(Canvas canvas, Paint paint, Path path, ykf ykfVar, float[] fArr, RectF rectF) {
        float fM60123l = m60123l(rectF, ykfVar, fArr);
        if (fM60123l < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM60123l * this.f57873b.f57897l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void u0(int[] iArr) {
        v0(iArr, false);
    }

    /* renamed from: v */
    public void mo28947v(Canvas canvas) {
        m60131u(canvas, this.f57868Q, this.f57881s, this.n0, this.r0, m60135z());
    }

    public final void v0(int[] iArr, boolean z) {
        RectF rectFM60134y = m60134y();
        if (this.f57873b.f57887b == null || rectFM60134y.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.o0 == null);
        if (this.q0 == null) {
            this.q0 = new float[4];
        }
        ykf ykfVarM53943d = this.f57873b.f57887b.m53943d(iArr);
        for (int i = 0; i < 4; i++) {
            float fMo20547a = this.f57871Z.m59559h(i, ykfVarM53943d).mo20547a(rectFM60134y);
            if (z2) {
                this.q0[i] = fMo20547a;
            }
            y0g y0gVar = this.p0[i];
            if (y0gVar != null) {
                y0gVar.m57089s(fMo20547a);
                if (z2) {
                    this.p0[i].m57094x();
                }
            }
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public float m60132w() {
        float[] fArr = this.q0;
        return fArr != null ? fArr[2] : this.f57873b.f57886a.m57931j().mo20547a(m60134y());
    }

    public final void w0() {
        this.n0 = m60103I().m57946z(this.f57872a);
        float[] fArr = this.q0;
        if (fArr == null) {
            this.r0 = null;
            return;
        }
        if (this.r0 == null) {
            this.r0 = new float[fArr.length];
        }
        float fM60105K = m60105K();
        int i = 0;
        while (true) {
            float[] fArr2 = this.q0;
            if (i >= fArr2.length) {
                return;
            }
            this.r0[i] = Math.max(0.0f, fArr2[i] - fM60105K);
            i++;
        }
    }

    /* renamed from: x */
    public float m60133x() {
        float[] fArr = this.q0;
        return fArr != null ? fArr[1] : this.f57873b.f57886a.m57933l().mo20547a(m60134y());
    }

    public final boolean x0() {
        PorterDuffColorFilter porterDuffColorFilter = this.h0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.i0;
        C18729c c18729c = this.f57873b;
        this.h0 = m60126o(c18729c.f57893h, c18729c.f57894i, this.f57867M, true);
        C18729c c18729c2 = this.f57873b;
        this.i0 = m60126o(c18729c2.f57892g, c18729c2.f57894i, this.f57868Q, false);
        C18729c c18729c3 = this.f57873b;
        if (c18729c3.f57907v) {
            this.f57869X.m51687d(c18729c3.f57893h.getColorForState(getState(), 0));
        }
        return (s6c.m47909a(porterDuffColorFilter, this.h0) && s6c.m47909a(porterDuffColorFilter2, this.i0)) ? false : true;
    }

    /* renamed from: y */
    public RectF m60134y() {
        this.f57882x.set(getBounds());
        return this.f57882x;
    }

    public final void y0() {
        float fM60111Q = m60111Q();
        this.f57873b.f57904s = (int) Math.ceil(0.75f * fM60111Q);
        this.f57873b.f57905t = (int) Math.ceil(fM60111Q * 0.25f);
        x0();
        m60116V();
    }

    /* renamed from: z */
    public final RectF m60135z() {
        this.f57883y.set(m60134y());
        float fM60105K = m60105K();
        this.f57883y.inset(fM60105K, fM60105K);
        return this.f57883y;
    }

    public zya(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ykf.m57925e(context, attributeSet, i, i2).m57970m());
    }

    public zya(ykf ykfVar) {
        this(new C18729c(ykfVar, null));
    }

    public zya(C18729c c18729c) {
        zkf zkfVar;
        this.f57872a = new C18727a();
        this.f57874c = new klf.AbstractC14866g[4];
        this.f57875d = new klf.AbstractC14866g[4];
        this.f57876e = new BitSet(8);
        this.f57879h = new Matrix();
        this.f57880q = new Path();
        this.f57881s = new Path();
        this.f57882x = new RectF();
        this.f57883y = new RectF();
        this.f57865H = new Region();
        this.f57866L = new Region();
        Paint paint = new Paint(1);
        this.f57867M = paint;
        Paint paint2 = new Paint(1);
        this.f57868Q = paint2;
        this.f57869X = new ukf();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            zkfVar = zkf.m59551l();
        } else {
            zkfVar = new zkf();
        }
        this.f57871Z = zkfVar;
        this.k0 = new RectF();
        this.l0 = true;
        this.m0 = true;
        this.p0 = new y0g[4];
        this.f57873b = c18729c;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        x0();
        t0(getState());
        this.f57870Y = new C18728b();
    }

    /* renamed from: o.zya$c */
    public static class C18729c extends Drawable.ConstantState {

        /* renamed from: a */
        public ykf f57886a;

        /* renamed from: b */
        public w4g f57887b;

        /* renamed from: c */
        public o46 f57888c;

        /* renamed from: d */
        public ColorFilter f57889d;

        /* renamed from: e */
        public ColorStateList f57890e;

        /* renamed from: f */
        public ColorStateList f57891f;

        /* renamed from: g */
        public ColorStateList f57892g;

        /* renamed from: h */
        public ColorStateList f57893h;

        /* renamed from: i */
        public PorterDuff.Mode f57894i;

        /* renamed from: j */
        public Rect f57895j;

        /* renamed from: k */
        public float f57896k;

        /* renamed from: l */
        public float f57897l;

        /* renamed from: m */
        public float f57898m;

        /* renamed from: n */
        public int f57899n;

        /* renamed from: o */
        public float f57900o;

        /* renamed from: p */
        public float f57901p;

        /* renamed from: q */
        public float f57902q;

        /* renamed from: r */
        public int f57903r;

        /* renamed from: s */
        public int f57904s;

        /* renamed from: t */
        public int f57905t;

        /* renamed from: u */
        public int f57906u;

        /* renamed from: v */
        public boolean f57907v;

        /* renamed from: w */
        public Paint.Style f57908w;

        public C18729c(ykf ykfVar, o46 o46Var) {
            this.f57890e = null;
            this.f57891f = null;
            this.f57892g = null;
            this.f57893h = null;
            this.f57894i = PorterDuff.Mode.SRC_IN;
            this.f57895j = null;
            this.f57896k = 1.0f;
            this.f57897l = 1.0f;
            this.f57899n = Constants.MAX_HOST_LENGTH;
            this.f57900o = 0.0f;
            this.f57901p = 0.0f;
            this.f57902q = 0.0f;
            this.f57903r = 0;
            this.f57904s = 0;
            this.f57905t = 0;
            this.f57906u = 0;
            this.f57907v = false;
            this.f57908w = Paint.Style.FILL_AND_STROKE;
            this.f57886a = ykfVar;
            this.f57888c = o46Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            zya zyaVar = new zya(this);
            zyaVar.f57877f = true;
            zyaVar.f57878g = true;
            return zyaVar;
        }

        public C18729c(C18729c c18729c) {
            this.f57890e = null;
            this.f57891f = null;
            this.f57892g = null;
            this.f57893h = null;
            this.f57894i = PorterDuff.Mode.SRC_IN;
            this.f57895j = null;
            this.f57896k = 1.0f;
            this.f57897l = 1.0f;
            this.f57899n = Constants.MAX_HOST_LENGTH;
            this.f57900o = 0.0f;
            this.f57901p = 0.0f;
            this.f57902q = 0.0f;
            this.f57903r = 0;
            this.f57904s = 0;
            this.f57905t = 0;
            this.f57906u = 0;
            this.f57907v = false;
            this.f57908w = Paint.Style.FILL_AND_STROKE;
            this.f57886a = c18729c.f57886a;
            this.f57887b = c18729c.f57887b;
            this.f57888c = c18729c.f57888c;
            this.f57898m = c18729c.f57898m;
            this.f57889d = c18729c.f57889d;
            this.f57890e = c18729c.f57890e;
            this.f57891f = c18729c.f57891f;
            this.f57894i = c18729c.f57894i;
            this.f57893h = c18729c.f57893h;
            this.f57899n = c18729c.f57899n;
            this.f57896k = c18729c.f57896k;
            this.f57905t = c18729c.f57905t;
            this.f57903r = c18729c.f57903r;
            this.f57907v = c18729c.f57907v;
            this.f57897l = c18729c.f57897l;
            this.f57900o = c18729c.f57900o;
            this.f57901p = c18729c.f57901p;
            this.f57902q = c18729c.f57902q;
            this.f57904s = c18729c.f57904s;
            this.f57906u = c18729c.f57906u;
            this.f57892g = c18729c.f57892g;
            this.f57908w = c18729c.f57908w;
            if (c18729c.f57895j != null) {
                this.f57895j = new Rect(c18729c.f57895j);
            }
        }
    }
}
