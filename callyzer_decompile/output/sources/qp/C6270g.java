package qp;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.g */
/* loaded from: classes3.dex */
public final class C6270g {

    /* renamed from: a */
    public final List f30412a;

    /* renamed from: b */
    public final boolean f30413b;

    /* renamed from: c */
    public final List f30414c;

    /* renamed from: d */
    public final EnumC7204p f30415d;

    /* renamed from: e */
    public final LocalDateTime f30416e;

    /* renamed from: f */
    public final LocalDateTime f30417f;

    /* renamed from: g */
    public final List f30418g;

    /* renamed from: h */
    public final boolean f30419h;

    /* renamed from: i */
    public final boolean f30420i;

    /* renamed from: j */
    public final int f30421j;

    /* renamed from: k */
    public final boolean f30422k;

    /* renamed from: l */
    public final boolean f30423l;

    /* renamed from: m */
    public final boolean f30424m;

    /* renamed from: n */
    public final boolean f30425n;

    public C6270g(List list, boolean z6, List selectedCallTypeList, EnumC7204p simSelectionMode, LocalDateTime localDateTime, LocalDateTime localDateTime2, List excludeNumbers, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        this.f30412a = list;
        this.f30413b = z6;
        this.f30414c = selectedCallTypeList;
        this.f30415d = simSelectionMode;
        this.f30416e = localDateTime;
        this.f30417f = localDateTime2;
        this.f30418g = excludeNumbers;
        this.f30419h = z10;
        this.f30420i = z11;
        this.f30421j = i10;
        this.f30422k = z12;
        this.f30423l = z13;
        this.f30424m = z14;
        this.f30425n = z15;
    }

    /* renamed from: a */
    public static C6270g m12274a(C6270g c6270g, List list, boolean z6, EnumC7204p enumC7204p, LocalDateTime localDateTime, LocalDateTime localDateTime2, ArrayList arrayList, boolean z10, boolean z11, int i10, boolean z12, boolean z13, boolean z14, boolean z15, int i11) {
        List neverAttendCallList = (i11 & 1) != 0 ? c6270g.f30412a : list;
        boolean z16 = (i11 & 2) != 0 ? c6270g.f30413b : z6;
        List selectedCallTypeList = c6270g.f30414c;
        EnumC7204p simSelectionMode = (i11 & 8) != 0 ? c6270g.f30415d : enumC7204p;
        LocalDateTime startDate = (i11 & 16) != 0 ? c6270g.f30416e : localDateTime;
        LocalDateTime endDate = (i11 & 32) != 0 ? c6270g.f30417f : localDateTime2;
        List excludeNumbers = (i11 & 64) != 0 ? c6270g.f30418g : arrayList;
        boolean z17 = (i11 & 128) != 0 ? c6270g.f30419h : z10;
        boolean z18 = (i11 & 256) != 0 ? c6270g.f30420i : z11;
        int i12 = (i11 & 512) != 0 ? c6270g.f30421j : i10;
        boolean z19 = (i11 & 1024) != 0 ? c6270g.f30422k : z12;
        boolean z20 = (i11 & NewHope.SENDB_BYTES) != 0 ? c6270g.f30423l : z13;
        boolean z21 = (i11 & 4096) != 0 ? c6270g.f30424m : z14;
        boolean z22 = (i11 & 8192) != 0 ? c6270g.f30425n : z15;
        c6270g.getClass();
        AbstractC4154l.m8923f(neverAttendCallList, "neverAttendCallList");
        AbstractC4154l.m8923f(selectedCallTypeList, "selectedCallTypeList");
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        AbstractC4154l.m8923f(startDate, "startDate");
        AbstractC4154l.m8923f(endDate, "endDate");
        AbstractC4154l.m8923f(excludeNumbers, "excludeNumbers");
        return new C6270g(neverAttendCallList, z16, selectedCallTypeList, simSelectionMode, startDate, endDate, excludeNumbers, z17, z18, i12, z19, z20, z21, z22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6270g)) {
            return false;
        }
        C6270g c6270g = (C6270g) obj;
        return AbstractC4154l.m8918a(this.f30412a, c6270g.f30412a) && this.f30413b == c6270g.f30413b && AbstractC4154l.m8918a(this.f30414c, c6270g.f30414c) && this.f30415d == c6270g.f30415d && AbstractC4154l.m8918a(this.f30416e, c6270g.f30416e) && AbstractC4154l.m8918a(this.f30417f, c6270g.f30417f) && AbstractC4154l.m8918a(this.f30418g, c6270g.f30418g) && this.f30419h == c6270g.f30419h && this.f30420i == c6270g.f30420i && this.f30421j == c6270g.f30421j && this.f30422k == c6270g.f30422k && this.f30423l == c6270g.f30423l && this.f30424m == c6270g.f30424m && this.f30425n == c6270g.f30425n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30425n) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f30421j, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f30418g, m0.m7370c(this.f30417f, m0.m7370c(this.f30416e, (this.f30415d.hashCode() + AbstractC1452a.m4559f(this.f30414c, AbstractC1452a.m4558e(this.f30412a.hashCode() * 31, 31, this.f30413b), 31)) * 31, 31), 31), 31), 31, this.f30419h), 31, this.f30420i), 31), 31, this.f30422k), 31, this.f30423l), 31, this.f30424m);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NeverAttendState(neverAttendCallList=");
        sb2.append(this.f30412a);
        sb2.append(", endReached=");
        sb2.append(this.f30413b);
        sb2.append(", selectedCallTypeList=");
        sb2.append(this.f30414c);
        sb2.append(", simSelectionMode=");
        sb2.append(this.f30415d);
        sb2.append(", startDate=");
        sb2.append(this.f30416e);
        sb2.append(", endDate=");
        sb2.append(this.f30417f);
        sb2.append(", excludeNumbers=");
        sb2.append(this.f30418g);
        sb2.append(", isLoading=");
        sb2.append(this.f30419h);
        sb2.append(", isRefreshLoading=");
        sb2.append(this.f30420i);
        sb2.append(", page=");
        sb2.append(this.f30421j);
        sb2.append(", isNeverAttend=");
        AbstractC0030c.m133x(sb2, this.f30422k, ", isEmpty=", this.f30423l, ", isExclude=");
        sb2.append(this.f30424m);
        sb2.append(", isSubscription=");
        sb2.append(this.f30425n);
        sb2.append(")");
        return sb2.toString();
    }
}
