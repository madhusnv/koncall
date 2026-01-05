package p001o;

/* loaded from: classes3.dex */
public class dbb implements z24 {

    /* renamed from: a */
    public final String f19527a;

    /* renamed from: b */
    public final EnumC12858a f19528b;

    /* renamed from: c */
    public final boolean f19529c;

    /* renamed from: o.dbb$a */
    public enum EnumC12858a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static EnumC12858a forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public dbb(String str, EnumC12858a enumC12858a, boolean z) {
        this.f19527a = str;
        this.f19528b = enumC12858a;
        this.f19529c = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        if (emaVar.m25325n()) {
            return new ebb(this);
        }
        rja.m46866c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public EnumC12858a m22741b() {
        return this.f19528b;
    }

    /* renamed from: c */
    public String m22742c() {
        return this.f19527a;
    }

    /* renamed from: d */
    public boolean m22743d() {
        return this.f19529c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f19528b + '}';
    }
}
