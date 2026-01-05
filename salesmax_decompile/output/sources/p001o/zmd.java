package p001o;

/* loaded from: classes2.dex */
public final class zmd {

    /* renamed from: d */
    public static final C18685a f57414d = new C18685a(null);

    /* renamed from: e */
    public static final zmd f57415e = new zmd(0.0f, ace.m16885b(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a */
    public final float f57416a;

    /* renamed from: b */
    public final wb3 f57417b;

    /* renamed from: c */
    public final int f57418c;

    /* renamed from: o.zmd$a */
    public static final class C18685a {
        public C18685a() {
        }

        public /* synthetic */ C18685a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final zmd m59627a() {
            return zmd.f57415e;
        }
    }

    public zmd(float f, wb3 wb3Var, int i) {
        sq8.m48649h(wb3Var, "range");
        this.f57416a = f;
        this.f57417b = wb3Var;
        this.f57418c = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    /* renamed from: b */
    public final float m59624b() {
        return this.f57416a;
    }

    /* renamed from: c */
    public final wb3 m59625c() {
        return this.f57417b;
    }

    /* renamed from: d */
    public final int m59626d() {
        return this.f57418c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmd)) {
            return false;
        }
        zmd zmdVar = (zmd) obj;
        return ((this.f57416a > zmdVar.f57416a ? 1 : (this.f57416a == zmdVar.f57416a ? 0 : -1)) == 0) && sq8.m48644c(this.f57417b, zmdVar.f57417b) && this.f57418c == zmdVar.f57418c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f57416a) * 31) + this.f57417b.hashCode()) * 31) + this.f57418c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f57416a + ", range=" + this.f57417b + ", steps=" + this.f57418c + ')';
    }

    public /* synthetic */ zmd(float f, wb3 wb3Var, int i, int i2, id5 id5Var) {
        this(f, wb3Var, (i2 & 4) != 0 ? 0 : i);
    }
}
