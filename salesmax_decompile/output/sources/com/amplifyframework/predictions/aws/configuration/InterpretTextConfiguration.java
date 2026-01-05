package com.amplifyframework.predictions.aws.configuration;

import com.amplifyframework.predictions.aws.NetworkPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class InterpretTextConfiguration {
    private static final String CONFIG_NAME = "interpretText";
    private final NetworkPolicy networkPolicy;

    /* renamed from: type, reason: collision with root package name */
    private final InterpretType f58115type;

    public enum InterpretType {
        LANGUAGE,
        ENTITIES,
        KEY_PHRASES,
        SENTIMENT,
        SYNTAX,
        ALL
    }

    private InterpretTextConfiguration(InterpretType interpretType, NetworkPolicy networkPolicy) {
        this.f58115type = interpretType;
        this.networkPolicy = networkPolicy;
    }

    public static InterpretTextConfiguration fromJson(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new InterpretTextConfiguration(InterpretType.valueOf(jSONObject2.getString("type")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }

    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    public InterpretType getType() {
        return this.f58115type;
    }
}
