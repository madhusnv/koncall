package og;

import eb.C1983g;
import eb.C1984h;
import fd.C2271i;
import fd.C2274l;
import fd.InterfaceC2264b;
import fd.InterfaceC2265c;
import hd.C2891c;
import hd.C2896h;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.AbstractC6662l;
import s4.C6759o;
import s4.C6760p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class af {
    /* renamed from: a */
    public static final C1984h m10532a(C2891c c2891c) {
        C1983g c1983g = new C1983g();
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Name")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Value")}), 0);
        InterfaceC2264b interfaceC2264bM11231b = AbstractC5601a.m11231b(p020v.a1.m14343w(c2271i, c2271i2), c2891c);
        while (true) {
            Integer numMo71n = interfaceC2264bM11231b.mo71n();
            int i10 = c2271i.f10279b;
            if (numMo71n == null || numMo71n.intValue() != i10) {
                int i11 = c2271i2.f10279b;
                if (numMo71n == null || numMo71n.intValue() != i11) {
                    if (numMo71n == null) {
                        break;
                    }
                    interfaceC2264bM11231b.mo63e();
                } else {
                    c1983g.f9317b = interfaceC2264bM11231b.mo62d();
                }
            } else {
                c1983g.f9316a = interfaceC2264bM11231b.mo62d();
            }
        }
        if (c1983g.f9316a == null) {
            c1983g.f9316a = "";
        }
        return new C1984h(c1983g);
    }

    /* renamed from: b */
    public static final long m10533b(double d2) {
        return m10535d((float) d2, 4294967296L);
    }

    /* renamed from: c */
    public static final long m10534c(int i10) {
        return m10535d(i10, 4294967296L);
    }

    /* renamed from: d */
    public static final long m10535d(float f6, long j6) {
        long jFloatToRawIntBits = j6 | (Float.floatToRawIntBits(f6) & 4294967295L);
        C6760p[] c6760pArr = C6759o.f32212b;
        return jFloatToRawIntBits;
    }
}
