package p001o;

/* loaded from: classes2.dex */
public interface zl5 {
    /* renamed from: A */
    default float mo19172A(float f) {
        return f * getDensity();
    }

    /* renamed from: E */
    default long mo19173E(long j) {
        return (j > wx5.f52831a.m55323a() ? 1 : (j == wx5.f52831a.m55323a() ? 0 : -1)) != 0 ? jvf.m34585a(mo19172A(wx5.m55322e(j)), mo19172A(wx5.m55321d(j))) : evf.f22225a.m25660a();
    }

    float getDensity();

    /* renamed from: o */
    default float mo19176o(long j) {
        if (djh.m23334g(bjh.m19256g(j), djh.f20128b.m23339b())) {
            return bjh.m19257h(j) * mo17436x() * getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    /* renamed from: x */
    float mo17436x();
}
