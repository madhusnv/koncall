package pc;

import b00.AbstractC0517b;
import b00.InterfaceC0528m;
import ec.C2005c;
import iz.C3393z;
import iz.n0;
import kotlin.jvm.internal.AbstractC4154l;
import pd.C5897c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.h */
/* loaded from: classes.dex */
public final class C5880h extends n0 {

    /* renamed from: c */
    public final n0 f28680c;

    /* renamed from: d */
    public final C5897c f28681d;

    /* renamed from: e */
    public final C2005c f28682e;

    public C5880h(n0 delegate, C5897c counter, C2005c c2005c) {
        AbstractC4154l.m8923f(delegate, "delegate");
        AbstractC4154l.m8923f(counter, "counter");
        this.f28680c = delegate;
        this.f28681d = counter;
        this.f28682e = c2005c;
    }

    @Override // iz.n0
    /* renamed from: h */
    public final long mo7460h() {
        return this.f28680c.mo7460h();
    }

    @Override // iz.n0
    /* renamed from: j */
    public final C3393z mo7461j() {
        return this.f28680c.mo7461j();
    }

    @Override // iz.n0
    /* renamed from: n */
    public final InterfaceC0528m mo7462n() {
        return AbstractC0517b.m1524c(new C5882j(this.f28680c.mo7462n(), this.f28681d, this.f28682e));
    }
}
