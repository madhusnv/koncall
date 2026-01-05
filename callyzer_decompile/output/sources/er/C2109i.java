package er;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.i */
/* loaded from: classes3.dex */
public final class C2109i extends AbstractC2111k {

    /* renamed from: a */
    public final String f9862a;

    /* renamed from: b */
    public final String f9863b;

    public C2109i(String number, String name) {
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(name, "name");
        this.f9862a = number;
        this.f9863b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2109i)) {
            return false;
        }
        C2109i c2109i = (C2109i) obj;
        return AbstractC4154l.m8918a(this.f9862a, c2109i.f9862a) && AbstractC4154l.m8918a(this.f9863b, c2109i.f9863b);
    }

    public final int hashCode() {
        return this.f9863b.hashCode() + (this.f9862a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("SetCallLogData(number=", this.f9862a, ", name=", this.f9863b, ")");
    }
}
