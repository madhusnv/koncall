package com.onesignal.user.state;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class UserState {
    private final String externalId;
    private final String onesignalId;

    public UserState(String str, String str2) {
        sq8.m48649h(str, "onesignalId");
        sq8.m48649h(str2, "externalId");
        this.onesignalId = str;
        this.externalId = str2;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …\"externalId\", externalId)");
        return jSONObjectPut;
    }
}
