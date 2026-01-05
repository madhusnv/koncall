package p001o;

import ai.salesmax.model.CallEngagement;
import android.net.Uri;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.rz1;

/* loaded from: classes.dex */
public final class h96 {

    /* renamed from: A */
    public String f26409A;

    /* renamed from: B */
    public String f26410B;

    /* renamed from: C */
    public String f26411C;

    /* renamed from: D */
    public String f26412D;

    /* renamed from: E */
    public String f26413E;

    /* renamed from: F */
    public final String f26414F;

    /* renamed from: G */
    public final Long f26415G;

    /* renamed from: H */
    public Long f26416H;

    /* renamed from: I */
    public String f26417I;

    /* renamed from: J */
    public String f26418J;

    /* renamed from: K */
    public Long f26419K;

    /* renamed from: L */
    public String f26420L;

    /* renamed from: M */
    public String f26421M;

    /* renamed from: N */
    public String f26422N;

    /* renamed from: a */
    public final String f26423a;

    /* renamed from: b */
    public String f26424b;

    /* renamed from: c */
    public String f26425c;

    /* renamed from: d */
    public String f26426d;

    /* renamed from: e */
    public String f26427e;

    /* renamed from: f */
    public String f26428f;

    /* renamed from: g */
    public String f26429g;

    /* renamed from: h */
    public String f26430h;

    /* renamed from: i */
    public String f26431i;

    /* renamed from: j */
    public Long f26432j;

    /* renamed from: k */
    public Long f26433k;

    /* renamed from: l */
    public Long f26434l;

    /* renamed from: m */
    public Long f26435m;

    /* renamed from: n */
    public String f26436n;

    /* renamed from: o */
    public String f26437o;

    /* renamed from: p */
    public String f26438p;

    /* renamed from: q */
    public String f26439q;

    /* renamed from: r */
    public String f26440r;

    /* renamed from: s */
    public String f26441s;

    /* renamed from: t */
    public String f26442t;

    /* renamed from: u */
    public Long f26443u;

    /* renamed from: v */
    public boolean f26444v;

    /* renamed from: w */
    public String f26445w;

    /* renamed from: x */
    public Boolean f26446x;

    /* renamed from: y */
    public Boolean f26447y;

    /* renamed from: z */
    public Boolean f26448z;

