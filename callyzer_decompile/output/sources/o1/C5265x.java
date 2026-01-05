package o1;

import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import w2.C7869h;
import w2.InterfaceC7865d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.x */
/* loaded from: classes.dex */
public final class C5265x extends AbstractC5244c {

    /* renamed from: h */
    public final InterfaceC7865d f25885h;

    public C5265x(C7869h c7869h) {
        this.f25885h = c7869h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5265x) && AbstractC4154l.m8918a(this.f25885h, ((C5265x) obj).f25885h);
    }

    @Override // o1.AbstractC5244c
    /* renamed from: g */
    public final int mo10334g(int i10, EnumC6757m enumC6757m) {
        return this.f25885h.mo14847a(0, i10, enumC6757m);
    }

    public final int hashCode() {
        return this.f25885h.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f25885h + ')';
    }
}
