package hh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import bh.C0660b;
import com.google.android.material.chip.Chip;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l4.d0;
import lh.C4473i;
import lh.InterfaceC4472h;
import lv.C4531c;
import mb.o3;
import mh.C4751d;
import nh.AbstractC5071a;
import ph.C5946a;
import ph.C5951f;
import ph.C5952g;
import ph.C5955j;
import v5.InterfaceC7673a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hh.e */
/* loaded from: classes.dex */
public final class C2928e extends C5952g implements Drawable.Callback, InterfaceC4472h {
    public static final int[] L1 = {R.attr.state_enabled};
    public static final ShapeDrawable M1 = new ShapeDrawable(new OvalShape());
    public ColorFilter A1;

    /* renamed from: B */
    public ColorStateList f15959B;
    public PorterDuffColorFilter B1;

    /* renamed from: C */
    public ColorStateList f15960C;
    public ColorStateList C1;

    /* renamed from: D */
    public float f15961D;
    public PorterDuff.Mode D1;

    /* renamed from: E */
    public float f15962E;
    public int[] E1;

    /* renamed from: F */
    public ColorStateList f15963F;
    public ColorStateList F1;

    /* renamed from: G */
    public float f15964G;
    public WeakReference G1;

    /* renamed from: H */
    public ColorStateList f15965H;
    public TextUtils.TruncateAt H1;

    /* renamed from: I */
    public CharSequence f15966I;
    public boolean I1;
    public int J1;

    /* renamed from: K */
    public boolean f15967K;
    public boolean K1;

    /* renamed from: L */
    public Drawable f15968L;

    /* renamed from: M */
    public ColorStateList f15969M;

    /* renamed from: N */
    public float f15970N;

    /* renamed from: O */
    public boolean f15971O;

    /* renamed from: T */
    public boolean f15972T;

    /* renamed from: V */
    public Drawable f15973V;

    /* renamed from: X */
    public RippleDrawable f15974X;
    public boolean X0;

    /* renamed from: Y */
    public ColorStateList f15975Y;
    public Drawable Y0;

    /* renamed from: Z */
    public float f15976Z;
    public ColorStateList Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0660b f44301a1;

    /* renamed from: b1, reason: collision with root package name */
    public C0660b f44302b1;

    /* renamed from: c1, reason: collision with root package name */
    public float f44303c1;

    /* renamed from: d1, reason: collision with root package name */
    public float f44304d1;

    /* renamed from: e1, reason: collision with root package name */
    public float f44305e1;

    /* renamed from: f1, reason: collision with root package name */
    public float f44306f1;

    /* renamed from: g1, reason: collision with root package name */
    public float f44307g1;

    /* renamed from: h0, reason: collision with root package name */
    public SpannableStringBuilder f44308h0;

    /* renamed from: h1, reason: collision with root package name */
    public float f44309h1;

    /* renamed from: i1, reason: collision with root package name */
    public float f44310i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f44311j1;

    /* renamed from: k1, reason: collision with root package name */
    public final Context f44312k1;

    /* renamed from: l1, reason: collision with root package name */
    public final Paint f44313l1;

    /* renamed from: m1, reason: collision with root package name */
    public final Paint.FontMetrics f44314m1;

    /* renamed from: n1, reason: collision with root package name */
    public final RectF f44315n1;

    /* renamed from: o1, reason: collision with root package name */
    public final PointF f44316o1;

    /* renamed from: p1, reason: collision with root package name */
    public final Path f44317p1;

    /* renamed from: q1, reason: collision with root package name */
    public final C4473i f44318q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f44319r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f44320s1;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f44321t0;

    /* renamed from: t1, reason: collision with root package name */
    public int f44322t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f44323u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f44324v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f44325w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f44326x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f44327y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f44328z1;

