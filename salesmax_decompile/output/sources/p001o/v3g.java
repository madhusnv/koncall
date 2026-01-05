package p001o;

/* loaded from: classes2.dex */
public final class v3g extends nf7 {

    /* renamed from: b */
    public final long f49834b;

    public v3g(uq6 uq6Var, long j) {
        super(uq6Var);
        op0.m42511a(uq6Var.getPosition() >= j);
        this.f49834b = j;
    }

    @Override // p001o.nf7, p001o.uq6
    /* renamed from: g */
    public long mo40493g() {
        return super.mo40493g() - this.f49834b;
    }

    @Override // p001o.nf7, p001o.uq6
    public long getLength() {
        return super.getLength() - this.f49834b;
    }

    @Override // p001o.nf7, p001o.uq6
    public long getPosition() {
        return super.getPosition() - this.f49834b;
    }
}
