package p001o;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class nyh {

    /* renamed from: a */
    public String f37406a;

    /* renamed from: b */
    public int f37407b;

    /* renamed from: c */
    public boolean f37408c;

    /* renamed from: d */
    public int f37409d;

    /* renamed from: e */
    public boolean f37410e;

    /* renamed from: k */
    public float f37416k;

    /* renamed from: l */
    public String f37417l;

    /* renamed from: o */
    public Layout.Alignment f37420o;

    /* renamed from: p */
    public Layout.Alignment f37421p;

    /* renamed from: r */
    public zgh f37423r;

    /* renamed from: f */
    public int f37411f = -1;

    /* renamed from: g */
    public int f37412g = -1;

    /* renamed from: h */
    public int f37413h = -1;

    /* renamed from: i */
    public int f37414i = -1;

    /* renamed from: j */
    public int f37415j = -1;

    /* renamed from: m */
    public int f37418m = -1;

    /* renamed from: n */
    public int f37419n = -1;

    /* renamed from: q */
    public int f37422q = -1;

    /* renamed from: s */
    public float f37424s = Float.MAX_VALUE;

    /* renamed from: A */
    public nyh m41230A(String str) {
        this.f37417l = str;
        return this;
    }

    /* renamed from: B */
    public nyh m41231B(boolean z) {
        this.f37414i = z ? 1 : 0;
        return this;
    }

    /* renamed from: C */
    public nyh m41232C(boolean z) {
        this.f37411f = z ? 1 : 0;
        return this;
    }

    /* renamed from: D */
    public nyh m41233D(Layout.Alignment alignment) {
        this.f37421p = alignment;
        return this;
    }

    /* renamed from: E */
    public nyh m41234E(int i) {
        this.f37419n = i;
        return this;
    }

    /* renamed from: F */
    public nyh m41235F(int i) {
        this.f37418m = i;
        return this;
    }

    /* renamed from: G */
    public nyh m41236G(float f) {
        this.f37424s = f;
        return this;
    }

    /* renamed from: H */
    public nyh m41237H(Layout.Alignment alignment) {
        this.f37420o = alignment;
        return this;
    }

    /* renamed from: I */
    public nyh m41238I(boolean z) {
        this.f37422q = z ? 1 : 0;
        return this;
    }

    /* renamed from: J */
    public nyh m41239J(zgh zghVar) {
        this.f37423r = zghVar;
        return this;
    }

    /* renamed from: K */
    public nyh m41240K(boolean z) {
        this.f37412g = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public nyh m41241a(nyh nyhVar) {
        return m41258r(nyhVar, true);
    }

    /* renamed from: b */
    public int m41242b() {
        if (this.f37410e) {
            return this.f37409d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: c */
    public int m41243c() {
        if (this.f37408c) {
            return this.f37407b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: d */
    public String m41244d() {
        return this.f37406a;
    }

    /* renamed from: e */
    public float m41245e() {
        return this.f37416k;
    }

    /* renamed from: f */
    public int m41246f() {
        return this.f37415j;
    }

    /* renamed from: g */
    public String m41247g() {
        return this.f37417l;
    }

    /* renamed from: h */
    public Layout.Alignment m41248h() {
        return this.f37421p;
    }

    /* renamed from: i */
    public int m41249i() {
        return this.f37419n;
    }

    /* renamed from: j */
    public int m41250j() {
        return this.f37418m;
    }

    /* renamed from: k */
    public float m41251k() {
        return this.f37424s;
    }

    /* renamed from: l */
    public int m41252l() {
        int i = this.f37413h;
        if (i == -1 && this.f37414i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f37414i == 1 ? 2 : 0);
    }

    /* renamed from: m */
    public Layout.Alignment m41253m() {
        return this.f37420o;
    }

    /* renamed from: n */
    public boolean m41254n() {
        return this.f37422q == 1;
    }

    /* renamed from: o */
    public zgh m41255o() {
        return this.f37423r;
    }

    /* renamed from: p */
    public boolean m41256p() {
        return this.f37410e;
    }

    /* renamed from: q */
    public boolean m41257q() {
        return this.f37408c;
    }

    /* renamed from: r */
    public final nyh m41258r(nyh nyhVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (nyhVar != null) {
            if (!this.f37408c && nyhVar.f37408c) {
                m41263w(nyhVar.f37407b);
            }
            if (this.f37413h == -1) {
                this.f37413h = nyhVar.f37413h;
            }
            if (this.f37414i == -1) {
                this.f37414i = nyhVar.f37414i;
            }
            if (this.f37406a == null && (str = nyhVar.f37406a) != null) {
                this.f37406a = str;
            }
            if (this.f37411f == -1) {
                this.f37411f = nyhVar.f37411f;
            }
            if (this.f37412g == -1) {
                this.f37412g = nyhVar.f37412g;
            }
            if (this.f37419n == -1) {
                this.f37419n = nyhVar.f37419n;
            }
            if (this.f37420o == null && (alignment2 = nyhVar.f37420o) != null) {
                this.f37420o = alignment2;
            }
            if (this.f37421p == null && (alignment = nyhVar.f37421p) != null) {
                this.f37421p = alignment;
            }
            if (this.f37422q == -1) {
                this.f37422q = nyhVar.f37422q;
            }
            if (this.f37415j == -1) {
                this.f37415j = nyhVar.f37415j;
                this.f37416k = nyhVar.f37416k;
            }
            if (this.f37423r == null) {
                this.f37423r = nyhVar.f37423r;
            }
            if (this.f37424s == Float.MAX_VALUE) {
                this.f37424s = nyhVar.f37424s;
            }
            if (z && !this.f37410e && nyhVar.f37410e) {
                m41261u(nyhVar.f37409d);
            }
            if (z && this.f37418m == -1 && (i = nyhVar.f37418m) != -1) {
                this.f37418m = i;
            }
        }
        return this;
    }

    /* renamed from: s */
    public boolean m41259s() {
        return this.f37411f == 1;
    }

    /* renamed from: t */
    public boolean m41260t() {
        return this.f37412g == 1;
    }

    /* renamed from: u */
    public nyh m41261u(int i) {
        this.f37409d = i;
        this.f37410e = true;
        return this;
    }

    /* renamed from: v */
    public nyh m41262v(boolean z) {
        this.f37413h = z ? 1 : 0;
        return this;
    }

    /* renamed from: w */
    public nyh m41263w(int i) {
        this.f37407b = i;
        this.f37408c = true;
        return this;
    }

    /* renamed from: x */
    public nyh m41264x(String str) {
        this.f37406a = str;
        return this;
    }

    /* renamed from: y */
    public nyh m41265y(float f) {
        this.f37416k = f;
        return this;
    }

    /* renamed from: z */
    public nyh m41266z(int i) {
        this.f37415j = i;
        return this;
    }
}
