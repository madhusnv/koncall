package fb;

import c3.C0847b;
import eb.C1984h;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import hd.C2896h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import lw.C4542g;
import lw.C4545j;
import lw.InterfaceC4544i;
import p020v.a1;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fb.b */
/* loaded from: classes.dex */
public abstract class AbstractC2228b {
    /* renamed from: a */
    public static final C0847b m5937a(InterfaceC4544i interfaceC4544i) {
        AbstractC4154l.m8923f(interfaceC4544i, "<this>");
        if (interfaceC4544i instanceof C4542g) {
            return new C0847b(((C4542g) interfaceC4544i).f22582a);
        }
        if (interfaceC4544i instanceof C4545j) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static boolean m5938b(byte b10) {
        return b10 > -65;
    }

    /* renamed from: c */
    public static final void m5939c(InterfaceC2275m serializer, C1984h input) {
        AbstractC4154l.m8923f(serializer, "serializer");
        AbstractC4154l.m8923f(input, "input");
        C2274l c2274l = C2274l.f10291i;
        C2271i c2271i = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Name")}), 0);
        C2271i c2271i2 = new C2271i(c2274l, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2896h("Value")}), 0);
        InterfaceC2276n interfaceC2276nMo5962b = serializer.mo5962b(new C2272j(a1.m14343w(c2271i, c2271i2)));
        interfaceC2276nMo5962b.mo2596d(c2271i, input.f9321a);
        String str = input.f9322b;
        if (str != null) {
            interfaceC2276nMo5962b.mo2596d(c2271i2, str);
        }
        interfaceC2276nMo5962b.mo2598f();
    }
}
