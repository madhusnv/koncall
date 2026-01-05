package p001o;

import android.os.Bundle;
import com.facebook.C10773c;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class r1e {

    /* renamed from: b */
    public static boolean f42750b;

    /* renamed from: d */
    public static HashSet f42752d;

    /* renamed from: a */
    public static final r1e f42749a = new r1e();

    /* renamed from: c */
    public static final gi9 f42751c = si9.m48360a(C16507a.f42753a);

    /* renamed from: o.r1e$a */
    public static final class C16507a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C16507a f42753a = new C16507a();

        public C16507a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet invoke() {
            return nif.m40665f("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    /* renamed from: b */
    public static final void m46049b() {
        if (a94.m16694d(r1e.class)) {
            return;
        }
        try {
            f42750b = true;
            f42749a.m46054e();
        } catch (Throwable th) {
            a94.m16692b(th, r1e.class);
        }
    }

    /* renamed from: d */
    public static final boolean m46050d() {
        if (a94.m16694d(r1e.class)) {
            return false;
        }
        try {
            return f42750b;
        } catch (Throwable th) {
            a94.m16692b(th, r1e.class);
            return false;
        }
    }

    /* renamed from: f */
    public static final void m46051f(Bundle bundle) {
        if (a94.m16694d(r1e.class)) {
            return;
        }
        try {
            if (f42750b && bundle != null && !bundle.isEmpty() && f42752d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                sq8.m48648g(setKeySet, "parameters.keySet()");
                for (String str : setKeySet) {
                    HashSet hashSet = f42752d;
                    sq8.m48646e(hashSet);
                    if (!hashSet.contains(str)) {
                        sq8.m48648g(str, "param");
                        arrayList.add(str);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            a94.m16692b(th, r1e.class);
        }
    }

    /* renamed from: a */
    public final HashSet m46052a(JSONArray jSONArray) {
        if (!a94.m16694d(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        sq8.m48648g(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final HashSet m46053c() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return (HashSet) f42751c.getValue();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final void m46054e() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null) {
                return;
            }
            HashSet hashSetM46052a = m46052a(tt6VarM56803u.m50547n());
            if (hashSetM46052a == null) {
                hashSetM46052a = m46053c();
            }
            f42752d = hashSetM46052a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final boolean m46055g(Bundle bundle) {
        if (a94.m16694d(this) || bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey("pm")) {
                return sq8.m48644c(bundle.get("pm"), "1");
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }
}
