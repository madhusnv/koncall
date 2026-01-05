package iu;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iu.h */
/* loaded from: classes3.dex */
public final class C3356h {

    /* renamed from: a */
    public final List f17738a;

    /* renamed from: b */
    public final List f17739b;

    /* renamed from: c */
    public final List f17740c;

    /* renamed from: d */
    public final boolean f17741d;

    /* renamed from: e */
    public final boolean f17742e;

    /* renamed from: f */
    public final boolean f17743f;

    /* renamed from: g */
    public final boolean f17744g;

    /* renamed from: h */
    public final LocalDateTime f17745h;

    /* renamed from: i */
    public final LocalDateTime f17746i;

    /* renamed from: j */
    public final boolean f17747j;

    /* renamed from: k */
    public final String f17748k;

    /* renamed from: l */
    public final C3355g f17749l;

    /* renamed from: m */
    public final boolean f17750m;

    /* renamed from: n */
    public final boolean f17751n;

    /* renamed from: o */
    public final boolean f17752o;

    /* renamed from: p */
    public final LocalDateTime f17753p;

    public C3356h(List list, List list2, List list3, boolean z6, boolean z10, boolean z11, boolean z12, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z13, String str, C3355g c3355g, boolean z14, boolean z15, boolean z16, LocalDateTime localDateTime3) {
        this.f17738a = list;
        this.f17739b = list2;
        this.f17740c = list3;
        this.f17741d = z6;
        this.f17742e = z10;
        this.f17743f = z11;
        this.f17744g = z12;
        this.f17745h = localDateTime;
        this.f17746i = localDateTime2;
        this.f17747j = z13;
        this.f17748k = str;
        this.f17749l = c3355g;
        this.f17750m = z14;
        this.f17751n = z15;
        this.f17752o = z16;
        this.f17753p = localDateTime3;
    }

