package com.amplifyframework.predictions.aws.configuration;

import com.amplifyframework.predictions.aws.NetworkPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class SpeechGeneratorConfiguration {
    private static final String CONFIG_NAME = "speechGenerator";
    private final String language;
    private final NetworkPolicy networkPolicy;
    private final String voice;

    private SpeechGeneratorConfiguration(String str, String str2, NetworkPolicy networkPolicy) {
        this.voice = str;
        this.language = str2;
        this.networkPolicy = networkPolicy;
    }

    public static SpeechGeneratorConfiguration fromJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new SpeechGeneratorConfiguration(jSONObject2.getString("voice"), jSONObject2.getString("language"), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }

    public String getLanguage() {
        return this.language;
    }

    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    public String getVoice() {
        return this.voice;
    }
}
