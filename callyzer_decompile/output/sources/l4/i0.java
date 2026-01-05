package l4;

import g4.C2492h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public final C2492h f21909a;

    /* renamed from: b */
    public final InterfaceC4374s f21910b;

    public i0(C2492h c2492h, InterfaceC4374s interfaceC4374s) {
        this.f21909a = c2492h;
        this.f21910b = interfaceC4374s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return AbstractC4154l.m8918a(this.f21909a, i0Var.f21909a) && AbstractC4154l.m8918a(this.f21910b, i0Var.f21910b);
    }

    public final int hashCode() {
        return this.f21910b.hashCode() + (this.f21909a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f21909a) + ", offsetMapping=" + this.f21910b + ')';
    }
}
