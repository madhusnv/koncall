package av;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import g2.h4;
import im.EnumC3311m;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4800k;
import om.C5415q;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p020v.a1;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: av.b */
/* loaded from: classes3.dex */
public final class C0459b {

    /* renamed from: A */
    public final h4 f3261A;

    /* renamed from: B */
    public final Integer f3262B;

    /* renamed from: C */
    public final Integer f3263C;

    /* renamed from: D */
    public final boolean f3264D;

    /* renamed from: E */
    public final List f3265E;

    /* renamed from: F */
    public final boolean f3266F;

    /* renamed from: G */
    public final boolean f3267G;

    /* renamed from: H */
    public final EnumC0460c f3268H;

    /* renamed from: I */
    public final EnumC3311m f3269I;

    /* renamed from: J */
    public final boolean f3270J;

    /* renamed from: K */
    public final boolean f3271K;

    /* renamed from: L */
    public final boolean f3272L;

    /* renamed from: M */
    public final boolean f3273M;

    /* renamed from: N */
    public final boolean f3274N;

    /* renamed from: O */
    public final C6361k f3275O;

    /* renamed from: P */
    public final boolean f3276P;

    /* renamed from: Q */
    public final boolean f3277Q;

    /* renamed from: a */
    public final C5415q f3278a;

    /* renamed from: b */
    public final C5415q f3279b;

    /* renamed from: c */
    public final ArrayList f3280c;

    /* renamed from: d */
    public final List f3281d;

    /* renamed from: e */
    public final ArrayList f3282e;

    /* renamed from: f */
    public final List f3283f;

    /* renamed from: g */
    public final String f3284g;

    /* renamed from: h */
    public final boolean f3285h;

    /* renamed from: i */
    public final boolean f3286i;

    /* renamed from: j */
    public final String f3287j;

    /* renamed from: k */
    public final String f3288k;

    /* renamed from: l */
    public final boolean f3289l;

    /* renamed from: m */
    public final int f3290m;

    /* renamed from: n */
    public final int f3291n;

    /* renamed from: o */
    public final String f3292o;

    /* renamed from: p */
    public final String f3293p;

    /* renamed from: q */
    public final String f3294q;

    /* renamed from: r */
    public final LocalDateTime f3295r;

    /* renamed from: s */
    public final boolean f3296s;

    /* renamed from: t */
    public final boolean f3297t;

    /* renamed from: u */
    public final boolean f3298u;

    /* renamed from: v */
    public final String f3299v;

    /* renamed from: w */
    public final boolean f3300w;

    /* renamed from: x */
    public final boolean f3301x;

    /* renamed from: y */
    public final boolean f3302y;

    /* renamed from: z */
    public final C4800k f3303z;

