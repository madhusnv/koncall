package hd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.u */
/* loaded from: classes.dex */
public final class C2909u {

    /* renamed from: a */
    public final List f15942a;

    /* renamed from: b */
    public final List f15943b;

    public C2909u() {
        ArrayList arrayListM10835j = pe.m10835j(EnumC2908t.Initial);
        ArrayList arrayList = new ArrayList();
        this.f15942a = arrayListM10835j;
        this.f15943b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2909u)) {
            return false;
        }
        C2909u c2909u = (C2909u) obj;
        return AbstractC4154l.m8918a(this.f15942a, c2909u.f15942a) && AbstractC4154l.m8918a(this.f15943b, c2909u.f15943b);
    }

    public final int hashCode() {
        return this.f15943b.hashCode() + (this.f15942a.hashCode() * 31);
    }

    public final String toString() {
        return "StateManager(state=" + this.f15942a + ", pendingMutations=" + this.f15943b + ')';
    }
}
