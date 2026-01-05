package p001o;

/* loaded from: classes2.dex */
public final class tue {

    /* renamed from: i */
    public static final C17236a f47900i = new C17236a(null);

    /* renamed from: j */
    public static final tue f47901j = wue.m55030b(0.0f, 0.0f, 0.0f, 0.0f, k74.f31568a.m35101a());

    /* renamed from: a */
    public final float f47902a;

    /* renamed from: b */
    public final float f47903b;

    /* renamed from: c */
    public final float f47904c;

    /* renamed from: d */
    public final float f47905d;

    /* renamed from: e */
    public final long f47906e;

    /* renamed from: f */
    public final long f47907f;

    /* renamed from: g */
    public final long f47908g;

    /* renamed from: h */
    public final long f47909h;

    /* renamed from: o.tue$a */
    public static final class C17236a {
        public C17236a() {
        }

        public /* synthetic */ C17236a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tue(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, id5 id5Var) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: a */
    public final float m50684a() {
        return this.f47905d;
    }

    /* renamed from: b */
    public final long m50685b() {
        return this.f47909h;
    }

    /* renamed from: c */
    public final long m50686c() {
        return this.f47908g;
    }

    /* renamed from: d */
    public final float m50687d() {
        return this.f47902a;
    }

    /* renamed from: e */
    public final float m50688e() {
        return this.f47904c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tue)) {
            return false;
        }
        tue tueVar = (tue) obj;
        return Float.compare(this.f47902a, tueVar.f47902a) == 0 && Float.compare(this.f47903b, tueVar.f47903b) == 0 && Float.compare(this.f47904c, tueVar.f47904c) == 0 && Float.compare(this.f47905d, tueVar.f47905d) == 0 && k74.m35096c(this.f47906e, tueVar.f47906e) && k74.m35096c(this.f47907f, tueVar.f47907f) && k74.m35096c(this.f47908g, tueVar.f47908g) && k74.m35096c(this.f47909h, tueVar.f47909h);
    }

    /* renamed from: f */
    public final float m50689f() {
        return this.f47903b;
    }

    /* renamed from: g */
    public final long m50690g() {
        return this.f47906e;
    }

    /* renamed from: h */
    public final long m50691h() {
        return this.f47907f;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f47902a) * 31) + Float.hashCode(this.f47903b)) * 31) + Float.hashCode(this.f47904c)) * 31) + Float.hashCode(this.f47905d)) * 31) + k74.m35099f(this.f47906e)) * 31) + k74.m35099f(this.f47907f)) * 31) + k74.m35099f(this.f47908g)) * 31) + k74.m35099f(this.f47909h);
    }

    public String toString() {
        long j = this.f47906e;
        long j2 = this.f47907f;
        long j3 = this.f47908g;
        long j4 = this.f47909h;
        String str = mo7.m39455a(this.f47902a, 1) + ", " + mo7.m39455a(this.f47903b, 1) + ", " + mo7.m39455a(this.f47904c, 1) + ", " + mo7.m39455a(this.f47905d, 1);
        if (!k74.m35096c(j, j2) || !k74.m35096c(j2, j3) || !k74.m35096c(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) k74.m35100g(j)) + ", topRight=" + ((Object) k74.m35100g(j2)) + ", bottomRight=" + ((Object) k74.m35100g(j3)) + ", bottomLeft=" + ((Object) k74.m35100g(j4)) + ')';
        }
        if (k74.m35097d(j) == k74.m35098e(j)) {
            return "RoundRect(rect=" + str + ", radius=" + mo7.m39455a(k74.m35097d(j), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + mo7.m39455a(k74.m35097d(j), 1) + ", y=" + mo7.m39455a(k74.m35098e(j), 1) + ')';
    }

    public tue(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f47902a = f;
        this.f47903b = f2;
        this.f47904c = f3;
        this.f47905d = f4;
        this.f47906e = j;
        this.f47907f = j2;
        this.f47908g = j3;
        this.f47909h = j4;
    }
}
