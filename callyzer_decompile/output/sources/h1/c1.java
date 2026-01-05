package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 implements z1 {

    /* renamed from: a */
    public final z1 f15373a;

    /* renamed from: b */
    public final long f15374b;

    public c1(z1 z1Var, long j6) {
        this.f15373a = z1Var;
        this.f15374b = j6;
    }

    @Override // h1.z1
    /* renamed from: B */
    public final AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        long j10 = this.f15374b;
        return j6 < j10 ? abstractC2785p : this.f15373a.mo2730B(j6 - j10, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // h1.z1
    /* renamed from: b */
    public final boolean mo6777b() {
        return this.f15373a.mo6777b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return c1Var.f15374b == this.f15374b && AbstractC4154l.m8918a(c1Var.f15373a, this.f15373a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f15374b) + (this.f15373a.hashCode() * 31);
    }

    @Override // h1.z1
    /* renamed from: m */
    public final long mo6771m(AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return this.f15373a.mo6771m(abstractC2785p, abstractC2785p2, abstractC2785p3) + this.f15374b;
    }

    @Override // h1.z1
    /* renamed from: n */
    public final AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        long j10 = this.f15374b;
        return j6 < j10 ? abstractC2785p3 : this.f15373a.mo2744n(j6 - j10, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }
}
