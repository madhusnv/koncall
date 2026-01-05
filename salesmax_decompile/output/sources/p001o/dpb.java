package p001o;

/* loaded from: classes2.dex */
public interface dpb extends ql8, bqb {
    @Override // p001o.ql8
    /* renamed from: b */
    int mo23664b();

    /* renamed from: f */
    void mo23665f(int i);

    /* renamed from: h */
    default void m23666h(int i) {
        mo23665f(i);
    }

    @Override // p001o.bqb
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m23666h(((Number) obj).intValue());
    }

    @Override // p001o.p4g
    default Integer getValue() {
        return Integer.valueOf(mo23664b());
    }
}
