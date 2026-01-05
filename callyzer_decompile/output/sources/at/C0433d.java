package at;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import ct.C1502a;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.d */
/* loaded from: classes3.dex */
public final class C0433d {

    /* renamed from: a */
    public final boolean f3192a;

    /* renamed from: b */
    public final boolean f3193b;

    /* renamed from: c */
    public final boolean f3194c;

    /* renamed from: d */
    public final boolean f3195d;

    /* renamed from: e */
    public final String f3196e;

    /* renamed from: f */
    public final C1502a f3197f;

    /* renamed from: g */
    public final boolean f3198g;

    public C0433d(boolean z6, boolean z10, boolean z11, boolean z12, String str, C1502a c1502a, boolean z13) {
        this.f3192a = z6;
        this.f3193b = z10;
        this.f3194c = z11;
        this.f3195d = z12;
        this.f3196e = str;
        this.f3197f = c1502a;
        this.f3198g = z13;
    }

    /* renamed from: a */
    public static C0433d m1455a(C0433d c0433d, boolean z6, boolean z10, boolean z11, boolean z12, String str, C1502a c1502a, boolean z13, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c0433d.f3192a;
        }
        boolean z14 = z6;
        if ((i10 & 2) != 0) {
            z10 = c0433d.f3193b;
        }
        boolean z15 = z10;
        if ((i10 & 4) != 0) {
            z11 = c0433d.f3194c;
        }
        boolean z16 = z11;
        if ((i10 & 8) != 0) {
            z12 = c0433d.f3195d;
        }
        boolean z17 = z12;
        if ((i10 & 16) != 0) {
            str = c0433d.f3196e;
        }
        String simNumber = str;
        if ((i10 & 32) != 0) {
            c1502a = c0433d.f3197f;
        }
        C1502a c1502a2 = c1502a;
        if ((i10 & 64) != 0) {
            z13 = c0433d.f3198g;
        }
        c0433d.getClass();
        AbstractC4154l.m8923f(simNumber, "simNumber");
        return new C0433d(z14, z15, z16, z17, simNumber, c1502a2, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0433d)) {
            return false;
        }
        C0433d c0433d = (C0433d) obj;
        return this.f3192a == c0433d.f3192a && this.f3193b == c0433d.f3193b && this.f3194c == c0433d.f3194c && this.f3195d == c0433d.f3195d && AbstractC4154l.m8918a(this.f3196e, c0433d.f3196e) && AbstractC4154l.m8918a(this.f3197f, c0433d.f3197f) && this.f3198g == c0433d.f3198g;
    }

    public final int hashCode() {
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(Boolean.hashCode(this.f3192a) * 31, 31, this.f3193b), 31, this.f3194c), 31, this.f3195d), 31, this.f3196e);
        C1502a c1502a = this.f3197f;
        return Boolean.hashCode(this.f3198g) + ((iM113d + (c1502a == null ? 0 : c1502a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReadTemplateState(dropDownMenu=");
        sb2.append(this.f3192a);
        sb2.append(", isDelete=");
        sb2.append(this.f3193b);
        sb2.append(", isSubscriptionActive=");
        AbstractC0030c.m133x(sb2, this.f3194c, ", isLoading=", this.f3195d, ", simNumber=");
        sb2.append(this.f3196e);
        sb2.append(", template=");
        sb2.append(this.f3197f);
        sb2.append(", isErrorBottomSheetVisible=");
        return AbstractC5601a.m11242m(sb2, this.f3198g, ")");
    }
}
