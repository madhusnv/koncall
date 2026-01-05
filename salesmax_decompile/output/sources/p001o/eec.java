package p001o;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class eec {

    /* renamed from: b */
    public static final C13167a f21491b = new C13167a(null);

    /* renamed from: c */
    public static final Set f21492c;

    /* renamed from: d */
    public static final Set f21493d;

    /* renamed from: e */
    public static final Map f21494e;

    /* renamed from: a */
    public final Map f21495a = new LinkedHashMap();

    /* renamed from: o.eec$a */
    public static final class C13167a {

        /* renamed from: o.eec$a$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f21496a;

            static {
                int[] iArr = new int[owc.values().length];
                try {
                    iArr[owc.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[owc.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[owc.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f21496a = iArr;
            }
        }

        public C13167a() {
        }

        public /* synthetic */ C13167a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m24865a(fec fecVar, String str, String str2, Bundle bundle, eec eecVar) {
            sq8.m48649h(fecVar, "typeOfParameter");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            sq8.m48649h(bundle, "customEventsParams");
            sq8.m48649h(eecVar, "operationalData");
            int i = a.f21496a[m24868d(fecVar, str).ordinal()];
            if (i == 1) {
                bundle.putCharSequence(str, str2);
                return;
            }
            if (i == 2) {
                eecVar.m24861b(fecVar, str, str2);
            } else {
                if (i != 3) {
                    return;
                }
                eecVar.m24861b(fecVar, str, str2);
                bundle.putCharSequence(str, str2);
            }
        }

        /* renamed from: b */
        public final hwc m24866b(fec fecVar, String str, String str2, Bundle bundle, eec eecVar) {
            sq8.m48649h(fecVar, "typeOfParameter");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(str2, "value");
            int i = a.f21496a[m24868d(fecVar, str).ordinal()];
            if (i == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(str, str2);
            } else if (i == 2) {
                if (eecVar == null) {
                    eecVar = new eec();
                }
                eecVar.m24861b(fecVar, str, str2);
            } else if (i == 3) {
                if (eecVar == null) {
                    eecVar = new eec();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                eecVar.m24861b(fecVar, str, str2);
                bundle.putCharSequence(str, str2);
            }
            return new hwc(bundle, eecVar);
        }

        /* renamed from: c */
        public final Object m24867c(fec fecVar, String str, Bundle bundle, eec eecVar) {
            sq8.m48649h(fecVar, "typeOfParameter");
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            Object objM24863d = eecVar != null ? eecVar.m24863d(fecVar, str) : null;
            return objM24863d == null ? bundle != null ? bundle.getCharSequence(str) : null : objM24863d;
        }

        /* renamed from: d */
        public final owc m24868d(fec fecVar, String str) {
            sq8.m48649h(fecVar, "typeOfParameter");
            sq8.m48649h(str, "parameter");
            hwc hwcVar = (hwc) eec.f21494e.get(fecVar);
            Set set = hwcVar != null ? (Set) hwcVar.m31229c() : null;
            hwc hwcVar2 = (hwc) eec.f21494e.get(fecVar);
            Set set2 = hwcVar2 != null ? (Set) hwcVar2.m31230d() : null;
            return (set == null || !set.contains(str)) ? (set2 == null || !set2.contains(str)) ? owc.CustomData : owc.CustomAndOperationalData : owc.OperationalData;
        }
    }

    static {
        Set setM40668i = nif.m40668i("fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used");
        f21492c = setM40668i;
        Set setM40668i2 = nif.m40668i("fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time");
        f21493d = setM40668i2;
        f21494e = hsa.m31056f(vyh.m53620a(fec.IAPParameters, new hwc(setM40668i, setM40668i2)));
    }

    /* renamed from: b */
    public final void m24861b(fec fecVar, String str, Object obj) {
        sq8.m48649h(fecVar, "type");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        try {
            tk0.f47320f.m50099a(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                h8g h8gVar = h8g.f26398a;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                sq8.m48648g(str2, "format(format, *args)");
                throw new ur6(str2);
            }
            if (!this.f21495a.containsKey(fecVar)) {
                this.f21495a.put(fecVar, new LinkedHashMap());
            }
            Map map = (Map) this.f21495a.get(fecVar);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final eec m24862c() {
        eec eecVar = new eec();
        for (fec fecVar : this.f21495a.keySet()) {
            Map map = (Map) this.f21495a.get(fecVar);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        eecVar.m24861b(fecVar, str, obj);
                    }
                }
            }
        }
        return eecVar;
    }

    /* renamed from: d */
    public final Object m24863d(fec fecVar, String str) {
        Map map;
        sq8.m48649h(fecVar, "type");
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        if (this.f21495a.containsKey(fecVar) && (map = (Map) this.f21495a.get(fecVar)) != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: e */
    public final JSONObject m24864e() {
        JSONObject jSONObject;
        try {
            Map map = this.f21495a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((fec) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(isa.m32693t(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
