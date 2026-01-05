package p001o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes3.dex */
public class wta {

    /* renamed from: a */
    public final MaterialButton f52631a;

    /* renamed from: b */
    public ykf f52632b;

    /* renamed from: c */
    public w4g f52633c;

    /* renamed from: d */
    public z0g f52634d;

    /* renamed from: e */
    public int f52635e;

    /* renamed from: f */
    public int f52636f;

    /* renamed from: g */
    public int f52637g;

    /* renamed from: h */
    public int f52638h;

    /* renamed from: i */
    public int f52639i;

    /* renamed from: j */
    public int f52640j;

    /* renamed from: k */
    public PorterDuff.Mode f52641k;

    /* renamed from: l */
    public ColorStateList f52642l;

    /* renamed from: m */
    public ColorStateList f52643m;

    /* renamed from: n */
    public ColorStateList f52644n;

    /* renamed from: o */
    public Drawable f52645o;

    /* renamed from: s */
    public boolean f52649s;

    /* renamed from: u */
    public LayerDrawable f52651u;

    /* renamed from: v */
    public int f52652v;

    /* renamed from: p */
    public boolean f52646p = false;

    /* renamed from: q */
    public boolean f52647q = false;

    /* renamed from: r */
    public boolean f52648r = false;

    /* renamed from: t */
    public boolean f52650t = true;

    public wta(MaterialButton materialButton, ykf ykfVar) {
        this.f52631a = materialButton;
        this.f52632b = ykfVar;
    }

    /* renamed from: A */
    public void m54958A(int i) {
        m54968K(i, this.f52638h);
    }

