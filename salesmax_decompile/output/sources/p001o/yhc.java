package p001o;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import com.facebook.C10773c;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class yhc {

    /* renamed from: a */
    public static final yhc f55535a = new yhc();

    /* renamed from: b */
    public static final String f55536b = "Fledge: " + yhc.class.getSimpleName();

    /* renamed from: c */
    public static boolean f55537c;

    /* renamed from: d */
    public static boolean f55538d;

    /* renamed from: e */
    public static CustomAudienceManager f55539e;

    /* renamed from: f */
    public static ju7 f55540f;

    /* renamed from: g */
    public static String f55541g;

    /* renamed from: o.yhc$a */
    public static final class C18413a implements OutcomeReceiver {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            yhc.m57831b();
            exc.toString();
            ju7 ju7VarM57830a = yhc.m57830a();
            if (ju7VarM57830a == null) {
                sq8.m48667z("gpsDebugLogger");
                ju7VarM57830a = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", exc.toString());
            y3i y3iVar = y3i.f54824a;
            ju7VarM57830a.m34515b("gps_pa_failed", bundle);
        }

        public void onResult(Object obj) {
            sq8.m48649h(obj, "result");
            yhc.m57831b();
            ju7 ju7VarM57830a = yhc.m57830a();
            if (ju7VarM57830a == null) {
                sq8.m48667z("gpsDebugLogger");
                ju7VarM57830a = null;
            }
            ju7VarM57830a.m34515b("gps_pa_succeed", null);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ju7 m57830a() {
        if (a94.m16694d(yhc.class)) {
            return null;
        }
        try {
            return f55540f;
        } catch (Throwable th) {
            a94.m16692b(th, yhc.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ String m57831b() {
        if (a94.m16694d(yhc.class)) {
            return null;
        }
        try {
            return f55536b;
        } catch (Throwable th) {
            a94.m16692b(th, yhc.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final void m57832c() {
        String string;
        if (a94.m16694d(yhc.class)) {
            return;
        }
        try {
            f55538d = true;
            Context contextM13019l = C10773c.m13019l();
            f55540f = new ju7(contextM13019l);
            f55541g = "https://www." + C10773c.m13029v() + "/privacy_sandbox/pa/logic";
            ju7 ju7Var = null;
            try {
                try {
                    CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextM13019l);
                    f55539e = customAudienceManager;
                    if (customAudienceManager != null) {
                        f55537c = true;
                    }
                    string = null;
                } catch (Exception e) {
                    string = e.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get CustomAudienceManager: ");
                    sb.append(e);
                }
            } catch (Error e2) {
                string = e2.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to get CustomAudienceManager: ");
                sb2.append(e2);
            }
            if (f55537c) {
                return;
            }
            ju7 ju7Var2 = f55540f;
            if (ju7Var2 == null) {
                sq8.m48667z("gpsDebugLogger");
            } else {
                ju7Var = ju7Var2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            y3i y3iVar = y3i.f54824a;
            ju7Var.m34515b("gps_pa_failed", bundle);
        } catch (Throwable th) {
            a94.m16692b(th, yhc.class);
        }
    }

    /* renamed from: d */
    public final void m57833d(String str, String str2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (!f55538d) {
                m57832c();
            }
            if (f55537c) {
                m57835f(str, str2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public final void m57834e(String str, tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (!f55538d) {
                m57832c();
            }
            if (f55537c) {
                String string = null;
                if (tk0Var != null) {
                    try {
                        JSONObject jSONObjectM50092c = tk0Var.m50092c();
                        if (jSONObjectM50092c != null) {
                            string = jSONObjectM50092c.getString("_eventName");
                        }
                    } catch (JSONException unused) {
                    }
                }
                m57835f(str, string);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final void m57835f(String str, String str2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            String strM57836g = m57836g(str, str2);
            if (strM57836g == null) {
                return;
            }
            ju7 ju7Var = null;
            try {
                OutcomeReceiver outcomeReceiverM38667a = mb4.m38667a(new C18413a());
                mhc.m39069a();
                AdData.Builder builderM30587a = hhc.m30587a();
                StringBuilder sb = new StringBuilder();
                String str3 = f55541g;
                if (str3 == null) {
                    sq8.m48667z("baseUri");
                    str3 = null;
                }
                sb.append(str3);
                sb.append("/ad");
                Uri uri = Uri.parse(sb.toString());
                sq8.m48645d(uri, "Uri.parse(this)");
                AdData adDataBuild = builderM30587a.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                sq8.m48648g(adDataBuild, "Builder()\n              …\n                .build()");
                nhc.m40604a();
                TrustedBiddingData.Builder builderM33841a = jhc.m33841a();
                StringBuilder sb2 = new StringBuilder();
                String str4 = f55541g;
                if (str4 == null) {
                    sq8.m48667z("baseUri");
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb2.toString());
                sq8.m48645d(uri2, "Uri.parse(this)");
                TrustedBiddingData trustedBiddingDataBuild = builderM33841a.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(bh3.m18963e("")).build();
                sq8.m48648g(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                ohc.m42245a();
                CustomAudience.Builder buyer = khc.m35718a().setName(strM57836g).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb3 = new StringBuilder();
                String str5 = f55541g;
                if (str5 == null) {
                    sq8.m48667z("baseUri");
                    str5 = null;
                }
                sb3.append(str5);
                sb3.append("?daily&app_id=");
                sb3.append(str);
                Uri uri3 = Uri.parse(sb3.toString());
                sq8.m48645d(uri3, "Uri.parse(this)");
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb4 = new StringBuilder();
                String str6 = f55541g;
                if (str6 == null) {
                    sq8.m48667z("baseUri");
                    str6 = null;
                }
                sb4.append(str6);
                sb4.append("?bidding");
                Uri uri4 = Uri.parse(sb4.toString());
                sq8.m48645d(uri4, "Uri.parse(this)");
                CustomAudience.Builder trustedBiddingData = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild);
                AdSelectionSignals.fromString("{}");
                CustomAudience customAudienceBuild = trustedBiddingData.getClass().setAds(bh3.m18963e(adDataBuild)).build();
                sq8.m48648g(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                phc.m43696a();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = lhc.m37221a().setCustomAudience(customAudienceBuild).build();
                sq8.m48648g(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager = f55539e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiverM38667a);
                }
            } catch (Error e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Failed to join Custom Audience: ");
                sb5.append(e);
                ju7 ju7Var2 = f55540f;
                if (ju7Var2 == null) {
                    sq8.m48667z("gpsDebugLogger");
                } else {
                    ju7Var = ju7Var2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e.toString());
                y3i y3iVar = y3i.f54824a;
                ju7Var.m34515b("gps_pa_failed", bundle);
            } catch (Exception e2) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to join Custom Audience: ");
                sb6.append(e2);
                ju7 ju7Var3 = f55540f;
                if (ju7Var3 == null) {
                    sq8.m48667z("gpsDebugLogger");
                } else {
                    ju7Var = ju7Var3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e2.toString());
                y3i y3iVar2 = y3i.f54824a;
                ju7Var.m34515b("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final String m57836g(String str, String str2) {
        if (!a94.m16694d(this) && str != null && str2 != null) {
            try {
                if (!sq8.m48644c(str2, "_removed_") && !f9g.m26306P(str2, "gps", false, 2, null)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / 1000) + "@1";
                }
                return null;
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
        return null;
    }
}
