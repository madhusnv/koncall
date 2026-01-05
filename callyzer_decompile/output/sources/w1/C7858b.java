package w1;

import s4.C6750f;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w1.b */
/* loaded from: classes.dex */
public final class C7858b implements InterfaceC7857a {

    /* renamed from: a */
    public final float f37629a;

    public C7858b(float f6) {
        this.f37629a = f6;
    }

    @Override // w1.InterfaceC7857a
    /* renamed from: a */
    public final float mo14838a(long j6, InterfaceC6747c interfaceC6747c) {
        return interfaceC6747c.mo8435T(this.f37629a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7858b) && C6750f.m12935a(this.f37629a, ((C7858b) obj).f37629a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f37629a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f37629a + ".dp)";
    }
}
