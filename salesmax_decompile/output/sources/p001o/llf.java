package p001o;

/* loaded from: classes3.dex */
public class llf implements z24 {

    /* renamed from: a */
    public final String f34019a;

    /* renamed from: b */
    public final int f34020b;

    /* renamed from: c */
    public final mg0 f34021c;

    /* renamed from: d */
    public final boolean f34022d;

    public llf(String str, int i, mg0 mg0Var, boolean z) {
        this.f34019a = str;
        this.f34020b = i;
        this.f34021c = mg0Var;
        this.f34022d = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new blf(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public String m37447b() {
        return this.f34019a;
    }

    /* renamed from: c */
    public mg0 m37448c() {
        return this.f34021c;
    }

    /* renamed from: d */
    public boolean m37449d() {
        return this.f34022d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f34019a + ", index=" + this.f34020b + '}';
    }
}
