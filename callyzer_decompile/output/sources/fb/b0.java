package fb;

import e1.j0;
import e1.k0;
import e1.r0;
import eb.l3;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import hd.C2896h;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a */
    public static final /* synthetic */ int f10215a = 0;

    /* renamed from: a */
    public static final void m5940a(j0 j0Var, Object obj, Object obj2) {
        int iM5573f = j0Var.m5573f(obj);
        boolean z6 = iM5573f < 0;
        Object obj3 = z6 ? null : j0Var.f9000c[iM5573f];
        if (obj3 != null) {
            if (obj3 instanceof k0) {
                ((k0) obj3).m5581a(obj2);
            } else if (obj3 != obj2) {
                k0 k0Var = new k0();
                k0Var.m5581a(obj3);
                k0Var.m5581a(obj2);
                obj2 = k0Var;
            }
            obj2 = obj3;
        }
        if (!z6) {
            j0Var.f9000c[iM5573f] = obj2;
            return;
        }
        int i10 = ~iM5573f;
        j0Var.f8999b[i10] = obj;
        j0Var.f9000c[i10] = obj2;
    }

    /* renamed from: b */
    public static j0 m5941b() {
        long[] jArr = r0.f9045a;
        return new j0();
    }

    /* renamed from: c */
    public static final boolean m5942c(j0 j0Var, Object obj, Object obj2) {
        Object objM5574g = j0Var.m5574g(obj);
        if (objM5574g == null) {
            return false;
        }
        if (!(objM5574g instanceof k0)) {
            if (!objM5574g.equals(obj2)) {
                return false;
            }
            j0Var.m5577j(obj);
            return true;
        }
        k0 k0Var = (k0) objM5574g;
        boolean zM5592l = k0Var.m5592l(obj2);
        if (zM5592l && k0Var.m5587g()) {
            j0Var.m5577j(obj);
        }
        return zM5592l;
    }

    /* renamed from: d */
    public static final void m5943d(j0 j0Var, Object obj) {
        boolean zM5587g;
        long[] jArr = j0Var.f8998a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j6) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = j0Var.f8999b[i13];
                        Object obj3 = j0Var.f9000c[i13];
                        if (obj3 instanceof k0) {
                            k0 k0Var = (k0) obj3;
                            k0Var.m5592l(obj);
                            zM5587g = k0Var.m5587g();
                        } else {
                            zM5587g = obj3 == obj;
                        }
                        if (zM5587g) {
                            j0Var.m5578k(i13);
                        }
                    }
                    j6 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: e */
    public static final void m5944e(InterfaceC2275m serializer, l3 input) {
        AbstractC4154l.m8923f(serializer, "serializer");
        AbstractC4154l.m8923f(input, "input");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("EncodedData")}), 0);
        InterfaceC2276n interfaceC2276nMo5962b = serializer.mo5962b(new C2272j(a1.m14343w(c2271i, new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("IpAddress")}), 0))));
        String str = input.f9362a;
        if (str != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i, str);
        }
        interfaceC2276nMo5962b.mo2598f();
    }
}