    public C2928e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action);
        this.f15962E = -1.0f;
        this.f44313l1 = new Paint(1);
        this.f44314m1 = new Paint.FontMetrics();
        this.f44315n1 = new RectF();
        this.f44316o1 = new PointF();
        this.f44317p1 = new Path();
        this.f44328z1 = 255;
        this.D1 = PorterDuff.Mode.SRC_IN;
        this.G1 = new WeakReference(null);
        m11986g(context);
        this.f44312k1 = context;
        C4473i c4473i = new C4473i(this);
        this.f44318q1 = c4473i;
        this.f15966I = "";
        c4473i.f22292a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = L1;
        setState(iArr);
        if (!Arrays.equals(this.E1, iArr)) {
            this.E1 = iArr;
            if (m7054S()) {
                m7061u(getState(), iArr);
            }
        }
        this.I1 = true;
        M1.setTint(-1);
    }

    /* renamed from: T */
    public static void m7033T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: r */
    public static boolean m7034r(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: s */
    public static boolean m7035s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public final void m7036A(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15968L;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof InterfaceC7673a;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM7057o = m7057o();
            this.f15968L = drawable != null ? drawable.mutate() : null;
            float fM7057o2 = m7057o();
            m7033T(drawable2);
            if (m7053R()) {
                m7055m(this.f15968L);
            }
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: B */
    public final void m7037B(float f6) {
        if (this.f15970N != f6) {
            float fM7057o = m7057o();
            this.f15970N = f6;
            float fM7057o2 = m7057o();
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: C */
    public final void m7038C(ColorStateList colorStateList) {
        this.f15971O = true;
        if (this.f15969M != colorStateList) {
            this.f15969M = colorStateList;
            if (m7053R()) {
                this.f15968L.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: D */
    public final void m7039D(boolean z6) {
        if (this.f15967K != z6) {
            boolean zM7053R = m7053R();
            this.f15967K = z6;
            boolean zM7053R2 = m7053R();
            if (zM7053R != zM7053R2) {
                if (zM7053R2) {
                    m7055m(this.f15968L);
                } else {
                    m7033T(this.f15968L);
                }
                invalidateSelf();
                m7060t();
            }
        }
    }

    /* renamed from: E */
    public final void m7040E(ColorStateList colorStateList) {
        if (this.f15963F != colorStateList) {
            this.f15963F = colorStateList;
            if (this.K1) {
                C5951f c5951f = this.f29152a;
                if (c5951f.f29138d != colorStateList) {
                    c5951f.f29138d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* renamed from: F */
    public final void m7041F(float f6) {
        if (this.f15964G != f6) {
            this.f15964G = f6;
            this.f44313l1.setStrokeWidth(f6);
            if (this.K1) {
                this.f29152a.f29144j = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public final void m7042G(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15973V;
        if (drawable3 != 0) {
            boolean z6 = drawable3 instanceof InterfaceC7673a;
            drawable2 = drawable3;
            if (z6) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fM7058p = m7058p();
            this.f15973V = drawable != null ? drawable.mutate() : null;
            this.f15974X = new RippleDrawable(AbstractC5071a.m10006a(this.f15965H), this.f15973V, M1);
            float fM7058p2 = m7058p();
            m7033T(drawable2);
            if (m7054S()) {
                m7055m(this.f15973V);
            }
            invalidateSelf();
            if (fM7058p != fM7058p2) {
                m7060t();
            }
        }
    }

    /* renamed from: H */
    public final void m7043H(float f6) {
        if (this.f44310i1 != f6) {
            this.f44310i1 = f6;
            invalidateSelf();
            if (m7054S()) {
                m7060t();
            }
        }
    }

    /* renamed from: I */
    public final void m7044I(float f6) {
        if (this.f15976Z != f6) {
            this.f15976Z = f6;
            invalidateSelf();
            if (m7054S()) {
                m7060t();
            }
        }
    }

    /* renamed from: J */
    public final void m7045J(float f6) {
        if (this.f44309h1 != f6) {
            this.f44309h1 = f6;
            invalidateSelf();
            if (m7054S()) {
                m7060t();
            }
        }
    }

    /* renamed from: K */
    public final void m7046K(ColorStateList colorStateList) {
        if (this.f15975Y != colorStateList) {
            this.f15975Y = colorStateList;
            if (m7054S()) {
                this.f15973V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: L */
    public final void m7047L(boolean z6) {
        if (this.f15972T != z6) {
            boolean zM7054S = m7054S();
            this.f15972T = z6;
            boolean zM7054S2 = m7054S();
            if (zM7054S != zM7054S2) {
                if (zM7054S2) {
                    m7055m(this.f15973V);
                } else {
                    m7033T(this.f15973V);
                }
                invalidateSelf();
                m7060t();
            }
        }
    }

    /* renamed from: M */
    public final void m7048M(float f6) {
        if (this.f44305e1 != f6) {
            float fM7057o = m7057o();
            this.f44305e1 = f6;
            float fM7057o2 = m7057o();
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: N */
    public final void m7049N(float f6) {
        if (this.f44304d1 != f6) {
            float fM7057o = m7057o();
            this.f44304d1 = f6;
            float fM7057o2 = m7057o();
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: O */
    public final void m7050O(ColorStateList colorStateList) {
        if (this.f15965H != colorStateList) {
            this.f15965H = colorStateList;
            this.F1 = null;
            onStateChange(getState());
        }
    }

    /* renamed from: P */
    public final void m7051P(C4751d c4751d) {
        C4473i c4473i = this.f44318q1;
        C2924a c2924a = c4473i.f22293b;
        TextPaint textPaint = c4473i.f22292a;
        if (c4473i.f22297f != c4751d) {
            c4473i.f22297f = c4751d;
            if (c4751d != null) {
                Context context = this.f44312k1;
                c4751d.m9660f(context, textPaint, c2924a);
                InterfaceC4472h interfaceC4472h = (InterfaceC4472h) c4473i.f22296e.get();
                if (interfaceC4472h != null) {
                    textPaint.drawableState = interfaceC4472h.getState();
                }
                c4751d.m9659e(context, textPaint, c2924a);
                c4473i.f22295d = true;
            }
            InterfaceC4472h interfaceC4472h2 = (InterfaceC4472h) c4473i.f22296e.get();
            if (interfaceC4472h2 != null) {
                C2928e c2928e = (C2928e) interfaceC4472h2;
                c2928e.m7060t();
                c2928e.invalidateSelf();
                c2928e.onStateChange(interfaceC4472h2.getState());
            }
        }
    }

    /* renamed from: Q */
    public final boolean m7052Q() {
        return this.X0 && this.Y0 != null && this.f44326x1;
    }

    /* renamed from: R */
    public final boolean m7053R() {
        return this.f15967K && this.f15968L != null;
    }

    /* renamed from: S */
    public final boolean m7054S() {
        return this.f15972T && this.f15973V != null;
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float fMeasureText;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.f44328z1) == 0) {
            return;
        }
        if (i10 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z6 = this.K1;
        Paint paint = this.f44313l1;
        RectF rectF = this.f44315n1;
        if (!z6) {
            paint.setColor(this.f44319r1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m7059q(), m7059q(), paint);
        }
        if (!this.K1) {
            paint.setColor(this.f44320s1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.A1;
            if (colorFilter == null) {
                colorFilter = this.B1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m7059q(), m7059q(), paint);
        }
        if (this.K1) {
            super.draw(canvas);
        }
        if (this.f15964G > DefinitionKt.NO_Float_VALUE && !this.K1) {
            paint.setColor(this.f44323u1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.K1) {
                ColorFilter colorFilter2 = this.A1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.B1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = bounds.left;
            float f10 = this.f15964G / 2.0f;
            rectF.set(f6 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
            float f11 = this.f15962E - (this.f15964G / 2.0f);
            canvas2.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setColor(this.f44324v1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.K1) {
            RectF rectF2 = new RectF(bounds);
            C5951f c5951f = this.f29152a;
            C5955j c5955j = c5951f.f29135a;
            float f12 = c5951f.f29143i;
            d0 d0Var = this.f29168s;
            C4531c c4531c = this.f29169t;
            Path path = this.f44317p1;
            c4531c.m9377a(c5955j, f12, rectF2, d0Var, path);
            m11983d(canvas2, paint, path, this.f29152a.f29135a, m11984e());
        } else {
            canvas2.drawRoundRect(rectF, m7059q(), m7059q(), paint);
        }
        if (m7053R()) {
            m7056n(bounds, rectF);
            float f13 = rectF.left;
            float f14 = rectF.top;
            canvas2.translate(f13, f14);
            this.f15968L.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f15968L.draw(canvas2);
            canvas2.translate(-f13, -f14);
        }
        if (m7052Q()) {
            m7056n(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.Y0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Y0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.I1 && this.f15966I != null) {
            PointF pointF = this.f44316o1;
            pointF.set(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f15966I;
            C4473i c4473i = this.f44318q1;
            if (charSequence != null) {
                float fM7057o = m7057o() + this.f44303c1 + this.f44306f1;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM7057o;
                } else {
                    pointF.x = bounds.right - fM7057o;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c4473i.f22292a;
                Paint.FontMetrics fontMetrics = this.f44314m1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f15966I != null) {
                float fM7057o2 = m7057o() + this.f44303c1 + this.f44306f1;
                float fM7058p = m7058p() + this.f44311j1 + this.f44307g1;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM7057o2;
                    rectF.right = bounds.right - fM7058p;
                } else {
                    rectF.left = bounds.left + fM7058p;
                    rectF.right = bounds.right - fM7057o2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C4751d c4751d = c4473i.f22297f;
            TextPaint textPaint2 = c4473i.f22292a;
            if (c4751d != null) {
                textPaint2.drawableState = getState();
                c4473i.f22297f.m9659e(this.f44312k1, textPaint2, c4473i.f22293b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f15966I.toString();
            if (c4473i.f22295d) {
                fMeasureText = string == null ? 0.0f : textPaint2.measureText((CharSequence) string, 0, string.length());
                c4473i.f22294c = fMeasureText;
                c4473i.f22295d = false;
            } else {
                fMeasureText = c4473i.f22294c;
            }
            boolean z10 = Math.round(fMeasureText) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i11 = iSave;
            } else {
                i11 = 0;
            }
            CharSequence charSequenceEllipsize = this.f15966I;
            if (z10 && this.H1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.H1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i11);
            }
        }
        if (m7054S()) {
            rectF.setEmpty();
            if (m7054S()) {
                float f17 = this.f44311j1 + this.f44310i1;
                if (getLayoutDirection() == 0) {
                    float f18 = bounds.right - f17;
                    rectF.right = f18;
                    rectF.left = f18 - this.f15976Z;
                } else {
                    float f19 = bounds.left + f17;
                    rectF.left = f19;
                    rectF.right = f19 + this.f15976Z;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f20 = this.f15976Z;
                float f21 = fExactCenterY - (f20 / 2.0f);
                rectF.top = f21;
                rectF.bottom = f21 + f20;
            }
            float f22 = rectF.left;
            float f23 = rectF.top;
            canvas2.translate(f22, f23);
            this.f15973V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f15974X.setBounds(this.f15973V.getBounds());
            this.f15974X.jumpToCurrentState();
            this.f15974X.draw(canvas2);
            canvas2.translate(-f22, -f23);
        }
        if (this.f44328z1 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f44328z1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f15961D;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float fMeasureText;
        float fM7057o = m7057o() + this.f44303c1 + this.f44306f1;
        String string = this.f15966I.toString();
        C4473i c4473i = this.f44318q1;
        if (c4473i.f22295d) {
            fMeasureText = string == null ? DefinitionKt.NO_Float_VALUE : c4473i.f22292a.measureText((CharSequence) string, 0, string.length());
            c4473i.f22294c = fMeasureText;
            c4473i.f22295d = false;
        } else {
            fMeasureText = c4473i.f22294c;
        }
        return Math.min(Math.round(m7058p() + fMeasureText + fM7057o + this.f44307g1 + this.f44311j1), this.J1);
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.K1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f15961D, this.f15962E);
        } else {
            outline.setRoundRect(bounds, this.f15962E);
            outline2 = outline;
        }
        outline2.setAlpha(this.f44328z1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m7034r(this.f15959B) || m7034r(this.f15960C) || m7034r(this.f15963F)) {
            return true;
        }
        C4751d c4751d = this.f44318q1.f22297f;
        if (c4751d == null || (colorStateList = c4751d.f23732a) == null || !colorStateList.isStateful()) {
            return (this.X0 && this.Y0 != null && this.f44321t0) || m7035s(this.f15968L) || m7035s(this.Y0) || m7034r(this.C1);
        }
        return true;
    }

    /* renamed from: m */
    public final void m7055m(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f15973V) {
            if (drawable.isStateful()) {
                drawable.setState(this.E1);
            }
            drawable.setTintList(this.f15975Y);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f15968L;
        if (drawable == drawable2 && this.f15971O) {
            drawable2.setTintList(this.f15969M);
        }
    }

    /* renamed from: n */
    public final void m7056n(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m7053R() || m7052Q()) {
            float f6 = this.f44303c1 + this.f44304d1;
            Drawable drawable = this.f44326x1 ? this.Y0 : this.f15968L;
            float intrinsicWidth = this.f15970N;
            if (intrinsicWidth <= DefinitionKt.NO_Float_VALUE && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f10 = rect.left + f6;
                rectF.left = f10;
                rectF.right = f10 + intrinsicWidth;
            } else {
                float f11 = rect.right - f6;
                rectF.right = f11;
                rectF.left = f11 - intrinsicWidth;
            }
            Drawable drawable2 = this.f44326x1 ? this.Y0 : this.f15968L;
            float fCeil = this.f15970N;
            if (fCeil <= DefinitionKt.NO_Float_VALUE && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f44312k1.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* renamed from: o */
    public final float m7057o() {
        if (!m7053R() && !m7052Q()) {
            return DefinitionKt.NO_Float_VALUE;
        }
        float f6 = this.f44304d1;
        Drawable drawable = this.f44326x1 ? this.Y0 : this.f15968L;
        float intrinsicWidth = this.f15970N;
        if (intrinsicWidth <= DefinitionKt.NO_Float_VALUE && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f6 + this.f44305e1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (m7053R()) {
            zOnLayoutDirectionChanged |= this.f15968L.setLayoutDirection(i10);
        }
        if (m7052Q()) {
            zOnLayoutDirectionChanged |= this.Y0.setLayoutDirection(i10);
        }
        if (m7054S()) {
            zOnLayoutDirectionChanged |= this.f15973V.setLayoutDirection(i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (m7053R()) {
            zOnLevelChange |= this.f15968L.setLevel(i10);
        }
        if (m7052Q()) {
            zOnLevelChange |= this.Y0.setLevel(i10);
        }
        if (m7054S()) {
            zOnLevelChange |= this.f15973V.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.K1) {
            super.onStateChange(iArr);
        }
        return m7061u(iArr, this.E1);
    }

    /* renamed from: p */
    public final float m7058p() {
        return m7054S() ? this.f44309h1 + this.f15976Z + this.f44310i1 : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: q */
    public final float m7059q() {
        return this.K1 ? this.f29152a.f29135a.f29179e.mo11975a(m11984e()) : this.f15962E;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f44328z1 != i10) {
            this.f44328z1 = i10;
            invalidateSelf();
        }
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.A1 != colorFilter) {
            this.A1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.C1 != colorStateList) {
            this.C1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ph.C5952g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.D1 != mode) {
            this.D1 = mode;
            ColorStateList colorStateList = this.C1;
            this.B1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        if (m7053R()) {
            visible |= this.f15968L.setVisible(z6, z10);
        }
        if (m7052Q()) {
            visible |= this.Y0.setVisible(z6, z10);
        }
        if (m7054S()) {
            visible |= this.f15973V.setVisible(z6, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public final void m7060t() {
        InterfaceC2927d interfaceC2927d = (InterfaceC2927d) this.G1.get();
        if (interfaceC2927d != null) {
            Chip chip = (Chip) interfaceC2927d;
            chip.m4079c(chip.f6822r);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7061u(int[] r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.C2928e.m7061u(int[], int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public final void m7062v(boolean z6) {
        if (this.f44321t0 != z6) {
            this.f44321t0 = z6;
            float fM7057o = m7057o();
            if (!z6 && this.f44326x1) {
                this.f44326x1 = false;
            }
            float fM7057o2 = m7057o();
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: w */
    public final void m7063w(Drawable drawable) {
        if (this.Y0 != drawable) {
            float fM7057o = m7057o();
            this.Y0 = drawable;
            float fM7057o2 = m7057o();
            m7033T(this.Y0);
            m7055m(this.Y0);
            invalidateSelf();
            if (fM7057o != fM7057o2) {
                m7060t();
            }
        }
    }

    /* renamed from: x */
    public final void m7064x(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            if (this.X0 && (drawable = this.Y0) != null && this.f44321t0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: y */
    public final void m7065y(boolean z6) {
        if (this.X0 != z6) {
            boolean zM7052Q = m7052Q();
            this.X0 = z6;
            boolean zM7052Q2 = m7052Q();
            if (zM7052Q != zM7052Q2) {
                if (zM7052Q2) {
                    m7055m(this.Y0);
                } else {
                    m7033T(this.Y0);
                }
                invalidateSelf();
                m7060t();
            }
        }
    }

    /* renamed from: z */
    public final void m7066z(float f6) {
        if (this.f15962E != f6) {
            this.f15962E = f6;
            o3 o3VarM11996e = this.f29152a.f29135a.m11996e();
            o3VarM11996e.f23376e = new C5946a(f6);
            o3VarM11996e.f23377f = new C5946a(f6);
            o3VarM11996e.f23378g = new C5946a(f6);
            o3VarM11996e.f23379h = new C5946a(f6);
            setShapeAppearanceModel(o3VarM11996e.m9582a());
        }
    }
}
