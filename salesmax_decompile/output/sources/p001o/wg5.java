package p001o;

/* loaded from: classes6.dex */
public final class wg5 extends f5f {

    /* renamed from: q */
    public static final wg5 f51932q = new wg5();

    public wg5() {
        super(d2h.f19048c, d2h.f19049d, d2h.f19050e, d2h.f19046a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p001o.z74
    public z74 l0(int i, String str) {
        jda.m33601a(i);
        return i >= d2h.f19048c ? jda.m33602b(this, str) : super.l0(i, str);
    }

    @Override // p001o.z74
    public String toString() {
        return "Dispatchers.Default";
    }
}
