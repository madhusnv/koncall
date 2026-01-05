package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class F_$o_ implements SmsAgentInterface {

    /* renamed from: b */
    C11908m f13611b;

    /* renamed from: e */
    private WebView f13614e;

    /* renamed from: f */
    private String f13615f;

    /* renamed from: h */
    private p$$q_ f13617h;

    /* renamed from: g */
    private boolean f13616g = false;

    /* renamed from: c */
    boolean f13612c = false;

    /* renamed from: d */
    boolean f13613d = false;

    /* renamed from: a */
    Context f13610a = this.f13610a;

    /* renamed from: a */
    Context f13610a = this.f13610a;

    public F_$o_(Activity activity, WebView webView) {
        this.f13614e = webView;
        C11908m c11908mM16085a = C11908m.m16085a();
        this.f13611b = c11908mM16085a;
        c11908mM16085a.m16086a(this);
        final p$$q_ p__q_ = new p$$q_(activity);
        this.f13617h = p__q_;
        M$_3_.m15990a(g$_H$.m16059a().getMagicVersionUrl(), new Callback() { // from class: com.razorpay.S__Z$
            @Override // com.razorpay.Callback
            public final void run(ResponseObject responseObject) {
                if (responseObject.getResponseResult() == null) {
                    return;
                }
                try {
                    String versionFromJsonString = BaseUtils.getVersionFromJsonString(responseObject.getResponseResult(), p$$q_.f13801b);
                    if (BaseUtils.getLocalVersion(p__q_.f13802a, p$$q_.f13801b).equals(versionFromJsonString)) {
                        return;
                    }
                    M$_3_.m15990a(g$_H$.m16059a().getMagicJsUrl(), new Callback() { // from class: com.razorpay.w_$E$
                        @Override // com.razorpay.Callback
                        public final void run(ResponseObject responseObject2) {
                            String strDecryptFile;
                            if (responseObject2.getResponseResult() == null || (strDecryptFile = BaseUtils.decryptFile(responseObject2.getResponseResult())) == null) {
                                return;
                            }
                            if (BaseUtils.storeFileInInternal(this.f13818b.f13802a, BaseUtils.getVersionedAssetName(versionFromJsonString, g$_H$.m16059a().getMagicJsFileName()), responseObject2.getResponseResult())) {
                                this.f13818b.f13803c = strDecryptFile;
                                BaseUtils.updateLocalVersion(this.f13818b.f13802a, p$$q_.f13801b, versionFromJsonString);
                            }
                        }
                    });
                } catch (Exception unused) {
                    AnalyticsUtil.reportError(S__Z$.class.getName(), "S1", "Could not extract version from server json");
                }
            }
        });
    }

    /* renamed from: a */
    public final void m15986a() {
        if (this.f13613d) {
            return;
        }
        try {
            JSONObject magicSettings = g$_H$.m16059a().getMagicSettings();
            magicSettings.put("merchant_key", (Object) null);
            magicSettings.put("otp_permission", this.f13616g);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", g$_H$.f13746a);
            jSONObject.put("version_code", g$_H$.f13748c);
            magicSettings.put("sdk", jSONObject);
            m15985a("window.__rzp_options = " + magicSettings.toString());
        } catch (Exception e) {
            d__1_.m16053a("Unable to load magic settings", e);
        }
        m15985a(this.f13617h.m16101a());
        String str = this.f13615f;
        if (str != null) {
            m15985a(String.format("Magic.elfBridge.setSms(%s)", str));
            this.f13615f = null;
        }
        this.f13613d = true;
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) throws JSONException {
        if (this.f13612c) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sender", str);
                jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, str2);
                this.f13615f = jSONObject.toString();
                m15985a(String.format("Magic.elfBridge.setSms(%s)", jSONObject.toString()));
            } catch (Exception e) {
                d__1_.m16053a("Exception", e);
            }
        }
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        this.f13616g = z;
    }

    /* renamed from: a */
    private void m15985a(String str) {
        this.f13614e.loadUrl(String.format("javascript: %s", str));
    }
}
