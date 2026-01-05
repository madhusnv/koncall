package hd;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5934o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.p */
/* loaded from: classes.dex */
public final class C2904p extends AbstractC5934o {

    /* renamed from: b */
    public final String f15938b;

    public C2904p(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15938b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2904p) && AbstractC4154l.m8918a(this.f15938b, ((C2904p) obj).f15938b);
    }

    public final int hashCode() {
        return this.f15938b.hashCode();
    }

    @Override // pg.AbstractC5934o
    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Name(value="), this.f15938b, ')');
    }
}
