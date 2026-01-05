package p001o;

/* loaded from: classes5.dex */
public class fb9 extends pa9 {

    /* renamed from: c */
    public final fb9 f23089c;

    /* renamed from: d */
    public i16 f23090d;

    /* renamed from: e */
    public fb9 f23091e;

    /* renamed from: f */
    public String f23092f;

    /* renamed from: g */
    public Object f23093g;

    /* renamed from: h */
    public boolean f23094h;

    public fb9(int i, fb9 fb9Var, i16 i16Var) {
        this.f39703a = i;
        this.f23089c = fb9Var;
        this.f23090d = i16Var;
        this.f39704b = -1;
    }

    /* renamed from: l */
    public static fb9 m26379l(i16 i16Var) {
        return new fb9(0, null, i16Var);
    }

    @Override // p001o.pa9
    /* renamed from: b */
    public final String mo26380b() {
        return this.f23092f;
    }

    /* renamed from: h */
    public final void m26381h(i16 i16Var, String str) throws a99 {
        if (i16Var.m31360c(str)) {
            Object objM31359b = i16Var.m31359b();
            throw new a99("Duplicate field '" + str + "'", objM31359b instanceof b99 ? (b99) objM31359b : null);
        }
    }

    /* renamed from: i */
    public fb9 m26382i() {
        this.f23093g = null;
        return this.f23089c;
    }

    /* renamed from: j */
    public fb9 m26383j() {
        fb9 fb9Var = this.f23091e;
        if (fb9Var != null) {
            return fb9Var.m26385m(1);
        }
        i16 i16Var = this.f23090d;
        fb9 fb9Var2 = new fb9(1, this, i16Var == null ? null : i16Var.m31358a());
        this.f23091e = fb9Var2;
        return fb9Var2;
    }

    /* renamed from: k */
    public fb9 m26384k() {
        fb9 fb9Var = this.f23091e;
        if (fb9Var != null) {
            return fb9Var.m26385m(2);
        }
        i16 i16Var = this.f23090d;
        fb9 fb9Var2 = new fb9(2, this, i16Var == null ? null : i16Var.m31358a());
        this.f23091e = fb9Var2;
        return fb9Var2;
    }

    /* renamed from: m */
    public fb9 m26385m(int i) {
        this.f39703a = i;
        this.f39704b = -1;
        this.f23092f = null;
        this.f23094h = false;
        this.f23093g = null;
        i16 i16Var = this.f23090d;
        if (i16Var != null) {
            i16Var.m31361d();
        }
        return this;
    }

    /* renamed from: n */
    public int m26386n(String str) throws a99 {
        if (this.f39703a != 2 || this.f23094h) {
            return 4;
        }
        this.f23094h = true;
        this.f23092f = str;
        i16 i16Var = this.f23090d;
        if (i16Var != null) {
            m26381h(i16Var, str);
        }
        return this.f39704b < 0 ? 0 : 1;
    }

    /* renamed from: o */
    public int m26387o() {
        int i = this.f39703a;
        if (i == 2) {
            if (!this.f23094h) {
                return 5;
            }
            this.f23094h = false;
            this.f39704b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.f39704b;
            this.f39704b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = this.f39704b + 1;
        this.f39704b = i3;
        return i3 == 0 ? 0 : 3;
    }
}
