package hd;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5934o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.r */
/* loaded from: classes.dex */
public final class C2906r extends AbstractC5934o {

    /* renamed from: b */
    public final String f15940b;

    public C2906r(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15940b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2906r) && AbstractC4154l.m8918a(this.f15940b, ((C2906r) obj).f15940b);
    }

    public final int hashCode() {
        return this.f15940b.hashCode();
    }

    @Override // pg.AbstractC5934o
    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Number(value="), this.f15940b, ')');
    }
}
