package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.razorpay.AnalyticsProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class O_$v$ {

    /* renamed from: a */
    private JSONObject f13662a;

    public O_$v$(String str) {
        try {
            this.f13662a = new JSONObject(str);
        } catch (JSONException e) {
            AnalyticsUtil.reportError("CheckoutOptions", "S0", e.getMessage());
        }
    }

    /* renamed from: l */
    private JSONObject m15996l() {
        return this.f13662a.optJSONObject("prefill");
    }

    /* renamed from: a */
    public final String m15997a() {
        try {
            return this.f13662a.getString(TransferTable.COLUMN_KEY);
        } catch (JSONException e) {
            d__1_.m16053a("Error reading options!", e);
            AnalyticsUtil.reportError("CheckoutOptions", "S0", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m16001b() {
        try {
            if (this.f13662a.has("send_sms_hash")) {
                return this.f13662a.getBoolean("send_sms_hash");
            }
            return false;
        } catch (JSONException e) {
            d__1_.m16053a("Error reading options!", e);
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
            return true;
        }
    }

    /* renamed from: c */
    public final boolean m16004c() {
        try {
            if (this.f13662a.has("allow_rotation")) {
                return this.f13662a.getBoolean("allow_rotation");
            }
            return false;
        } catch (JSONException e) {
            d__1_.m16053a("Error reading options!", e);
            AnalyticsUtil.reportError(getClass().getName(), "error:exception", e.getMessage());
            return true;
        }
    }

    /* renamed from: d */
    public final JSONObject m16005d() {
        return this.f13662a;
    }

    /* renamed from: e */
    public final String m16006e() {
        return this.f13662a.toString();
    }

    /* renamed from: f */
    public final String m16007f() {
        try {
            if (this.f13662a.has("order_id")) {
                return this.f13662a.getString("order_id");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public final JSONObject m16008g() {
        return this.f13662a.optJSONObject("otpelf_preferences");
    }

    /* renamed from: h */
    public final void m16009h() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(this.f13662a.toString());
            if (jSONObject.has("prefill")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("prefill");
                jSONObject2.remove("card");
                jSONObject2.remove("card[number]");
                jSONObject2.remove("card[expiry]");
                jSONObject2.remove("card[cvv]");
                jSONObject.put("prefill", jSONObject2);
            }
            jSONObject.remove("image");
            AnalyticsUtil.addProperty("merchant options", new AnalyticsProperty(jSONObject, AnalyticsProperty.Scope.ORDER));
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S2", e.getMessage());
        }
    }

    /* renamed from: i */
    public final String m16010i() throws JSONException {
        m15995b("image", null);
        return this.f13662a.toString();
    }

    /* renamed from: j */
    public final String m16011j() {
        if (m15996l() == null) {
            return null;
        }
        return m15996l().optString("contact");
    }

    /* renamed from: k */
    public final String m16012k() {
        if (m15996l() == null) {
            return null;
        }
        return m15996l().optString("contact");
    }

    /* renamed from: a */
    public final void m15998a(Activity activity, int i) throws JSONException {
        Object base64FromResource;
        m15995b("redirect", Boolean.TRUE);
        if (i != 0 && (base64FromResource = BaseUtils.getBase64FromResource(activity.getResources(), i)) != null) {
            m15995b("image", base64FromResource);
        }
        String strM15965a = CheckoutUtils.m15965a((Context) activity);
        if (!TextUtils.isEmpty(strM15965a) && (m15996l() == null || !m15996l().has("email"))) {
            m15999a("email", strM15965a);
        }
        String strM15974b = CheckoutUtils.m15974b(activity);
        if (TextUtils.isEmpty(strM15974b)) {
            return;
        }
        if (m15996l() == null || !m15996l().has("contact")) {
            m15999a("contact", strM15974b);
        }
    }

    /* renamed from: b */
    private void m15995b(String str, Object obj) throws JSONException {
        try {
            this.f13662a.put(str, obj);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
        }
    }

    /* renamed from: c */
    public final <T> T m16003c(String str) {
        Object objOpt = this.f13662a.opt(str);
        if (objOpt == null) {
            return null;
        }
        return (T) objOpt.getClass().cast(objOpt);
    }

    /* renamed from: b */
    public final boolean m16002b(String str) {
        try {
            if (this.f13662a.has("external")) {
                return this.f13662a.getJSONObject("external").getJSONArray("wallets").toString().contains(str);
            }
            return false;
        } catch (Exception e) {
            AnalyticsUtil.reportError(getClass().getName(), "S2", e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public final void m15999a(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (m15996l() != null) {
            jSONObject = m15996l();
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
        }
        try {
            this.f13662a.put("prefill", jSONObject);
        } catch (JSONException e2) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e2.getMessage());
        }
    }

    /* renamed from: a */
    public final boolean m16000a(String str) {
        return this.f13662a.has(str);
    }
}
