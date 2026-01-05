package pg;

import al.C0174b;
import ex.InterfaceC2139c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import ky.AbstractC4271c;
import ky.C4270b;
import ky.C4276h;
import ky.C4278j;
import ky.C4285q;
import ky.EnumC4269a;
import sd.C6813g;
import zc.AbstractC8927d;
import zc.C8925b;
import zc.C8926c;
import zc.C8934k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y9 {
    /* renamed from: a */
    public static C4285q m11954a(InterfaceC2139c interfaceC2139c) {
        C4270b from = AbstractC4271c.f21666d;
        AbstractC4154l.m8923f(from, "from");
        C4276h c4276h = new C4276h();
        C4278j c4278j = from.f21667a;
        c4276h.f21678a = c4278j.f21682b;
        c4276h.f21679b = c4278j.f21681a;
        String str = c4278j.f21683c;
        String str2 = c4278j.f21684d;
        EnumC4269a enumC4269a = c4278j.f21687g;
        boolean z6 = c4278j.f21685e;
        c4276h.f21680c = c4278j.f21686f;
        C0174b module = from.f21668b;
        interfaceC2139c.invoke(c4276h);
        if (!AbstractC4154l.m8918a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C4278j c4278j2 = new C4278j(c4276h.f21679b, c4276h.f21678a, str, str2, z6, c4276h.f21680c, enumC4269a);
        AbstractC4154l.m8923f(module, "module");
        return new C4285q(c4278j2, module);
    }

    /* renamed from: b */
    public static final String m11955b(AbstractC8927d abstractC8927d) {
        AbstractC4154l.m8923f(abstractC8927d, "<this>");
        if (!(abstractC8927d instanceof C8926c)) {
            if (abstractC8927d instanceof C8925b) {
                return ((C8925b) abstractC8927d).f42889a;
            }
            throw new NoWhenBranchMatchedException();
        }
        z9 z9Var = ((C8926c) abstractC8927d).f42890a;
        if (!(z9Var instanceof C8934k)) {
            return z9Var.toString();
        }
        return "[" + C6813g.f32357g.m12988d(((C8934k) z9Var).toString()) + ']';
    }
}
