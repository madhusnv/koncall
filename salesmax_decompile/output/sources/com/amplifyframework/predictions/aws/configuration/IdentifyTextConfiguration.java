package com.amplifyframework.predictions.aws.configuration;

import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.TextFormatType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class IdentifyTextConfiguration {
    private static final String CONFIG_NAME = "identifyText";
    private final TextFormatType format;
    private final NetworkPolicy networkPolicy;

    private IdentifyTextConfiguration(TextFormatType textFormatType, NetworkPolicy networkPolicy) {
        this.format = textFormatType;
        this.networkPolicy = networkPolicy;
    }

    public static IdentifyTextConfiguration fromJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new IdentifyTextConfiguration(TextFormatType.valueOf(jSONObject2.getString("format")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }

    public TextFormatType getFormat() {
        return this.format;
    }

    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }
}
