package p001o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.perf.util.Constants;
import p001o.ykf;

/* loaded from: classes3.dex */
public class yta {

    /* renamed from: y */
    public static final double f55917y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z */
    public static final Drawable f55918z;

    /* renamed from: a */
    public final MaterialCardView f55919a;

    /* renamed from: c */
    public final zya f55921c;

    /* renamed from: d */
    public final zya f55922d;

    /* renamed from: e */
    public int f55923e;

    /* renamed from: f */
    public int f55924f;

    /* renamed from: g */
    public int f55925g;

    /* renamed from: h */
    public int f55926h;

    /* renamed from: i */
    public Drawable f55927i;

    /* renamed from: j */
    public Drawable f55928j;

    /* renamed from: k */
    public ColorStateList f55929k;

    /* renamed from: l */
    public ColorStateList f55930l;

    /* renamed from: m */
    public ykf f55931m;

    /* renamed from: n */
    public ColorStateList f55932n;

    /* renamed from: o */
    public Drawable f55933o;

    /* renamed from: p */
    public LayerDrawable f55934p;

    /* renamed from: q */
    public zya f55935q;

    /* renamed from: s */
    public boolean f55937s;

    /* renamed from: t */
    public ValueAnimator f55938t;

    /* renamed from: u */
    public final TimeInterpolator f55939u;

    /* renamed from: v */
    public final int f55940v;

    /* renamed from: w */
    public final int f55941w;

    /* renamed from: b */
    public final Rect f55920b = new Rect();

    /* renamed from: r */
    public boolean f55936r = false;

    /* renamed from: x */
    public float f55942x = 0.0f;

