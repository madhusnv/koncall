package p001o;

/* loaded from: classes6.dex */
public final class gvf {

    /* renamed from: d */
    public static final C13826a f25835d = new C13826a(null);

    /* renamed from: e */
    public static final gvf f25836e = new gvf(6, 4.0f, 0.0f, 4, null);

    /* renamed from: f */
    public static final gvf f25837f = new gvf(8, 0.0f, 0.0f, 6, null);

    /* renamed from: g */
    public static final gvf f25838g = new gvf(10, 6.0f, 0.0f, 4, null);

    /* renamed from: a */
    public final int f25839a;

    /* renamed from: b */
    public final float f25840b;

    /* renamed from: c */
    public final float f25841c;

    /* renamed from: o.gvf$a */
    public static final class C13826a {
        public C13826a() {
        }

        public /* synthetic */ C13826a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final gvf m29545a() {
            return gvf.f25838g;
        }

        /* renamed from: b */
        public final gvf m29546b() {
            return gvf.f25837f;
        }

        /* renamed from: c */
        public final gvf m29547c() {
            return gvf.f25836e;
        }
    }

    public gvf(int i, float f, float f2) {
        this.f25839a = i;
        this.f25840b = f;
        this.f25841c = f2;
        if (!(f == 0.0f)) {
            return;
        }
        throw new IllegalArgumentException(("mass=" + f + " must be != 0").toString());
    }

    /* renamed from: d */
    public final float m29542d() {
        return this.f25840b;
    }

    /* renamed from: e */
    public final float m29543e() {
        return this.f25841c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvf)) {
            return false;
        }
        gvf gvfVar = (gvf) obj;
        return this.f25839a == gvfVar.f25839a && Float.compare(this.f25840b, gvfVar.f25840b) == 0 && Float.compare(this.f25841c, gvfVar.f25841c) == 0;
    }

    /* renamed from: f */
    public final int m29544f() {
        return this.f25839a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f25839a) * 31) + Float.hashCode(this.f25840b)) * 31) + Float.hashCode(this.f25841c);
    }

    public String toString() {
        return "Size(sizeInDp=" + this.f25839a + ", mass=" + this.f25840b + ", massVariance=" + this.f25841c + ")";
    }

    public /* synthetic */ gvf(int i, float f, float f2, int i2, id5 id5Var) {
        this(i, (i2 & 2) != 0 ? 5.0f : f, (i2 & 4) != 0 ? 0.2f : f2);
    }
}
