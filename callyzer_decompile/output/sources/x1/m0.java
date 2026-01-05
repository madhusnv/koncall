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
public final class m0 implements InterfaceC7035v {

    /* renamed from: a */
    public final p1 f39599a;

    /* renamed from: b */
    public final int f39600b;

    /* renamed from: c */
    public final l4.i0 f39601c;

    /* renamed from: d */
    public final InterfaceC2137a f39602d;

    public m0(p1 p1Var, int i10, l4.i0 i0Var, InterfaceC2137a interfaceC2137a) {
        this.f39599a = p1Var;
        this.f39600b = i10;
        this.f39601c = i0Var;
        this.f39602d = interfaceC2137a;
    }

    @Override // t3.InterfaceC7035v
    /* renamed from: b */
    public final t3.k0 mo10375b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        long j10;
        if (i0Var.mo13313y(C6745a.m12917h(j6)) < C6745a.m12918i(j6)) {
            j10 = j6;
        } else {
            j10 = j6;
            j6 = C6745a.m12911b(j10, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        int iMin = Math.min(w0VarMo13314z.f34030a, C6745a.m12918i(j10));
        return l0Var.g0(iMin, w0VarMo13314z.f34031b, C6669s.f31944a, new C2451e(l0Var, this, w0VarMo13314z, iMin, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return AbstractC4154l.m8918a(this.f39599a, m0Var.f39599a) && this.f39600b == m0Var.f39600b && AbstractC4154l.m8918a(this.f39601c, m0Var.f39601c) && AbstractC4154l.m8918a(this.f39602d, m0Var.f39602d);
    }

    public final int hashCode() {
        return this.f39602d.hashCode() + ((this.f39601c.hashCode() + AbstractC1452a.m4556c(this.f39600b, this.f39599a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f39599a + ", cursorOffset=" + this.f39600b + ", transformedText=" + this.f39601c + ", textLayoutResultProvider=" + this.f39602d + ')';
    }
}
