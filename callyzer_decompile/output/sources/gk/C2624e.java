package gk;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gk.e */
/* loaded from: classes.dex */
public final class C2624e {

    /* renamed from: a */
    public final String f14199a;

    public C2624e(String sessionId) {
        AbstractC4154l.m8923f(sessionId, "sessionId");
        this.f14199a = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2624e) && AbstractC4154l.m8918a(this.f14199a, ((C2624e) obj).f14199a);
    }

    public final int hashCode() {
        return this.f14199a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SessionDetails(sessionId="), this.f14199a, ')');
    }
}
