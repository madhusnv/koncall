package gk;

import dy.C1855c;
import kotlin.jvm.internal.AbstractC4154l;
import wi.C8059i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gk.a */
/* loaded from: classes.dex */
public final class C2620a {

    /* renamed from: a */
    public final C1855c f14186a;

    /* renamed from: b */
    public C8059i f14187b = null;

    public C2620a(C1855c c1855c) {
        this.f14186a = c1855c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2620a)) {
            return false;
        }
        C2620a c2620a = (C2620a) obj;
        return this.f14186a.equals(c2620a.f14186a) && AbstractC4154l.m8918a(this.f14187b, c2620a.f14187b);
    }

    public final int hashCode() {
        int iHashCode = this.f14186a.hashCode() * 31;
        C8059i c8059i = this.f14187b;
        return iHashCode + (c8059i == null ? 0 : c8059i.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f14186a + ", subscriber=" + this.f14187b + ')';
    }
}
