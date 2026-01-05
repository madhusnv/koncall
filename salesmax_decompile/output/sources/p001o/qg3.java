package p001o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import org.objectweb.asm.Opcodes;
import p001o.k5g;
import p001o.ub2;

/* loaded from: classes3.dex */
public final class qg3 {

    /* renamed from: A */
    public Typeface f41843A;

    /* renamed from: B */
    public Typeface f41844B;

    /* renamed from: C */
    public Typeface f41845C;

    /* renamed from: D */
    public ub2 f41846D;

    /* renamed from: E */
    public ub2 f41847E;

    /* renamed from: G */
    public CharSequence f41849G;

    /* renamed from: H */
    public CharSequence f41850H;

    /* renamed from: I */
    public boolean f41851I;

    /* renamed from: K */
    public float f41853K;

    /* renamed from: L */
    public float f41854L;

    /* renamed from: M */
    public float f41855M;

    /* renamed from: N */
    public float f41856N;

    /* renamed from: O */
    public float f41857O;

    /* renamed from: P */
    public int f41858P;

    /* renamed from: Q */
    public int f41859Q;

    /* renamed from: R */
    public int[] f41860R;

    /* renamed from: S */
    public boolean f41861S;

    /* renamed from: T */
    public final TextPaint f41862T;

    /* renamed from: U */
    public final TextPaint f41863U;

    /* renamed from: V */
    public TimeInterpolator f41864V;

    /* renamed from: W */
    public TimeInterpolator f41865W;

    /* renamed from: X */
    public float f41866X;

    /* renamed from: Y */
    public float f41867Y;

    /* renamed from: Z */
    public float f41868Z;

    /* renamed from: a */
    public final View f41869a;
    public ColorStateList a0;

    /* renamed from: b */
    public float f41870b;
    public float b0;

    /* renamed from: c */
    public boolean f41871c;
    public float c0;

    /* renamed from: d */
    public float f41872d;
    public float d0;

    /* renamed from: e */
    public float f41873e;
    public ColorStateList e0;

    /* renamed from: f */
    public int f41874f;
    public float f0;

    /* renamed from: g */
    public final Rect f41875g;
    public float g0;

    /* renamed from: h */
    public final Rect f41876h;
    public float h0;

    /* renamed from: i */
    public final RectF f41877i;
    public StaticLayout i0;
    public float j0;
    public float k0;
    public float l0;
    public CharSequence m0;

    /* renamed from: n */
    public ColorStateList f41882n;

    /* renamed from: o */
    public ColorStateList f41883o;

    /* renamed from: p */
    public int f41884p;

    /* renamed from: q */
    public float f41885q;

    /* renamed from: r */
    public float f41886r;

    /* renamed from: s */
    public float f41887s;
    public l5g s0;

    /* renamed from: t */
    public float f41888t;

    /* renamed from: u */
    public float f41889u;

    /* renamed from: v */
    public float f41890v;
    public boolean v0;

    /* renamed from: w */
    public Typeface f41891w;

    /* renamed from: x */
    public Typeface f41892x;

    /* renamed from: y */
    public Typeface f41893y;

    /* renamed from: z */
    public Typeface f41894z;

    /* renamed from: j */
    public int f41878j = 16;

    /* renamed from: k */
    public int f41879k = 16;

    /* renamed from: l */
    public float f41880l = 15.0f;

    /* renamed from: m */
    public float f41881m = 15.0f;

    /* renamed from: F */
    public TextUtils.TruncateAt f41848F = TextUtils.TruncateAt.END;

    /* renamed from: J */
    public boolean f41852J = true;
    public int n0 = 1;
    public int o0 = 1;
    public float p0 = 0.0f;
    public float q0 = 1.0f;
    public int r0 = k5g.f31499o;
    public int t0 = -1;
    public int u0 = -1;

    /* renamed from: o.qg3$a */
    public class C16372a implements ub2.InterfaceC17347a {
        public C16372a() {
        }

        @Override // p001o.ub2.InterfaceC17347a
        /* renamed from: a */
        public void mo45425a(Typeface typeface) {
            qg3.this.n0(typeface);
        }
    }

