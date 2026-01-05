package w1;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import n1.AbstractC4941a;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w1.c */
/* loaded from: classes.dex */
public final class C7859c implements InterfaceC7857a {

    /* renamed from: a */
    public final float f37630a;

    public C7859c(float f6) {
        this.f37630a = f6;
        if (f6 < DefinitionKt.NO_Float_VALUE || f6 > 100.0f) {
            AbstractC4941a.m9884a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // w1.InterfaceC7857a
    /* renamed from: a */
    public final float mo14838a(long j6, InterfaceC6747c interfaceC6747c) {
        return (this.f37630a / 100.0f) * C0850e.m2292c(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7859c) && Float.compare(this.f37630a, ((C7859c) obj).f37630a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37630a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f37630a + "%)";
    }
}
