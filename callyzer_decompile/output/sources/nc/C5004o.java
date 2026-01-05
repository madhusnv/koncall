package nc;

import ad.C0109p;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.o */
/* loaded from: classes.dex */
public final class C5004o extends AbstractC5005p {

    /* renamed from: a */
    public final C0109p f24758a;

    public C5004o(C0109p c0109p) {
        this.f24758a = c0109p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5004o) && AbstractC4154l.m8918a(this.f24758a, ((C5004o) obj).f24758a);
    }

    public final int hashCode() {
        return this.f24758a.hashCode();
    }

    public final String toString() {
        return "Http(url=" + this.f24758a + ')';
    }
}
