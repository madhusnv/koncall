package rv;

import kotlin.jvm.internal.AbstractC4154l;
import sv.C6955c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.t */
/* loaded from: classes3.dex */
public final class C6644t extends AbstractC6650z {

    /* renamed from: a */
    public final C6955c f31903a;

    /* renamed from: b */
    public final boolean f31904b;

    public C6644t(C6955c simUIModel, boolean z6) {
        AbstractC4154l.m8923f(simUIModel, "simUIModel");
        this.f31903a = simUIModel;
        this.f31904b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6644t)) {
            return false;
        }
        C6644t c6644t = (C6644t) obj;
        return AbstractC4154l.m8918a(this.f31903a, c6644t.f31903a) && this.f31904b == c6644t.f31904b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31904b) + (this.f31903a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectSIM(simUIModel=" + this.f31903a + ", isSelect=" + this.f31904b + ")";
    }
}
