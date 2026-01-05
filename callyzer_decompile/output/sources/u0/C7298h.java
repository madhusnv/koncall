package u0;

import i0.e0;
import i0.x0;
import j0.AbstractC3506f;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.h */
/* loaded from: classes.dex */
public final class C7298h extends x0 {

    /* renamed from: b */
    public final String f34819b;

    /* renamed from: c */
    public int f34820c;

    public C7298h(e0 e0Var) {
        super(e0Var);
        this.f34819b = "virtual-" + e0Var.mo7323e() + "-" + UUID.randomUUID().toString();
    }

    @Override // i0.x0, i0.e0
    /* renamed from: d */
    public final int mo7322d() {
        return mo7329l(0);
    }

    @Override // i0.x0, i0.e0
    /* renamed from: e */
    public final String mo7323e() {
        return this.f34819b;
    }

    @Override // i0.x0, i0.e0
    /* renamed from: l */
    public final int mo7329l(int i10) {
        return AbstractC3506f.m8072g(this.f16612a.mo7329l(i10) - this.f34820c);
    }
}
