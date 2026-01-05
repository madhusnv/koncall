package qp;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.C6668r;
import tq.EnumC7204p;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.c */
/* loaded from: classes3.dex */
public final class C6266c {

    /* renamed from: a */
    public final List f30374a;

    /* renamed from: b */
    public final boolean f30375b;

    /* renamed from: c */
    public final LocalDateTime f30376c;

    /* renamed from: d */
    public final LocalDateTime f30377d;

    /* renamed from: e */
    public final List f30378e;

    /* renamed from: f */
    public final EnumC7204p f30379f;

    /* renamed from: g */
    public final LocalDateTime f30380g;

    /* renamed from: h */
    public final LocalDateTime f30381h;

    /* renamed from: i */
    public final List f30382i;

    /* renamed from: j */
    public final boolean f30383j;

    /* renamed from: k */
    public final boolean f30384k;

    /* renamed from: l */
    public final boolean f30385l;

    /* renamed from: m */
    public final boolean f30386m;

    /* renamed from: n */
    public final boolean f30387n;

    /* renamed from: o */
    public final boolean f30388o;

    /* renamed from: p */
    public final int f30389p;

    /* renamed from: q */
    public final boolean f30390q;

    /* renamed from: r */
    public final boolean f30391r;

    public C6266c(List list, boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, List list2, EnumC7204p simSelectionMode, LocalDateTime localDateTime3, LocalDateTime localDateTime4, List list3, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, boolean z16, boolean z17) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f30374a = list;
        this.f30375b = z6;
        this.f30376c = localDateTime;
        this.f30377d = localDateTime2;
        this.f30378e = list2;
        this.f30379f = simSelectionMode;
        this.f30380g = localDateTime3;
        this.f30381h = localDateTime4;
        this.f30382i = list3;
        this.f30383j = z10;
        this.f30384k = z11;
        this.f30385l = z12;
        this.f30386m = z13;
        this.f30387n = z14;
        this.f30388o = z15;
        this.f30389p = i10;
        this.f30390q = z16;
        this.f30391r = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List] */
    /* renamed from: a */
    public static C6266c m12271a(C6266c c6266c, List list, boolean z6, ArrayList arrayList, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, boolean z16, boolean z17, int i11) {
        List callTypesHistoryList = (i11 & 1) != 0 ? c6266c.f30374a : list;
        boolean z18 = (i11 & 2) != 0 ? c6266c.f30375b : z6;
        LocalDateTime customDateFilterFromDate = c6266c.f30376c;
        LocalDateTime customDateFilterToDate = c6266c.f30377d;
        ArrayList selectedCallTypeList = (i11 & 16) != 0 ? c6266c.f30378e : arrayList;
        EnumC7204p simSelectionMode = (i11 & 32) != 0 ? c6266c.f30379f : enumC7204p;
        LocalDateTime startDate = (i11 & 64) != 0 ? c6266c.f30380g : localDateTime;
        LocalDateTime endDate = (i11 & 128) != 0 ? c6266c.f30381h : localDateTime2;
        ArrayList excludeNumbers = (i11 & 256) != 0 ? c6266c.f30382i : arrayList2;
        boolean z19 = (i11 & 512) != 0 ? c6266c.f30383j : z10;
        boolean z20 = (i11 & 1024) != 0 ? c6266c.f30384k : z11;
        boolean z21 = (i11 & NewHope.SENDB_BYTES) != 0 ? c6266c.f30385l : z12;
        boolean z22 = (i11 & 4096) != 0 ? c6266c.f30386m : z13;
        boolean z23 = (i11 & 8192) != 0 ? c6266c.f30387n : z14;
        boolean z24 = (i11 & 16384) != 0 ? c6266c.f30388o : z15;
        int i12 = (32768 & i11) != 0 ? c6266c.f30389p : i10;
        boolean z25 = (65536 & i11) != 0 ? c6266c.f30390q : z16;
        boolean z26 = (i11 & 131072) != 0 ? c6266c.f30391r : z17;
        c6266c.getClass();
        AbstractC4154l.m8923f(callTypesHistoryList, "callTypesHistoryList");
        AbstractC4154l.m8923f(customDateFilterFromDate, "customDateFilterFromDate");
        AbstractC4154l.m8923f(customDateFilterToDate, "customDateFilterToDate");
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6266c(callTypesHistoryList, z18, customDateFilterFromDate, customDateFilterToDate, selectedCallTypeList, simSelectionMode, startDate, endDate, excludeNumbers, z19, z20, z21, z22, z23, z24, i12, z25, z26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6266c)) {
            return false;
        }
        C6266c c6266c = (C6266c) obj;
        return AbstractC4154l.m8918a(this.f30374a, c6266c.f30374a) && this.f30375b == c6266c.f30375b && AbstractC4154l.m8918a(this.f30376c, c6266c.f30376c) && AbstractC4154l.m8918a(this.f30377d, c6266c.f30377d) && AbstractC4154l.m8918a(this.f30378e, c6266c.f30378e) && this.f30379f == c6266c.f30379f && AbstractC4154l.m8918a(this.f30380g, c6266c.f30380g) && AbstractC4154l.m8918a(this.f30381h, c6266c.f30381h) && AbstractC4154l.m8918a(this.f30382i, c6266c.f30382i) && this.f30383j == c6266c.f30383j && this.f30384k == c6266c.f30384k && this.f30385l == c6266c.f30385l && this.f30386m == c6266c.f30386m && this.f30387n == c6266c.f30387n && this.f30388o == c6266c.f30388o && this.f30389p == c6266c.f30389p && this.f30390q == c6266c.f30390q && this.f30391r == c6266c.f30391r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30391r) + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f30389p, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30382i, m0.m7370c(this.f30381h, m0.m7370c(this.f30380g, (this.f30379f.hashCode() + AbstractC1452a.m4559f(this.f30378e, m0.m7370c(this.f30377d, m0.m7370c(this.f30376c, AbstractC1452a.m4558e(this.f30374a.hashCode() * 31, 31, this.f30375b), 31), 31), 31)) * 31, 31), 31), 31), 31, this.f30383j), 31, this.f30384k), 31, this.f30385l), 31, this.f30386m), 31, this.f30387n), 31, this.f30388o), 31), 31, this.f30390q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallTypesSummaryCallState(callTypesHistoryList=");
        sb2.append(this.f30374a);
        sb2.append(", endReached=");
        sb2.append(this.f30375b);
        sb2.append(", customDateFilterFromDate=");
        sb2.append(this.f30376c);
        sb2.append(", customDateFilterToDate=");
        sb2.append(this.f30377d);
        sb2.append(", selectedCallTypeList=");
        sb2.append(this.f30378e);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30379f);
        sb2.append(", startDate=");
        sb2.append(this.f30380g);
        sb2.append(", endDate=");
        sb2.append(this.f30381h);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f30382i);
        sb2.append(", isDurationSorting=");
        sb2.append(this.f30383j);
        sb2.append(", isNameSorting=");
        AbstractC0030c.m133x(sb2, this.f30384k, ", isLoading=", this.f30385l, ", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f30386m, ", isCallDateSorting=", this.f30387n, ", isAcs=");
        sb2.append(this.f30388o);
        sb2.append(", page=");
        sb2.append(this.f30389p);
        sb2.append(", isEmpty=");
        sb2.append(this.f30390q);
        sb2.append(", isExclude=");
        sb2.append(this.f30391r);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C6266c() {
        ArrayList arrayList = new ArrayList();
        C8800o c8800o = C8800o.f42459a;
        LocalDateTime localDateTimeM16209r = C8800o.m16209r();
        LocalDateTime localDateTimeM16201j = C8800o.m16201j();
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        LocalDateTime localDateTimeM16209r2 = C8800o.m16209r();
        LocalDateTime localDateTimeM16201j2 = C8800o.m16201j();
        C6668r c6668r = C6668r.f31943a;
        this(arrayList, false, localDateTimeM16209r, localDateTimeM16201j, c6668r, enumC7204p, localDateTimeM16209r2, localDateTimeM16201j2, c6668r, false, false, false, false, true, true, 0, false, false);
    }
}
