package na;

import com.sun.mail.imap.IMAPStore;
import kotlin.jvm.internal.AbstractC4154l;
import ud.EnumC7408l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: na.i */
/* loaded from: classes.dex */
public final class C4987i {

    /* renamed from: a */
    public final EnumC7408l f24725a;

    /* renamed from: b */
    public final String f24726b;

    public C4987i(EnumC7408l family, String str) {
        AbstractC4154l.m8923f(family, "family");
        this.f24725a = family;
        this.f24726b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4987i)) {
            return false;
        }
        C4987i c4987i = (C4987i) obj;
        return this.f24725a == c4987i.f24725a && AbstractC4154l.m8918a(this.f24726b, c4987i.f24726b);
    }

    public final int hashCode() {
        int iHashCode = this.f24725a.hashCode() * 31;
        String str = this.f24726b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int[] iArr = AbstractC4986h.f24724a;
        EnumC7408l enumC7408l = this.f24725a;
        return AbstractC4982d.m9897b(IMAPStore.ID_OS, iArr[enumC7408l.ordinal()] == 1 ? "other" : enumC7408l.toString(), this.f24726b);
    }
}
