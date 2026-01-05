package ec;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.a */
/* loaded from: classes.dex */
public final class C2003a {

    /* renamed from: a */
    public final String f9533a;

    public C2003a(String str) {
        this.f9533a = str;
        if (AbstractC5178p.m10101L(str)) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2003a) && AbstractC4154l.m8918a(this.f9533a, ((C2003a) obj).f9533a);
    }

    public final int hashCode() {
        return this.f9533a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("AttributeKey("), this.f9533a, ')');
    }
}
