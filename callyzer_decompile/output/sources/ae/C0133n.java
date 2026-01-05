package ae;

import kotlin.jvm.internal.AbstractC4154l;
import yd.AbstractC8633p;
import yd.EnumC8622e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ae.n */
/* loaded from: classes.dex */
public final class C0133n extends AbstractC0125f {

    /* renamed from: a */
    public final AbstractC8633p f430a;

    /* renamed from: b */
    public final String f431b;

    /* renamed from: c */
    public final EnumC8622e f432c;

    public C0133n(AbstractC8633p abstractC8633p, String str, EnumC8622e enumC8622e) {
        this.f430a = abstractC8633p;
        this.f431b = str;
        this.f432c = enumC8622e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0133n)) {
            return false;
        }
        C0133n c0133n = (C0133n) obj;
        return AbstractC4154l.m8918a(this.f430a, c0133n.f430a) && AbstractC4154l.m8918a(this.f431b, c0133n.f431b) && this.f432c == c0133n.f432c;
    }

    public final int hashCode() {
        int iHashCode = this.f430a.hashCode() * 31;
        String str = this.f431b;
        return this.f432c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
