package yv;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.p */
/* loaded from: classes3.dex */
public final class C8801p {

    /* renamed from: a */
    public final boolean f42464a;

    public C8801p(boolean z6) {
        this.f42464a = z6;
    }

    /* renamed from: a */
    public final boolean m16218a() {
        return this.f42464a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8801p) && this.f42464a == ((C8801p) obj).f42464a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42464a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("NetWorkState(isConnected=", ")", this.f42464a);
    }
}
