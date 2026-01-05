package p001o;

/* loaded from: classes2.dex */
public interface yob extends p4g, bqb {
    /* renamed from: j */
    default void m58053j(double d) {
        mo34662k(d);
    }

    /* renamed from: k */
    void mo34662k(double d);

    /* renamed from: o */
    double mo34663o();

    @Override // p001o.bqb
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m58053j(((Number) obj).doubleValue());
    }

    @Override // p001o.p4g
    default Double getValue() {
        return Double.valueOf(mo34663o());
    }
}
