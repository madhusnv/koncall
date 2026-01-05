package androidx.compose.ui.focus;

import b3.C0589u;
import b3.C0592x;
import ex.InterfaceC2139c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.ui.focus.a */
/* loaded from: classes.dex */
public abstract class AbstractC0259a {
    /* renamed from: a */
    public static final InterfaceC7879r m711a(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new FocusPropertiesElement(new C0589u(interfaceC2139c)));
    }

    /* renamed from: b */
    public static final InterfaceC7879r m712b(InterfaceC7879r interfaceC7879r, C0592x c0592x) {
        return interfaceC7879r.mo14852e(new FocusRequesterElement(c0592x));
    }

    /* renamed from: c */
    public static final InterfaceC7879r m713c(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new FocusChangedElement(interfaceC2139c));
    }
}