    /* renamed from: o.yta$a */
    public class C18488a extends InsetDrawable {
        public C18488a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f55918z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public yta(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f55919a = materialCardView;
        zya zyaVar = new zya(materialCardView.getContext(), attributeSet, i, i2);
        this.f55921c = zyaVar;
        zyaVar.m60115U(materialCardView.getContext());
        zyaVar.m0(-12303292);
        ykf.C18426b c18426bM57943w = zyaVar.m60103I().m57943w();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, lbe.CardView, i, jae.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(lbe.CardView_cardCornerRadius)) {
            c18426bM57943w.m57971o(typedArrayObtainStyledAttributes.getDimension(lbe.CardView_cardCornerRadius, 0.0f));
        }
        this.f55922d = new zya();
        m58228X(c18426bM57943w.m57970m());
        this.f55939u = umb.m51786g(materialCardView.getContext(), x5e.motionEasingLinearInterpolator, gh0.f25146a);
        this.f55940v = umb.m51785f(materialCardView.getContext(), x5e.motionDurationShort2, 300);
        this.f55941w = umb.m51785f(materialCardView.getContext(), x5e.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m58204G(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f55928j.setAlpha((int) (255.0f * fFloatValue));
        this.f55942x = fFloatValue;
    }

    /* renamed from: A */
    public Rect m58206A() {
        return this.f55920b;
    }

    /* renamed from: B */
    public final Drawable m58207B(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f55919a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(m58235f());
            iCeil = (int) Math.ceil(m58234e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new C18488a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    /* renamed from: C */
    public boolean m58208C() {
        return this.f55936r;
    }

    /* renamed from: D */
    public boolean m58209D() {
        return this.f55937s;
    }

    /* renamed from: E */
    public final boolean m58210E() {
        return (this.f55925g & 80) == 80;
    }

    /* renamed from: F */
    public final boolean m58211F() {
        return (this.f55925g & 8388613) == 8388613;
    }

    /* renamed from: H */
    public void m58212H(TypedArray typedArray) {
        ColorStateList colorStateListM58494a = yya.m58494a(this.f55919a.getContext(), typedArray, ebe.MaterialCardView_strokeColor);
        this.f55932n = colorStateListM58494a;
        if (colorStateListM58494a == null) {
            this.f55932n = ColorStateList.valueOf(-1);
        }
        this.f55926h = typedArray.getDimensionPixelSize(ebe.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(ebe.MaterialCardView_android_checkable, false);
        this.f55937s = z;
        this.f55919a.setLongClickable(z);
        this.f55930l = yya.m58494a(this.f55919a.getContext(), typedArray, ebe.MaterialCardView_checkedIconTint);
        m58220P(yya.m58498e(this.f55919a.getContext(), typedArray, ebe.MaterialCardView_checkedIcon));
        m58223S(typedArray.getDimensionPixelSize(ebe.MaterialCardView_checkedIconSize, 0));
        m58222R(typedArray.getDimensionPixelSize(ebe.MaterialCardView_checkedIconMargin, 0));
        this.f55925g = typedArray.getInteger(ebe.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListM58494a2 = yya.m58494a(this.f55919a.getContext(), typedArray, ebe.MaterialCardView_rippleColor);
        this.f55929k = colorStateListM58494a2;
        if (colorStateListM58494a2 == null) {
            this.f55929k = ColorStateList.valueOf(gua.m29505d(this.f55919a, z5e.colorControlHighlight));
        }
        m58216L(yya.m58494a(this.f55919a.getContext(), typedArray, ebe.MaterialCardView_cardForegroundColor));
        j0();
        g0();
        k0();
        this.f55919a.setBackgroundInternal(m58207B(this.f55921c));
        Drawable drawableM58247r = d0() ? m58247r() : this.f55922d;
        this.f55927i = drawableM58247r;
        this.f55919a.setForeground(m58207B(drawableM58247r));
    }

    /* renamed from: I */
    public void m58213I(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f55934p != null) {
            if (this.f55919a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(m58235f() * 2.0f);
                iCeil2 = (int) Math.ceil(m58234e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = m58211F() ? ((i - this.f55923e) - this.f55924f) - iCeil2 : this.f55923e;
            int i6 = m58210E() ? this.f55923e : ((i2 - this.f55923e) - this.f55924f) - iCeil;
            int i7 = m58211F() ? this.f55923e : ((i - this.f55923e) - this.f55924f) - iCeil2;
            int i8 = m58210E() ? ((i2 - this.f55923e) - this.f55924f) - iCeil : this.f55923e;
            if (this.f55919a.getLayoutDirection() == 1) {
                i4 = i7;
                i3 = i5;
            } else {
                i3 = i7;
                i4 = i5;
            }
            this.f55934p.setLayerInset(2, i4, i8, i3, i6);
        }
    }

    /* renamed from: J */
    public void m58214J(boolean z) {
        this.f55936r = z;
    }

    /* renamed from: K */
    public void m58215K(ColorStateList colorStateList) {
        this.f55921c.g0(colorStateList);
    }

    /* renamed from: L */
    public void m58216L(ColorStateList colorStateList) {
        zya zyaVar = this.f55922d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        zyaVar.g0(colorStateList);
    }

    /* renamed from: M */
    public void m58217M(boolean z) {
        this.f55937s = z;
    }

    /* renamed from: N */
    public void m58218N(boolean z) {
        m58219O(z, false);
    }

    /* renamed from: O */
    public void m58219O(boolean z, boolean z2) {
        Drawable drawable = this.f55928j;
        if (drawable != null) {
            if (z2) {
                m58231b(z);
            } else {
                drawable.setAlpha(z ? Constants.MAX_HOST_LENGTH : 0);
                this.f55942x = z ? 1.0f : 0.0f;
            }
        }
    }

    /* renamed from: P */
    public void m58220P(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = fy5.m27744r(drawable).mutate();
            this.f55928j = drawableMutate;
            drawableMutate.setTintList(this.f55930l);
            m58218N(this.f55919a.isChecked());
        } else {
            this.f55928j = f55918z;
        }
        LayerDrawable layerDrawable = this.f55934p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(n8e.mtrl_card_checked_layer_id, this.f55928j);
        }
    }

    /* renamed from: Q */
    public void m58221Q(int i) {
        this.f55925g = i;
        m58213I(this.f55919a.getMeasuredWidth(), this.f55919a.getMeasuredHeight());
    }

    /* renamed from: R */
    public void m58222R(int i) {
        this.f55923e = i;
    }

    /* renamed from: S */
    public void m58223S(int i) {
        this.f55924f = i;
    }

    /* renamed from: T */
    public void m58224T(ColorStateList colorStateList) {
        this.f55930l = colorStateList;
        Drawable drawable = this.f55928j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    /* renamed from: U */
    public void m58225U(float f) {
        m58228X(this.f55931m.m57944x(f));
        this.f55927i.invalidateSelf();
        if (c0() || b0()) {
            f0();
        }
        if (c0()) {
            i0();
        }
    }

    /* renamed from: V */
    public void m58226V(float f) {
        this.f55921c.h0(f);
        zya zyaVar = this.f55922d;
        if (zyaVar != null) {
            zyaVar.h0(f);
        }
        zya zyaVar2 = this.f55935q;
        if (zyaVar2 != null) {
            zyaVar2.h0(f);
        }
    }

    /* renamed from: W */
    public void m58227W(ColorStateList colorStateList) {
        this.f55929k = colorStateList;
        j0();
    }

    /* renamed from: X */
    public void m58228X(ykf ykfVar) {
        this.f55931m = ykfVar;
        this.f55921c.setShapeAppearanceModel(ykfVar);
        this.f55921c.l0(!r0.m60118X());
        zya zyaVar = this.f55922d;
        if (zyaVar != null) {
            zyaVar.setShapeAppearanceModel(ykfVar);
        }
        zya zyaVar2 = this.f55935q;
        if (zyaVar2 != null) {
            zyaVar2.setShapeAppearanceModel(ykfVar);
        }
    }

    /* renamed from: Y */
    public void m58229Y(ColorStateList colorStateList) {
        if (this.f55932n == colorStateList) {
            return;
        }
        this.f55932n = colorStateList;
        k0();
    }

    /* renamed from: Z */
    public void m58230Z(int i) {
        if (i == this.f55926h) {
            return;
        }
        this.f55926h = i;
        k0();
    }

    public void a0(int i, int i2, int i3, int i4) {
        this.f55920b.set(i, i2, i3, i4);
        f0();
    }

    /* renamed from: b */
    public void m58231b(boolean z) {
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? 1.0f - this.f55942x : this.f55942x;
        ValueAnimator valueAnimator = this.f55938t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f55938t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f55942x, f);
        this.f55938t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xta
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f54276a.m58204G(valueAnimator2);
            }
        });
        this.f55938t.setInterpolator(this.f55939u);
        this.f55938t.setDuration((long) ((z ? this.f55940v : this.f55941w) * f2));
        this.f55938t.start();
    }

    public final boolean b0() {
        return this.f55919a.getPreventCornerOverlap() && !m58236g();
    }

    /* renamed from: c */
    public final float m58232c() {
        return Math.max(Math.max(m58233d(this.f55931m.m57937q(), this.f55921c.m60108N()), m58233d(this.f55931m.m57939s(), this.f55921c.m60109O())), Math.max(m58233d(this.f55931m.m57932k(), this.f55921c.m60133x()), m58233d(this.f55931m.m57930i(), this.f55921c.m60132w())));
    }

    public final boolean c0() {
        return this.f55919a.getPreventCornerOverlap() && m58236g() && this.f55919a.getUseCompatPadding();
    }

    /* renamed from: d */
    public final float m58233d(o74 o74Var, float f) {
        if (o74Var instanceof yue) {
            return (float) ((1.0d - f55917y) * f);
        }
        if (o74Var instanceof fk4) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        if (this.f55919a.isClickable()) {
            return true;
        }
        View view = this.f55919a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* renamed from: e */
    public final float m58234e() {
        return this.f55919a.getMaxCardElevation() + (c0() ? m58232c() : 0.0f);
    }

    public void e0() {
        Drawable drawable = this.f55927i;
        Drawable drawableM58247r = d0() ? m58247r() : this.f55922d;
        this.f55927i = drawableM58247r;
        if (drawable != drawableM58247r) {
            h0(drawableM58247r);
        }
    }

    /* renamed from: f */
    public final float m58235f() {
        return (this.f55919a.getMaxCardElevation() * 1.5f) + (c0() ? m58232c() : 0.0f);
    }

    public void f0() {
        int iM58232c = (int) ((b0() || c0() ? m58232c() : 0.0f) - m58249t());
        MaterialCardView materialCardView = this.f55919a;
        Rect rect = this.f55920b;
        materialCardView.m14273j(rect.left + iM58232c, rect.top + iM58232c, rect.right + iM58232c, rect.bottom + iM58232c);
    }

    /* renamed from: g */
    public final boolean m58236g() {
        return this.f55921c.m60118X();
    }

    public void g0() {
        this.f55921c.f0(this.f55919a.getCardElevation());
    }

    /* renamed from: h */
    public final Drawable m58237h() {
        this.f55935q = new zya(this.f55931m);
        return new RippleDrawable(this.f55929k, null, this.f55935q);
    }

    public final void h0(Drawable drawable) {
        if (this.f55919a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f55919a.getForeground()).setDrawable(drawable);
        } else {
            this.f55919a.setForeground(m58207B(drawable));
        }
    }

    /* renamed from: i */
    public void m58238i() {
        Drawable drawable = this.f55933o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f55933o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f55933o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void i0() {
        if (!m58208C()) {
            this.f55919a.setBackgroundInternal(m58207B(this.f55921c));
        }
        this.f55919a.setForeground(m58207B(this.f55927i));
    }

    /* renamed from: j */
    public zya m58239j() {
        return this.f55921c;
    }

    public final void j0() {
        Drawable drawable = this.f55933o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.f55929k);
        }
    }

