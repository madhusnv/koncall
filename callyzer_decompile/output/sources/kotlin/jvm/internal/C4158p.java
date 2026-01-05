package kotlin.jvm.internal;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.p */
/* loaded from: classes3.dex */
public final class C4158p implements InterfaceC4146d {

    /* renamed from: a */
    public final Class f21159a;

    public C4158p(Class jClass) {
        AbstractC4154l.m8923f(jClass, "jClass");
        this.f21159a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC4146d
    /* renamed from: a */
    public final Class mo8903a() {
        return this.f21159a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4158p) {
            return AbstractC4154l.m8918a(this.f21159a, ((C4158p) obj).f21159a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21159a.hashCode();
    }

    public final String toString() {
        return this.f21159a.toString() + " (Kotlin reflection is not available)";
    }
}
