package p001o;

/* loaded from: classes5.dex */
public final class ia9 extends pa9 {

    /* renamed from: c */
    public final ia9 f28329c;

    /* renamed from: d */
    public i16 f28330d;

    /* renamed from: e */
    public ia9 f28331e;

    /* renamed from: f */
    public String f28332f;

    /* renamed from: g */
    public Object f28333g;

    /* renamed from: h */
    public int f28334h;

    /* renamed from: i */
    public int f28335i;

    public ia9(ia9 ia9Var, i16 i16Var, int i, int i2, int i3) {
        this.f28329c = ia9Var;
        this.f28330d = i16Var;
        this.f39703a = i;
        this.f28334h = i2;
        this.f28335i = i3;
        this.f39704b = -1;
    }

    /* renamed from: l */
    public static ia9 m31788l(i16 i16Var) {
        return new ia9(null, i16Var, 0, 1, 0);
    }

    @Override // p001o.pa9
    /* renamed from: b */
    public String mo26380b() {
        return this.f28332f;
    }

    /* renamed from: h */
    public final void m31789h(i16 i16Var, String str) throws ba9 {
        if (i16Var.m31360c(str)) {
            Object objM31359b = i16Var.m31359b();
            throw new ba9(objM31359b instanceof ca9 ? (ca9) objM31359b : null, "Duplicate field '" + str + "'");
        }
    }

    /* renamed from: i */
    public ia9 m31790i() {
        this.f28333g = null;
        return this.f28329c;
    }

    /* renamed from: j */
    public ia9 m31791j(int i, int i2) {
        ia9 ia9Var = this.f28331e;
        if (ia9Var == null) {
            i16 i16Var = this.f28330d;
            ia9Var = new ia9(this, i16Var == null ? null : i16Var.m31358a(), 1, i, i2);
            this.f28331e = ia9Var;
        } else {
            ia9Var.m31796p(1, i, i2);
        }
        return ia9Var;
    }

    /* renamed from: k */
    public ia9 m31792k(int i, int i2) {
        ia9 ia9Var = this.f28331e;
        if (ia9Var != null) {
            ia9Var.m31796p(2, i, i2);
            return ia9Var;
        }
        i16 i16Var = this.f28330d;
        ia9 ia9Var2 = new ia9(this, i16Var == null ? null : i16Var.m31358a(), 2, i, i2);
        this.f28331e = ia9Var2;
        return ia9Var2;
    }

    /* renamed from: m */
    public boolean m31793m() {
        int i = this.f39704b + 1;
        this.f39704b = i;
        return this.f39703a != 0 && i > 0;
    }

    /* renamed from: n */
    public ia9 m31794n() {
        return this.f28329c;
    }

    /* renamed from: o */
    public s99 m31795o(Object obj) {
        return new s99(obj, -1L, this.f28334h, this.f28335i);
    }

    /* renamed from: p */
    public void m31796p(int i, int i2, int i3) {
        this.f39703a = i;
        this.f39704b = -1;
        this.f28334h = i2;
        this.f28335i = i3;
        this.f28332f = null;
        this.f28333g = null;
        i16 i16Var = this.f28330d;
        if (i16Var != null) {
            i16Var.m31361d();
        }
    }

    /* renamed from: q */
    public void m31797q(String str) throws ba9 {
        this.f28332f = str;
        i16 i16Var = this.f28330d;
        if (i16Var != null) {
            m31789h(i16Var, str);
        }
    }
}
