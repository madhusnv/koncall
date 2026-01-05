package w2;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.p */
/* loaded from: classes.dex */
public interface InterfaceC7877p extends InterfaceC7879r {
    @Override // w2.InterfaceC7879r
    /* renamed from: a */
    default Object mo14850a(Object obj, InterfaceC2141e interfaceC2141e) {
        return interfaceC2141e.invoke(obj, this);
    }

    @Override // w2.InterfaceC7879r
    /* renamed from: c */
    default boolean mo14851c(InterfaceC2139c interfaceC2139c) {
        return ((Boolean) interfaceC2139c.invoke(this)).booleanValue();
    }
}
