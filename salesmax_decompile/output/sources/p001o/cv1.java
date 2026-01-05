package p001o;

import ai.salesmax.model.CallEvent;
import android.content.Context;
import com.amplifyframework.datastore.generated.model.CallConnectStatus;

/* loaded from: classes.dex */
public final class cv1 {

    /* renamed from: a */
    public final String f18681a;

    /* renamed from: b */
    public final String f18682b;

    /* renamed from: c */
    public String f18683c;

    /* renamed from: d */
    public final String f18684d;

    /* renamed from: e */
    public final Long f18685e;

    /* renamed from: f */
    public final String f18686f;

    /* renamed from: g */
    public final String f18687g;

    /* renamed from: h */
    public final Long f18688h;

    /* renamed from: i */
    public final Long f18689i;

    /* renamed from: j */
    public final Long f18690j;

    /* renamed from: k */
    public final CallConnectStatus f18691k;

    /* renamed from: l */
    public final Integer f18692l;

    /* renamed from: m */
    public final Boolean f18693m;

    /* renamed from: n */
    public final String f18694n;

    /* renamed from: o */
    public String f18695o;

    /* renamed from: p */
    public String f18696p;

    /* renamed from: q */
    public Long f18697q;

    /* renamed from: r */
    public String f18698r;

    /* renamed from: s */
    public String f18699s;

    /* renamed from: t */
    public String f18700t;

    /* renamed from: u */
    public String f18701u;

    /* renamed from: v */
    public long f18702v;

    /* renamed from: w */
    public boolean f18703w;

    public cv1(String str, String str2, String str3, String str4, Long l, String str5, String str6, Long l2, Long l3, Long l4, CallConnectStatus callConnectStatus, Integer num, Boolean bool, String str7, String str8, String str9, Long l5, String str10, String str11, String str12, String str13, long j, boolean z) {
        sq8.m48649h(str, "callId");
        this.f18681a = str;
        this.f18682b = str2;
        this.f18683c = str3;
        this.f18684d = str4;
        this.f18685e = l;
        this.f18686f = str5;
        this.f18687g = str6;
        this.f18688h = l2;
        this.f18689i = l3;
        this.f18690j = l4;
        this.f18691k = callConnectStatus;
        this.f18692l = num;
        this.f18693m = bool;
        this.f18694n = str7;
        this.f18695o = str8;
        this.f18696p = str9;
        this.f18697q = l5;
        this.f18698r = str10;
        this.f18699s = str11;
        this.f18700t = str12;
        this.f18701u = str13;
        this.f18702v = j;
        this.f18703w = z;
    }

    /* renamed from: a */
    public final CallConnectStatus m21837a() {
        return this.f18691k;
    }

    /* renamed from: b */
    public final Long m21838b() {
        return this.f18690j;
    }

    /* renamed from: c */
    public final Long m21839c() {
        return this.f18689i;
    }

    /* renamed from: d */
    public final String m21840d() {
        return this.f18681a;
    }