    /* renamed from: a */
    public static C3356h m7670a(C3356h c3356h, List list, List list2, boolean z6, boolean z10, boolean z11, boolean z12, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z13, String str, C3355g c3355g, boolean z14, boolean z15, boolean z16, LocalDateTime localDateTime3, int i10) {
        List settingsList = (i10 & 1) != 0 ? c3356h.f17738a : list;
        List defaultScreens = (i10 & 2) != 0 ? c3356h.f17739b : list2;
        List notePopUpOptions = c3356h.f17740c;
        boolean z17 = (i10 & 8) != 0 ? c3356h.f17741d : z6;
        boolean z18 = (i10 & 16) != 0 ? c3356h.f17742e : z10;
        boolean z19 = (i10 & 32) != 0 ? c3356h.f17743f : z11;
        boolean z20 = (i10 & 64) != 0 ? c3356h.f17744g : z12;
        LocalDateTime fromSyncDate = (i10 & 128) != 0 ? c3356h.f17745h : localDateTime;
        LocalDateTime toSyncDate = (i10 & 256) != 0 ? c3356h.f17746i : localDateTime2;
        boolean z21 = (i10 & 512) != 0 ? c3356h.f17747j : z13;
        String str2 = (i10 & 1024) != 0 ? c3356h.f17748k : str;
        C3355g c3355g2 = (i10 & NewHope.SENDB_BYTES) != 0 ? c3356h.f17749l : c3355g;
        boolean z22 = (i10 & 4096) != 0 ? c3356h.f17750m : z14;
        boolean z23 = (i10 & 8192) != 0 ? c3356h.f17751n : z15;
        boolean z24 = z17;
        boolean z25 = (i10 & 16384) != 0 ? c3356h.f17752o : z16;
        c3356h.getClass();
        LocalDateTime localDateTime4 = (i10 & 65536) != 0 ? c3356h.f17753p : localDateTime3;
        c3356h.getClass();
        c3356h.getClass();
        AbstractC4154l.m8923f(settingsList, "settingsList");
        AbstractC4154l.m8923f(defaultScreens, "defaultScreens");
        AbstractC4154l.m8923f(notePopUpOptions, "notePopUpOptions");
        AbstractC4154l.m8923f(fromSyncDate, "fromSyncDate");
        AbstractC4154l.m8923f(toSyncDate, "toSyncDate");
        return new C3356h(settingsList, defaultScreens, notePopUpOptions, z24, z18, z19, z20, fromSyncDate, toSyncDate, z21, str2, c3355g2, z22, z23, z25, localDateTime4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3356h)) {
            return false;
        }
        C3356h c3356h = (C3356h) obj;
        return AbstractC4154l.m8918a(this.f17738a, c3356h.f17738a) && AbstractC4154l.m8918a(this.f17739b, c3356h.f17739b) && AbstractC4154l.m8918a(this.f17740c, c3356h.f17740c) && this.f17741d == c3356h.f17741d && this.f17742e == c3356h.f17742e && this.f17743f == c3356h.f17743f && this.f17744g == c3356h.f17744g && AbstractC4154l.m8918a(this.f17745h, c3356h.f17745h) && AbstractC4154l.m8918a(this.f17746i, c3356h.f17746i) && this.f17747j == c3356h.f17747j && AbstractC4154l.m8918a(this.f17748k, c3356h.f17748k) && AbstractC4154l.m8918a(this.f17749l, c3356h.f17749l) && this.f17750m == c3356h.f17750m && this.f17751n == c3356h.f17751n && this.f17752o == c3356h.f17752o && AbstractC4154l.m8918a(this.f17753p, c3356h.f17753p);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(m0.m7370c(this.f17746i, m0.m7370c(this.f17745h, AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f17740c, AbstractC1452a.m4559f(this.f17739b, this.f17738a.hashCode() * 31, 31), 31), 31, this.f17741d), 31, this.f17742e), 31, this.f17743f), 31, this.f17744g), 31), 31), 31, this.f17747j);
        String str = this.f17748k;
        int iHashCode = (iM4558e + (str == null ? 0 : str.hashCode())) * 31;
        C3355g c3355g = this.f17749l;
        int iM4558e2 = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iHashCode + (c3355g == null ? 0 : c3355g.hashCode())) * 31, 31, this.f17750m), 31, this.f17751n), 31, this.f17752o), 31, false);
        LocalDateTime localDateTime = this.f17753p;
        return Boolean.hashCode(false) + ((iM4558e2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingState(settingsList=");
        sb2.append(this.f17738a);
        sb2.append(", defaultScreens=");
        sb2.append(this.f17739b);
        sb2.append(", notePopUpOptions=");
        sb2.append(this.f17740c);
        sb2.append(", isLogEnable=");
        sb2.append(this.f17741d);
        sb2.append(", showStorageAccessDialog=");
        AbstractC0030c.m133x(sb2, this.f17742e, ", isSyncSubscriptionExpire=", this.f17743f, ", openCostomDialog=");
        sb2.append(this.f17744g);
        sb2.append(", fromSyncDate=");
        sb2.append(this.f17745h);
        sb2.append(", toSyncDate=");
        sb2.append(this.f17746i);
        sb2.append(", showBottomSheet=");
        sb2.append(this.f17747j);
        sb2.append(", bottomSheetMessage=");
        sb2.append(this.f17748k);
        sb2.append(", reSyncDownloadMessage=");
        sb2.append(this.f17749l);
        sb2.append(", loader=");
        AbstractC0030c.m133x(sb2, this.f17750m, ", isInternetConnected=", this.f17751n, ", showResyncNoInternet=");
        sb2.append(this.f17752o);
        sb2.append(", showUploadLogFileSection=false, lastLogSentTime=");
        sb2.append(this.f17753p);
        sb2.append(", isShowBatteryOptimizationWarning=false)");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3356h() {
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        LocalDateTime localDateTimeOf2 = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        AbstractC4154l.m8922e(localDateTimeOf2, "of(...)");
        C6668r c6668r = C6668r.f31943a;
        this(c6668r, c6668r, c6668r, false, false, false, false, localDateTimeOf, localDateTimeOf2, false, null, null, false, true, false, null);
    }
}
