package ls;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import ts.C7217d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ls.b */
/* loaded from: classes3.dex */
public final class C4511b {

    /* renamed from: a */
    public final List f22451a;

    /* renamed from: b */
    public final boolean f22452b;

    /* renamed from: c */
    public final boolean f22453c;

    /* renamed from: d */
    public final boolean f22454d;

    /* renamed from: e */
    public final int f22455e;

    /* renamed from: f */
    public final boolean f22456f;

    /* renamed from: g */
    public final boolean f22457g;

    /* renamed from: h */
    public final boolean f22458h;

    /* renamed from: i */
    public final boolean f22459i;

    /* renamed from: j */
    public final Map f22460j;

    /* renamed from: k */
    public final boolean f22461k;

    /* renamed from: l */
    public final Integer f22462l;

    /* renamed from: m */
    public final C7217d f22463m;

    public C4511b(List notVerifiedList, boolean z6, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, boolean z15, Map groupedLogs, boolean z16, Integer num, C7217d c7217d) {
        AbstractC4154l.m8923f(notVerifiedList, "notVerifiedList");
        AbstractC4154l.m8923f(groupedLogs, "groupedLogs");
        this.f22451a = notVerifiedList;
        this.f22452b = z6;
        this.f22453c = z10;
        this.f22454d = z11;
        this.f22455e = i10;
        this.f22456f = z12;
        this.f22457g = z13;
        this.f22458h = z14;
        this.f22459i = z15;
        this.f22460j = groupedLogs;
        this.f22461k = z16;
        this.f22462l = num;
        this.f22463m = c7217d;
    }

    /* renamed from: a */
    public static C4511b m9347a(C4511b c4511b, List list, boolean z6, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, boolean z15, Map map, boolean z16, Integer num, C7217d c7217d, int i11) {
        List notVerifiedList = (i11 & 1) != 0 ? c4511b.f22451a : list;
        boolean z17 = (i11 & 2) != 0 ? c4511b.f22452b : z6;
        boolean z18 = (i11 & 4) != 0 ? c4511b.f22453c : z10;
        boolean z19 = (i11 & 8) != 0 ? c4511b.f22454d : z11;
        int i12 = (i11 & 16) != 0 ? c4511b.f22455e : i10;
        c4511b.getClass();
        boolean z20 = (i11 & 64) != 0 ? c4511b.f22456f : z12;
        boolean z21 = (i11 & 128) != 0 ? c4511b.f22457g : z13;
        boolean z22 = (i11 & 256) != 0 ? c4511b.f22458h : z14;
        boolean z23 = (i11 & 512) != 0 ? c4511b.f22459i : z15;
        Map groupedLogs = (i11 & 1024) != 0 ? c4511b.f22460j : map;
        c4511b.getClass();
        boolean z24 = (i11 & 4096) != 0 ? c4511b.f22461k : z16;
        Integer num2 = (i11 & 8192) != 0 ? c4511b.f22462l : num;
        c4511b.getClass();
        C7217d c7217d2 = (i11 & 32768) != 0 ? c4511b.f22463m : c7217d;
        c4511b.getClass();
        AbstractC4154l.m8923f(notVerifiedList, "notVerifiedList");
        AbstractC4154l.m8923f(groupedLogs, "groupedLogs");
        return new C4511b(notVerifiedList, z17, z18, z19, i12, z20, z21, z22, z23, groupedLogs, z24, num2, c7217d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4511b)) {
            return false;
        }
        C4511b c4511b = (C4511b) obj;
        return AbstractC4154l.m8918a(this.f22451a, c4511b.f22451a) && this.f22452b == c4511b.f22452b && this.f22453c == c4511b.f22453c && this.f22454d == c4511b.f22454d && this.f22455e == c4511b.f22455e && this.f22456f == c4511b.f22456f && this.f22457g == c4511b.f22457g && this.f22458h == c4511b.f22458h && this.f22459i == c4511b.f22459i && AbstractC4154l.m8918a(this.f22460j, c4511b.f22460j) && this.f22461k == c4511b.f22461k && AbstractC4154l.m8918a(this.f22462l, c4511b.f22462l) && this.f22463m.equals(c4511b.f22463m);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4556c(0, m0.m7369b(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f22455e, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f22451a.hashCode() * 31, 31, this.f22452b), 31, this.f22453c), 31, this.f22454d), 961), 31, this.f22456f), 31, this.f22457g), 31, this.f22458h), 31, this.f22459i), 31, this.f22460j), 31), 31, this.f22461k);
        Integer num = this.f22462l;
        return this.f22463m.hashCode() + AbstractC1452a.m4558e((iM4558e + (num == null ? 0 : num.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotVerifiedCallLogState(notVerifiedList=");
        sb2.append(this.f22451a);
        sb2.append(", isFetchingData=");
        sb2.append(this.f22452b);
        sb2.append(", isDataLoad=");
        AbstractC0030c.m133x(sb2, this.f22453c, ", isRefreshing=", this.f22454d, ", offset=");
        sb2.append(this.f22455e);
        sb2.append(", synNotAttemptedSince=null, showSyncProgress=");
        sb2.append(this.f22456f);
        sb2.append(", showNoInternetLabel=");
        AbstractC0030c.m133x(sb2, this.f22457g, ", isNetworkConnected=", this.f22458h, ", stopCalling=");
        sb2.append(this.f22459i);
        sb2.append(", groupedLogs=");
        sb2.append(this.f22460j);
        sb2.append(", slotcount=0, isShowError=");
        sb2.append(this.f22461k);
        sb2.append(", errorMessage=");
        sb2.append(this.f22462l);
        sb2.append(", isProcessDetect=false, simOptionState=");
        sb2.append(this.f22463m);
        sb2.append(")");
        return sb2.toString();
    }
}
