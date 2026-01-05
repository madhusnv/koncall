package w2;

import a2.AbstractC0030c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w2.l */
/* loaded from: classes.dex */
public final class C7873l implements InterfaceC7879r {

    /* renamed from: a */
    public final InterfaceC7879r f37665a;

    /* renamed from: b */
    public final InterfaceC7879r f37666b;

    public C7873l(InterfaceC7879r interfaceC7879r, InterfaceC7879r interfaceC7879r2) {
        this.f37665a = interfaceC7879r;
        this.f37666b = interfaceC7879r2;
    }

    @Override // w2.InterfaceC7879r
    /* renamed from: a */
    public final Object mo14850a(Object obj, InterfaceC2141e interfaceC2141e) {
        return this.f37666b.mo14850a(this.f37665a.mo14850a(obj, interfaceC2141e), interfaceC2141e);
    }

    @Override // w2.InterfaceC7879r
    /* renamed from: c */
    public final boolean mo14851c(InterfaceC2139c interfaceC2139c) {
        return this.f37665a.mo14851c(interfaceC2139c) && this.f37666b.mo14851c(interfaceC2139c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7873l)) {
            return false;
        }
        C7873l c7873l = (C7873l) obj;
        return AbstractC4154l.m8918a(this.f37665a, c7873l.f37665a) && AbstractC4154l.m8918a(this.f37666b, c7873l.f37666b);
    }

    public final int hashCode() {
        return (this.f37666b.hashCode() * 31) + this.f37665a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("["), (String) mo14850a("", C7872k.f37664a), ']');
    }
}