    /* renamed from: k */
    public ColorStateList m58240k() {
        return this.f55921c.m60096B();
    }

    public void k0() {
        this.f55922d.q0(this.f55926h, this.f55932n);
    }

    /* renamed from: l */
    public ColorStateList m58241l() {
        return this.f55922d.m60096B();
    }

    /* renamed from: m */
    public Drawable m58242m() {
        return this.f55928j;
    }

    /* renamed from: n */
    public int m58243n() {
        return this.f55925g;
    }

    /* renamed from: o */
    public int m58244o() {
        return this.f55923e;
    }

    /* renamed from: p */
    public int m58245p() {
        return this.f55924f;
    }

    /* renamed from: q */
    public ColorStateList m58246q() {
        return this.f55930l;
    }

    /* renamed from: r */
    public final Drawable m58247r() {
        if (this.f55933o == null) {
            this.f55933o = m58237h();
        }
        if (this.f55934p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f55933o, this.f55922d, this.f55928j});
            this.f55934p = layerDrawable;
            layerDrawable.setId(2, n8e.mtrl_card_checked_layer_id);
        }
        return this.f55934p;
    }

    /* renamed from: s */
    public float m58248s() {
        return this.f55921c.m60108N();
    }

    /* renamed from: t */
    public final float m58249t() {
        if (this.f55919a.getPreventCornerOverlap() && this.f55919a.getUseCompatPadding()) {
            return (float) ((1.0d - f55917y) * this.f55919a.getCardViewRadius());
        }
        return 0.0f;
    }

    /* renamed from: u */
    public float m58250u() {
        return this.f55921c.m60097C();
    }

    /* renamed from: v */
    public ColorStateList m58251v() {
        return this.f55929k;
    }

    /* renamed from: w */
    public ykf m58252w() {
        return this.f55931m;
    }

    /* renamed from: x */
    public int m58253x() {
        ColorStateList colorStateList = this.f55932n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    public ColorStateList m58254y() {
        return this.f55932n;
    }

    /* renamed from: z */
    public int m58255z() {
        return this.f55926h;
    }
}
