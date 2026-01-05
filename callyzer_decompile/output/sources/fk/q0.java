package fk;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a */
    public final EnumC2308n f10471a;

    /* renamed from: b */
    public final z0 f10472b;

    /* renamed from: c */
    public final C2296b f10473c;

    public q0(EnumC2308n eventType, z0 z0Var, C2296b c2296b) {
        AbstractC4154l.m8923f(eventType, "eventType");
        this.f10471a = eventType;
        this.f10472b = z0Var;
        this.f10473c = c2296b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f10471a == q0Var.f10471a && AbstractC4154l.m8918a(this.f10472b, q0Var.f10472b) && AbstractC4154l.m8918a(this.f10473c, q0Var.f10473c);
    }

    public final int hashCode() {
        return this.f10473c.hashCode() + ((this.f10472b.hashCode() + (this.f10471a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f10471a + ", sessionData=" + this.f10472b + ", applicationInfo=" + this.f10473c + ')';
    }
}
