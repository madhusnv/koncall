package p001o;

/* loaded from: classes2.dex */
public abstract class tl1 {

    /* renamed from: a */
    public int f47361a;

    /* renamed from: g */
    public final void m50147g(int i) {
        this.f47361a = i | this.f47361a;
    }

    /* renamed from: h */
    public void mo16674h() {
        this.f47361a = 0;
    }

    /* renamed from: j */
    public final boolean m50148j(int i) {
        return (this.f47361a & i) == i;
    }

    /* renamed from: m */
    public final boolean m50149m() {
        return m50148j(268435456);
    }

    /* renamed from: n */
    public final boolean m50150n() {
        return m50148j(4);
    }

    /* renamed from: o */
    public final boolean m50151o() {
        return m50148j(134217728);
    }

    /* renamed from: r */
    public final boolean m50152r() {
        return m50148j(1);
    }

    /* renamed from: s */
    public final boolean m50153s() {
        return m50148j(536870912);
    }

    /* renamed from: t */
    public final void m50154t(int i) {
        this.f47361a = i;
    }
}
