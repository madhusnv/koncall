package p001o;

/* loaded from: classes2.dex */
public interface cpb extends p4g, bqb {
    /* renamed from: e */
    float mo21573e();

    /* renamed from: i */
    default void m21574i(float f) {
        mo36295m(f);
    }

    /* renamed from: m */
    void mo36295m(float f);

    @Override // p001o.bqb
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m21574i(((Number) obj).floatValue());
    }

    @Override // p001o.p4g
    default Float getValue() {
        return Float.valueOf(mo21573e());
    }
}
