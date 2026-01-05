package mm;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.m */
/* loaded from: classes3.dex */
public final class C4802m {

    /* renamed from: a */
    public final int f23889a;

    /* renamed from: b */
    public String f23890b;

    /* renamed from: c */
    public final String f23891c;

    /* renamed from: d */
    public final int f23892d;

    /* renamed from: e */
    public final int f23893e;

    /* renamed from: f */
    public final String f23894f;

    /* renamed from: g */
    public final int f23895g;

    /* renamed from: h */
    public final String f23896h;

    /* renamed from: i */
    public final String f23897i;

    /* renamed from: j */
    public final boolean f23898j;

    /* renamed from: k */
    public final LocalDateTime f23899k;

    /* renamed from: l */
    public final LocalDateTime f23900l;

    /* renamed from: m */
    public final LocalDateTime f23901m;

    /* renamed from: n */
    public final boolean f23902n;

    /* renamed from: o */
    public final boolean f23903o;

    /* renamed from: p */
    public final String f23904p;

    /* renamed from: q */
    public final boolean f23905q;

    /* renamed from: r */
    public final LocalDateTime f23906r;

    /* renamed from: s */
    public final LocalDateTime f23907s;

    /* renamed from: t */
    public final String f23908t;

    /* renamed from: u */
    public String f23909u;

    /* renamed from: v */
    public String f23910v;

    /* renamed from: w */
    public int f23911w;

    public C4802m(int i10, String str, String str2, int i11, int i12, String str3, int i13, String str4, String str5, boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, boolean z10, boolean z11, String employeeCode, boolean z12, LocalDateTime localDateTime4, LocalDateTime localDateTime5, String employeeId, String str6, String str7, int i14) {
        AbstractC4154l.m8923f(employeeCode, "employeeCode");
        AbstractC4154l.m8923f(employeeId, "employeeId");
        this.f23889a = i10;
        this.f23890b = str;
        this.f23891c = str2;
        this.f23892d = i11;
        this.f23893e = i12;
        this.f23894f = str3;
        this.f23895g = i13;
        this.f23896h = str4;
        this.f23897i = str5;
        this.f23898j = z6;
        this.f23899k = localDateTime;
        this.f23900l = localDateTime2;
        this.f23901m = localDateTime3;
        this.f23902n = z10;
        this.f23903o = z11;
        this.f23904p = employeeCode;
        this.f23905q = z12;
        this.f23906r = localDateTime4;
        this.f23907s = localDateTime5;
        this.f23908t = employeeId;
        this.f23909u = str6;
        this.f23910v = str7;
        this.f23911w = i14;
    }

    /* renamed from: a */
    public static C4802m m9753a(C4802m c4802m, String str, int i10, int i11, String str2, String str3, String str4, boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, boolean z10, boolean z11, String str5, boolean z12, LocalDateTime localDateTime4, LocalDateTime localDateTime5, String str6, int i12) {
        int i13 = c4802m.f23889a;
        String str7 = c4802m.f23890b;
        String str8 = (i12 & 4) != 0 ? c4802m.f23891c : str;
        int i14 = (i12 & 8) != 0 ? c4802m.f23892d : i10;
        int i15 = (i12 & 16) != 0 ? c4802m.f23893e : i11;
        String str9 = (i12 & 32) != 0 ? c4802m.f23894f : str2;
        int i16 = c4802m.f23895g;
        String str10 = (i12 & 128) != 0 ? c4802m.f23896h : str3;
        String str11 = (i12 & 256) != 0 ? c4802m.f23897i : str4;
        boolean z13 = (i12 & 512) != 0 ? c4802m.f23898j : z6;
        LocalDateTime localDateTime6 = (i12 & 1024) != 0 ? c4802m.f23899k : localDateTime;
        LocalDateTime localDateTime7 = (i12 & NewHope.SENDB_BYTES) != 0 ? c4802m.f23900l : localDateTime2;
        LocalDateTime localDateTime8 = (i12 & 4096) != 0 ? c4802m.f23901m : localDateTime3;
        boolean z14 = (i12 & 8192) != 0 ? c4802m.f23902n : z10;
        boolean z15 = (i12 & 16384) != 0 ? c4802m.f23903o : z11;
        String employeeCode = (i12 & 32768) != 0 ? c4802m.f23904p : str5;
        boolean z16 = z15;
        boolean z17 = (i12 & 65536) != 0 ? c4802m.f23905q : z12;
        LocalDateTime localDateTime9 = (i12 & 131072) != 0 ? c4802m.f23906r : localDateTime4;
        LocalDateTime localDateTime10 = (i12 & 262144) != 0 ? c4802m.f23907s : localDateTime5;
        String employeeId = (i12 & 524288) != 0 ? c4802m.f23908t : str6;
        String str12 = c4802m.f23909u;
        String str13 = c4802m.f23910v;
        int i17 = c4802m.f23911w;
        c4802m.getClass();
        AbstractC4154l.m8923f(employeeCode, "employeeCode");
        AbstractC4154l.m8923f(employeeId, "employeeId");
        return new C4802m(i13, str7, str8, i14, i15, str9, i16, str10, str11, z13, localDateTime6, localDateTime7, localDateTime8, z14, z16, employeeCode, z17, localDateTime9, localDateTime10, employeeId, str12, str13, i17);
    }

