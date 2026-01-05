package ap;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ap.j */
/* loaded from: classes3.dex */
public final class C0397j {

    /* renamed from: a */
    public final boolean f3094a;

    /* renamed from: b */
    public final boolean f3095b;

    /* renamed from: c */
    public final String f3096c;

    public C0397j(String str, boolean z6, boolean z10) {
        this.f3094a = z6;
        this.f3095b = z10;
        this.f3096c = str;
    }

    /* renamed from: a */
    public static C0397j m1433a(C0397j c0397j, boolean z6, int i10) {
        boolean z10 = (i10 & 1) != 0 ? c0397j.f3094a : true;
        String str = (i10 & 4) != 0 ? c0397j.f3096c : "Failed to read contacts";
        c0397j.getClass();
        return new C0397j(str, z10, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0397j)) {
            return false;
        }
        C0397j c0397j = (C0397j) obj;
        return this.f3094a == c0397j.f3094a && this.f3095b == c0397j.f3095b && AbstractC4154l.m8918a(this.f3096c, c0397j.f3096c);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Boolean.hashCode(this.f3094a) * 31, 31, this.f3095b);
        String str = this.f3096c;
        return iM4558e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReadContactState(success=");
        sb2.append(this.f3094a);
        sb2.append(", isLoading=");
        sb2.append(this.f3095b);
        sb2.append(", error=");
        return AbstractC1452a.m4564k(sb2, this.f3096c, ")");
    }
}
