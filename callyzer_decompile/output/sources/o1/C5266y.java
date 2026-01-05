package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import w2.C7870i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.y */
/* loaded from: classes.dex */
public final class C5266y extends AbstractC5244c {

    /* renamed from: h */
    public final C7870i f25890h;

    public C5266y(C7870i c7870i) {
        this.f25890h = c7870i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5266y) && AbstractC4154l.m8918a(this.f25890h, ((C5266y) obj).f25890h);
    }

    @Override // o1.AbstractC5244c
    /* renamed from: g */
    public final int mo10334g(int i10, EnumC6757m enumC6757m) {
        return this.f25890h.m14849a(0, i10);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25890h.f37661a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f25890h + ')';
    }
}
