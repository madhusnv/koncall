package zr;

import a2.AbstractC0030c;
import cm.C0983a;
import com.sun.mail.util.AbstractC1452a;
import g2.h4;
import im.EnumC3313o;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4800k;
import mm.C4802m;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zr.b */
/* loaded from: classes3.dex */
public final class C9032b {

    /* renamed from: A */
    public final boolean f43492A;

    /* renamed from: B */
    public final String f43493B;

    /* renamed from: C */
    public final boolean f43494C;

    /* renamed from: D */
    public final boolean f43495D;

    /* renamed from: E */
    public final C6361k f43496E;

    /* renamed from: F */
    public final boolean f43497F;

    /* renamed from: G */
    public final String f43498G;

    /* renamed from: H */
    public final boolean f43499H;

    /* renamed from: I */
    public final String f43500I;

    /* renamed from: J */
    public final boolean f43501J;

    /* renamed from: K */
    public final List f43502K;

    /* renamed from: L */
    public final boolean f43503L;

    /* renamed from: M */
    public final C0983a f43504M;

    /* renamed from: N */
    public final C0983a f43505N;

    /* renamed from: O */
    public final h4 f43506O;

    /* renamed from: a */
    public final List f43507a;

    /* renamed from: b */
    public final C4802m f43508b;

    /* renamed from: c */
    public final boolean f43509c;

    /* renamed from: d */
    public final List f43510d;

    /* renamed from: e */
    public final List f43511e;

    /* renamed from: f */
    public final C4800k f43512f;

    /* renamed from: g */
    public final String f43513g;

    /* renamed from: h */
    public final String f43514h;

    /* renamed from: i */
    public final Integer f43515i;

    /* renamed from: j */
    public final Integer f43516j;

    /* renamed from: k */
    public final Integer f43517k;

    /* renamed from: l */
    public final EnumC3313o f43518l;

    /* renamed from: m */
    public final boolean f43519m;

    /* renamed from: n */
    public final boolean f43520n;

    /* renamed from: o */
    public final LocalDateTime f43521o;

    /* renamed from: p */
    public final Integer f43522p;

    /* renamed from: q */
    public final String f43523q;

    /* renamed from: r */
    public final String f43524r;

    /* renamed from: s */
    public final int f43525s;

    /* renamed from: t */
    public final Integer f43526t;

    /* renamed from: u */
    public final int f43527u;

    /* renamed from: v */
    public final Integer f43528v;

    /* renamed from: w */
    public final String f43529w;

    /* renamed from: x */
    public final boolean f43530x;

    /* renamed from: y */
    public final boolean f43531y;

    /* renamed from: z */
    public final boolean f43532z;

