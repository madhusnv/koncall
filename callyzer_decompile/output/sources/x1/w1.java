package x1;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import g2.C2451e;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;
import s4.C6745a;
import t3.InterfaceC7035v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 implements InterfaceC7035v {

    /* renamed from: a */
    public final p1 f39732a;

    /* renamed from: b */
    public final int f39733b;

    /* renamed from: c */
    public final l4.i0 f39734c;

    /* renamed from: d */
    public final InterfaceC2137a f39735d;

    public w1(p1 p1Var, int i10, l4.i0 i0Var, InterfaceC2137a interfaceC2137a) {
        this.f39732a = p1Var;
        this.f39733b = i10;
        this.f39734c = i0Var;
        this.f39735d = interfaceC2137a;
    }

    @Override // t3.InterfaceC7035v
    /* renamed from: b */
    public final t3.k0 mo10375b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        t3.w0 w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(w0VarMo13314z.f34031b, C6745a.m12917h(j6));
        return l0Var.g0(w0VarMo13314z.f34030a, iMin, C6669s.f31944a, new C2451e(l0Var, this, w0VarMo13314z, iMin, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return AbstractC4154l.m8918a(this.f39732a, w1Var.f39732a) && this.f39733b == w1Var.f39733b && AbstractC4154l.m8918a(this.f39734c, w1Var.f39734c) && AbstractC4154l.m8918a(this.f39735d, w1Var.f39735d);
    }

    public final int hashCode() {
        return this.f39735d.hashCode() + ((this.f39734c.hashCode() + AbstractC1452a.m4556c(this.f39733b, this.f39732a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f39732a + ", cursorOffset=" + this.f39733b + ", transformedText=" + this.f39734c + ", textLayoutResultProvider=" + this.f39735d + ')';
    }
}
