package com.onesignal.user.state;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class UserChangedState {
    private final UserState current;

    public UserChangedState(UserState userState) {
        sq8.m48649h(userState, "current");
        this.current = userState;
    }

    public final UserState getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("current", this.current.toJSONObject());
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …, current.toJSONObject())");
        return jSONObjectPut;
    }
}
