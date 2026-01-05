package k2;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 implements k2 {

    /* renamed from: a */
    public final Object f20414a;

    public j2(Object obj) {
        this.f20414a = obj;
    }

    @Override // k2.k2
    /* renamed from: a */
    public final Object mo8487a(i1 i1Var) {
        return this.f20414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && AbstractC4154l.m8918a(this.f20414a, ((j2) obj).f20414a);
    }

    public final int hashCode() {
        Object obj = this.f20414a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f20414a + ')';
    }
}
