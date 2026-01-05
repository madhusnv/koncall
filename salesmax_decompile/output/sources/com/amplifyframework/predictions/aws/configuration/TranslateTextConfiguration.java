package com.amplifyframework.predictions.aws.configuration;

import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.LanguageType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TranslateTextConfiguration {
    private static final String CONFIG_NAME = "translateText";
    private final NetworkPolicy networkPolicy;
    private final LanguageType sourceLanguage;
    private final LanguageType targetLanguage;

    private TranslateTextConfiguration(LanguageType languageType, LanguageType languageType2, NetworkPolicy networkPolicy) {
        this.sourceLanguage = languageType;
        this.targetLanguage = languageType2;
        this.networkPolicy = networkPolicy;
    }

    public static TranslateTextConfiguration fromJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new TranslateTextConfiguration(LanguageType.from(jSONObject2.getString("sourceLang")), LanguageType.from(jSONObject2.getString("targetLang")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }

    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    public LanguageType getSourceLanguage() {
        return this.sourceLanguage;
    }

    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }
}