    /* renamed from: o.qg3$b */
    public class C16373b implements ub2.InterfaceC17347a {
        public C16373b() {
        }

        @Override // p001o.ub2.InterfaceC17347a
        /* renamed from: a */
        public void mo45425a(Typeface typeface) {
            qg3.this.A0(typeface);
        }
    }

    public qg3(View view) {
        this.f41869a = view;
        TextPaint textPaint = new TextPaint(Opcodes.LOR);
        this.f41862T = textPaint;
        this.f41863U = new TextPaint(textPaint);
        this.f41876h = new Rect();
        this.f41875g = new Rect();
        this.f41877i = new RectF();
        this.f41873e = m45403e();
        m45399Z(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: U */
    public static boolean m45373U(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: Y */
    public static float m45374Y(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return gh0.m28647a(f, f2, f3);
    }

    /* renamed from: a */
    public static int m45375a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static boolean d0(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: A */
    public int m45376A() {
        return this.n0;
    }

    public void A0(Typeface typeface) {
        if (B0(typeface)) {
            b0();
        }
    }

    /* renamed from: B */
    public float m45377B() {
        m45393R(this.f41863U);
        return (-this.f41863U.ascent()) + this.f41863U.descent();
    }

    public final boolean B0(Typeface typeface) {
        ub2 ub2Var = this.f41846D;
        if (ub2Var != null) {
            ub2Var.m51323c();
        }
        if (this.f41844B == typeface) {
            return false;
        }
        this.f41844B = typeface;
        Typeface typefaceM50815b = tzh.m50815b(this.f41869a.getContext().getResources().getConfiguration(), typeface);
        this.f41843A = typefaceM50815b;
        if (typefaceM50815b == null) {
            typefaceM50815b = this.f41844B;
        }
        this.f41894z = typefaceM50815b;
        return true;
    }

    /* renamed from: C */
    public int m45378C() {
        return this.f41878j;
    }

    public void C0(float f) {
        float fM44555a = pza.m44555a(f, 0.0f, 1.0f);
        if (fM44555a != this.f41870b) {
            this.f41870b = fM44555a;
            m45401c();
        }
    }

    /* renamed from: D */
    public float m45379D() {
        int i = this.u0;
        return i != -1 ? i : m45380E();
    }

    public void D0(boolean z) {
        this.f41871c = z;
    }

    /* renamed from: E */
    public float m45380E() {
        m45393R(this.f41863U);
        return -this.f41863U.ascent();
    }

    public void E0(float f) {
        this.f41872d = f;
        this.f41873e = m45403e();
    }

    /* renamed from: F */
    public float m45381F() {
        return this.f41880l;
    }

    public void F0(int i) {
        this.r0 = i;
    }

    /* renamed from: G */
    public Typeface m45382G() {
        Typeface typeface = this.f41894z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public final void G0(float f) {
        m45406h(f);
        this.f41869a.postInvalidateOnAnimation();
    }

    /* renamed from: H */
    public float m45383H() {
        return this.f41870b;
    }

    public void H0(float f) {
        this.p0 = f;
    }

    /* renamed from: I */
    public float m45384I() {
        return this.f41873e;
    }

    public void I0(float f) {
        this.q0 = f;
    }

    /* renamed from: J */
    public int m45385J() {
        return this.r0;
    }

    public void J0(TimeInterpolator timeInterpolator) {
        this.f41864V = timeInterpolator;
        b0();
    }

    /* renamed from: K */
    public int m45386K() {
        StaticLayout staticLayout = this.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void K0(boolean z) {
        this.f41852J = z;
    }

    /* renamed from: L */
    public float m45387L() {
        return this.i0.getSpacingAdd();
    }

    public final boolean L0(int[] iArr) {
        this.f41860R = iArr;
        if (!m45397W()) {
            return false;
        }
        b0();
        return true;
    }

    /* renamed from: M */
    public float m45388M() {
        return this.i0.getSpacingMultiplier();
    }

    public void M0(l5g l5gVar) {
        if (this.s0 != l5gVar) {
            this.s0 = l5gVar;
            c0(true);
        }
    }

    /* renamed from: N */
    public final Layout.Alignment m45389N() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f41878j, this.f41851I ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.f41851I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f41851I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public void N0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f41849G, charSequence)) {
            this.f41849G = charSequence;
            this.f41850H = null;
            b0();
        }
    }

    /* renamed from: O */
    public TimeInterpolator m45390O() {
        return this.f41864V;
    }

    public void O0(TimeInterpolator timeInterpolator) {
        this.f41865W = timeInterpolator;
        b0();
    }

    /* renamed from: P */
    public CharSequence m45391P() {
        return this.f41849G;
    }

    public void P0(TextUtils.TruncateAt truncateAt) {
        this.f41848F = truncateAt;
        b0();
    }

    /* renamed from: Q */
    public final void m45392Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f41881m);
        textPaint.setTypeface(this.f41891w);
        textPaint.setLetterSpacing(this.f0);
    }

    public void Q0(Typeface typeface) {
        boolean zO0 = o0(typeface);
        boolean zB0 = B0(typeface);
        if (zO0 || zB0) {
            b0();
        }
    }

    /* renamed from: R */
    public final void m45393R(TextPaint textPaint) {
        textPaint.setTextSize(this.f41880l);
        textPaint.setTypeface(this.f41894z);
        textPaint.setLetterSpacing(this.g0);
    }

    public final boolean R0() {
        return (this.n0 > 1 || this.o0 > 1) && (!this.f41851I || this.f41871c);
    }

    /* renamed from: S */
    public TextUtils.TruncateAt m45394S() {
        return this.f41848F;
    }

    public final boolean S0() {
        return this.o0 == 1;
    }

    /* renamed from: T */
    public final void m45395T(float f) {
        if (this.f41871c) {
            this.f41877i.set(f < this.f41873e ? this.f41875g : this.f41876h);
            return;
        }
        this.f41877i.left = m45374Y(this.f41875g.left, this.f41876h.left, f, this.f41864V);
        this.f41877i.top = m45374Y(this.f41885q, this.f41886r, f, this.f41864V);
        this.f41877i.right = m45374Y(this.f41875g.right, this.f41876h.right, f, this.f41864V);
        this.f41877i.bottom = m45374Y(this.f41875g.bottom, this.f41876h.bottom, f, this.f41864V);
    }

    public void T0(int i) {
        m45392Q(this.f41863U);
        float f = i;
        this.t0 = m45408j(this.o0, this.f41863U, this.f41849G, f * (this.f41881m / this.f41880l), this.f41851I).getHeight();
        m45393R(this.f41863U);
        this.u0 = m45408j(this.n0, this.f41863U, this.f41849G, f, this.f41851I).getHeight();
    }

    /* renamed from: V */
    public final boolean m45396V() {
        return this.f41869a.getLayoutDirection() == 1;
    }

    /* renamed from: W */
    public final boolean m45397W() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f41883o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f41882n) != null && colorStateList.isStateful());
    }

    /* renamed from: X */
    public final boolean m45398X(CharSequence charSequence, boolean z) {
        return (z ? wgh.f51959d : wgh.f51958c).mo52766a(charSequence, 0, charSequence.length());
    }

    /* renamed from: Z */
    public void m45399Z(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f41893y;
            if (typeface != null) {
                this.f41892x = tzh.m50815b(configuration, typeface);
            }
            Typeface typeface2 = this.f41844B;
            if (typeface2 != null) {
                this.f41843A = tzh.m50815b(configuration, typeface2);
            }
            Typeface typeface3 = this.f41892x;
            if (typeface3 == null) {
                typeface3 = this.f41893y;
            }
            this.f41891w = typeface3;
            Typeface typeface4 = this.f41843A;
            if (typeface4 == null) {
                typeface4 = this.f41844B;
            }
            this.f41894z = typeface4;
            c0(true);
        }
    }

    public final float a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: b */
    public final void m45400b(boolean z) {
        float fA0;
        m45407i(1.0f, z);
        if (this.f41850H != null && this.i0 != null) {
            this.m0 = S0() ? TextUtils.ellipsize(this.f41850H, this.f41862T, this.i0.getWidth(), this.f41848F) : this.f41850H;
        }
        CharSequence charSequence = this.m0;
        if (charSequence != null) {
            this.j0 = a0(this.f41862T, charSequence);
        } else {
            this.j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f41879k, this.f41851I ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f41886r = this.f41876h.top;
        } else if (i != 80) {
            this.f41886r = this.f41876h.centerY() - ((this.f41862T.descent() - this.f41862T.ascent()) / 2.0f);
        } else {
            this.f41886r = this.f41876h.bottom + this.f41862T.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f41888t = this.f41876h.centerX() - (this.j0 / 2.0f);
        } else if (i2 != 5) {
            this.f41888t = this.f41876h.left;
        } else {
            this.f41888t = this.f41876h.right - this.j0;
        }
        m45407i(0.0f, z);
        float height = this.i0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.i0;
        if (staticLayout == null || this.n0 <= 1) {
            CharSequence charSequence2 = this.f41850H;
            fA0 = charSequence2 != null ? a0(this.f41862T, charSequence2) : 0.0f;
        } else {
            fA0 = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.i0;
        this.f41884p = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f41878j, this.f41851I ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.f41885q = this.f41875g.top;
        } else if (i3 != 80) {
            this.f41885q = this.f41875g.centerY() - (height / 2.0f);
        } else {
            this.f41885q = (this.f41875g.bottom - height) + (this.v0 ? this.f41862T.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f41887s = this.f41875g.centerX() - (fA0 / 2.0f);
        } else if (i4 != 5) {
            this.f41887s = this.f41875g.left;
        } else {
            this.f41887s = this.f41875g.right - fA0;
        }
        G0(this.f41870b);
    }

    public void b0() {
        c0(false);
    }

    /* renamed from: c */
    public final void m45401c() {
        m45405g(this.f41870b);
    }

    public void c0(boolean z) {
        if ((this.f41869a.getHeight() <= 0 || this.f41869a.getWidth() <= 0) && !z) {
            return;
        }
        m45400b(z);
        m45401c();
    }

    /* renamed from: d */
    public final float m45402d(float f) {
        float f2 = this.f41873e;
        return f <= f2 ? gh0.m28648b(1.0f, 0.0f, this.f41872d, f2, f) : gh0.m28648b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    public final float m45403e() {
        float f = this.f41872d;
        return f + ((1.0f - f) * 0.5f);
    }

    public void e0(ColorStateList colorStateList) {
        if (this.f41883o == colorStateList && this.f41882n == colorStateList) {
            return;
        }
        this.f41883o = colorStateList;
        this.f41882n = colorStateList;
        b0();
    }

    /* renamed from: f */
    public final boolean m45404f(CharSequence charSequence) {
        boolean zM45396V = m45396V();
        return this.f41852J ? m45398X(charSequence, zM45396V) : zM45396V;
    }

    public void f0(int i, int i2, int i3, int i4) {
        if (d0(this.f41876h, i, i2, i3, i4)) {
            return;
        }
        this.f41876h.set(i, i2, i3, i4);
        this.f41861S = true;
    }

    /* renamed from: g */
    public final void m45405g(float f) {
        float f2;
        m45395T(f);
        if (!this.f41871c) {
            this.f41889u = m45374Y(this.f41887s, this.f41888t, f, this.f41864V);
            this.f41890v = m45374Y(this.f41885q, this.f41886r, f, this.f41864V);
            G0(f);
            f2 = f;
        } else if (f < this.f41873e) {
            this.f41889u = this.f41887s;
            this.f41890v = this.f41885q;
            G0(0.0f);
            f2 = 0.0f;
        } else {
            this.f41889u = this.f41888t;
            this.f41890v = this.f41886r - Math.max(0, this.f41874f);
            G0(1.0f);
            f2 = 1.0f;
        }
        TimeInterpolator timeInterpolator = gh0.f25147b;
        j0(1.0f - m45374Y(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        w0(m45374Y(1.0f, 0.0f, f, timeInterpolator));
        if (this.f41883o != this.f41882n) {
            this.f41862T.setColor(m45375a(m45423y(), m45421w(), f2));
        } else {
            this.f41862T.setColor(m45421w());
        }
        float f3 = this.f0;
        float f4 = this.g0;
        if (f3 != f4) {
            this.f41862T.setLetterSpacing(m45374Y(f4, f3, f, timeInterpolator));
        } else {
            this.f41862T.setLetterSpacing(f3);
        }
        this.f41855M = m45374Y(this.b0, this.f41866X, f, null);
        this.f41856N = m45374Y(this.c0, this.f41867Y, f, null);
        this.f41857O = m45374Y(this.d0, this.f41868Z, f, null);
        int iM45375a = m45375a(m45422x(this.e0), m45422x(this.a0), f);
        this.f41858P = iM45375a;
        this.f41862T.setShadowLayer(this.f41855M, this.f41856N, this.f41857O, iM45375a);
        if (this.f41871c) {
            this.f41862T.setAlpha((int) (m45402d(f) * this.f41862T.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f41862T;
                textPaint.setShadowLayer(this.f41855M, this.f41856N, this.f41857O, gua.m29502a(this.f41858P, textPaint.getAlpha()));
            }
        }
        this.f41869a.postInvalidateOnAnimation();
    }

    public void g0(Rect rect) {
        f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: h */
    public final void m45406h(float f) {
        m45407i(f, false);
    }

    public void h0(int i) {
        if (i != this.o0) {
            this.o0 = i;
            b0();
        }
    }

    /* renamed from: i */
    public final void m45407i(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.f41849G == null) {
            return;
        }
        float fWidth = this.f41876h.width();
        float fWidth2 = this.f41875g.width();
        if (m45373U(f, 1.0f)) {
            f2 = S0() ? this.f41881m : this.f41880l;
            f3 = S0() ? this.f0 : this.g0;
            this.f41853K = S0() ? 1.0f : m45374Y(this.f41880l, this.f41881m, f, this.f41865W) / this.f41880l;
            if (!S0()) {
                fWidth = fWidth2;
            }
            typeface = this.f41891w;
            fWidth2 = fWidth;
        } else {
            float f4 = this.f41880l;
            float f5 = this.g0;
            typeface = this.f41894z;
            if (m45373U(f, 0.0f)) {
                this.f41853K = 1.0f;
            } else {
                this.f41853K = m45374Y(this.f41880l, this.f41881m, f, this.f41865W) / this.f41880l;
            }
            float f6 = this.f41881m / this.f41880l;
            float f7 = fWidth2 * f6;
            if (!z && !this.f41871c && f7 > fWidth && S0()) {
                fWidth2 = Math.min(fWidth / f6, fWidth2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.n0 : this.o0;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.f41854L != f2;
            boolean z3 = this.h0 != f3;
            boolean z4 = this.f41845C != typeface;
            StaticLayout staticLayout = this.i0;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.f41859Q != i) || this.f41861S;
            this.f41854L = f2;
            this.h0 = f3;
            this.f41845C = typeface;
            this.f41861S = false;
            this.f41859Q = i;
            this.f41862T.setLinearText(this.f41853K != 1.0f);
            z = z5;
        }
        if (this.f41850H == null || z) {
            this.f41862T.setTextSize(this.f41854L);
            this.f41862T.setTypeface(this.f41845C);
            this.f41862T.setLetterSpacing(this.h0);
            this.f41851I = m45404f(this.f41849G);
            StaticLayout staticLayoutM45408j = m45408j(R0() ? i : 1, this.f41862T, this.f41849G, fWidth2 * (S0() ? 1.0f : this.f41853K), this.f41851I);
            this.i0 = staticLayoutM45408j;
            this.f41850H = staticLayoutM45408j.getText();
        }
    }

    public void i0(int i) {
        mgh mghVar = new mgh(this.f41869a.getContext(), i);
        if (mghVar.m39028j() != null) {
            this.f41883o = mghVar.m39028j();
        }
        if (mghVar.m39029k() != 0.0f) {
            this.f41881m = mghVar.m39029k();
        }
        ColorStateList colorStateList = mghVar.f35425c;
        if (colorStateList != null) {
            this.a0 = colorStateList;
        }
        this.f41867Y = mghVar.f35431i;
        this.f41868Z = mghVar.f35432j;
        this.f41866X = mghVar.f35433k;
        this.f0 = mghVar.f35435m;
        ub2 ub2Var = this.f41847E;
        if (ub2Var != null) {
            ub2Var.m51323c();
        }
        this.f41847E = new ub2(new C16372a(), mghVar.m39023e());
        mghVar.m39026h(this.f41869a.getContext(), this.f41847E);
        b0();
    }

    /* renamed from: j */
    public final StaticLayout m45408j(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        StaticLayout staticLayoutM35017a;
        try {
            staticLayoutM35017a = k5g.m35016b(charSequence, textPaint, (int) f).m35019d(this.f41848F).m35022g(z).m35018c(i == 1 ? Layout.Alignment.ALIGN_NORMAL : m45389N()).m35021f(false).m35024i(i).m35023h(this.p0, this.q0).m35020e(this.r0).m35025j(this.s0).m35017a();
        } catch (k5g.C14716a e) {
            e.getCause().getMessage();
            staticLayoutM35017a = null;
        }
        return (StaticLayout) fgd.m26663g(staticLayoutM35017a);
    }

    public final void j0(float f) {
        this.k0 = f;
        this.f41869a.postInvalidateOnAnimation();
    }

    /* renamed from: k */
    public void m45409k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f41850H == null || this.f41877i.width() <= 0.0f || this.f41877i.height() <= 0.0f) {
            return;
        }
        this.f41862T.setTextSize(this.f41854L);
        float f = this.f41889u;
        float f2 = this.f41890v;
        float f3 = this.f41853K;
        if (f3 != 1.0f && !this.f41871c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (R0() && S0() && (!this.f41871c || this.f41870b > this.f41873e)) {
            m45410l(canvas, this.f41889u - this.i0.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.i0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void k0(ColorStateList colorStateList) {
        if (this.f41883o != colorStateList) {
            this.f41883o = colorStateList;
            b0();
        }
    }

    /* renamed from: l */
    public final void m45410l(Canvas canvas, float f, float f2) {
        int alpha = this.f41862T.getAlpha();
        canvas.translate(f, f2);
        if (!this.f41871c) {
            this.f41862T.setAlpha((int) (this.l0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f41862T;
                textPaint.setShadowLayer(this.f41855M, this.f41856N, this.f41857O, gua.m29502a(this.f41858P, textPaint.getAlpha()));
            }
            this.i0.draw(canvas);
        }
        if (!this.f41871c) {
            this.f41862T.setAlpha((int) (this.k0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.f41862T;
            textPaint2.setShadowLayer(this.f41855M, this.f41856N, this.f41857O, gua.m29502a(this.f41858P, textPaint2.getAlpha()));
        }
        int lineBaseline = this.i0.getLineBaseline(0);
        CharSequence charSequence = this.m0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.f41862T);
        if (i >= 31) {
            this.f41862T.setShadowLayer(this.f41855M, this.f41856N, this.f41857O, this.f41858P);
        }
        if (this.f41871c) {
            return;
        }
        String strTrim = this.m0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f41862T.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.i0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.f41862T);
    }

    public void l0(int i) {
        if (this.f41879k != i) {
            this.f41879k = i;
            b0();
        }
    }

    /* renamed from: m */
    public float m45411m() {
        m45392Q(this.f41863U);
        return (-this.f41863U.ascent()) + this.f41863U.descent();
    }

    public void m0(float f) {
        if (this.f41881m != f) {
            this.f41881m = f;
            b0();
        }
    }

    /* renamed from: n */
    public float m45412n() {
        m45392Q(this.f41863U);
        return -this.f41863U.ascent();
    }

    public void n0(Typeface typeface) {
        if (o0(typeface)) {
            b0();
        }
    }

    /* renamed from: o */
    public void m45413o(RectF rectF, int i, int i2) {
        this.f41851I = m45404f(this.f41849G);
        rectF.left = Math.max(m45417s(i, i2), this.f41876h.left);
        rectF.top = this.f41876h.top;
        rectF.right = Math.min(m45418t(rectF, i, i2), this.f41876h.right);
        rectF.bottom = this.f41876h.top + m45416r();
        if (this.i0 == null || S0()) {
            return;
        }
        float lineWidth = this.i0.getLineWidth(r4.getLineCount() - 1) * (this.f41881m / this.f41880l);
        if (this.f41851I) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public final boolean o0(Typeface typeface) {
        ub2 ub2Var = this.f41847E;
        if (ub2Var != null) {
            ub2Var.m51323c();
        }
        if (this.f41893y == typeface) {
            return false;
        }
        this.f41893y = typeface;
        Typeface typefaceM50815b = tzh.m50815b(this.f41869a.getContext().getResources().getConfiguration(), typeface);
        this.f41892x = typefaceM50815b;
        if (typefaceM50815b == null) {
            typefaceM50815b = this.f41893y;
        }
        this.f41891w = typefaceM50815b;
        return true;
    }

    /* renamed from: p */
    public ColorStateList m45414p() {
        return this.f41883o;
    }

    public void p0(int i) {
        this.f41874f = i;
    }

    /* renamed from: q */
    public int m45415q() {
        return this.f41879k;
    }

    public void q0(int i, int i2, int i3, int i4) {
        r0(i, i2, i3, i4, true);
    }

    /* renamed from: r */
    public float m45416r() {
        int i = this.t0;
        return i != -1 ? i : m45412n();
    }

    public void r0(int i, int i2, int i3, int i4, boolean z) {
        if (d0(this.f41875g, i, i2, i3, i4) && z == this.v0) {
            return;
        }
        this.f41875g.set(i, i2, i3, i4);
        this.f41861S = true;
        this.v0 = z;
    }

    /* renamed from: s */
    public final float m45417s(int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) - (this.j0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f41851I ? this.f41876h.left : this.f41876h.right - this.j0 : this.f41851I ? this.f41876h.right - this.j0 : this.f41876h.left;
    }

    public void s0(Rect rect) {
        q0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: t */
    public final float m45418t(RectF rectF, int i, int i2) {
        return (i2 == 17 || (i2 & 7) == 1) ? (i / 2.0f) + (this.j0 / 2.0f) : ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f41851I ? rectF.left + this.j0 : this.f41876h.right : this.f41851I ? this.f41876h.right : rectF.left + this.j0;
    }

    public void t0(float f) {
        if (this.g0 != f) {
            this.g0 = f;
            b0();
        }
    }

    /* renamed from: u */
    public float m45419u() {
        return this.f41881m;
    }

    public void u0(int i) {
        if (i != this.n0) {
            this.n0 = i;
            b0();
        }
    }

    /* renamed from: v */
    public Typeface m45420v() {
        Typeface typeface = this.f41891w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(int i) {
        mgh mghVar = new mgh(this.f41869a.getContext(), i);
        if (mghVar.m39028j() != null) {
            this.f41882n = mghVar.m39028j();
        }
        if (mghVar.m39029k() != 0.0f) {
            this.f41880l = mghVar.m39029k();
        }
        ColorStateList colorStateList = mghVar.f35425c;
        if (colorStateList != null) {
            this.e0 = colorStateList;
        }
        this.c0 = mghVar.f35431i;
        this.d0 = mghVar.f35432j;
        this.b0 = mghVar.f35433k;
        this.g0 = mghVar.f35435m;
        ub2 ub2Var = this.f41846D;
        if (ub2Var != null) {
            ub2Var.m51323c();
        }
        this.f41846D = new ub2(new C16373b(), mghVar.m39023e());
        mghVar.m39026h(this.f41869a.getContext(), this.f41846D);
        b0();
    }

    /* renamed from: w */
    public int m45421w() {
        return m45422x(this.f41883o);
    }

    public final void w0(float f) {
        this.l0 = f;
        this.f41869a.postInvalidateOnAnimation();
    }

    /* renamed from: x */
    public final int m45422x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f41860R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void x0(ColorStateList colorStateList) {
        if (this.f41882n != colorStateList) {
            this.f41882n = colorStateList;
            b0();
        }
    }

    /* renamed from: y */
    public final int m45423y() {
        return m45422x(this.f41882n);
    }

    public void y0(int i) {
        if (this.f41878j != i) {
            this.f41878j = i;
            b0();
        }
    }

    /* renamed from: z */
    public int m45424z() {
        return this.f41884p;
    }

    public void z0(float f) {
        if (this.f41880l != f) {
            this.f41880l = f;
            b0();
        }
    }
}