    /* renamed from: b */
    public static C4802m m9754b(C4802m c4802m, String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, boolean z6, String str3, int i10) {
        int i11 = c4802m.f23889a;
        String str4 = c4802m.f23890b;
        String str5 = (i10 & 4) != 0 ? c4802m.f23891c : str;
        int i12 = c4802m.f23892d;
        String str6 = str5;
        int i13 = c4802m.f23893e;
        String str7 = c4802m.f23894f;
        int i14 = c4802m.f23895g;
        String str8 = (i10 & 128) != 0 ? c4802m.f23896h : str2;
        String str9 = c4802m.f23897i;
        boolean z10 = (i10 & 512) != 0 ? c4802m.f23898j : false;
        LocalDateTime localDateTime4 = (i10 & 1024) != 0 ? c4802m.f23899k : localDateTime;
        LocalDateTime localDateTime5 = (i10 & NewHope.SENDB_BYTES) != 0 ? c4802m.f23900l : localDateTime2;
        LocalDateTime localDateTime6 = (i10 & 4096) != 0 ? c4802m.f23901m : localDateTime3;
        boolean z11 = false;
        LocalDateTime localDateTime7 = localDateTime5;
        boolean z12 = c4802m.f23902n;
        boolean z13 = (i10 & 16384) != 0 ? c4802m.f23903o : z6;
        String employeeCode = (i10 & 32768) != 0 ? c4802m.f23904p : str3;
        boolean z14 = z13;
        if ((i10 & 65536) != 0) {
            z11 = c4802m.f23905q;
        }
        LocalDateTime localDateTime8 = (i10 & 131072) != 0 ? c4802m.f23906r : null;
        LocalDateTime localDateTime9 = (i10 & 262144) != 0 ? c4802m.f23907s : null;
        String employeeId = c4802m.f23908t;
        String str10 = c4802m.f23909u;
        String str11 = c4802m.f23910v;
        int i15 = c4802m.f23911w;
        c4802m.getClass();
        AbstractC4154l.m8923f(employeeCode, "employeeCode");
        AbstractC4154l.m8923f(employeeId, "employeeId");
        return new C4802m(i11, str4, str6, i12, i13, str7, i14, str8, str9, z10, localDateTime4, localDateTime7, localDateTime6, z12, z14, employeeCode, z11, localDateTime8, localDateTime9, employeeId, str10, str11, i15);
    }

    /* renamed from: c */
    public final String m9755c() {
        String strM16206o;
        String strM16206o2 = null;
        LocalDateTime localDateTime = this.f23900l;
        if (localDateTime != null) {
            C8800o c8800o = C8800o.f42459a;
            strM16206o = C8800o.m16206o(localDateTime);
        } else {
            strM16206o = null;
        }
        LocalDateTime localDateTime2 = this.f23901m;
        if (localDateTime2 != null) {
            C8800o c8800o2 = C8800o.f42459a;
            strM16206o2 = C8800o.m16206o(localDateTime2);
        }
        StringBuilder sbM127r = AbstractC0030c.m127r("[SimNumber := ", this.f23891c, " | companyCode := ", this.f23897i, " | startDate := ");
        a1.m14319B(sbM127r, strM16206o, " | endDate := ", strM16206o2, " | isConnected:= ");
        AbstractC0030c.m133x(sbM127r, this.f23898j, " | leadEnable := ", this.f23902n, " | callRecordEnable := ");
        return AbstractC5601a.m11242m(sbM127r, this.f23905q, " ]");
    }