    public C0459b(C5415q c5415q, C5415q c5415q2, ArrayList arrayList, List leadStatusList, ArrayList arrayList2, List recentNotesList, String str, boolean z6, boolean z10, String str2, String str3, boolean z11, int i10, int i11, String str4, String str5, String str6, LocalDateTime localDateTime, boolean z12, boolean z13, boolean z14, String str7, boolean z15, boolean z16, boolean z17, C4800k c4800k, h4 h4Var, Integer num, Integer num2, boolean z18, List list, boolean z19, boolean z20, EnumC0460c noteSavedState, EnumC3311m isAssignToMeApiMessages, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, C6361k c6361k, boolean z26, boolean z27) {
        AbstractC4154l.m8923f(leadStatusList, "leadStatusList");
        AbstractC4154l.m8923f(recentNotesList, "recentNotesList");
        AbstractC4154l.m8923f(noteSavedState, "noteSavedState");
        AbstractC4154l.m8923f(isAssignToMeApiMessages, "isAssignToMeApiMessages");
        this.f3278a = c5415q;
        this.f3279b = c5415q2;
        this.f3280c = arrayList;
        this.f3281d = leadStatusList;
        this.f3282e = arrayList2;
        this.f3283f = recentNotesList;
        this.f3284g = str;
        this.f3285h = z6;
        this.f3286i = z10;
        this.f3287j = str2;
        this.f3288k = str3;
        this.f3289l = z11;
        this.f3290m = i10;
        this.f3291n = i11;
        this.f3292o = str4;
        this.f3293p = str5;
        this.f3294q = str6;
        this.f3295r = localDateTime;
        this.f3296s = z12;
        this.f3297t = z13;
        this.f3298u = z14;
        this.f3299v = str7;
        this.f3300w = z15;
        this.f3301x = z16;
        this.f3302y = z17;
        this.f3303z = c4800k;
        this.f3261A = h4Var;
        this.f3262B = num;
        this.f3263C = num2;
        this.f3264D = z18;
        this.f3265E = list;
        this.f3266F = z19;
        this.f3267G = z20;
        this.f3268H = noteSavedState;
        this.f3269I = isAssignToMeApiMessages;
        this.f3270J = z21;
        this.f3271K = z22;
        this.f3272L = z23;
        this.f3273M = z24;
        this.f3274N = z25;
        this.f3275O = c6361k;
        this.f3276P = z26;
        this.f3277Q = z27;
    }

