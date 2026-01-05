package p001o;

/* loaded from: classes2.dex */
public final class hx5 {

    /* renamed from: c */
    public static final C14118a f27753c = new C14118a(null);

    /* renamed from: d */
    public static final hx5 f27754d;

    /* renamed from: a */
    public final apb f27755a;

    /* renamed from: b */
    public final apb f27756b;

    /* renamed from: o.hx5$a */
    public static final class C14118a {
        public C14118a() {
        }

        public /* synthetic */ C14118a(id5 id5Var) {
            this();
        }
    }

    static {
        Float fValueOf = Float.valueOf(0.0f);
        hwc hwcVarM53620a = vyh.m53620a(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        f27754d = new hx5(hwcVarM53620a, vyh.m53620a(fValueOf2, fValueOf2));
    }

    public hx5(hwc... hwcVarArr) {
        sq8.m48649h(hwcVarArr, "mappings");
        this.f27755a = new apb(hwcVarArr.length);
        this.f27756b = new apb(hwcVarArr.length);
        int length = hwcVarArr.length;
        for (int i = 0; i < length; i++) {
            this.f27755a.m17637h(((Number) hwcVarArr[i].m31229c()).floatValue());
            this.f27756b.m17637h(((Number) hwcVarArr[i].m31230d()).floatValue());
        }
        j37.m33173c(this.f27755a);
        j37.m33173c(this.f27756b);
    }

    /* renamed from: a */
    public final float m31263a(float f) {
        return j37.m33171a(this.f27755a, this.f27756b, f);
    }

    /* renamed from: b */
    public final float m31264b(float f) {
        return j37.m33171a(this.f27756b, this.f27755a, f);
    }
}
