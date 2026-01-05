package qp;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.j */
/* loaded from: classes3.dex */
public final class C6273j {

    /* renamed from: a */
    public final List f30444a;

    /* renamed from: b */
    public final boolean f30445b;

    /* renamed from: c */
    public final boolean f30446c;

    /* renamed from: d */
    public final boolean f30447d;

    /* renamed from: e */
    public final boolean f30448e;

    /* renamed from: f */
    public final boolean f30449f;

    /* renamed from: g */
    public final int f30450g;

    /* renamed from: h */
    public final List f30451h;

    /* renamed from: i */
    public final List f30452i;

    /* renamed from: j */
    public final LocalDateTime f30453j;

    /* renamed from: k */
    public final LocalDateTime f30454k;

    /* renamed from: l */
    public final boolean f30455l;

    /* renamed from: m */
    public final EnumC7204p f30456m;

    /* renamed from: n */
    public final LocalDateTime f30457n;

    /* renamed from: o */
    public final LocalDateTime f30458o;

    /* renamed from: p */
    public final List f30459p;

    /* renamed from: q */
    public final boolean f30460q;

    /* renamed from: r */
    public final boolean f30461r;

    /* renamed from: s */
    public final boolean f30462s;

    /* renamed from: t */
    public final String f30463t;

    /* renamed from: u */
    public final C6267d f30464u;

    /* renamed from: v */
    public final boolean f30465v;

