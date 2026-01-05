package androidx.compose.foundation.selection;

import androidx.compose.foundation.AbstractC0240d;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f4.EnumC2203a;
import i1.p0;
import i1.u0;
import m1.InterfaceC4630l;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.selection.b */
/* loaded from: classes.dex */
public abstract class AbstractC0252b {
    /* renamed from: a */
    public static final InterfaceC7879r m697a(InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC4630l interfaceC4630l, p0 p0Var, boolean z10, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        InterfaceC7879r interfaceC7879rMo14852e;
        if (p0Var instanceof u0) {
            interfaceC7879rMo14852e = new SelectableElement(z6, interfaceC4630l, (u0) p0Var, z10, c1580h, interfaceC2137a);
        } else if (p0Var == null) {
            interfaceC7879rMo14852e = new SelectableElement(z6, interfaceC4630l, null, z10, c1580h, interfaceC2137a);
        } else {
            C7876o c7876o = C7876o.f37669a;
            interfaceC7879rMo14852e = interfaceC4630l != null ? AbstractC0240d.m644a(c7876o, interfaceC4630l, p0Var).mo14852e(new SelectableElement(z6, interfaceC4630l, null, z10, c1580h, interfaceC2137a)) : AbstractC7862a.m14843a(c7876o, new C0251a(p0Var, z6, z10, c1580h, interfaceC2137a));
        }
        return interfaceC7879r.mo14852e(interfaceC7879rMo14852e);
    }

    /* renamed from: b */
    public static final InterfaceC7879r m698b(InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC4630l interfaceC4630l, boolean z10, C1580h c1580h, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new ToggleableElement(z6, interfaceC4630l, z10, c1580h, interfaceC2139c));
    }

    /* renamed from: c */
    public static final InterfaceC7879r m699c(C1580h c1580h, InterfaceC2137a interfaceC2137a, EnumC2203a enumC2203a, p0 p0Var, boolean z6) {
        if (p0Var instanceof u0) {
            return new TriStateToggleableElement(enumC2203a, null, (u0) p0Var, z6, c1580h, interfaceC2137a);
        }
        if (p0Var == null) {
            return new TriStateToggleableElement(enumC2203a, null, null, z6, c1580h, interfaceC2137a);
        }
        return AbstractC7862a.m14843a(C7876o.f37669a, new C0253c(c1580h, interfaceC2137a, enumC2203a, p0Var, z6));
    }
}
