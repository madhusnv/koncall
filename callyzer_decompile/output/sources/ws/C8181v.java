package ws;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.v */
/* loaded from: classes3.dex */
public final class C8181v {

    /* renamed from: a */
    public final List f39115a;

    /* renamed from: b */
    public final C8176q f39116b;

    /* renamed from: c */
    public final C8176q f39117c;

    /* renamed from: d */
    public final boolean f39118d;

    /* renamed from: e */
    public final List f39119e;

    /* renamed from: f */
    public final int f39120f;

    /* renamed from: g */
    public final boolean f39121g;

    /* renamed from: h */
    public final boolean f39122h;

    /* renamed from: i */
    public final boolean f39123i;

    /* renamed from: j */
    public final boolean f39124j;

    /* renamed from: k */
    public final boolean f39125k;

    /* renamed from: l */
    public final boolean f39126l;

    /* renamed from: m */
    public final boolean f39127m;

    /* renamed from: n */
    public final boolean f39128n;

    /* renamed from: o */
    public final int f39129o;

    /* renamed from: p */
    public final boolean f39130p;

    /* renamed from: q */
    public final boolean f39131q;

    /* renamed from: r */
    public final C8182w f39132r;

    /* renamed from: s */
    public final int f39133s;

    /* renamed from: t */
    public final String f39134t;

    public C8181v(List simList, C8176q c8176q, C8176q c8176q2, boolean z6, List corruptCallsList, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, boolean z18, boolean z19, C8182w c8182w, int i12, String str) {
        AbstractC4154l.m8923f(simList, "simList");
        AbstractC4154l.m8923f(corruptCallsList, "corruptCallsList");
        this.f39115a = simList;
        this.f39116b = c8176q;
        this.f39117c = c8176q2;
        this.f39118d = z6;
        this.f39119e = corruptCallsList;
        this.f39120f = i10;
        this.f39121g = z10;
        this.f39122h = z11;
        this.f39123i = z12;
        this.f39124j = z13;
        this.f39125k = z14;
        this.f39126l = z15;
        this.f39127m = z16;
        this.f39128n = z17;
        this.f39129o = i11;
        this.f39130p = z18;
        this.f39131q = z19;
        this.f39132r = c8182w;
        this.f39133s = i12;
        this.f39134t = str;
    }

