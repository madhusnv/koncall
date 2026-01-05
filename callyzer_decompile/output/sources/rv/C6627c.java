package rv;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.c */
/* loaded from: classes3.dex */
public final class C6627c extends AbstractC6650z {

    /* renamed from: a */
    public final List f31824a;

    public C6627c(List simList) {
        AbstractC4154l.m8923f(simList, "simList");
        this.f31824a = simList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6627c) && AbstractC4154l.m8918a(this.f31824a, ((C6627c) obj).f31824a);
    }

    public final int hashCode() {
        return this.f31824a.hashCode();
    }

    public final String toString() {
        return i0.m0.m7380m("AddSIMList(simList=", ")", this.f31824a);
    }
}
