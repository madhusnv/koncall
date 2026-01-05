package og;

import com.skydoves.balloon.internals.DefinitionKt;
import f3.AbstractC2199e;
import f3.C2201g;
import g4.AbstractC2507w;
import g4.C2506v;
import g4.C2508x;
import g4.C2509y;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import n4.AbstractC4954c;
import n4.C4953b;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import r4.C6446a;
import r4.C6450e;
import r4.C6454i;
import r4.C6457l;
import r4.C6459n;
import r4.C6462q;
import r4.C6463r;
import r4.C6465t;
import r4.InterfaceC6461p;
import rw.AbstractC6656f;
import s4.C6759o;
import s4.C6760p;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class zf {
    /* renamed from: a */
    public static final String m11099a(Object[] objArr, int i10, int i11, AbstractC6656f abstractC6656f) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == abstractC6656f) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        return i0.m0.m7381n(sb2, "]", "toString(...)");
    }

    /* renamed from: b */
    public static final void m11100b(Object[] objArr, int i10, int i11) {
        AbstractC4154l.m8923f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    /* renamed from: c */
    public static final g4.o0 m11101c(g4.o0 o0Var, EnumC6757m enumC6757m) {
        g4.g0 g0Var = o0Var.f13688a;
        InterfaceC6461p interfaceC6461p = g4.h0.f13626d;
        InterfaceC6461p interfaceC6461p2 = g0Var.f13603a;
        if (interfaceC6461p2.equals(C6459n.f31121a)) {
            interfaceC6461p2 = g4.h0.f13626d;
        }
        InterfaceC6461p interfaceC6461p3 = interfaceC6461p2;
        long j6 = g0Var.f13604b;
        C6760p[] c6760pArr = C6759o.f32212b;
        if ((j6 & 1095216660480L) == 0) {
            j6 = g4.h0.f13623a;
        }
        long j10 = j6;
        C3998s c3998s = g0Var.f13605c;
        if (c3998s == null) {
            c3998s = C3998s.f20695e;
        }
        C3998s c3998s2 = c3998s;
        C3994o c3994o = g0Var.f13606d;
        C3994o c3994o2 = new C3994o(c3994o != null ? c3994o.f20689a : 0);
        C3995p c3995p = g0Var.f13607e;
        C3995p c3995p2 = new C3995p(c3995p != null ? c3995p.f20690a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        AbstractC3988i abstractC3988i = g0Var.f13608f;
        if (abstractC3988i == null) {
            abstractC3988i = AbstractC3988i.f20674a;
        }
        AbstractC3988i abstractC3988i2 = abstractC3988i;
        String str = g0Var.f13609g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = g0Var.f13610h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = g4.h0.f13624b;
        }
        long j12 = j11;
        C6446a c6446a = g0Var.f13611i;
        C6446a c6446a2 = new C6446a(c6446a != null ? c6446a.f31100a : DefinitionKt.NO_Float_VALUE);
        C6462q c6462q = g0Var.f13612j;
        if (c6462q == null) {
            c6462q = C6462q.f31124c;
        }
        C6462q c6462q2 = c6462q;
        C4953b c4953bM9144x = g0Var.f13613k;
        if (c4953bM9144x == null) {
            C4953b c4953b = C4953b.f24638c;
            c4953bM9144x = AbstractC4954c.f24641a.m9144x();
        }
        C4953b c4953b2 = c4953bM9144x;
        long j13 = g0Var.f13614l;
        if (j13 == 16) {
            j13 = g4.h0.f13625c;
        }
        long j14 = j13;
        C6457l c6457l = g0Var.f13615m;
        if (c6457l == null) {
            c6457l = C6457l.f31116b;
        }
        C6457l c6457l2 = c6457l;
        d3.k0 k0Var = g0Var.f13616n;
        if (k0Var == null) {
            k0Var = d3.k0.f7781d;
        }
        d3.k0 k0Var2 = k0Var;
        C2509y c2509y = g0Var.f13617o;
        AbstractC2199e abstractC2199e = g0Var.f13618p;
        if (abstractC2199e == null) {
            abstractC2199e = C2201g.f10129a;
        }
        g4.g0 g0Var2 = new g4.g0(interfaceC6461p3, j10, c3998s2, c3994o2, c3995p2, abstractC3988i2, str2, j12, c6446a2, c6462q2, c4953b2, j14, c6457l2, k0Var2, c2509y, abstractC2199e);
        C2506v c2506v = o0Var.f13689b;
        int i10 = AbstractC2507w.f13729b;
        int i11 = c2506v.f13719a;
        int i12 = 5;
        if (i11 == Integer.MIN_VALUE) {
            i11 = 5;
        }
        int i13 = c2506v.f13720b;
        if (i13 == 3) {
            int i14 = g4.p0.f13696a[enumC6757m.ordinal()];
            if (i14 == 1) {
                i12 = 4;
            } else if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i13 == Integer.MIN_VALUE) {
            int i15 = g4.p0.f13696a[enumC6757m.ordinal()];
            if (i15 == 1) {
                i12 = 1;
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 2;
            }
        } else {
            i12 = i13;
        }
        long j15 = c2506v.f13721c;
        if ((j15 & 1095216660480L) == 0) {
            j15 = AbstractC2507w.f13728a;
        }
        C6463r c6463r = c2506v.f13722d;
        if (c6463r == null) {
            c6463r = C6463r.f31127c;
        }
        C2508x c2508x = c2506v.f13723e;
        C6463r c6463r2 = c6463r;
        C6454i c6454i = c2506v.f13724f;
        int i16 = c2506v.f13725g;
        if (i16 == 0) {
            i16 = C6450e.f31105b;
        }
        int i17 = c2506v.f13726h;
        if (i17 == Integer.MIN_VALUE) {
            i17 = 1;
        }
        C6465t c6465t = c2506v.f13727i;
        if (c6465t == null) {
            c6465t = C6465t.f31131c;
        }
        return new g4.o0(g0Var2, new C2506v(i11, i12, j15, c6463r2, c2508x, c6454i, i16, i17, c6465t), o0Var.f13690c);
    }
}