    /* renamed from: a */
    public static C0459b m1461a(C0459b c0459b, C5415q c5415q, C5415q c5415q2, ArrayList arrayList, List list, ArrayList arrayList2, String str, boolean z6, String str2, boolean z10, int i10, int i11, String str3, String str4, String str5, LocalDateTime localDateTime, boolean z11, boolean z12, boolean z13, String str6, boolean z14, boolean z15, C4800k c4800k, h4 h4Var, Integer num, Integer num2, boolean z16, List list2, boolean z17, boolean z18, EnumC0460c enumC0460c, EnumC3311m enumC3311m, boolean z19, boolean z20, boolean z21, boolean z22, C6361k c6361k, boolean z23, boolean z24, int i12, int i13) {
        C5415q notePopUpCallLogDetails = (i12 & 1) != 0 ? c0459b.f3278a : c5415q;
        C5415q nativeNotePopUpCallLogDetails = (i12 & 2) != 0 ? c0459b.f3279b : c5415q2;
        ArrayList arrayList3 = (i12 & 4) != 0 ? c0459b.f3280c : arrayList;
        List leadStatusList = (i12 & 8) != 0 ? c0459b.f3281d : list;
        ArrayList arrayList4 = (i12 & 16) != 0 ? c0459b.f3282e : arrayList2;
        List recentNotesList = c0459b.f3283f;
        String note = (i12 & 64) != 0 ? c0459b.f3284g : str;
        boolean z25 = (i12 & 128) != 0 ? c0459b.f3285h : z6;
        boolean z26 = (i12 & 256) != 0 ? c0459b.f3286i : false;
        String str7 = (i12 & 512) != 0 ? c0459b.f3287j : "";
        String errorMessage = (i12 & 1024) != 0 ? c0459b.f3288k : str2;
        boolean z27 = (i12 & NewHope.SENDB_BYTES) != 0 ? c0459b.f3289l : z10;
        int i14 = (i12 & 4096) != 0 ? c0459b.f3290m : i10;
        int i15 = (i12 & 8192) != 0 ? c0459b.f3291n : i11;
        String durationHour = (i12 & 16384) != 0 ? c0459b.f3292o : str3;
        String durationMin = (32768 & i12) != 0 ? c0459b.f3293p : str4;
        String durationSec = (i12 & 65536) != 0 ? c0459b.f3294q : str5;
        c0459b.getClass();
        ArrayList arrayList5 = arrayList3;
        LocalDateTime localDateTime2 = (i12 & 262144) != 0 ? c0459b.f3295r : localDateTime;
        boolean z28 = (i12 & 524288) != 0 ? c0459b.f3296s : z11;
        boolean z29 = (i12 & 1048576) != 0 ? c0459b.f3297t : z12;
        boolean z30 = (i12 & 2097152) != 0 ? c0459b.f3298u : z13;
        String leadId = (i12 & 4194304) != 0 ? c0459b.f3299v : str6;
        ArrayList arrayList6 = arrayList4;
        boolean z31 = (i12 & 8388608) != 0 ? c0459b.f3300w : z14;
        boolean z32 = (i12 & 16777216) != 0 ? c0459b.f3301x : z15;
        boolean z33 = (i12 & 33554432) != 0 ? c0459b.f3302y : true;
        C4800k c4800k2 = (i12 & 67108864) != 0 ? c0459b.f3303z : c4800k;
        h4 h4Var2 = (i12 & 134217728) != 0 ? c0459b.f3261A : h4Var;
        Integer num3 = (i12 & 268435456) != 0 ? c0459b.f3262B : num;
        Integer num4 = (i12 & 536870912) != 0 ? c0459b.f3263C : num2;
        boolean z34 = (i12 & 1073741824) != 0 ? c0459b.f3264D : z16;
        List templatesItems = (i12 & Integer.MIN_VALUE) != 0 ? c0459b.f3265E : list2;
        boolean z35 = z25;
        boolean z36 = (i13 & 1) != 0 ? c0459b.f3266F : z17;
        boolean z37 = (i13 & 2) != 0 ? c0459b.f3267G : z18;
        EnumC0460c noteSavedState = (i13 & 4) != 0 ? c0459b.f3268H : enumC0460c;
        EnumC3311m isAssignToMeApiMessages = (i13 & 8) != 0 ? c0459b.f3269I : enumC3311m;
        boolean z38 = (i13 & 16) != 0 ? c0459b.f3270J : z19;
        boolean z39 = (i13 & 32) != 0 ? c0459b.f3271K : true;
        boolean z40 = (i13 & 64) != 0 ? c0459b.f3272L : z20;
        boolean z41 = (i13 & 128) != 0 ? c0459b.f3273M : z21;
        boolean z42 = (i13 & 256) != 0 ? c0459b.f3274N : z22;
        C6361k isNotValidTitle = (i13 & 512) != 0 ? c0459b.f3275O : c6361k;
        boolean z43 = (i13 & 1024) != 0 ? c0459b.f3276P : z23;
        boolean z44 = (i13 & NewHope.SENDB_BYTES) != 0 ? c0459b.f3277Q : z24;
        c0459b.getClass();
        AbstractC4154l.m8923f(notePopUpCallLogDetails, "notePopUpCallLogDetails");
        AbstractC4154l.m8923f(nativeNotePopUpCallLogDetails, "nativeNotePopUpCallLogDetails");
        AbstractC4154l.m8923f(leadStatusList, "leadStatusList");
        AbstractC4154l.m8923f(recentNotesList, "recentNotesList");
        AbstractC4154l.m8923f(note, "note");
        AbstractC4154l.m8923f(errorMessage, "errorMessage");
        AbstractC4154l.m8923f(durationHour, "durationHour");
        AbstractC4154l.m8923f(durationMin, "durationMin");
        AbstractC4154l.m8923f(durationSec, "durationSec");
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(templatesItems, "templatesItems");
        AbstractC4154l.m8923f(noteSavedState, "noteSavedState");
        AbstractC4154l.m8923f(isAssignToMeApiMessages, "isAssignToMeApiMessages");
        AbstractC4154l.m8923f(isNotValidTitle, "isNotValidTitle");
        return new C0459b(notePopUpCallLogDetails, nativeNotePopUpCallLogDetails, arrayList5, leadStatusList, arrayList6, recentNotesList, note, z35, z26, str7, errorMessage, z27, i14, i15, durationHour, durationMin, durationSec, localDateTime2, z28, z29, z30, leadId, z31, z32, z33, c4800k2, h4Var2, num3, num4, z34, templatesItems, z36, z37, noteSavedState, isAssignToMeApiMessages, z38, z39, z40, z41, z42, isNotValidTitle, z43, z44);
    }

