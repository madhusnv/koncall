package is;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: is.a */
/* loaded from: classes3.dex */
public final class C3347a {

    /* renamed from: a */
    public final List f17712a;

    public C3347a(List tabList) {
        AbstractC4154l.m8923f(tabList, "tabList");
        this.f17712a = tabList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3347a) && AbstractC4154l.m8918a(this.f17712a, ((C3347a) obj).f17712a);
    }

    public final int hashCode() {
        return this.f17712a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("LeadState(tabList=", ")", this.f17712a);
    }
}