    public C9032b(List connectedLeadSIM, C4802m c4802m, boolean z6, List leadFormDynamicFields, List statusList, C4800k c4800k, String str, String str2, Integer num, Integer num2, Integer num3, EnumC3313o selectedAssignEmployee, boolean z10, boolean z11, LocalDateTime localDateTime, Integer num4, String str3, String str4, int i10, Integer num5, int i11, Integer num6, String str5, boolean z12, boolean z13, boolean z14, boolean z15, String str6, boolean z16, boolean z17, C6361k c6361k, boolean z18, String str7, boolean z19, String str8, boolean z20, List leadAssignOptions, boolean z21, C0983a c0983a, C0983a c0983a2, h4 h4Var) {
        AbstractC4154l.m8923f(connectedLeadSIM, "connectedLeadSIM");
        AbstractC4154l.m8923f(leadFormDynamicFields, "leadFormDynamicFields");
        AbstractC4154l.m8923f(statusList, "statusList");
        AbstractC4154l.m8923f(selectedAssignEmployee, "selectedAssignEmployee");
        AbstractC4154l.m8923f(leadAssignOptions, "leadAssignOptions");
        this.f43507a = connectedLeadSIM;
        this.f43508b = c4802m;
        this.f43509c = z6;
        this.f43510d = leadFormDynamicFields;
        this.f43511e = statusList;
        this.f43512f = c4800k;
        this.f43513g = str;
        this.f43514h = str2;
        this.f43515i = num;
        this.f43516j = num2;
        this.f43517k = num3;
        this.f43518l = selectedAssignEmployee;
        this.f43519m = z10;
        this.f43520n = z11;
        this.f43521o = localDateTime;
        this.f43522p = num4;
        this.f43523q = str3;
        this.f43524r = str4;
        this.f43525s = i10;
        this.f43526t = num5;
        this.f43527u = i11;
        this.f43528v = num6;
        this.f43529w = str5;
        this.f43530x = z12;
        this.f43531y = z13;
        this.f43532z = z14;
        this.f43492A = z15;
        this.f43493B = str6;
        this.f43494C = z16;
        this.f43495D = z17;
        this.f43496E = c6361k;
        this.f43497F = z18;
        this.f43498G = str7;
        this.f43499H = z19;
        this.f43500I = str8;
        this.f43501J = z20;
        this.f43502K = leadAssignOptions;
        this.f43503L = z21;
        this.f43504M = c0983a;
        this.f43505N = c0983a2;
        this.f43506O = h4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /* renamed from: a */
    public static C9032b m16496a(C9032b c9032b, List list, C4802m c4802m, boolean z6, List list2, ArrayList arrayList, C4800k c4800k, String str, String str2, Integer num, Integer num2, Integer num3, EnumC3313o enumC3313o, boolean z10, boolean z11, LocalDateTime localDateTime, Integer num4, String str3, String str4, int i10, Integer num5, int i11, Integer num6, String str5, boolean z12, boolean z13, boolean z14, String str6, boolean z15, boolean z16, C6361k c6361k, boolean z17, String str7, boolean z18, String str8, List list3, C0983a c0983a, C0983a c0983a2, h4 h4Var, int i12, int i13) {
        List connectedLeadSIM = (i12 & 1) != 0 ? c9032b.f43507a : list;
        C4802m c4802m2 = (i12 & 2) != 0 ? c9032b.f43508b : c4802m;
        boolean z19 = (i12 & 4) != 0 ? c9032b.f43509c : z6;
        List leadFormDynamicFields = (i12 & 8) != 0 ? c9032b.f43510d : list2;
        ArrayList statusList = (i12 & 16) != 0 ? c9032b.f43511e : arrayList;
        C4800k c4800k2 = (i12 & 32) != 0 ? c9032b.f43512f : c4800k;
        String firstName = (i12 & 64) != 0 ? c9032b.f43513g : str;
        String str9 = (i12 & 128) != 0 ? c9032b.f43514h : str2;
        Integer num7 = (i12 & 256) != 0 ? c9032b.f43515i : num;
        Integer num8 = (i12 & 512) != 0 ? c9032b.f43516j : num2;
        Integer num9 = (i12 & 1024) != 0 ? c9032b.f43517k : num3;
        EnumC3313o selectedAssignEmployee = (i12 & NewHope.SENDB_BYTES) != 0 ? c9032b.f43518l : enumC3313o;
        boolean z20 = (i12 & 4096) != 0 ? c9032b.f43519m : z10;
        boolean z21 = (i12 & 8192) != 0 ? c9032b.f43520n : z11;
        LocalDateTime localDateTime2 = (i12 & 16384) != 0 ? c9032b.f43521o : localDateTime;
        Integer num10 = (32768 & i12) != 0 ? c9032b.f43522p : num4;
        String str10 = (65536 & i12) != 0 ? c9032b.f43523q : str3;
        String phoneNumber = (131072 & i12) != 0 ? c9032b.f43524r : str4;
        int i14 = (i12 & 262144) != 0 ? c9032b.f43525s : i10;
        Integer num11 = (i12 & 524288) != 0 ? c9032b.f43526t : num5;
        int i15 = (i12 & 1048576) != 0 ? c9032b.f43527u : i11;
        Integer num12 = (i12 & 2097152) != 0 ? c9032b.f43528v : num6;
        String alternativePhoneNumber = (i12 & 4194304) != 0 ? c9032b.f43529w : str5;
        C4802m c4802m3 = c4802m2;
        boolean z22 = (i12 & 8388608) != 0 ? c9032b.f43530x : z12;
        boolean z23 = (i12 & 16777216) != 0 ? c9032b.f43531y : z13;
        boolean z24 = (i12 & 33554432) != 0 ? c9032b.f43532z : z14;
        boolean z25 = (i12 & 67108864) != 0 ? c9032b.f43492A : false;
        String errorMessage = (i12 & 134217728) != 0 ? c9032b.f43493B : str6;
        boolean z26 = z19;
        boolean z27 = (i12 & 268435456) != 0 ? c9032b.f43494C : z15;
        boolean z28 = (i12 & 536870912) != 0 ? c9032b.f43495D : z16;
        C6361k c6361k2 = (i12 & 1073741824) != 0 ? c9032b.f43496E : c6361k;
        boolean z29 = (i12 & Integer.MIN_VALUE) != 0 ? c9032b.f43497F : z17;
        String str11 = (i13 & 1) != 0 ? c9032b.f43498G : str7;
        boolean z30 = (i13 & 2) != 0 ? c9032b.f43499H : z18;
        String str12 = (i13 & 4) != 0 ? c9032b.f43500I : str8;
        boolean z31 = (i13 & 8) != 0 ? c9032b.f43501J : true;
        List leadAssignOptions = (i13 & 16) != 0 ? c9032b.f43502K : list3;
        C4800k c4800k3 = c4800k2;
        boolean z32 = (i13 & 32) != 0 ? c9032b.f43503L : true;
        C0983a countryWithRegion = (i13 & 64) != 0 ? c9032b.f43504M : c0983a;
        String str13 = str9;
        C0983a altCountryWithRegion = (i13 & 128) != 0 ? c9032b.f43505N : c0983a2;
        h4 h4Var2 = (i13 & 256) != 0 ? c9032b.f43506O : h4Var;
        c9032b.getClass();
        AbstractC4154l.m8923f(connectedLeadSIM, "connectedLeadSIM");
        AbstractC4154l.m8923f(leadFormDynamicFields, "leadFormDynamicFields");
        AbstractC4154l.m8923f(statusList, "statusList");
        AbstractC4154l.m8923f(firstName, "firstName");
        AbstractC4154l.m8923f(selectedAssignEmployee, "selectedAssignEmployee");
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        AbstractC4154l.m8923f(alternativePhoneNumber, "alternativePhoneNumber");
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        AbstractC4154l.m8923f(leadAssignOptions, "leadAssignOptions");
        AbstractC4154l.m8923f(countryWithRegion, "countryWithRegion");
        AbstractC4154l.m8923f(altCountryWithRegion, "altCountryWithRegion");
        return new C9032b(connectedLeadSIM, c4802m3, z26, leadFormDynamicFields, statusList, c4800k3, firstName, str13, num7, num8, num9, selectedAssignEmployee, z20, z21, localDateTime2, num10, str10, phoneNumber, i14, num11, i15, num12, alternativePhoneNumber, z22, z23, z24, z25, errorMessage, z27, z28, c6361k2, z29, str11, z30, str12, z31, leadAssignOptions, z32, countryWithRegion, altCountryWithRegion, h4Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9032b)) {
            return false;
        }
        C9032b c9032b = (C9032b) obj;
        return AbstractC4154l.m8918a(this.f43507a, c9032b.f43507a) && AbstractC4154l.m8918a(this.f43508b, c9032b.f43508b) && this.f43509c == c9032b.f43509c && AbstractC4154l.m8918a(this.f43510d, c9032b.f43510d) && AbstractC4154l.m8918a(this.f43511e, c9032b.f43511e) && AbstractC4154l.m8918a(this.f43512f, c9032b.f43512f) && AbstractC4154l.m8918a(this.f43513g, c9032b.f43513g) && AbstractC4154l.m8918a(this.f43514h, c9032b.f43514h) && AbstractC4154l.m8918a(this.f43515i, c9032b.f43515i) && AbstractC4154l.m8918a(this.f43516j, c9032b.f43516j) && AbstractC4154l.m8918a(this.f43517k, c9032b.f43517k) && this.f43518l == c9032b.f43518l && this.f43519m == c9032b.f43519m && this.f43520n == c9032b.f43520n && AbstractC4154l.m8918a(this.f43521o, c9032b.f43521o) && AbstractC4154l.m8918a(this.f43522p, c9032b.f43522p) && AbstractC4154l.m8918a(this.f43523q, c9032b.f43523q) && AbstractC4154l.m8918a(this.f43524r, c9032b.f43524r) && this.f43525s == c9032b.f43525s && AbstractC4154l.m8918a(this.f43526t, c9032b.f43526t) && this.f43527u == c9032b.f43527u && AbstractC4154l.m8918a(this.f43528v, c9032b.f43528v) && AbstractC4154l.m8918a(this.f43529w, c9032b.f43529w) && this.f43530x == c9032b.f43530x && this.f43531y == c9032b.f43531y && this.f43532z == c9032b.f43532z && this.f43492A == c9032b.f43492A && AbstractC4154l.m8918a(this.f43493B, c9032b.f43493B) && this.f43494C == c9032b.f43494C && this.f43495D == c9032b.f43495D && AbstractC4154l.m8918a(this.f43496E, c9032b.f43496E) && this.f43497F == c9032b.f43497F && AbstractC4154l.m8918a(this.f43498G, c9032b.f43498G) && this.f43499H == c9032b.f43499H && AbstractC4154l.m8918a(this.f43500I, c9032b.f43500I) && this.f43501J == c9032b.f43501J && AbstractC4154l.m8918a(this.f43502K, c9032b.f43502K) && this.f43503L == c9032b.f43503L && AbstractC4154l.m8918a(this.f43504M, c9032b.f43504M) && AbstractC4154l.m8918a(this.f43505N, c9032b.f43505N) && AbstractC4154l.m8918a(this.f43506O, c9032b.f43506O);
    }

