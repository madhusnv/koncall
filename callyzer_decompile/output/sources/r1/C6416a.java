package r1;

import java.util.ArrayList;
import n1.AbstractC4941a;
import og.rd;
import s4.C6750f;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.a */
/* loaded from: classes.dex */
public final class C6416a implements InterfaceC6418c {

    /* renamed from: a */
    public final float f30948a;

    public C6416a(float f6) {
        this.f30948a = f6;
        if (Float.compare(f6, 0) > 0) {
            return;
        }
        AbstractC4941a.m9884a("Provided min size should be larger than zero.");
    }

    @Override // r1.InterfaceC6418c
    /* renamed from: a */
    public final ArrayList mo12423a(InterfaceC6747c interfaceC6747c, int i10, int i11) {
        return rd.m10875c(i10, Math.max((i10 + i11) / (interfaceC6747c.e0(this.f30948a) + i11), 1), i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6416a) {
            return C6750f.m12935a(this.f30948a, ((C6416a) obj).f30948a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30948a);
    }
}