    /* renamed from: d */
    public final boolean m9756d(LocalDateTime localDateTime) {
        LocalDateTime localDateTime2;
        LocalDateTime localDateTime3 = this.f23901m;
        if (localDateTime3 == null || (localDateTime2 = this.f23900l) == null) {
            return false;
        }
        return (localDateTime.isAfter(localDateTime2) && localDateTime.isBefore(localDateTime3)) || localDateTime.isEqual(localDateTime2) || localDateTime.isEqual(localDateTime3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4802m)) {
            return false;
        }
        C4802m c4802m = (C4802m) obj;
        return this.f23889a == c4802m.f23889a && AbstractC4154l.m8918a(this.f23890b, c4802m.f23890b) && AbstractC4154l.m8918a(this.f23891c, c4802m.f23891c) && this.f23892d == c4802m.f23892d && this.f23893e == c4802m.f23893e && AbstractC4154l.m8918a(this.f23894f, c4802m.f23894f) && this.f23895g == c4802m.f23895g && AbstractC4154l.m8918a(this.f23896h, c4802m.f23896h) && AbstractC4154l.m8918a(this.f23897i, c4802m.f23897i) && this.f23898j == c4802m.f23898j && AbstractC4154l.m8918a(this.f23899k, c4802m.f23899k) && AbstractC4154l.m8918a(this.f23900l, c4802m.f23900l) && AbstractC4154l.m8918a(this.f23901m, c4802m.f23901m) && this.f23902n == c4802m.f23902n && this.f23903o == c4802m.f23903o && AbstractC4154l.m8918a(this.f23904p, c4802m.f23904p) && this.f23905q == c4802m.f23905q && AbstractC4154l.m8918a(this.f23906r, c4802m.f23906r) && AbstractC4154l.m8918a(this.f23907s, c4802m.f23907s) && AbstractC4154l.m8918a(this.f23908t, c4802m.f23908t) && AbstractC4154l.m8918a(this.f23909u, c4802m.f23909u) && AbstractC4154l.m8918a(this.f23910v, c4802m.f23910v) && this.f23911w == c4802m.f23911w;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f23889a) * 31;
        String str = this.f23890b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23891c;
        int iM4556c = AbstractC1452a.m4556c(this.f23893e, AbstractC1452a.m4556c(this.f23892d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.f23894f;
        int iM4556c2 = AbstractC1452a.m4556c(this.f23895g, (iM4556c + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f23896h;
        int iHashCode3 = (iM4556c2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23897i;
        int iM4558e = AbstractC1452a.m4558e((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f23898j);
        LocalDateTime localDateTime = this.f23899k;
        int iHashCode4 = (iM4558e + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.f23900l;
        int iHashCode5 = (iHashCode4 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        LocalDateTime localDateTime3 = this.f23901m;
        int iM4558e2 = AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode5 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31, 31, this.f23902n), 31, this.f23903o), 31, this.f23904p), 31, this.f23905q);
        LocalDateTime localDateTime4 = this.f23906r;
        int iHashCode6 = (iM4558e2 + (localDateTime4 == null ? 0 : localDateTime4.hashCode())) * 31;
        LocalDateTime localDateTime5 = this.f23907s;
        int iM113d = AbstractC0030c.m113d((iHashCode6 + (localDateTime5 == null ? 0 : localDateTime5.hashCode())) * 31, 31, this.f23908t);
        String str6 = this.f23909u;
        int iHashCode7 = (iM113d + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23910v;
        return Integer.hashCode(this.f23911w) + ((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f23890b;
        String str2 = this.f23909u;
        String str3 = this.f23910v;
        int i10 = this.f23911w;
        StringBuilder sbM14337q = a1.m14337q(this.f23889a, "UserSimDetails(id=", ", simCarrierName=", str, ", simNumber=");
        AbstractC1452a.m4551B(sbM14337q, this.f23891c, ", simCountryCode=", this.f23892d, ", slot=");
        AbstractC1452a.m4550A(sbM14337q, this.f23893e, ", iccId=", this.f23894f, ", subscriptionId=");
        AbstractC1452a.m4550A(sbM14337q, this.f23895g, ", userName=", this.f23896h, ", deviceConnectCode=");
        AbstractC4801l.m9749w(sbM14337q, this.f23897i, ", isConnect=", this.f23898j, ", lastSyncCall=");
        sbM14337q.append(this.f23899k);
        sbM14337q.append(", syncStartDateTime=");
        sbM14337q.append(this.f23900l);
        sbM14337q.append(", syncEndDateTime=");
        sbM14337q.append(this.f23901m);
        sbM14337q.append(", isLeadEnable=");
        sbM14337q.append(this.f23902n);
        sbM14337q.append(", isSyncOnlyLeadNumberEnable=");
        AbstractC4801l.m9751y(sbM14337q, this.f23903o, ", employeeCode=", this.f23904p, ", isCallRecordingEnable=");
        sbM14337q.append(this.f23905q);
        sbM14337q.append(", callRecordingStartDateTime=");
        sbM14337q.append(this.f23906r);
        sbM14337q.append(", callRecordingEndDateTime=");
        sbM14337q.append(this.f23907s);
        sbM14337q.append(", employeeId=");
        sbM14337q.append(this.f23908t);
        sbM14337q.append(", userCustomerName=");
        a1.m14319B(sbM14337q, str2, ", userCustomerCountryName=", str3, ", userCustomerCountryCode=");
        return AbstractC5601a.m11233d(i10, ")", sbM14337q);
    }

    public C4802m(String str, String str2, int i10, int i11, String str3, int i12, String str4, String str5, int i13) {
        this(0, str, str2, (i13 & 4) != 0 ? 0 : i10, i11, str3, i12, str4, str5, false, null, null, null, false, false, "", false, null, null, "", null, null, 0);
    }
}
