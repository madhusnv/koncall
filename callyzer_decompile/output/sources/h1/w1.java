package h1;

import ch.C0972b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 implements InterfaceC2791v {

    /* renamed from: a */
    public final int f15636a;

    /* renamed from: b */
    public final int f15637b;

    /* renamed from: c */
    public final InterfaceC2792w f15638c;

    public w1(int i10, InterfaceC2792w interfaceC2792w, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? AbstractC2793x.f15639a : interfaceC2792w);
    }

    @Override // h1.InterfaceC2779j
    /* renamed from: a */
    public final z1 mo6766a(x1 x1Var) {
        return new C0972b(this.f15636a, this.f15637b, this.f15638c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            if (w1Var.f15636a == this.f15636a && w1Var.f15637b == this.f15637b && AbstractC4154l.m8918a(w1Var.f15638c, this.f15638c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15638c.hashCode() + (this.f15636a * 31)) * 31) + this.f15637b;
    }

    @Override // h1.InterfaceC2791v, h1.InterfaceC2779j
    /* renamed from: a */
    public final b2 mo6766a(x1 x1Var) {
        return new C0972b(this.f15636a, this.f15637b, this.f15638c);
    }

    public w1(int i10, int i11, InterfaceC2792w interfaceC2792w) {
        this.f15636a = i10;
        this.f15637b = i11;
        this.f15638c = interfaceC2792w;
    }
}
