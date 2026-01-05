package p001o;

/* loaded from: classes3.dex */
public class aed implements z24 {

    /* renamed from: a */
    public final String f14567a;

    /* renamed from: b */
    public final EnumC12150a f14568b;

    /* renamed from: c */
    public final fg0 f14569c;

    /* renamed from: d */
    public final tg0 f14570d;

    /* renamed from: e */
    public final fg0 f14571e;

    /* renamed from: f */
    public final fg0 f14572f;

    /* renamed from: g */
    public final fg0 f14573g;

    /* renamed from: h */
    public final fg0 f14574h;

    /* renamed from: i */
    public final fg0 f14575i;

    /* renamed from: j */
    public final boolean f14576j;

    /* renamed from: o.aed$a */
    public enum EnumC12150a {
        STAR(1),
        POLYGON(2);

        private final int value;

        EnumC12150a(int i) {
            this.value = i;
        }

        public static EnumC12150a forValue(int i) {
            for (EnumC12150a enumC12150a : values()) {
                if (enumC12150a.value == i) {
                    return enumC12150a;
                }
            }
            return null;
        }
    }

    public aed(String str, EnumC12150a enumC12150a, fg0 fg0Var, tg0 tg0Var, fg0 fg0Var2, fg0 fg0Var3, fg0 fg0Var4, fg0 fg0Var5, fg0 fg0Var6, boolean z) {
        this.f14567a = str;
        this.f14568b = enumC12150a;
        this.f14569c = fg0Var;
        this.f14570d = tg0Var;
        this.f14571e = fg0Var2;
        this.f14572f = fg0Var3;
        this.f14573g = fg0Var4;
        this.f14574h = fg0Var5;
        this.f14575i = fg0Var6;
        this.f14576j = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new zdd(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public fg0 m16968b() {
        return this.f14572f;
    }

    /* renamed from: c */
    public fg0 m16969c() {
        return this.f14574h;
    }

    /* renamed from: d */
    public String m16970d() {
        return this.f14567a;
    }

    /* renamed from: e */
    public fg0 m16971e() {
        return this.f14573g;
    }

    /* renamed from: f */
    public fg0 m16972f() {
        return this.f14575i;
    }

    /* renamed from: g */
    public fg0 m16973g() {
        return this.f14569c;
    }

    /* renamed from: h */
    public tg0 m16974h() {
        return this.f14570d;
    }

    /* renamed from: i */
    public fg0 m16975i() {
        return this.f14571e;
    }

    /* renamed from: j */
    public EnumC12150a m16976j() {
        return this.f14568b;
    }

    /* renamed from: k */
    public boolean m16977k() {
        return this.f14576j;
    }
}
