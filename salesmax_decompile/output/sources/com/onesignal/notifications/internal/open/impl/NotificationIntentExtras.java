package com.onesignal.notifications.internal.open.impl;

import org.json.JSONArray;
import org.json.JSONObject;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NotificationIntentExtras {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public NotificationIntentExtras(JSONArray jSONArray, JSONObject jSONObject) {
        sq8.m48649h(jSONArray, "dataArray");
        sq8.m48649h(jSONObject, "jsonData");
        this.dataArray = jSONArray;
        this.jsonData = jSONObject;
    }

    public static /* synthetic */ NotificationIntentExtras copy$default(NotificationIntentExtras notificationIntentExtras, JSONArray jSONArray, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONArray = notificationIntentExtras.dataArray;
        }
        if ((i & 2) != 0) {
            jSONObject = notificationIntentExtras.jsonData;
        }
        return notificationIntentExtras.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final NotificationIntentExtras copy(JSONArray jSONArray, JSONObject jSONObject) {
        sq8.m48649h(jSONArray, "dataArray");
        sq8.m48649h(jSONObject, "jsonData");
        return new NotificationIntentExtras(jSONArray, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationIntentExtras)) {
            return false;
        }
        NotificationIntentExtras notificationIntentExtras = (NotificationIntentExtras) obj;
        return sq8.m48644c(this.dataArray, notificationIntentExtras.dataArray) && sq8.m48644c(this.jsonData, notificationIntentExtras.jsonData);
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        return (this.dataArray.hashCode() * 31) + this.jsonData.hashCode();
    }

    public final void setDataArray(JSONArray jSONArray) {
        sq8.m48649h(jSONArray, "<set-?>");
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "<set-?>");
        this.jsonData = jSONObject;
    }

    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}
