package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class cwf {

    /* renamed from: a */
    public final dwf f18736a;

    /* renamed from: b */
    public final int[] f18737b;

    /* renamed from: c */
    public final int f18738c;

    /* renamed from: d */
    public final Object[] f18739d;

    /* renamed from: e */
    public final int f18740e;

    /* renamed from: f */
    public boolean f18741f;

    /* renamed from: g */
    public int f18742g;

    /* renamed from: h */
    public int f18743h;

    /* renamed from: i */
    public int f18744i;

    /* renamed from: j */
    public int f18745j;

    /* renamed from: k */
    public int f18746k;

    /* renamed from: l */
    public int f18747l;

    public cwf(dwf dwfVar) {
        sq8.m48649h(dwfVar, "table");
        this.f18736a = dwfVar;
        this.f18737b = dwfVar.m23910p();
        int iM23911r = dwfVar.m23911r();
        this.f18738c = iM23911r;
        this.f18739d = dwfVar.m23912v();
        this.f18740e = dwfVar.m23913w();
        this.f18743h = iM23911r;
        this.f18744i = -1;
    }

    /* renamed from: A */
    public final int m21897A(int i) {
        return fwf.m27614G(this.f18737b, i);
    }

    /* renamed from: B */
    public final boolean m21898B(int i) {
        return fwf.m27616I(this.f18737b, i);
    }

    /* renamed from: C */
    public final boolean m21899C(int i) {
        return fwf.m27617J(this.f18737b, i);
    }

    /* renamed from: D */
    public final boolean m21900D() {
        return m21931q() || this.f18742g == this.f18743h;
    }

    /* renamed from: E */
    public final boolean m21901E() {
        return fwf.m27619L(this.f18737b, this.f18742g);
    }

    /* renamed from: F */
    public final boolean m21902F(int i) {
        return fwf.m27619L(this.f18737b, i);
    }

    /* renamed from: G */
    public final Object m21903G() {
        int i;
        if (this.f18745j > 0 || (i = this.f18746k) >= this.f18747l) {
            return un3.f49155a.m51802a();
        }
        Object[] objArr = this.f18739d;
        this.f18746k = i + 1;
        return objArr[i];
    }

    /* renamed from: H */
    public final Object m21904H(int i) {
        if (fwf.m27619L(this.f18737b, i)) {
            return m21905I(this.f18737b, i);
        }
        return null;
    }

    /* renamed from: I */
    public final Object m21905I(int[] iArr, int i) {
        return fwf.m27619L(iArr, i) ? this.f18739d[fwf.m27623P(iArr, i)] : un3.f49155a.m51802a();
    }

    /* renamed from: J */
    public final int m21906J(int i) {
        return fwf.m27622O(this.f18737b, i);
    }

    /* renamed from: K */
    public final Object m21907K(int[] iArr, int i) {
        if (fwf.m27617J(iArr, i)) {
            return this.f18739d[fwf.m27624Q(iArr, i)];
        }
        return null;
    }

    /* renamed from: L */
    public final int m21908L(int i) {
        return fwf.m27625R(this.f18737b, i);
    }

    /* renamed from: M */
    public final void m21909M(int i) {
        if (!(this.f18745j == 0)) {
            go3.m29222v("Cannot reposition while in an empty region".toString());
            throw new qe9();
        }
        this.f18742g = i;
        int iM27625R = i < this.f18738c ? fwf.m27625R(this.f18737b, i) : -1;
        this.f18744i = iM27625R;
        if (iM27625R < 0) {
            this.f18743h = this.f18738c;
        } else {
            this.f18743h = iM27625R + fwf.m27614G(this.f18737b, iM27625R);
        }
        this.f18746k = 0;
        this.f18747l = 0;
    }

    /* renamed from: N */
    public final void m21910N(int i) {
        int iM27614G = fwf.m27614G(this.f18737b, i) + i;
        int i2 = this.f18742g;
        if (i2 >= i && i2 <= iM27614G) {
            this.f18744i = i;
            this.f18743h = iM27614G;
            this.f18746k = 0;
            this.f18747l = 0;
            return;
        }
        go3.m29222v(("Index " + i + " is not a parent of " + i2).toString());
        throw new qe9();
    }

    /* renamed from: O */
    public final int m21911O() {
        if (!(this.f18745j == 0)) {
            go3.m29222v("Cannot skip while in an empty region".toString());
            throw new qe9();
        }
        int iM27622O = fwf.m27619L(this.f18737b, this.f18742g) ? 1 : fwf.m27622O(this.f18737b, this.f18742g);
        int i = this.f18742g;
        this.f18742g = i + fwf.m27614G(this.f18737b, i);
        return iM27622O;
    }

    /* renamed from: P */
    public final void m21912P() {
        if (this.f18745j == 0) {
            this.f18742g = this.f18743h;
        } else {
            go3.m29222v("Cannot skip the enclosing group while in an empty region".toString());
            throw new qe9();
        }
    }

    /* renamed from: Q */
    public final void m21913Q() {
        if (this.f18745j <= 0) {
            if (!(fwf.m27625R(this.f18737b, this.f18742g) == this.f18744i)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i = this.f18742g;
            this.f18744i = i;
            this.f18743h = i + fwf.m27614G(this.f18737b, i);
            int i2 = this.f18742g;
            int i3 = i2 + 1;
            this.f18742g = i3;
            this.f18746k = fwf.m27627T(this.f18737b, i2);
            this.f18747l = i2 >= this.f18738c - 1 ? this.f18740e : fwf.m27612E(this.f18737b, i3);
        }
    }

    /* renamed from: R */
    public final void m21914R() {
        if (this.f18745j <= 0) {
            if (!fwf.m27619L(this.f18737b, this.f18742g)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            m21913Q();
        }
    }

    /* renamed from: a */
    public final sc0 m21915a(int i) {
        ArrayList arrayListM23909o = this.f18736a.m23909o();
        int iM27626S = fwf.m27626S(arrayListM23909o, i, this.f18738c);
        if (iM27626S < 0) {
            sc0 sc0Var = new sc0(i);
            arrayListM23909o.add(-(iM27626S + 1), sc0Var);
            return sc0Var;
        }
        Object obj = arrayListM23909o.get(iM27626S);
        sq8.m48648g(obj, "get(location)");
        return (sc0) obj;
    }

    /* renamed from: b */
    public final Object m21916b(int[] iArr, int i) {
        return fwf.m27615H(iArr, i) ? this.f18739d[fwf.m27608A(iArr, i)] : un3.f49155a.m51802a();
    }

    /* renamed from: c */
    public final void m21917c() {
        this.f18745j++;
    }

    /* renamed from: d */
    public final void m21918d() {
        this.f18741f = true;
        this.f18736a.m23907j(this);
    }

    /* renamed from: e */
    public final boolean m21919e(int i) {
        return fwf.m27610C(this.f18737b, i);
    }

    /* renamed from: f */
    public final void m21920f() {
        int i = this.f18745j;
        if (!(i > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.f18745j = i - 1;
    }

    /* renamed from: g */
    public final void m21921g() {
        if (this.f18745j == 0) {
            if (!(this.f18742g == this.f18743h)) {
                go3.m29222v("endGroup() not called at the end of a group".toString());
                throw new qe9();
            }
            int iM27625R = fwf.m27625R(this.f18737b, this.f18744i);
            this.f18744i = iM27625R;
            this.f18743h = iM27625R < 0 ? this.f18738c : iM27625R + fwf.m27614G(this.f18737b, iM27625R);
        }
    }

    /* renamed from: h */
    public final List m21922h() {
        ArrayList arrayList = new ArrayList();
        if (this.f18745j > 0) {
            return arrayList;
        }
        int iM27614G = this.f18742g;
        int i = 0;
        while (iM27614G < this.f18743h) {
            arrayList.add(new tc9(fwf.m27620M(this.f18737b, iM27614G), m21907K(this.f18737b, iM27614G), iM27614G, fwf.m27619L(this.f18737b, iM27614G) ? 1 : fwf.m27622O(this.f18737b, iM27614G), i));
            iM27614G += fwf.m27614G(this.f18737b, iM27614G);
            i++;
        }
        return arrayList;
    }

    /* renamed from: i */
    public final boolean m21923i() {
        return this.f18741f;
    }

    /* renamed from: j */
    public final int m21924j() {
        return this.f18742g;
    }

    /* renamed from: k */
    public final Object m21925k() {
        int i = this.f18742g;
        if (i < this.f18743h) {
            return m21916b(this.f18737b, i);
        }
        return 0;
    }

    /* renamed from: l */
    public final int m21926l() {
        return this.f18743h;
    }

    /* renamed from: m */
    public final int m21927m() {
        int i = this.f18742g;
        if (i < this.f18743h) {
            return fwf.m27620M(this.f18737b, i);
        }
        return 0;
    }

    /* renamed from: n */
    public final Object m21928n() {
        int i = this.f18742g;
        if (i < this.f18743h) {
            return m21907K(this.f18737b, i);
        }
        return null;
    }

    /* renamed from: o */
    public final int m21929o() {
        return fwf.m27614G(this.f18737b, this.f18742g);
    }

    /* renamed from: p */
    public final int m21930p() {
        return this.f18746k - fwf.m27627T(this.f18737b, this.f18744i);
    }

    /* renamed from: q */
    public final boolean m21931q() {
        return this.f18745j > 0;
    }

    /* renamed from: r */
    public final int m21932r() {
        return this.f18744i;
    }

    /* renamed from: s */
    public final int m21933s() {
        int i = this.f18744i;
        if (i >= 0) {
            return fwf.m27622O(this.f18737b, i);
        }
        return 0;
    }

    /* renamed from: t */
    public final int m21934t() {
        return this.f18738c;
    }

    public String toString() {
        return "SlotReader(current=" + this.f18742g + ", key=" + m21927m() + ", parent=" + this.f18744i + ", end=" + this.f18743h + ')';
    }

    /* renamed from: u */
    public final dwf m21935u() {
        return this.f18736a;
    }

    /* renamed from: v */
    public final Object m21936v(int i) {
        return m21916b(this.f18737b, i);
    }

    /* renamed from: w */
    public final Object m21937w(int i) {
        return m21938x(this.f18742g, i);
    }

    /* renamed from: x */
    public final Object m21938x(int i, int i2) {
        int iM27627T = fwf.m27627T(this.f18737b, i);
        int i3 = i + 1;
        int i4 = iM27627T + i2;
        return i4 < (i3 < this.f18738c ? fwf.m27612E(this.f18737b, i3) : this.f18740e) ? this.f18739d[i4] : un3.f49155a.m51802a();
    }

    /* renamed from: y */
    public final int m21939y(int i) {
        return fwf.m27620M(this.f18737b, i);
    }

    /* renamed from: z */
    public final Object m21940z(int i) {
        return m21907K(this.f18737b, i);
    }
}
