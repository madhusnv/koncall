package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC4154l;
import o1.InterfaceC5259r;
import s4.C6745a;
import s4.InterfaceC6747c;
import t3.g1;
import w2.C7871j;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.layout.c */
/* loaded from: classes.dex */
public final class C0244c implements InterfaceC5259r {

    /* renamed from: a */
    public final InterfaceC6747c f1967a;

    /* renamed from: b */
    public final long f1968b;

    public C0244c(g1 g1Var, long j6) {
        this.f1967a = g1Var;
        this.f1968b = j6;
    }

    @Override // o1.InterfaceC5259r
    /* renamed from: a */
    public final InterfaceC7879r mo662a(InterfaceC7879r interfaceC7879r, C7871j c7871j) {
        return interfaceC7879r.mo14852e(new BoxChildDataElement(c7871j, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244c)) {
            return false;
        }
        C0244c c0244c = (C0244c) obj;
        return AbstractC4154l.m8918a(this.f1967a, c0244c.f1967a) && C6745a.m12912c(this.f1968b, c0244c.f1968b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1968b) + (this.f1967a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f1967a + ", constraints=" + ((Object) C6745a.m12922m(this.f1968b)) + ')';
    }
}