    /* renamed from: a */
    public static C8181v m15340a(C8181v c8181v, List list, C8176q c8176q, C8176q c8176q2, boolean z6, List list2, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, boolean z18, boolean z19, C8182w c8182w, int i12, String str, int i13) {
        c8181v.getClass();
        c8181v.getClass();
        List simList = (i13 & 4) != 0 ? c8181v.f39115a : list;
        C8176q c8176q3 = (i13 & 8) != 0 ? c8181v.f39116b : c8176q;
        C8176q c8176q4 = (i13 & 16) != 0 ? c8181v.f39117c : c8176q2;
        boolean z20 = (i13 & 32) != 0 ? c8181v.f39118d : z6;
        List corruptCallsList = (i13 & 64) != 0 ? c8181v.f39119e : list2;
        int i14 = (i13 & 128) != 0 ? c8181v.f39120f : i10;
        boolean z21 = (i13 & 256) != 0 ? c8181v.f39121g : z10;
        boolean z22 = (i13 & 512) != 0 ? c8181v.f39122h : z11;
        boolean z23 = (i13 & 1024) != 0 ? c8181v.f39123i : z12;
        boolean z24 = (i13 & NewHope.SENDB_BYTES) != 0 ? c8181v.f39124j : z13;
        boolean z25 = (i13 & 4096) != 0 ? c8181v.f39125k : z14;
        boolean z26 = (i13 & 8192) != 0 ? c8181v.f39126l : z15;
        boolean z27 = (i13 & 16384) != 0 ? c8181v.f39127m : z16;
        boolean z28 = (32768 & i13) != 0 ? c8181v.f39128n : z17;
        int i15 = (i13 & 65536) != 0 ? c8181v.f39129o : i11;
        boolean z29 = (i13 & 131072) != 0 ? c8181v.f39130p : z18;
        boolean z30 = (i13 & 262144) != 0 ? c8181v.f39131q : z19;
        C8182w corruptCardState = (i13 & 524288) != 0 ? c8181v.f39132r : c8182w;
        C8176q c8176q5 = c8176q3;
        int i16 = (i13 & 1048576) != 0 ? c8181v.f39133s : i12;
        String str2 = (i13 & 2097152) != 0 ? c8181v.f39134t : str;
        c8181v.getClass();
        AbstractC4154l.m8923f(simList, "simList");
        AbstractC4154l.m8923f(corruptCallsList, "corruptCallsList");
        AbstractC4154l.m8923f(corruptCardState, "corruptCardState");
        return new C8181v(simList, c8176q5, c8176q4, z20, corruptCallsList, i14, z21, z22, z23, z24, z25, z26, z27, z28, i15, z29, z30, corruptCardState, i16, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8181v)) {
            return false;
        }
        C8181v c8181v = (C8181v) obj;
        return AbstractC4154l.m8918a(this.f39115a, c8181v.f39115a) && AbstractC4154l.m8918a(this.f39116b, c8181v.f39116b) && AbstractC4154l.m8918a(this.f39117c, c8181v.f39117c) && this.f39118d == c8181v.f39118d && AbstractC4154l.m8918a(this.f39119e, c8181v.f39119e) && this.f39120f == c8181v.f39120f && this.f39121g == c8181v.f39121g && this.f39122h == c8181v.f39122h && this.f39123i == c8181v.f39123i && this.f39124j == c8181v.f39124j && this.f39125k == c8181v.f39125k && this.f39126l == c8181v.f39126l && this.f39127m == c8181v.f39127m && this.f39128n == c8181v.f39128n && this.f39129o == c8181v.f39129o && this.f39130p == c8181v.f39130p && this.f39131q == c8181v.f39131q && this.f39132r.equals(c8181v.f39132r) && this.f39133s == c8181v.f39133s && AbstractC4154l.m8918a(this.f39134t, c8181v.f39134t);
    }

    public final int hashCode() {
        int iM4559f = AbstractC1452a.m4559f(this.f39115a, Boolean.hashCode(false) * 961, 31);
        C8176q c8176q = this.f39116b;
        int iHashCode = (iM4559f + (c8176q == null ? 0 : c8176q.hashCode())) * 31;
        C8176q c8176q2 = this.f39117c;
        int iM4556c = AbstractC1452a.m4556c(this.f39133s, (this.f39132r.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f39129o, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f39120f, AbstractC1452a.m4559f(this.f39119e, AbstractC1452a.m4558e((iHashCode + (c8176q2 == null ? 0 : c8176q2.hashCode())) * 31, 31, this.f39118d), 31), 31), 31, this.f39121g), 31, this.f39122h), 31, this.f39123i), 31, this.f39124j), 31, this.f39125k), 31, this.f39126l), 31, this.f39127m), 31, this.f39128n), 31), 31, this.f39130p), 31, this.f39131q)) * 31, 31);
        String str = this.f39134t;
        return iM4556c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CorruptCallsState(dataPickerVisible=false, selectedSIM=null, simList=");
        sb2.append(this.f39115a);
        sb2.append(", selectedCorruptedCallLog=");
        sb2.append(this.f39116b);
        sb2.append(", tmpCorruptedCallLog=");
        sb2.append(this.f39117c);
        sb2.append(", syncLoading=");
        sb2.append(this.f39118d);
        sb2.append(", corruptCallsList=");
        sb2.append(this.f39119e);
        sb2.append(", totalCount=");
        sb2.append(this.f39120f);
        sb2.append(", chOtherSkip=");
        AbstractC0030c.m133x(sb2, this.f39121g, ", chApplySimilar=", this.f39122h, ", isVisibleApplySimilar=");
        AbstractC0030c.m133x(sb2, this.f39123i, ", isLoading=", this.f39124j, ", isRefreshLoading=");
        AbstractC0030c.m133x(sb2, this.f39125k, ", endReached=", this.f39126l, ", isEmptyScreen=");
        AbstractC0030c.m133x(sb2, this.f39127m, ", isShowMore=", this.f39128n, ", page=");
        sb2.append(this.f39129o);
        sb2.append(", isInternet=");
        sb2.append(this.f39130p);
        sb2.append(", openSIMChangeDialog=");
        sb2.append(this.f39131q);
        sb2.append(", corruptCardState=");
        sb2.append(this.f39132r);
        sb2.append(", simNumMissCallCount=");
        sb2.append(this.f39133s);
        sb2.append(", errorMessage=");
        sb2.append(this.f39134t);
        sb2.append(")");
        return sb2.toString();
    }
}
