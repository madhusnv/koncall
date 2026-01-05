package p001o;

/* loaded from: classes6.dex */
public final class sue {

    /* renamed from: f */
    public static final C16916a f45958f = new C16916a(null);

    /* renamed from: a */
    public final boolean f45959a;

    /* renamed from: b */
    public final float f45960b;

    /* renamed from: c */
    public final float f45961c;

    /* renamed from: d */
    public final float f45962d;

    /* renamed from: e */
    public final float f45963e;

    /* renamed from: o.sue$a */
    public static final class C16916a {
        public C16916a() {
        }

        public /* synthetic */ C16916a(id5 id5Var) {
            this();
        }
    }

    public sue(boolean z, float f, float f2, float f3, float f4) {
        this.f45959a = z;
        this.f45960b = f;
        this.f45961c = f2;
        this.f45962d = f3;
        this.f45963e = f4;
    }

    /* renamed from: a */
    public final boolean m48938a() {
        return this.f45959a;
    }

    /* renamed from: b */
    public final float m48939b() {
        return this.f45962d;
    }

    /* renamed from: c */
    public final float m48940c() {
        return this.f45963e;
    }

    /* renamed from: d */
    public final float m48941d() {
        return this.f45960b;
    }

    /* renamed from: e */
    public final float m48942e() {
        return this.f45961c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sue)) {
            return false;
        }
        sue sueVar = (sue) obj;
        return this.f45959a == sueVar.f45959a && Float.compare(this.f45960b, sueVar.f45960b) == 0 && Float.compare(this.f45961c, sueVar.f45961c) == 0 && Float.compare(this.f45962d, sueVar.f45962d) == 0 && Float.compare(this.f45963e, sueVar.f45963e) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.f45959a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + Float.hashCode(this.f45960b)) * 31) + Float.hashCode(this.f45961c)) * 31) + Float.hashCode(this.f45962d)) * 31) + Float.hashCode(this.f45963e);
    }

    public String toString() {
        return "Rotation(enabled=" + this.f45959a + ", speed=" + this.f45960b + ", variance=" + this.f45961c + ", multiplier2D=" + this.f45962d + ", multiplier3D=" + this.f45963e + ")";
    }

    public /* synthetic */ sue(boolean z, float f, float f2, float f3, float f4, int i, id5 id5Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0f : f, (i & 4) != 0 ? 0.5f : f2, (i & 8) != 0 ? 8.0f : f3, (i & 16) != 0 ? 1.5f : f4);
    }
}
