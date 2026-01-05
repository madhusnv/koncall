package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 implements n1 {

    /* renamed from: a */
    public final Object f15525a;

    /* renamed from: b */
    public final Object f15526b;

    public o1(Object obj, Object obj2) {
        this.f15525a = obj;
        this.f15526b = obj2;
    }

    @Override // h1.n1
    /* renamed from: a */
    public final Object mo6099a() {
        return this.f15525a;
    }

    @Override // h1.n1
    /* renamed from: c */
    public final Object mo6100c() {
        return this.f15526b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return AbstractC4154l.m8918a(this.f15525a, n1Var.mo6099a()) && AbstractC4154l.m8918a(this.f15526b, n1Var.mo6100c());
    }

    public final int hashCode() {
        Object obj = this.f15525a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f15526b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
