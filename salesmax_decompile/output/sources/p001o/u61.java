package p001o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C10773c;
import com.google.android.gms.cast.MediaTrack;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.eec;
import p001o.kh8;
import p001o.mt6;

/* loaded from: classes5.dex */
public final class u61 {

    /* renamed from: a */
    public static final u61 f48378a = new u61();

    /* renamed from: b */
    public static final String f48379b = u61.class.getCanonicalName();

    /* renamed from: c */
    public static final ao8 f48380c = new ao8(C10773c.m13019l());

    /* renamed from: o.u61$a */
    public static final class C17302a {

        /* renamed from: a */
        public BigDecimal f48381a;

        /* renamed from: b */
        public Currency f48382b;

        /* renamed from: c */
        public Bundle f48383c;

        /* renamed from: d */
        public eec f48384d;

        public C17302a(BigDecimal bigDecimal, Currency currency, Bundle bundle, eec eecVar) {
            sq8.m48649h(bigDecimal, "purchaseAmount");
            sq8.m48649h(currency, FirebaseAnalytics.Param.CURRENCY);
            sq8.m48649h(bundle, "param");
            sq8.m48649h(eecVar, "operationalData");
            this.f48381a = bigDecimal;
            this.f48382b = currency;
            this.f48383c = bundle;
            this.f48384d = eecVar;
        }

        /* renamed from: a */
        public final Currency m50986a() {
            return this.f48382b;
        }

        /* renamed from: b */
        public final eec m50987b() {
            return this.f48384d;
        }

        /* renamed from: c */
        public final Bundle m50988c() {
            return this.f48383c;
        }

        /* renamed from: d */
        public final BigDecimal m50989d() {
            return this.f48381a;
        }
    }

    /* renamed from: a */
    public static final synchronized Bundle m50975a(List list) {
        C17302a c17302a;
        sq8.m48649h(list, "purchaseLoggingParametersList");
        c17302a = (C17302a) list.get(0);
        return ih8.m32135f(bh3.m18963e(new qg8("fb_mobile_purchase", c17302a.m50989d().doubleValue(), c17302a.m50986a())), System.currentTimeMillis(), true, bh3.m18963e(new hwc(c17302a.m50988c(), c17302a.m50987b())));
    }

