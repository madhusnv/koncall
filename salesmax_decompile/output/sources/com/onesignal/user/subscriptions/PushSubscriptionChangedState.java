package com.onesignal.user.subscriptions;

import org.json.JSONException;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PushSubscriptionChangedState {
    private final PushSubscriptionState current;
    private final PushSubscriptionState previous;

    public PushSubscriptionChangedState(PushSubscriptionState pushSubscriptionState, PushSubscriptionState pushSubscriptionState2) {
        sq8.m48649h(pushSubscriptionState, "previous");
        sq8.m48649h(pushSubscriptionState2, "current");
        this.previous = pushSubscriptionState;
        this.current = pushSubscriptionState2;
    }

    public final PushSubscriptionState getCurrent() {
        return this.current;
    }

    public final PushSubscriptionState getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …, current.toJSONObject())");
        return jSONObjectPut;
    }
}
