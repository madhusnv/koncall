package p001o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public class ykf {

    /* renamed from: m */
    public static final n74 f55640m = new whe(0.5f);

    /* renamed from: a */
    public o74 f55641a;

    /* renamed from: b */
    public o74 f55642b;

    /* renamed from: c */
    public o74 f55643c;

    /* renamed from: d */
    public o74 f55644d;

    /* renamed from: e */
    public n74 f55645e;

    /* renamed from: f */
    public n74 f55646f;

    /* renamed from: g */
    public n74 f55647g;

    /* renamed from: h */
    public n74 f55648h;

    /* renamed from: i */
    public e36 f55649i;

    /* renamed from: j */
    public e36 f55650j;

    /* renamed from: k */
    public e36 f55651k;

    /* renamed from: l */
    public e36 f55652l;

    /* renamed from: o.ykf$c */
    public interface InterfaceC18427c {
        /* renamed from: a */
        n74 mo17823a(n74 n74Var);
    }

    /* renamed from: a */
    public static C18426b m57921a() {
        return new C18426b();
    }

    /* renamed from: b */
    public static C18426b m57922b(Context context, int i, int i2) {
        return m57923c(context, i, i2, 0);
    }

    /* renamed from: c */
    public static C18426b m57923c(Context context, int i, int i2, int i3) {
        return m57924d(context, i, i2, new o6(i3));
    }

    /* renamed from: d */
    public static C18426b m57924d(Context context, int i, int i2, n74 n74Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ebe.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(ebe.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(ebe.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(ebe.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(ebe.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(ebe.ShapeAppearance_cornerFamilyBottomLeft, i3);
            n74 n74VarM57928m = m57928m(typedArrayObtainStyledAttributes, ebe.ShapeAppearance_cornerSize, n74Var);
            n74 n74VarM57928m2 = m57928m(typedArrayObtainStyledAttributes, ebe.ShapeAppearance_cornerSizeTopLeft, n74VarM57928m);
            n74 n74VarM57928m3 = m57928m(typedArrayObtainStyledAttributes, ebe.ShapeAppearance_cornerSizeTopRight, n74VarM57928m);
            n74 n74VarM57928m4 = m57928m(typedArrayObtainStyledAttributes, ebe.ShapeAppearance_cornerSizeBottomRight, n74VarM57928m);
            return new C18426b().m57962C(i4, n74VarM57928m2).m57966G(i5, n74VarM57928m3).m57980x(i6, n74VarM57928m4).m57976t(i7, m57928m(typedArrayObtainStyledAttributes, ebe.ShapeAppearance_cornerSizeBottomLeft, n74VarM57928m));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static C18426b m57925e(Context context, AttributeSet attributeSet, int i, int i2) {
        return m57926f(context, attributeSet, i, i2, 0);
    }

    /* renamed from: f */
    public static C18426b m57926f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m57927g(context, attributeSet, i, i2, new o6(i3));
    }

    /* renamed from: g */
    public static C18426b m57927g(Context context, AttributeSet attributeSet, int i, int i2, n74 n74Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m57924d(context, resourceId, resourceId2, n74Var);
    }

    /* renamed from: m */
    public static n74 m57928m(TypedArray typedArray, int i, n74 n74Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return n74Var;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new o6(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new whe(typedValuePeekValue.getFraction(1.0f, 1.0f)) : n74Var;
    }

    /* renamed from: h */
    public e36 m57929h() {
        return this.f55651k;
    }

    /* renamed from: i */
    public o74 m57930i() {
        return this.f55644d;
    }

    /* renamed from: j */
    public n74 m57931j() {
        return this.f55648h;
    }

    /* renamed from: k */
    public o74 m57932k() {
        return this.f55643c;
    }

    /* renamed from: l */
    public n74 m57933l() {
        return this.f55647g;
    }

    /* renamed from: n */
    public e36 m57934n() {
        return this.f55652l;
    }

    /* renamed from: o */
    public e36 m57935o() {
        return this.f55650j;
    }

    /* renamed from: p */
    public e36 m57936p() {
        return this.f55649i;
    }

    /* renamed from: q */
    public o74 m57937q() {
        return this.f55641a;
    }

    /* renamed from: r */
    public n74 m57938r() {
        return this.f55645e;
    }

    /* renamed from: s */
    public o74 m57939s() {
        return this.f55642b;
    }

    /* renamed from: t */
    public n74 m57940t() {
        return this.f55646f;
    }

    public String toString() {
        return "[" + m57938r() + ", " + m57940t() + ", " + m57933l() + ", " + m57931j() + "]";
    }

    /* renamed from: u */
    public boolean m57941u() {
        return (this.f55642b instanceof yue) && (this.f55641a instanceof yue) && (this.f55643c instanceof yue) && (this.f55644d instanceof yue);
    }

    /* renamed from: v */
    public boolean m57942v(RectF rectF) {
        boolean z = this.f55652l.getClass().equals(e36.class) && this.f55650j.getClass().equals(e36.class) && this.f55649i.getClass().equals(e36.class) && this.f55651k.getClass().equals(e36.class);
        float fMo20547a = this.f55645e.mo20547a(rectF);
        return z && ((this.f55646f.mo20547a(rectF) > fMo20547a ? 1 : (this.f55646f.mo20547a(rectF) == fMo20547a ? 0 : -1)) == 0 && (this.f55648h.mo20547a(rectF) > fMo20547a ? 1 : (this.f55648h.mo20547a(rectF) == fMo20547a ? 0 : -1)) == 0 && (this.f55647g.mo20547a(rectF) > fMo20547a ? 1 : (this.f55647g.mo20547a(rectF) == fMo20547a ? 0 : -1)) == 0) && m57941u();
    }

    /* renamed from: w */
    public C18426b m57943w() {
        return new C18426b(this);
    }

    /* renamed from: x */
    public ykf m57944x(float f) {
        return m57943w().m57971o(f).m57970m();
    }

    /* renamed from: y */
    public ykf m57945y(n74 n74Var) {
        return m57943w().m57972p(n74Var).m57970m();
    }

    /* renamed from: z */
    public ykf m57946z(InterfaceC18427c interfaceC18427c) {
        return m57943w().m57965F(interfaceC18427c.mo17823a(m57938r())).m57969J(interfaceC18427c.mo17823a(m57940t())).m57979w(interfaceC18427c.mo17823a(m57931j())).m57960A(interfaceC18427c.mo17823a(m57933l())).m57970m();
    }

    public ykf(C18426b c18426b) {
        this.f55641a = c18426b.f55653a;
        this.f55642b = c18426b.f55654b;
        this.f55643c = c18426b.f55655c;
        this.f55644d = c18426b.f55656d;
        this.f55645e = c18426b.f55657e;
        this.f55646f = c18426b.f55658f;
        this.f55647g = c18426b.f55659g;
        this.f55648h = c18426b.f55660h;
        this.f55649i = c18426b.f55661i;
        this.f55650j = c18426b.f55662j;
        this.f55651k = c18426b.f55663k;
        this.f55652l = c18426b.f55664l;
    }

    /* renamed from: o.ykf$b */
    public static final class C18426b {

        /* renamed from: a */
        public o74 f55653a;

        /* renamed from: b */
        public o74 f55654b;

        /* renamed from: c */
        public o74 f55655c;

        /* renamed from: d */
        public o74 f55656d;

        /* renamed from: e */
        public n74 f55657e;

        /* renamed from: f */
        public n74 f55658f;

        /* renamed from: g */
        public n74 f55659g;

        /* renamed from: h */
        public n74 f55660h;

        /* renamed from: i */
        public e36 f55661i;

        /* renamed from: j */
        public e36 f55662j;

        /* renamed from: k */
        public e36 f55663k;

        /* renamed from: l */
        public e36 f55664l;

        public C18426b() {
            this.f55653a = aza.m18041b();
            this.f55654b = aza.m18041b();
            this.f55655c = aza.m18041b();
            this.f55656d = aza.m18041b();
            this.f55657e = new o6(0.0f);
            this.f55658f = new o6(0.0f);
            this.f55659g = new o6(0.0f);
            this.f55660h = new o6(0.0f);
            this.f55661i = aza.m18042c();
            this.f55662j = aza.m18042c();
            this.f55663k = aza.m18042c();
            this.f55664l = aza.m18042c();
        }

        /* renamed from: n */
        public static float m57959n(o74 o74Var) {
            if (o74Var instanceof yue) {
                return ((yue) o74Var).f56072a;
            }
            if (o74Var instanceof fk4) {
                return ((fk4) o74Var).f23549a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public C18426b m57960A(n74 n74Var) {
            this.f55659g = n74Var;
            return this;
        }

        /* renamed from: B */
        public C18426b m57961B(e36 e36Var) {
            this.f55661i = e36Var;
            return this;
        }

        /* renamed from: C */
        public C18426b m57962C(int i, n74 n74Var) {
            return m57963D(aza.m18040a(i)).m57965F(n74Var);
        }

        /* renamed from: D */
        public C18426b m57963D(o74 o74Var) {
            this.f55653a = o74Var;
            float fM57959n = m57959n(o74Var);
            if (fM57959n != -1.0f) {
                m57964E(fM57959n);
            }
            return this;
        }

        /* renamed from: E */
        public C18426b m57964E(float f) {
            this.f55657e = new o6(f);
            return this;
        }

        /* renamed from: F */
        public C18426b m57965F(n74 n74Var) {
            this.f55657e = n74Var;
            return this;
        }

        /* renamed from: G */
        public C18426b m57966G(int i, n74 n74Var) {
            return m57967H(aza.m18040a(i)).m57969J(n74Var);
        }

        /* renamed from: H */
        public C18426b m57967H(o74 o74Var) {
            this.f55654b = o74Var;
            float fM57959n = m57959n(o74Var);
            if (fM57959n != -1.0f) {
                m57968I(fM57959n);
            }
            return this;
        }

        /* renamed from: I */
        public C18426b m57968I(float f) {
            this.f55658f = new o6(f);
            return this;
        }

        /* renamed from: J */
        public C18426b m57969J(n74 n74Var) {
            this.f55658f = n74Var;
            return this;
        }

        /* renamed from: m */
        public ykf m57970m() {
            return new ykf(this);
        }

        /* renamed from: o */
        public C18426b m57971o(float f) {
            return m57964E(f).m57968I(f).m57982z(f).m57978v(f);
        }

        /* renamed from: p */
        public C18426b m57972p(n74 n74Var) {
            return m57965F(n74Var).m57969J(n74Var).m57960A(n74Var).m57979w(n74Var);
        }

        /* renamed from: q */
        public C18426b m57973q(int i, float f) {
            return m57974r(aza.m18040a(i)).m57971o(f);
        }

        /* renamed from: r */
        public C18426b m57974r(o74 o74Var) {
            return m57963D(o74Var).m57967H(o74Var).m57981y(o74Var).m57977u(o74Var);
        }

        /* renamed from: s */
        public C18426b m57975s(e36 e36Var) {
            this.f55663k = e36Var;
            return this;
        }

        /* renamed from: t */
        public C18426b m57976t(int i, n74 n74Var) {
            return m57977u(aza.m18040a(i)).m57979w(n74Var);
        }

        /* renamed from: u */
        public C18426b m57977u(o74 o74Var) {
            this.f55656d = o74Var;
            float fM57959n = m57959n(o74Var);
            if (fM57959n != -1.0f) {
                m57978v(fM57959n);
            }
            return this;
        }

        /* renamed from: v */
        public C18426b m57978v(float f) {
            this.f55660h = new o6(f);
            return this;
        }

        /* renamed from: w */
        public C18426b m57979w(n74 n74Var) {
            this.f55660h = n74Var;
            return this;
        }

        /* renamed from: x */
        public C18426b m57980x(int i, n74 n74Var) {
            return m57981y(aza.m18040a(i)).m57960A(n74Var);
        }

        /* renamed from: y */
        public C18426b m57981y(o74 o74Var) {
            this.f55655c = o74Var;
            float fM57959n = m57959n(o74Var);
            if (fM57959n != -1.0f) {
                m57982z(fM57959n);
            }
            return this;
        }

        /* renamed from: z */
        public C18426b m57982z(float f) {
            this.f55659g = new o6(f);
            return this;
        }

        public C18426b(ykf ykfVar) {
            this.f55653a = aza.m18041b();
            this.f55654b = aza.m18041b();
            this.f55655c = aza.m18041b();
            this.f55656d = aza.m18041b();
            this.f55657e = new o6(0.0f);
            this.f55658f = new o6(0.0f);
            this.f55659g = new o6(0.0f);
            this.f55660h = new o6(0.0f);
            this.f55661i = aza.m18042c();
            this.f55662j = aza.m18042c();
            this.f55663k = aza.m18042c();
            this.f55664l = aza.m18042c();
            this.f55653a = ykfVar.f55641a;
            this.f55654b = ykfVar.f55642b;
            this.f55655c = ykfVar.f55643c;
            this.f55656d = ykfVar.f55644d;
            this.f55657e = ykfVar.f55645e;
            this.f55658f = ykfVar.f55646f;
            this.f55659g = ykfVar.f55647g;
            this.f55660h = ykfVar.f55648h;
            this.f55661i = ykfVar.f55649i;
            this.f55662j = ykfVar.f55650j;
            this.f55663k = ykfVar.f55651k;
            this.f55664l = ykfVar.f55652l;
        }
    }

    public ykf() {
        this.f55641a = aza.m18041b();
        this.f55642b = aza.m18041b();
        this.f55643c = aza.m18041b();
        this.f55644d = aza.m18041b();
        this.f55645e = new o6(0.0f);
        this.f55646f = new o6(0.0f);
        this.f55647g = new o6(0.0f);
        this.f55648h = new o6(0.0f);
        this.f55649i = aza.m18042c();
        this.f55650j = aza.m18042c();
        this.f55651k = aza.m18042c();
        this.f55652l = aza.m18042c();
    }
}