    /* renamed from: f */
    public static final synchronized Bundle m50976f(List list, String str) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        sq8.m48649h(list, "purchaseLoggingParametersList");
        sq8.m48649h(str, "eventName");
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17302a c17302a = (C17302a) it.next();
            arrayList.add(new qg8(str, c17302a.m50989d().doubleValue(), c17302a.m50986a()));
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        arrayList2 = new ArrayList(dh3.m23088v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C17302a c17302a2 = (C17302a) it2.next();
            arrayList2.add(new hwc(c17302a2.m50988c(), c17302a2.m50987b()));
        }
        return ih8.m32135f(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    /* renamed from: g */
    public static final boolean m50977g() {
        tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
        return tt6VarM56796f != null && C10773c.m13023p() && tt6VarM56796f.m50542i();
    }

    /* renamed from: h */
    public static final void m50978h() {
        Context contextM13019l = C10773c.m13019l();
        String strM13020m = C10773c.m13020m();
        if (C10773c.m13023p() && (contextM13019l instanceof Application)) {
            nl0.f36985b.m40734a((Application) contextM13019l, strM13020m);
        }
    }

    /* renamed from: i */
    public static final void m50979i(String str, long j) {
        Context contextM13019l = C10773c.m13019l();
        tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
        if (tt6VarM56803u == null || !tt6VarM56803u.m50534a() || j <= 0) {
            return;
        }
        ao8 ao8Var = new ao8(contextM13019l);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        ao8Var.m17560c("fb_aa_time_spent_on_view", j, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m50980j(String str, String str2, boolean z, kh8.EnumC14835a enumC14835a, boolean z2) {
        List listM50983c;
        String str3;
        String str4;
        sq8.m48649h(str, FirebaseAnalytics.Event.PURCHASE);
        sq8.m48649h(str2, "skuDetails");
        if (!m50977g() || (listM50983c = f48378a.m50983c(str, str2, enumC14835a)) == null || listM50983c.isEmpty()) {
            return;
        }
        if (z && st6.m48897d("app_events_if_auto_log_subs", C10773c.m13020m(), false)) {
            str4 = z2 ? "SubscriptionRestore" : gh8.f25160a.m28670m(str2) ? "StartTrial" : "Subscribe";
        } else {
            if (!z2) {
                str3 = "fb_mobile_purchase";
                fh8.f23324a.m26687a((z || !mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitSubsDedupe)) ? (z && mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitPurchaseDedupe)) ? m50975a(listM50983c) : null : m50976f(listM50983c, str3), ((C17302a) listM50983c.get(0)).m50988c(), ((C17302a) listM50983c.get(0)).m50987b());
                if (sq8.m48644c(str3, "fb_mobile_purchase")) {
                    f48380c.m17566i(str3, ((C17302a) listM50983c.get(0)).m50989d(), ((C17302a) listM50983c.get(0)).m50986a(), ((C17302a) listM50983c.get(0)).m50988c(), ((C17302a) listM50983c.get(0)).m50987b());
                    return;
                } else {
                    f48380c.m17567j(((C17302a) listM50983c.get(0)).m50989d(), ((C17302a) listM50983c.get(0)).m50986a(), ((C17302a) listM50983c.get(0)).m50988c(), ((C17302a) listM50983c.get(0)).m50987b());
                    return;
                }
            }
            str4 = "fb_mobile_purchase_restored";
        }
        str3 = str4;
        fh8.f23324a.m26687a((z || !mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitSubsDedupe)) ? (z && mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitPurchaseDedupe)) ? m50975a(listM50983c) : null : m50976f(listM50983c, str3), ((C17302a) listM50983c.get(0)).m50988c(), ((C17302a) listM50983c.get(0)).m50987b());
        if (sq8.m48644c(str3, "fb_mobile_purchase")) {
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m50981k(String str, String str2, boolean z, kh8.EnumC14835a enumC14835a, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        m50980j(str, str2, z, enumC14835a, z2);
    }

    /* renamed from: b */
    public final List m50982b(String str, String str2, Map map, kh8.EnumC14835a enumC14835a) throws JSONException {
        List listM21252q = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            eec eecVar = new eec();
            if (enumC14835a != null) {
                eec.f21491b.m24865a(fec.IAPParameters, "fb_iap_sdk_supported_library_versions", enumC14835a.getType(), bundle, eecVar);
            }
            eec.C13167a c13167a = eec.f21491b;
            fec fecVar = fec.IAPParameters;
            String string = jSONObject.getString("productId");
            sq8.m48648g(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            c13167a.m24865a(fecVar, "fb_iap_product_id", string, bundle, eecVar);
            String string2 = jSONObject.getString("productId");
            sq8.m48648g(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            c13167a.m24865a(fecVar, "fb_content_id", string2, bundle, eecVar);
            c13167a.m24865a(fecVar, "android_dynamic_ads_content_id", "client_implicit", bundle, eecVar);
            String string3 = jSONObject.getString("purchaseTime");
            sq8.m48648g(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            c13167a.m24865a(fecVar, "fb_iap_purchase_time", string3, bundle, eecVar);
            String string4 = jSONObject.getString("purchaseToken");
            sq8.m48648g(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            c13167a.m24865a(fecVar, "fb_iap_purchase_token", string4, bundle, eecVar);
            String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            sq8.m48648g(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            c13167a.m24865a(fecVar, "fb_iap_package_name", strOptString, bundle, eecVar);
            String strOptString2 = jSONObject2.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
            sq8.m48648g(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            c13167a.m24865a(fecVar, "fb_iap_product_title", strOptString2, bundle, eecVar);
            String strOptString3 = jSONObject2.optString(MediaTrack.ROLE_DESCRIPTION);
            sq8.m48648g(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            c13167a.m24865a(fecVar, "fb_iap_product_description", strOptString3, bundle, eecVar);
            String strOptString4 = jSONObject2.optString("type");
            sq8.m48648g(strOptString4, "type");
            c13167a.m24865a(fecVar, "fb_iap_product_type", strOptString4, bundle, eecVar);
            String strM32134e = ih8.m32134e();
            if (strM32134e != null) {
                c13167a.m24865a(fecVar, "fb_iap_client_library_version", strM32134e, bundle, eecVar);
            }
            for (Map.Entry entry : map.entrySet()) {
                eec.f21491b.m24865a(fec.IAPParameters, (String) entry.getKey(), (String) entry.getValue(), bundle, eecVar);
            }
            if (jSONObject2.has("price_amount_micros")) {
                listM21252q = ch3.m21252q(m50984d(strOptString4, bundle, eecVar, jSONObject, jSONObject2));
            } else if (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) {
                try {
                    return m50985e(strOptString4, bundle, eecVar, jSONObject2);
                } catch (JSONException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            }
            return listM21252q;
        } catch (JSONException unused3) {
        } catch (Exception unused4) {
        }
    }

    /* renamed from: c */
    public final List m50983c(String str, String str2, kh8.EnumC14835a enumC14835a) {
        return m50982b(str, str2, new HashMap(), enumC14835a);
    }

    /* renamed from: d */
    public final C17302a m50984d(String str, Bundle bundle, eec eecVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (sq8.m48644c(str, kh8.EnumC14836b.SUBS.getType())) {
            eec.C13167a c13167a = eec.f21491b;
            fec fecVar = fec.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            sq8.m48648g(string, "toString(\n              …      )\n                )");
            c13167a.m24865a(fecVar, "fb_iap_subs_auto_renewing", string, bundle, eecVar);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            sq8.m48648g(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            c13167a.m24865a(fecVar, "fb_iap_subs_period", strOptString, bundle, eecVar);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            sq8.m48648g(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            c13167a.m24865a(fecVar, "fb_free_trial_period", strOptString2, bundle, eecVar);
            String strOptString3 = jSONObject2.optString("introductoryPriceCycles");
            sq8.m48648g(strOptString3, "introductoryPriceCycles");
            if (strOptString3.length() > 0) {
                c13167a.m24865a(fecVar, "fb_intro_price_cycles", strOptString3, bundle, eecVar);
            }
            String strOptString4 = jSONObject2.optString("introductoryPricePeriod");
            sq8.m48648g(strOptString4, "introductoryPricePeriod");
            if (strOptString4.length() > 0) {
                c13167a.m24865a(fecVar, "fb_intro_period", strOptString4, bundle, eecVar);
            }
            String strOptString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            sq8.m48648g(strOptString5, "introductoryPriceAmountMicros");
            if (strOptString5.length() > 0) {
                c13167a.m24865a(fecVar, "fb_intro_price_amount_micros", strOptString5, bundle, eecVar);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        sq8.m48648g(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new C17302a(bigDecimal, currency, bundle, eecVar);
    }

    /* renamed from: e */
    public final List m50985e(String str, Bundle bundle, eec eecVar, JSONObject jSONObject) throws JSONException {
        if (!sq8.m48644c(str, kh8.EnumC14836b.SUBS.getType())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            sq8.m48648g(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return ch3.m21252q(new C17302a(bigDecimal, currency, bundle, eecVar));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray("subscriptionOfferDetails").getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            eec eecVarM24862c = eecVar.m24862c();
            String string = jSONObject3.getString("basePlanId");
            eec.C13167a c13167a = eec.f21491b;
            fec fecVar = fec.IAPParameters;
            sq8.m48648g(string, "basePlanId");
            c13167a.m24865a(fecVar, "fb_iap_base_plan", string, bundle2, eecVarM24862c);
            JSONObject jSONObject4 = jSONObject3.getJSONArray("pricingPhases").getJSONObject(r11.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            sq8.m48648g(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            c13167a.m24865a(fecVar, "fb_iap_subs_period", strOptString, bundle2, eecVarM24862c);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                c13167a.m24865a(fecVar, "fb_iap_subs_auto_renewing", "false", bundle2, eecVarM24862c);
            } else {
                c13167a.m24865a(fecVar, "fb_iap_subs_auto_renewing", "true", bundle2, eecVarM24862c);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            sq8.m48648g(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new C17302a(bigDecimal2, currency2, bundle2, eecVarM24862c));
        }
        return arrayList;
    }
}