    /* renamed from: b */
    public final C5415q m1462b() {
        return this.f3278a;
    }

    /* renamed from: c */
    public final boolean m1463c() {
        return this.f3296s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0459b)) {
            return false;
        }
        C0459b c0459b = (C0459b) obj;
        return AbstractC4154l.m8918a(this.f3278a, c0459b.f3278a) && AbstractC4154l.m8918a(this.f3279b, c0459b.f3279b) && this.f3280c.equals(c0459b.f3280c) && AbstractC4154l.m8918a(this.f3281d, c0459b.f3281d) && this.f3282e.equals(c0459b.f3282e) && AbstractC4154l.m8918a(this.f3283f, c0459b.f3283f) && AbstractC4154l.m8918a(this.f3284g, c0459b.f3284g) && this.f3285h == c0459b.f3285h && this.f3286i == c0459b.f3286i && this.f3287j.equals(c0459b.f3287j) && this.f3288k.equals(c0459b.f3288k) && this.f3289l == c0459b.f3289l && this.f3290m == c0459b.f3290m && this.f3291n == c0459b.f3291n && this.f3292o.equals(c0459b.f3292o) && this.f3293p.equals(c0459b.f3293p) && this.f3294q.equals(c0459b.f3294q) && AbstractC4154l.m8918a(this.f3295r, c0459b.f3295r) && this.f3296s == c0459b.f3296s && this.f3297t == c0459b.f3297t && this.f3298u == c0459b.f3298u && AbstractC4154l.m8918a(this.f3299v, c0459b.f3299v) && this.f3300w == c0459b.f3300w && this.f3301x == c0459b.f3301x && this.f3302y == c0459b.f3302y && AbstractC4154l.m8918a(this.f3303z, c0459b.f3303z) && this.f3261A.equals(c0459b.f3261A) && AbstractC4154l.m8918a(this.f3262B, c0459b.f3262B) && AbstractC4154l.m8918a(this.f3263C, c0459b.f3263C) && this.f3264D == c0459b.f3264D && this.f3265E.equals(c0459b.f3265E) && this.f3266F == c0459b.f3266F && this.f3267G == c0459b.f3267G && this.f3268H == c0459b.f3268H && this.f3269I == c0459b.f3269I && this.f3270J == c0459b.f3270J && this.f3271K == c0459b.f3271K && this.f3272L == c0459b.f3272L && this.f3273M == c0459b.f3273M && this.f3274N == c0459b.f3274N && AbstractC4154l.m8918a(this.f3275O, c0459b.f3275O) && this.f3276P == c0459b.f3276P && this.f3277Q == c0459b.f3277Q;
    }

    public final int hashCode() {
        int iM4557d = AbstractC1452a.m4557d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4556c(this.f3291n, AbstractC1452a.m4556c(this.f3290m, AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4559f(this.f3283f, (this.f3282e.hashCode() + AbstractC1452a.m4559f(this.f3281d, (this.f3280c.hashCode() + ((this.f3279b.hashCode() + (this.f3278a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31), 31, this.f3284g), 31, this.f3285h), 31, this.f3286i), 31, this.f3287j), 31, this.f3288k), 31, this.f3289l), 31), 31), 31, this.f3292o), 31, this.f3293p), 31, this.f3294q), 31, 0L);
        LocalDateTime localDateTime = this.f3295r;
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC0030c.m113d(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((iM4557d + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.f3296s), 31, this.f3297t), 31, this.f3298u), 31, this.f3299v), 31, this.f3300w), 31, this.f3301x), 31, this.f3302y);
        C4800k c4800k = this.f3303z;
        int iHashCode = (this.f3261A.hashCode() + ((iM4558e + (c4800k == null ? 0 : c4800k.hashCode())) * 31)) * 31;
        Integer num = this.f3262B;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3263C;
        return Boolean.hashCode(this.f3277Q) + AbstractC1452a.m4558e((this.f3275O.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f3269I.hashCode() + ((this.f3268H.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4559f(this.f3265E, AbstractC1452a.m4558e((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f3264D), 31), 31, this.f3266F), 31, this.f3267G)) * 31)) * 31, 31, this.f3270J), 31, this.f3271K), 31, this.f3272L), 31, this.f3273M), 31, this.f3274N)) * 31, 31, this.f3276P);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotePopUpState(notePopUpCallLogDetails=");
        sb2.append(this.f3278a);
        sb2.append(", nativeNotePopUpCallLogDetails=");
        sb2.append(this.f3279b);
        sb2.append(", connectedSimList=");
        sb2.append(this.f3280c);
        sb2.append(", leadStatusList=");
        sb2.append(this.f3281d);
        sb2.append(", callTypeList=");
        sb2.append(this.f3282e);
        sb2.append(", recentNotesList=");
        sb2.append(this.f3283f);
        sb2.append(", note=");
        AbstractC4801l.m9749w(sb2, this.f3284g, ", micPermissionGranted=", this.f3285h, ", isMicListening=");
        AbstractC4801l.m9751y(sb2, this.f3286i, ", micRecognizedText=", this.f3287j, ", errorMessage=");
        AbstractC4801l.m9749w(sb2, this.f3288k, ", isInternet=", this.f3289l, ", selectedSimIndex=");
        sb2.append(this.f3290m);
        sb2.append(", selectedCallTypeIndex=");
        sb2.append(this.f3291n);
        sb2.append(", durationHour=");
        a1.m14319B(sb2, this.f3292o, ", durationMin=", this.f3293p, ", durationSec=");
        sb2.append(this.f3294q);
        sb2.append(", duration=0, reminderDateTime=");
        sb2.append(this.f3295r);
        sb2.append(", isLead=");
        AbstractC0030c.m133x(sb2, this.f3296s, ", statusLoader=", this.f3297t, ", templateSaved=");
        AbstractC4801l.m9751y(sb2, this.f3298u, ", leadId=", this.f3299v, ", inProgress=");
        AbstractC0030c.m133x(sb2, this.f3300w, ", showConnectDialog=", this.f3301x, ", saveAsNote=");
        sb2.append(this.f3302y);
        sb2.append(", selectedLeadStatus=");
        sb2.append(this.f3303z);
        sb2.append(", datePickerState=");
        sb2.append(this.f3261A);
        sb2.append(", leadStatusError=");
        sb2.append(this.f3262B);
        sb2.append(", leadReminderError=");
        sb2.append(this.f3263C);
        sb2.append(", isNavigateToLead=");
        sb2.append(this.f3264D);
        sb2.append(", templatesItems=");
        sb2.append(this.f3265E);
        sb2.append(", showAddTemplate=");
        sb2.append(this.f3266F);
        sb2.append(", hideAddTemplate=");
        sb2.append(this.f3267G);
        sb2.append(", noteSavedState=");
        sb2.append(this.f3268H);
        sb2.append(", isAssignToMeApiMessages=");
        sb2.append(this.f3269I);
        sb2.append(", hideSaveButton=");
        sb2.append(this.f3270J);
        sb2.append(", showCloseButton=");
        AbstractC0030c.m133x(sb2, this.f3271K, ", showRetryButton=", this.f3272L, ", showLoaderText=");
        AbstractC0030c.m133x(sb2, this.f3273M, ", showErrorPopup=", this.f3274N, ", isNotValidTitle=");
        sb2.append(this.f3275O);
        sb2.append(", isWhatsappSheetVisible=");
        sb2.append(this.f3276P);
        sb2.append(", isSubscription=");
        return AbstractC5601a.m11242m(sb2, this.f3277Q, ")");
    }
}
