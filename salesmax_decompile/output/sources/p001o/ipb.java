package p001o;

/* loaded from: classes2.dex */
public interface ipb extends p4g, bqb {
    /* renamed from: g */
    default void m32534g(long j) {
        mo32536p(j);
    }

    /* renamed from: l */
    long mo32535l();

    /* renamed from: p */
    void mo32536p(long j);

    @Override // p001o.bqb
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m32534g(((Number) obj).longValue());
    }

    @Override // p001o.p4g
    default Long getValue() {
        return Long.valueOf(mo32535l());
    }
}