    /* renamed from: B */
    public void m54959B(ColorStateList colorStateList) {
        if (this.f52644n != colorStateList) {
            this.f52644n = colorStateList;
            if (this.f52631a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f52631a.getBackground()).setColor(gue.m29519d(colorStateList));
            }
        }
    }

    /* renamed from: C */
    public void m54960C(ykf ykfVar) {
        this.f52632b = ykfVar;
        this.f52633c = null;
        m54970M();
    }

    /* renamed from: D */
    public void m54961D(boolean z) {
        this.f52646p = z;
        m54971N();
    }

    /* renamed from: E */
    public void m54962E(w4g w4gVar) {
        this.f52633c = w4gVar;
        m54970M();
    }

    /* renamed from: F */
    public void m54963F(ColorStateList colorStateList) {
        if (this.f52643m != colorStateList) {
            this.f52643m = colorStateList;
            m54971N();
        }
    }

    /* renamed from: G */
    public void m54964G(int i) {
        if (this.f52640j != i) {
            this.f52640j = i;
            m54971N();
        }
    }

    /* renamed from: H */
    public void m54965H(ColorStateList colorStateList) {
        if (this.f52642l != colorStateList) {
            this.f52642l = colorStateList;
            if (m54979g() != null) {
                m54979g().setTintList(this.f52642l);
            }
        }
    }

    /* renamed from: I */
    public void m54966I(PorterDuff.Mode mode) {
        if (this.f52641k != mode) {
            this.f52641k = mode;
            if (m54979g() == null || this.f52641k == null) {
                return;
            }
            m54979g().setTintMode(this.f52641k);
        }
    }

    /* renamed from: J */
    public void m54967J(boolean z) {
        this.f52650t = z;
    }

    /* renamed from: K */
    public final void m54968K(int i, int i2) {
        int paddingStart = this.f52631a.getPaddingStart();
        int paddingTop = this.f52631a.getPaddingTop();
        int paddingEnd = this.f52631a.getPaddingEnd();
        int paddingBottom = this.f52631a.getPaddingBottom();
        int i3 = this.f52637g;
        int i4 = this.f52638h;
        this.f52638h = i2;
        this.f52637g = i;
        if (!this.f52647q) {
            m54969L();
        }
        this.f52631a.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: L */
    public final void m54969L() {
        this.f52631a.setInternalBackground(m54973a());
        zya zyaVarM54979g = m54979g();
        if (zyaVarM54979g != null) {
            zyaVarM54979g.f0(this.f52652v);
            zyaVarM54979g.setState(this.f52631a.getDrawableState());
        }
    }

    /* renamed from: M */
    public final void m54970M() {
        zya zyaVarM54979g = m54979g();
        if (zyaVarM54979g != null) {
            w4g w4gVar = this.f52633c;
            if (w4gVar != null) {
                zyaVarM54979g.o0(w4gVar);
            } else {
                zyaVarM54979g.setShapeAppearanceModel(this.f52632b);
            }
            z0g z0gVar = this.f52634d;
            if (z0gVar != null) {
                zyaVarM54979g.e0(z0gVar);
            }
        }
        zya zyaVarM54988p = m54988p();
        if (zyaVarM54988p != null) {
            w4g w4gVar2 = this.f52633c;
            if (w4gVar2 != null) {
                zyaVarM54988p.o0(w4gVar2);
            } else {
                zyaVarM54988p.setShapeAppearanceModel(this.f52632b);
            }
            z0g z0gVar2 = this.f52634d;
            if (z0gVar2 != null) {
                zyaVarM54988p.e0(z0gVar2);
            }
        }
        rlf rlfVarM54978f = m54978f();
        if (rlfVarM54978f != null) {
            rlfVarM54978f.setShapeAppearanceModel(this.f52632b);
            if (rlfVarM54978f instanceof zya) {
                zya zyaVar = (zya) rlfVarM54978f;
                w4g w4gVar3 = this.f52633c;
                if (w4gVar3 != null) {
                    zyaVar.o0(w4gVar3);
                }
                z0g z0gVar3 = this.f52634d;
                if (z0gVar3 != null) {
                    zyaVar.e0(z0gVar3);
                }
            }
        }
    }

    /* renamed from: N */
    public final void m54971N() {
        zya zyaVarM54979g = m54979g();
        zya zyaVarM54988p = m54988p();
        if (zyaVarM54979g != null) {
            zyaVarM54979g.q0(this.f52640j, this.f52643m);
            if (zyaVarM54988p != null) {
                zyaVarM54988p.p0(this.f52640j, this.f52646p ? gua.m29505d(this.f52631a, x5e.colorSurface) : 0);
            }
        }
    }

    /* renamed from: O */
    public final InsetDrawable m54972O(Drawable drawable) {
        return new InsetDrawable(drawable, this.f52635e, this.f52637g, this.f52636f, this.f52638h);
    }

    /* renamed from: a */
    public final Drawable m54973a() {
        zya zyaVar = new zya(this.f52632b);
        w4g w4gVar = this.f52633c;
        if (w4gVar != null) {
            zyaVar.o0(w4gVar);
        }
        z0g z0gVar = this.f52634d;
        if (z0gVar != null) {
            zyaVar.e0(z0gVar);
        }
        zyaVar.m60115U(this.f52631a.getContext());
        zyaVar.setTintList(this.f52642l);
        PorterDuff.Mode mode = this.f52641k;
        if (mode != null) {
            zyaVar.setTintMode(mode);
        }
        zyaVar.q0(this.f52640j, this.f52643m);
        zya zyaVar2 = new zya(this.f52632b);
        w4g w4gVar2 = this.f52633c;
        if (w4gVar2 != null) {
            zyaVar2.o0(w4gVar2);
        }
        z0g z0gVar2 = this.f52634d;
        if (z0gVar2 != null) {
            zyaVar2.e0(z0gVar2);
        }
        zyaVar2.setTint(0);
        zyaVar2.p0(this.f52640j, this.f52646p ? gua.m29505d(this.f52631a, x5e.colorSurface) : 0);
        zya zyaVar3 = new zya(this.f52632b);
        this.f52645o = zyaVar3;
        w4g w4gVar3 = this.f52633c;
        if (w4gVar3 != null) {
            zyaVar3.o0(w4gVar3);
        }
        z0g z0gVar3 = this.f52634d;
        if (z0gVar3 != null) {
            ((zya) this.f52645o).e0(z0gVar3);
        }
        this.f52645o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(gue.m29519d(this.f52644n), m54972O(new LayerDrawable(new Drawable[]{zyaVar2, zyaVar})), this.f52645o);
        this.f52651u = rippleDrawable;
        return rippleDrawable;
    }

    /* renamed from: b */
    public int m54974b() {
        return this.f52639i;
    }

    /* renamed from: c */
    public z0g m54975c() {
        return this.f52634d;
    }

    /* renamed from: d */
    public int m54976d() {
        return this.f52638h;
    }

    /* renamed from: e */
    public int m54977e() {
        return this.f52637g;
    }

    /* renamed from: f */
    public rlf m54978f() {
        LayerDrawable layerDrawable = this.f52651u;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f52651u.getNumberOfLayers() > 2 ? (rlf) this.f52651u.getDrawable(2) : (rlf) this.f52651u.getDrawable(1);
    }

    /* renamed from: g */
    public zya m54979g() {
        return m54980h(false);
    }

    /* renamed from: h */
    public final zya m54980h(boolean z) {
        LayerDrawable layerDrawable = this.f52651u;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (zya) ((LayerDrawable) ((InsetDrawable) this.f52651u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: i */
    public ColorStateList m54981i() {
        return this.f52644n;
    }

    /* renamed from: j */
    public ykf m54982j() {
        return this.f52632b;
    }

    /* renamed from: k */
    public w4g m54983k() {
        return this.f52633c;
    }

    /* renamed from: l */
    public ColorStateList m54984l() {
        return this.f52643m;
    }

    /* renamed from: m */
    public int m54985m() {
        return this.f52640j;
    }

    /* renamed from: n */
    public ColorStateList m54986n() {
        return this.f52642l;
    }

    /* renamed from: o */
    public PorterDuff.Mode m54987o() {
        return this.f52641k;
    }

    /* renamed from: p */
    public final zya m54988p() {
        return m54980h(true);
    }

    /* renamed from: q */
    public boolean m54989q() {
        return this.f52647q;
    }

    /* renamed from: r */
    public boolean m54990r() {
        return this.f52649s;
    }

    /* renamed from: s */
    public boolean m54991s() {
        return this.f52650t;
    }

    /* renamed from: t */
    public void m54992t(TypedArray typedArray) {
        this.f52635e = typedArray.getDimensionPixelOffset(ebe.MaterialButton_android_insetLeft, 0);
        this.f52636f = typedArray.getDimensionPixelOffset(ebe.MaterialButton_android_insetRight, 0);
        this.f52637g = typedArray.getDimensionPixelOffset(ebe.MaterialButton_android_insetTop, 0);
        this.f52638h = typedArray.getDimensionPixelOffset(ebe.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(ebe.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(ebe.MaterialButton_cornerRadius, -1);
            this.f52639i = dimensionPixelSize;
            m54960C(this.f52632b.m57944x(dimensionPixelSize));
            this.f52648r = true;
        }
        this.f52640j = typedArray.getDimensionPixelSize(ebe.MaterialButton_strokeWidth, 0);
        this.f52641k = xzi.m57081q(typedArray.getInt(ebe.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f52642l = yya.m58494a(this.f52631a.getContext(), typedArray, ebe.MaterialButton_backgroundTint);
        this.f52643m = yya.m58494a(this.f52631a.getContext(), typedArray, ebe.MaterialButton_strokeColor);
        this.f52644n = yya.m58494a(this.f52631a.getContext(), typedArray, ebe.MaterialButton_rippleColor);
        this.f52649s = typedArray.getBoolean(ebe.MaterialButton_android_checkable, false);
        this.f52652v = typedArray.getDimensionPixelSize(ebe.MaterialButton_elevation, 0);
        this.f52650t = typedArray.getBoolean(ebe.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.f52631a.getPaddingStart();
        int paddingTop = this.f52631a.getPaddingTop();
        int paddingEnd = this.f52631a.getPaddingEnd();
        int paddingBottom = this.f52631a.getPaddingBottom();
        if (typedArray.hasValue(ebe.MaterialButton_android_background)) {
            m54994v();
        } else {
            m54969L();
        }
        this.f52631a.setPaddingRelative(paddingStart + this.f52635e, paddingTop + this.f52637g, paddingEnd + this.f52636f, paddingBottom + this.f52638h);
    }

    /* renamed from: u */
    public void m54993u(int i) {
        if (m54979g() != null) {
            m54979g().setTint(i);
        }
    }

    /* renamed from: v */
    public void m54994v() {
        this.f52647q = true;
        this.f52631a.setSupportBackgroundTintList(this.f52642l);
        this.f52631a.setSupportBackgroundTintMode(this.f52641k);
    }

    /* renamed from: w */
    public void m54995w(boolean z) {
        this.f52649s = z;
    }

    /* renamed from: x */
    public void m54996x(int i) {
        if (this.f52648r && this.f52639i == i) {
            return;
        }
        this.f52639i = i;
        this.f52648r = true;
        m54960C(this.f52632b.m57944x(i));
    }

    /* renamed from: y */
    public void m54997y(z0g z0gVar) {
        this.f52634d = z0gVar;
        if (this.f52633c != null) {
            m54970M();
        }
    }

    /* renamed from: z */
    public void m54998z(int i) {
        m54968K(this.f52637g, i);
    }
}
