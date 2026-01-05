package e5;

import d5.C1598b;
import d5.C1603g;
import d5.EnumC1607k;
import d5.EnumC1608l;
import g5.AbstractC2523m;
import g5.C2511a;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e5.c */
/* loaded from: classes.dex */
public final class C1948c extends C1603g {

    /* renamed from: n0, reason: collision with root package name */
    public EnumC1607k f44185n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f44186o0;

    /* renamed from: p0, reason: collision with root package name */
    public C2511a f44187p0;

    public C1948c(C8553n c8553n) {
        super(c8553n, EnumC1608l.BARRIER);
    }

    @Override // d5.C1603g, d5.C1598b, d5.InterfaceC1604h
    public final void apply() {
        mo5258s();
        int i10 = AbstractC1947b.f9192a[this.f44185n0.ordinal()];
        int i11 = 3;
        if (i10 == 3 || i10 == 4) {
            i11 = 1;
        } else if (i10 == 5) {
            i11 = 2;
        } else if (i10 != 6) {
            i11 = 0;
        }
        C2511a c2511a = this.f44187p0;
        c2511a.f44234i0 = i11;
        c2511a.f44236k0 = this.f44186o0;
    }

    @Override // d5.C1598b
    /* renamed from: k */
    public final C1598b mo5247k(int i10) {
        this.f44186o0 = i10;
        return this;
    }

    @Override // d5.C1598b
    /* renamed from: l */
    public final C1598b mo5248l(Float f6) {
        this.f44186o0 = this.f44180k0.m15822c(f6);
        return this;
    }

    @Override // d5.C1603g
    /* renamed from: s */
    public final AbstractC2523m mo5258s() {
        if (this.f44187p0 == null) {
            C2511a c2511a = new C2511a();
            c2511a.f44234i0 = 0;
            c2511a.f44235j0 = true;
            c2511a.f44236k0 = 0;
            c2511a.f44237l0 = false;
            this.f44187p0 = c2511a;
        }
        return this.f44187p0;
    }
}
