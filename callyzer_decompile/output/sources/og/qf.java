package og;

import al.C0174b;
import fy.C2403c;
import fy.InterfaceC2401a;
import iy.InterfaceC3364a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import lx.InterfaceC4564c;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class qf {

    /* renamed from: a */
    public static final /* synthetic */ int f26773a = 0;

    /* renamed from: a */
    public static final InterfaceC2401a m10863a(C2403c c2403c, InterfaceC3364a interfaceC3364a, String str) {
        InterfaceC2401a interfaceC2401a;
        AbstractC4154l.m8923f(c2403c, "<this>");
        InterfaceC2401a interfaceC2401a2 = (InterfaceC2401a) c2403c.f10886e.get(str);
        if (interfaceC2401a2 != null) {
            interfaceC2401a = interfaceC2401a2;
        } else {
            C0174b c0174bMo7679a = interfaceC3364a.mo7679a();
            InterfaceC4564c baseClass = c2403c.m6077a();
            c0174bMo7679a.getClass();
            AbstractC4154l.m8923f(baseClass, "baseClass");
            kotlin.jvm.internal.d0.m8909f(1, null);
            interfaceC2401a = null;
        }
        if (interfaceC2401a != null) {
            return interfaceC2401a;
        }
        jy.n0.m8427h(str, c2403c.m6077a());
        throw null;
    }

    /* renamed from: b */
    public static final InterfaceC2401a m10864b(C2403c c2403c, C4597u c4597u, Object value) {
        InterfaceC2401a interfaceC2401a;
        AbstractC4154l.m8923f(c2403c, "<this>");
        AbstractC4154l.m8923f(value, "value");
        c2403c.getClass();
        AbstractC4154l.m8923f(value, "value");
        InterfaceC2401a interfaceC2401a2 = (InterfaceC2401a) c2403c.f10885d.get(kotlin.jvm.internal.a0.m8901a(value.getClass()));
        if (interfaceC2401a2 != null) {
            interfaceC2401a = interfaceC2401a2;
        } else {
            AbstractC4154l.m8923f(value, "value");
            C0174b c0174bMo7710a = c4597u.mo7710a();
            InterfaceC4564c baseClass = c2403c.m6077a();
            c0174bMo7710a.getClass();
            AbstractC4154l.m8923f(baseClass, "baseClass");
            if (((C4147e) baseClass).m8915d(value)) {
                kotlin.jvm.internal.d0.m8909f(1, null);
            }
            interfaceC2401a = null;
        }
        InterfaceC2401a interfaceC2401a3 = interfaceC2401a != null ? interfaceC2401a : null;
        if (interfaceC2401a3 != null) {
            return interfaceC2401a3;
        }
        C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(value.getClass());
        InterfaceC4564c baseClass2 = c2403c.m6077a();
        AbstractC4154l.m8923f(baseClass2, "baseClass");
        String strM8914c = c4147eM8901a.m8914c();
        if (strM8914c == null) {
            strM8914c = String.valueOf(c4147eM8901a);
        }
        jy.n0.m8427h(strM8914c, baseClass2);
        throw null;
    }
}
