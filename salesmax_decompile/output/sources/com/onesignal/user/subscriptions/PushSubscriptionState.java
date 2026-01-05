package com.onesignal.user.subscriptions;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PushSubscriptionState {
    private final String id;
    private final boolean optedIn;
    private final String token;

    public PushSubscriptionState(String str, String str2, boolean z) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(str2, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        this.id = str;
        this.token = str2;
        this.optedIn = z;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(OutcomeConstants.OUTCOME_ID, this.id).put(AWSCognitoLegacyCredentialStore.TOKEN_KEY, this.token).put("optedIn", this.optedIn);
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           … .put(\"optedIn\", optedIn)");
        return jSONObjectPut;
    }
}
