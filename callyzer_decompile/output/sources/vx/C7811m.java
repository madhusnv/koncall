package vx;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.m */
/* loaded from: classes3.dex */
public final class C7811m extends C7812n {

    /* renamed from: a */
    public final Throwable f37518a;

    public C7811m(Throwable th2) {
        this.f37518a = th2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7811m) {
            return AbstractC4154l.m8918a(this.f37518a, ((C7811m) obj).f37518a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th2 = this.f37518a;
        if (th2 != null) {
            return th2.hashCode();
        }
        return 0;
    }

    @Override // vx.C7812n
    public final String toString() {
        return "Closed(" + this.f37518a + ')';
    }
}
