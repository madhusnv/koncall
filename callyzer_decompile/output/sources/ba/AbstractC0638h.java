package ba;

import a2.C0029b;
import aa.AbstractC0081h;
import fd.C2271i;
import fd.C2272j;
import fd.C2274l;
import fd.InterfaceC2265c;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import g4.o0;
import gd.C2565c;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import l7.m0;
import og.zf;
import rw.AbstractC6662l;
import s4.C6748d;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ba.h */
/* loaded from: classes.dex */
public abstract class AbstractC0638h {
    /* renamed from: a */
    public static C0029b m1853a(C0029b c0029b, EnumC6757m enumC6757m, o0 o0Var, InterfaceC6747c interfaceC6747c, InterfaceC3987h interfaceC3987h) {
        if (c0029b != null && enumC6757m == c0029b.f106a && zf.m11101c(o0Var, enumC6757m).equals(c0029b.f107b) && interfaceC6747c.mo155a() == c0029b.f108c.f32196a && interfaceC3987h == c0029b.f109d) {
            return c0029b;
        }
        C0029b c0029b2 = C0029b.f105h;
        if (c0029b2 != null && enumC6757m == c0029b2.f106a && zf.m11101c(o0Var, enumC6757m).equals(c0029b2.f107b) && interfaceC6747c.mo155a() == c0029b2.f108c.f32196a && interfaceC3987h == c0029b2.f109d) {
            return c0029b2;
        }
        C0029b c0029b3 = new C0029b(enumC6757m, zf.m11101c(o0Var, enumC6757m), new C6748d(interfaceC6747c.mo155a(), interfaceC6747c.mo154O()), interfaceC3987h);
        C0029b.f105h = c0029b3;
        return c0029b3;
    }

    /* renamed from: b */
    public static String m1854b(Class cls) {
        LinkedHashMap linkedHashMap = l7.o0.f22090b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            m0 m0Var = (m0) cls.getAnnotation(m0.class);
            strValue = m0Var != null ? m0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        AbstractC4154l.m8920c(strValue);
        return strValue;
    }

    /* renamed from: c */
    public static final void m1855c(InterfaceC2275m serializer, AbstractC0081h input) {
        AbstractC4154l.m8923f(serializer, "serializer");
        AbstractC4154l.m8923f(input, "input");
        C2271i c2271i = new C2271i(C2274l.f10291i, AbstractC6662l.m12710M(new InterfaceC2265c[]{new C2565c("arn")}), 0);
        C8849i c8849i = new C8849i(4);
        ((LinkedHashSet) c8849i.f42584c).add(new C2565c("PolicyDescriptorType"));
        c8849i.m16319q(c2271i);
        InterfaceC2276n interfaceC2276nMo5962b = serializer.mo5962b(new C2272j(c8849i));
        input.getClass();
        interfaceC2276nMo5962b.mo2598f();
    }
}
