package oz;

import b00.InterfaceC0528m;
import b00.d0;
import iz.C3393z;
import iz.n0;
import nx.C5176n;
import pg.h7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oz.g */
/* loaded from: classes3.dex */
public final class C5784g extends n0 {

    /* renamed from: c */
    public final String f28359c;

    /* renamed from: d */
    public final long f28360d;

    /* renamed from: e */
    public final d0 f28361e;

    public C5784g(String str, long j6, d0 d0Var) {
        this.f28359c = str;
        this.f28360d = j6;
        this.f28361e = d0Var;
    }

    @Override // iz.n0
    /* renamed from: h */
    public final long mo7460h() {
        return this.f28360d;
    }

    @Override // iz.n0
    /* renamed from: j */
    public final C3393z mo7461j() {
        String str = this.f28359c;
        if (str == null) {
            return null;
        }
        C5176n c5176n = C3393z.f18000e;
        try {
            return h7.m11676d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // iz.n0
    /* renamed from: n */
    public final InterfaceC0528m mo7462n() {
        return this.f28361e;
    }
}
