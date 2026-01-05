package tr;

import kotlin.jvm.internal.AbstractC4154l;
import or.C5454q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.g */
/* loaded from: classes3.dex */
public final class C7211g extends AbstractC7213i {

    /* renamed from: a */
    public final C5454q f34505a;

    public C7211g(C5454q sorting) {
        AbstractC4154l.m8923f(sorting, "sorting");
        this.f34505a = sorting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7211g) && AbstractC4154l.m8918a(this.f34505a, ((C7211g) obj).f34505a);
    }

    public final int hashCode() {
        return this.f34505a.hashCode();
    }

    public final String toString() {
        return "UpdateSorting(sorting=" + this.f34505a + ")";
    }
}
