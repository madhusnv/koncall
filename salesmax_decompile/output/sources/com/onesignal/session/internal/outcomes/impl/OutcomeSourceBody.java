package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OutcomeSourceBody {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    /* JADX WARN: Multi-variable type inference failed */
    public OutcomeSourceBody() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_ids", this.notificationIds).put(OutcomeConstants.IAM_IDS, this.inAppMessagesIds);
        sq8.m48648g(jSONObjectPut, "JSONObject()\n           …AM_IDS, inAppMessagesIds)");
        return jSONObjectPut;
    }

    public String toString() {
        return "OutcomeSourceBody{notificationIds=" + this.notificationIds + ", inAppMessagesIds=" + this.inAppMessagesIds + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OutcomeSourceBody(JSONArray jSONArray) {
        this(jSONArray, null, 2, 0 == true ? 1 : 0);
    }

    public OutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    public /* synthetic */ OutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2, int i, id5 id5Var) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray, (i & 2) != 0 ? new JSONArray() : jSONArray2);
    }
}
