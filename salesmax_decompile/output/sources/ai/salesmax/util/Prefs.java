package ai.salesmax.util;

import ai.salesmax.model.CallLogs;
import ai.salesmax.model.EngagementSummary;
import ai.salesmax.model.Sim;
import ai.salesmax.model.Tasks;
import ai.salesmax.model.UserContactDetail;
import ai.salesmax.model.event.PreferenceChangeEvent;
import ai.salesmax.model.event.PreferenceChangeEventListener;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.view.WindowManager;
import com.amazonaws.util.StringUtils;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.e9g;
import p001o.f9g;
import p001o.hae;
import p001o.id5;
import p001o.jm;
import p001o.m9i;
import p001o.ryh;
import p001o.sq8;
import p001o.uni;
import p001o.uyh;

/* loaded from: classes2.dex */
public final class Prefs {
    public static final C1669a Y0 = new C1669a(null);
    public static final int Z0 = 8;

    /* renamed from: A */
    public final String f4893A;
    public final String A0;

    /* renamed from: B */
    public final String f4894B;
    public final String B0;

    /* renamed from: C */
    public final String f4895C;
    public final String C0;

    /* renamed from: D */
    public final String f4896D;
    public final String D0;

    /* renamed from: E */
    public final String f4897E;
    public final String E0;

    /* renamed from: F */
    public final String f4898F;
    public final String F0;

    /* renamed from: G */
    public final String f4899G;
    public final String G0;

    /* renamed from: H */
    public final String f4900H;
    public final String H0;

    /* renamed from: I */
    public final String f4901I;
    public final String I0;

    /* renamed from: J */
    public final String f4902J;
    public final String J0;

    /* renamed from: K */
    public final String f4903K;
    public final String K0;

    /* renamed from: L */
    public final String f4904L;
    public final String L0;

    /* renamed from: M */
    public final String f4905M;
    public final String M0;

    /* renamed from: N */
    public final String f4906N;
    public final String N0;

    /* renamed from: O */
    public final String f4907O;
    public final String O0;

    /* renamed from: P */
    public final String f4908P;
    public final String P0;

    /* renamed from: Q */
    public final String f4909Q;
    public final String Q0;

    /* renamed from: R */
    public final String f4910R;
    public final String R0;

    /* renamed from: S */
    public final String f4911S;
    public final SharedPreferences S0;

    /* renamed from: T */
    public final String f4912T;
    public final String T0;

    /* renamed from: U */
    public final String f4913U;
    public final String U0;

    /* renamed from: V */
    public final String f4914V;
    public final m9i V0;

    /* renamed from: W */
    public final String f4915W;
    public final m9i W0;

    /* renamed from: X */
    public final String f4916X;
    public List X0;

    /* renamed from: Y */
    public final String f4917Y;

    /* renamed from: Z */
    public final String f4918Z;

    /* renamed from: a */
    public final Context f4919a;
    public final String a0;

    /* renamed from: b */
    public final String f4920b;
    public final String b0;

    /* renamed from: c */
    public final String f4921c;
    public final String c0;

    /* renamed from: d */
    public final String f4922d;
    public final String d0;

    /* renamed from: e */
    public final String f4923e;
    public final String e0;

    /* renamed from: f */
    public final String f4924f;
    public final String f0;

    /* renamed from: g */
    public final String f4925g;
    public final String g0;

    /* renamed from: h */
    public final String f4926h;
    public final String h0;

    /* renamed from: i */
    public final String f4927i;
    public final String i0;

    /* renamed from: j */
    public final String f4928j;
    public final String j0;

    /* renamed from: k */
    public final String f4929k;
    public final String k0;

    /* renamed from: l */
    public final String f4930l;
    public final String l0;

    /* renamed from: m */
    public final String f4931m;
    public final String m0;

    /* renamed from: n */
    public final String f4932n;
    public final String n0;

    /* renamed from: o */
    public final String f4933o;
    public final String o0;

    /* renamed from: p */
    public final String f4934p;
    public final String p0;

    /* renamed from: q */
    public final String f4935q;
    public final String q0;

    /* renamed from: r */
    public final String f4936r;
    public final String r0;

    /* renamed from: s */
    public final String f4937s;
    public final String s0;

    /* renamed from: t */
    public final String f4938t;
    public final String t0;

    /* renamed from: u */
    public final String f4939u;
    public final String u0;

    /* renamed from: v */
    public final String f4940v;
    public final String v0;

