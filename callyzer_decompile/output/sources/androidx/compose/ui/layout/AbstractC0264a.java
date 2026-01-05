package androidx.compose.ui.layout;

import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import t3.C7034u;
import t3.i0;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.ui.layout.a */
/* loaded from: classes.dex */
public abstract class AbstractC0264a {
    /* renamed from: a */
    public static final Object m720a(i0 i0Var) {
        Object objMo13310C = i0Var.mo13310C();
        C7034u c7034u = objMo13310C instanceof C7034u ? (C7034u) objMo13310C : null;
        if (c7034u != null) {
            return c7034u.f34026q;
        }
        return null;
    }

    /* renamed from: b */
    public static final InterfaceC7879r m721b(InterfaceC7879r interfaceC7879r, InterfaceC2142f interfaceC2142f) {
        return interfaceC7879r.mo14852e(new LayoutElement(interfaceC2142f));
    }

    /* renamed from: c */
    public static final InterfaceC7879r m722c(InterfaceC7879r interfaceC7879r, Object obj) {
        return interfaceC7879r.mo14852e(new LayoutIdElement(obj));
    }

    /* renamed from: d */
    public static final InterfaceC7879r m723d(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new OnGloballyPositionedElement(interfaceC2139c));
    }

    /* renamed from: e */
    public static final InterfaceC7879r m724e(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new OnSizeChangedModifier(interfaceC2139c));
    }
}
