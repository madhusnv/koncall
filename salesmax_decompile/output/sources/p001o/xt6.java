package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.tt6;
import p001o.xr6;

/* loaded from: classes5.dex */
public final class xt6 {

    /* renamed from: a */
    public static final xt6 f54250a = new xt6();

    /* renamed from: b */
    public static final String f54251b = xt6.class.getSimpleName();

    /* renamed from: c */
    public static final List f54252c = ch3.m21249n("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')');

    /* renamed from: d */
    public static final Map f54253d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final AtomicReference f54254e = new AtomicReference(EnumC18243a.NOT_LOADED);

    /* renamed from: f */
    public static final ConcurrentLinkedQueue f54255f = new ConcurrentLinkedQueue();

    /* renamed from: g */
    public static boolean f54256g;

    /* renamed from: h */
    public static JSONArray f54257h;

    /* renamed from: o.xt6$a */
    public enum EnumC18243a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* renamed from: o.xt6$b */
    public interface InterfaceC18244b {
        /* renamed from: a */
        void mo32305a();

        /* renamed from: b */
        void mo32306b(tt6 tt6Var);
    }

    /* renamed from: d */
    public static final void m56795d(InterfaceC18244b interfaceC18244b) {
        sq8.m48649h(interfaceC18244b, "callback");
        f54255f.add(interfaceC18244b);
        m56798h();
    }

    /* renamed from: f */
    public static final tt6 m56796f(String str) {
        if (str != null) {
            return (tt6) f54253d.get(str);
        }
        return null;
    }

    /* renamed from: g */
    public static final Map m56797g() {
        JSONObject jSONObject;
        Context contextM13019l = C10773c.m13019l();
        String strM13020m = C10773c.m13020m();
        h8g h8gVar = h8g.f26398a;
        String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM13020m}, 1));
        sq8.m48648g(str, "format(format, *args)");
        String string = contextM13019l.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(str, null);
        if (!cri.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                cri.j0("FacebookSDK", e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f54250a.m56810p(jSONObject);
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final void m56798h() {
        final Context contextM13019l = C10773c.m13019l();
        final String strM13020m = C10773c.m13020m();
        if (cri.d0(strM13020m)) {
            f54254e.set(EnumC18243a.ERROR);
            f54250a.m56812r();
            return;
        }
        if (f54253d.containsKey(strM13020m)) {
            f54254e.set(EnumC18243a.SUCCESS);
            f54250a.m56812r();
            return;
        }
        AtomicReference atomicReference = f54254e;
        EnumC18243a enumC18243a = EnumC18243a.NOT_LOADED;
        EnumC18243a enumC18243a2 = EnumC18243a.LOADING;
        if (!(ec3.m24748a(atomicReference, enumC18243a, enumC18243a2) || ec3.m24748a(atomicReference, EnumC18243a.ERROR, enumC18243a2))) {
            f54250a.m56812r();
            return;
        }
        h8g h8gVar = h8g.f26398a;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM13020m}, 1));
        sq8.m48648g(str, "format(format, *args)");
        C10773c.m13028u().execute(new Runnable() { // from class: o.ut6
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                xt6.m56799i(contextM13019l, str, strM13020m);
            }
        });
    }

    /* renamed from: i */
    public static final void m56799i(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        JSONObject jSONObject;
        sq8.m48649h(context, "$context");
        sq8.m48649h(str, "$settingsKey");
        sq8.m48649h(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        tt6 tt6VarM56805j = null;
        String string = sharedPreferences.getString(str, null);
        if (!cri.d0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                cri.j0("FacebookSDK", e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                tt6VarM56805j = f54250a.m56805j(str2, jSONObject);
            }
        }
        xt6 xt6Var = f54250a;
        JSONObject jSONObjectM56804e = xt6Var.m56804e(str2);
        if (jSONObjectM56804e != null) {
            xt6Var.m56805j(str2, jSONObjectM56804e);
            sharedPreferences.edit().putString(str, jSONObjectM56804e.toString()).apply();
        }
        if (tt6VarM56805j != null) {
            String strM50553t = tt6VarM56805j.m50553t();
            if (!f54256g && strM50553t != null && strM50553t.length() > 0) {
                f54256g = true;
            }
        }
        st6.m48902m(str2, true);
        u61.m50978h();
        f54254e.set(f54253d.containsKey(str2) ? EnumC18243a.SUCCESS : EnumC18243a.ERROR);
        xt6Var.m56812r();
    }

    /* renamed from: m */
    public static /* synthetic */ ArrayList m56800m(xt6 xt6Var, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return xt6Var.m56807l(jSONObject, z);
    }

    /* renamed from: s */
    public static final void m56801s(InterfaceC18244b interfaceC18244b) {
        interfaceC18244b.mo32305a();
    }

    /* renamed from: t */
    public static final void m56802t(InterfaceC18244b interfaceC18244b, tt6 tt6Var) {
        interfaceC18244b.mo32306b(tt6Var);
    }

    /* renamed from: u */
    public static final tt6 m56803u(String str, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "applicationId");
        if (!z) {
            Map map = f54253d;
            if (map.containsKey(str)) {
                return (tt6) map.get(str);
            }
        }
        xt6 xt6Var = f54250a;
        tt6 tt6VarM56805j = xt6Var.m56805j(str, xt6Var.m56804e(str));
        if (sq8.m48644c(str, C10773c.m13020m())) {
            f54254e.set(EnumC18243a.SUCCESS);
            xt6Var.m56812r();
        }
        return tt6VarM56805j;
    }

    /* renamed from: e */
    public final JSONObject m56804e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f54252c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(null, "app", null);
        graphRequestM12913x.m12843D(true);
        graphRequestM12913x.m12846G(bundle);
        JSONObject jSONObjectM13066d = graphRequestM12913x.m12851k().m13066d();
        return jSONObjectM13066d == null ? new JSONObject() : jSONObjectM13066d;
    }

    /* renamed from: j */
    public final tt6 m56805j(String str, JSONObject jSONObject) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(str, "applicationId");
        sq8.m48649h(jSONObject, "settingsJSON");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        xr6.C18228a c18228a = xr6.f54160g;
        xr6 xr6VarM56689a = c18228a.m56689a(jSONArrayOptJSONArray);
        if (xr6VarM56689a == null) {
            xr6VarM56689a = c18228a.m56690b();
        }
        xr6 xr6Var = xr6VarM56689a;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & Opcodes.ACC_ENUM) != 0;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        f54257h = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && lq8.m37758b()) {
            g4i.m28044c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("app_events_config");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = jSONObject.optString("gdpv4_nux_content", "");
        sq8.m48648g(strOptString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", rt3.m47141a());
        EnumSet enumSetM39740a = mwf.Companion.m39740a(jSONObject.optLong("seamless_login"));
        Map mapM56809o = m56809o(jSONObject.optJSONObject("android_dialog_configs"));
        String strOptString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        sq8.m48648g(strOptString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString3 = jSONObject.optString("smart_login_menu_icon_url");
        sq8.m48648g(strOptString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString4 = jSONObject.optString("sdk_update_message");
        sq8.m48648g(strOptString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        tt6 tt6Var = new tt6(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetM39740a, mapM56809o, z, xr6Var, strOptString2, strOptString3, z2, z3, jSONArrayOptJSONArray2, strOptString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "standard_params"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "maca_rules"), m56810p(jSONObject), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "blocklist_events"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "redacted_events"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "sensitive_params"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "standard_params_schema"), m56811q(jSONObject.optJSONObject("protected_mode_rules"), "standard_params_blocked"), m56806k(jSONObjectOptJSONObject, "fb_currency"), m56806k(jSONObjectOptJSONObject, "_valueToSum"), m56800m(this, jSONObjectOptJSONObject, false, 2, null), m56807l(jSONObjectOptJSONObject, true), m56808n(jSONObject.optJSONObject("app_events_config")));
        f54253d.put(str, tt6Var);
        return tt6Var;
    }

    /* renamed from: k */
    public final List m56806k(JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (sq8.m48644c(jSONObject2.getString(TransferTable.COLUMN_KEY), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    if (sq8.m48644c(jSONObject3.getString(TransferTable.COLUMN_KEY), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public final ArrayList m56807l(JSONObject jSONObject, boolean z) throws JSONException {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return null;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString(TransferTable.COLUMN_KEY);
            if ((!sq8.m48644c(string, "prod_keys") || !z) && (!sq8.m48644c(string, "test_keys") || z)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject3.getString(TransferTable.COLUMN_KEY);
                    if (!sq8.m48644c(string2, "_valueToSum") && !sq8.m48644c(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            arrayList2.add(jSONArray3.getJSONObject(i3).getString("value"));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new hwc(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public final Long m56808n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.optLong("iap_manual_and_auto_log_dedup_window_millis"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    public final Map m56809o(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                tt6.C17204b.a aVar = tt6.C17204b.f47757e;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                sq8.m48648g(jSONObjectOptJSONObject, "dialogConfigData.optJSONObject(i)");
                tt6.C17204b c17204bM50562a = aVar.m50562a(jSONObjectOptJSONObject);
                if (c17204bM50562a != null) {
                    String strM50560a = c17204bM50562a.m50560a();
                    Map map2 = (Map) map.get(strM50560a);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strM50560a, map2);
                    }
                    map2.put(c17204bM50562a.m50561b(), c17204bM50562a);
                }
            }
        }
        return map;
    }

    /* renamed from: p */
    public final Map m56810p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e) {
                cri.j0("FacebookSDK", e);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e2) {
                cri.j0("FacebookSDK", e2);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* renamed from: q */
    public final JSONArray m56811q(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    /* renamed from: r */
    public final synchronized void m56812r() {
        EnumC18243a enumC18243a = (EnumC18243a) f54254e.get();
        if (EnumC18243a.NOT_LOADED != enumC18243a && EnumC18243a.LOADING != enumC18243a) {
            final tt6 tt6Var = (tt6) f54253d.get(C10773c.m13020m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (EnumC18243a.ERROR == enumC18243a) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f54255f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final InterfaceC18244b interfaceC18244b = (InterfaceC18244b) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: o.vt6
                        @Override // java.lang.Runnable
                        public final void run() {
                            xt6.m56801s(interfaceC18244b);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f54255f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final InterfaceC18244b interfaceC18244b2 = (InterfaceC18244b) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: o.wt6
                        @Override // java.lang.Runnable
                        public final void run() {
                            xt6.m56802t(interfaceC18244b2, tt6Var);
                        }
                    });
                }
            }
        }
    }
}
