package ud;

import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.h */
/* loaded from: classes.dex */
public final class C7404h {

    /* renamed from: a */
    public final Object f35187a;

    /* renamed from: b */
    public final C7126c f35188b;

    public C7404h(Object obj, C7126c expiresAt) {
        AbstractC4154l.m8923f(expiresAt, "expiresAt");
        this.f35187a = obj;
        this.f35188b = expiresAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7404h)) {
            return false;
        }
        C7404h c7404h = (C7404h) obj;
        return AbstractC4154l.m8918a(this.f35187a, c7404h.f35187a) && AbstractC4154l.m8918a(this.f35188b, c7404h.f35188b);
    }

    public final int hashCode() {
        Object obj = this.f35187a;
        return this.f35188b.f34346a.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "ExpiringValue(value=" + this.f35187a + ", expiresAt=" + this.f35188b + ')';
    }
}
