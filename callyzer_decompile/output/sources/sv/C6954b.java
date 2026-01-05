package sv;

import a2.AbstractC0030c;
import cm.C0983a;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4802m;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sv.b */
/* loaded from: classes3.dex */
public final class C6954b {

    /* renamed from: A */
    public final boolean f33649A;

    /* renamed from: B */
    public final C0983a f33650B;

    /* renamed from: C */
    public final AppSettings f33651C;

    /* renamed from: D */
    public final boolean f33652D;

    /* renamed from: E */
    public final List f33653E;

    /* renamed from: a */
    public final String f33654a;

    /* renamed from: b */
    public final Integer f33655b;

    /* renamed from: c */
    public final String f33656c;

    /* renamed from: d */
    public final Integer f33657d;

    /* renamed from: e */
    public final String f33658e;

    /* renamed from: f */
    public final String f33659f;

    /* renamed from: g */
    public final Integer f33660g;

    /* renamed from: h */
    public final String f33661h;

    /* renamed from: i */
    public final Integer f33662i;

    /* renamed from: j */
    public final String f33663j;

    /* renamed from: k */
    public final Integer f33664k;

    /* renamed from: l */
    public final List f33665l;

    /* renamed from: m */
    public final List f33666m;

    /* renamed from: n */
    public final String f33667n;

    /* renamed from: o */
    public final String f33668o;

    /* renamed from: p */
    public final boolean f33669p;

    /* renamed from: q */
    public final int f33670q;

    /* renamed from: r */
    public final C4802m f33671r;

    /* renamed from: s */
    public final int f33672s;

    /* renamed from: t */
    public final boolean f33673t;

    /* renamed from: u */
    public final String f33674u;

    /* renamed from: v */
    public final String f33675v;

    /* renamed from: w */
    public final boolean f33676w;

    /* renamed from: x */
    public final boolean f33677x;

    /* renamed from: y */
    public final boolean f33678y;

    /* renamed from: z */
    public final boolean f33679z;

