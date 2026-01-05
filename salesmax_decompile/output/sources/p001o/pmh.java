package p001o;

/* loaded from: classes6.dex */
public final class pmh extends f6f implements Runnable {

    /* renamed from: e */
    public final long f40278e;

    public pmh(long j, n64 n64Var) {
        super(n64Var.getContext(), n64Var);
        this.f40278e = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        m22413I(rmh.m46982a(this.f40278e, nk5.m40722d(getContext()), this));
    }

    @Override // p001o.h7, p001o.d79
    public String x0() {
        return super.x0() + "(timeMillis=" + this.f40278e + ')';
    }
}