    /* renamed from: w */
    public final String f4941w;
    public final String w0;

    /* renamed from: x */
    public final String f4942x;
    public final String x0;

    /* renamed from: y */
    public final String f4943y;
    public final String y0;

    /* renamed from: z */
    public final String f4944z;
    public final String z0;

    /* renamed from: ai.salesmax.util.Prefs$a */
    public static final class C1669a {
        public C1669a() {
        }

        public /* synthetic */ C1669a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final WindowManager.LayoutParams m3265a() {
            WindowManager.LayoutParams layoutParams = Build.VERSION.SDK_INT >= 26 ? new WindowManager.LayoutParams(-2, -2, 2038, 8, -3) : new WindowManager.LayoutParams(-1, -1, CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL, 40, -2);
            layoutParams.x = 0;
            layoutParams.y = 100;
            layoutParams.height = -2;
            layoutParams.width = -1;
            layoutParams.format = -3;
            return layoutParams;
        }
    }

    public Prefs(Context context) {
        sq8.m48649h(context, "context");
        this.f4919a = context;
        this.f4920b = "preference";
        this.f4921c = "ai.salesmax.prefs.uiaction";
        this.f4922d = "ai.salesmax.dashboard.recent.search";
        this.f4923e = "isFirstTime";
        this.f4924f = "firstIndtallTimePref";
        this.f4925g = "ai.salesmax.lastLoggedInPhoneNumberPref";
        this.f4926h = "alreadyAskedForBatteryOptimized";
        this.f4927i = "onboardingLeadDetailsMoreNeededPref";
        this.f4928j = "onboardingHomePreferencesNeededPref";
        this.f4929k = "onboardingToDoTypesNeededPref";
        this.f4930l = "onboardingLeadsDialerNeededPref";
        this.f4931m = "onboardingLeadsAddNeededPref";
        this.f4932n = "onboardingDashboardUsersNeededPref";
        this.f4933o = "onboardingLeadsRvDetailNeededPref";
        this.f4934p = "onboardingLeadsRvOptionsNeededPref";
        this.f4935q = "onboardingActivityRvDetailNeededPref";
        this.f4936r = "myPhoneContactsPrefNew";
        this.f4937s = "importedContactsPrefNew";
        this.f4938t = "myCallLogsPrefNew";
        this.f4939u = "permissionRequestedPrefNew";
        this.f4940v = "recordingPermissionRequestedPrefNew";
        this.f4941w = "importContactPermissionRequestedPrefNew";
        this.f4942x = "callPermissionRequestedPrefNew";
        this.f4943y = "basePermissionRequestedPref";
        this.f4944z = "active.userprofile.account";
        this.f4893A = "active.userprofile.apk.version";
        this.f4894B = "newEngagementSummary";
        this.f4895C = "pendingUploadEngagementList";
        this.f4896D = "postCallLoggingPref";
        this.f4897E = "saveCallLogPref";
        this.f4898F = "missedCallLoggingPref";
        this.f4899G = "autoCallSkipPref";
        this.f4900H = "autoCallDisposePref";
        this.f4901I = "autoCallFrequencyPref";
        this.f4902J = "lastLnaCategoryPref";
        this.f4903K = "lastNewLeadsCategoryPref";
        this.f4904L = "followupTypeCategoryPref";
        this.f4905M = "paymentTypeCategoryPref";
        this.f4906N = "lastProspectingLeadsCategoryPref";
        this.f4907O = "lastDealStageSelectedPref";
        this.f4908P = "lastTaskOverdueCategoryPref";
        this.f4909Q = "lastTaskCategorySeenPref";
        this.f4910R = "autoCallExplanationPref";
        this.f4911S = "seenLnaPendingFollowupExplanationPref";
        this.f4912T = "seenLnaPositiveOutcomeExplanationPref";
        this.f4913U = "seenLnaNegativeOutcomeExplanationPref";
        this.f4914V = "seenLnaUnknownOutcomeExplanationPref";
        this.f4915W = "seenLnaUncontactedExplanationPref";
        this.f4916X = "seenLnaMissedCallExplanationPref";
        this.f4917Y = "seenLnaUnconnectedLastExplanationPref";
        this.f4918Z = "seenDialerExplanationPref";
        this.a0 = "seenLnaFreshExplanationPref";
        this.b0 = "viewUniqueCallMetricsPref";
        this.c0 = "seenDealCreatedTodayExplanationPref";
        this.d0 = "seenDealMovedTodayExplanationPref";
        this.e0 = "seenDealActiveExplanationPref";
        this.f0 = "seenDealWonExplanationPref";
        this.g0 = "seenDealLostExplanationPref";
        this.h0 = "seenDealStuckExplanationPref";
        this.i0 = "lastDealCategoryPref";
        this.j0 = "saveCallRecordingLogPref";
        this.k0 = "useBusinessWhatsappPref";
        this.l0 = "enableSttPref";
        this.m0 = "speechToTextLanguagePref";
        this.n0 = "useUnknownNumberPref";
        this.o0 = "keepUnknownNumberUnassignedPref";
        this.p0 = "showInAppNotificationPref";
        this.q0 = "autoTrackLocationPref";
        this.r0 = "useDefaultSimToTrackUnknownNumberPref";
        this.s0 = "saveActivityLocationLogPref";
        this.t0 = "screenPopUpPref";
        this.u0 = "newTasks";
        this.v0 = "simPrefs";
        this.w0 = "ai.salesmax.prefs.upload.calllog.provider";
        this.x0 = "ai.salesmax.prefs.upload.calllog.recording";
        this.y0 = "ai.salesmax.prefs.upload.calllog.ids";
        this.z0 = "ai.salesmax.prefs.upload.calllog.inprogress.ids";
        this.A0 = "ai.salesmax.prefs.upload.calllog.syncTime";
        this.B0 = "ai.salesmax.prefs.versionCheckTime";
        this.C0 = "ai.salesmax.prefs.email.verification.code";
        this.D0 = "ai.salesmax.prefs.phonenumber.verification.code";
        this.E0 = "ai.salesmax.prefs.callrecording.storage";
        this.F0 = "ai.salesmax.prefs.callrecording.uri";
        this.G0 = "ai.salesmax.prefs.chat.upload";
        this.H0 = "ai.salesmax.prefs.loggedInUserID";
        this.I0 = "ai.salesmax.prefs.loggedInAccountID";
        this.J0 = "ai.salesmax.prefs.cloudTelephony.virtualNumbers";
        this.K0 = "ai.salesmax.prefs.cloudTelephony.provider";
        this.L0 = "ai.salesmax.prefs.cloudTelephony.currentUser";
        this.M0 = "ai.salesmax.prefs.leadDetail.masking";
        this.N0 = "ai.salesmax.prefs.lead.canBeDeleted";
        this.O0 = "ai.salesmax.prefs.lead.onlyCameraAllowed";
        this.P0 = "ai.salesmax.prefs.lead.shouldHideLeadSource";
        this.Q0 = "isLoggedInPref";
        this.R0 = "ai.salesmax.prefs.dealMode";
        m9i m9iVar = new m9i(context);
        this.S0 = m9iVar;
        this.T0 = "xPos";
        this.U0 = "yPos";
        m9i m9iVar2 = new m9i(context);
        this.V0 = m9iVar2;
        m9i m9iVar3 = new m9i(context);
        this.W0 = m9iVar3;
        this.X0 = Collections.synchronizedList(new ArrayList());
        String string = m9iVar.getString("ai.salesmax.prefs.loggedInUserID", "");
        string = string == null ? "" : string;
        String string2 = m9iVar.getString("ai.salesmax.prefs.loggedInAccountID", "");
        string2 = string2 == null ? "" : string2;
        if (!StringUtils.isBlank(string)) {
            m9iVar3.m38603h(string, "");
        }
        if (StringUtils.isBlank(string) || StringUtils.isBlank(string2)) {
            new RuntimeException("User and Account Id Are Not Set");
            FirebaseCrashlytics.getInstance().recordException(new RuntimeException("Preferences are initialized without userId and accountId"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Preferences are initialized with userId ");
        sb.append(string);
        sb.append(" and accountId ");
        sb.append(string2);
        m9iVar2.m38603h(string, string2);
    }

    /* renamed from: A */
    public final String m3213A() {
        return this.V0.getString(this.C0, null);
    }

    public final boolean A0() {
        return this.S0.getBoolean(this.f4923e, true);
    }

    public final void A1(boolean z) {
        this.V0.edit().putBoolean(this.f4897E, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_SAVE_BUSINESS_CALL, Boolean.valueOf(z));
    }

    /* renamed from: B */
    public final boolean m3214B() {
        return this.V0.getBoolean(this.l0, false);
    }

    public final void B0(PreferenceChangeEventListener preferenceChangeEventListener) {
        sq8.m48649h(preferenceChangeEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.X0.remove(preferenceChangeEventListener);
    }

    public final void B1(boolean z) {
        this.V0.edit().putBoolean(this.t0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_SCREEN_POP, Boolean.valueOf(z));
    }

    /* renamed from: C */
    public final ArrayList m3215C(String str) {
        if (!(!f9g.d0(str))) {
            return new ArrayList();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<ArrayList<EngagementSummary>>() { // from class: ai.salesmax.util.Prefs$getEngagementSummaryList$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    public final void C0() {
        this.V0.edit().clear().apply();
    }

    public final void C1(boolean z) {
        this.W0.edit().putBoolean(this.f4910R, z).apply();
    }

    /* renamed from: D */
    public final String m3216D() {
        return this.V0.getString(this.f4904L, null);
    }

    public final void D0(String str) {
        sq8.m48649h(str, "userId");
        this.W0.m38603h(str, "");
    }

    public final void D1(boolean z) {
        this.W0.edit().putBoolean(this.e0, z).apply();
    }

    /* renamed from: E */
    public final long m3217E() {
        return this.S0.getLong(this.f4924f, -1L);
    }

    public final void E0(String str, String str2) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "accountId");
        Y1(str2);
        this.W0.m38603h(str, "");
        this.V0.m38603h(str, str2);
        this.S0.edit().putString(this.H0, str).apply();
        this.S0.edit().putString(this.I0, str2).apply();
    }

    public final void E1(boolean z) {
        this.W0.edit().putBoolean(this.c0, z).apply();
    }

    /* renamed from: F */
    public final ArrayList m3218F() {
        String string = this.V0.getString(this.f4937s, "");
        sq8.m48646e(string);
        return m3258t(string);
    }

    public final void F0(boolean z) {
        this.V0.edit().putBoolean(this.s0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_TRACK_LOCATION_ON_ACTIVITY, Boolean.valueOf(z));
    }

    public final void F1(boolean z) {
        this.W0.edit().putBoolean(this.g0, z).apply();
    }

    /* renamed from: G */
    public final boolean m3219G() {
        return this.W0.getBoolean(this.o0, false);
    }

    public final void G0(String str) {
        this.V0.edit().putString(this.f4900H, str).apply();
    }

    public final void G1(boolean z) {
        this.W0.edit().putBoolean(this.d0, z).apply();
    }

    /* renamed from: H */
    public final String m3220H() {
        return this.V0.getString(this.f4902J, this.f4919a.getString(hae.lna_fresh));
    }

    public final void H0(String str) {
        this.V0.edit().putString(this.f4901I, str).apply();
    }

    public final void H1(boolean z) {
        this.W0.edit().putBoolean(this.h0, z).apply();
    }

    /* renamed from: I */
    public final String m3221I() {
        String string = this.S0.getString(this.f4925g, "");
        return string == null ? "" : string;
    }

    public final void I0(String str) {
        this.V0.edit().putString(this.f4899G, str).apply();
    }

    public final void I1(boolean z) {
        this.W0.edit().putBoolean(this.f0, z).apply();
    }

    /* renamed from: J */
    public final String m3222J() {
        return this.V0.getString(this.f4903K, this.f4919a.getString(hae.all));
    }

    public final void J0(boolean z) {
        this.W0.edit().putBoolean(this.q0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_AUTO_TRACK_LOCATION, Boolean.valueOf(z));
    }

    public final void J1(boolean z) {
        this.W0.edit().putBoolean(this.f4918Z, z).apply();
    }

    /* renamed from: K */
    public final String m3223K() {
        return this.V0.getString(this.f4906N, null);
    }

    public final void K0(boolean z) {
        this.S0.edit().putBoolean(this.f4943y, z).apply();
    }

    public final void K1(boolean z) {
        this.W0.edit().putBoolean(this.a0, z).apply();
    }

    /* renamed from: L */
    public final String m3224L() {
        return this.V0.getString(this.f4909Q, this.f4919a.getString(hae.task_category));
    }

    public final void L0(int i, int i2) {
        this.V0.edit().putInt(this.T0, i).apply();
        this.V0.edit().putInt(this.U0, i2).apply();
    }

    public final void L1(boolean z) {
        this.W0.edit().putBoolean(this.f4916X, z).apply();
    }

    /* renamed from: M */
    public final String m3225M() {
        return this.V0.getString(this.f4908P, this.f4919a.getString(hae.all_overdue));
    }

    public final String M0(ArrayList arrayList) {
        String json = new Gson().toJson(arrayList);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    public final void M1(boolean z) {
        this.W0.edit().putBoolean(this.f4913U, z).apply();
    }

    /* renamed from: N */
    public final boolean m3226N() {
        return this.V0.getBoolean(this.f4898F, false);
    }

    public final void N0(boolean z) {
        this.V0.edit().putBoolean(this.j0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_SYNC, Boolean.valueOf(z));
    }

    public final void N1(boolean z) {
        this.W0.edit().putBoolean(this.f4911S, z).apply();
    }

    /* renamed from: O */
    public final ArrayList m3227O() {
        String string = this.V0.getString(this.f4938t, "");
        sq8.m48646e(string);
        return m3250l(string);
    }

    public final void O0(Uri uri) {
        if (uri != null) {
            this.S0.edit().putString(this.F0, uri.toString()).apply();
            m3241c(PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_ROOT_URI, uri);
        }
    }

    public final void O1(boolean z) {
        this.W0.edit().putBoolean(this.f4912T, z).apply();
    }

    /* renamed from: P */
    public final ArrayList m3228P() {
        String string = this.V0.getString(this.u0, "");
        sq8.m48646e(string);
        return t0(string);
    }

    public final void P0(String str) {
        this.S0.edit().putString(this.E0, str).apply();
        PreferenceChangeEvent.EventType eventType = PreferenceChangeEvent.EventType.PREF_CALL_RECORDING_STORAGE;
        if (str == null) {
            str = "";
        }
        m3241c(eventType, str);
    }

    public final void P1(boolean z) {
        this.W0.edit().putBoolean(this.f4917Y, z).apply();
    }

    /* renamed from: Q */
    public final boolean m3229Q() {
        return this.V0.getBoolean(this.O0, false);
    }

    public final void Q0(boolean z) {
        this.V0.edit().putBoolean(this.N0, z).apply();
    }

    public final void Q1(boolean z) {
        this.W0.edit().putBoolean(this.f4915W, z).apply();
    }

    /* renamed from: R */
    public final String m3230R() {
        return this.V0.getString(this.f4905M, null);
    }

    public final void R0(String str) {
        this.V0.edit().putString(this.L0, str).apply();
    }

    public final void R1(boolean z) {
        this.W0.edit().putBoolean(this.f4914V, z).apply();
    }

    /* renamed from: S */
    public final ArrayList m3231S() {
        String string = this.V0.getString(this.f4895C, "");
        sq8.m48646e(string);
        return m3215C(string);
    }

    public final void S0(Map map) {
        sq8.m48649h(map, "value");
        this.V0.edit().putString(this.J0, b2(map)).apply();
    }

    public final void S1(boolean z) {
        this.V0.edit().putBoolean(this.P0, z).apply();
    }

    /* renamed from: T */
    public final String m3232T() {
        return this.V0.getString(this.D0, null);
    }

    public final void T0(String str) {
        this.V0.edit().putString(this.K0, str).apply();
        if (str != null) {
            m3241c(PreferenceChangeEvent.EventType.PREF_CLOUD_TELEPHONY_PROVIDER_PREF, str);
        }
    }

    public final void T1(boolean z) {
        this.W0.edit().putBoolean(this.p0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_SHOW_INAPP_NOTIFICATIONS, Boolean.valueOf(z));
    }

    /* renamed from: U */
    public final boolean m3233U() {
        return this.V0.getBoolean(this.f4896D, true);
    }

    public final String U0(ArrayList arrayList) {
        String json = new Gson().toJson(arrayList);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    public final void U1(ArrayList arrayList) {
        sq8.m48649h(arrayList, "value");
        this.V0.edit().putString(this.v0, V1(arrayList)).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_DEFAULT_SIM_TO_CALL, arrayList);
    }

    /* renamed from: V */
    public final String m3234V() {
        return this.V0.getString(this.m0, "English");
    }

    public final void V0(String str, String str2, String str3) {
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "userId");
        sq8.m48649h(str3, "value");
        this.V0.edit().putString(this.f4922d + "." + str + "." + str2, str3).apply();
    }

    public final String V1(ArrayList arrayList) {
        String json = new Gson().toJson(arrayList);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    /* renamed from: W */
    public final boolean m3235W() {
        return this.W0.getBoolean(this.f4940v, false);
    }

    public final void W0(String str) {
        this.V0.edit().putString(this.R0, str).apply();
    }

    public final String W1(ArrayList arrayList) {
        String json = new Gson().toJson(arrayList);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    /* renamed from: X */
    public final boolean m3236X() {
        return this.V0.getBoolean(this.f4897E, true);
    }

    public final void X0(boolean z) {
        this.V0.edit().putBoolean(this.k0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_USE_BUSINESS_WHATSAPP, Boolean.valueOf(z));
    }

    public final void X1(String str, String str2, String str3) {
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "userId");
        sq8.m48649h(str3, "value");
        this.V0.edit().putString(this.f4921c + "." + str + "." + str2, str3).apply();
    }

    /* renamed from: Y */
    public final boolean m3237Y() {
        return this.V0.getBoolean(this.t0, true);
    }

    public final void Y0(String str) {
        sq8.m48649h(str, "value");
        this.V0.edit().putString(this.r0, str).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_TRACK_ALL_CALLS_SPECIFIC_SIM, str);
    }

    public final void Y1(String str) {
        sq8.m48649h(str, "value");
        this.W0.edit().putString(this.f4944z, str).apply();
    }

    /* renamed from: Z */
    public final boolean m3238Z() {
        return this.W0.getBoolean(this.f4910R, false);
    }

    public final void Z0(boolean z) {
        this.V0.edit().putBoolean(this.n0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_TRACK_ALL_CALLS, Boolean.valueOf(z));
    }

    public final void Z1(long j) {
        this.S0.edit().putLong(this.B0, j).apply();
    }

    /* renamed from: a */
    public final void m3239a(PreferenceChangeEventListener preferenceChangeEventListener) {
        sq8.m48649h(preferenceChangeEventListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.X0.contains(preferenceChangeEventListener)) {
            return;
        }
        this.X0.add(preferenceChangeEventListener);
    }

    public final boolean a0() {
        return this.W0.getBoolean(this.e0, false);
    }

    public final void a1(String str) {
        this.V0.edit().putString(this.C0, str).apply();
    }

    public final void a2(boolean z) {
        this.V0.edit().putBoolean(this.b0, z).apply();
    }

    /* renamed from: b */
    public final String m3240b() {
        String string;
        String string2 = this.V0.getString(this.r0, "-1");
        return (string2 == null || (string = f9g.Z0(string2).toString()) == null) ? "-1" : (e9g.m24597K(string, "-1", false, 2, null) || e9g.m24597K(string, "0", false, 2, null) || e9g.m24597K(string, "1", false, 2, null)) ? string : "-1";
    }

    public final boolean b0() {
        return this.W0.getBoolean(this.c0, false);
    }

    public final void b1(boolean z) {
        this.V0.edit().putBoolean(this.l0, z).apply();
    }

    public final String b2(Map map) {
        String json = new Gson().toJson(map);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    /* renamed from: c */
    public final void m3241c(PreferenceChangeEvent.EventType eventType, Object obj) {
        sq8.m48649h(eventType, "eventType");
        sq8.m48649h(obj, "prefValue");
        PreferenceChangeEvent preferenceChangeEvent = new PreferenceChangeEvent(eventType, obj);
        for (PreferenceChangeEventListener preferenceChangeEventListener : new ArrayList(this.X0)) {
            preferenceChangeEventListener.onPreferenceChangeEvent(preferenceChangeEvent);
            preferenceChangeEventListener.onPreferenceChangeEvent(this.f4919a, preferenceChangeEvent);
        }
    }

    public final boolean c0() {
        return this.W0.getBoolean(this.g0, false);
    }

    public final String c1(EngagementSummary engagementSummary) {
        if (engagementSummary == null) {
            return "";
        }
        String json = new Gson().toJson(engagementSummary);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    public final void c2(jm jmVar) {
        sq8.m48649h(jmVar, "callback");
        uni.YD(jmVar);
    }

    /* renamed from: d */
    public final ryh m3242d() {
        ryh ryhVarOf = uyh.of(this.S0.getString(this.H0, ""), this.S0.getString(this.I0, ""));
        sq8.m48648g(ryhVarOf, "of(...)");
        return ryhVarOf;
    }

    public final boolean d0() {
        return this.W0.getBoolean(this.d0, false);
    }

    public final String d1(ArrayList arrayList) {
        String json = new Gson().toJson(arrayList);
        sq8.m48648g(json, "toJson(...)");
        return json;
    }

    /* renamed from: e */
    public final boolean m3243e() {
        return this.V0.getBoolean(this.s0, false);
    }

    public final boolean e0() {
        return this.W0.getBoolean(this.h0, false);
    }

    public final void e1(String str) {
        this.V0.edit().putString(this.f4904L, str).apply();
    }

    /* renamed from: f */
    public final String m3244f() {
        return this.V0.getString(this.f4900H, this.f4919a.getString(hae.auto_call_dispose_connected_calls));
    }

    public final boolean f0() {
        return this.W0.getBoolean(this.f0, false);
    }

    public final void f1(boolean z) {
        this.S0.edit().putBoolean(this.f4923e, z).apply();
    }

    /* renamed from: g */
    public final String m3245g() {
        return this.V0.getString(this.f4901I, this.f4919a.getString(hae.auto_call_place_in_5_sec));
    }

    public final boolean g0() {
        return this.W0.getBoolean(this.f4918Z, false);
    }

    public final void g1(long j) {
        this.S0.edit().putLong(this.f4924f, j).apply();
    }

    /* renamed from: h */
    public final String m3246h() {
        return this.V0.getString(this.f4899G, this.f4919a.getString(hae.auto_call_skip_today));
    }

    public final boolean h0() {
        return this.W0.getBoolean(this.a0, false);
    }

    public final void h1(ArrayList arrayList) {
        sq8.m48649h(arrayList, "value");
        this.V0.edit().putString(this.f4937s, U0(arrayList)).apply();
    }

    /* renamed from: i */
    public final boolean m3247i() {
        return this.W0.getBoolean(this.q0, false);
    }

    public final boolean i0() {
        return this.W0.getBoolean(this.f4916X, false);
    }

    public final void i1(boolean z) {
        this.W0.edit().putBoolean(this.o0, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_KEEP_UNKNOWN_NUMBER_UNASSIGNED, Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final boolean m3248j() {
        return this.S0.getBoolean(this.f4943y, false);
    }

    public final boolean j0() {
        return this.W0.getBoolean(this.f4913U, false);
    }

    public final void j1(String str) {
        this.V0.edit().putString(this.f4902J, str).apply();
    }

    /* renamed from: k */
    public final WindowManager.LayoutParams m3249k() {
        WindowManager.LayoutParams layoutParamsM3265a = Y0.m3265a();
        layoutParamsM3265a.x = this.V0.getInt(this.T0, 0);
        layoutParamsM3265a.y = this.V0.getInt(this.U0, 100);
        return layoutParamsM3265a;
    }

    public final boolean k0() {
        return this.W0.getBoolean(this.f4911S, false);
    }

    public final void k1(String str) {
        sq8.m48649h(str, "value");
        this.S0.edit().putString(this.f4925g, str).apply();
    }

    /* renamed from: l */
    public final ArrayList m3250l(String str) {
        if (!(!f9g.d0(str))) {
            return new ArrayList();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<ArrayList<CallLogs>>() { // from class: ai.salesmax.util.Prefs$getCallLogsList$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    public final boolean l0() {
        return this.W0.getBoolean(this.f4912T, false);
    }

    public final void l1(String str) {
        this.V0.edit().putString(this.f4903K, str).apply();
    }

    /* renamed from: m */
    public final boolean m3251m() {
        return this.V0.getBoolean(this.j0, true);
    }

    public final boolean m0() {
        return this.W0.getBoolean(this.f4917Y, false);
    }

    public final void m1(String str) {
        this.V0.edit().putString(this.f4906N, str).apply();
    }

    /* renamed from: n */
    public final Uri m3252n() {
        String string = this.S0.getString(this.F0, null);
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }

    public final boolean n0() {
        return this.W0.getBoolean(this.f4915W, false);
    }

    public final void n1(String str) {
        this.V0.edit().putString(this.f4909Q, str).apply();
    }

    /* renamed from: o */
    public final String m3253o() {
        return this.S0.getString(this.E0, null);
    }

    public final boolean o0() {
        return this.W0.getBoolean(this.f4914V, false);
    }

    public final void o1(String str) {
        this.V0.edit().putString(this.f4908P, str).apply();
    }

    /* renamed from: p */
    public final boolean m3254p() {
        return this.V0.getBoolean(this.N0, false);
    }

    public final boolean p0() {
        return this.V0.getBoolean(this.P0, false);
    }

    public final void p1(boolean z) {
        this.V0.edit().putBoolean(this.f4898F, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_MISSED_CALL_DISPOSITION, Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final String m3255q() {
        return this.V0.getString(this.L0, null);
    }

    public final boolean q0() {
        return this.W0.getBoolean(this.p0, true);
    }

    public final void q1(ArrayList arrayList) {
        sq8.m48649h(arrayList, "value");
        this.V0.edit().putString(this.f4938t, M0(arrayList)).apply();
    }

    /* renamed from: r */
    public final Map m3256r() {
        String string = this.V0.getString(this.J0, "");
        sq8.m48646e(string);
        return y0(string);
    }

    public final ArrayList r0() {
        String string = this.V0.getString(this.v0, "");
        sq8.m48646e(string);
        return s0(string);
    }

    public final void r1(EngagementSummary engagementSummary) {
        this.V0.edit().putString(this.f4894B, c1(engagementSummary)).apply();
    }

    /* renamed from: s */
    public final String m3257s() {
        return this.V0.getString(this.K0, null);
    }

    public final ArrayList s0(String str) {
        if (!(!f9g.d0(str))) {
            return new ArrayList();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<ArrayList<Sim>>() { // from class: ai.salesmax.util.Prefs$getSimList$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    public final void s1(ArrayList arrayList) {
        sq8.m48649h(arrayList, "value");
        this.V0.edit().putString(this.u0, W1(arrayList)).apply();
    }

    /* renamed from: t */
    public final ArrayList m3258t(String str) {
        if (!(!f9g.d0(str))) {
            return new ArrayList();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<ArrayList<UserContactDetail>>() { // from class: ai.salesmax.util.Prefs$getContactListForApi$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    public final ArrayList t0(String str) {
        if (!(!f9g.d0(str))) {
            return new ArrayList();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<ArrayList<Tasks>>() { // from class: ai.salesmax.util.Prefs$getTaskList$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (ArrayList) objFromJson;
    }

    public final void t1(boolean z) {
        this.V0.edit().putBoolean(this.O0, z).apply();
    }

    /* renamed from: u */
    public final Context m3259u() {
        return this.f4919a;
    }

    public final String u0(String str, String str2) {
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "userId");
        String string = this.V0.getString(this.f4921c + "." + str + "." + str2, "{}");
        sq8.m48646e(string);
        return string;
    }

    public final void u1(String str) {
        this.V0.edit().putString(this.f4905M, str).apply();
    }

    /* renamed from: v */
    public final String m3260v(String str, String str2) {
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "userId");
        String string = this.V0.getString(this.f4922d + "." + str + "." + str2, "{}");
        sq8.m48646e(string);
        return string;
    }

    public final String v0() {
        String string = this.W0.getString(this.f4944z, "");
        sq8.m48646e(string);
        return string;
    }

    public final void v1(ArrayList arrayList) {
        sq8.m48649h(arrayList, "value");
        this.V0.edit().putString(this.f4895C, d1(arrayList)).apply();
    }

    /* renamed from: w */
    public final String m3261w() {
        return this.V0.getString(this.R0, null);
    }

    public final long w0() {
        return this.S0.getLong(this.B0, 0L);
    }

    public final void w1(String str) {
        this.V0.edit().putString(this.D0, str).apply();
    }

    /* renamed from: x */
    public final boolean m3262x() {
        return this.V0.getBoolean(this.k0, false);
    }

    public final boolean x0() {
        return this.V0.getBoolean(this.b0, false);
    }

    public final void x1(boolean z) {
        this.V0.edit().putBoolean(this.f4896D, z).apply();
        m3241c(PreferenceChangeEvent.EventType.PREF_POST_CALL_DISPOSITION, Boolean.valueOf(z));
    }

    /* renamed from: y */
    public final String m3263y() {
        return m3240b();
    }

    public final Map y0(String str) {
        if (!(!f9g.d0(str))) {
            return new HashMap();
        }
        Object objFromJson = new Gson().fromJson(str, new TypeToken<Map<String, ? extends Map<String, ? extends Boolean>>>() { // from class: ai.salesmax.util.Prefs$getVirtualNumbers$1
        }.getType());
        sq8.m48648g(objFromJson, "fromJson(...)");
        return (Map) objFromJson;
    }

    public final void y1(String str) {
        this.V0.edit().putString(this.m0, str).apply();
    }

    /* renamed from: z */
    public final boolean m3264z() {
        return this.V0.getBoolean(this.n0, false);
    }

    public final boolean z0() {
        return this.V0.m38602e();
    }

    public final void z1(boolean z) {
        this.W0.edit().putBoolean(this.f4940v, z).apply();
    }
}
