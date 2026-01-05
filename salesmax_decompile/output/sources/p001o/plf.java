package p001o;

/* loaded from: classes3.dex */
public class plf implements z24 {

    /* renamed from: a */
    public final String f40236a;

    /* renamed from: b */
    public final EnumC16137a f40237b;

    /* renamed from: c */
    public final fg0 f40238c;

    /* renamed from: d */
    public final fg0 f40239d;

    /* renamed from: e */
    public final fg0 f40240e;

    /* renamed from: f */
    public final boolean f40241f;

    /* renamed from: o.plf$a */
    public enum EnumC16137a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static EnumC16137a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public plf(String str, EnumC16137a enumC16137a, fg0 fg0Var, fg0 fg0Var2, fg0 fg0Var3, boolean z) {
        this.f40236a = str;
        this.f40237b = enumC16137a;
        this.f40238c = fg0Var;
        this.f40239d = fg0Var2;
        this.f40240e = fg0Var3;
        this.f40241f = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new txh(hc1Var, this);
    }

    /* renamed from: b */
    public fg0 m43848b() {
        return this.f40239d;
    }

    /* renamed from: c */
    public String m43849c() {
        return this.f40236a;
    }

    /* renamed from: d */
    public fg0 m43850d() {
        return this.f40240e;
    }

    /* renamed from: e */
    public fg0 m43851e() {
        return this.f40238c;
    }

    /* renamed from: f */
    public EnumC16137a m43852f() {
        return this.f40237b;
    }

    /* renamed from: g */
    public boolean m43853g() {
        return this.f40241f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f40238c + ", end: " + this.f40239d + ", offset: " + this.f40240e + "}";
    }
}
