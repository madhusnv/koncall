package com.razorpay;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class g$_H$ extends BaseConfig {

    /* renamed from: a */
    static String f13746a = "standard";

    /* renamed from: b */
    static String f13747b = "1.6.26";

    /* renamed from: c */
    static int f13748c = 56;

    /* renamed from: d */
    static boolean f13749d = true;

    /* renamed from: e */
    private static g$_H$ f13750e = null;

    /* renamed from: f */
    private static String f13751f = "2HujvzmUo2nuRLLqhIHIV4sCEmRw9FIc";

    /* renamed from: g */
    private static String f13752g = "3.0.5";

    /* renamed from: j */
    private boolean f13755j;

    /* renamed from: k */
    private boolean f13756k;

    /* renamed from: l */
    private boolean f13757l;

    /* renamed from: m */
    private String f13758m;

    /* renamed from: n */
    private boolean f13759n;

    /* renamed from: o */
    private Boolean f13760o;

    /* renamed from: p */
    private int f13761p;

    /* renamed from: r */
    private boolean f13763r;

    /* renamed from: s */
    private String f13764s;

    /* renamed from: t */
    private String f13765t;

    /* renamed from: u */
    private String f13766u;

    /* renamed from: h */
    private ArrayList<String> f13753h = new ArrayList<>();

    /* renamed from: i */
    private Map<String, String> f13754i = new HashMap();

    /* renamed from: q */
    private boolean f13762q = false;

    private g$_H$() {
    }

    /* renamed from: a */
    public static g$_H$ m16059a() {
        if (f13750e == null) {
            g$_H$ g__h_ = new g$_H$();
            f13750e = g__h_;
            D$$l_.m15983a(g__h_);
        }
        return f13750e;
    }

    /* renamed from: b */
    public final boolean m16065b() {
        return this.f13757l;
    }

    /* renamed from: c */
    public final String m16066c() {
        return this.f13758m;
    }

    /* renamed from: d */
    public final boolean m16067d() {
        return this.f13759n;
    }

    /* renamed from: e */
    public final boolean m16068e() {
        return this.f13760o.booleanValue();
    }

    /* renamed from: f */
    public final int m16069f() {
        return this.f13761p;
    }

    /* renamed from: g */
    public final Map<String, String> m16070g() {
        return this.f13754i;
    }

    /* renamed from: h */
    public final ArrayList<String> m16071h() {
        return this.f13753h;
    }

    /* renamed from: i */
    public final String m16072i() {
        return this.f13765t;
    }

    /* renamed from: j */
    public final String m16073j() {
        return this.f13766u;
    }

    /* renamed from: k */
    public final boolean m16074k() {
        return this.f13763r;
    }

    /* renamed from: l */
    public final String m16075l() {
        return this.f13764s;
    }

    /* renamed from: m */
    public final boolean m16076m() {
        return this.f13755j;
    }

    /* renamed from: n */
    public final boolean m16077n() {
        return this.f13756k;
    }

    @Override // com.razorpay.BaseConfig
    public final void setConfig(JSONObject jSONObject) {
        try {
            this.f13753h = BaseUtils.jsonStringArrayToArrayList((JSONArray) BaseUtils.getJsonValue("checkout.append_keys", jSONObject, new JSONArray()));
            JSONObject jSONObject2 = (JSONObject) BaseUtils.getJsonValue("checkout.url_config", jSONObject, new JSONObject());
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.f13754i.put(next, jSONObject2.getString(next));
            }
            Boolean bool = Boolean.FALSE;
            this.f13755j = ((Boolean) BaseUtils.getJsonValue("card_saving.broadcast_receiver_flow", jSONObject, bool)).booleanValue();
            this.f13756k = ((Boolean) BaseUtils.getJsonValue("card_saving.shared_preferences_flow", jSONObject, bool)).booleanValue();
            this.f13757l = ((Boolean) BaseUtils.getJsonValue("card_saving.local", jSONObject, bool)).booleanValue();
            this.f13758m = (String) BaseUtils.getJsonValue("native_loader.color", jSONObject, "");
            this.f13759n = ((Boolean) BaseUtils.getJsonValue("native_loader.enable", jSONObject, "")).booleanValue();
            m16061a(jSONObject, false);
            this.f13764s = (String) BaseUtils.getJsonValue("back_button.alert_message", jSONObject, "");
            this.f13763r = ((Boolean) BaseUtils.getJsonValue("back_button.enable", jSONObject, bool)).booleanValue();
            this.f13766u = (String) BaseUtils.getJsonValue("back_button.positive_text", jSONObject, "");
            this.f13765t = (String) BaseUtils.getJsonValue("back_button.negative_text", jSONObject, "");
        } catch (Exception e) {
            AnalyticsUtil.reportError(g$_H$.class.getName(), "S2", e.getMessage());
            new StringBuilder("Error in setting Config, ErrorMessage=").append(e.getMessage());
            e.printStackTrace();
        }
        super.setConfig(jSONObject);
    }

    /* renamed from: b */
    private static String m16062b(Context context) {
        String baseCurrentConfigVersion = BaseConfig.getBaseCurrentConfigVersion(context);
        return baseCurrentConfigVersion == null ? f13752g : baseCurrentConfigVersion;
    }

    /* renamed from: a */
    public final void m16064a(JSONObject jSONObject) {
        try {
            m16061a(jSONObject, true);
        } catch (Exception e) {
            AnalyticsUtil.reportError(g$_H$.class.getName(), "S1", e.getLocalizedMessage());
        }
    }

    /* renamed from: a */
    private void m16061a(JSONObject jSONObject, boolean z) {
        if (!this.f13762q) {
            this.f13760o = Boolean.valueOf(((Boolean) BaseUtils.getJsonValue("retry.enabled", jSONObject, Boolean.TRUE)).booleanValue());
            this.f13761p = ((Integer) BaseUtils.getJsonValue("retry.max_count", jSONObject, (Object) (-1))).intValue();
        }
        this.f13762q = z;
    }

    /* renamed from: a */
    public static void m16060a(Context context, String str) {
        if (m16059a().isConfigEnabled()) {
            HashMap map = new HashMap();
            map.put("AuthKey", f13751f);
            map.put("Content-type", "application/json");
            map.put("CurrentSettingVersion", m16062b(context));
            Uri.Builder builderAppendQueryParameter = Uri.parse(m16059a().getConfigEndpoint()).buildUpon().appendQueryParameter("tenant", "android_" + f13746a).appendQueryParameter("sdk_version", f13747b).appendQueryParameter("sdk_type", f13746a).appendQueryParameter("magic_enabled", String.valueOf(f13749d)).appendQueryParameter("sdk_version_code", String.valueOf(f13748c)).appendQueryParameter("app_version", BuildConfig.VERSION_NAME).appendQueryParameter(ClientCookie.VERSION_ATTR, BaseConfig.getCurrentConfigVersionTag(m16062b(context)));
            BaseConfig.getFetchConfigBuilder(builderAppendQueryParameter, context, str);
            BaseConfig.fetchConfig(builderAppendQueryParameter.build().toString(), map, context);
        }
    }

    /* renamed from: a */
    public final void m16063a(Context context) {
        setConfig(BaseConfig.getConfig(context, C11895R.raw.rzp_config));
    }
}
