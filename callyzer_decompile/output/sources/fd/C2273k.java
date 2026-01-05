package fd;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fd.k */
/* loaded from: classes.dex */
public final class C2273k {

    /* renamed from: a */
    public final Object f10282a;

    /* renamed from: b */
    public final InterfaceC2141e f10283b;

    public C2273k(Object obj, InterfaceC2141e serializeFn) {
        AbstractC4154l.m8923f(serializeFn, "serializeFn");
        this.f10282a = obj;
        this.f10283b = serializeFn;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273k)) {
            return false;
        }
        C2273k c2273k = (C2273k) obj;
        return AbstractC4154l.m8918a(this.f10282a, c2273k.f10282a) && AbstractC4154l.m8918a(this.f10283b, c2273k.f10283b);
    }

    public final int hashCode() {
        Object obj = this.f10282a;
        return this.f10283b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SdkSerializableLambda(input=" + this.f10282a + ", serializeFn=" + this.f10283b + ')';
    }
}
