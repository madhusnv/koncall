package ed;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ed.b */
/* loaded from: classes.dex */
public final class C2026b extends AbstractC2029e {

    /* renamed from: a */
    public final EnumC2030f f9584a;

    public C2026b(EnumC2030f reason) {
        AbstractC4154l.m8923f(reason, "reason");
        this.f9584a = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2026b) && this.f9584a == ((C2026b) obj).f9584a;
    }

    public final int hashCode() {
        return this.f9584a.hashCode();
    }

    public final String toString() {
        return "RetryError(reason=" + this.f9584a + ')';
    }
}