    /* renamed from: e */
    public final Long m21841e() {
        return this.f18685e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv1)) {
            return false;
        }
        cv1 cv1Var = (cv1) obj;
        return sq8.m48644c(this.f18681a, cv1Var.f18681a) && sq8.m48644c(this.f18682b, cv1Var.f18682b) && sq8.m48644c(this.f18683c, cv1Var.f18683c) && sq8.m48644c(this.f18684d, cv1Var.f18684d) && sq8.m48644c(this.f18685e, cv1Var.f18685e) && sq8.m48644c(this.f18686f, cv1Var.f18686f) && sq8.m48644c(this.f18687g, cv1Var.f18687g) && sq8.m48644c(this.f18688h, cv1Var.f18688h) && sq8.m48644c(this.f18689i, cv1Var.f18689i) && sq8.m48644c(this.f18690j, cv1Var.f18690j) && this.f18691k == cv1Var.f18691k && sq8.m48644c(this.f18692l, cv1Var.f18692l) && sq8.m48644c(this.f18693m, cv1Var.f18693m) && sq8.m48644c(this.f18694n, cv1Var.f18694n) && sq8.m48644c(this.f18695o, cv1Var.f18695o) && sq8.m48644c(this.f18696p, cv1Var.f18696p) && sq8.m48644c(this.f18697q, cv1Var.f18697q) && sq8.m48644c(this.f18698r, cv1Var.f18698r) && sq8.m48644c(this.f18699s, cv1Var.f18699s) && sq8.m48644c(this.f18700t, cv1Var.f18700t) && sq8.m48644c(this.f18701u, cv1Var.f18701u) && this.f18702v == cv1Var.f18702v && this.f18703w == cv1Var.f18703w;
    }

    /* renamed from: f */
    public final String m21842f() {
        return this.f18694n;
    }

    /* renamed from: g */
    public final String m21843g() {
        return this.f18698r;
    }

    /* renamed from: h */
    public final String m21844h() {
        return this.f18695o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f18681a.hashCode() * 31;
        String str = this.f18682b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18683c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18684d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.f18685e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f18686f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18687g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.f18688h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f18689i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f18690j;
        int iHashCode10 = (iHashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        CallConnectStatus callConnectStatus = this.f18691k;
        int iHashCode11 = (iHashCode10 + (callConnectStatus == null ? 0 : callConnectStatus.hashCode())) * 31;
        Integer num = this.f18692l;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f18693m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.f18694n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18695o;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18696p;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l5 = this.f18697q;
        int iHashCode17 = (iHashCode16 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str9 = this.f18698r;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f18699s;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18700t;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f18701u;
        int iHashCode21 = (((iHashCode20 + (str12 != null ? str12.hashCode() : 0)) * 31) + Long.hashCode(this.f18702v)) * 31;
        boolean z = this.f18703w;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode21 + i;
    }

    /* renamed from: i */
    public final String m21845i() {
        return this.f18696p;
    }

    /* renamed from: j */
    public final long m21846j() {
        return this.f18702v;
    }

    /* renamed from: k */
    public final String m21847k() {
        return this.f18684d;
    }

    /* renamed from: l */
    public final Long m21848l() {
        return this.f18688h;
    }

    /* renamed from: m */
    public final String m21849m() {
        return this.f18699s;
    }

    /* renamed from: n */
    public final String m21850n() {
        return this.f18686f;
    }

    /* renamed from: o */
    public final String m21851o() {
        return this.f18682b;
    }

    /* renamed from: p */
    public final String m21852p() {
        return this.f18683c;
    }

    /* renamed from: q */
    public final String m21853q() {
        return this.f18700t;
    }

    /* renamed from: r */
    public final String m21854r() {
        return this.f18701u;
    }

    /* renamed from: s */
    public final boolean m21855s() {
        return this.f18703w;
    }

    /* renamed from: t */
    public final String m21856t() {
        return this.f18687g;
    }

    public String toString() {
        return "CallLog(callId=" + this.f18681a + ", number=" + this.f18682b + ", phone=" + this.f18683c + ", direction=" + this.f18684d + ", callStartTime=" + this.f18685e + ", name=" + this.f18686f + ", source=" + this.f18687g + ", duration=" + this.f18688h + ", callEndTime=" + this.f18689i + ", callConnectTime=" + this.f18690j + ", callConnectStatus=" + this.f18691k + ", subscriptionId=" + this.f18692l + ", isConnectedCall=" + this.f18693m + ", callStatus=" + this.f18694n + ", cloudProvider=" + this.f18695o + ", cloudProviderNumber=" + this.f18696p + ", totalCallDuration=" + this.f18697q + ", callType=" + this.f18698r + ", hangupReason=" + this.f18699s + ", phoneCallLogId=" + this.f18700t + ", phoneHandle=" + this.f18701u + ", createdAt=" + this.f18702v + ", processed=" + this.f18703w + ")";
    }

    /* renamed from: u */
    public final Integer m21857u() {
        return this.f18692l;
    }

    /* renamed from: v */
    public final Long m21858v() {
        return this.f18697q;
    }

    /* renamed from: w */
    public final Boolean m21859w() {
        return this.f18693m;
    }

    /* renamed from: x */
    public final void m21860x(boolean z) {
        this.f18703w = z;
    }

    /* renamed from: y */
    public final CallEvent m21861y(Context context) {
        sq8.m48649h(context, "context");
        return new CallEvent.Builder().number(this.f18682b).phone(this.f18683c).direction(this.f18684d).callStartTime(this.f18685e).name(this.f18686f).callId(this.f18681a).source(this.f18687g).duration(this.f18688h).callEndTime(this.f18689i).callConnectTime(this.f18690j).callConnectStatus(this.f18691k).subscriptionId(this.f18692l).isConnectedCall(this.f18693m).phoneHandle(new CallEvent.PhoneHandle(this.f18701u)).callStatus(this.f18694n).cloudProvider(this.f18695o).cloudProviderNumber(this.f18696p).totalCallDuration(this.f18697q).callType(this.f18698r).hangupReason(this.f18699s).phoneCallLogId(this.f18700t).context(context).build();
    }

    public /* synthetic */ cv1(String str, String str2, String str3, String str4, Long l, String str5, String str6, Long l2, Long l3, Long l4, CallConnectStatus callConnectStatus, Integer num, Boolean bool, String str7, String str8, String str9, Long l5, String str10, String str11, String str12, String str13, long j, boolean z, int i, id5 id5Var) {
        this(str, str2, str3, str4, l, str5, str6, l2, l3, l4, callConnectStatus, num, bool, str7, str8, str9, l5, str10, str11, str12, str13, (i & 2097152) != 0 ? System.currentTimeMillis() : j, (i & 4194304) != 0 ? false : z);
    }
}
