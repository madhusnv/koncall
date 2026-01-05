package nx;

import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.i */
/* loaded from: classes3.dex */
public final class C5171i {

    /* renamed from: a */
    public final String f25274a;

    /* renamed from: b */
    public final C4266h f25275b;

    public C5171i(String str, C4266h c4266h) {
        this.f25274a = str;
        this.f25275b = c4266h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5171i)) {
            return false;
        }
        C5171i c5171i = (C5171i) obj;
        return AbstractC4154l.m8918a(this.f25274a, c5171i.f25274a) && AbstractC4154l.m8918a(this.f25275b, c5171i.f25275b);
    }

    public final int hashCode() {
        return this.f25275b.hashCode() + (this.f25274a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f25274a + ", range=" + this.f25275b + ')';
    }
}
