package lh;

import a6.AbstractC0059g;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import b7.C0604a;
import bh.AbstractC0659a;
import c6.v0;
import com.google.android.material.textfield.TextInputLayout;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import mh.C4748a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.b */
/* loaded from: classes.dex */
public final class C4466b {

    /* renamed from: A */
    public float f22228A;

    /* renamed from: B */
    public float f22229B;

    /* renamed from: C */
    public int[] f22230C;

    /* renamed from: D */
    public boolean f22231D;

    /* renamed from: E */
    public final TextPaint f22232E;

    /* renamed from: F */
    public final TextPaint f22233F;

    /* renamed from: G */
    public TimeInterpolator f22234G;

    /* renamed from: H */
    public TimeInterpolator f22235H;

    /* renamed from: I */
    public float f22236I;

    /* renamed from: J */
    public float f22237J;

    /* renamed from: K */
    public float f22238K;

    /* renamed from: L */
    public ColorStateList f22239L;

    /* renamed from: M */
    public float f22240M;

    /* renamed from: N */
    public StaticLayout f22241N;

    /* renamed from: O */
    public CharSequence f22242O;

    /* renamed from: a */
    public final TextInputLayout f22243a;

    /* renamed from: b */
    public boolean f22244b;

    /* renamed from: c */
    public float f22245c;

    /* renamed from: d */
    public final Rect f22246d;

    /* renamed from: e */
    public final Rect f22247e;

    /* renamed from: f */
    public final RectF f22248f;

    /* renamed from: g */
    public int f22249g = 16;

    /* renamed from: h */
    public int f22250h = 16;

    /* renamed from: i */
    public float f22251i = 15.0f;

    /* renamed from: j */
    public float f22252j = 15.0f;

    /* renamed from: k */
    public ColorStateList f22253k;

    /* renamed from: l */
    public ColorStateList f22254l;

    /* renamed from: m */
    public float f22255m;

    /* renamed from: n */
    public float f22256n;

    /* renamed from: o */
    public float f22257o;

    /* renamed from: p */
    public float f22258p;

    /* renamed from: q */
    public float f22259q;

    /* renamed from: r */
    public float f22260r;

    /* renamed from: s */
    public Typeface f22261s;

    /* renamed from: t */
    public Typeface f22262t;

    /* renamed from: u */
    public Typeface f22263u;

    /* renamed from: v */
    public C4748a f22264v;

    /* renamed from: w */
    public CharSequence f22265w;

    /* renamed from: x */
    public CharSequence f22266x;

    /* renamed from: y */
    public boolean f22267y;

    /* renamed from: z */
    public Bitmap f22268z;

    public C4466b(TextInputLayout textInputLayout) {
        this.f22243a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f22232E = textPaint;
        this.f22233F = new TextPaint(textPaint);
        this.f22247e = new Rect();
        this.f22246d = new Rect();
        this.f22248f = new RectF();
    }

