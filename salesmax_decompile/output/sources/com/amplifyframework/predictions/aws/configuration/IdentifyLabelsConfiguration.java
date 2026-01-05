package com.amplifyframework.predictions.aws.configuration;

import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.LabelType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class IdentifyLabelsConfiguration {
    private static final String CONFIG_NAME = "identifyLabels";
    private final NetworkPolicy networkPolicy;

    /* renamed from: type, reason: collision with root package name */
    private final LabelType f58114type;

    private IdentifyLabelsConfiguration(LabelType labelType, NetworkPolicy networkPolicy) {
        this.f58114type = labelType;
        this.networkPolicy = networkPolicy;
    }

    public static IdentifyLabelsConfiguration fromJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new IdentifyLabelsConfiguration(LabelType.valueOf(jSONObject2.getString("type")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }

    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    public LabelType getType() {
        return this.f58114type;
    }
}
