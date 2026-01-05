package com.razorpay;

import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
abstract class BaseCheckoutOtpelfActivity extends b__J_ {
    @Override // com.razorpay.b__J_, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException, PackageManager.NameNotFoundException {
        RzpPlugin rzpPlugin;
        RzpPluginCompatibilityResponse rzpPluginCompatibilityResponseIsCompatible;
        HashMap<String, String> allPluginsFromManifest = BaseUtils.getAllPluginsFromManifest(this);
        if (allPluginsFromManifest == null || allPluginsFromManifest.size() == 0) {
            Z$_A_ z$_a_ = new Z$_A_(this, this);
            this.presenter = z$_a_;
            this.checkoutBridgeObject = new CheckoutBridge(z$_a_, 1);
            super.onCreate(bundle);
            return;
        }
        PluginOtpElfCheckoutPresenterImpl pluginOtpElfCheckoutPresenterImpl = new PluginOtpElfCheckoutPresenterImpl(this, this, allPluginsFromManifest);
        this.presenter = pluginOtpElfCheckoutPresenterImpl;
        this.checkoutBridgeObject = new PluginCheckoutBridge(pluginOtpElfCheckoutPresenterImpl, 1);
        super.onCreate(bundle);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isAmazonPluginIntegrated", false);
            jSONObject.put("isGooglePayPluginIntegrated", false);
        } catch (JSONException unused) {
        }
        for (String str : allPluginsFromManifest.values()) {
            try {
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RazorpayAmazon")) {
                    jSONObject.put("isAmazonPluginIntegrated", true);
                }
                if (allPluginsFromManifest.size() > 0 && str.equalsIgnoreCase("com.razorpay.RzpGpayMerged")) {
                    jSONObject.put("isGooglePayPluginIntegrated", true);
                }
                rzpPlugin = (RzpPlugin) RzpPlugin.class.getClassLoader().loadClass(str).newInstance();
                rzpPluginCompatibilityResponseIsCompatible = rzpPlugin.isCompatible(g$_H$.f13746a, g$_H$.f13748c, g$_H$.f13747b);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | JSONException e) {
                e.printStackTrace();
            }
            if (!rzpPluginCompatibilityResponseIsCompatible.isCompatible()) {
                destroy(7, rzpPluginCompatibilityResponseIsCompatible.getErrorMessage());
                return;
            }
            rzpPlugin.isRegistered(this, new RzpPluginRegisterCallback(this) { // from class: com.razorpay.B$$W$
                @Override // com.razorpay.RzpPluginRegisterCallback
                public final void onResponse(boolean z) {
                }
            });
        }
    }
}
