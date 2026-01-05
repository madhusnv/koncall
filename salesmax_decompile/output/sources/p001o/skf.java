package p001o;

/* loaded from: classes2.dex */
public final class skf {

    /* renamed from: d */
    public static final C16856a f45526d = new C16856a(null);

    /* renamed from: e */
    public static final skf f45527e = new skf(0, 0, 0.0f, 7, null);

    /* renamed from: a */
    public final long f45528a;

    /* renamed from: b */
    public final long f45529b;

    /* renamed from: c */
    public final float f45530c;

    /* renamed from: o.skf$a */
    public static final class C16856a {
        public C16856a() {
        }

        public /* synthetic */ C16856a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ skf(long j, long j2, float f, id5 id5Var) {
        this(j, j2, f);
    }

    /* renamed from: a */
    public final float m48447a() {
        return this.f45530c;
    }

    /* renamed from: b */
    public final long m48448b() {
        return this.f45528a;
    }

    /* renamed from: c */
    public final long m48449c() {
        return this.f45529b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skf)) {
            return false;
        }
        skf skfVar = (skf) obj;
        if (lh3.m37200i(this.f45528a, skfVar.f45528a) && s9c.m48050i(this.f45529b, skfVar.f45529b)) {
            return (this.f45530c > skfVar.f45530c ? 1 : (this.f45530c == skfVar.f45530c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((lh3.m37206o(this.f45528a) * 31) + s9c.m48054m(this.f45529b)) * 31) + Float.hashCode(this.f45530c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) lh3.m37207p(this.f45528a)) + ", offset=" + ((Object) s9c.m48058q(this.f45529b)) + ", blurRadius=" + this.f45530c + ')';
    }

    public skf(long j, long j2, float f) {
        this.f45528a = j;
        this.f45529b = j2;
        this.f45530c = f;
    }

    public /* synthetic */ skf(long j, long j2, float f, int i, id5 id5Var) {
        this((i & 1) != 0 ? rh3.m46768c(4278190080L) : j, (i & 2) != 0 ? s9c.f45035b.m48063c() : j2, (i & 4) != 0 ? 0.0f : f, null);
    }
}
