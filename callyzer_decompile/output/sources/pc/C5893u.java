package pc;

import bd.C0645a;
import kotlin.jvm.internal.AbstractC4154l;
import oc.C5335b;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.u */
/* loaded from: classes.dex */
public final class C5893u {

    /* renamed from: a */
    public final C0645a f28721a;

    /* renamed from: b */
    public final InterfaceC7564h f28722b;

    /* renamed from: c */
    public final C5335b f28723c;

    public C5893u(C0645a c0645a, InterfaceC7564h interfaceC7564h, C5335b metrics) {
        AbstractC4154l.m8923f(metrics, "metrics");
        this.f28721a = c0645a;
        this.f28722b = interfaceC7564h;
        this.f28723c = metrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5893u)) {
            return false;
        }
        C5893u c5893u = (C5893u) obj;
        return AbstractC4154l.m8918a(this.f28721a, c5893u.f28721a) && AbstractC4154l.m8918a(this.f28722b, c5893u.f28722b) && AbstractC4154l.m8918a(this.f28723c, c5893u.f28723c);
    }

    public final int hashCode() {
        return this.f28723c.hashCode() + ((this.f28722b.hashCode() + (this.f28721a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SdkRequestTag(execContext=" + this.f28721a + ", callContext=" + this.f28722b + ", metrics=" + this.f28723c + ')';
    }
}
