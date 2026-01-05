package gt;

import a2.AbstractC0030c;
import cm.C0983a;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gt.a */
/* loaded from: classes3.dex */
public final class C2729a {

    /* renamed from: a */
    public final String f15229a;

    /* renamed from: b */
    public final Integer f15230b;

    /* renamed from: c */
    public final boolean f15231c;

    /* renamed from: d */
    public final String f15232d;

    /* renamed from: e */
    public final Integer f15233e;

    /* renamed from: f */
    public final boolean f15234f;

    /* renamed from: g */
    public final String f15235g;

    /* renamed from: h */
    public final Integer f15236h;

    /* renamed from: i */
    public final boolean f15237i;

    /* renamed from: j */
    public final int f15238j;

    /* renamed from: k */
    public final String f15239k;

    /* renamed from: l */
    public final Integer f15240l;

    /* renamed from: m */
    public final boolean f15241m;

    /* renamed from: n */
    public final Integer f15242n;

    /* renamed from: o */
    public final boolean f15243o;

    /* renamed from: p */
    public final Long f15244p;

    /* renamed from: q */
    public final Integer f15245q;

    /* renamed from: r */
    public final Integer f15246r;

    /* renamed from: s */
    public final C0983a f15247s;

    /* renamed from: t */
    public final boolean f15248t;

    public C2729a(String str, Integer num, boolean z6, String str2, Integer num2, boolean z10, String str3, Integer num3, boolean z11, int i10, String str4, Integer num4, boolean z12, Integer num5, boolean z13, Long l9, Integer num6, Integer num7, C0983a c0983a, boolean z14) {
        this.f15229a = str;
        this.f15230b = num;
        this.f15231c = z6;
        this.f15232d = str2;
        this.f15233e = num2;
        this.f15234f = z10;
        this.f15235g = str3;
        this.f15236h = num3;
        this.f15237i = z11;
        this.f15238j = i10;
        this.f15239k = str4;
        this.f15240l = num4;
        this.f15241m = z12;
        this.f15242n = num5;
        this.f15243o = z13;
        this.f15244p = l9;
        this.f15245q = num6;
        this.f15246r = num7;
        this.f15247s = c0983a;
        this.f15248t = z14;
    }