    public h96(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l5, boolean z, String str17, Boolean bool, Boolean bool2, Boolean bool3, String str18, String str19, String str20, String str21, String str22, String str23, Long l6, Long l7, String str24, String str25, Long l8, String str26, String str27, String str28) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        this.f26423a = str;
        this.f26424b = str2;
        this.f26425c = str3;
        this.f26426d = str4;
        this.f26427e = str5;
        this.f26428f = str6;
        this.f26429g = str7;
        this.f26430h = str8;
        this.f26431i = str9;
        this.f26432j = l;
        this.f26433k = l2;
        this.f26434l = l3;
        this.f26435m = l4;
        this.f26436n = str10;
        this.f26437o = str11;
        this.f26438p = str12;
        this.f26439q = str13;
        this.f26440r = str14;
        this.f26441s = str15;
        this.f26442t = str16;
        this.f26443u = l5;
        this.f26444v = z;
        this.f26445w = str17;
        this.f26446x = bool;
        this.f26447y = bool2;
        this.f26448z = bool3;
        this.f26409A = str18;
        this.f26410B = str19;
        this.f26411C = str20;
        this.f26412D = str21;
        this.f26413E = str22;
        this.f26414F = str23;
        this.f26415G = l6;
        this.f26416H = l7;
        this.f26417I = str24;
        this.f26418J = str25;
        this.f26419K = l8;
        this.f26420L = str26;
        this.f26421M = str27;
        this.f26422N = str28;
    }

    /* renamed from: A */
    public final boolean m29982A() {
        return this.f26444v;
    }

    /* renamed from: B */
    public final Boolean m29983B() {
        return this.f26448z;
    }

    /* renamed from: C */
    public final String m29984C() {
        return this.f26414F;
    }

    /* renamed from: D */
    public final Boolean m29985D() {
        return this.f26446x;
    }

    /* renamed from: E */
    public final String m29986E() {
        return this.f26422N;
    }

    /* renamed from: F */
    public final String m29987F() {
        return this.f26429g;
    }

    /* renamed from: G */
    public final Boolean m29988G() {
        return this.f26447y;
    }

    /* renamed from: H */
    public final Long m29989H() {
        return this.f26415G;
    }

    /* renamed from: I */
    public final String m29990I() {
        return this.f26410B;
    }

    /* renamed from: J */
    public final String m29991J() {
        return this.f26439q;
    }

    /* renamed from: K */
    public final Long m29992K() {
        return this.f26419K;
    }

    /* renamed from: L */
    public final String m29993L() {
        return this.f26409A;
    }

    /* renamed from: M */
    public final String m29994M() {
        return this.f26411C;
    }

    /* renamed from: N */
    public final String m29995N() {
        return this.f26431i;
    }

    /* renamed from: O */
    public final CallEngagement m29996O() {
        Long l;
        rz1 rz1VarM47312a;
        String string;
        Uri uri;
        String str = this.f26423a;
        String str2 = this.f26424b;
        String str3 = this.f26425c;
        String str4 = this.f26426d;
        String str5 = this.f26427e;
        String str6 = this.f26428f;
        String str7 = this.f26429g;
        String str8 = this.f26430h;
        String str9 = this.f26431i;
        Long l2 = this.f26432j;
        Long l3 = this.f26433k;
        Long l4 = this.f26434l;
        Long l5 = this.f26435m;
        String str10 = this.f26436n;
        String str11 = this.f26437o;
        String str12 = this.f26438p;
        String str13 = this.f26439q;
        String str14 = this.f26440r;
        String str15 = this.f26441s;
        String str16 = this.f26442t;
        Long l6 = this.f26443u;
        String str17 = this.f26410B;
        if (str17 == null || (string = f9g.Z0(str17).toString()) == null) {
            l = l6;
            rz1VarM47312a = null;
        } else {
            l = l6;
            rz1.C16681a c16681aM47318g = new rz1.C16681a().m47318g(string);
            String str18 = this.f26411C;
            if (str18 == null || (uri = Uri.parse(str18)) == null) {
                uri = Uri.EMPTY;
            }
            rz1.C16681a c16681aM47321j = c16681aM47318g.m47321j(uri);
            String str19 = this.f26412D;
            if (str19 == null) {
                str19 = "";
            }
            rz1.C16681a c16681aM47316e = c16681aM47321j.m47316e(str19);
            String str20 = this.f26413E;
            if (str20 == null) {
                str20 = "";
            }
            rz1VarM47312a = c16681aM47316e.m47317f(str20).m47314c(this.f26415G).m47319h(this.f26414F).m47312a();
        }
        rz1 rz1Var = rz1VarM47312a;
        boolean z = this.f26444v;
        String str21 = this.f26445w;
        String str22 = null;
        Boolean bool = this.f26446x;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.f26447y;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String str23 = this.f26409A;
        Boolean bool3 = this.f26448z;
        return new CallEngagement(str, str2, str3, str4, str5, str6, str7, str8, str9, l2, l3, l4, l5, str10, str11, str12, str13, str14, str15, str16, l, rz1Var, z, str21, str22, zBooleanValue, zBooleanValue2, str23, bool3 != null ? bool3.booleanValue() : false, this.f26417I, this.f26418J, this.f26419K, this.f26420L, this.f26421M, this.f26422N, null, null, false, 0, 56, null);
    }

    /* renamed from: a */
    public final String m29997a() {
        return this.f26445w;
    }

    /* renamed from: b */
    public final Long m29998b() {
        return this.f26443u;
    }

    /* renamed from: c */
    public final String m29999c() {
        return this.f26437o;
    }

    /* renamed from: d */
    public final String m30000d() {
        return this.f26436n;
    }

    /* renamed from: e */
    public final Long m30001e() {
        return this.f26435m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h96)) {
            return false;
        }
        h96 h96Var = (h96) obj;
        return sq8.m48644c(this.f26423a, h96Var.f26423a) && sq8.m48644c(this.f26424b, h96Var.f26424b) && sq8.m48644c(this.f26425c, h96Var.f26425c) && sq8.m48644c(this.f26426d, h96Var.f26426d) && sq8.m48644c(this.f26427e, h96Var.f26427e) && sq8.m48644c(this.f26428f, h96Var.f26428f) && sq8.m48644c(this.f26429g, h96Var.f26429g) && sq8.m48644c(this.f26430h, h96Var.f26430h) && sq8.m48644c(this.f26431i, h96Var.f26431i) && sq8.m48644c(this.f26432j, h96Var.f26432j) && sq8.m48644c(this.f26433k, h96Var.f26433k) && sq8.m48644c(this.f26434l, h96Var.f26434l) && sq8.m48644c(this.f26435m, h96Var.f26435m) && sq8.m48644c(this.f26436n, h96Var.f26436n) && sq8.m48644c(this.f26437o, h96Var.f26437o) && sq8.m48644c(this.f26438p, h96Var.f26438p) && sq8.m48644c(this.f26439q, h96Var.f26439q) && sq8.m48644c(this.f26440r, h96Var.f26440r) && sq8.m48644c(this.f26441s, h96Var.f26441s) && sq8.m48644c(this.f26442t, h96Var.f26442t) && sq8.m48644c(this.f26443u, h96Var.f26443u) && this.f26444v == h96Var.f26444v && sq8.m48644c(this.f26445w, h96Var.f26445w) && sq8.m48644c(this.f26446x, h96Var.f26446x) && sq8.m48644c(this.f26447y, h96Var.f26447y) && sq8.m48644c(this.f26448z, h96Var.f26448z) && sq8.m48644c(this.f26409A, h96Var.f26409A) && sq8.m48644c(this.f26410B, h96Var.f26410B) && sq8.m48644c(this.f26411C, h96Var.f26411C) && sq8.m48644c(this.f26412D, h96Var.f26412D) && sq8.m48644c(this.f26413E, h96Var.f26413E) && sq8.m48644c(this.f26414F, h96Var.f26414F) && sq8.m48644c(this.f26415G, h96Var.f26415G) && sq8.m48644c(this.f26416H, h96Var.f26416H) && sq8.m48644c(this.f26417I, h96Var.f26417I) && sq8.m48644c(this.f26418J, h96Var.f26418J) && sq8.m48644c(this.f26419K, h96Var.f26419K) && sq8.m48644c(this.f26420L, h96Var.f26420L) && sq8.m48644c(this.f26421M, h96Var.f26421M) && sq8.m48644c(this.f26422N, h96Var.f26422N);
    }

    /* renamed from: f */
    public final Long m30002f() {
        return this.f26434l;
    }

    /* renamed from: g */
    public final Long m30003g() {
        return this.f26433k;
    }

    /* renamed from: h */
    public final Long m30004h() {
        return this.f26432j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f26423a.hashCode() * 31;
        String str = this.f26424b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26425c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26426d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f26427e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26428f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f26429g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f26430h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f26431i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.f26432j;
        int iHashCode10 = (iHashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f26433k;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f26434l;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f26435m;
        int iHashCode13 = (iHashCode12 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.f26436n;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f26437o;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f26438p;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f26439q;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f26440r;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f26441s;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f26442t;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l5 = this.f26443u;
        int iHashCode21 = (iHashCode20 + (l5 == null ? 0 : l5.hashCode())) * 31;
        boolean z = this.f26444v;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode21 + i) * 31;
        String str16 = this.f26445w;
        int iHashCode22 = (i2 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Boolean bool = this.f26446x;
        int iHashCode23 = (iHashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26447y;
        int iHashCode24 = (iHashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f26448z;
        int iHashCode25 = (iHashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str17 = this.f26409A;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f26410B;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f26411C;
        int iHashCode28 = (iHashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f26412D;
        int iHashCode29 = (iHashCode28 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f26413E;
        int iHashCode30 = (iHashCode29 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f26414F;
        int iHashCode31 = (iHashCode30 + (str22 == null ? 0 : str22.hashCode())) * 31;
        Long l6 = this.f26415G;
        int iHashCode32 = (iHashCode31 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.f26416H;
        int iHashCode33 = (iHashCode32 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str23 = this.f26417I;
        int iHashCode34 = (iHashCode33 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f26418J;
        int iHashCode35 = (iHashCode34 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Long l8 = this.f26419K;
        int iHashCode36 = (iHashCode35 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str25 = this.f26420L;
        int iHashCode37 = (iHashCode36 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f26421M;
        int iHashCode38 = (iHashCode37 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.f26422N;
        return iHashCode38 + (str27 != null ? str27.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m30005i() {
        return this.f26420L;
    }

    /* renamed from: j */
    public final String m30006j() {
        return this.f26426d;
    }

    /* renamed from: k */
    public final String m30007k() {
        return this.f26430h;
    }

    /* renamed from: l */
    public final String m30008l() {
        return this.f26428f;
    }

    /* renamed from: m */
    public final String m30009m() {
        return this.f26424b;
    }

    /* renamed from: n */
    public final String m30010n() {
        return this.f26425c;
    }

    /* renamed from: o */
    public final String m30011o() {
        return this.f26427e;
    }

    /* renamed from: p */
    public final String m30012p() {
        return this.f26417I;
    }

    /* renamed from: q */
    public final String m30013q() {
        return this.f26418J;
    }

    /* renamed from: r */
    public final Long m30014r() {
        return this.f26416H;
    }

    /* renamed from: s */
    public final String m30015s() {
        return this.f26441s;
    }

    /* renamed from: t */
    public final String m30016t() {
        return this.f26442t;
    }

    public String toString() {
        return "Engagement(id=" + this.f26423a + ", clientID=" + this.f26424b + ", clientName=" + this.f26425c + ", clientCompany=" + this.f26426d + ", clientProfilePic=" + this.f26427e + ", clientDesignation=" + this.f26428f + ", primaryTeamId=" + this.f26429g + ", clientContactNumber=" + this.f26430h + ", userNumber=" + this.f26431i + ", callTimeInMillis=" + this.f26432j + ", callStartTime=" + this.f26433k + ", callEndTime=" + this.f26434l + ", callDuration=" + this.f26435m + ", callDirection=" + this.f26436n + ", callConnectionStatus=" + this.f26437o + ", engagementType=" + this.f26438p + ", status=" + this.f26439q + ", engagementSourceType=" + this.f26440r + ", engagementSource=" + this.f26441s + ", engagementSourceLevelTwo=" + this.f26442t + ", callConnectTime=" + this.f26443u + ", inFlightCall=" + this.f26444v + ", androidDeviceId=" + this.f26445w + ", persisted=" + this.f26446x + ", recording=" + this.f26447y + ", mapping=" + this.f26448z + ", uploadedFile=" + this.f26409A + ", recordingId=" + this.f26410B + ", uri=" + this.f26411C + ", fileName=" + this.f26412D + ", filePath=" + this.f26413E + ", mimeType=" + this.f26414F + ", recordingDateAdded=" + this.f26415G + ", createdAt=" + this.f26416H + ", cloudProvider=" + this.f26417I + ", cloudProviderNumber=" + this.f26418J + ", totalCallDuration=" + this.f26419K + ", callType=" + this.f26420L + ", hangupReason=" + this.f26421M + ", phoneCallLogId=" + this.f26422N + ")";
    }

    /* renamed from: u */
    public final String m30017u() {
        return this.f26440r;
    }

    /* renamed from: v */
    public final String m30018v() {
        return this.f26438p;
    }

    /* renamed from: w */
    public final String m30019w() {
        return this.f26412D;
    }

    /* renamed from: x */
    public final String m30020x() {
        return this.f26413E;
    }

    /* renamed from: y */
    public final String m30021y() {
        return this.f26421M;
    }

    /* renamed from: z */
    public final String m30022z() {
        return this.f26423a;
    }

    public /* synthetic */ h96(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l5, boolean z, String str17, Boolean bool, Boolean bool2, Boolean bool3, String str18, String str19, String str20, String str21, String str22, String str23, Long l6, Long l7, String str24, String str25, Long l8, String str26, String str27, String str28, int i, int i2, id5 id5Var) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, str10, str11, str12, str13, str14, str15, str16, l5, (i & 2097152) != 0 ? false : z, str17, bool, (i & 16777216) != 0 ? Boolean.FALSE : bool2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? Boolean.FALSE : bool3, (i & 67108864) != 0 ? null : str18, (i & 134217728) != 0 ? null : str19, (i & 268435456) != 0 ? null : str20, (i & 536870912) != 0 ? null : str21, (i & 1073741824) != 0 ? null : str22, (i & Integer.MIN_VALUE) != 0 ? null : str23, (i2 & 1) != 0 ? 0L : l6, (i2 & 2) != 0 ? Long.valueOf(System.currentTimeMillis()) : l7, (i2 & 4) != 0 ? null : str24, (i2 & 8) != 0 ? null : str25, (i2 & 16) != 0 ? null : l8, (i2 & 32) != 0 ? null : str26, (i2 & 64) != 0 ? null : str27, (i2 & 128) != 0 ? null : str28);
    }
}
