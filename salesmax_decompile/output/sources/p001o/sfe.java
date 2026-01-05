package p001o;

/* loaded from: classes3.dex */
public class sfe implements z24 {

    /* renamed from: a */
    public final String f45343a;

    /* renamed from: b */
    public final tg0 f45344b;

    /* renamed from: c */
    public final tg0 f45345c;

    /* renamed from: d */
    public final fg0 f45346d;

    /* renamed from: e */
    public final boolean f45347e;

    public sfe(String str, tg0 tg0Var, tg0 tg0Var2, fg0 fg0Var, boolean z) {
        this.f45343a = str;
        this.f45344b = tg0Var;
        this.f45345c = tg0Var2;
        this.f45346d = fg0Var;
        this.f45347e = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new rfe(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public fg0 m48292b() {
        return this.f45346d;
    }

    /* renamed from: c */
    public String m48293c() {
        return this.f45343a;
    }

    /* renamed from: d */
    public tg0 m48294d() {
        return this.f45344b;
    }

    /* renamed from: e */
    public tg0 m48295e() {
        return this.f45345c;
    }

    /* renamed from: f */
    public boolean m48296f() {
        return this.f45347e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f45344b + ", size=" + this.f45345c + '}';
    }
}