    /* renamed from: a */
    public static C2729a m6728a(C2729a c2729a, String str, Integer num, boolean z6, String str2, Integer num2, boolean z10, String str3, Integer num3, boolean z11, int i10, String str4, Integer num4, boolean z12, Integer num5, boolean z13, Long l9, Integer num6, Integer num7, C0983a c0983a, boolean z14, int i11) {
        String selectType = (i11 & 1) != 0 ? c2729a.f15229a : str;
        Integer num8 = (i11 & 2) != 0 ? c2729a.f15230b : num;
        boolean z15 = (i11 & 4) != 0 ? c2729a.f15231c : z6;
        String name = (i11 & 8) != 0 ? c2729a.f15232d : str2;
        Integer num9 = (i11 & 16) != 0 ? c2729a.f15233e : num2;
        boolean z16 = (i11 & 32) != 0 ? c2729a.f15234f : z10;
        String contactNumber = (i11 & 64) != 0 ? c2729a.f15235g : str3;
        Integer num10 = (i11 & 128) != 0 ? c2729a.f15236h : num3;
        boolean z17 = (i11 & 256) != 0 ? c2729a.f15237i : z11;
        int i12 = (i11 & 512) != 0 ? c2729a.f15238j : i10;
        c2729a.getClass();
        c2729a.getClass();
        String message = (i11 & 4096) != 0 ? c2729a.f15239k : str4;
        Integer num11 = (i11 & 8192) != 0 ? c2729a.f15240l : num4;
        boolean z18 = (i11 & 16384) != 0 ? c2729a.f15241m : z12;
        Integer num12 = (32768 & i11) != 0 ? c2729a.f15242n : num5;
        boolean z19 = (i11 & 65536) != 0 ? c2729a.f15243o : z13;
        Long l10 = (i11 & 131072) != 0 ? c2729a.f15244p : l9;
        Integer num13 = (i11 & 262144) != 0 ? c2729a.f15245q : num6;
        Integer num14 = (i11 & 524288) != 0 ? c2729a.f15246r : num7;
        C0983a countryWithRegion = (i11 & 1048576) != 0 ? c2729a.f15247s : c0983a;
        Integer num15 = num8;
        boolean z20 = (i11 & 2097152) != 0 ? c2729a.f15248t : z14;
        c2729a.getClass();
        AbstractC4154l.m8923f(selectType, "selectType");
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(contactNumber, "contactNumber");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(countryWithRegion, "countryWithRegion");
        return new C2729a(selectType, num15, z15, name, num9, z16, contactNumber, num10, z17, i12, message, num11, z18, num12, z19, l10, num13, num14, countryWithRegion, z20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2729a)) {
            return false;
        }
        C2729a c2729a = (C2729a) obj;
        return this.f15229a.equals(c2729a.f15229a) && AbstractC4154l.m8918a(this.f15230b, c2729a.f15230b) && this.f15231c == c2729a.f15231c && this.f15232d.equals(c2729a.f15232d) && AbstractC4154l.m8918a(this.f15233e, c2729a.f15233e) && this.f15234f == c2729a.f15234f && this.f15235g.equals(c2729a.f15235g) && AbstractC4154l.m8918a(this.f15236h, c2729a.f15236h) && this.f15237i == c2729a.f15237i && this.f15238j == c2729a.f15238j && this.f15239k.equals(c2729a.f15239k) && AbstractC4154l.m8918a(this.f15240l, c2729a.f15240l) && this.f15241m == c2729a.f15241m && AbstractC4154l.m8918a(this.f15242n, c2729a.f15242n) && this.f15243o == c2729a.f15243o && AbstractC4154l.m8918a(this.f15244p, c2729a.f15244p) && AbstractC4154l.m8918a(this.f15245q, c2729a.f15245q) && AbstractC4154l.m8918a(this.f15246r, c2729a.f15246r) && this.f15247s.equals(c2729a.f15247s) && this.f15248t == c2729a.f15248t;
    }

    public final int hashCode() {
        int iHashCode = this.f15229a.hashCode() * 31;
        Integer num = this.f15230b;
        int iM113d = AbstractC0030c.m113d(AbstractC1452a.m4558e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f15231c), 31, this.f15232d);
        Integer num2 = this.f15233e;
        int iM113d2 = AbstractC0030c.m113d(AbstractC1452a.m4558e((iM113d + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f15234f), 31, this.f15235g);
        Integer num3 = this.f15236h;
        int iM113d3 = AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f15238j, AbstractC1452a.m4558e((iM113d2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f15237i), 961), 31, true), 31, this.f15239k);
        Integer num4 = this.f15240l;
        int iM4558e = AbstractC1452a.m4558e((iM113d3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f15241m);
        Integer num5 = this.f15242n;
        int iM4558e2 = AbstractC1452a.m4558e((iM4558e + (num5 == null ? 0 : num5.hashCode())) * 31, 31, this.f15243o);
        Long l9 = this.f15244p;
        int iHashCode2 = (iM4558e2 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num6 = this.f15245q;
        int iHashCode3 = (iHashCode2 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f15246r;
        return Boolean.hashCode(this.f15248t) + ((this.f15247s.hashCode() + ((iHashCode3 + (num7 != null ? num7.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactUsFormState(selectType=");
        sb2.append(this.f15229a);
        sb2.append(", selectTypeErrorMessage=");
        sb2.append(this.f15230b);
        sb2.append(", isSelectTypeValid=");
        AbstractC4801l.m9751y(sb2, this.f15231c, ", name=", this.f15232d, ", nameErrorMessage=");
        sb2.append(this.f15233e);
        sb2.append(", isNameInValid=");
        sb2.append(this.f15234f);
        sb2.append(", contactNumber=");
        sb2.append(this.f15235g);
        sb2.append(", contactNumberErrorMessage=");
        sb2.append(this.f15236h);
        sb2.append(", isContactNumberInValid=");
        sb2.append(this.f15237i);
        sb2.append(", countryCode=");
        sb2.append(this.f15238j);
        sb2.append(", countryCodeErrorMessage=null, isCountryCodeValid=true, message=");
        sb2.append(this.f15239k);
        sb2.append(", messageFieldErrorMessage=");
        sb2.append(this.f15240l);
        sb2.append(", isMessageValid=");
        sb2.append(this.f15241m);
        sb2.append(", mediaSelectionErrorMessage=");
        sb2.append(this.f15242n);
        sb2.append(", isMediaSelectionValid=");
        sb2.append(this.f15243o);
        sb2.append(", totalFileSize=");
        sb2.append(this.f15244p);
        sb2.append(", errorMessage=");
        sb2.append(this.f15245q);
        sb2.append(", successMessage=");
        sb2.append(this.f15246r);
        sb2.append(", countryWithRegion=");
        sb2.append(this.f15247s);
        sb2.append(", isLoading=");
        sb2.append(this.f15248t);
        sb2.append(")");
        return sb2.toString();
    }
}