    public final int hashCode() {
        int iHashCode = this.f43507a.hashCode() * 31;
        C4802m c4802m = this.f43508b;
        int iM4559f = AbstractC1452a.m4559f(this.f43511e, AbstractC1452a.m4559f(this.f43510d, AbstractC1452a.m4558e((iHashCode + (c4802m == null ? 0 : c4802m.hashCode())) * 31, 31, this.f43509c), 31), 31);
        C4800k c4800k = this.f43512f;
        int iM113d = AbstractC0030c.m113d((iM4559f + (c4800k == null ? 0 : c4800k.hashCode())) * 31, 31, this.f43513g);
        String str = this.f43514h;
        int iHashCode2 = (iM113d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f43515i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f43516j;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f43517k;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f43518l.hashCode() + ((iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31)) * 31, 31, this.f43519m), 31, this.f43520n);
        LocalDateTime localDateTime = this.f43521o;
        int iHashCode5 = (iM4558e + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        Integer num4 = this.f43522p;
        int iM4556c = AbstractC1452a.m4556c(this.f43525s, AbstractC0030c.m113d(AbstractC0030c.m113d((iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f43523q), 31, this.f43524r), 31);
        Integer num5 = this.f43526t;
        int iM4556c2 = AbstractC1452a.m4556c(this.f43527u, (iM4556c + (num5 == null ? 0 : num5.hashCode())) * 31, 31);
        Integer num6 = this.f43528v;
        int iM4558e2 = AbstractC1452a.m4558e((this.f43496E.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d((iM4556c2 + (num6 == null ? 0 : num6.hashCode())) * 31, 31, this.f43529w), 31, this.f43530x), 31, this.f43531y), 31, this.f43532z), 31, this.f43492A), 31, this.f43493B), 31, this.f43494C), 31, this.f43495D)) * 31, 31, this.f43497F);
        String str2 = this.f43498G;
        return this.f43506O.hashCode() + ((this.f43505N.hashCode() + ((this.f43504M.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f43502K, AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e((iM4558e2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f43499H), 31, this.f43500I), 31, this.f43501J), 31), 31, this.f43503L)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeadState(connectedLeadSIM=");
        sb2.append(this.f43507a);
        sb2.append(", selectedLeadSim=");
        sb2.append(this.f43508b);
        sb2.append(", isNetWorkConnected=");
        sb2.append(this.f43509c);
        sb2.append(", leadFormDynamicFields=");
        sb2.append(this.f43510d);
        sb2.append(", statusList=");
        sb2.append(this.f43511e);
        sb2.append(", selectedStatus=");
        sb2.append(this.f43512f);
        sb2.append(", firstName=");
        a1.m14319B(sb2, this.f43513g, ", leadId=", this.f43514h, ", firstNameError=");
        sb2.append(this.f43515i);
        sb2.append(", lastNameError=");
        sb2.append(this.f43516j);
        sb2.append(", assignEmployeeError=");
        sb2.append(this.f43517k);
        sb2.append(", selectedAssignEmployee=");
        sb2.append(this.f43518l);
        sb2.append(", isMapAvailableCallLog=");
        AbstractC0030c.m133x(sb2, this.f43519m, ", isUpdateCallBackStatus=", this.f43520n, ", reminderDate=");
        sb2.append(this.f43521o);
        sb2.append(", selectedDateError=");
        sb2.append(this.f43522p);
        sb2.append(", lastName=");
        a1.m14319B(sb2, this.f43523q, ", phoneNumber=", this.f43524r, ", countryCode=");
        sb2.append(this.f43525s);
        sb2.append(", phoneNumberError=");
        sb2.append(this.f43526t);
        sb2.append(", alterNativeCountryCode=");
        sb2.append(this.f43527u);
        sb2.append(", alterNativePhoneNumberError=");
        sb2.append(this.f43528v);
        sb2.append(", alternativePhoneNumber=");
        AbstractC4801l.m9749w(sb2, this.f43529w, ", isEmptyLeadField=", this.f43530x, ", isLoadDynamicForm=");
        AbstractC0030c.m133x(sb2, this.f43531y, ", isLoadLeadSave=", this.f43532z, ", isSettingFormFields=");
        AbstractC4801l.m9751y(sb2, this.f43492A, ", errorMessage=", this.f43493B, ", isOpenErrorDialog=");
        AbstractC0030c.m133x(sb2, this.f43494C, ", isErrorDialogBack=", this.f43495D, ", isOpenValidationSheetWithMsg=");
        sb2.append(this.f43496E);
        sb2.append(", isOpenMapDialog=");
        sb2.append(this.f43497F);
        sb2.append(", successMessage=");
        AbstractC4801l.m9749w(sb2, this.f43498G, ", isOpenRestoreDialog=", this.f43499H, ", restoreMessage=");
        AbstractC4801l.m9749w(sb2, this.f43500I, ", isRestoreLead=", this.f43501J, ", leadAssignOptions=");
        sb2.append(this.f43502K);
        sb2.append(", setErrorFocus=");
        sb2.append(this.f43503L);
        sb2.append(", countryWithRegion=");
        sb2.append(this.f43504M);
        sb2.append(", altCountryWithRegion=");
        sb2.append(this.f43505N);
        sb2.append(", datePickerState=");
        sb2.append(this.f43506O);
        sb2.append(")");
        return sb2.toString();
    }
}
