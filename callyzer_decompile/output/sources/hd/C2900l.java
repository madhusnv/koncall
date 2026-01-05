package hd;

import i0.m0;
import pg.AbstractC5934o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.l */
/* loaded from: classes.dex */
public final class C2900l extends AbstractC5934o {

    /* renamed from: b */
    public final boolean f15934b;

    public C2900l(boolean z6) {
        this.f15934b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2900l) && this.f15934b == ((C2900l) obj).f15934b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15934b);
    }

    @Override // pg.AbstractC5934o
    public final String toString() {
        return m0.m7382o(new StringBuilder("Bool(value="), this.f15934b, ')');
    }
}
