package qp;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.C6668r;
import tq.EnumC7204p;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.k */
/* loaded from: classes3.dex */
public final class C6274k {

    /* renamed from: a */
    public final List f30466a;

    /* renamed from: b */
    public final boolean f30467b;

    /* renamed from: c */
    public final LocalDateTime f30468c;

    /* renamed from: d */
    public final LocalDateTime f30469d;

    /* renamed from: e */
    public final EnumC7204p f30470e;

    /* renamed from: f */
    public final LocalDateTime f30471f;

    /* renamed from: g */
    public final LocalDateTime f30472g;

    /* renamed from: h */
    public final List f30473h;

    /* renamed from: i */
    public final boolean f30474i;

    /* renamed from: j */
    public final boolean f30475j;

    /* renamed from: k */
    public final boolean f30476k;

    /* renamed from: l */
    public final boolean f30477l;

    /* renamed from: m */
    public final boolean f30478m;

    /* renamed from: n */
    public final String f30479n;

    /* renamed from: o */
    public final boolean f30480o;

    /* renamed from: p */
    public final int f30481p;

    /* renamed from: q */
    public final boolean f30482q;

    /* renamed from: r */
    public final boolean f30483r;

    public C6274k(List list, boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC7204p simSelectionMode, LocalDateTime localDateTime3, LocalDateTime localDateTime4, List list2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15, int i10, boolean z16, boolean z17) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f30466a = list;
        this.f30467b = z6;
        this.f30468c = localDateTime;
        this.f30469d = localDateTime2;
        this.f30470e = simSelectionMode;
        this.f30471f = localDateTime3;
        this.f30472g = localDateTime4;
        this.f30473h = list2;
        this.f30474i = z10;
        this.f30475j = z11;
        this.f30476k = z12;
        this.f30477l = z13;
        this.f30478m = z14;
        this.f30479n = str;
        this.f30480o = z15;
        this.f30481p = i10;
        this.f30482q = z16;
        this.f30483r = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* renamed from: a */
    public static C6274k m12278a(C6274k c6274k, List list, boolean z6, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, boolean z16, boolean z17, int i11) {
        List callTypesHistoryList = (i11 & 1) != 0 ? c6274k.f30466a : list;
        boolean z18 = (i11 & 2) != 0 ? c6274k.f30467b : z6;
        LocalDateTime customDateFilterFromDate = c6274k.f30468c;
        LocalDateTime customDateFilterToDate = c6274k.f30469d;
        EnumC7204p simSelectionMode = (i11 & 16) != 0 ? c6274k.f30470e : enumC7204p;
        LocalDateTime startDate = (i11 & 32) != 0 ? c6274k.f30471f : localDateTime;
        LocalDateTime endDate = (i11 & 64) != 0 ? c6274k.f30472g : localDateTime2;
        ArrayList excludeNumbers = (i11 & 128) != 0 ? c6274k.f30473h : arrayList;
        boolean z19 = (i11 & 256) != 0 ? c6274k.f30474i : z10;
        boolean z20 = (i11 & 512) != 0 ? c6274k.f30475j : z11;
        boolean z21 = (i11 & 1024) != 0 ? c6274k.f30476k : z12;
        boolean z22 = (i11 & NewHope.SENDB_BYTES) != 0 ? c6274k.f30477l : z13;
        boolean z23 = (i11 & 4096) != 0 ? c6274k.f30478m : z14;
        String sortingElement = c6274k.f30479n;
        boolean z24 = (i11 & 16384) != 0 ? c6274k.f30480o : z15;
        int i12 = (32768 & i11) != 0 ? c6274k.f30481p : i10;
        boolean z25 = (65536 & i11) != 0 ? c6274k.f30482q : z16;
        boolean z26 = (i11 & 131072) != 0 ? c6274k.f30483r : z17;
        c6274k.getClass();
        AbstractC4154l.m8923f(callTypesHistoryList, "callTypesHistoryList");
        AbstractC4154l.m8923f(customDateFilterFromDate, "customDateFilterFromDate");
        AbstractC4154l.m8923f(customDateFilterToDate, "customDateFilterToDate");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        AbstractC4154l.m8923f(sortingElement, "sortingElement");
        return new C6274k(callTypesHistoryList, z18, customDateFilterFromDate, customDateFilterToDate, simSelectionMode, startDate, endDate, excludeNumbers, z19, z20, z21, z22, z23, sortingElement, z24, i12, z25, z26);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6274k)) {
            return false;
        }
        C6274k c6274k = (C6274k) obj;
        return AbstractC4154l.m8918a(this.f30466a, c6274k.f30466a) && this.f30467b == c6274k.f30467b && AbstractC4154l.m8918a(this.f30468c, c6274k.f30468c) && AbstractC4154l.m8918a(this.f30469d, c6274k.f30469d) && this.f30470e == c6274k.f30470e && AbstractC4154l.m8918a(this.f30471f, c6274k.f30471f) && AbstractC4154l.m8918a(this.f30472g, c6274k.f30472g) && AbstractC4154l.m8918a(this.f30473h, c6274k.f30473h) && this.f30474i == c6274k.f30474i && this.f30475j == c6274k.f30475j && this.f30476k == c6274k.f30476k && this.f30477l == c6274k.f30477l && this.f30478m == c6274k.f30478m && AbstractC4154l.m8918a(this.f30479n, c6274k.f30479n) && this.f30480o == c6274k.f30480o && this.f30481p == c6274k.f30481p && this.f30482q == c6274k.f30482q && this.f30483r == c6274k.f30483r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30483r) + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f30481p, AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30473h, m0.m7370c(this.f30472g, m0.m7370c(this.f30471f, (this.f30470e.hashCode() + m0.m7370c(this.f30469d, m0.m7370c(this.f30468c, AbstractC1452a.m4558e(this.f30466a.hashCode() * 31, 31, this.f30467b), 31), 31)) * 31, 31), 31), 31), 31, this.f30474i), 31, this.f30475j), 31, this.f30476k), 31, this.f30477l), 31, this.f30478m), 31, this.f30479n), 31, this.f30480o), 31), 31, this.f30482q);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniqueCallsSummaryCallState(callTypesHistoryList=");
        sb2.append(this.f30466a);
        sb2.append(", endReached=");
        sb2.append(this.f30467b);
        sb2.append(", customDateFilterFromDate=");
        sb2.append(this.f30468c);
        sb2.append(", customDateFilterToDate=");
        sb2.append(this.f30469d);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30470e);
        sb2.append(", startDate=");
        sb2.append(this.f30471f);
        sb2.append(", endDate=");
        sb2.append(this.f30472g);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f30473h);
        sb2.append(", isDurationFilter=");
        AbstractC0030c.m133x(sb2, this.f30474i, ", isLoading=", this.f30475j, ", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f30476k, ", isTotalCallSorting=", this.f30477l, ", isNameSorting=");
        AbstractC4801l.m9751y(sb2, this.f30478m, ", sortingElement=", this.f30479n, ", isAsc=");
        sb2.append(this.f30480o);
        sb2.append(", page=");
        sb2.append(this.f30481p);
        sb2.append(", isExclude=");
        sb2.append(this.f30482q);
        sb2.append(", isEmpty=");
        sb2.append(this.f30483r);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ C6274k() {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateNow = LocalDate.now();
        LocalTime localTime = LocalTime.MIN;
        LocalDateTime localDateTimeOf = LocalDateTime.of(localDateNow, localTime);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(LocalDate.now(), localTime);
        AbstractC4154l.m8922e(localDateTimeOf2, "of(...)");
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C8800o c8800o = C8800o.f42459a;
        this(arrayList, false, localDateTimeOf, localDateTimeOf2, enumC7204p, C8800o.m16209r(), C8800o.m16201j(), C6668r.f31943a, false, false, false, true, true, "", false, 0, false, false);
    }
}
