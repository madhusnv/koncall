package r1;

import java.util.ArrayList;
import n1.AbstractC4941a;
import og.rd;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.b */
/* loaded from: classes.dex */
public final class C6417b implements InterfaceC6418c {

    /* renamed from: a */
    public final int f30950a;

    public C6417b(int i10) {
        this.f30950a = i10;
        if (i10 > 0) {
            return;
        }
        AbstractC4941a.m9884a("Provided count should be larger than zero");
    }

    @Override // r1.InterfaceC6418c
    /* renamed from: a */
    public final ArrayList mo12423a(InterfaceC6747c interfaceC6747c, int i10, int i11) {
        return rd.m10875c(i10, this.f30950a, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6417b) {
            return this.f30950a == ((C6417b) obj).f30950a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f30950a;
    }
}