    public C6273j(List callTypesHistoryList, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10, List selectedCallTypeList, List totalCallsList, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z14, EnumC7204p simSelectionMode, LocalDateTime localDateTime3, LocalDateTime localDateTime4, List excludeNumbers, boolean z15, boolean z16, boolean z17, String str, C6267d c6267d, boolean z18) {
        AbstractC4154l.m8923f(callTypesHistoryList, "callTypesHistoryList");
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(totalCallsList, "totalCallsList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f30444a = callTypesHistoryList;
        this.f30445b = z6;
        this.f30446c = z10;
        this.f30447d = z11;
        this.f30448e = z12;
        this.f30449f = z13;
        this.f30450g = i10;
        this.f30451h = selectedCallTypeList;
        this.f30452i = totalCallsList;
        this.f30453j = localDateTime;
        this.f30454k = localDateTime2;
        this.f30455l = z14;
        this.f30456m = simSelectionMode;
        this.f30457n = localDateTime3;
        this.f30458o = localDateTime4;
        this.f30459p = excludeNumbers;
        this.f30460q = z15;
        this.f30461r = z16;
        this.f30462s = z17;
        this.f30463t = str;
        this.f30464u = c6267d;
        this.f30465v = z18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.List] */
    /* renamed from: a */
    public static C6273j m12277a(C6273j c6273j, List list, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, int i10, ArrayList arrayList, List list2, boolean z14, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList2, boolean z15, boolean z16, boolean z17, String str, C6267d c6267d, boolean z18, int i11) {
        List callTypesHistoryList = (i11 & 1) != 0 ? c6273j.f30444a : list;
        boolean z19 = (i11 & 2) != 0 ? c6273j.f30445b : z6;
        boolean z20 = (i11 & 4) != 0 ? c6273j.f30446c : z10;
        boolean z21 = (i11 & 8) != 0 ? c6273j.f30447d : z11;
        boolean z22 = (i11 & 16) != 0 ? c6273j.f30448e : z12;
        boolean z23 = (i11 & 32) != 0 ? c6273j.f30449f : z13;
        int i12 = (i11 & 64) != 0 ? c6273j.f30450g : i10;
        ArrayList selectedCallTypeList = (i11 & 128) != 0 ? c6273j.f30451h : arrayList;
        List totalCallsList = (i11 & 256) != 0 ? c6273j.f30452i : list2;
        LocalDateTime localDateTime3 = c6273j.f30453j;
        LocalDateTime localDateTime4 = c6273j.f30454k;
        boolean z24 = (i11 & NewHope.SENDB_BYTES) != 0 ? c6273j.f30455l : z14;
        EnumC7204p simSelectionMode = (i11 & 4096) != 0 ? c6273j.f30456m : enumC7204p;
        LocalDateTime startDate = (i11 & 8192) != 0 ? c6273j.f30457n : localDateTime;
        boolean z25 = z19;
        LocalDateTime endDate = (i11 & 16384) != 0 ? c6273j.f30458o : localDateTime2;
        List excludeNumbers = (i11 & 32768) != 0 ? c6273j.f30459p : arrayList2;
        boolean z26 = z20;
        boolean z27 = (i11 & 65536) != 0 ? c6273j.f30460q : z15;
        boolean z28 = (i11 & 131072) != 0 ? c6273j.f30461r : z16;
        boolean z29 = (i11 & 262144) != 0 ? c6273j.f30462s : z17;
        String str2 = (i11 & 524288) != 0 ? c6273j.f30463t : str;
        C6267d c6267d2 = (i11 & 1048576) != 0 ? c6273j.f30464u : c6267d;
        boolean z30 = (i11 & 2097152) != 0 ? c6273j.f30465v : z18;
        c6273j.getClass();
        AbstractC4154l.m8923f(callTypesHistoryList, "callTypesHistoryList");
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(totalCallsList, "totalCallsList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6273j(callTypesHistoryList, z25, z26, z21, z22, z23, i12, selectedCallTypeList, totalCallsList, localDateTime3, localDateTime4, z24, simSelectionMode, startDate, endDate, excludeNumbers, z27, z28, z29, str2, c6267d2, z30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6273j)) {
            return false;
        }
        C6273j c6273j = (C6273j) obj;
        return AbstractC4154l.m8918a(this.f30444a, c6273j.f30444a) && this.f30445b == c6273j.f30445b && this.f30446c == c6273j.f30446c && this.f30447d == c6273j.f30447d && this.f30448e == c6273j.f30448e && this.f30449f == c6273j.f30449f && this.f30450g == c6273j.f30450g && AbstractC4154l.m8918a(this.f30451h, c6273j.f30451h) && AbstractC4154l.m8918a(this.f30452i, c6273j.f30452i) && AbstractC4154l.m8918a(this.f30453j, c6273j.f30453j) && AbstractC4154l.m8918a(this.f30454k, c6273j.f30454k) && this.f30455l == c6273j.f30455l && this.f30456m == c6273j.f30456m && AbstractC4154l.m8918a(this.f30457n, c6273j.f30457n) && AbstractC4154l.m8918a(this.f30458o, c6273j.f30458o) && AbstractC4154l.m8918a(this.f30459p, c6273j.f30459p) && this.f30460q == c6273j.f30460q && this.f30461r == c6273j.f30461r && this.f30462s == c6273j.f30462s && AbstractC4154l.m8918a(this.f30463t, c6273j.f30463t) && AbstractC4154l.m8918a(this.f30464u, c6273j.f30464u) && this.f30465v == c6273j.f30465v;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30459p, m0.m7370c(this.f30458o, m0.m7370c(this.f30457n, (this.f30456m.hashCode() + AbstractC1452a.m4558e(m0.m7370c(this.f30454k, m0.m7370c(this.f30453j, AbstractC1452a.m4559f(this.f30452i, AbstractC1452a.m4559f(this.f30451h, AbstractC1452a.m4556c(this.f30450g, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(this.f30444a.hashCode() * 31, 31, this.f30445b), 31, this.f30446c), 31, this.f30447d), 31, this.f30448e), 31, this.f30449f), 31), 31), 31), 31), 31), 31, this.f30455l)) * 31, 31), 31), 31), 31, this.f30460q), 31, this.f30461r), 31, this.f30462s);
        String str = this.f30463t;
        return Boolean.hashCode(this.f30465v) + ((this.f30464u.hashCode() + ((iM4558e + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TotalCallsState(callTypesHistoryList=");
        sb2.append(this.f30444a);
        sb2.append(", isLoadTotalCalls=");
        sb2.append(this.f30445b);
        sb2.append(", endReached=");
        AbstractC0030c.m133x(sb2, this.f30446c, ", isLoading=", this.f30447d, ", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f30448e, ", isAcs=", this.f30449f, ", page=");
        sb2.append(this.f30450g);
        sb2.append(", selectedCallTypeList=");
        sb2.append(this.f30451h);
        sb2.append(", totalCallsList=");
        sb2.append(this.f30452i);
        sb2.append(", customDateFilterFromDate=");
        sb2.append(this.f30453j);
        sb2.append(", customDateFilterToDate=");
        sb2.append(this.f30454k);
        sb2.append(", isExclude=");
        sb2.append(this.f30455l);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30456m);
        sb2.append(", startDate=");
        sb2.append(this.f30457n);
        sb2.append(", endDate=");
        sb2.append(this.f30458o);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f30459p);
        sb2.append(", isDurationSorting=");
        AbstractC0030c.m133x(sb2, this.f30460q, ", isEmpty=", this.f30461r, ", isExportReport=");
        AbstractC4801l.m9751y(sb2, this.f30462s, ", exportToCsvFileName=", this.f30463t, ", exportCSVResultState=");
        sb2.append(this.f30464u);
        sb2.append(", shouldScrollToTop=");
        sb2.append(this.f30465v);
        sb2.append(")");
        return sb2.toString();
    }
}
