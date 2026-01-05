package ws;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.m */
/* loaded from: classes3.dex */
public final class C8172m extends AbstractC8175p {

    /* renamed from: a */
    public final String f39095a;

    /* renamed from: b */
    public final String f39096b;

    public C8172m(String str, String callDuration) {
        AbstractC4154l.m8923f(callDuration, "callDuration");
        this.f39095a = str;
        this.f39096b = callDuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8172m)) {
            return false;
        }
        C8172m c8172m = (C8172m) obj;
        return AbstractC4154l.m8918a(this.f39095a, c8172m.f39095a) && AbstractC4154l.m8918a(this.f39096b, c8172m.f39096b);
    }

    public final int hashCode() {
        return this.f39096b.hashCode() + (this.f39095a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("UpdateCallDuration(timeUnit=", this.f39095a, ", callDuration=", this.f39096b, ")");
    }
}
