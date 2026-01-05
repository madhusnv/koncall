package ut;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.g */
/* loaded from: classes3.dex */
public final class C7543g {

    /* renamed from: a */
    public final List f36305a;

    /* renamed from: b */
    public final List f36306b;

    /* renamed from: c */
    public final String f36307c;

    /* renamed from: d */
    public final boolean f36308d;

    /* renamed from: e */
    public final boolean f36309e;

    /* renamed from: f */
    public final boolean f36310f;

    /* renamed from: g */
    public final boolean f36311g;

    public C7543g(List list, List simData, String str, boolean z6, boolean z10, boolean z11, boolean z12) {
        AbstractC4154l.m8923f(simData, "simData");
        this.f36305a = list;
        this.f36306b = simData;
        this.f36307c = str;
        this.f36308d = z6;
        this.f36309e = z10;
        this.f36310f = z11;
        this.f36311g = z12;
    }

    /* renamed from: a */
    public static C7543g m14298a(C7543g c7543g, List list, String str, boolean z6, boolean z10, boolean z11, boolean z12, int i10) {
        List simData = list;
        List list2 = c7543g.f36305a;
        if ((i10 & 2) != 0) {
            simData = c7543g.f36306b;
        }
        if ((i10 & 4) != 0) {
            str = c7543g.f36307c;
        }
        if ((i10 & 8) != 0) {
            z6 = c7543g.f36308d;
        }
        if ((i10 & 16) != 0) {
            z10 = c7543g.f36309e;
        }
        if ((i10 & 32) != 0) {
            z11 = c7543g.f36310f;
        }
        if ((i10 & 64) != 0) {
            z12 = c7543g.f36311g;
        }
        boolean z13 = z12;
        c7543g.getClass();
        AbstractC4154l.m8923f(simData, "simData");
        boolean z14 = z11;
        boolean z15 = z10;
        boolean z16 = z6;
        return new C7543g(list2, simData, str, z16, z15, z14, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7543g)) {
            return false;
        }
        C7543g c7543g = (C7543g) obj;
        return AbstractC4154l.m8918a(this.f36305a, c7543g.f36305a) && AbstractC4154l.m8918a(this.f36306b, c7543g.f36306b) && AbstractC4154l.m8918a(this.f36307c, c7543g.f36307c) && this.f36308d == c7543g.f36308d && this.f36309e == c7543g.f36309e && this.f36310f == c7543g.f36310f && this.f36311g == c7543g.f36311g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36311g) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f36306b, this.f36305a.hashCode() * 31, 31), 31, this.f36307c), 31, this.f36308d), 31, this.f36309e), 31, this.f36310f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoreState(socialIcons=");
        sb2.append(this.f36305a);
        sb2.append(", simData=");
        sb2.append(this.f36306b);
        sb2.append(", lastSyncTime=");
        AbstractC4801l.m9749w(sb2, this.f36307c, ", isInternet=", this.f36308d, ", isSubscription=");
        AbstractC0030c.m133x(sb2, this.f36309e, ", isSubscriptionBottomSheetVisible=", this.f36310f, ", isShowBatteryOptimizationWarning=");
        return AbstractC5601a.m11242m(sb2, this.f36311g, ")");
    }
}