    /* renamed from: a */
    public static int m9312a(float f6, int i10, int i11) {
        float f10 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i11) * f6) + (Color.alpha(i10) * f10)), (int) ((Color.red(i11) * f6) + (Color.red(i10) * f10)), (int) ((Color.green(i11) * f6) + (Color.green(i10) * f10)), (int) ((Color.blue(i11) * f6) + (Color.blue(i10) * f10)));
    }

    /* renamed from: e */
    public static float m9313e(float f6, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return AbstractC0659a.m1929a(f6, f10, f11);
    }

    /* renamed from: b */
    public final float m9314b() {
        if (this.f22265w == null) {
            return DefinitionKt.NO_Float_VALUE;
        }
        float f6 = this.f22252j;
        TextPaint textPaint = this.f22233F;
        textPaint.setTextSize(f6);
        textPaint.setTypeface(this.f22261s);
        textPaint.setLetterSpacing(this.f22240M);
        CharSequence charSequence = this.f22265w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final void m9315c(float f6) {
        boolean z6;
        float f10;
        boolean z10;
        if (this.f22265w == null) {
            return;
        }
        float fWidth = this.f22247e.width();
        float fWidth2 = this.f22246d.width();
        if (Math.abs(f6 - this.f22252j) < 0.001f) {
            f10 = this.f22252j;
            this.f22228A = 1.0f;
            Typeface typeface = this.f22263u;
            Typeface typeface2 = this.f22261s;
            if (typeface != typeface2) {
                this.f22263u = typeface2;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            float f11 = this.f22251i;
            Typeface typeface3 = this.f22263u;
            Typeface typeface4 = this.f22262t;
            if (typeface3 != typeface4) {
                this.f22263u = typeface4;
                z6 = true;
            } else {
                z6 = false;
            }
            if (Math.abs(f6 - f11) < 0.001f) {
                this.f22228A = 1.0f;
            } else {
                this.f22228A = f6 / this.f22251i;
            }
            float f12 = this.f22252j / this.f22251i;
            fWidth = fWidth2 * f12 > fWidth ? Math.min(fWidth / f12, fWidth2) : fWidth2;
            f10 = f11;
            z10 = z6;
        }
        if (fWidth > DefinitionKt.NO_Float_VALUE) {
            z10 = this.f22229B != f10 || this.f22231D || z10;
            this.f22229B = f10;
            this.f22231D = false;
        }
        if (this.f22266x == null || z10) {
            float f13 = this.f22229B;
            TextPaint textPaint = this.f22232E;
            textPaint.setTextSize(f13);
            textPaint.setTypeface(this.f22263u);
            textPaint.setLinearText(this.f22228A != 1.0f);
            CharSequence charSequence = this.f22265w;
            Field field = v0.f5527a;
            boolean zM167f = (this.f22243a.getLayoutDirection() == 1 ? AbstractC0059g.f238d : AbstractC0059g.f237c).m167f(charSequence, charSequence.length());
            this.f22267y = zM167f;
            C4471g c4471g = new C4471g(this.f22265w, textPaint, (int) fWidth);
            c4471g.f22291k = TextUtils.TruncateAt.END;
            c4471g.f22290j = zM167f;
            c4471g.f22285e = Layout.Alignment.ALIGN_NORMAL;
            c4471g.f22289i = false;
            c4471g.f22286f = 1;
            c4471g.f22287g = 1.0f;
            c4471g.f22288h = 1;
            StaticLayout staticLayoutM9323a = c4471g.m9323a();
            staticLayoutM9323a.getClass();
            this.f22241N = staticLayoutM9323a;
            this.f22266x = staticLayoutM9323a.getText();
        }
    }

    /* renamed from: d */
    public final int m9316d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f22230C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9317f() {
        /*
            r2 = this;
            android.graphics.Rect r0 = r2.f22247e
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            android.graphics.Rect r0 = r2.f22246d
            int r1 = r0.width()
            if (r1 <= 0) goto L1e
            int r0 = r0.height()
            if (r0 <= 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r2.f22244b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.C4466b.m9317f():void");
    }

    /* renamed from: g */
    public final void m9318g() {
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f22243a;
        if (textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) {
            return;
        }
        float f6 = this.f22229B;
        m9315c(this.f22252j);
        CharSequence charSequence = this.f22266x;
        TextPaint textPaint = this.f22232E;
        if (charSequence != null && (staticLayout = this.f22241N) != null) {
            this.f22242O = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f22242O;
        float fMeasureText = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f22250h, this.f22267y ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f22247e;
        if (i10 == 48) {
            this.f22256n = rect.top;
        } else if (i10 != 80) {
            this.f22256n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f22256n = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f22258p = rect.centerX() - (fMeasureText / 2.0f);
        } else if (i11 != 5) {
            this.f22258p = rect.left;
        } else {
            this.f22258p = rect.right - fMeasureText;
        }
        m9315c(this.f22251i);
        float height = this.f22241N != null ? r3.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f22266x;
        float fMeasureText2 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f22241N;
        if (staticLayout2 != null) {
            staticLayout2.getLineLeft(0);
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f22249g, this.f22267y ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f22246d;
        if (i12 == 48) {
            this.f22255m = rect2.top;
        } else if (i12 != 80) {
            this.f22255m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f22255m = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f22257o = rect2.centerX() - (fMeasureText2 / 2.0f);
        } else if (i13 != 5) {
            this.f22257o = rect2.left;
        } else {
            this.f22257o = rect2.right - fMeasureText2;
        }
        Bitmap bitmap = this.f22268z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f22268z = null;
        }
        m9321j(f6);
        float f10 = this.f22245c;
        float fM9313e = m9313e(rect2.left, rect.left, f10, this.f22234G);
        RectF rectF = this.f22248f;
        rectF.left = fM9313e;
        rectF.top = m9313e(this.f22255m, this.f22256n, f10, this.f22234G);
        rectF.right = m9313e(rect2.right, rect.right, f10, this.f22234G);
        rectF.bottom = m9313e(rect2.bottom, rect.bottom, f10, this.f22234G);
        this.f22259q = m9313e(this.f22257o, this.f22258p, f10, this.f22234G);
        this.f22260r = m9313e(this.f22255m, this.f22256n, f10, this.f22234G);
        m9321j(m9313e(this.f22251i, this.f22252j, f10, this.f22235H));
        C0604a c0604a = AbstractC0659a.f4204b;
        m9313e(DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f - f10, c0604a);
        Field field = v0.f5527a;
        textInputLayout.postInvalidateOnAnimation();
        m9313e(1.0f, DefinitionKt.NO_Float_VALUE, f10, c0604a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f22254l;
        ColorStateList colorStateList2 = this.f22253k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m9312a(f10, m9316d(colorStateList2), m9316d(this.f22254l)));
        } else {
            textPaint.setColor(m9316d(colorStateList));
        }
        float f11 = this.f22240M;
        if (f11 != DefinitionKt.NO_Float_VALUE) {
            textPaint.setLetterSpacing(m9313e(DefinitionKt.NO_Float_VALUE, f11, f10, c0604a));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        textPaint.setShadowLayer(AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22236I, f10), AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22237J, f10), AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22238K, f10), m9312a(f10, 0, m9316d(this.f22239L)));
        textInputLayout.postInvalidateOnAnimation();
    }

    /* renamed from: h */
    public final void m9319h(ColorStateList colorStateList) {
        if (this.f22254l != colorStateList) {
            this.f22254l = colorStateList;
            m9318g();
        }
    }

    /* renamed from: i */
    public final void m9320i(float f6) {
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f22245c) {
            this.f22245c = f6;
            float f10 = this.f22246d.left;
            Rect rect = this.f22247e;
            float fM9313e = m9313e(f10, rect.left, f6, this.f22234G);
            RectF rectF = this.f22248f;
            rectF.left = fM9313e;
            rectF.top = m9313e(this.f22255m, this.f22256n, f6, this.f22234G);
            rectF.right = m9313e(r1.right, rect.right, f6, this.f22234G);
            rectF.bottom = m9313e(r1.bottom, rect.bottom, f6, this.f22234G);
            this.f22259q = m9313e(this.f22257o, this.f22258p, f6, this.f22234G);
            this.f22260r = m9313e(this.f22255m, this.f22256n, f6, this.f22234G);
            m9321j(m9313e(this.f22251i, this.f22252j, f6, this.f22235H));
            C0604a c0604a = AbstractC0659a.f4204b;
            m9313e(DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f - f6, c0604a);
            Field field = v0.f5527a;
            TextInputLayout textInputLayout = this.f22243a;
            textInputLayout.postInvalidateOnAnimation();
            m9313e(1.0f, DefinitionKt.NO_Float_VALUE, f6, c0604a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f22254l;
            ColorStateList colorStateList2 = this.f22253k;
            TextPaint textPaint = this.f22232E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m9312a(f6, m9316d(colorStateList2), m9316d(this.f22254l)));
            } else {
                textPaint.setColor(m9316d(colorStateList));
            }
            float f11 = this.f22240M;
            if (f11 != DefinitionKt.NO_Float_VALUE) {
                textPaint.setLetterSpacing(m9313e(DefinitionKt.NO_Float_VALUE, f11, f6, c0604a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            textPaint.setShadowLayer(AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22236I, f6), AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22237J, f6), AbstractC0659a.m1929a(DefinitionKt.NO_Float_VALUE, this.f22238K, f6), m9312a(f6, 0, m9316d(this.f22239L)));
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    /* renamed from: j */
    public final void m9321j(float f6) {
        m9315c(f6);
        Field field = v0.f5527a;
        this.f22243a.postInvalidateOnAnimation();
    }
}