    public C6954b(String str, Integer num, String str2, Integer num2, String str3, String str4, Integer num3, String str5, Integer num4, String str6, Integer num5, List uiSIMList, List arrCallLog, String str7, String str8, boolean z6, int i10, C4802m c4802m, int i11, boolean z10, String str9, String str10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C0983a c0983a, AppSettings appSettings, boolean z16, List registerResult) {
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        AbstractC4154l.m8923f(arrCallLog, "arrCallLog");
        AbstractC4154l.m8923f(registerResult, "registerResult");
        this.f33654a = str;
        this.f33655b = num;
        this.f33656c = str2;
        this.f33657d = num2;
        this.f33658e = str3;
        this.f33659f = str4;
        this.f33660g = num3;
        this.f33661h = str5;
        this.f33662i = num4;
        this.f33663j = str6;
        this.f33664k = num5;
        this.f33665l = uiSIMList;
        this.f33666m = arrCallLog;
        this.f33667n = str7;
        this.f33668o = str8;
        this.f33669p = z6;
        this.f33670q = i10;
        this.f33671r = c4802m;
        this.f33672s = i11;
        this.f33673t = z10;
        this.f33674u = str9;
        this.f33675v = str10;
        this.f33676w = z11;
        this.f33677x = z12;
        this.f33678y = z13;
        this.f33679z = z14;
        this.f33649A = z15;
        this.f33650B = c0983a;
        this.f33651C = appSettings;
        this.f33652D = z16;
        this.f33653E = registerResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.List] */
    /* renamed from: a */
    public static C6954b m13206a(C6954b c6954b, String str, Integer num, String str2, Integer num2, String str3, String str4, Integer num3, String str5, Integer num4, String str6, Integer num5, ArrayList arrayList, List list, String str7, int i10, C4802m c4802m, int i11, boolean z6, String str8, boolean z10, boolean z11, boolean z12, C0983a c0983a, AppSettings appSettings, List list2, int i12) {
        boolean z13;
        AppSettings appSettings2;
        String name = (i12 & 1) != 0 ? c6954b.f33654a : str;
        Integer num6 = (i12 & 2) != 0 ? c6954b.f33655b : num;
        String number = (i12 & 4) != 0 ? c6954b.f33656c : str2;
        Integer num7 = (i12 & 8) != 0 ? c6954b.f33657d : num2;
        String countryCode = (i12 & 16) != 0 ? c6954b.f33658e : str3;
        String countryNmCode = (i12 & 32) != 0 ? c6954b.f33659f : str4;
        Integer num8 = (i12 & 64) != 0 ? c6954b.f33660g : num3;
        String empCode = (i12 & 128) != 0 ? c6954b.f33661h : str5;
        Integer num9 = (i12 & 256) != 0 ? c6954b.f33662i : num4;
        String dccCode = (i12 & 512) != 0 ? c6954b.f33663j : str6;
        Integer num10 = (i12 & 1024) != 0 ? c6954b.f33664k : num5;
        ArrayList uiSIMList = (i12 & NewHope.SENDB_BYTES) != 0 ? c6954b.f33665l : arrayList;
        List arrCallLog = (i12 & 4096) != 0 ? c6954b.f33666m : list;
        String str9 = (i12 & 8192) != 0 ? c6954b.f33667n : null;
        String str10 = (i12 & 16384) != 0 ? c6954b.f33668o : str7;
        boolean z14 = (32768 & i12) != 0 ? c6954b.f33669p : false;
        int i13 = (i12 & 65536) != 0 ? c6954b.f33670q : i10;
        C4802m c4802m2 = (i12 & 131072) != 0 ? c6954b.f33671r : c4802m;
        int i14 = (i12 & 262144) != 0 ? c6954b.f33672s : i11;
        boolean z15 = (i12 & 524288) != 0 ? c6954b.f33673t : z6;
        String str11 = (i12 & 1048576) != 0 ? c6954b.f33674u : str8;
        String str12 = (i12 & 2097152) != 0 ? c6954b.f33675v : null;
        boolean z16 = (i12 & 4194304) != 0 ? c6954b.f33676w : z10;
        boolean z17 = (i12 & 8388608) != 0 ? c6954b.f33677x : z11;
        boolean z18 = (i12 & 16777216) != 0 ? c6954b.f33678y : z12;
        boolean z19 = (i12 & 33554432) != 0 ? c6954b.f33679z : false;
        boolean z20 = (i12 & 67108864) != 0 ? c6954b.f33649A : true;
        C0983a countryData = (i12 & 134217728) != 0 ? c6954b.f33650B : c0983a;
        if ((i12 & 268435456) != 0) {
            z13 = z14;
            appSettings2 = c6954b.f33651C;
        } else {
            z13 = z14;
            appSettings2 = appSettings;
        }
        boolean z21 = (i12 & 536870912) != 0 ? c6954b.f33652D : true;
        List registerResult = (i12 & 1073741824) != 0 ? c6954b.f33653E : list2;
        c6954b.getClass();
        c6954b.getClass();
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(countryNmCode, "countryNmCode");
        AbstractC4154l.m8923f(empCode, "empCode");
        AbstractC4154l.m8923f(dccCode, "dccCode");
        AbstractC4154l.m8923f(uiSIMList, "uiSIMList");
        AbstractC4154l.m8923f(arrCallLog, "arrCallLog");
        AbstractC4154l.m8923f(countryData, "countryData");
        AbstractC4154l.m8923f(registerResult, "registerResult");
        return new C6954b(name, num6, number, num7, countryCode, countryNmCode, num8, empCode, num9, dccCode, num10, uiSIMList, arrCallLog, str9, str10, z13, i13, c4802m2, i14, z15, str11, str12, z16, z17, z18, z19, z20, countryData, appSettings2, z21, registerResult);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6954b)) {
            return false;
        }
        C6954b c6954b = (C6954b) obj;
        return AbstractC4154l.m8918a(this.f33654a, c6954b.f33654a) && AbstractC4154l.m8918a(this.f33655b, c6954b.f33655b) && AbstractC4154l.m8918a(this.f33656c, c6954b.f33656c) && AbstractC4154l.m8918a(this.f33657d, c6954b.f33657d) && this.f33658e.equals(c6954b.f33658e) && this.f33659f.equals(c6954b.f33659f) && AbstractC4154l.m8918a(this.f33660g, c6954b.f33660g) && this.f33661h.equals(c6954b.f33661h) && AbstractC4154l.m8918a(this.f33662i, c6954b.f33662i) && this.f33663j.equals(c6954b.f33663j) && AbstractC4154l.m8918a(this.f33664k, c6954b.f33664k) && AbstractC4154l.m8918a(this.f33665l, c6954b.f33665l) && AbstractC4154l.m8918a(this.f33666m, c6954b.f33666m) && AbstractC4154l.m8918a(this.f33667n, c6954b.f33667n) && AbstractC4154l.m8918a(this.f33668o, c6954b.f33668o) && this.f33669p == c6954b.f33669p && this.f33670q == c6954b.f33670q && AbstractC4154l.m8918a(this.f33671r, c6954b.f33671r) && this.f33672s == c6954b.f33672s && this.f33673t == c6954b.f33673t && AbstractC4154l.m8918a(this.f33674u, c6954b.f33674u) && AbstractC4154l.m8918a(this.f33675v, c6954b.f33675v) && this.f33676w == c6954b.f33676w && this.f33677x == c6954b.f33677x && this.f33678y == c6954b.f33678y && this.f33679z == c6954b.f33679z && this.f33649A == c6954b.f33649A && this.f33650B.equals(c6954b.f33650B) && AbstractC4154l.m8918a(this.f33651C, c6954b.f33651C) && this.f33652D == c6954b.f33652D && AbstractC4154l.m8918a(this.f33653E, c6954b.f33653E);
    }

    public final int hashCode() {
        int iHashCode = this.f33654a.hashCode() * 31;
        Integer num = this.f33655b;
        int iM113d = AbstractC0030c.m113d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f33656c);
        Integer num2 = this.f33657d;
        int iM113d2 = AbstractC0030c.m113d(AbstractC0030c.m113d((iM113d + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f33658e), 31, this.f33659f);
        Integer num3 = this.f33660g;
        int iM113d3 = AbstractC0030c.m113d((iM113d2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.f33661h);
        Integer num4 = this.f33662i;
        int iM113d4 = AbstractC0030c.m113d((iM113d3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f33663j);
        Integer num5 = this.f33664k;
        int iM4559f = AbstractC1452a.m4559f(this.f33666m, AbstractC1452a.m4559f(this.f33665l, (iM113d4 + (num5 == null ? 0 : num5.hashCode())) * 31, 31), 31);
        String str = this.f33667n;
        int iHashCode2 = (iM4559f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33668o;
        int iM4556c = AbstractC1452a.m4556c(this.f33670q, AbstractC1452a.m4558e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f33669p), 31);
        C4802m c4802m = this.f33671r;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f33672s, (iM4556c + (c4802m == null ? 0 : c4802m.hashCode())) * 31, 31), 31, this.f33673t);
        String str3 = this.f33674u;
        int iHashCode3 = (iM4558e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33675v;
        int iHashCode4 = (this.f33650B.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f33676w), 31, this.f33677x), 31, this.f33678y), 31, this.f33679z), 31, this.f33649A)) * 31;
        AppSettings appSettings = this.f33651C;
        return Boolean.hashCode(false) + AbstractC1452a.m4559f(this.f33653E, AbstractC1452a.m4558e((iHashCode4 + (appSettings == null ? 0 : appSettings.hashCode())) * 31, 31, this.f33652D), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegistrationState(name=");
        sb2.append(this.f33654a);
        sb2.append(", nameError=");
        sb2.append(this.f33655b);
        sb2.append(", number=");
        sb2.append(this.f33656c);
        sb2.append(", numberError=");
        sb2.append(this.f33657d);
        sb2.append(", countryCode=");
        a1.m14319B(sb2, this.f33658e, ", countryNmCode=", this.f33659f, ", countryCodeError=");
        sb2.append(this.f33660g);
        sb2.append(", empCode=");
        sb2.append(this.f33661h);
        sb2.append(", empCodeCodeError=");
        sb2.append(this.f33662i);
        sb2.append(", dccCode=");
        sb2.append(this.f33663j);
        sb2.append(", dccCodeError=");
        sb2.append(this.f33664k);
        sb2.append(", uiSIMList=");
        sb2.append(this.f33665l);
        sb2.append(", arrCallLog=");
        sb2.append(this.f33666m);
        sb2.append(", failure=");
        sb2.append(this.f33667n);
        sb2.append(", buttonTextMessage=");
        AbstractC4801l.m9749w(sb2, this.f33668o, ", isBack=", this.f33669p, ", selectedSIMPosition=");
        sb2.append(this.f33670q);
        sb2.append(", selectedSIM=");
        sb2.append(this.f33671r);
        sb2.append(", selectedSIMCount=");
        sb2.append(this.f33672s);
        sb2.append(", inProcess=");
        sb2.append(this.f33673t);
        sb2.append(", apiFailure=");
        a1.m14319B(sb2, this.f33674u, ", numberExistApiFailure=", this.f33675v, ", isCallLogSelected=");
        AbstractC0030c.m133x(sb2, this.f33676w, ", isPlaceCall=", this.f33677x, ", isConnectedBtnProcess=");
        AbstractC0030c.m133x(sb2, this.f33678y, ", isDccEnable=", this.f33679z, ", isFromSettings=");
        sb2.append(this.f33649A);
        sb2.append(", countryData=");
        sb2.append(this.f33650B);
        sb2.append(", appSetting=");
        sb2.append(this.f33651C);
        sb2.append(", hasNavigateValueAssign=");
        sb2.append(this.f33652D);
        sb2.append(", registerResult=");
        return AbstractC5601a.m11240k(", isAddDeviceError=false)", sb2, this.f33653E);
    }
}
